#!/bin/bash
# Expected arguments:
# $1 = out_dir
# $2 = dist_dir
# $3 = build_number
# $4 = number of --parallel-thread (optional)

set -e #Exit immediately if a command exits with a non-zero status.

PROG_DIR=$(dirname "$0")
CURRENT_OS=$(uname | tr A-Z a-z)

function die() {
  echo "$*" > /dev/stderr
  echo "Usage: $0 <out_dir> <dest_dir> <build_number> [num_threads=47]" > /dev/stderr
  exit 1
}

while [[ -n "$1" ]]; do
  if [[ -z "$OUT_DIR" ]]; then
    OUT_DIR="$1"
  elif [[ -z "$DIST_DIR" ]]; then
    DIST_DIR="$1"
  elif [[ -z "$BNUM" ]]; then
    BNUM="$1"
  elif [[ -z "$NUM_THREADS" ]]; then
    NUM_THREADS="$1"
  else
    die "[$0] Unknown parameter: $1"
  fi
  shift
done

if [[ -z "$OUT_DIR"  ]]; then die "## Error: Missing out folder"; fi
if [[ -z "$DIST_DIR" ]]; then die "## Error: Missing destination folder"; fi
if [[ -z "$BNUM"     ]]; then die "## Error: Missing build number"; fi

if [[ "$OUT_DIR" != /* ]]
then
    pushd "$PROG_DIR"/../..
    OUT_DIR="$PWD/$OUT_DIR"
    echo here
    popd
fi

cd "$PROG_DIR"

TASKS=" \
--project-prop buildFromServer=true \
--project-prop buildEspresso=true \
createArchive"

# first build Eclipse/Monitor
( set -x ; OUT_DIR="$OUT_DIR" DIST_DIR="$DIST_DIR" ./gradlew $TASKS )

# Workaround for https://code.google.com/p/android/issues/detail?id=80444
# This removes libs/* from espresso-core-2.0.aar
mkdir $DIST_DIR/libsTmp
mkdir $DIST_DIR/classesJarTmp
unzip $DIST_DIR/android_m2repository_r10.zip -d $DIST_DIR/libsTmp
zip -d $DIST_DIR/libsTmp/m2repository/com/android/support/test/espresso/espresso-core/2.0/espresso-core-2.0.aar libs/*

# Remove guava and dagger deps from classes.jar
unzip $DIST_DIR/libsTmp/m2repository/com/android/support/test/espresso/espresso-core/2.0/espresso-core-2.0.aar -d $DIST_DIR/classesJarTmp
zip -d $DIST_DIR/classesJarTmp/classes.jar dagger/* com/google/*
cd $DIST_DIR/classesJarTmp/
zip -r $DIST_DIR/libsTmp/m2repository/com/android/support/test/espresso/espresso-core/2.0/espresso-core-2.0.aar .
cd ..
rm -rf $DIST_DIR/classesJarTmp

rm $DIST_DIR/android_m2repository_r10.zip
cd $DIST_DIR/libsTmp
zip -r ../android_m2repository_r10.zip .
cd ..
rm -rf libsTmp
