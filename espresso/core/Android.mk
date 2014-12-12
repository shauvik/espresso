#
# Copyright (C) 2014 The Android Open Source Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := espresso-core

LOCAL_SDK_VERSION := 19

LOCAL_SRC_FILES := $(call all-java-files-under, src)

LOCAL_STATIC_JAVA_LIBRARIES := \
    espresso-idling-resource \
    espresso-dagger-1.2.1 \
    espresso-dagger-compiler-1.2.1 \
    espresso-guava \
    hamcrest \
    hamcrest-integration \
    hamcrest-library \
    espresso-javawriter-2.1.1 \
    espresso-javax-inject-1 \
    jsr305 \
    android-support-test

include $(BUILD_STATIC_JAVA_LIBRARY)

#############################################################
# Pre-built dependency jars
#############################################################

include $(CLEAR_VARS)

repo_prebuilts_dir := ../../../../prebuilts

LOCAL_PREBUILT_STATIC_JAVA_LIBRARIES := \
    espresso-dagger-1.2.1:../libs/dagger-1.2.1.jar  \
    espresso-dagger-compiler-1.2.1:../libs/dagger-compiler-1.2.1.jar \
    espresso-guava:$(repo_prebuilts_dir)/tools/common/m2/repository/com/google/guava/guava/15.0/guava-15.0.jar \
    espresso-javawriter-2.1.1:$(repo_prebuilts_dir)/tools/common/m2/repository/com/squareup/javawriter/2.1.1/javawriter-2.1.1.jar \
    espresso-javax-inject-1:$(repo_prebuilts_dir)/tools/common/m2/repository/javax/inject/javax.inject/1/javax.inject-1.jar

include $(BUILD_MULTI_PREBUILT)

# Clean up locally defined vars
repo_prebuilts_dir :=
