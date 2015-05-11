package android.support.test.espresso.web.webdriver;
// GENERATED CODE DO NOT EDIT
final class WebDriverAtomScripts {
/* field: CLEAR_ANDROID license:

 Copyright 2014 Software Freedom Conservancy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
  static final String CLEAR_ANDROID =
  new StringBuilder(
    "function(){return(function(){function g(a){return function(){retur" +
    "n this[a]}}function k(a){return function(){return a}}var l,n=this;" +
    "function r(a){return void 0!==a}function aa(a,b){var c=a.split(\".\"" +
    "),d=n;c[0]in d||!d.execScript||d.execScript(\"var \"+c[0]);for(var e" +
    ";c.length&&(e=c.shift());)!c.length&&r(b)?d[e]=b:d[e]?d=d[e]:d=d[e" +
    "]={}}\nfunction ba(a){var b=typeof a;if(\"object\"==b)if(a){if(a inst" +
    "anceof Array)return\"array\";if(a instanceof Object)return b;var c=O" +
    "bject.prototype.toString.call(a);if(\"[object Window]\"==c)return\"ob" +
    "ject\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"undefine" +
    "d\"!=typeof a.splice&&\"undefined\"!=typeof a.propertyIsEnumerable&&!" +
    "a.propertyIsEnumerable(\"splice\"))return\"array\";if(\"[object Functio" +
    "n]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof a.property" +
    "IsEnumerable&&!a.propertyIsEnumerable(\"call\"))return\"function\"}els" +
    "e return\"null\";\nelse if(\"function\"==b&&\"undefined\"==typeof a.call)" +
    "return\"object\";return b}function u(a){return\"string\"==typeof a}fun" +
    "ction ca(a){return\"number\"==typeof a}function da(a){return\"functio" +
    "n\"==ba(a)}function ea(a,b,c){return a.call.apply(a.bind,arguments)" +
    "}\nfunction fa(a,b,c){if(!a)throw Error();if(2<arguments.length){va" +
    "r d=Array.prototype.slice.call(arguments,2);return function(){var " +
    "c=Array.prototype.slice.call(arguments);Array.prototype.unshift.ap" +
    "ply(c,d);return a.apply(b,c)}}return function(){return a.apply(b,a" +
    "rguments)}}function ga(a,b,c){ga=Function.prototype.bind&&-1!=Func" +
    "tion.prototype.bind.toString().indexOf(\"native code\")?ea:fa;return" +
    " ga.apply(null,arguments)}\nfunction ha(a,b){var c=Array.prototype." +
    "slice.call(arguments,1);return function(){var b=c.slice();b.push.a" +
    "pply(b,arguments);return a.apply(this,b)}}function v(a,b){function" +
    " c(){}c.prototype=b.prototype;a.U=b.prototype;a.prototype=new c;a." +
    "prototype.constructor=a;a.S=function(a,c,f){for(var h=Array(argume" +
    "nts.length-2),q=2;q<arguments.length;q++)h[q-2]=arguments[q];retur" +
    "n b.prototype[c].apply(a,h)}}\nFunction.prototype.bind=Function.pro" +
    "totype.bind||function(a,b){if(1<arguments.length){var c=Array.prot" +
    "otype.slice.call(arguments,1);c.unshift(this,a);return ga.apply(nu" +
    "ll,c)}return ga(this,a)};function ia(a){if(Error.captureStackTrace" +
    ")Error.captureStackTrace(this,ia);else{var b=Error().stack;b&&(thi" +
    "s.stack=b)}a&&(this.message=String(a))}v(ia,Error);ia.prototype.na" +
    "me=\"CustomError\";function ja(a,b){for(var c=a.split(\"%s\"),d=\"\",e=A" +
    "rray.prototype.slice.call(arguments,1);e.length&&1<c.length;)d+=c." +
    "shift()+e.shift();return d+c.join(\"%s\")}var ka=String.prototype.tr" +
    "im?function(a){return a.trim()}:function(a){return a.replace(/^[\\s" +
    "\\xa0]+|[\\s\\xa0]+$/g,\"\")};function la(a,b){return a<b?-1:a>b?1:0}fu" +
    "nction ma(a){return String(a).replace(/\\-([a-z])/g,function(a,c){r" +
    "eturn c.toUpperCase()})};function na(a,b){b.unshift(a);ia.call(thi" +
    "s,ja.apply(null,b));b.shift()}v(na,ia);na.prototype.name=\"Assertio" +
    "nError\";function oa(a,b,c){if(!a){var d=\"Assertion failed\";if(b)va" +
    "r d=d+(\": \"+b),e=Array.prototype.slice.call(arguments,2);throw new" +
    " na(\"\"+d,e||[]);}};var pa=Array.prototype;function qa(a,b){if(u(a)" +
    ")return u(b)&&1==b.length?a.indexOf(b,0):-1;for(var c=0;c<a.length" +
    ";c++)if(c in a&&a[c]===b)return c;return-1}function w(a,b){for(var" +
    " c=a.length,d=u(a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.call(void 0" +
    ",d[e],e,a)}function ra(a,b,c){var d=c;w(a,function(c,f){d=b.call(v" +
    "oid 0,d,c,f,a)});return d}function sa(a,b){for(var c=a.length,d=u(" +
    "a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))re" +
    "turn!0;return!1}\nfunction ta(a,b){for(var c=a.length,d=u(a)?a.spli" +
    "t(\"\"):a,e=0;e<c;e++)if(e in d&&!b.call(void 0,d[e],e,a))return!1;r" +
    "eturn!0}function ua(a){return pa.concat.apply(pa,arguments)}functi" +
    "on va(a,b,c){oa(null!=a.length);return 2>=arguments.length?pa.slic" +
    "e.call(a,b):pa.slice.call(a,b,c)};function wa(a,b){this.x=r(a)?a:0" +
    ";this.y=r(b)?b:0}l=wa.prototype;l.clone=function(){return new wa(t" +
    "his.x,this.y)};l.toString=function(){return\"(\"+this.x+\", \"+this.y+" +
    "\")\"};l.ceil=function(){this.x=Math.ceil(this.x);this.y=Math.ceil(t" +
    "his.y);return this};l.floor=function(){this.x=Math.floor(this.x);t" +
    "his.y=Math.floor(this.y);return this};l.round=function(){this.x=Ma" +
    "th.round(this.x);this.y=Math.round(this.y);return this};l.scale=fu" +
    "nction(a,b){var c=ca(b)?b:a;this.x*=a;this.y*=c;return this};funct" +
    "ion xa(a){var b=arguments.length;if(1==b&&\"array\"==ba(arguments[0]" +
    "))return xa.apply(null,arguments[0]);for(var c={},d=0;d<b;d++)c[ar" +
    "guments[d]]=!0;return c};xa(\"area base br col command embed hr img" +
    " input keygen link meta param source track wbr\".split(\" \"));functi" +
    "on ya(a,b){this.width=a;this.height=b}l=ya.prototype;l.clone=funct" +
    "ion(){return new ya(this.width,this.height)};l.toString=function()" +
    "{return\"(\"+this.width+\" x \"+this.height+\")\"};l.ceil=function(){thi" +
    "s.width=Math.ceil(this.width);this.height=Math.ceil(this.height);r" +
    "eturn this};l.floor=function(){this.width=Math.floor(this.width);t" +
    "his.height=Math.floor(this.height);return this};l.round=function()" +
    "{this.width=Math.round(this.width);this.height=Math.round(this.hei" +
    "ght);return this};\nl.scale=function(a,b){var c=ca(b)?b:a;this.widt" +
    "h*=a;this.height*=c;return this};var za;a:{var Aa=n.navigator;if(A" +
    "a){var Ba=Aa.userAgent;if(Ba){za=Ba;break a}}za=\"\"};var Ca=-1!=za." +
    "indexOf(\"Macintosh\"),Da=-1!=za.indexOf(\"Windows\");function Ea(a){f" +
    "or(;a&&1!=a.nodeType;)a=a.previousSibling;return a}function Fa(a,b" +
    "){if(a.contains&&1==b.nodeType)return a==b||a.contains(b);if(\"unde" +
    "fined\"!=typeof a.compareDocumentPosition)return a==b||Boolean(a.co" +
    "mpareDocumentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;return b" +
    "==a}\nfunction Ga(a,b){if(a==b)return 0;if(a.compareDocumentPositio" +
    "n)return a.compareDocumentPosition(b)&2?1:-1;if(\"sourceIndex\"in a|" +
    "|a.parentNode&&\"sourceIndex\"in a.parentNode){var c=1==a.nodeType,d" +
    "=1==b.nodeType;if(c&&d)return a.sourceIndex-b.sourceIndex;var e=a." +
    "parentNode,f=b.parentNode;return e==f?Ha(a,b):!c&&Fa(e,b)?-1*Ia(a," +
    "b):!d&&Fa(f,a)?Ia(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b.source" +
    "Index:f.sourceIndex)}d=x(a);c=d.createRange();c.selectNode(a);c.co" +
    "llapse(!0);d=d.createRange();d.selectNode(b);\nd.collapse(!0);retur" +
    "n c.compareBoundaryPoints(n.Range.START_TO_END,d)}function Ia(a,b)" +
    "{var c=a.parentNode;if(c==b)return-1;for(var d=b;d.parentNode!=c;)" +
    "d=d.parentNode;return Ha(d,a)}function Ha(a,b){for(var c=b;c=c.pre" +
    "viousSibling;)if(c==a)return-1;return 1}function x(a){oa(a,\"Node c" +
    "annot be null or undefined.\");return 9==a.nodeType?a:a.ownerDocume" +
    "nt||a.document}function Ja(a,b,c){c||(a=a.parentNode);for(c=0;a;){" +
    "oa(\"parentNode\"!=a.name);if(b(a))return a;a=a.parentNode;c++}retur" +
    "n null}\nfunction Ka(a){try{return a&&a.activeElement}catch(b){}ret" +
    "urn null}function La(a){this.a=a||n.document||document}La.prototyp" +
    "e.contains=Fa;function Ma(a,b,c,d){this.top=a;this.right=b;this.bo" +
    "ttom=c;this.left=d}l=Ma.prototype;l.clone=function(){return new Ma" +
    "(this.top,this.right,this.bottom,this.left)};l.toString=function()" +
    "{return\"(\"+this.top+\"t, \"+this.right+\"r, \"+this.bottom+\"b, \"+this." +
    "left+\"l)\"};l.contains=function(a){return this&&a?a instanceof Ma?a" +
    ".left>=this.left&&a.right<=this.right&&a.top>=this.top&&a.bottom<=" +
    "this.bottom:a.x>=this.left&&a.x<=this.right&&a.y>=this.top&&a.y<=t" +
    "his.bottom:!1};\nl.ceil=function(){this.top=Math.ceil(this.top);thi" +
    "s.right=Math.ceil(this.right);this.bottom=Math.ceil(this.bottom);t" +
    "his.left=Math.ceil(this.left);return this};l.floor=function(){this" +
    ".top=Math.floor(this.top);this.right=Math.floor(this.right);this.b" +
    "ottom=Math.floor(this.bottom);this.left=Math.floor(this.left);retu" +
    "rn this};l.round=function(){this.top=Math.round(this.top);this.rig" +
    "ht=Math.round(this.right);this.bottom=Math.round(this.bottom);this" +
    ".left=Math.round(this.left);return this};\nl.scale=function(a,b){va" +
    "r c=ca(b)?b:a;this.left*=a;this.right*=a;this.top*=c;this.bottom*=" +
    "c;return this};function y(a,b,c,d){this.left=a;this.top=b;this.wid" +
    "th=c;this.height=d}l=y.prototype;l.clone=function(){return new y(t" +
    "his.left,this.top,this.width,this.height)};l.toString=function(){r" +
    "eturn\"(\"+this.left+\", \"+this.top+\" - \"+this.width+\"w x \"+this.heig" +
    "ht+\"h)\"};l.contains=function(a){return a instanceof y?this.left<=a" +
    ".left&&this.left+this.width>=a.left+a.width&&this.top<=a.top&&this" +
    ".top+this.height>=a.top+a.height:a.x>=this.left&&a.x<=this.left+th" +
    "is.width&&a.y>=this.top&&a.y<=this.top+this.height};\nl.ceil=functi" +
    "on(){this.left=Math.ceil(this.left);this.top=Math.ceil(this.top);t" +
    "his.width=Math.ceil(this.width);this.height=Math.ceil(this.height)" +
    ";return this};l.floor=function(){this.left=Math.floor(this.left);t" +
    "his.top=Math.floor(this.top);this.width=Math.floor(this.width);thi" +
    "s.height=Math.floor(this.height);return this};l.round=function(){t" +
    "his.left=Math.round(this.left);this.top=Math.round(this.top);this." +
    "width=Math.round(this.width);this.height=Math.round(this.height);r" +
    "eturn this};\nl.scale=function(a,b){var c=ca(b)?b:a;this.left*=a;th" +
    "is.width*=a;this.top*=c;this.height*=c;return this};/*xxx_rpl_lic*" +
    "/\nvar Na=window;/*xxx_rpl_lic*/\nfunction Oa(a,b){this.code=a;this." +
    "a=Pa[a]||\"unknown error\";this.message=b||\"\";var c=this.a.replace(/" +
    "((?:^|\\s+)[a-z])/g,function(a){return a.toUpperCase().replace(/^[\\" +
    "s\\xa0]+/g,\"\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+=\"E" +
    "rror\";this.name=c;c=Error(this.message);c.name=this.name;this.stac" +
    "k=c.stack||\"\"}v(Oa,Error);\nvar Pa={15:\"element not selectable\",11:" +
    "\"element not visible\",31:\"ime engine activation failed\",30:\"ime no" +
    "t available\",24:\"invalid cookie domain\",29:\"invalid element coordi" +
    "nates\",12:\"invalid element state\",32:\"invalid selector\",51:\"invali" +
    "d selector\",52:\"invalid selector\",17:\"javascript error\",405:\"unsup" +
    "ported operation\",34:\"move target out of bounds\",27:\"no such alert" +
    "\",7:\"no such element\",8:\"no such frame\",23:\"no such window\",28:\"sc" +
    "ript timeout\",33:\"session not created\",10:\"stale element reference" +
    "\",\n0:\"success\",21:\"timeout\",25:\"unable to set cookie\",26:\"unexpect" +
    "ed alert open\",13:\"unknown error\",9:\"unknown command\"};Oa.prototyp" +
    "e.toString=function(){return this.name+\": \"+this.message};/*xxx_rp" +
    "l_lic*/\nfunction Qa(a){return(a=a.exec(za))?a[1]:\"\"}Qa(/Android\\s+" +
    "([0-9.]+)/)||Qa(/Version\\/([0-9.]+)/);/*xxx_rpl_lic*/\nfunction Ra(" +
    "a){var b=0,c=ka(String(Sa)).split(\".\");a=ka(String(a)).split(\".\");" +
    "for(var d=Math.max(c.length,a.length),e=0;0==b&&e<d;e++){var f=c[e" +
    "]||\"\",h=a[e]||\"\",q=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),t=RegExp(\"(\\\\d*)(\\\\D" +
    "*)\",\"g\");do{var p=q.exec(f)||[\"\",\"\",\"\"],m=t.exec(h)||[\"\",\"\",\"\"];if" +
    "(0==p[0].length&&0==m[0].length)break;b=la(0==p[1].length?0:parseI" +
    "nt(p[1],10),0==m[1].length?0:parseInt(m[1],10))||la(0==p[2].length" +
    ",0==m[2].length)||la(p[2],m[2])}while(0==b)}}\nvar Ta=/Android\\s+([" +
    "0-9\\.]+)/.exec(za),Sa=Ta?Ta[1]:\"0\";Ra(2.3);Ra(4);/*xxx_rpl_lic*/\n/" +
    "*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyri" +
    "ght (c) 2012 Google Inc.\n\n Permission is hereby granted, free of c" +
    "harge, to any person obtaining a copy\n of this software and associ" +
    "ated documentation files (the \"Software\"), to\n deal in the Softwar" +
    "e without restriction, including without limitation the\n rights to" +
    " use, copy, modify, merge, publish, distribute, sublicense, and/or" +
    "\n sell copies of the Software, and to permit persons to whom the S" +
    "oftware is\n furnished to do so, subject to the following condition" +
    "s:\n\n The above copyright notice and this permission notice shall b" +
    "e included in\n all copies or substantial portions of the Software." +
    "\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND," +
    " EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES " +
    "OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRI" +
    "NGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LI" +
    "ABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACT" +
    "ION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CO" +
    "NNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SO" +
    "FTWARE.\n*/\nfunction Ua(a,b,c){this.a=a;this.b=b||1;this.i=c||1};/*" +
    "\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyrig" +
    "ht (c) 2012 Google Inc.\n\n Permission is hereby granted, free of ch" +
    "arge, to any person obtaining a copy\n of this software and associa" +
    "ted documentation files (the \"Software\"), to\n deal in the Software" +
    " without restriction, including without limitation the\n rights to " +
    "use, copy, modify, merge, publish, distribute, sublicense, and/or\n" +
    " sell copies of the Software, and to permit persons to whom the So" +
    "ftware is\n furnished to do so, subject to the following conditions" +
    ":\n\n The above copyright notice and this permission notice shall be" +
    " included in\n all copies or substantial portions of the Software.\n" +
    "\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, " +
    "EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES O" +
    "F MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRIN" +
    "GEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIA" +
    "BLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTI" +
    "ON OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CON" +
    "NECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOF" +
    "TWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, I" +
    "nc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted" +
    ", free of charge, to any person obtaining a copy\n of this software" +
    " and associated documentation files (the \"Software\"), to\n deal in " +
    "the Software without restriction, including without limitation the" +
    "\n rights to use, copy, modify, merge, publish, distribute, sublice" +
    "nse, and/or\n sell copies of the Software, and to permit persons to" +
    " whom the Software is\n furnished to do so, subject to the followin" +
    "g conditions:\n\n The above copyright notice and this permission not" +
    "ice shall be included in\n all copies or substantial portions of th" +
    "e Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY O" +
    "F ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE " +
    "WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE A" +
    "ND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HO" +
    "LDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHE" +
    "R IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT " +
    "OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS" +
    "\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cy" +
    "bozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is he" +
    "reby granted, free of charge, to any person obtaining a copy\n of t" +
    "his software and associated documentation files (the \"Software\"), " +
    "to\n deal in the Software without restriction, including without li" +
    "mitation the\n rights to use, copy, modify, merge, publish, distrib" +
    "ute, sublicense, and/or\n sell copies of the Software, and to permi" +
    "t persons to whom the Software is\n furnished to do so, subject to " +
    "the following conditions:\n\n The above copyright notice and this pe" +
    "rmission notice shall be included in\n all copies or substantial po" +
    "rtions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOU" +
    "T WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIM" +
    "ITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICUL" +
    "AR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR " +
    "COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABI" +
    "LITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING" +
    "\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OT" +
    "HER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Va(a){this.b=a;this.a=0" +
    "}function Wa(a){a=a.match(Xa);for(var b=0;b<a.length;b++)Ya.test(a" +
    "[b])&&a.splice(b,1);return new Va(a)}var Xa=RegExp(\"\\\\$?(?:(?![0-9" +
    "-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\.\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\" +
    "\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\",\"g\"),Ya=/^\\s/;function z(" +
    "a,b){return a.b[a.a+(b||0)]}function A(a){return a.b[a.a++]}functi" +
    "on Za(a){return a.b.length<=a.a};/*\n\n The MIT License\n\n Copyright " +
    "(c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permi" +
    "ssion is hereby granted, free of charge, to any person obtaining a" +
    " copy\n of this software and associated documentation files (the \"S" +
    "oftware\"), to\n deal in the Software without restriction, including" +
    " without limitation the\n rights to use, copy, modify, merge, publi" +
    "sh, distribute, sublicense, and/or\n sell copies of the Software, a" +
    "nd to permit persons to whom the Software is\n furnished to do so, " +
    "subject to the following conditions:\n\n The above copyright notice " +
    "and this permission notice shall be included in\n all copies or sub" +
    "stantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS " +
    "IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING " +
    "BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR" +
    " A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n " +
    "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR O" +
    "THER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWI" +
    "SE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR TH" +
    "E USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction B(a){var b=n" +
    "ull,c=a.nodeType;1==c&&(b=a.textContent,b=void 0==b||null==b?a.inn" +
    "erText:b,b=void 0==b||null==b?\"\":b);if(\"string\"!=typeof b)if(9==c|" +
    "|1==c){a=9==c?a.documentElement:a.firstChild;for(var c=0,d=[],b=\"\"" +
    ";a;){do 1!=a.nodeType&&(b+=a.nodeValue),d[c++]=a;while(a=a.firstCh" +
    "ild);for(;c&&!(a=d[--c].nextSibling););}}else b=a.nodeValue;return" +
    "\"\"+b}\nfunction $a(a,b,c){if(null===b)return!0;try{if(!a.getAttribu" +
    "te)return!1}catch(d){return!1}return null==c?!!a.getAttribute(b):a" +
    ".getAttribute(b,2)==c}function ab(a,b,c,d,e){return bb.call(null,a" +
    ",b,u(c)?c:null,u(d)?d:null,e||new D)}\nfunction bb(a,b,c,d,e){b.get" +
    "ElementsByName&&d&&\"name\"==c?(b=b.getElementsByName(d),w(b,functio" +
    "n(b){a.a(b)&&E(e,b)})):b.getElementsByClassName&&d&&\"class\"==c?(b=" +
    "b.getElementsByClassName(d),w(b,function(b){b.className==d&&a.a(b)" +
    "&&E(e,b)})):a instanceof F?cb(a,b,c,d,e):b.getElementsByTagName&&(" +
    "b=b.getElementsByTagName(a.i()),w(b,function(a){$a(a,c,d)&&E(e,a)}" +
    "));return e}function db(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSi" +
    "bling)$a(b,c,d)&&a.a(b)&&E(e,b);return e}\nfunction cb(a,b,c,d,e){f" +
    "or(b=b.firstChild;b;b=b.nextSibling)$a(b,c,d)&&a.a(b)&&E(e,b),cb(a" +
    ",b,c,d,e)};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, " +
    "Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby grante" +
    "d, free of charge, to any person obtaining a copy\n of this softwar" +
    "e and associated documentation files (the \"Software\"), to\n deal in" +
    " the Software without restriction, including without limitation th" +
    "e\n rights to use, copy, modify, merge, publish, distribute, sublic" +
    "ense, and/or\n sell copies of the Software, and to permit persons t" +
    "o whom the Software is\n furnished to do so, subject to the followi" +
    "ng conditions:\n\n The above copyright notice and this permission no" +
    "tice shall be included in\n all copies or substantial portions of t" +
    "he Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY " +
    "OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE" +
    " WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE " +
    "AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT H" +
    "OLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETH" +
    "ER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT" +
    " OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALING" +
    "S\n IN THE SOFTWARE.\n*/\nfunction D(){this.b=this.a=null;this.s=0}fu" +
    "nction eb(a){this.node=a;this.a=this.b=null}function fb(a,b){if(!a" +
    ".a)return b;if(!b.a)return a;for(var c=a.a,d=b.a,e=null,f=null,h=0" +
    ";c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):0<Ga(c.node,d.node)?(f=d,d" +
    "=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=f,h++;for(f=c||d;f;)f.b=e," +
    "e=e.a=f,h++,f=f.a;a.b=e;a.s=h;return a}function gb(a,b){var c=new " +
    "eb(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=c;a.s++}function E(a,b){va" +
    "r c=new eb(b);c.b=a.b;a.a?a.b.a=c:a.a=a.b=c;a.b=c;a.s++}\nfunction " +
    "hb(a){return(a=a.a)?a.node:null}function ib(a){return(a=hb(a))?B(a" +
    "):\"\"}function G(a,b){return new jb(a,!!b)}function jb(a,b){this.i=" +
    "a;this.b=(this.c=b)?a.b:a.a;this.a=null}function H(a){var b=a.b;if" +
    "(null==b)return null;var c=a.a=b;a.b=a.c?b.b:b.a;return c.node};/*" +
    "\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyrig" +
    "ht (c) 2012 Google Inc.\n\n Permission is hereby granted, free of ch" +
    "arge, to any person obtaining a copy\n of this software and associa" +
    "ted documentation files (the \"Software\"), to\n deal in the Software" +
    " without restriction, including without limitation the\n rights to " +
    "use, copy, modify, merge, publish, distribute, sublicense, and/or\n" +
    " sell copies of the Software, and to permit persons to whom the So" +
    "ftware is\n furnished to do so, subject to the following conditions" +
    ":\n\n The above copyright notice and this permission notice shall be" +
    " included in\n all copies or substantial portions of the Software.\n" +
    "\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, " +
    "EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES O" +
    "F MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRIN" +
    "GEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIA" +
    "BLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTI" +
    "ON OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CON" +
    "NECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOF" +
    "TWARE.\n*/\nfunction kb(a){switch(a.nodeType){case 1:return ha(lb,a)" +
    ";case 9:return kb(a.documentElement);case 11:case 10:case 6:case 1" +
    "2:return mb;default:return a.parentNode?kb(a.parentNode):mb}}funct" +
    "ion mb(){return null}function lb(a,b){if(a.prefix==b)return a.name" +
    "spaceURI||\"http://www.w3.org/1999/xhtml\";var c=a.getAttributeNode(" +
    "\"xmlns:\"+b);return c&&c.specified?c.value||null:a.parentNode&&9!=a" +
    ".parentNode.nodeType?lb(a.parentNode,b):null};/*\n\n The MIT License" +
    "\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google" +
    " Inc.\n\n Permission is hereby granted, free of charge, to any perso" +
    "n obtaining a copy\n of this software and associated documentation " +
    "files (the \"Software\"), to\n deal in the Software without restricti" +
    "on, including without limitation the\n rights to use, copy, modify," +
    " merge, publish, distribute, sublicense, and/or\n sell copies of th" +
    "e Software, and to permit persons to whom the Software is\n furnish" +
    "ed to do so, subject to the following conditions:\n\n The above copy" +
    "right notice and this permission notice shall be included in\n all " +
    "copies or substantial portions of the Software.\n\n THE SOFTWARE IS " +
    "PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIE" +
    "D, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY," +
    "\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVEN" +
    "T SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM," +
    " DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TO" +
    "RT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE S" +
    "OFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The" +
    " MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c)" +
    " 2012 Google Inc.\n\n Permission is hereby granted, free of charge, " +
    "to any person obtaining a copy\n of this software and associated do" +
    "cumentation files (the \"Software\"), to\n deal in the Software witho" +
    "ut restriction, including without limitation the\n rights to use, c" +
    "opy, modify, merge, publish, distribute, sublicense, and/or\n sell " +
    "copies of the Software, and to permit persons to whom the Software" +
    " is\n furnished to do so, subject to the following conditions:\n\n Th" +
    "e above copyright notice and this permission notice shall be inclu" +
    "ded in\n all copies or substantial portions of the Software.\n\n THE " +
    "SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRES" +
    "S OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERC" +
    "HANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT" +
    ". IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FO" +
    "R ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF " +
    "CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTIO" +
    "N WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE." +
    "\n*/\nfunction I(a){this.m=a;this.b=this.h=!1;this.i=null}function J" +
    "(a){return\"\\n  \"+a.toString().split(\"\\n\").join(\"\\n  \")}function nb" +
    "(a,b){a.h=b}function ob(a,b){a.b=b}function K(a,b){var c=a.a(b);re" +
    "turn c instanceof D?+ib(c):+c}function L(a,b){var c=a.a(b);return " +
    "c instanceof D?ib(c):\"\"+c}function pb(a,b){var c=a.a(b);return c i" +
    "nstanceof D?!!c.s:!!c};/*\n\n The MIT License\n\n Copyright (c) 2007 C" +
    "ybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is h" +
    "ereby granted, free of charge, to any person obtaining a copy\n of " +
    "this software and associated documentation files (the \"Software\")," +
    " to\n deal in the Software without restriction, including without l" +
    "imitation the\n rights to use, copy, modify, merge, publish, distri" +
    "bute, sublicense, and/or\n sell copies of the Software, and to perm" +
    "it persons to whom the Software is\n furnished to do so, subject to" +
    " the following conditions:\n\n The above copyright notice and this p" +
    "ermission notice shall be included in\n all copies or substantial p" +
    "ortions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHO" +
    "UT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LI" +
    "MITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICU" +
    "LAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR" +
    " COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIAB" +
    "ILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISIN" +
    "G\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR O" +
    "THER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction qb(a,b,c){I.call(this," +
    "a.m);this.c=a;this.j=b;this.w=c;this.h=b.h||c.h;this.b=b.b||c.b;th" +
    "is.c==rb&&(c.b||c.h||4==c.m||0==c.m||!b.i?b.b||b.h||4==b.m||0==b.m" +
    "||!c.i||(this.i={name:c.i.name,A:b}):this.i={name:b.i.name,A:c})}v" +
    "(qb,I);\nfunction sb(a,b,c,d,e){b=b.a(d);c=c.a(d);var f;if(b instan" +
    "ceof D&&c instanceof D){e=G(b);for(d=H(e);d;d=H(e))for(b=G(c),f=H(" +
    "b);f;f=H(b))if(a(B(d),B(f)))return!0;return!1}if(b instanceof D||c" +
    " instanceof D){b instanceof D?e=b:(e=c,c=b);e=G(e);b=typeof c;for(" +
    "d=H(e);d;d=H(e)){switch(b){case \"number\":d=+B(d);break;case \"boole" +
    "an\":d=!!B(d);break;case \"string\":d=B(d);break;default:throw Error(" +
    "\"Illegal primitive type for comparison.\");}if(a(d,c))return!0}retu" +
    "rn!1}return e?\"boolean\"==typeof b||\"boolean\"==typeof c?\na(!!b,!!c)" +
    ":\"number\"==typeof b||\"number\"==typeof c?a(+b,+c):a(b,c):a(+b,+c)}q" +
    "b.prototype.a=function(a){return this.c.u(this.j,this.w,a)};qb.pro" +
    "totype.toString=function(){var a=\"Binary Expression: \"+this.c,a=a+" +
    "J(this.j);return a+=J(this.w)};function tb(a,b,c,d){this.a=a;this." +
    "H=b;this.m=c;this.u=d}tb.prototype.toString=g(\"a\");var ub={};funct" +
    "ion M(a,b,c,d){if(ub.hasOwnProperty(a))throw Error(\"Binary operato" +
    "r already created: \"+a);a=new tb(a,b,c,d);return ub[a.toString()]=" +
    "a}\nM(\"div\",6,1,function(a,b,c){return K(a,c)/K(b,c)});M(\"mod\",6,1," +
    "function(a,b,c){return K(a,c)%K(b,c)});M(\"*\",6,1,function(a,b,c){r" +
    "eturn K(a,c)*K(b,c)});M(\"+\",5,1,function(a,b,c){return K(a,c)+K(b,"
  )
      .append(
    "c)});M(\"-\",5,1,function(a,b,c){return K(a,c)-K(b,c)});M(\"<\",4,2,fu" +
    "nction(a,b,c){return sb(function(a,b){return a<b},a,b,c)});M(\">\",4" +
    ",2,function(a,b,c){return sb(function(a,b){return a>b},a,b,c)});M(" +
    "\"<=\",4,2,function(a,b,c){return sb(function(a,b){return a<=b},a,b," +
    "c)});\nM(\">=\",4,2,function(a,b,c){return sb(function(a,b){return a>" +
    "=b},a,b,c)});var rb=M(\"=\",3,2,function(a,b,c){return sb(function(a" +
    ",b){return a==b},a,b,c,!0)});M(\"!=\",3,2,function(a,b,c){return sb(" +
    "function(a,b){return a!=b},a,b,c,!0)});M(\"and\",2,2,function(a,b,c)" +
    "{return pb(a,c)&&pb(b,c)});M(\"or\",1,2,function(a,b,c){return pb(a," +
    "c)||pb(b,c)});/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Lab" +
    "s, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby gra" +
    "nted, free of charge, to any person obtaining a copy\n of this soft" +
    "ware and associated documentation files (the \"Software\"), to\n deal" +
    " in the Software without restriction, including without limitation" +
    " the\n rights to use, copy, modify, merge, publish, distribute, sub" +
    "license, and/or\n sell copies of the Software, and to permit person" +
    "s to whom the Software is\n furnished to do so, subject to the foll" +
    "owing conditions:\n\n The above copyright notice and this permission" +
    " notice shall be included in\n all copies or substantial portions o" +
    "f the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRAN" +
    "TY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO " +
    "THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPO" +
    "SE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGH" +
    "T HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WH" +
    "ETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, " +
    "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEAL" +
    "INGS\n IN THE SOFTWARE.\n*/\nfunction vb(a,b){if(b.a.length&&4!=a.m)t" +
    "hrow Error(\"Primary expression must evaluate to nodeset if filter " +
    "has predicate(s).\");I.call(this,a.m);this.c=a;this.j=b;this.h=a.h;" +
    "this.b=a.b}v(vb,I);vb.prototype.a=function(a){a=this.c.a(a);return" +
    " wb(this.j,a)};vb.prototype.toString=function(){var a;a=\"Filter:\"+" +
    "J(this.c);return a+=J(this.j)};/*\n\n The MIT License\n\n Copyright (c" +
    ") 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permiss" +
    "ion is hereby granted, free of charge, to any person obtaining a c" +
    "opy\n of this software and associated documentation files (the \"Sof" +
    "tware\"), to\n deal in the Software without restriction, including w" +
    "ithout limitation the\n rights to use, copy, modify, merge, publish" +
    ", distribute, sublicense, and/or\n sell copies of the Software, and" +
    " to permit persons to whom the Software is\n furnished to do so, su" +
    "bject to the following conditions:\n\n The above copyright notice an" +
    "d this permission notice shall be included in\n all copies or subst" +
    "antial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS" +
    "\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BU" +
    "T NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A" +
    " PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AU" +
    "THORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTH" +
    "ER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE" +
    ", ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE " +
    "USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction xb(a,b){if(b.l" +
    "ength<a.J)throw Error(\"Function \"+a.o+\" expects at least\"+a.J+\" ar" +
    "guments, \"+b.length+\" given\");if(null!==a.C&&b.length>a.C)throw Er" +
    "ror(\"Function \"+a.o+\" expects at most \"+a.C+\" arguments, \"+b.lengt" +
    "h+\" given\");a.M&&w(b,function(b,d){if(4!=b.m)throw Error(\"Argument" +
    " \"+d+\" to function \"+a.o+\" is not of type Nodeset: \"+b);});I.call(" +
    "this,a.m);this.j=a;this.c=b;nb(this,a.h||sa(b,function(a){return a" +
    ".h}));ob(this,a.L&&!b.length||a.K&&!!b.length||sa(b,function(a){re" +
    "turn a.b}))}\nv(xb,I);xb.prototype.a=function(a){return this.j.u.ap" +
    "ply(null,ua(a,this.c))};xb.prototype.toString=function(){var a=\"Fu" +
    "nction: \"+this.j;if(this.c.length)var b=ra(this.c,function(a,b){re" +
    "turn a+J(b)},\"Arguments:\"),a=a+J(b);return a};function yb(a,b,c,d," +
    "e,f,h,q,t){this.o=a;this.m=b;this.h=c;this.L=d;this.K=e;this.u=f;t" +
    "his.J=h;this.C=r(q)?q:h;this.M=!!t}yb.prototype.toString=g(\"o\");va" +
    "r zb={};\nfunction O(a,b,c,d,e,f,h,q){if(zb.hasOwnProperty(a))throw" +
    " Error(\"Function already created: \"+a+\".\");zb[a]=new yb(a,b,c,d,!1" +
    ",e,f,h,q)}O(\"boolean\",2,!1,!1,function(a,b){return pb(b,a)},1);O(\"" +
    "ceiling\",1,!1,!1,function(a,b){return Math.ceil(K(b,a))},1);O(\"con" +
    "cat\",3,!1,!1,function(a,b){var c=va(arguments,1);return ra(c,funct" +
    "ion(b,c){return b+L(c,a)},\"\")},2,null);O(\"contains\",2,!1,!1,functi" +
    "on(a,b,c){b=L(b,a);a=L(c,a);return-1!=b.indexOf(a)},2);O(\"count\",1" +
    ",!1,!1,function(a,b){return b.a(a).s},1,1,!0);\nO(\"false\",2,!1,!1,k" +
    "(!1),0);O(\"floor\",1,!1,!1,function(a,b){return Math.floor(K(b,a))}" +
    ",1);O(\"id\",4,!1,!1,function(a,b){var c=a.a,d=9==c.nodeType?c:c.own" +
    "erDocument,c=L(b,a).split(/\\s+/),e=[];w(c,function(a){a=d.getEleme" +
    "ntById(a);!a||0<=qa(e,a)||e.push(a)});e.sort(Ga);var f=new D;w(e,f" +
    "unction(a){E(f,a)});return f},1);O(\"lang\",2,!1,!1,k(!1),1);O(\"last" +
    "\",1,!0,!1,function(a){if(1!=arguments.length)throw Error(\"Function" +
    " last expects ()\");return a.i},0);\nO(\"local-name\",3,!1,!0,function" +
    "(a,b){var c=b?hb(b.a(a)):a.a;return c?c.localName||c.nodeName.toLo" +
    "werCase():\"\"},0,1,!0);O(\"name\",3,!1,!0,function(a,b){var c=b?hb(b." +
    "a(a)):a.a;return c?c.nodeName.toLowerCase():\"\"},0,1,!0);O(\"namespa" +
    "ce-uri\",3,!0,!1,k(\"\"),0,1,!0);O(\"normalize-space\",3,!1,!0,function" +
    "(a,b){return(b?L(b,a):B(a.a)).replace(/[\\s\\xa0]+/g,\" \").replace(/^" +
    "\\s+|\\s+$/g,\"\")},0,1);O(\"not\",2,!1,!1,function(a,b){return!pb(b,a)}" +
    ",1);O(\"number\",1,!1,!0,function(a,b){return b?K(b,a):+B(a.a)},0,1)" +
    ";\nO(\"position\",1,!0,!1,function(a){return a.b},0);O(\"round\",1,!1,!" +
    "1,function(a,b){return Math.round(K(b,a))},1);O(\"starts-with\",2,!1" +
    ",!1,function(a,b,c){b=L(b,a);a=L(c,a);return 0==b.lastIndexOf(a,0)" +
    "},2);O(\"string\",3,!1,!0,function(a,b){return b?L(b,a):B(a.a)},0,1)" +
    ";O(\"string-length\",1,!1,!0,function(a,b){return(b?L(b,a):B(a.a)).l" +
    "ength},0,1);\nO(\"substring\",3,!1,!1,function(a,b,c,d){c=K(c,a);if(i" +
    "sNaN(c)||Infinity==c||-Infinity==c)return\"\";d=d?K(d,a):Infinity;if" +
    "(isNaN(d)||-Infinity===d)return\"\";c=Math.round(c)-1;var e=Math.max" +
    "(c,0);a=L(b,a);if(Infinity==d)return a.substring(e);b=Math.round(d" +
    ");return a.substring(e,c+b)},2,3);O(\"substring-after\",3,!1,!1,func" +
    "tion(a,b,c){b=L(b,a);a=L(c,a);c=b.indexOf(a);return-1==c?\"\":b.subs" +
    "tring(c+a.length)},2);\nO(\"substring-before\",3,!1,!1,function(a,b,c" +
    "){b=L(b,a);a=L(c,a);a=b.indexOf(a);return-1==a?\"\":b.substring(0,a)" +
    "},2);O(\"sum\",1,!1,!1,function(a,b){for(var c=G(b.a(a)),d=0,e=H(c);" +
    "e;e=H(c))d+=+B(e);return d},1,1,!0);O(\"translate\",3,!1,!1,function" +
    "(a,b,c,d){b=L(b,a);c=L(c,a);var e=L(d,a);a=[];for(d=0;d<c.length;d" +
    "++){var f=c.charAt(d);f in a||(a[f]=e.charAt(d))}c=\"\";for(d=0;d<b." +
    "length;d++)f=b.charAt(d),c+=f in a?a[f]:f;return c},3);O(\"true\",2," +
    "!1,!1,k(!0),0);/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu La" +
    "bs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby gr" +
    "anted, free of charge, to any person obtaining a copy\n of this sof" +
    "tware and associated documentation files (the \"Software\"), to\n dea" +
    "l in the Software without restriction, including without limitatio" +
    "n the\n rights to use, copy, modify, merge, publish, distribute, su" +
    "blicense, and/or\n sell copies of the Software, and to permit perso" +
    "ns to whom the Software is\n furnished to do so, subject to the fol" +
    "lowing conditions:\n\n The above copyright notice and this permissio" +
    "n notice shall be included in\n all copies or substantial portions " +
    "of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRA" +
    "NTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO" +
    " THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURP" +
    "OSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIG" +
    "HT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, W" +
    "HETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM," +
    " OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEA" +
    "LINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 20" +
    "07 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission " +
    "is hereby granted, free of charge, to any person obtaining a copy\n" +
    " of this software and associated documentation files (the \"Softwar" +
    "e\"), to\n deal in the Software without restriction, including witho" +
    "ut limitation the\n rights to use, copy, modify, merge, publish, di" +
    "stribute, sublicense, and/or\n sell copies of the Software, and to " +
    "permit persons to whom the Software is\n furnished to do so, subjec" +
    "t to the following conditions:\n\n The above copyright notice and th" +
    "is permission notice shall be included in\n all copies or substanti" +
    "al portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", W" +
    "ITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NO" +
    "T LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PAR" +
    "TICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHOR" +
    "S OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n " +
    "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, AR" +
    "ISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE " +
    "OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction F(a,b){this.j=a;th" +
    "is.c=r(b)?b:null;this.b=null;switch(a){case \"comment\":this.b=8;bre" +
    "ak;case \"text\":this.b=3;break;case \"processing-instruction\":this.b" +
    "=7;break;case \"node\":break;default:throw Error(\"Unexpected argumen" +
    "t\");}}function Ab(a){return\"comment\"==a||\"text\"==a||\"processing-in" +
    "struction\"==a||\"node\"==a}F.prototype.a=function(a){return null===t" +
    "his.b||this.b==a.nodeType};F.prototype.i=g(\"j\");F.prototype.toStri" +
    "ng=function(){var a=\"Kind Test: \"+this.j;null===this.c||(a+=J(this" +
    ".c));return a};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu La" +
    "bs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby gr" +
    "anted, free of charge, to any person obtaining a copy\n of this sof" +
    "tware and associated documentation files (the \"Software\"), to\n dea" +
    "l in the Software without restriction, including without limitatio" +
    "n the\n rights to use, copy, modify, merge, publish, distribute, su" +
    "blicense, and/or\n sell copies of the Software, and to permit perso" +
    "ns to whom the Software is\n furnished to do so, subject to the fol" +
    "lowing conditions:\n\n The above copyright notice and this permissio" +
    "n notice shall be included in\n all copies or substantial portions " +
    "of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRA" +
    "NTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO" +
    " THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURP" +
    "OSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIG" +
    "HT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, W" +
    "HETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM," +
    " OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEA" +
    "LINGS\n IN THE SOFTWARE.\n*/\nfunction Bb(a){I.call(this,3);this.c=a." +
    "substring(1,a.length-1)}v(Bb,I);Bb.prototype.a=g(\"c\");Bb.prototype" +
    ".toString=function(){return\"Literal: \"+this.c};/*\n\n The MIT Licens" +
    "e\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Googl" +
    "e Inc.\n\n Permission is hereby granted, free of charge, to any pers" +
    "on obtaining a copy\n of this software and associated documentation" +
    " files (the \"Software\"), to\n deal in the Software without restrict" +
    "ion, including without limitation the\n rights to use, copy, modify" +
    ", merge, publish, distribute, sublicense, and/or\n sell copies of t" +
    "he Software, and to permit persons to whom the Software is\n furnis" +
    "hed to do so, subject to the following conditions:\n\n The above cop" +
    "yright notice and this permission notice shall be included in\n all" +
    " copies or substantial portions of the Software.\n\n THE SOFTWARE IS" +
    " PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLI" +
    "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY" +
    ",\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVE" +
    "NT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM" +
    ", DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, T" +
    "ORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE " +
    "SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunctio" +
    "n Cb(a,b){this.o=a.toLowerCase();this.b=b?b.toLowerCase():\"http://" +
    "www.w3.org/1999/xhtml\"}Cb.prototype.a=function(a){var b=a.nodeType" +
    ";return 1!=b&&2!=b?!1:\"*\"!=this.o&&this.o!=a.nodeName.toLowerCase(" +
    ")?!1:this.b==(a.namespaceURI?a.namespaceURI.toLowerCase():\"http://" +
    "www.w3.org/1999/xhtml\")};Cb.prototype.i=g(\"o\");Cb.prototype.toStri" +
    "ng=function(){return\"Name Test: \"+(\"http://www.w3.org/1999/xhtml\"=" +
    "=this.b?\"\":this.b+\":\")+this.o};/*\n\n The MIT License\n\n Copyright (c" +
    ") 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permiss" +
    "ion is hereby granted, free of charge, to any person obtaining a c" +
    "opy\n of this software and associated documentation files (the \"Sof" +
    "tware\"), to\n deal in the Software without restriction, including w" +
    "ithout limitation the\n rights to use, copy, modify, merge, publish" +
    ", distribute, sublicense, and/or\n sell copies of the Software, and" +
    " to permit persons to whom the Software is\n furnished to do so, su" +
    "bject to the following conditions:\n\n The above copyright notice an" +
    "d this permission notice shall be included in\n all copies or subst" +
    "antial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS" +
    "\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BU" +
    "T NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A" +
    " PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AU" +
    "THORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTH" +
    "ER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE" +
    ", ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE " +
    "USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Db(a){I.call(t" +
    "his,1);this.c=a}v(Db,I);Db.prototype.a=g(\"c\");Db.prototype.toStrin" +
    "g=function(){return\"Number: \"+this.c};/*\n\n The MIT License\n\n Copyr" +
    "ight (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n " +
    "Permission is hereby granted, free of charge, to any person obtain" +
    "ing a copy\n of this software and associated documentation files (t" +
    "he \"Software\"), to\n deal in the Software without restriction, incl" +
    "uding without limitation the\n rights to use, copy, modify, merge, " +
    "publish, distribute, sublicense, and/or\n sell copies of the Softwa" +
    "re, and to permit persons to whom the Software is\n furnished to do" +
    " so, subject to the following conditions:\n\n The above copyright no" +
    "tice and this permission notice shall be included in\n all copies o" +
    "r substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED" +
    " \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLU" +
    "DING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNES" +
    "S FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL " +
    "THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES" +
    " OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OT" +
    "HERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE " +
    "OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Eb(a,b)" +
    "{I.call(this,a.m);this.j=a;this.c=b;this.h=a.h;this.b=a.b;if(1==th" +
    "is.c.length){var c=this.c[0];c.B||c.c!=Fb||(c=c.w,\"*\"!=c.i()&&(thi" +
    "s.i={name:c.i(),A:null}))}}v(Eb,I);function Gb(){I.call(this,4)}v(" +
    "Gb,I);Gb.prototype.a=function(a){var b=new D;a=a.a;9==a.nodeType?E" +
    "(b,a):E(b,a.ownerDocument);return b};Gb.prototype.toString=k(\"Root" +
    " Helper Expression\");function Hb(){I.call(this,4)}v(Hb,I);Hb.proto" +
    "type.a=function(a){var b=new D;E(b,a.a);return b};Hb.prototype.toS" +
    "tring=k(\"Context Helper Expression\");\nfunction Ib(a){return\"/\"==a|" +
    "|\"//\"==a}Eb.prototype.a=function(a){var b=this.j.a(a);if(!(b insta" +
    "nceof D))throw Error(\"Filter expression must evaluate to nodeset.\"" +
    ");a=this.c;for(var c=0,d=a.length;c<d&&b.s;c++){var e=a[c],f=G(b,e" +
    ".c.a),h;if(e.h||e.c!=Jb)if(e.h||e.c!=Kb)for(h=H(f),b=e.a(new Ua(h)" +
    ");null!=(h=H(f));)h=e.a(new Ua(h)),b=fb(b,h);else h=H(f),b=e.a(new" +
    " Ua(h));else{for(h=H(f);(b=H(f))&&(!h.contains||h.contains(b))&&b." +
    "compareDocumentPosition(h)&8;h=b);b=e.a(new Ua(h))}}return b};\nEb." +
    "prototype.toString=function(){var a;a=\"Path Expression:\"+J(this.j)" +
    ";if(this.c.length){var b=ra(this.c,function(a,b){return a+J(b)},\"S" +
    "teps:\");a+=J(b)}return a};/*\n\n The MIT License\n\n Copyright (c) 200" +
    "7 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission i" +
    "s hereby granted, free of charge, to any person obtaining a copy\n " +
    "of this software and associated documentation files (the \"Software" +
    "\"), to\n deal in the Software without restriction, including withou" +
    "t limitation the\n rights to use, copy, modify, merge, publish, dis" +
    "tribute, sublicense, and/or\n sell copies of the Software, and to p" +
    "ermit persons to whom the Software is\n furnished to do so, subject" +
    " to the following conditions:\n\n The above copyright notice and thi" +
    "s permission notice shall be included in\n all copies or substantia" +
    "l portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WI" +
    "THOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT" +
    " LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PART" +
    "ICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS" +
    " OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n L" +
    "IABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARI" +
    "SING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE O" +
    "R OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Lb(a,b){this.a=a;th" +
    "is.b=!!b}\nfunction wb(a,b,c){for(c=c||0;c<a.a.length;c++)for(var d" +
    "=a.a[c],e=G(b),f=b.s,h,q=0;h=H(e);q++){var t=a.b?f-q:q+1;h=d.a(new" +
    " Ua(h,t,f));if(\"number\"==typeof h)t=t==h;else if(\"string\"==typeof " +
    "h||\"boolean\"==typeof h)t=!!h;else if(h instanceof D)t=0<h.s;else t" +
    "hrow Error(\"Predicate.evaluate returned an unexpected type.\");if(!" +
    "t){t=e;h=t.i;var p=t.a;if(!p)throw Error(\"Next must be called at l" +
    "east once before remove.\");var m=p.b,p=p.a;m?m.a=p:h.a=p;p?p.b=m:h" +
    ".b=m;h.s--;t.a=null}}return b}\nLb.prototype.toString=function(){re" +
    "turn ra(this.a,function(a,b){return a+J(b)},\"Predicates:\")};/*\n\n T" +
    "he MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (" +
    "c) 2012 Google Inc.\n\n Permission is hereby granted, free of charge" +
    ", to any person obtaining a copy\n of this software and associated " +
    "documentation files (the \"Software\"), to\n deal in the Software wit" +
    "hout restriction, including without limitation the\n rights to use," +
    " copy, modify, merge, publish, distribute, sublicense, and/or\n sel" +
    "l copies of the Software, and to permit persons to whom the Softwa" +
    "re is\n furnished to do so, subject to the following conditions:\n\n " +
    "The above copyright notice and this permission notice shall be inc" +
    "luded in\n all copies or substantial portions of the Software.\n\n TH" +
    "E SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPR" +
    "ESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF ME" +
    "RCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEME" +
    "NT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE " +
    "FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION O" +
    "F CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECT" +
    "ION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWAR" +
    "E.\n*/\nfunction P(a,b,c,d){I.call(this,4);this.c=a;this.w=b;this.j=" +
    "c||new Lb([]);this.B=!!d;b=this.j;b=0<b.a.length?b.a[0].i:null;a.b" +
    "&&b&&(this.i={name:b.name,A:b.A});a:{a=this.j;for(b=0;b<a.a.length" +
    ";b++)if(c=a.a[b],c.h||1==c.m||0==c.m){a=!0;break a}a=!1}this.h=a}v" +
    "(P,I);\nP.prototype.a=function(a){var b=a.a,c=null,c=this.i,d=null," +
    "e=null,f=0;c&&(d=c.name,e=c.A?L(c.A,a):null,f=1);if(this.B)if(this" +
    ".h||this.c!=Mb)if(a=G((new P(Nb,new F(\"node\"))).a(a)),b=H(a))for(c" +
    "=this.u(b,d,e,f);null!=(b=H(a));)c=fb(c,this.u(b,d,e,f));else c=ne" +
    "w D;else c=ab(this.w,b,d,e),c=wb(this.j,c,f);else c=this.u(a.a,d,e" +
    ",f);return c};P.prototype.u=function(a,b,c,d){a=this.c.i(this.w,a," +
    "b,c);return a=wb(this.j,a,d)};\nP.prototype.toString=function(){var" +
    " a;a=\"Step:\"+J(\"Operator: \"+(this.B?\"//\":\"/\"));this.c.o&&(a+=J(\"Ax" +
    "is: \"+this.c));a+=J(this.w);if(this.j.a.length){var b=ra(this.j.a," +
    "function(a,b){return a+J(b)},\"Predicates:\");a+=J(b)}return a};func" +
    "tion Ob(a,b,c,d){this.o=a;this.i=b;this.a=c;this.b=d}Ob.prototype." +
    "toString=g(\"o\");var Pb={};function Q(a,b,c,d){if(Pb.hasOwnProperty" +
    "(a))throw Error(\"Axis already created: \"+a);b=new Ob(a,b,c,!!d);re" +
    "turn Pb[a]=b}\nQ(\"ancestor\",function(a,b){for(var c=new D,d=b;d=d.p" +
    "arentNode;)a.a(d)&&gb(c,d);return c},!0);Q(\"ancestor-or-self\",func" +
    "tion(a,b){var c=new D,d=b;do a.a(d)&&gb(c,d);while(d=d.parentNode)" +
    ";return c},!0);var Fb=Q(\"attribute\",function(a,b){var c=new D,d=a." +
    "i(),e=b.attributes;if(e)if(a instanceof F&&null===a.b||\"*\"==d)for(" +
    "var d=0,f;f=e[d];d++)E(c,f);else(f=e.getNamedItem(d))&&E(c,f);retu" +
    "rn c},!1),Mb=Q(\"child\",function(a,b,c,d,e){return db.call(null,a,b" +
    ",u(c)?c:null,u(d)?d:null,e||new D)},!1,!0);\nQ(\"descendant\",ab,!1,!" +
    "0);var Nb=Q(\"descendant-or-self\",function(a,b,c,d){var e=new D;$a(" +
    "b,c,d)&&a.a(b)&&E(e,b);return ab(a,b,c,d,e)},!1,!0),Jb=Q(\"followin" +
    "g\",function(a,b,c,d){var e=new D;do for(var f=b;f=f.nextSibling;)$" +
    "a(f,c,d)&&a.a(f)&&E(e,f),e=ab(a,f,c,d,e);while(b=b.parentNode);ret" +
    "urn e},!1,!0);Q(\"following-sibling\",function(a,b){for(var c=new D," +
    "d=b;d=d.nextSibling;)a.a(d)&&E(c,d);return c},!1);Q(\"namespace\",fu" +
    "nction(){return new D},!1);\nvar Qb=Q(\"parent\",function(a,b){var c=" +
    "new D;if(9==b.nodeType)return c;if(2==b.nodeType)return E(c,b.owne" +
    "rElement),c;var d=b.parentNode;a.a(d)&&E(c,d);return c},!1),Kb=Q(\"" +
    "preceding\",function(a,b,c,d){var e=new D,f=[];do f.unshift(b);whil" +
    "e(b=b.parentNode);for(var h=1,q=f.length;h<q;h++){var t=[];for(b=f" +
    "[h];b=b.previousSibling;)t.unshift(b);for(var p=0,m=t.length;p<m;p" +
    "++)b=t[p],$a(b,c,d)&&a.a(b)&&E(e,b),e=ab(a,b,c,d,e)}return e},!0,!" +
    "0);\nQ(\"preceding-sibling\",function(a,b){for(var c=new D,d=b;d=d.pr" +
    "eviousSibling;)a.a(d)&&gb(c,d);return c},!0);var Sb=Q(\"self\",funct" +
    "ion(a,b){var c=new D;a.a(b)&&E(c,b);return c},!1);/*\n\n The MIT Lic" +
    "ense\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Go" +
    "ogle Inc.\n\n Permission is hereby granted, free of charge, to any p" +
    "erson obtaining a copy\n of this software and associated documentat" +
    "ion files (the \"Software\"), to\n deal in the Software without restr" +
    "iction, including without limitation the\n rights to use, copy, mod" +
    "ify, merge, publish, distribute, sublicense, and/or\n sell copies o" +
    "f the Software, and to permit persons to whom the Software is\n fur" +
    "nished to do so, subject to the following conditions:\n\n The above " +
    "copyright notice and this permission notice shall be included in\n " +
    "all copies or substantial portions of the Software.\n\n THE SOFTWARE" +
    " IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IM" +
    "PLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABIL" +
    "ITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO " +
    "EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CL" +
    "AIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT" +
    ", TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH T" +
    "HE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunc" +
    "tion Tb(a){I.call(this,1);this.c=a;this.h=a.h;this.b=a.b}v(Tb,I);T" +
    "b.prototype.a=function(a){return-K(this.c,a)};Tb.prototype.toStrin" +
    "g=function(){return\"Unary Expression: -\"+J(this.c)};/*\n\n The MIT L" +
    "icense\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 " +
    "Google Inc.\n\n Permission is hereby granted, free of charge, to any" +
    " person obtaining a copy\n of this software and associated document" +
    "ation files (the \"Software\"), to\n deal in the Software without res" +
    "triction, including without limitation the\n rights to use, copy, m" +
    "odify, merge, publish, distribute, sublicense, and/or\n sell copies" +
    " of the Software, and to permit persons to whom the Software is\n f" +
    "urnished to do so, subject to the following conditions:\n\n The abov" +
    "e copyright notice and this permission notice shall be included in" +
    "\n all copies or substantial portions of the Software.\n\n THE SOFTWA" +
    "RE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n " +
    "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTAB" +
    "ILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN N" +
    "O EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY " +
    "CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRA" +
    "CT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH" +
    " THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfu" +
    "nction Ub(a){I.call(this,4);this.c=a;nb(this,sa(this.c,function(a)" +
    "{return a.h}));ob(this,sa(this.c,function(a){return a.b}))}v(Ub,I)" +
    ";Ub.prototype.a=function(a){var b=new D;w(this.c,function(c){c=c.a" +
    "(a);if(!(c instanceof D))throw Error(\"Path expression must evaluat" +
    "e to NodeSet.\");b=fb(b,c)});return b};Ub.prototype.toString=functi" +
    "on(){return ra(this.c,function(a,b){return a+J(b)},\"Union Expressi" +
    "on:\")};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc." +
    "\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted, f" +
    "ree of charge, to any person obtaining a copy\n of this software an" +
    "d associated documentation files (the \"Software\"), to\n deal in the" +
    " Software without restriction, including without limitation the\n r" +
    "ights to use, copy, modify, merge, publish, distribute, sublicense" +
    ", and/or\n sell copies of the Software, and to permit persons to wh" +
    "om the Software is\n furnished to do so, subject to the following c" +
    "onditions:\n\n The above copyright notice and this permission notice" +
    " shall be included in\n all copies or substantial portions of the S" +
    "oftware.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF A" +
    "NY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WAR" +
    "RANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND " +
    "NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDE" +
    "RS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER I" +
    "N AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF " +
    "OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n I" +
    "N THE SOFTWARE.\n*/\nfunction Vb(a,b){this.a=a;this.b=b}function Wb(" +
    "a){for(var b,c=[];;){R(a,\"Missing right hand side of binary expres" +
    "sion.\");b=Xb(a);var d=A(a.a);if(!d)break;var e=(d=ub[d]||null)&&d." +
    "H;if(!e){a.a.a--;break}for(;c.length&&e<=c[c.length-1].H;)b=new qb" +
    "(c.pop(),c.pop(),b);c.push(b,d)}for(;c.length;)b=new qb(c.pop(),c." +
    "pop(),b);return b}function R(a,b){if(Za(a.a))throw Error(b);}funct" +
    "ion Yb(a,b){var c=A(a.a);if(c!=b)throw Error(\"Bad token, expected:" +
    " \"+b+\" got: \"+c);}\nfunction Zb(a){a=A(a.a);if(\")\"!=a)throw Error(\"" +
    "Bad token: \"+a);}function $b(a){a=A(a.a);if(2>a.length)throw Error" +
    "(\"Unclosed literal string\");return new Bb(a)}function ac(a){var b=" +
    "A(a.a),c=b.indexOf(\":\");if(-1==c)return new Cb(b);var d=b.substrin" +
    "g(0,c);a=a.b(d);if(!a)throw Error(\"Namespace prefix not declared: " +
    "\"+d);b=b.substr(c+1);return new Cb(b,a)}\nfunction bc(a){var b,c=[]" +
    ",d;if(Ib(z(a.a))){b=A(a.a);d=z(a.a);if(\"/\"==b&&(Za(a.a)||\".\"!=d&&\""
  )
      .append(
    "..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?![0-9])[\\w]/.test(d)))return new Gb;d=" +
    "new Gb;R(a,\"Missing next location step.\");b=cc(a,b);c.push(b)}else" +
    "{a:{b=z(a.a);d=b.charAt(0);switch(d){case \"$\":throw Error(\"Variabl" +
    "e reference not allowed in HTML XPath\");case \"(\":A(a.a);b=Wb(a);R(" +
    "a,'unclosed \"(\"');Yb(a,\")\");break;case '\"':case \"'\":b=$b(a);break;" +
    "default:if(isNaN(+b))if(!Ab(b)&&/(?![0-9])[\\w]/.test(d)&&\"(\"==z(a." +
    "a,1)){b=A(a.a);\nb=zb[b]||null;A(a.a);for(d=[];\")\"!=z(a.a);){R(a,\"M" +
    "issing function argument list.\");d.push(Wb(a));if(\",\"!=z(a.a))brea" +
    "k;A(a.a)}R(a,\"Unclosed function argument list.\");Zb(a);b=new xb(b," +
    "d)}else{b=null;break a}else b=new Db(+A(a.a))}\"[\"==z(a.a)&&(d=new " +
    "Lb(dc(a)),b=new vb(b,d))}if(b)if(Ib(z(a.a)))d=b;else return b;else" +
    " b=cc(a,\"/\"),d=new Hb,c.push(b)}for(;Ib(z(a.a));)b=A(a.a),R(a,\"Mis" +
    "sing next location step.\"),b=cc(a,b),c.push(b);return new Eb(d,c)}" +
    "\nfunction cc(a,b){var c,d,e;if(\"/\"!=b&&\"//\"!=b)throw Error('Step o" +
    "p should be \"/\" or \"//\"');if(\".\"==z(a.a))return d=new P(Sb,new F(\"" +
    "node\")),A(a.a),d;if(\"..\"==z(a.a))return d=new P(Qb,new F(\"node\"))," +
    "A(a.a),d;var f;if(\"@\"==z(a.a))f=Fb,A(a.a),R(a,\"Missing attribute n" +
    "ame\");else if(\"::\"==z(a.a,1)){if(!/(?![0-9])[\\w]/.test(z(a.a).char" +
    "At(0)))throw Error(\"Bad token: \"+A(a.a));c=A(a.a);f=Pb[c]||null;if" +
    "(!f)throw Error(\"No axis with name: \"+c);A(a.a);R(a,\"Missing node " +
    "name\")}else f=Mb;c=z(a.a);if(/(?![0-9])[\\w]/.test(c.charAt(0)))if(" +
    "\"(\"==\nz(a.a,1)){if(!Ab(c))throw Error(\"Invalid node type: \"+c);c=A" +
    "(a.a);if(!Ab(c))throw Error(\"Invalid type name: \"+c);Yb(a,\"(\");R(a" +
    ",\"Bad nodetype\");e=z(a.a).charAt(0);var h=null;if('\"'==e||\"'\"==e)h" +
    "=$b(a);R(a,\"Bad nodetype\");Zb(a);c=new F(c,h)}else c=ac(a);else if" +
    "(\"*\"==c)c=ac(a);else throw Error(\"Bad token: \"+A(a.a));e=new Lb(dc" +
    "(a),f.a);return d||new P(f,c,e,\"//\"==b)}\nfunction dc(a){for(var b=" +
    "[];\"[\"==z(a.a);){A(a.a);R(a,\"Missing predicate expression.\");var c" +
    "=Wb(a);b.push(c);R(a,\"Unclosed predicate expression.\");Yb(a,\"]\")}r" +
    "eturn b}function Xb(a){if(\"-\"==z(a.a))return A(a.a),new Tb(Xb(a));" +
    "var b=bc(a);if(\"|\"!=z(a.a))a=b;else{for(b=[b];\"|\"==A(a.a);)R(a,\"Mi" +
    "ssing next union location path.\"),b.push(bc(a));a.a.a--;a=new Ub(b" +
    ")}return a};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs," +
    " Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby grant" +
    "ed, free of charge, to any person obtaining a copy\n of this softwa" +
    "re and associated documentation files (the \"Software\"), to\n deal i" +
    "n the Software without restriction, including without limitation t" +
    "he\n rights to use, copy, modify, merge, publish, distribute, subli" +
    "cense, and/or\n sell copies of the Software, and to permit persons " +
    "to whom the Software is\n furnished to do so, subject to the follow" +
    "ing conditions:\n\n The above copyright notice and this permission n" +
    "otice shall be included in\n all copies or substantial portions of " +
    "the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY" +
    " OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO TH" +
    "E WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE" +
    " AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT " +
    "HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHET" +
    "HER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OU" +
    "T OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALIN" +
    "GS\n IN THE SOFTWARE.\n*/\nfunction ec(a,b){if(!a.length)throw Error(" +
    "\"Empty XPath expression.\");var c=Wa(a);if(Za(c))throw Error(\"Inval" +
    "id XPath expression.\");b?da(b)||(b=ga(b.lookupNamespaceURI,b)):b=k" +
    "(null);var d=Wb(new Vb(c,b));if(!Za(c))throw Error(\"Bad token: \"+A" +
    "(c));this.evaluate=function(a,b){var c=d.a(new Ua(a));return new S" +
    "(c,b)}}\nfunction S(a,b){if(0==b)if(a instanceof D)b=4;else if(\"str" +
    "ing\"==typeof a)b=2;else if(\"number\"==typeof a)b=1;else if(\"boolean" +
    "\"==typeof a)b=3;else throw Error(\"Unexpected evaluation result.\");" +
    "if(2!=b&&1!=b&&3!=b&&!(a instanceof D))throw Error(\"value could no" +
    "t be converted to the specified type\");this.resultType=b;var c;swi" +
    "tch(b){case 2:this.stringValue=a instanceof D?ib(a):\"\"+a;break;cas" +
    "e 1:this.numberValue=a instanceof D?+ib(a):+a;break;case 3:this.bo" +
    "oleanValue=a instanceof D?0<a.s:!!a;break;case 4:case 5:case 6:cas" +
    "e 7:var d=\nG(a);c=[];for(var e=H(d);e;e=H(d))c.push(e);this.snapsh" +
    "otLength=a.s;this.invalidIteratorState=!1;break;case 8:case 9:this" +
    ".singleNodeValue=hb(a);break;default:throw Error(\"Unknown XPathRes" +
    "ult type.\");}var f=0;this.iterateNext=function(){if(4!=b&&5!=b)thr" +
    "ow Error(\"iterateNext called with wrong result type\");return f>=c." +
    "length?null:c[f++]};this.snapshotItem=function(a){if(6!=b&&7!=b)th" +
    "row Error(\"snapshotItem called with wrong result type\");return a>=" +
    "c.length||0>a?null:c[a]}}S.ANY_TYPE=0;\nS.NUMBER_TYPE=1;S.STRING_TY" +
    "PE=2;S.BOOLEAN_TYPE=3;S.UNORDERED_NODE_ITERATOR_TYPE=4;S.ORDERED_N" +
    "ODE_ITERATOR_TYPE=5;S.UNORDERED_NODE_SNAPSHOT_TYPE=6;S.ORDERED_NOD" +
    "E_SNAPSHOT_TYPE=7;S.ANY_UNORDERED_NODE_TYPE=8;S.FIRST_ORDERED_NODE" +
    "_TYPE=9;function fc(a){this.lookupNamespaceURI=kb(a)}\nfunction gc(" +
    "a){a=a||n;var b=a.document;b.evaluate||(a.XPathResult=S,b.evaluate" +
    "=function(a,b,e,f){return(new ec(a,e)).evaluate(b,f)},b.createExpr" +
    "ession=function(a,b){return new ec(a,b)},b.createNSResolver=functi" +
    "on(a){return new fc(a)})}aa(\"wgxpath.install\",gc);/*xxx_rpl_lic*/\n" +
    "var T={};T.D=function(){var a={V:\"http://www.w3.org/2000/svg\"};ret" +
    "urn function(b){return a[b]||null}}();\nT.u=function(a,b,c){var d=x" +
    "(a);if(!d.documentElement)return null;gc(d?d.parentWindow||d.defau" +
    "ltView:window);try{for(var e=d.createNSResolver?d.createNSResolver" +
    "(d.documentElement):T.D,f={},h=d.getElementsByTagName(\"*\"),q=0;q<h" +
    ".length;++q){var t=h[q],p=t.namespaceURI;if(!f[p]){var m=t.lookupP" +
    "refix(p);if(!m){var C=p.match(\".*/(\\\\w+)/?$\");C?m=C[1]:m=\"xhtml\"}f" +
    "[p]=m}}var N={},V;for(V in f)N[f[V]]=V;e=function(a){return N[a]||" +
    "null};try{return d.evaluate(b,a,e,c,null)}catch(Rb){if(\"TypeError\"" +
    "===Rb.name)return e=\nd.createNSResolver?d.createNSResolver(d.docum" +
    "entElement):T.D,d.evaluate(b,a,e,c,null);throw Rb;}}catch(Bc){thro" +
    "w new Oa(32,\"Unable to locate an element with the xpath expression" +
    " \"+b+\" because of the following error:\\n\"+Bc);}};T.F=function(a,b)" +
    "{if(!a||1!=a.nodeType)throw new Oa(32,'The result of the xpath exp" +
    "ression \"'+b+'\" is: '+a+\". It should be an element.\");};\nT.O=funct" +
    "ion(a,b){var c=function(){var c=T.u(b,a,9);return c?c.singleNodeVa" +
    "lue||null:b.selectSingleNode?(c=x(b),c.setProperty&&c.setProperty(" +
    "\"SelectionLanguage\",\"XPath\"),b.selectSingleNode(a)):null}();null==" +
    "=c||T.F(c,a);return c};\nT.T=function(a,b){var c=function(){var c=T" +
    ".u(b,a,7);if(c){for(var e=c.snapshotLength,f=[],h=0;h<e;++h)f.push" +
    "(c.snapshotItem(h));return f}return b.selectNodes?(c=x(b),c.setPro" +
    "perty&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b.selectNodes(a)" +
    "):[]}();w(c,function(b){T.F(b,a)});return c};var hc={aliceblue:\"#f" +
    "0f8ff\",antiquewhite:\"#faebd7\",aqua:\"#00ffff\",aquamarine:\"#7fffd4\"," +
    "azure:\"#f0ffff\",beige:\"#f5f5dc\",bisque:\"#ffe4c4\",black:\"#000000\",b" +
    "lanchedalmond:\"#ffebcd\",blue:\"#0000ff\",blueviolet:\"#8a2be2\",brown:" +
    "\"#a52a2a\",burlywood:\"#deb887\",cadetblue:\"#5f9ea0\",chartreuse:\"#7ff" +
    "f00\",chocolate:\"#d2691e\",coral:\"#ff7f50\",cornflowerblue:\"#6495ed\"," +
    "cornsilk:\"#fff8dc\",crimson:\"#dc143c\",cyan:\"#00ffff\",darkblue:\"#000" +
    "08b\",darkcyan:\"#008b8b\",darkgoldenrod:\"#b8860b\",darkgray:\"#a9a9a9\"" +
    ",darkgreen:\"#006400\",\ndarkgrey:\"#a9a9a9\",darkkhaki:\"#bdb76b\",darkm" +
    "agenta:\"#8b008b\",darkolivegreen:\"#556b2f\",darkorange:\"#ff8c00\",dar" +
    "korchid:\"#9932cc\",darkred:\"#8b0000\",darksalmon:\"#e9967a\",darkseagr" +
    "een:\"#8fbc8f\",darkslateblue:\"#483d8b\",darkslategray:\"#2f4f4f\",dark" +
    "slategrey:\"#2f4f4f\",darkturquoise:\"#00ced1\",darkviolet:\"#9400d3\",d" +
    "eeppink:\"#ff1493\",deepskyblue:\"#00bfff\",dimgray:\"#696969\",dimgrey:" +
    "\"#696969\",dodgerblue:\"#1e90ff\",firebrick:\"#b22222\",floralwhite:\"#f" +
    "ffaf0\",forestgreen:\"#228b22\",fuchsia:\"#ff00ff\",gainsboro:\"#dcdcdc\"" +
    ",\nghostwhite:\"#f8f8ff\",gold:\"#ffd700\",goldenrod:\"#daa520\",gray:\"#8" +
    "08080\",green:\"#008000\",greenyellow:\"#adff2f\",grey:\"#808080\",honeyd" +
    "ew:\"#f0fff0\",hotpink:\"#ff69b4\",indianred:\"#cd5c5c\",indigo:\"#4b0082" +
    "\",ivory:\"#fffff0\",khaki:\"#f0e68c\",lavender:\"#e6e6fa\",lavenderblush" +
    ":\"#fff0f5\",lawngreen:\"#7cfc00\",lemonchiffon:\"#fffacd\",lightblue:\"#" +
    "add8e6\",lightcoral:\"#f08080\",lightcyan:\"#e0ffff\",lightgoldenrodyel" +
    "low:\"#fafad2\",lightgray:\"#d3d3d3\",lightgreen:\"#90ee90\",lightgrey:\"" +
    "#d3d3d3\",lightpink:\"#ffb6c1\",lightsalmon:\"#ffa07a\",\nlightseagreen:" +
    "\"#20b2aa\",lightskyblue:\"#87cefa\",lightslategray:\"#778899\",lightsla" +
    "tegrey:\"#778899\",lightsteelblue:\"#b0c4de\",lightyellow:\"#ffffe0\",li" +
    "me:\"#00ff00\",limegreen:\"#32cd32\",linen:\"#faf0e6\",magenta:\"#ff00ff\"" +
    ",maroon:\"#800000\",mediumaquamarine:\"#66cdaa\",mediumblue:\"#0000cd\"," +
    "mediumorchid:\"#ba55d3\",mediumpurple:\"#9370db\",mediumseagreen:\"#3cb" +
    "371\",mediumslateblue:\"#7b68ee\",mediumspringgreen:\"#00fa9a\",mediumt" +
    "urquoise:\"#48d1cc\",mediumvioletred:\"#c71585\",midnightblue:\"#191970" +
    "\",mintcream:\"#f5fffa\",mistyrose:\"#ffe4e1\",\nmoccasin:\"#ffe4b5\",nava" +
    "jowhite:\"#ffdead\",navy:\"#000080\",oldlace:\"#fdf5e6\",olive:\"#808000\"" +
    ",olivedrab:\"#6b8e23\",orange:\"#ffa500\",orangered:\"#ff4500\",orchid:\"" +
    "#da70d6\",palegoldenrod:\"#eee8aa\",palegreen:\"#98fb98\",paleturquoise" +
    ":\"#afeeee\",palevioletred:\"#db7093\",papayawhip:\"#ffefd5\",peachpuff:" +
    "\"#ffdab9\",peru:\"#cd853f\",pink:\"#ffc0cb\",plum:\"#dda0dd\",powderblue:" +
    "\"#b0e0e6\",purple:\"#800080\",red:\"#ff0000\",rosybrown:\"#bc8f8f\",royal" +
    "blue:\"#4169e1\",saddlebrown:\"#8b4513\",salmon:\"#fa8072\",sandybrown:\"" +
    "#f4a460\",seagreen:\"#2e8b57\",\nseashell:\"#fff5ee\",sienna:\"#a0522d\",s" +
    "ilver:\"#c0c0c0\",skyblue:\"#87ceeb\",slateblue:\"#6a5acd\",slategray:\"#" +
    "708090\",slategrey:\"#708090\",snow:\"#fffafa\",springgreen:\"#00ff7f\",s" +
    "teelblue:\"#4682b4\",tan:\"#d2b48c\",teal:\"#008080\",thistle:\"#d8bfd8\"," +
    "tomato:\"#ff6347\",turquoise:\"#40e0d0\",violet:\"#ee82ee\",wheat:\"#f5de" +
    "b3\",white:\"#ffffff\",whitesmoke:\"#f5f5f5\",yellow:\"#ffff00\",yellowgr" +
    "een:\"#9acd32\"};/*xxx_rpl_lic*/\nvar ic=\"backgroundColor borderTopCo" +
    "lor borderRightColor borderBottomColor borderLeftColor color outli" +
    "neColor\".split(\" \"),jc=/#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])/," +
    "kc=/^#(?:[0-9a-f]{3}){1,2}$/i,lc=/^(?:rgba)?\\((\\d{1,3}),\\s?(\\d{1,3" +
    "}),\\s?(\\d{1,3}),\\s?(0|1|0\\.\\d*)\\)$/i,mc=/^(?:rgb)?\\((0|[1-9]\\d{0,2" +
    "}),\\s?(0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2})\\)$/i;/*xxx_rpl_lic*/\nfu" +
    "nction U(a,b){return!!a&&1==a.nodeType&&(!b||a.tagName.toUpperCase" +
    "()==b)}var nc=\"BUTTON INPUT OPTGROUP OPTION SELECT TEXTAREA\".split" +
    "(\" \");\nfunction oc(a){var b=a.tagName.toUpperCase();return 0<=qa(n" +
    "c,b)?a.disabled?!1:a.parentNode&&1==a.parentNode.nodeType&&\"OPTGRO" +
    "UP\"==b||\"OPTION\"==b?oc(a.parentNode):!Ja(a,function(a){var b=a.par" +
    "entNode;if(b&&U(b,\"FIELDSET\")&&b.disabled){if(!U(a,\"LEGEND\"))retur" +
    "n!0;for(;a=void 0!=a.previousElementSibling?a.previousElementSibli" +
    "ng:Ea(a.previousSibling);)if(U(a,\"LEGEND\"))return!0}return!1},!0):" +
    "!0}var pc=\"text search tel url email password number\".split(\" \");\n" +
    "function qc(a){function b(a){return\"inherit\"==a.contentEditable?(a" +
    "=rc(a))?b(a):!1:\"true\"==a.contentEditable}return r(a.contentEditab" +
    "le)?r(a.isContentEditable)?a.isContentEditable:b(a):!1}function rc" +
    "(a){for(a=a.parentNode;a&&1!=a.nodeType&&9!=a.nodeType&&11!=a.node" +
    "Type;)a=a.parentNode;return U(a)?a:null}\nfunction W(a,b){var c=ma(" +
    "b);if(\"float\"==c||\"cssFloat\"==c||\"styleFloat\"==c)c=\"cssFloat\";var " +
    "d;a:{d=c;var e=x(a);if(e.defaultView&&e.defaultView.getComputedSty" +
    "le&&(e=e.defaultView.getComputedStyle(a,null))){d=e[d]||e.getPrope" +
    "rtyValue(d)||\"\";break a}d=\"\"}d=d||sc(a,c);if(null===d)d=null;else " +
    "if(0<=qa(ic,c)){b:{var f=d.match(lc);if(f){var c=Number(f[1]),e=Nu" +
    "mber(f[2]),h=Number(f[3]),f=Number(f[4]);if(0<=c&&255>=c&&0<=e&&25" +
    "5>=e&&0<=h&&255>=h&&0<=f&&1>=f){c=[c,e,h,f];break b}}c=null}if(!c)" +
    "b:{if(h=d.match(mc))if(c=\nNumber(h[1]),e=Number(h[2]),h=Number(h[3" +
    "]),0<=c&&255>=c&&0<=e&&255>=e&&0<=h&&255>=h){c=[c,e,h,1];break b}c" +
    "=null}if(!c)b:{c=d.toLowerCase();e=hc[c.toLowerCase()];if(!e&&(e=\"" +
    "#\"==c.charAt(0)?c:\"#\"+c,4==e.length&&(e=e.replace(jc,\"#$1$1$2$2$3$" +
    "3\")),!kc.test(e))){c=null;break b}c=[parseInt(e.substr(1,2),16),pa" +
    "rseInt(e.substr(3,2),16),parseInt(e.substr(5,2),16),1]}d=c?\"rgba(\"" +
    "+c.join(\", \")+\")\":d}return d}\nfunction sc(a,b){var c=a.currentStyl" +
    "e||a.style,d=c[b];!r(d)&&da(c.getPropertyValue)&&(d=c.getPropertyV" +
    "alue(b));return\"inherit\"!=d?r(d)?d:null:(c=rc(a))?sc(c,b):null}\nfu" +
    "nction tc(a,b){function c(a){if(\"none\"==W(a,\"display\"))return!1;a=" +
    "rc(a);return!a||c(a)}function d(a){var b=uc(a);return 0<b.height&&" +
    "0<b.width?!0:U(a,\"PATH\")&&(0<b.height||0<b.width)?(a=W(a,\"stroke-w" +
    "idth\"),!!a&&0<parseInt(a,10)):\"hidden\"!=W(a,\"overflow\")&&sa(a.chil" +
    "dNodes,function(a){return 3==a.nodeType||U(a)&&d(a)})}function e(a" +
    "){return\"hidden\"==vc(a)&&ta(a.childNodes,function(a){return!U(a)||" +
    "e(a)})}if(!U(a))throw Error(\"Argument to isShown must be of type E" +
    "lement\");if(U(a,\"BODY\"))return!0;if(U(a,\n\"OPTION\")||U(a,\"OPTGROUP\"" +
    ")){var f=Ja(a,function(a){return U(a,\"SELECT\")});return!!f&&tc(f,!" +
    "0)}return(f=wc(a))?!!f.G&&0<f.rect.width&&0<f.rect.height&&tc(f.G," +
    "b):U(a,\"INPUT\")&&\"hidden\"==a.type.toLowerCase()||U(a,\"NOSCRIPT\")||" +
    "\"hidden\"==W(a,\"visibility\")||!c(a)||!b&&0==xc(a)||!d(a)?!1:!e(a)}\n" +
    "function vc(a){function b(a){function b(a){return a==h?!0:0==W(a,\"" +
    "display\").lastIndexOf(\"inline\",0)||\"absolute\"==c&&\"static\"==W(a,\"p" +
    "osition\")?!1:!0}var c=W(a,\"position\");if(\"fixed\"==c)return p=!0,a=" +
    "=h?null:h;for(a=rc(a);a&&!b(a);)a=rc(a);return a}function c(a){var" +
    " b=a;if(\"visible\"==t)if(a==h&&q)b=q;else if(a==q)return{x:\"visible" +
    "\",y:\"visible\"};b={x:W(b,\"overflow-x\"),y:W(b,\"overflow-y\")};a==h&&(" +
    "b.x=\"visible\"==b.x?\"auto\":b.x,b.y=\"visible\"==b.y?\"auto\":b.y);retur" +
    "n b}function d(a){if(a==h){var b=(new La(f)).a;\na=b.body||b.docume" +
    "ntElement;b=b.parentWindow||b.defaultView;a=new wa(b.pageXOffset||" +
    "a.scrollLeft,b.pageYOffset||a.scrollTop)}else a=new wa(a.scrollLef" +
    "t,a.scrollTop);return a}var e=yc(a),f=x(a),h=f.documentElement,q=f" +
    ".body,t=W(h,\"overflow\"),p;for(a=b(a);a;a=b(a)){var m=c(a);if(\"visi" +
    "ble\"!=m.x||\"visible\"!=m.y){var C=uc(a);if(0==C.width||0==C.height)" +
    "return\"hidden\";var N=e.right<C.left,V=e.bottom<C.top;if(N&&\"hidden" +
    "\"==m.x||V&&\"hidden\"==m.y)return\"hidden\";if(N&&\"visible\"!=m.x||V&&\"" +
    "visible\"!=m.y){N=d(a);\nV=e.bottom<C.top-N.y;if(e.right<C.left-N.x&" +
    "&\"visible\"!=m.x||V&&\"visible\"!=m.x)return\"hidden\";e=vc(a);return\"h" +
    "idden\"==e?\"hidden\":\"scroll\"}N=e.left>=C.left+C.width;C=e.top>=C.to" +
    "p+C.height;if(N&&\"hidden\"==m.x||C&&\"hidden\"==m.y)return\"hidden\";if" +
    "(N&&\"visible\"!=m.x||C&&\"visible\"!=m.y){if(p&&(m=d(a),e.left>=h.scr" +
    "ollWidth-m.x||e.right>=h.scrollHeight-m.y))return\"hidden\";e=vc(a);" +
    "return\"hidden\"==e?\"hidden\":\"scroll\"}}}return\"none\"}\nfunction uc(a)" +
    "{var b=wc(a);if(b)return b.rect;if(U(a,\"HTML\"))return a=x(a),a=((a" +
    "?a.parentWindow||a.defaultView:window)||window).document,a=\"CSS1Co" +
    "mpat\"==a.compatMode?a.documentElement:a.body,a=new ya(a.clientWidt" +
    "h,a.clientHeight),new y(0,0,a.width,a.height);var c;try{c=a.getBou" +
    "ndingClientRect()}catch(d){return new y(0,0,0,0)}return new y(c.le" +
    "ft,c.top,c.right-c.left,c.bottom-c.top)}\nfunction wc(a){var b=U(a," +
    "\"MAP\");if(!b&&!U(a,\"AREA\"))return null;var c=b?a:U(a.parentNode,\"M" +
    "AP\")?a.parentNode:null,d=null,e=null;if(c&&c.name&&(d=x(c),d=T.O('" +
    "/descendant::*[@usemap = \"#'+c.name+'\"]',d))&&(e=uc(d),!b&&\"defaul" +
    "t\"!=a.shape.toLowerCase())){var f=zc(a);a=Math.min(Math.max(f.left" +
    ",0),e.width);b=Math.min(Math.max(f.top,0),e.height);c=Math.min(f.w" +
    "idth,e.width-a);f=Math.min(f.height,e.height-b);e=new y(a+e.left,b" +
    "+e.top,c,f)}return{G:d,rect:e||new y(0,0,0,0)}}\nfunction zc(a){var" +
    " b=a.shape.toLowerCase();a=a.coords.split(\",\");if(\"rect\"==b&&4==a." +
    "length){var b=a[0],c=a[1];return new y(b,c,a[2]-b,a[3]-c)}if(\"circ" +
    "le\"==b&&3==a.length)return b=a[2],new y(a[0]-b,a[1]-b,2*b,2*b);if(" +
    "\"poly\"==b&&2<a.length){for(var b=a[0],c=a[1],d=b,e=c,f=2;f+1<a.len" +
    "gth;f+=2)b=Math.min(b,a[f]),d=Math.max(d,a[f]),c=Math.min(c,a[f+1]" +
    "),e=Math.max(e,a[f+1]);return new y(b,c,d-b,e-c)}return new y(0,0," +
    "0,0)}function yc(a){a=uc(a);return new Ma(a.top,a.left+a.width,a.t" +
    "op+a.height,a.left)}\nfunction xc(a){var b=1,c=W(a,\"opacity\");c&&(b" +
    "=Number(c));(a=rc(a))&&(b*=xc(a));return b};/*xxx_rpl_lic*/\n/*xxx_" +
    "rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rp" +
    "l_lic*/\nfunction Ac(){this.a=Na.document.documentElement;this.b=nu" +
    "ll;var a=Ka(x(this.a));a&&Cc(this,a)}function Cc(a,b){a.a=b;U(b,\"O" +
    "PTION\")?a.b=Ja(b,function(a){return U(a,\"SELECT\")}):a.b=null};/*xx" +
    "x_rpl_lic*/\nRa(4);function Dc(a,b,c){this.I=a;this.P=b;this.R=c}Dc" +
    ".prototype.toString=g(\"I\");var Ec=new Dc(\"change\",!0,!1);var Fc=\"S" +
    "topIteration\"in n?n.StopIteration:{message:\"StopIteration\",stack:\"" +
    "\"};function Gc(){}Gc.prototype.a=function(){throw Fc;};Gc.prototyp" +
    "e.N=function(){return this};function Hc(a,b){this.v={};this.l=[];t" +
    "his.b=this.a=0;var c=arguments.length;if(1<c){if(c%2)throw Error(\"" +
    "Uneven number of arguments\");for(var d=0;d<c;d+=2)X(this,arguments" +
    "[d],arguments[d+1])}else if(a){var e;if(a instanceof Hc)for(d=Ic(a" +
    "),Jc(a),e=[],c=0;c<a.l.length;c++)e.push(a.v[a.l[c]]);else{var c=[" +
    "],f=0;for(d in a)c[f++]=d;d=c;c=[];f=0;for(e in a)c[f++]=a[e];e=c}" +
    "for(c=0;c<d.length;c++)X(this,d[c],e[c])}}function Ic(a){Jc(a);ret" +
    "urn a.l.concat()}l=Hc.prototype;\nl.clear=function(){this.v={};this" +
    ".b=this.a=this.l.length=0};function Jc(a){if(a.a!=a.l.length){for(" +
    "var b=0,c=0;b<a.l.length;){var d=a.l[b];Object.prototype.hasOwnPro" +
    "perty.call(a.v,d)&&(a.l[c++]=d);b++}a.l.length=c}if(a.a!=a.l.lengt" +
    "h){for(var e={},c=b=0;b<a.l.length;)d=a.l[b],Object.prototype.hasO" +
    "wnProperty.call(e,d)||(a.l[c++]=d,e[d]=1),b++;a.l.length=c}}l.get=" +
    "function(a,b){return Object.prototype.hasOwnProperty.call(this.v,a" +
    ")?this.v[a]:b};\nfunction X(a,b,c){Object.prototype.hasOwnProperty." +
    "call(a.v,b)||(a.a++,a.l.push(b),a.b++);a.v[b]=c}l.forEach=function" +
    "(a,b){for(var c=Ic(this),d=0;d<c.length;d++){var e=c[d],f=this.get" +
    "(e);a.call(b,f,e,this)}};l.clone=function(){return new Hc(this)};l" +
    ".N=function(a){Jc(this);var b=0,c=this.b,d=this,e=new Gc;e.a=funct" +
    "ion(){if(c!=d.b)throw Error(\"The map has changed since the iterato" +
    "r was created\");if(b>=d.l.length)throw Fc;var e=d.l[b++];return a?" +
    "e:d.v[e]};return e};/*xxx_rpl_lic*/\nvar Kc={};function Y(a,b,c){va" +
    "r d=typeof a;(\"object\"==d&&null!=a||\"function\"==d)&&(a=a.f);a=new " +
    "Lc(a);!b||b in Kc&&!c||(Kc[b]={key:a,shift:!1},c&&(Kc[c]={key:a,sh" +
    "ift:!0}));return a}function Lc(a){this.code=a}Y(8);Y(9);Y(13);var " +
    "Mc=Y(16),Nc=Y(17),Oc=Y(18);Y(19);Y(20);Y(27);Y(32,\" \");Y(33);Y(34)" +
    ";Y(35);Y(36);Y(37);Y(38);Y(39);Y(40);Y(44);Y(45);Y(46);Y(48,\"0\",\")" +
    "\");Y(49,\"1\",\"!\");Y(50,\"2\",\"@\");Y(51,\"3\",\"#\");Y(52,\"4\",\"$\");Y(53,\"5" +
    "\",\"%\");Y(54,\"6\",\"^\");Y(55,\"7\",\"&\");Y(56,\"8\",\"*\");Y(57,\"9\",\"(\");Y(6" +
    "5,\"a\",\"A\");\nY(66,\"b\",\"B\");Y(67,\"c\",\"C\");Y(68,\"d\",\"D\");Y(69,\"e\",\"E\"" +
    ");Y(70,\"f\",\"F\");Y(71,\"g\",\"G\");Y(72,\"h\",\"H\");Y(73,\"i\",\"I\");Y(74,\"j\"" +
    ",\"J\");Y(75,\"k\",\"K\");Y(76,\"l\",\"L\");Y(77,\"m\",\"M\");Y(78,\"n\",\"N\");Y(79" +
    ",\"o\",\"O\");Y(80,\"p\",\"P\");Y(81,\"q\",\"Q\");Y(82,\"r\",\"R\");Y(83,\"s\",\"S\");" +
    "Y(84,\"t\",\"T\");Y(85,\"u\",\"U\");Y(86,\"v\",\"V\");Y(87,\"w\",\"W\");Y(88,\"x\",\"" +
    "X\");Y(89,\"y\",\"Y\");Y(90,\"z\",\"Z\");var Pc=Y(Da?{g:91,f:91}:Ca?{g:224," +
    "f:91}:{g:0,f:91});Y(Da?{g:92,f:92}:Ca?{g:224,f:93}:{g:0,f:92});Y(D" +
    "a?{g:93,f:93}:Ca?{g:0,f:0}:{g:93,f:null});\nY({g:96,f:96},\"0\");Y({g" +
    ":97,f:97},\"1\");Y({g:98,f:98},\"2\");Y({g:99,f:99},\"3\");Y({g:100,f:10" +
    "0},\"4\");Y({g:101,f:101},\"5\");Y({g:102,f:102},\"6\");Y({g:103,f:103}," +
    "\"7\");Y({g:104,f:104},\"8\");Y({g:105,f:105},\"9\");Y({g:106,f:106},\"*\"" +
    ");Y({g:107,f:107},\"+\");Y({g:109,f:109},\"-\");Y({g:110,f:110},\".\");Y" +
    "({g:111,f:111},\"/\");Y(144);Y(112);Y(113);Y(114);Y(115);Y(116);Y(11" +
    "7);Y(118);Y(119);Y(120);Y(121);Y(122);Y(123);Y({g:107,f:187},\"=\",\"" +
    "+\");Y(108,\",\");Y({g:109,f:189},\"-\",\"_\");Y(188,\",\",\"<\");Y(190,\".\",\"" +
    ">\");Y(191,\"/\",\"?\");\nY(192,\"`\",\"~\");Y(219,\"[\",\"{\");Y(220,\"\\\\\",\"|\");" +
    "Y(221,\"]\",\"}\");Y({g:59,f:186},\";\",\":\");Y(222,\"'\",'\"');var Qc=new H" +
    "c;X(Qc,1,Mc);X(Qc,2,Nc);X(Qc,4,Oc);X(Qc,8,Pc);(function(a){var b=n" +
    "ew Hc;w(Ic(a),function(c){X(b,a.get(c).code,c)});return b})(Qc);/*" +
    "xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\nfunction Z(){Ac.call" +
    "(this)}v(Z,Ac);Z.h=function(){return Z.a?Z.a:Z.a=new Z};aa(\"_\",fun" +
    "ction(a){if(!tc(a,!0)||!oc(a)||\"none\"==W(a,\"pointer-events\"))throw" +
    " new Oa(12,\"Element is not currently interactable and may not be m" +
    "anipulated\");var b;(b=!(U(a,\"TEXTAREA\")||(U(a,\"INPUT\")?0<=qa(pc,a." +
    "type.toLowerCase()):qc(a))))||(b=a.readOnly);if(b)throw new Oa(12," +
    "\"Element must be user-editable in order to clear it.\");b=Z.h();Cc(" +
    "b,a);b=b.b||b.a;var c=Ka(x(b));if(b!=c){if(c&&da(c.blur)&&!U(c,\"BO" +
    "DY\"))try{c.blur()}catch(d){throw d;}da(b.focus)&&b.focus()}a.value" +
    "&&(a.value=\"\",b=x(a).createEvent(\"HTMLEvents\"),\nb.initEvent(Ec.I,E" +
    "c.P,Ec.R),\"isTrusted\"in b||(b.isTrusted=!1),a.dispatchEvent(b));qc" +
    "(a)&&(a.innerHTML=\" \")});;return this._.apply(null,arguments);}).a" +
    "pply({navigator:typeof window!=\"undefined\"?window.navigator:null}," +
    "arguments);}\n"
  )
  .toString();
  static final String CLEAR_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String CLEAR_ANDROID_original() {
    return CLEAR_ANDROID.replaceAll("xxx_rpl_lic", CLEAR_ANDROID_license);
  }

/* field: CLICK_ANDROID license: 

 Copyright 2014 Software Freedom Conservancy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
  static final String CLICK_ANDROID =
  new StringBuilder(
    "function(){return(function(){function g(a){return function(){retur" +
    "n this[a]}}function aa(a){return function(){return a}}var l,ba=thi" +
    "s;function n(a){return void 0!==a}function ca(a,b){var c=a.split(\"" +
    ".\"),d=ba;c[0]in d||!d.execScript||d.execScript(\"var \"+c[0]);for(va" +
    "r e;c.length&&(e=c.shift());)!c.length&&n(b)?d[e]=b:d[e]?d=d[e]:d=" +
    "d[e]={}}\nfunction da(a){var b=typeof a;if(\"object\"==b)if(a){if(a i" +
    "nstanceof Array)return\"array\";if(a instanceof Object)return b;var " +
    "c=Object.prototype.toString.call(a);if(\"[object Window]\"==c)return" +
    "\"object\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"undef" +
    "ined\"!=typeof a.splice&&\"undefined\"!=typeof a.propertyIsEnumerable" +
    "&&!a.propertyIsEnumerable(\"splice\"))return\"array\";if(\"[object Func" +
    "tion]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof a.prope" +
    "rtyIsEnumerable&&!a.propertyIsEnumerable(\"call\"))return\"function\"}" +
    "else return\"null\";\nelse if(\"function\"==b&&\"undefined\"==typeof a.ca" +
    "ll)return\"object\";return b}function q(a){return\"string\"==typeof a}" +
    "function ea(a){return\"number\"==typeof a}function fa(a){return\"func" +
    "tion\"==da(a)}function ga(a,b,c){return a.call.apply(a.bind,argumen" +
    "ts)}\nfunction ha(a,b,c){if(!a)throw Error();if(2<arguments.length)" +
    "{var d=Array.prototype.slice.call(arguments,2);return function(){v" +
    "ar c=Array.prototype.slice.call(arguments);Array.prototype.unshift" +
    ".apply(c,d);return a.apply(b,c)}}return function(){return a.apply(" +
    "b,arguments)}}function ia(a,b,c){ia=Function.prototype.bind&&-1!=F" +
    "unction.prototype.bind.toString().indexOf(\"native code\")?ga:ha;ret" +
    "urn ia.apply(null,arguments)}\nfunction ja(a,b){var c=Array.prototy" +
    "pe.slice.call(arguments,1);return function(){var b=c.slice();b.pus" +
    "h.apply(b,arguments);return a.apply(this,b)}}function r(a,b){funct" +
    "ion c(){}c.prototype=b.prototype;a.S=b.prototype;a.prototype=new c" +
    ";a.prototype.constructor=a;a.P=function(a,c,f){for(var h=Array(arg" +
    "uments.length-2),k=2;k<arguments.length;k++)h[k-2]=arguments[k];re" +
    "turn b.prototype[c].apply(a,h)}}\nFunction.prototype.bind=Function." +
    "prototype.bind||function(a,b){if(1<arguments.length){var c=Array.p" +
    "rototype.slice.call(arguments,1);c.unshift(this,a);return ia.apply" +
    "(null,c)}return ia(this,a)};function ka(a){if(Error.captureStackTr" +
    "ace)Error.captureStackTrace(this,ka);else{var b=Error().stack;b&&(" +
    "this.stack=b)}a&&(this.message=String(a))}r(ka,Error);ka.prototype" +
    ".name=\"CustomError\";function la(a,b){for(var c=a.split(\"%s\"),d=\"\"," +
    "e=Array.prototype.slice.call(arguments,1);e.length&&1<c.length;)d+" +
    "=c.shift()+e.shift();return d+c.join(\"%s\")}var ma=String.prototype" +
    ".trim?function(a){return a.trim()}:function(a){return a.replace(/^" +
    "[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function na(a,b){return a<b?-1:a>b?1:0" +
    "}function pa(a){return String(a).replace(/\\-([a-z])/g,function(a,c" +
    "){return c.toUpperCase()})};function qa(a,b){b.unshift(a);ka.call(" +
    "this,la.apply(null,b));b.shift()}r(qa,ka);qa.prototype.name=\"Asser" +
    "tionError\";function ra(a,b,c){if(!a){var d=\"Assertion failed\";if(b" +
    ")var d=d+(\": \"+b),e=Array.prototype.slice.call(arguments,2);throw " +
    "new qa(\"\"+d,e||[]);}};var sa=Array.prototype;function ta(a,b){if(q" +
    "(a))return q(b)&&1==b.length?a.indexOf(b,0):-1;for(var c=0;c<a.len" +
    "gth;c++)if(c in a&&a[c]===b)return c;return-1}function t(a,b){for(" +
    "var c=a.length,d=q(a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.call(voi" +
    "d 0,d[e],e,a)}function ua(a,b,c){var d=c;t(a,function(c,f){d=b.cal" +
    "l(void 0,d,c,f,a)});return d}function va(a,b){for(var c=a.length,d" +
    "=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a)" +
    ")return!0;return!1}\nfunction wa(a,b){for(var c=a.length,d=q(a)?a.s" +
    "plit(\"\"):a,e=0;e<c;e++)if(e in d&&!b.call(void 0,d[e],e,a))return!" +
    "1;return!0}function xa(a){return sa.concat.apply(sa,arguments)}fun" +
    "ction ya(a,b,c){ra(null!=a.length);return 2>=arguments.length?sa.s" +
    "lice.call(a,b):sa.slice.call(a,b,c)};function za(a,b,c){return Mat" +
    "h.min(Math.max(a,b),c)};function v(a,b){this.x=n(a)?a:0;this.y=n(b" +
    ")?b:0}l=v.prototype;l.clone=function(){return new v(this.x,this.y)" +
    "};l.toString=function(){return\"(\"+this.x+\", \"+this.y+\")\"};l.ceil=f" +
    "unction(){this.x=Math.ceil(this.x);this.y=Math.ceil(this.y);return" +
    " this};l.floor=function(){this.x=Math.floor(this.x);this.y=Math.fl" +
    "oor(this.y);return this};l.round=function(){this.x=Math.round(this" +
    ".x);this.y=Math.round(this.y);return this};l.scale=function(a,b){v" +
    "ar c=ea(b)?b:a;this.x*=a;this.y*=c;return this};function Aa(a,b){t" +
    "his.x=a;this.y=b}r(Aa,v);Aa.prototype.clone=function(){return new " +
    "Aa(this.x,this.y)};Aa.prototype.scale=v.prototype.scale;Aa.prototy" +
    "pe.rotate=function(a){var b=Math.cos(a);a=Math.sin(a);var c=this.y" +
    "*b+this.x*a;this.x=this.x*b-this.y*a;this.y=c;return this};functio" +
    "n Ba(a){var b=arguments.length;if(1==b&&\"array\"==da(arguments[0]))" +
    "return Ba.apply(null,arguments[0]);for(var c={},d=0;d<b;d++)c[argu" +
    "ments[d]]=!0;return c};Ba(\"area base br col command embed hr img i" +
    "nput keygen link meta param source track wbr\".split(\" \"));function" +
    " Ca(a,b){this.width=a;this.height=b}l=Ca.prototype;l.clone=functio" +
    "n(){return new Ca(this.width,this.height)};l.toString=function(){r" +
    "eturn\"(\"+this.width+\" x \"+this.height+\")\"};l.ceil=function(){this." +
    "width=Math.ceil(this.width);this.height=Math.ceil(this.height);ret" +
    "urn this};l.floor=function(){this.width=Math.floor(this.width);thi" +
    "s.height=Math.floor(this.height);return this};l.round=function(){t" +
    "his.width=Math.round(this.width);this.height=Math.round(this.heigh" +
    "t);return this};\nl.scale=function(a,b){var c=ea(b)?b:a;this.width*" +
    "=a;this.height*=c;return this};var Da;a:{var Ea=ba.navigator;if(Ea" +
    "){var Fa=Ea.userAgent;if(Fa){Da=Fa;break a}}Da=\"\"};var Ga=-1!=Da.i" +
    "ndexOf(\"Macintosh\"),Ha=-1!=Da.indexOf(\"Windows\");function Ia(a){re" +
    "turn a?a.parentWindow||a.defaultView:window}function Ja(a){for(;a&" +
    "&1!=a.nodeType;)a=a.previousSibling;return a}function Ka(a,b){if(a" +
    ".contains&&1==b.nodeType)return a==b||a.contains(b);if(\"undefined\"" +
    "!=typeof a.compareDocumentPosition)return a==b||Boolean(a.compareD" +
    "ocumentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==a}\nf" +
    "unction La(a,b){if(a==b)return 0;if(a.compareDocumentPosition)retu" +
    "rn a.compareDocumentPosition(b)&2?1:-1;if(\"sourceIndex\"in a||a.par" +
    "entNode&&\"sourceIndex\"in a.parentNode){var c=1==a.nodeType,d=1==b." +
    "nodeType;if(c&&d)return a.sourceIndex-b.sourceIndex;var e=a.parent" +
    "Node,f=b.parentNode;return e==f?Ma(a,b):!c&&Ka(e,b)?-1*Na(a,b):!d&" +
    "&Ka(f,a)?Na(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b.sourceIndex:" +
    "f.sourceIndex)}d=x(a);c=d.createRange();c.selectNode(a);c.collapse" +
    "(!0);d=d.createRange();d.selectNode(b);\nd.collapse(!0);return c.co" +
    "mpareBoundaryPoints(ba.Range.START_TO_END,d)}function Na(a,b){var " +
    "c=a.parentNode;if(c==b)return-1;for(var d=b;d.parentNode!=c;)d=d.p" +
    "arentNode;return Ma(d,a)}function Ma(a,b){for(var c=b;c=c.previous" +
    "Sibling;)if(c==a)return-1;return 1}function x(a){ra(a,\"Node cannot" +
    " be null or undefined.\");return 9==a.nodeType?a:a.ownerDocument||a" +
    ".document}function Oa(a,b,c){c||(a=a.parentNode);for(c=0;a;){ra(\"p" +
    "arentNode\"!=a.name);if(b(a))return a;a=a.parentNode;c++}return nul" +
    "l}\nfunction Pa(a){try{return a&&a.activeElement}catch(b){}return n" +
    "ull}function Qa(a){this.a=a||ba.document||document}Qa.prototype.co" +
    "ntains=Ka;function Ra(a,b,c,d){this.top=a;this.right=b;this.bottom" +
    "=c;this.left=d}l=Ra.prototype;l.clone=function(){return new Ra(thi" +
    "s.top,this.right,this.bottom,this.left)};l.toString=function(){ret" +
    "urn\"(\"+this.top+\"t, \"+this.right+\"r, \"+this.bottom+\"b, \"+this.left" +
    "+\"l)\"};l.contains=function(a){return this&&a?a instanceof Ra?a.lef" +
    "t>=this.left&&a.right<=this.right&&a.top>=this.top&&a.bottom<=this" +
    ".bottom:a.x>=this.left&&a.x<=this.right&&a.y>=this.top&&a.y<=this." +
    "bottom:!1};\nl.ceil=function(){this.top=Math.ceil(this.top);this.ri" +
    "ght=Math.ceil(this.right);this.bottom=Math.ceil(this.bottom);this." +
    "left=Math.ceil(this.left);return this};l.floor=function(){this.top" +
    "=Math.floor(this.top);this.right=Math.floor(this.right);this.botto" +
    "m=Math.floor(this.bottom);this.left=Math.floor(this.left);return t" +
    "his};l.round=function(){this.top=Math.round(this.top);this.right=M" +
    "ath.round(this.right);this.bottom=Math.round(this.bottom);this.lef" +
    "t=Math.round(this.left);return this};\nl.scale=function(a,b){var c=" +
    "ea(b)?b:a;this.left*=a;this.right*=a;this.top*=c;this.bottom*=c;re" +
    "turn this};function y(a,b,c,d){this.left=a;this.top=b;this.width=c" +
    ";this.height=d}l=y.prototype;l.clone=function(){return new y(this." +
    "left,this.top,this.width,this.height)};l.toString=function(){retur" +
    "n\"(\"+this.left+\", \"+this.top+\" - \"+this.width+\"w x \"+this.height+\"" +
    "h)\"};l.contains=function(a){return a instanceof y?this.left<=a.lef" +
    "t&&this.left+this.width>=a.left+a.width&&this.top<=a.top&&this.top" +
    "+this.height>=a.top+a.height:a.x>=this.left&&a.x<=this.left+this.w" +
    "idth&&a.y>=this.top&&a.y<=this.top+this.height};\nl.ceil=function()" +
    "{this.left=Math.ceil(this.left);this.top=Math.ceil(this.top);this." +
    "width=Math.ceil(this.width);this.height=Math.ceil(this.height);ret" +
    "urn this};l.floor=function(){this.left=Math.floor(this.left);this." +
    "top=Math.floor(this.top);this.width=Math.floor(this.width);this.he" +
    "ight=Math.floor(this.height);return this};l.round=function(){this." +
    "left=Math.round(this.left);this.top=Math.round(this.top);this.widt" +
    "h=Math.round(this.width);this.height=Math.round(this.height);retur" +
    "n this};\nl.scale=function(a,b){var c=ea(b)?b:a;this.left*=a;this.w" +
    "idth*=a;this.top*=c;this.height*=c;return this};function Sa(a,b){v" +
    "ar c=x(a);return c.defaultView&&c.defaultView.getComputedStyle&&(c" +
    "=c.defaultView.getComputedStyle(a,null))?c[b]||c.getPropertyValue(" +
    "b)||\"\":\"\"}function Ta(a){var b=a.offsetWidth,c=a.offsetHeight;if((" +
    "!n(b)||!b&&!c)&&a.getBoundingClientRect){a:{var d;try{d=a.getBound" +
    "ingClientRect()}catch(e){a={left:0,top:0,right:0,bottom:0};break a" +
    "}a=d}return new Ca(a.right-a.left,a.bottom-a.top)}return new Ca(b," +
    "c)};/*xxx_rpl_lic*/\nvar Ua=window;/*xxx_rpl_lic*/\nfunction z(a,b){" +
    "this.code=a;this.a=Va[a]||\"unknown error\";this.message=b||\"\";var c" +
    "=this.a.replace(/((?:^|\\s+)[a-z])/g,function(a){return a.toUpperCa" +
    "se().replace(/^[\\s\\xa0]+/g,\"\")}),d=c.length-5;if(0>d||c.indexOf(\"E" +
    "rror\",d)!=d)c+=\"Error\";this.name=c;c=Error(this.message);c.name=th" +
    "is.name;this.stack=c.stack||\"\"}r(z,Error);\nvar Va={15:\"element not" +
    " selectable\",11:\"element not visible\",31:\"ime engine activation fa" +
    "iled\",30:\"ime not available\",24:\"invalid cookie domain\",29:\"invali" +
    "d element coordinates\",12:\"invalid element state\",32:\"invalid sele" +
    "ctor\",51:\"invalid selector\",52:\"invalid selector\",17:\"javascript e" +
    "rror\",405:\"unsupported operation\",34:\"move target out of bounds\",2" +
    "7:\"no such alert\",7:\"no such element\",8:\"no such frame\",23:\"no suc" +
    "h window\",28:\"script timeout\",33:\"session not created\",10:\"stale e" +
    "lement reference\",\n0:\"success\",21:\"timeout\",25:\"unable to set cook" +
    "ie\",26:\"unexpected alert open\",13:\"unknown error\",9:\"unknown comma" +
    "nd\"};z.prototype.toString=function(){return this.name+\": \"+this.me" +
    "ssage};/*xxx_rpl_lic*/\nfunction Wa(a){return(a=a.exec(Da))?a[1]:\"\"" +
    "}Wa(/Android\\s+([0-9.]+)/)||Wa(/Version\\/([0-9.]+)/);/*xxx_rpl_lic" +
    "*/\nfunction Xa(a){var b=0,c=ma(String(Ya)).split(\".\");a=ma(String(" +
    "a)).split(\".\");for(var d=Math.max(c.length,a.length),e=0;0==b&&e<d" +
    ";e++){var f=c[e]||\"\",h=a[e]||\"\",k=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),m=Reg" +
    "Exp(\"(\\\\d*)(\\\\D*)\",\"g\");do{var p=k.exec(f)||[\"\",\"\",\"\"],u=m.exec(h)" +
    "||[\"\",\"\",\"\"];if(0==p[0].length&&0==u[0].length)break;b=na(0==p[1]." +
    "length?0:parseInt(p[1],10),0==u[1].length?0:parseInt(u[1],10))||na" +
    "(0==p[2].length,0==u[2].length)||na(p[2],u[2])}while(0==b)}return " +
    "0<=b}\nvar Za=/Android\\s+([0-9\\.]+)/.exec(Da),Ya=Za?Za[1]:\"0\";Xa(2." +
    "3);Xa(4);/*xxx_rpl_lic*/\n/*\n\n The MIT License\n\n Copyright (c) 2007" +
    " Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is" +
    " hereby granted, free of charge, to any person obtaining a copy\n o" +
    "f this software and associated documentation files (the \"Software\"" +
    "), to\n deal in the Software without restriction, including without" +
    " limitation the\n rights to use, copy, modify, merge, publish, dist" +
    "ribute, sublicense, and/or\n sell copies of the Software, and to pe" +
    "rmit persons to whom the Software is\n furnished to do so, subject " +
    "to the following conditions:\n\n The above copyright notice and this" +
    " permission notice shall be included in\n all copies or substantial" +
    " portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WIT" +
    "HOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT " +
    "LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTI" +
    "CULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS " +
    "OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LI" +
    "ABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARIS" +
    "ING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR" +
    " OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction $a(a,b,c){this.a=a;t" +
    "his.b=b||1;this.f=c||1};/*\n\n The MIT License\n\n Copyright (c) 2007 " +
    "Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is " +
    "hereby granted, free of charge, to any person obtaining a copy\n of" +
    " this software and associated documentation files (the \"Software\")" +
    ", to\n deal in the Software without restriction, including without " +
    "limitation the\n rights to use, copy, modify, merge, publish, distr" +
    "ibute, sublicense, and/or\n sell copies of the Software, and to per" +
    "mit persons to whom the Software is\n furnished to do so, subject t" +
    "o the following conditions:\n\n The above copyright notice and this " +
    "permission notice shall be included in\n all copies or substantial " +
    "portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITH" +
    "OUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT L" +
    "IMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTIC" +
    "ULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS O" +
    "R COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIA" +
    "BILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISI" +
    "NG\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR " +
    "OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyrig" +
    "ht (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Pe" +
    "rmission is hereby granted, free of charge, to any person obtainin" +
    "g a copy\n of this software and associated documentation files (the" +
    " \"Software\"), to\n deal in the Software without restriction, includ" +
    "ing without limitation the\n rights to use, copy, modify, merge, pu" +
    "blish, distribute, sublicense, and/or\n sell copies of the Software" +
    ", and to permit persons to whom the Software is\n furnished to do s" +
    "o, subject to the following conditions:\n\n The above copyright noti" +
    "ce and this permission notice shall be included in\n all copies or " +
    "substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"" +
    "AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDI" +
    "NG BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS " +
    "FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL TH" +
    "E\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES O" +
    "R OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHE" +
    "RWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR" +
    " THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT Licen" +
    "se\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Goog" +
    "le Inc.\n\n Permission is hereby granted, free of charge, to any per" +
    "son obtaining a copy\n of this software and associated documentatio" +
    "n files (the \"Software\"), to\n deal in the Software without restric" +
    "tion, including without limitation the\n rights to use, copy, modif" +
    "y, merge, publish, distribute, sublicense, and/or\n sell copies of " +
    "the Software, and to permit persons to whom the Software is\n furni" +
    "shed to do so, subject to the following conditions:\n\n The above co" +
    "pyright notice and this permission notice shall be included in\n al" +
    "l copies or substantial portions of the Software.\n\n THE SOFTWARE I" +
    "S PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPL" +
    "IED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILIT" +
    "Y,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EV" +
    "ENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAI" +
    "M, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, " +
    "TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE" +
    " SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfuncti" +
    "on ab(a){this.b=a;this.a=0}function bb(a){a=a.match(cb);for(var b=" +
    "0;b<a.length;b++)db.test(a[b])&&a.splice(b,1);return new ab(a)}var" +
    " cb=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\" +
    ".\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\"" +
    ",\"g\"),db=/^\\s/;function A(a,b){return a.b[a.a+(b||0)]}function B(a" +
    "){return a.b[a.a++]}function eb(a){return a.b.length<=a.a};/*\n\n Th" +
    "e MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c" +
    ") 2012 Google Inc.\n\n Permission is hereby granted, free of charge," +
    " to any person obtaining a copy\n of this software and associated d" +
    "ocumentation files (the \"Software\"), to\n deal in the Software with" +
    "out restriction, including without limitation the\n rights to use, " +
    "copy, modify, merge, publish, distribute, sublicense, and/or\n sell" +
    " copies of the Software, and to permit persons to whom the Softwar" +
    "e is\n furnished to do so, subject to the following conditions:\n\n T" +
    "he above copyright notice and this permission notice shall be incl" +
    "uded in\n all copies or substantial portions of the Software.\n\n THE" +
    " SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRE" +
    "SS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MER" +
    "CHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMEN" +
    "T. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE F" +
    "OR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF" +
    " CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTI" +
    "ON WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE" +
    ".\n*/\nfunction D(a){var b=null,c=a.nodeType;1==c&&(b=a.textContent," +
    "b=void 0==b||null==b?a.innerText:b,b=void 0==b||null==b?\"\":b);if(\"" +
    "string\"!=typeof b)if(9==c||1==c){a=9==c?a.documentElement:a.firstC" +
    "hild;for(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a.nodeValue)," +
    "d[c++]=a;while(a=a.firstChild);for(;c&&!(a=d[--c].nextSibling););}" +
    "}else b=a.nodeValue;return\"\"+b}\nfunction fb(a,b,c){if(null===b)ret" +
    "urn!0;try{if(!a.getAttribute)return!1}catch(d){return!1}return nul" +
    "l==c?!!a.getAttribute(b):a.getAttribute(b,2)==c}function gb(a,b,c," +
    "d,e){return hb.call(null,a,b,q(c)?c:null,q(d)?d:null,e||new E)}\nfu" +
    "nction hb(a,b,c,d,e){b.getElementsByName&&d&&\"name\"==c?(b=b.getEle" +
    "mentsByName(d),t(b,function(b){a.a(b)&&G(e,b)})):b.getElementsByCl" +
    "assName&&d&&\"class\"==c?(b=b.getElementsByClassName(d),t(b,function" +
    "(b){b.className==d&&a.a(b)&&G(e,b)})):a instanceof H?ib(a,b,c,d,e)" +
    ":b.getElementsByTagName&&(b=b.getElementsByTagName(a.f()),t(b,func" +
    "tion(a){fb(a,c,d)&&G(e,a)}));return e}function jb(a,b,c,d,e){for(b" +
    "=b.firstChild;b;b=b.nextSibling)fb(b,c,d)&&a.a(b)&&G(e,b);return e" +
    "}\nfunction ib(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)fb(b" +
    ",c,d)&&a.a(b)&&G(e,b),ib(a,b,c,d,e)};/*\n\n The MIT License\n\n Copyri" +
    "ght (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n P" +
    "ermission is hereby granted, free of charge, to any person obtaini" +
    "ng a copy\n of this software and associated documentation files (th" +
    "e \"Software\"), to\n deal in the Software without restriction, inclu" +
    "ding without limitation the\n rights to use, copy, modify, merge, p" +
    "ublish, distribute, sublicense, and/or\n sell copies of the Softwar" +
    "e, and to permit persons to whom the Software is\n furnished to do " +
    "so, subject to the following conditions:\n\n The above copyright not" +
    "ice and this permission notice shall be included in\n all copies or" +
    " substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED " +
    "\"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUD" +
    "ING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS" +
    " FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL T" +
    "HE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES " +
    "OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTH" +
    "ERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE O" +
    "R THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction E(){this" +
    ".b=this.a=null;this.u=0}function kb(a){this.node=a;this.a=this.b=n" +
    "ull}function lb(a,b){if(!a.a)return b;if(!b.a)return a;for(var c=a" +
    ".a,d=b.a,e=null,f=null,h=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):" +
    "0<La(c.node,d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=" +
    "f,h++;for(f=c||d;f;)f.b=e,e=e.a=f,h++,f=f.a;a.b=e;a.u=h;return a}f" +
    "unction mb(a,b){var c=new kb(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=" +
    "c;a.u++}function G(a,b){var c=new kb(b);c.b=a.b;a.a?a.b.a=c:a.a=a." +
    "b=c;a.b=c;a.u++}\nfunction nb(a){return(a=a.a)?a.node:null}function" +
    " ob(a){return(a=nb(a))?D(a):\"\"}function I(a,b){return new pb(a,!!b" +
    ")}function pb(a,b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=null}" +
    "function J(a){var b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c" +
    "?b.b:b.a;return c.node};/*\n\n The MIT License\n\n Copyright (c) 2007 " +
    "Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is " +
    "hereby granted, free of charge, to any person obtaining a copy\n of" +
    " this software and associated documentation files (the \"Software\")" +
    ", to\n deal in the Software without restriction, including without " +
    "limitation the\n rights to use, copy, modify, merge, publish, distr" +
    "ibute, sublicense, and/or\n sell copies of the Software, and to per" +
    "mit persons to whom the Software is\n furnished to do so, subject t" +
    "o the following conditions:\n\n The above copyright notice and this " +
    "permission notice shall be included in\n all copies or substantial " +
    "portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITH" +
    "OUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT L" +
    "IMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTIC" +
    "ULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS O" +
    "R COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIA" +
    "BILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISI" +
    "NG\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR " +
    "OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction qb(a){switch(a.nodeTy" +
    "pe){case 1:return ja(rb,a);case 9:return qb(a.documentElement);cas" +
    "e 11:case 10:case 6:case 12:return sb;default:return a.parentNode?" +
    "qb(a.parentNode):sb}}function sb(){return null}function rb(a,b){if" +
    "(a.prefix==b)return a.namespaceURI||\"http://www.w3.org/1999/xhtml\"" +
    ";var c=a.getAttributeNode(\"xmlns:\"+b);return c&&c.specified?c.valu" +
    "e||null:a.parentNode&&9!=a.parentNode.nodeType?rb(a.parentNode,b):" +
    "null};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n" +
    " Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted, fr" +
    "ee of charge, to any person obtaining a copy\n of this software and" +
    " associated documentation files (the \"Software\"), to\n deal in the " +
    "Software without restriction, including without limitation the\n ri" +
    "ghts to use, copy, modify, merge, publish, distribute, sublicense," +
    " and/or\n sell copies of the Software, and to permit persons to who" +
    "m the Software is\n furnished to do so, subject to the following co" +
    "nditions:\n\n The above copyright notice and this permission notice " +
    "shall be included in\n all copies or substantial portions of the So" +
    "ftware.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF AN" +
    "Y KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARR" +
    "ANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND N" +
    "ONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDER" +
    "S BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN" +
    " AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF O" +
    "R IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN" +
    " THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu" +
    " Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby" +
    " granted, free of charge, to any person obtaining a copy\n of this " +
    "software and associated documentation files (the \"Software\"), to\n " +
    "deal in the Software without restriction, including without limita" +
    "tion the\n rights to use, copy, modify, merge, publish, distribute," +
    " sublicense, and/or\n sell copies of the Software, and to permit pe" +
    "rsons to whom the Software is\n furnished to do so, subject to the " +
    "following conditions:\n\n The above copyright notice and this permis" +
    "sion notice shall be included in\n all copies or substantial portio" +
    "ns of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WA" +
    "RRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED" +
    " TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR P" +
    "URPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPY" +
    "RIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY" +
    ", WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FR" +
    "OM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER " +
    "DEALINGS\n IN THE SOFTWARE.\n*/\nfunction K(a){this.m=a;this.b=this.j" +
    "=!1;this.f=null}function M(a){return\"\\n  \"+a.toString().split(\"\\n\"" +
    ").join(\"\\n  \")}function tb(a,b){a.j=b}function ub(a,b){a.b=b}funct" +
    "ion N(a,b){var c=a.a(b);return c instanceof E?+ob(c):+c}function O" +
    "(a,b){var c=a.a(b);return c instanceof E?ob(c):\"\"+c}function vb(a," +
    "b){var c=a.a(b);return c instanceof E?!!c.u:!!c};/*\n\n The MIT Lice" +
    "nse\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Goo" +
    "gle Inc.\n\n Permission is hereby granted, free of charge, to any pe" +
    "rson obtaining a copy\n of this software and associated documentati" +
    "on files (the \"Software\"), to\n deal in the Software without restri" +
    "ction, including without limitation the\n rights to use, copy, modi" +
    "fy, merge, publish, distribute, sublicense, and/or\n sell copies of" +
    " the Software, and to permit persons to whom the Software is\n furn" +
    "ished to do so, subject to the following conditions:\n\n The above c" +
    "opyright notice and this permission notice shall be included in\n a" +
    "ll copies or substantial portions of the Software.\n\n THE SOFTWARE " +
    "IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMP" +
    "LIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILI" +
    "TY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO E" +
    "VENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLA" +
    "IM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT," +
    " TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH TH" +
    "E SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunct" +
    "ion wb(a,b,c){K.call(this,a.m);this.c=a;this.h=b;this.s=c;this.j=b" +
    ".j||c.j;this.b=b.b||c.b;this.c==xb&&(c.b||c.j||4==c.m||0==c.m||!b." +
    "f?b.b||b.j||4==b.m||0==b.m||!c.f||(this.f={name:c.f.name,B:b}):thi" +
    "s.f={name:b.f.name,B:c})}r(wb,K);\nfunction yb(a,b,c,d,e){b=b.a(d);" +
    "c=c.a(d);var f;if(b instanceof E&&c instanceof E){e=I(b);for(d=J(e" +
    ");d;d=J(e))for(b=I(c),f=J(b);f;f=J(b))if(a(D(d),D(f)))return!0;ret" +
    "urn!1}if(b instanceof E||c instanceof E){b instanceof E?e=b:(e=c,c" +
    "=b);e=I(e);b=typeof c;for(d=J(e);d;d=J(e)){switch(b){case \"number\"" +
    ":d=+D(d);break;case \"boolean\":d=!!D(d);break;case \"string\":d=D(d);"
  )
      .append(
    "break;default:throw Error(\"Illegal primitive type for comparison.\"" +
    ");}if(a(d,c))return!0}return!1}return e?\"boolean\"==typeof b||\"bool" +
    "ean\"==typeof c?\na(!!b,!!c):\"number\"==typeof b||\"number\"==typeof c?" +
    "a(+b,+c):a(b,c):a(+b,+c)}wb.prototype.a=function(a){return this.c." +
    "v(this.h,this.s,a)};wb.prototype.toString=function(){var a=\"Binary" +
    " Expression: \"+this.c,a=a+M(this.h);return a+=M(this.s)};function " +
    "zb(a,b,c,d){this.a=a;this.H=b;this.m=c;this.v=d}zb.prototype.toStr" +
    "ing=g(\"a\");var Ab={};function P(a,b,c,d){if(Ab.hasOwnProperty(a))t" +
    "hrow Error(\"Binary operator already created: \"+a);a=new zb(a,b,c,d" +
    ");return Ab[a.toString()]=a}\nP(\"div\",6,1,function(a,b,c){return N(" +
    "a,c)/N(b,c)});P(\"mod\",6,1,function(a,b,c){return N(a,c)%N(b,c)});P" +
    "(\"*\",6,1,function(a,b,c){return N(a,c)*N(b,c)});P(\"+\",5,1,function" +
    "(a,b,c){return N(a,c)+N(b,c)});P(\"-\",5,1,function(a,b,c){return N(" +
    "a,c)-N(b,c)});P(\"<\",4,2,function(a,b,c){return yb(function(a,b){re" +
    "turn a<b},a,b,c)});P(\">\",4,2,function(a,b,c){return yb(function(a," +
    "b){return a>b},a,b,c)});P(\"<=\",4,2,function(a,b,c){return yb(funct" +
    "ion(a,b){return a<=b},a,b,c)});\nP(\">=\",4,2,function(a,b,c){return " +
    "yb(function(a,b){return a>=b},a,b,c)});var xb=P(\"=\",3,2,function(a" +
    ",b,c){return yb(function(a,b){return a==b},a,b,c,!0)});P(\"!=\",3,2," +
    "function(a,b,c){return yb(function(a,b){return a!=b},a,b,c,!0)});P" +
    "(\"and\",2,2,function(a,b,c){return vb(a,c)&&vb(b,c)});P(\"or\",1,2,fu" +
    "nction(a,b,c){return vb(a,c)||vb(b,c)});/*\n\n The MIT License\n\n Cop" +
    "yright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n" +
    "\n Permission is hereby granted, free of charge, to any person obta" +
    "ining a copy\n of this software and associated documentation files " +
    "(the \"Software\"), to\n deal in the Software without restriction, in" +
    "cluding without limitation the\n rights to use, copy, modify, merge" +
    ", publish, distribute, sublicense, and/or\n sell copies of the Soft" +
    "ware, and to permit persons to whom the Software is\n furnished to " +
    "do so, subject to the following conditions:\n\n The above copyright " +
    "notice and this permission notice shall be included in\n all copies" +
    " or substantial portions of the Software.\n\n THE SOFTWARE IS PROVID" +
    "ED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INC" +
    "LUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITN" +
    "ESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHAL" +
    "L THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAG" +
    "ES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR " +
    "OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWAR" +
    "E OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Bb(a," +
    "b){if(b.a.length&&4!=a.m)throw Error(\"Primary expression must eval" +
    "uate to nodeset if filter has predicate(s).\");K.call(this,a.m);thi" +
    "s.c=a;this.h=b;this.j=a.j;this.b=a.b}r(Bb,K);Bb.prototype.a=functi" +
    "on(a){a=this.c.a(a);return Cb(this.h,a)};Bb.prototype.toString=fun" +
    "ction(){var a;a=\"Filter:\"+M(this.c);return a+=M(this.h)};/*\n\n The " +
    "MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) " +
    "2012 Google Inc.\n\n Permission is hereby granted, free of charge, t" +
    "o any person obtaining a copy\n of this software and associated doc" +
    "umentation files (the \"Software\"), to\n deal in the Software withou" +
    "t restriction, including without limitation the\n rights to use, co" +
    "py, modify, merge, publish, distribute, sublicense, and/or\n sell c" +
    "opies of the Software, and to permit persons to whom the Software " +
    "is\n furnished to do so, subject to the following conditions:\n\n The" +
    " above copyright notice and this permission notice shall be includ" +
    "ed in\n all copies or substantial portions of the Software.\n\n THE S" +
    "OFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS" +
    " OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCH" +
    "ANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT." +
    " IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR" +
    " ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF C" +
    "ONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION" +
    " WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n" +
    "*/\nfunction Db(a,b){if(b.length<a.J)throw Error(\"Function \"+a.o+\" " +
    "expects at least\"+a.J+\" arguments, \"+b.length+\" given\");if(null!==" +
    "a.C&&b.length>a.C)throw Error(\"Function \"+a.o+\" expects at most \"+" +
    "a.C+\" arguments, \"+b.length+\" given\");a.K&&t(b,function(b,d){if(4!" +
    "=b.m)throw Error(\"Argument \"+d+\" to function \"+a.o+\" is not of typ" +
    "e Nodeset: \"+b);});K.call(this,a.m);this.h=a;this.c=b;tb(this,a.j|" +
    "|va(b,function(a){return a.j}));ub(this,a.O&&!b.length||a.N&&!!b.l" +
    "ength||va(b,function(a){return a.b}))}\nr(Db,K);Db.prototype.a=func" +
    "tion(a){return this.h.v.apply(null,xa(a,this.c))};Db.prototype.toS" +
    "tring=function(){var a=\"Function: \"+this.h;if(this.c.length)var b=" +
    "ua(this.c,function(a,b){return a+M(b)},\"Arguments:\"),a=a+M(b);retu" +
    "rn a};function Eb(a,b,c,d,e,f,h,k,m){this.o=a;this.m=b;this.j=c;th" +
    "is.O=d;this.N=e;this.v=f;this.J=h;this.C=n(k)?k:h;this.K=!!m}Eb.pr" +
    "ototype.toString=g(\"o\");var Fb={};\nfunction Q(a,b,c,d,e,f,h,k){if(" +
    "Fb.hasOwnProperty(a))throw Error(\"Function already created: \"+a+\"." +
    "\");Fb[a]=new Eb(a,b,c,d,!1,e,f,h,k)}Q(\"boolean\",2,!1,!1,function(a" +
    ",b){return vb(b,a)},1);Q(\"ceiling\",1,!1,!1,function(a,b){return Ma" +
    "th.ceil(N(b,a))},1);Q(\"concat\",3,!1,!1,function(a,b){var c=ya(argu" +
    "ments,1);return ua(c,function(b,c){return b+O(c,a)},\"\")},2,null);Q" +
    "(\"contains\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return-1!=b." +
    "indexOf(a)},2);Q(\"count\",1,!1,!1,function(a,b){return b.a(a).u},1," +
    "1,!0);\nQ(\"false\",2,!1,!1,aa(!1),0);Q(\"floor\",1,!1,!1,function(a,b)" +
    "{return Math.floor(N(b,a))},1);Q(\"id\",4,!1,!1,function(a,b){var c=" +
    "a.a,d=9==c.nodeType?c:c.ownerDocument,c=O(b,a).split(/\\s+/),e=[];t" +
    "(c,function(a){a=d.getElementById(a);!a||0<=ta(e,a)||e.push(a)});e" +
    ".sort(La);var f=new E;t(e,function(a){G(f,a)});return f},1);Q(\"lan" +
    "g\",2,!1,!1,aa(!1),1);Q(\"last\",1,!0,!1,function(a){if(1!=arguments." +
    "length)throw Error(\"Function last expects ()\");return a.f},0);\nQ(\"" +
    "local-name\",3,!1,!0,function(a,b){var c=b?nb(b.a(a)):a.a;return c?" +
    "c.localName||c.nodeName.toLowerCase():\"\"},0,1,!0);Q(\"name\",3,!1,!0" +
    ",function(a,b){var c=b?nb(b.a(a)):a.a;return c?c.nodeName.toLowerC" +
    "ase():\"\"},0,1,!0);Q(\"namespace-uri\",3,!0,!1,aa(\"\"),0,1,!0);Q(\"norm" +
    "alize-space\",3,!1,!0,function(a,b){return(b?O(b,a):D(a.a)).replace" +
    "(/[\\s\\xa0]+/g,\" \").replace(/^\\s+|\\s+$/g,\"\")},0,1);Q(\"not\",2,!1,!1," +
    "function(a,b){return!vb(b,a)},1);Q(\"number\",1,!1,!0,function(a,b){" +
    "return b?N(b,a):+D(a.a)},0,1);\nQ(\"position\",1,!0,!1,function(a){re" +
    "turn a.b},0);Q(\"round\",1,!1,!1,function(a,b){return Math.round(N(b" +
    ",a))},1);Q(\"starts-with\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a)" +
    ";return 0==b.lastIndexOf(a,0)},2);Q(\"string\",3,!1,!0,function(a,b)" +
    "{return b?O(b,a):D(a.a)},0,1);Q(\"string-length\",1,!1,!0,function(a" +
    ",b){return(b?O(b,a):D(a.a)).length},0,1);\nQ(\"substring\",3,!1,!1,fu" +
    "nction(a,b,c,d){c=N(c,a);if(isNaN(c)||Infinity==c||-Infinity==c)re" +
    "turn\"\";d=d?N(d,a):Infinity;if(isNaN(d)||-Infinity===d)return\"\";c=M" +
    "ath.round(c)-1;var e=Math.max(c,0);a=O(b,a);if(Infinity==d)return " +
    "a.substring(e);b=Math.round(d);return a.substring(e,c+b)},2,3);Q(\"" +
    "substring-after\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);c=b.ind" +
    "exOf(a);return-1==c?\"\":b.substring(c+a.length)},2);\nQ(\"substring-b" +
    "efore\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);a=b.indexOf(a);re" +
    "turn-1==a?\"\":b.substring(0,a)},2);Q(\"sum\",1,!1,!1,function(a,b){fo" +
    "r(var c=I(b.a(a)),d=0,e=J(c);e;e=J(c))d+=+D(e);return d},1,1,!0);Q" +
    "(\"translate\",3,!1,!1,function(a,b,c,d){b=O(b,a);c=O(c,a);var e=O(d" +
    ",a);a=[];for(d=0;d<c.length;d++){var f=c.charAt(d);f in a||(a[f]=e" +
    ".charAt(d))}c=\"\";for(d=0;d<b.length;d++)f=b.charAt(d),c+=f in a?a[" +
    "f]:f;return c},3);Q(\"true\",2,!1,!1,aa(!0),0);/*\n\n The MIT License\n" +
    "\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google " +
    "Inc.\n\n Permission is hereby granted, free of charge, to any person" +
    " obtaining a copy\n of this software and associated documentation f" +
    "iles (the \"Software\"), to\n deal in the Software without restrictio" +
    "n, including without limitation the\n rights to use, copy, modify, " +
    "merge, publish, distribute, sublicense, and/or\n sell copies of the" +
    " Software, and to permit persons to whom the Software is\n furnishe" +
    "d to do so, subject to the following conditions:\n\n The above copyr" +
    "ight notice and this permission notice shall be included in\n all c" +
    "opies or substantial portions of the Software.\n\n THE SOFTWARE IS P" +
    "ROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED" +
    ", INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
    " FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT" +
    " SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, " +
    "DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TOR" +
    "T OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SO" +
    "FTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The " +
    "MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) " +
    "2012 Google Inc.\n\n Permission is hereby granted, free of charge, t" +
    "o any person obtaining a copy\n of this software and associated doc" +
    "umentation files (the \"Software\"), to\n deal in the Software withou" +
    "t restriction, including without limitation the\n rights to use, co" +
    "py, modify, merge, publish, distribute, sublicense, and/or\n sell c" +
    "opies of the Software, and to permit persons to whom the Software " +
    "is\n furnished to do so, subject to the following conditions:\n\n The" +
    " above copyright notice and this permission notice shall be includ" +
    "ed in\n all copies or substantial portions of the Software.\n\n THE S" +
    "OFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS" +
    " OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCH" +
    "ANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT." +
    " IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR" +
    " ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF C" +
    "ONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION" +
    " WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n" +
    "*/\nfunction H(a,b){this.h=a;this.c=n(b)?b:null;this.b=null;switch(" +
    "a){case \"comment\":this.b=8;break;case \"text\":this.b=3;break;case \"" +
    "processing-instruction\":this.b=7;break;case \"node\":break;default:t" +
    "hrow Error(\"Unexpected argument\");}}function Gb(a){return\"comment\"" +
    "==a||\"text\"==a||\"processing-instruction\"==a||\"node\"==a}H.prototype" +
    ".a=function(a){return null===this.b||this.b==a.nodeType};H.prototy" +
    "pe.f=g(\"h\");H.prototype.toString=function(){var a=\"Kind Test: \"+th" +
    "is.h;null===this.c||(a+=M(this.c));return a};/*\n\n The MIT License\n" +
    "\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google " +
    "Inc.\n\n Permission is hereby granted, free of charge, to any person" +
    " obtaining a copy\n of this software and associated documentation f" +
    "iles (the \"Software\"), to\n deal in the Software without restrictio" +
    "n, including without limitation the\n rights to use, copy, modify, " +
    "merge, publish, distribute, sublicense, and/or\n sell copies of the" +
    " Software, and to permit persons to whom the Software is\n furnishe" +
    "d to do so, subject to the following conditions:\n\n The above copyr" +
    "ight notice and this permission notice shall be included in\n all c" +
    "opies or substantial portions of the Software.\n\n THE SOFTWARE IS P" +
    "ROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED" +
    ", INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
    " FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT" +
    " SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, " +
    "DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TOR" +
    "T OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SO" +
    "FTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction " +
    "Hb(a){K.call(this,3);this.c=a.substring(1,a.length-1)}r(Hb,K);Hb.p" +
    "rototype.a=g(\"c\");Hb.prototype.toString=function(){return\"Literal:" +
    " \"+this.c};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, " +
    "Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby grante" +
    "d, free of charge, to any person obtaining a copy\n of this softwar" +
    "e and associated documentation files (the \"Software\"), to\n deal in" +
    " the Software without restriction, including without limitation th" +
    "e\n rights to use, copy, modify, merge, publish, distribute, sublic" +
    "ense, and/or\n sell copies of the Software, and to permit persons t" +
    "o whom the Software is\n furnished to do so, subject to the followi" +
    "ng conditions:\n\n The above copyright notice and this permission no" +
    "tice shall be included in\n all copies or substantial portions of t" +
    "he Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY " +
    "OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE" +
    " WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE " +
    "AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT H" +
    "OLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETH" +
    "ER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT" +
    " OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALING" +
    "S\n IN THE SOFTWARE.\n*/\nfunction Ib(a,b){this.o=a.toLowerCase();thi" +
    "s.b=b?b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}Ib.prototype." +
    "a=function(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=this.o&&t" +
    "his.o!=a.nodeName.toLowerCase()?!1:this.b==(a.namespaceURI?a.names" +
    "paceURI.toLowerCase():\"http://www.w3.org/1999/xhtml\")};Ib.prototyp" +
    "e.f=g(\"o\");Ib.prototype.toString=function(){return\"Name Test: \"+(\"" +
    "http://www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+this.o};/*\n\n " +
    "The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright " +
    "(c) 2012 Google Inc.\n\n Permission is hereby granted, free of charg" +
    "e, to any person obtaining a copy\n of this software and associated" +
    " documentation files (the \"Software\"), to\n deal in the Software wi" +
    "thout restriction, including without limitation the\n rights to use" +
    ", copy, modify, merge, publish, distribute, sublicense, and/or\n se" +
    "ll copies of the Software, and to permit persons to whom the Softw" +
    "are is\n furnished to do so, subject to the following conditions:\n\n" +
    " The above copyright notice and this permission notice shall be in" +
    "cluded in\n all copies or substantial portions of the Software.\n\n T" +
    "HE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXP" +
    "RESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF M" +
    "ERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEM" +
    "ENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE" +
    " FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION " +
    "OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNEC" +
    "TION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWA" +
    "RE.\n*/\nfunction Jb(a){K.call(this,1);this.c=a}r(Jb,K);Jb.prototype" +
    ".a=g(\"c\");Jb.prototype.toString=function(){return\"Number: \"+this.c" +
    "};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Cop" +
    "yright (c) 2012 Google Inc.\n\n Permission is hereby granted, free o" +
    "f charge, to any person obtaining a copy\n of this software and ass" +
    "ociated documentation files (the \"Software\"), to\n deal in the Soft" +
    "ware without restriction, including without limitation the\n rights" +
    " to use, copy, modify, merge, publish, distribute, sublicense, and" +
    "/or\n sell copies of the Software, and to permit persons to whom th" +
    "e Software is\n furnished to do so, subject to the following condit" +
    "ions:\n\n The above copyright notice and this permission notice shal" +
    "l be included in\n all copies or substantial portions of the Softwa" +
    "re.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KI" +
    "ND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTI" +
    "ES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONIN" +
    "FRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE" +
    " LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN " +
    "ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN" +
    " CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE" +
    " SOFTWARE.\n*/\nfunction Kb(a,b){K.call(this,a.m);this.h=a;this.c=b;" +
    "this.j=a.j;this.b=a.b;if(1==this.c.length){var c=this.c[0];c.A||c." +
    "c!=Lb||(c=c.s,\"*\"!=c.f()&&(this.f={name:c.f(),B:null}))}}r(Kb,K);f" +
    "unction Mb(){K.call(this,4)}r(Mb,K);Mb.prototype.a=function(a){var" +
    " b=new E;a=a.a;9==a.nodeType?G(b,a):G(b,a.ownerDocument);return b}" +
    ";Mb.prototype.toString=aa(\"Root Helper Expression\");function Nb(){" +
    "K.call(this,4)}r(Nb,K);Nb.prototype.a=function(a){var b=new E;G(b," +
    "a.a);return b};Nb.prototype.toString=aa(\"Context Helper Expression" +
    "\");\nfunction Ob(a){return\"/\"==a||\"//\"==a}Kb.prototype.a=function(a" +
    "){var b=this.h.a(a);if(!(b instanceof E))throw Error(\"Filter expre" +
    "ssion must evaluate to nodeset.\");a=this.c;for(var c=0,d=a.length;" +
    "c<d&&b.u;c++){var e=a[c],f=I(b,e.c.a),h;if(e.j||e.c!=Pb)if(e.j||e." +
    "c!=Qb)for(h=J(f),b=e.a(new $a(h));null!=(h=J(f));)h=e.a(new $a(h))" +
    ",b=lb(b,h);else h=J(f),b=e.a(new $a(h));else{for(h=J(f);(b=J(f))&&" +
    "(!h.contains||h.contains(b))&&b.compareDocumentPosition(h)&8;h=b);" +
    "b=e.a(new $a(h))}}return b};\nKb.prototype.toString=function(){var " +
    "a;a=\"Path Expression:\"+M(this.h);if(this.c.length){var b=ua(this.c" +
    ",function(a,b){return a+M(b)},\"Steps:\");a+=M(b)}return a};/*\n\n The" +
    " MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c)" +
    " 2012 Google Inc.\n\n Permission is hereby granted, free of charge, " +
    "to any person obtaining a copy\n of this software and associated do" +
    "cumentation files (the \"Software\"), to\n deal in the Software witho" +
    "ut restriction, including without limitation the\n rights to use, c" +
    "opy, modify, merge, publish, distribute, sublicense, and/or\n sell " +
    "copies of the Software, and to permit persons to whom the Software" +
    " is\n furnished to do so, subject to the following conditions:\n\n Th" +
    "e above copyright notice and this permission notice shall be inclu" +
    "ded in\n all copies or substantial portions of the Software.\n\n THE " +
    "SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRES" +
    "S OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERC" +
    "HANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT" +
    ". IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FO" +
    "R ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF " +
    "CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTIO" +
    "N WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE." +
    "\n*/\nfunction Rb(a,b){this.a=a;this.b=!!b}\nfunction Cb(a,b,c){for(c" +
    "=c||0;c<a.a.length;c++)for(var d=a.a[c],e=I(b),f=b.u,h,k=0;h=J(e);" +
    "k++){var m=a.b?f-k:k+1;h=d.a(new $a(h,m,f));if(\"number\"==typeof h)" +
    "m=m==h;else if(\"string\"==typeof h||\"boolean\"==typeof h)m=!!h;else " +
    "if(h instanceof E)m=0<h.u;else throw Error(\"Predicate.evaluate ret" +
    "urned an unexpected type.\");if(!m){m=e;h=m.f;var p=m.a;if(!p)throw" +
    " Error(\"Next must be called at least once before remove.\");var u=p" +
    ".b,p=p.a;u?u.a=p:h.a=p;p?p.b=u:h.b=u;h.u--;m.a=null}}return b}\nRb." +
    "prototype.toString=function(){return ua(this.a,function(a,b){retur" +
    "n a+M(b)},\"Predicates:\")};/*\n\n The MIT License\n\n Copyright (c) 200" +
    "7 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission i" +
    "s hereby granted, free of charge, to any person obtaining a copy\n " +
    "of this software and associated documentation files (the \"Software" +
    "\"), to\n deal in the Software without restriction, including withou" +
    "t limitation the\n rights to use, copy, modify, merge, publish, dis" +
    "tribute, sublicense, and/or\n sell copies of the Software, and to p" +
    "ermit persons to whom the Software is\n furnished to do so, subject" +
    " to the following conditions:\n\n The above copyright notice and thi" +
    "s permission notice shall be included in\n all copies or substantia" +
    "l portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WI" +
    "THOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT" +
    " LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PART" +
    "ICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS" +
    " OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n L" +
    "IABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARI" +
    "SING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE O" +
    "R OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Sb(a,b,c,d){K.call(" +
    "this,4);this.c=a;this.s=b;this.h=c||new Rb([]);this.A=!!d;b=this.h" +
    ";b=0<b.a.length?b.a[0].f:null;a.b&&b&&(this.f={name:b.name,B:b.B})" +
    ";a:{a=this.h;for(b=0;b<a.a.length;b++)if(c=a.a[b],c.j||1==c.m||0==" +
    "c.m){a=!0;break a}a=!1}this.j=a}r(Sb,K);\nSb.prototype.a=function(a" +
    "){var b=a.a,c=null,c=this.f,d=null,e=null,f=0;c&&(d=c.name,e=c.B?O" +
    "(c.B,a):null,f=1);if(this.A)if(this.j||this.c!=Tb)if(a=I((new Sb(U" +
    "b,new H(\"node\"))).a(a)),b=J(a))for(c=this.v(b,d,e,f);null!=(b=J(a)" +
    ");)c=lb(c,this.v(b,d,e,f));else c=new E;else c=gb(this.s,b,d,e),c=" +
    "Cb(this.h,c,f);else c=this.v(a.a,d,e,f);return c};Sb.prototype.v=f" +
    "unction(a,b,c,d){a=this.c.f(this.s,a,b,c);return a=Cb(this.h,a,d)}" +
    ";\nSb.prototype.toString=function(){var a;a=\"Step:\"+M(\"Operator: \"+" +
    "(this.A?\"//\":\"/\"));this.c.o&&(a+=M(\"Axis: \"+this.c));a+=M(this.s);" +
    "if(this.h.a.length){var b=ua(this.h.a,function(a,b){return a+M(b)}" +
    ",\"Predicates:\");a+=M(b)}return a};function Vb(a,b,c,d){this.o=a;th" +
    "is.f=b;this.a=c;this.b=d}Vb.prototype.toString=g(\"o\");var Wb={};fu" +
    "nction R(a,b,c,d){if(Wb.hasOwnProperty(a))throw Error(\"Axis alread" +
    "y created: \"+a);b=new Vb(a,b,c,!!d);return Wb[a]=b}\nR(\"ancestor\",f" +
    "unction(a,b){for(var c=new E,d=b;d=d.parentNode;)a.a(d)&&mb(c,d);r" +
    "eturn c},!0);R(\"ancestor-or-self\",function(a,b){var c=new E,d=b;do" +
    " a.a(d)&&mb(c,d);while(d=d.parentNode);return c},!0);var Lb=R(\"att" +
    "ribute\",function(a,b){var c=new E,d=a.f(),e=b.attributes;if(e)if(a" +
    " instanceof H&&null===a.b||\"*\"==d)for(var d=0,f;f=e[d];d++)G(c,f);" +
    "else(f=e.getNamedItem(d))&&G(c,f);return c},!1),Tb=R(\"child\",funct" +
    "ion(a,b,c,d,e){return jb.call(null,a,b,q(c)?c:null,q(d)?d:null,e||" +
    "new E)},!1,!0);\nR(\"descendant\",gb,!1,!0);var Ub=R(\"descendant-or-s" +
    "elf\",function(a,b,c,d){var e=new E;fb(b,c,d)&&a.a(b)&&G(e,b);retur" +
    "n gb(a,b,c,d,e)},!1,!0),Pb=R(\"following\",function(a,b,c,d){var e=n" +
    "ew E;do for(var f=b;f=f.nextSibling;)fb(f,c,d)&&a.a(f)&&G(e,f),e=g" +
    "b(a,f,c,d,e);while(b=b.parentNode);return e},!1,!0);R(\"following-s" +
    "ibling\",function(a,b){for(var c=new E,d=b;d=d.nextSibling;)a.a(d)&" +
    "&G(c,d);return c},!1);R(\"namespace\",function(){return new E},!1);\n" +
    "var Xb=R(\"parent\",function(a,b){var c=new E;if(9==b.nodeType)retur" +
    "n c;if(2==b.nodeType)return G(c,b.ownerElement),c;var d=b.parentNo" +
    "de;a.a(d)&&G(c,d);return c},!1),Qb=R(\"preceding\",function(a,b,c,d)" +
    "{var e=new E,f=[];do f.unshift(b);while(b=b.parentNode);for(var h=" +
    "1,k=f.length;h<k;h++){var m=[];for(b=f[h];b=b.previousSibling;)m.u" +
    "nshift(b);for(var p=0,u=m.length;p<u;p++)b=m[p],fb(b,c,d)&&a.a(b)&" +
    "&G(e,b),e=gb(a,b,c,d,e)}return e},!0,!0);\nR(\"preceding-sibling\",fu" +
    "nction(a,b){for(var c=new E,d=b;d=d.previousSibling;)a.a(d)&&mb(c," +
    "d);return c},!0);var Yb=R(\"self\",function(a,b){var c=new E;a.a(b)&" +
    "&G(c,b);return c},!1);/*\n\n The MIT License\n\n Copyright (c) 2007 Cy" +
    "bozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is he" +
    "reby granted, free of charge, to any person obtaining a copy\n of t" +
    "his software and associated documentation files (the \"Software\"), " +
    "to\n deal in the Software without restriction, including without li" +
    "mitation the\n rights to use, copy, modify, merge, publish, distrib" +
    "ute, sublicense, and/or\n sell copies of the Software, and to permi" +
    "t persons to whom the Software is\n furnished to do so, subject to " +
    "the following conditions:\n\n The above copyright notice and this pe" +
    "rmission notice shall be included in\n all copies or substantial po" +
    "rtions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOU" +
    "T WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIM" +
    "ITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICUL" +
    "AR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR " +
    "COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABI" +
    "LITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING" +
    "\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OT" +
    "HER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Zb(a){K.call(this,1);th" +
    "is.c=a;this.j=a.j;this.b=a.b}r(Zb,K);Zb.prototype.a=function(a){re" +
    "turn-N(this.c,a)};Zb.prototype.toString=function(){return\"Unary Ex" +
    "pression: -\"+M(this.c)};/*\n\n The MIT License\n\n Copyright (c) 2007 " +
    "Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is " +
    "hereby granted, free of charge, to any person obtaining a copy\n of" +
    " this software and associated documentation files (the \"Software\")" +
    ", to\n deal in the Software without restriction, including without " +
    "limitation the\n rights to use, copy, modify, merge, publish, distr" +
    "ibute, sublicense, and/or\n sell copies of the Software, and to per" +
    "mit persons to whom the Software is\n furnished to do so, subject t" +
    "o the following conditions:\n\n The above copyright notice and this " +
    "permission notice shall be included in\n all copies or substantial " +
    "portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITH" +
    "OUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT L" +
    "IMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTIC" +
    "ULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS O" +
    "R COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIA" +
    "BILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISI" +
    "NG\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR " +
    "OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction $b(a){K.call(this,4);" +
    "this.c=a;tb(this,va(this.c,function(a){return a.j}));ub(this,va(th" +
    "is.c,function(a){return a.b}))}r($b,K);$b.prototype.a=function(a){" +
    "var b=new E;t(this.c,function(c){c=c.a(a);if(!(c instanceof E))thr" +
    "ow Error(\"Path expression must evaluate to NodeSet.\");b=lb(b,c)});" +
    "return b};$b.prototype.toString=function(){return ua(this.c,functi" +
    "on(a,b){return a+M(b)},\"Union Expression:\")};/*\n\n The MIT License\n" +
    "\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google " +
    "Inc.\n\n Permission is hereby granted, free of charge, to any person" +
    " obtaining a copy\n of this software and associated documentation f" +
    "iles (the \"Software\"), to\n deal in the Software without restrictio" +
    "n, including without limitation the\n rights to use, copy, modify, " +
    "merge, publish, distribute, sublicense, and/or\n sell copies of the" +
    " Software, and to permit persons to whom the Software is\n furnishe" +
    "d to do so, subject to the following conditions:\n\n The above copyr" +
    "ight notice and this permission notice shall be included in\n all c" +
    "opies or substantial portions of the Software.\n\n THE SOFTWARE IS P" +
    "ROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED" +
    ", INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
    " FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT" +
    " SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, " +
    "DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TOR" +
    "T OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SO" +
    "FTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction " +
    "ac(a,b){this.a=a;this.b=b}function bc(a){for(var b,c=[];;){S(a,\"Mi"
  )
      .append(
    "ssing right hand side of binary expression.\");b=cc(a);var d=B(a.a)" +
    ";if(!d)break;var e=(d=Ab[d]||null)&&d.H;if(!e){a.a.a--;break}for(;" +
    "c.length&&e<=c[c.length-1].H;)b=new wb(c.pop(),c.pop(),b);c.push(b" +
    ",d)}for(;c.length;)b=new wb(c.pop(),c.pop(),b);return b}function S" +
    "(a,b){if(eb(a.a))throw Error(b);}function dc(a,b){var c=B(a.a);if(" +
    "c!=b)throw Error(\"Bad token, expected: \"+b+\" got: \"+c);}\nfunction " +
    "ec(a){a=B(a.a);if(\")\"!=a)throw Error(\"Bad token: \"+a);}function fc" +
    "(a){a=B(a.a);if(2>a.length)throw Error(\"Unclosed literal string\");" +
    "return new Hb(a)}function gc(a){var b=B(a.a),c=b.indexOf(\":\");if(-" +
    "1==c)return new Ib(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw " +
    "Error(\"Namespace prefix not declared: \"+d);b=b.substr(c+1);return " +
    "new Ib(b,a)}\nfunction hc(a){var b,c=[],d;if(Ob(A(a.a))){b=B(a.a);d" +
    "=A(a.a);if(\"/\"==b&&(eb(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?" +
    "![0-9])[\\w]/.test(d)))return new Mb;d=new Mb;S(a,\"Missing next loc" +
    "ation step.\");b=ic(a,b);c.push(b)}else{a:{b=A(a.a);d=b.charAt(0);s" +
    "witch(d){case \"$\":throw Error(\"Variable reference not allowed in H" +
    "TML XPath\");case \"(\":B(a.a);b=bc(a);S(a,'unclosed \"(\"');dc(a,\")\");" +
    "break;case '\"':case \"'\":b=fc(a);break;default:if(isNaN(+b))if(!Gb(" +
    "b)&&/(?![0-9])[\\w]/.test(d)&&\"(\"==A(a.a,1)){b=B(a.a);\nb=Fb[b]||nul" +
    "l;B(a.a);for(d=[];\")\"!=A(a.a);){S(a,\"Missing function argument lis" +
    "t.\");d.push(bc(a));if(\",\"!=A(a.a))break;B(a.a)}S(a,\"Unclosed funct" +
    "ion argument list.\");ec(a);b=new Db(b,d)}else{b=null;break a}else " +
    "b=new Jb(+B(a.a))}\"[\"==A(a.a)&&(d=new Rb(jc(a)),b=new Bb(b,d))}if(" +
    "b)if(Ob(A(a.a)))d=b;else return b;else b=ic(a,\"/\"),d=new Nb,c.push" +
    "(b)}for(;Ob(A(a.a));)b=B(a.a),S(a,\"Missing next location step.\"),b" +
    "=ic(a,b),c.push(b);return new Kb(d,c)}\nfunction ic(a,b){var c,d,e;" +
    "if(\"/\"!=b&&\"//\"!=b)throw Error('Step op should be \"/\" or \"//\"');if" +
    "(\".\"==A(a.a))return d=new Sb(Yb,new H(\"node\")),B(a.a),d;if(\"..\"==A" +
    "(a.a))return d=new Sb(Xb,new H(\"node\")),B(a.a),d;var f;if(\"@\"==A(a" +
    ".a))f=Lb,B(a.a),S(a,\"Missing attribute name\");else if(\"::\"==A(a.a," +
    "1)){if(!/(?![0-9])[\\w]/.test(A(a.a).charAt(0)))throw Error(\"Bad to" +
    "ken: \"+B(a.a));c=B(a.a);f=Wb[c]||null;if(!f)throw Error(\"No axis w" +
    "ith name: \"+c);B(a.a);S(a,\"Missing node name\")}else f=Tb;c=A(a.a);" +
    "if(/(?![0-9])[\\w]/.test(c.charAt(0)))if(\"(\"==\nA(a.a,1)){if(!Gb(c))" +
    "throw Error(\"Invalid node type: \"+c);c=B(a.a);if(!Gb(c))throw Erro" +
    "r(\"Invalid type name: \"+c);dc(a,\"(\");S(a,\"Bad nodetype\");e=A(a.a)." +
    "charAt(0);var h=null;if('\"'==e||\"'\"==e)h=fc(a);S(a,\"Bad nodetype\")" +
    ";ec(a);c=new H(c,h)}else c=gc(a);else if(\"*\"==c)c=gc(a);else throw" +
    " Error(\"Bad token: \"+B(a.a));e=new Rb(jc(a),f.a);return d||new Sb(" +
    "f,c,e,\"//\"==b)}\nfunction jc(a){for(var b=[];\"[\"==A(a.a);){B(a.a);S" +
    "(a,\"Missing predicate expression.\");var c=bc(a);b.push(c);S(a,\"Unc" +
    "losed predicate expression.\");dc(a,\"]\")}return b}function cc(a){if" +
    "(\"-\"==A(a.a))return B(a.a),new Zb(cc(a));var b=hc(a);if(\"|\"!=A(a.a" +
    "))a=b;else{for(b=[b];\"|\"==B(a.a);)S(a,\"Missing next union location" +
    " path.\"),b.push(hc(a));a.a.a--;a=new $b(b)}return a};/*\n\n The MIT " +
    "License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012" +
    " Google Inc.\n\n Permission is hereby granted, free of charge, to an" +
    "y person obtaining a copy\n of this software and associated documen" +
    "tation files (the \"Software\"), to\n deal in the Software without re" +
    "striction, including without limitation the\n rights to use, copy, " +
    "modify, merge, publish, distribute, sublicense, and/or\n sell copie" +
    "s of the Software, and to permit persons to whom the Software is\n " +
    "furnished to do so, subject to the following conditions:\n\n The abo" +
    "ve copyright notice and this permission notice shall be included i" +
    "n\n all copies or substantial portions of the Software.\n\n THE SOFTW" +
    "ARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
    " IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTA" +
    "BILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN " +
    "NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY" +
    " CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTR" +
    "ACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WIT" +
    "H THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nf" +
    "unction kc(a,b){if(!a.length)throw Error(\"Empty XPath expression.\"" +
    ");var c=bb(a);if(eb(c))throw Error(\"Invalid XPath expression.\");b?" +
    "fa(b)||(b=ia(b.lookupNamespaceURI,b)):b=aa(null);var d=bc(new ac(c" +
    ",b));if(!eb(c))throw Error(\"Bad token: \"+B(c));this.evaluate=funct" +
    "ion(a,b){var c=d.a(new $a(a));return new T(c,b)}}\nfunction T(a,b){" +
    "if(0==b)if(a instanceof E)b=4;else if(\"string\"==typeof a)b=2;else " +
    "if(\"number\"==typeof a)b=1;else if(\"boolean\"==typeof a)b=3;else thr" +
    "ow Error(\"Unexpected evaluation result.\");if(2!=b&&1!=b&&3!=b&&!(a" +
    " instanceof E))throw Error(\"value could not be converted to the sp" +
    "ecified type\");this.resultType=b;var c;switch(b){case 2:this.strin" +
    "gValue=a instanceof E?ob(a):\"\"+a;break;case 1:this.numberValue=a i" +
    "nstanceof E?+ob(a):+a;break;case 3:this.booleanValue=a instanceof " +
    "E?0<a.u:!!a;break;case 4:case 5:case 6:case 7:var d=\nI(a);c=[];for" +
    "(var e=J(d);e;e=J(d))c.push(e);this.snapshotLength=a.u;this.invali" +
    "dIteratorState=!1;break;case 8:case 9:this.singleNodeValue=nb(a);b" +
    "reak;default:throw Error(\"Unknown XPathResult type.\");}var f=0;thi" +
    "s.iterateNext=function(){if(4!=b&&5!=b)throw Error(\"iterateNext ca" +
    "lled with wrong result type\");return f>=c.length?null:c[f++]};this" +
    ".snapshotItem=function(a){if(6!=b&&7!=b)throw Error(\"snapshotItem " +
    "called with wrong result type\");return a>=c.length||0>a?null:c[a]}" +
    "}T.ANY_TYPE=0;\nT.NUMBER_TYPE=1;T.STRING_TYPE=2;T.BOOLEAN_TYPE=3;T." +
    "UNORDERED_NODE_ITERATOR_TYPE=4;T.ORDERED_NODE_ITERATOR_TYPE=5;T.UN" +
    "ORDERED_NODE_SNAPSHOT_TYPE=6;T.ORDERED_NODE_SNAPSHOT_TYPE=7;T.ANY_" +
    "UNORDERED_NODE_TYPE=8;T.FIRST_ORDERED_NODE_TYPE=9;function lc(a){t" +
    "his.lookupNamespaceURI=qb(a)}\nfunction mc(a){a=a||ba;var b=a.docum" +
    "ent;b.evaluate||(a.XPathResult=T,b.evaluate=function(a,b,e,f){retu" +
    "rn(new kc(a,e)).evaluate(b,f)},b.createExpression=function(a,b){re" +
    "turn new kc(a,b)},b.createNSResolver=function(a){return new lc(a)}" +
    ")}ca(\"wgxpath.install\",mc);/*xxx_rpl_lic*/\nvar U={};U.D=function()" +
    "{var a={T:\"http://www.w3.org/2000/svg\"};return function(b){return " +
    "a[b]||null}}();\nU.v=function(a,b,c){var d=x(a);if(!d.documentEleme" +
    "nt)return null;mc(Ia(d));try{for(var e=d.createNSResolver?d.create" +
    "NSResolver(d.documentElement):U.D,f={},h=d.getElementsByTagName(\"*" +
    "\"),k=0;k<h.length;++k){var m=h[k],p=m.namespaceURI;if(!f[p]){var u" +
    "=m.lookupPrefix(p);if(!u){var F=p.match(\".*/(\\\\w+)/?$\");F?u=F[1]:u" +
    "=\"xhtml\"}f[p]=u}}var w={},C;for(C in f)w[f[C]]=C;e=function(a){ret" +
    "urn w[a]||null};try{return d.evaluate(b,a,e,c,null)}catch(L){if(\"T" +
    "ypeError\"===L.name)return e=d.createNSResolver?d.createNSResolver(" +
    "d.documentElement):\nU.D,d.evaluate(b,a,e,c,null);throw L;}}catch(o" +
    "a){throw new z(32,\"Unable to locate an element with the xpath expr" +
    "ession \"+b+\" because of the following error:\\n\"+oa);}};U.F=functio" +
    "n(a,b){if(!a||1!=a.nodeType)throw new z(32,'The result of the xpat" +
    "h expression \"'+b+'\" is: '+a+\". It should be an element.\");};\nU.M=" +
    "function(a,b){var c=function(){var c=U.v(b,a,9);return c?c.singleN" +
    "odeValue||null:b.selectSingleNode?(c=x(b),c.setProperty&&c.setProp" +
    "erty(\"SelectionLanguage\",\"XPath\"),b.selectSingleNode(a)):null}();n" +
    "ull===c||U.F(c,a);return c};\nU.R=function(a,b){var c=function(){va" +
    "r c=U.v(b,a,7);if(c){for(var e=c.snapshotLength,f=[],h=0;h<e;++h)f" +
    ".push(c.snapshotItem(h));return f}return b.selectNodes?(c=x(b),c.s" +
    "etProperty&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b.selectNod" +
    "es(a)):[]}();t(c,function(b){U.F(b,a)});return c};var nc={aliceblu" +
    "e:\"#f0f8ff\",antiquewhite:\"#faebd7\",aqua:\"#00ffff\",aquamarine:\"#7ff" +
    "fd4\",azure:\"#f0ffff\",beige:\"#f5f5dc\",bisque:\"#ffe4c4\",black:\"#0000" +
    "00\",blanchedalmond:\"#ffebcd\",blue:\"#0000ff\",blueviolet:\"#8a2be2\",b" +
    "rown:\"#a52a2a\",burlywood:\"#deb887\",cadetblue:\"#5f9ea0\",chartreuse:" +
    "\"#7fff00\",chocolate:\"#d2691e\",coral:\"#ff7f50\",cornflowerblue:\"#649" +
    "5ed\",cornsilk:\"#fff8dc\",crimson:\"#dc143c\",cyan:\"#00ffff\",darkblue:" +
    "\"#00008b\",darkcyan:\"#008b8b\",darkgoldenrod:\"#b8860b\",darkgray:\"#a9" +
    "a9a9\",darkgreen:\"#006400\",\ndarkgrey:\"#a9a9a9\",darkkhaki:\"#bdb76b\"," +
    "darkmagenta:\"#8b008b\",darkolivegreen:\"#556b2f\",darkorange:\"#ff8c00" +
    "\",darkorchid:\"#9932cc\",darkred:\"#8b0000\",darksalmon:\"#e9967a\",dark" +
    "seagreen:\"#8fbc8f\",darkslateblue:\"#483d8b\",darkslategray:\"#2f4f4f\"" +
    ",darkslategrey:\"#2f4f4f\",darkturquoise:\"#00ced1\",darkviolet:\"#9400" +
    "d3\",deeppink:\"#ff1493\",deepskyblue:\"#00bfff\",dimgray:\"#696969\",dim" +
    "grey:\"#696969\",dodgerblue:\"#1e90ff\",firebrick:\"#b22222\",floralwhit" +
    "e:\"#fffaf0\",forestgreen:\"#228b22\",fuchsia:\"#ff00ff\",gainsboro:\"#dc" +
    "dcdc\",\nghostwhite:\"#f8f8ff\",gold:\"#ffd700\",goldenrod:\"#daa520\",gra" +
    "y:\"#808080\",green:\"#008000\",greenyellow:\"#adff2f\",grey:\"#808080\",h" +
    "oneydew:\"#f0fff0\",hotpink:\"#ff69b4\",indianred:\"#cd5c5c\",indigo:\"#4" +
    "b0082\",ivory:\"#fffff0\",khaki:\"#f0e68c\",lavender:\"#e6e6fa\",lavender" +
    "blush:\"#fff0f5\",lawngreen:\"#7cfc00\",lemonchiffon:\"#fffacd\",lightbl" +
    "ue:\"#add8e6\",lightcoral:\"#f08080\",lightcyan:\"#e0ffff\",lightgoldenr" +
    "odyellow:\"#fafad2\",lightgray:\"#d3d3d3\",lightgreen:\"#90ee90\",lightg" +
    "rey:\"#d3d3d3\",lightpink:\"#ffb6c1\",lightsalmon:\"#ffa07a\",\nlightseag" +
    "reen:\"#20b2aa\",lightskyblue:\"#87cefa\",lightslategray:\"#778899\",lig" +
    "htslategrey:\"#778899\",lightsteelblue:\"#b0c4de\",lightyellow:\"#ffffe" +
    "0\",lime:\"#00ff00\",limegreen:\"#32cd32\",linen:\"#faf0e6\",magenta:\"#ff" +
    "00ff\",maroon:\"#800000\",mediumaquamarine:\"#66cdaa\",mediumblue:\"#000" +
    "0cd\",mediumorchid:\"#ba55d3\",mediumpurple:\"#9370db\",mediumseagreen:" +
    "\"#3cb371\",mediumslateblue:\"#7b68ee\",mediumspringgreen:\"#00fa9a\",me" +
    "diumturquoise:\"#48d1cc\",mediumvioletred:\"#c71585\",midnightblue:\"#1" +
    "91970\",mintcream:\"#f5fffa\",mistyrose:\"#ffe4e1\",\nmoccasin:\"#ffe4b5\"" +
    ",navajowhite:\"#ffdead\",navy:\"#000080\",oldlace:\"#fdf5e6\",olive:\"#80" +
    "8000\",olivedrab:\"#6b8e23\",orange:\"#ffa500\",orangered:\"#ff4500\",orc" +
    "hid:\"#da70d6\",palegoldenrod:\"#eee8aa\",palegreen:\"#98fb98\",paleturq" +
    "uoise:\"#afeeee\",palevioletred:\"#db7093\",papayawhip:\"#ffefd5\",peach" +
    "puff:\"#ffdab9\",peru:\"#cd853f\",pink:\"#ffc0cb\",plum:\"#dda0dd\",powder" +
    "blue:\"#b0e0e6\",purple:\"#800080\",red:\"#ff0000\",rosybrown:\"#bc8f8f\"," +
    "royalblue:\"#4169e1\",saddlebrown:\"#8b4513\",salmon:\"#fa8072\",sandybr" +
    "own:\"#f4a460\",seagreen:\"#2e8b57\",\nseashell:\"#fff5ee\",sienna:\"#a052" +
    "2d\",silver:\"#c0c0c0\",skyblue:\"#87ceeb\",slateblue:\"#6a5acd\",slategr" +
    "ay:\"#708090\",slategrey:\"#708090\",snow:\"#fffafa\",springgreen:\"#00ff" +
    "7f\",steelblue:\"#4682b4\",tan:\"#d2b48c\",teal:\"#008080\",thistle:\"#d8b" +
    "fd8\",tomato:\"#ff6347\",turquoise:\"#40e0d0\",violet:\"#ee82ee\",wheat:\"" +
    "#f5deb3\",white:\"#ffffff\",whitesmoke:\"#f5f5f5\",yellow:\"#ffff00\",yel" +
    "lowgreen:\"#9acd32\"};/*xxx_rpl_lic*/\nvar oc=\"backgroundColor border" +
    "TopColor borderRightColor borderBottomColor borderLeftColor color " +
    "outlineColor\".split(\" \"),pc=/#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-" +
    "F])/,qc=/^#(?:[0-9a-f]{3}){1,2}$/i,rc=/^(?:rgba)?\\((\\d{1,3}),\\s?(\\" +
    "d{1,3}),\\s?(\\d{1,3}),\\s?(0|1|0\\.\\d*)\\)$/i,sc=/^(?:rgb)?\\((0|[1-9]\\" +
    "d{0,2}),\\s?(0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2})\\)$/i;/*xxx_rpl_lic" +
    "*/\nfunction V(a,b){return!!a&&1==a.nodeType&&(!b||a.tagName.toUppe" +
    "rCase()==b)}function tc(a){return uc(a,!0)&&vc(a)&&\"none\"!=W(a,\"po" +
    "inter-events\")}function wc(a){return V(a,\"OPTION\")?!0:V(a,\"INPUT\")" +
    "?(a=a.type.toLowerCase(),\"checkbox\"==a||\"radio\"==a):!1}function xc" +
    "(a){if(!wc(a))throw new z(15,\"Element is not selectable\");var b=\"s" +
    "elected\",c=a.type&&a.type.toLowerCase();if(\"checkbox\"==c||\"radio\"=" +
    "=c)b=\"checked\";return!!a[b]}var yc=\"BUTTON INPUT OPTGROUP OPTION S" +
    "ELECT TEXTAREA\".split(\" \");\nfunction vc(a){var b=a.tagName.toUpper" +
    "Case();return 0<=ta(yc,b)?a.disabled?!1:a.parentNode&&1==a.parentN" +
    "ode.nodeType&&\"OPTGROUP\"==b||\"OPTION\"==b?vc(a.parentNode):!Oa(a,fu" +
    "nction(a){var b=a.parentNode;if(b&&V(b,\"FIELDSET\")&&b.disabled){if" +
    "(!V(a,\"LEGEND\"))return!0;for(;a=void 0!=a.previousElementSibling?a" +
    ".previousElementSibling:Ja(a.previousSibling);)if(V(a,\"LEGEND\"))re" +
    "turn!0}return!1},!0):!0}\nfunction zc(a){for(a=a.parentNode;a&&1!=a" +
    ".nodeType&&9!=a.nodeType&&11!=a.nodeType;)a=a.parentNode;return V(" +
    "a)?a:null}\nfunction W(a,b){var c=pa(b);if(\"float\"==c||\"cssFloat\"==" +
    "c||\"styleFloat\"==c)c=\"cssFloat\";var d=Sa(a,c)||Ac(a,c);if(null===d" +
    ")d=null;else if(0<=ta(oc,c)){b:{var e=d.match(rc);if(e){var c=Numb" +
    "er(e[1]),f=Number(e[2]),h=Number(e[3]),e=Number(e[4]);if(0<=c&&255" +
    ">=c&&0<=f&&255>=f&&0<=h&&255>=h&&0<=e&&1>=e){c=[c,f,h,e];break b}}" +
    "c=null}if(!c)b:{if(h=d.match(sc))if(c=Number(h[1]),f=Number(h[2])," +
    "h=Number(h[3]),0<=c&&255>=c&&0<=f&&255>=f&&0<=h&&255>=h){c=[c,f,h," +
    "1];break b}c=null}if(!c)b:{c=d.toLowerCase();f=nc[c.toLowerCase()]" +
    ";\nif(!f&&(f=\"#\"==c.charAt(0)?c:\"#\"+c,4==f.length&&(f=f.replace(pc," +
    "\"#$1$1$2$2$3$3\")),!qc.test(f))){c=null;break b}c=[parseInt(f.subst" +
    "r(1,2),16),parseInt(f.substr(3,2),16),parseInt(f.substr(5,2),16),1" +
    "]}d=c?\"rgba(\"+c.join(\", \")+\")\":d}return d}function Ac(a,b){var c=a" +
    ".currentStyle||a.style,d=c[b];!n(d)&&fa(c.getPropertyValue)&&(d=c." +
    "getPropertyValue(b));return\"inherit\"!=d?n(d)?d:null:(c=zc(a))?Ac(c" +
    ",b):null}\nfunction uc(a,b){function c(a){if(\"none\"==W(a,\"display\")" +
    ")return!1;a=zc(a);return!a||c(a)}function d(a){var b=Bc(a);return " +
    "0<b.height&&0<b.width?!0:V(a,\"PATH\")&&(0<b.height||0<b.width)?(a=W" +
    "(a,\"stroke-width\"),!!a&&0<parseInt(a,10)):\"hidden\"!=W(a,\"overflow\"" +
    ")&&va(a.childNodes,function(a){return 3==a.nodeType||V(a)&&d(a)})}" +
    "function e(a){return\"hidden\"==Cc(a)&&wa(a.childNodes,function(a){r" +
    "eturn!V(a)||e(a)})}if(!V(a))throw Error(\"Argument to isShown must " +
    "be of type Element\");if(V(a,\"BODY\"))return!0;if(V(a,\n\"OPTION\")||V(" +
    "a,\"OPTGROUP\")){var f=Oa(a,function(a){return V(a,\"SELECT\")});retur" +
    "n!!f&&uc(f,!0)}return(f=Dc(a))?!!f.G&&0<f.rect.width&&0<f.rect.hei" +
    "ght&&uc(f.G,b):V(a,\"INPUT\")&&\"hidden\"==a.type.toLowerCase()||V(a,\"" +
    "NOSCRIPT\")||\"hidden\"==W(a,\"visibility\")||!c(a)||!b&&0==Ec(a)||!d(a" +
    ")?!1:!e(a)}\nfunction Cc(a,b){function c(a){function b(a){return a=" +
    "=k?!0:0==W(a,\"display\").lastIndexOf(\"inline\",0)||\"absolute\"==c&&\"s" +
    "tatic\"==W(a,\"position\")?!1:!0}var c=W(a,\"position\");if(\"fixed\"==c)" +
    "return u=!0,a==k?null:k;for(a=zc(a);a&&!b(a);)a=zc(a);return a}fun" +
    "ction d(a){var b=a;if(\"visible\"==p)if(a==k&&m)b=m;else if(a==m)ret" +
    "urn{x:\"visible\",y:\"visible\"};b={x:W(b,\"overflow-x\"),y:W(b,\"overflo" +
    "w-y\")};a==k&&(b.x=\"visible\"==b.x?\"auto\":b.x,b.y=\"visible\"==b.y?\"au" +
    "to\":b.y);return b}function e(a){if(a==k){var b=(new Qa(h)).a;\na=b." +
    "body||b.documentElement;b=b.parentWindow||b.defaultView;a=new v(b." +
    "pageXOffset||a.scrollLeft,b.pageYOffset||a.scrollTop)}else a=new v" +
    "(a.scrollLeft,a.scrollTop);return a}for(var f=Fc(a,b),h=x(a),k=h.d" +
    "ocumentElement,m=h.body,p=W(k,\"overflow\"),u,F=c(a);F;F=c(F)){var w" +
    "=d(F);if(\"visible\"!=w.x||\"visible\"!=w.y){var C=Bc(F);if(0==C.width" +
    "||0==C.height)return\"hidden\";var L=f.right<C.left,oa=f.bottom<C.to" +
    "p;if(L&&\"hidden\"==w.x||oa&&\"hidden\"==w.y)return\"hidden\";if(L&&\"vis" +
    "ible\"!=w.x||oa&&\"visible\"!=w.y){L=e(F);\noa=f.bottom<C.top-L.y;if(f" +
    ".right<C.left-L.x&&\"visible\"!=w.x||oa&&\"visible\"!=w.x)return\"hidde" +
    "n\";f=Cc(F);return\"hidden\"==f?\"hidden\":\"scroll\"}L=f.left>=C.left+C." +
    "width;C=f.top>=C.top+C.height;if(L&&\"hidden\"==w.x||C&&\"hidden\"==w." +
    "y)return\"hidden\";if(L&&\"visible\"!=w.x||C&&\"visible\"!=w.y){if(u&&(w" +
    "=e(F),f.left>=k.scrollWidth-w.x||f.right>=k.scrollHeight-w.y))retu" +
    "rn\"hidden\";f=Cc(F);return\"hidden\"==f?\"hidden\":\"scroll\"}}}return\"no" +
    "ne\"}\nfunction Bc(a){var b=Dc(a);if(b)return b.rect;if(V(a,\"HTML\"))" +
    "return a=x(a),a=(Ia(a)||window).document,a=\"CSS1Compat\"==a.compatM" +
    "ode?a.documentElement:a.body,a=new Ca(a.clientWidth,a.clientHeight" +
    "),new y(0,0,a.width,a.height);var c;try{c=a.getBoundingClientRect(" +
    ")}catch(d){return new y(0,0,0,0)}return new y(c.left,c.top,c.right" +
    "-c.left,c.bottom-c.top)}\nfunction Dc(a){var b=V(a,\"MAP\");if(!b&&!V" +
    "(a,\"AREA\"))return null;var c=b?a:V(a.parentNode,\"MAP\")?a.parentNod" +
    "e:null,d=null,e=null;if(c&&c.name&&(d=x(c),d=U.M('/descendant::*[@" +
    "usemap = \"#'+c.name+'\"]',d))&&(e=Bc(d),!b&&\"default\"!=a.shape.toLo" +
    "werCase())){var f=Gc(a);a=Math.min(Math.max(f.left,0),e.width);b=M" +
    "ath.min(Math.max(f.top,0),e.height);c=Math.min(f.width,e.width-a);" +
    "f=Math.min(f.height,e.height-b);e=new y(a+e.left,b+e.top,c,f)}retu" +
    "rn{G:d,rect:e||new y(0,0,0,0)}}\nfunction Gc(a){var b=a.shape.toLow" +
    "erCase();a=a.coords.split(\",\");if(\"rect\"==b&&4==a.length){var b=a[" +
    "0],c=a[1];return new y(b,c,a[2]-b,a[3]-c)}if(\"circle\"==b&&3==a.len" +
    "gth)return b=a[2],new y(a[0]-b,a[1]-b,2*b,2*b);if(\"poly\"==b&&2<a.l" +
    "ength){for(var b=a[0],c=a[1],d=b,e=c,f=2;f+1<a.length;f+=2)b=Math." +
    "min(b,a[f]),d=Math.max(d,a[f]),c=Math.min(c,a[f+1]),e=Math.max(e,a" +
    "[f+1]);return new y(b,c,d-b,e-c)}return new y(0,0,0,0)}\nfunction F" +
    "c(a,b){var c;c=Bc(a);c=new Ra(c.top,c.left+c.width,c.top+c.height," +
    "c.left);if(b){var d=b instanceof y?b:new y(b.x,b.y,1,1);c.left=za(" +
    "c.left+d.left,c.left,c.right);c.top=za(c.top+d.top,c.top,c.bottom)" +
    ";c.right=za(c.left+d.width,c.left,c.right);c.bottom=za(c.top+d.hei" +
    "ght,c.top,c.bottom)}return c}function Ec(a){var b=1,c=W(a,\"opacity" +
    "\");c&&(b=Number(c));(a=zc(a))&&(b*=Ec(a));return b};/*xxx_rpl_lic*" +
    "/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n" +
    "/*xxx_rpl_lic*/\nfunction Hc(){this.a=Ua.document.documentElement;t" +
    "his.f=null;var a=Pa(x(this.a));a&&Ic(this,a)}function Ic(a,b){a.a=" +
    "b;V(b,\"OPTION\")?a.f=Oa(b,function(a){return V(a,\"SELECT\")}):a.f=nu" +
    "ll}\nfunction Jc(a,b,c,d,e,f,h,k){if(!h&&!tc(a.a))return!1;if(e&&Kc" +
    "!=b&&Lc!=b)throw new z(12,\"Event type does not allow related targe" +
    "t: \"+b);c={clientX:c.x,clientY:c.y,button:d,altKey:!1,ctrlKey:!1,s" +
    "hiftKey:!1,metaKey:!1,wheelDelta:f||0,relatedTarget:e||null};k=k||" +
    "1;d=a.a;if(b!=Mc&&b!=Nc&&k in Oc)d=Oc[k];else if(a.f)a:switch(b){c" +
    "ase Mc:case Pc:d=a.f.multiple?a.a:a.f;break a;default:d=a.f.multip" +
    "le?a.a:null}return d?Qc(d,b,c):!0}var Oc={};/*xxx_rpl_lic*/\nXa(4);" +
    "function Rc(a,b,c){this.a=a;this.b=b;this.f=c}Rc.prototype.I=funct" +
    "ion(a){a=x(a).createEvent(\"HTMLEvents\");a.initEvent(this.a,this.b," +
    "this.f);return a};Rc.prototype.toString=g(\"a\");function X(a,b,c){R" +
    "c.call(this,a,b,c)}r(X,Rc);\nX.prototype.I=function(a,b){if(this==S" +
    "c)throw new z(9,\"Browser does not support a mouse pixel scroll eve" +
    "nt.\");var c=x(a),d=Ia(c),c=c.createEvent(\"MouseEvents\");this==Tc&&" +
    "(c.wheelDelta=b.wheelDelta);c.initMouseEvent(this.a,this.b,this.f," +
    "d,1,b.clientX,b.clientY,b.clientX,b.clientY,b.ctrlKey,b.altKey,b.s" +
    "hiftKey,b.metaKey,b.button,b.relatedTarget);return c};\nvar Uc=new " +
    "Rc(\"change\",!0,!1),Mc=new X(\"click\",!0,!0),Vc=new X(\"contextmenu\"," +
    "!0,!0),Wc=new X(\"dblclick\",!0,!0),Nc=new X(\"mousedown\",!0,!0),Xc=n" +
    "ew X(\"mousemove\",!0,!1),Lc=new X(\"mouseout\",!0,!0),Kc=new X(\"mouse" +
    "over\",!0,!0),Pc=new X(\"mouseup\",!0,!0),Tc=new X(\"mousewheel\",!0,!0" +
    "),Sc=new X(\"MozMousePixelScroll\",!0,!0);function Qc(a,b,c){b=b.I(a" +
    ",c);\"isTrusted\"in b||(b.isTrusted=!1);return a.dispatchEvent(b)};v" +
    "ar Yc=\"StopIteration\"in ba?ba.StopIteration:{message:\"StopIteratio" +
    "n\",stack:\"\"};function Zc(){}Zc.prototype.a=function(){throw Yc;};Z" +
    "c.prototype.L=function(){return this};function $c(a,b){this.w={};t" +
    "his.l=[];this.b=this.a=0;var c=arguments.length;if(1<c){if(c%2)thr" +
    "ow Error(\"Uneven number of arguments\");for(var d=0;d<c;d+=2)ad(thi" +
    "s,arguments[d],arguments[d+1])}else if(a){var e;if(a instanceof $c" +
    ")for(d=bd(a),cd(a),e=[],c=0;c<a.l.length;c++)e.push(a.w[a.l[c]]);e" +
    "lse{var c=[],f=0;for(d in a)c[f++]=d;d=c;c=[];f=0;for(e in a)c[f++" +
    "]=a[e];e=c}for(c=0;c<d.length;c++)ad(this,d[c],e[c])}}function bd(" +
    "a){cd(a);return a.l.concat()}l=$c.prototype;\nl.clear=function(){th" +
    "is.w={};this.b=this.a=this.l.length=0};function cd(a){if(a.a!=a.l." +
    "length){for(var b=0,c=0;b<a.l.length;){var d=a.l[b];Object.prototy" +
    "pe.hasOwnProperty.call(a.w,d)&&(a.l[c++]=d);b++}a.l.length=c}if(a." +
    "a!=a.l.length){for(var e={},c=b=0;b<a.l.length;)d=a.l[b],Object.pr" +
    "ototype.hasOwnProperty.call(e,d)||(a.l[c++]=d,e[d]=1),b++;a.l.leng" +
    "th=c}}l.get=function(a,b){return Object.prototype.hasOwnProperty.c" +
    "all(this.w,a)?this.w[a]:b};\nfunction ad(a,b,c){Object.prototype.ha" +
    "sOwnProperty.call(a.w,b)||(a.a++,a.l.push(b),a.b++);a.w[b]=c}l.for" +
    "Each=function(a,b){for(var c=bd(this),d=0;d<c.length;d++){var e=c[" +
    "d],f=this.get(e);a.call(b,f,e,this)}};l.clone=function(){return ne" +
    "w $c(this)};l.L=function(a){cd(this);var b=0,c=this.b,d=this,e=new" +
    " Zc;e.a=function(){if(c!=d.b)throw Error(\"The map has changed sinc" +
    "e the iterator was created\");if(b>=d.l.length)throw Yc;var e=d.l[b" +
    "++];return a?e:d.w[e]};return e};/*xxx_rpl_lic*/\nvar dd={};functio" +
    "n Y(a,b,c){var d=typeof a;(\"object\"==d&&null!=a||\"function\"==d)&&(" +
    "a=a.g);a=new ed(a);!b||b in dd&&!c||(dd[b]={key:a,shift:!1},c&&(dd" +
    "[c]={key:a,shift:!0}));return a}function ed(a){this.code=a}Y(8);Y(" +
    "9);Y(13);var fd=Y(16),gd=Y(17),hd=Y(18);Y(19);Y(20);Y(27);Y(32,\" \"" +
    ");Y(33);Y(34);Y(35);Y(36);Y(37);Y(38);Y(39);Y(40);Y(44);Y(45);Y(46" +
    ");Y(48,\"0\",\")\");Y(49,\"1\",\"!\");Y(50,\"2\",\"@\");Y(51,\"3\",\"#\");Y(52,\"4\"" +
    ",\"$\");Y(53,\"5\",\"%\");Y(54,\"6\",\"^\");Y(55,\"7\",\"&\");Y(56,\"8\",\"*\");Y(57" +
    ",\"9\",\"(\");Y(65,\"a\",\"A\");\nY(66,\"b\",\"B\");Y(67,\"c\",\"C\");Y(68,\"d\",\"D\")" +
    ";Y(69,\"e\",\"E\");Y(70,\"f\",\"F\");Y(71,\"g\",\"G\");Y(72,\"h\",\"H\");Y(73,\"i\"," +
    "\"I\");Y(74,\"j\",\"J\");Y(75,\"k\",\"K\");Y(76,\"l\",\"L\");Y(77,\"m\",\"M\");Y(78," +
    "\"n\",\"N\");Y(79,\"o\",\"O\");Y(80,\"p\",\"P\");Y(81,\"q\",\"Q\");Y(82,\"r\",\"R\");Y" +
    "(83,\"s\",\"S\");Y(84,\"t\",\"T\");Y(85,\"u\",\"U\");Y(86,\"v\",\"V\");Y(87,\"w\",\"W" +
    "\");Y(88,\"x\",\"X\");Y(89,\"y\",\"Y\");Y(90,\"z\",\"Z\");var id=Y(Ha?{i:91,g:9" +
    "1}:Ga?{i:224,g:91}:{i:0,g:91});Y(Ha?{i:92,g:92}:Ga?{i:224,g:93}:{i" +
    ":0,g:92});Y(Ha?{i:93,g:93}:Ga?{i:0,g:0}:{i:93,g:null});\nY({i:96,g:" +
    "96},\"0\");Y({i:97,g:97},\"1\");Y({i:98,g:98},\"2\");Y({i:99,g:99},\"3\");" +
    "Y({i:100,g:100},\"4\");Y({i:101,g:101},\"5\");Y({i:102,g:102},\"6\");Y({" +
    "i:103,g:103},\"7\");Y({i:104,g:104},\"8\");Y({i:105,g:105},\"9\");Y({i:1" +
    "06,g:106},\"*\");Y({i:107,g:107},\"+\");Y({i:109,g:109},\"-\");Y({i:110," +
    "g:110},\".\");Y({i:111,g:111},\"/\");Y(144);Y(112);Y(113);Y(114);Y(115" +
    ");Y(116);Y(117);Y(118);Y(119);Y(120);Y(121);Y(122);Y(123);Y({i:107" +
    ",g:187},\"=\",\"+\");Y(108,\",\");Y({i:109,g:189},\"-\",\"_\");Y(188,\",\",\"<\"" +
    ");Y(190,\".\",\">\");Y(191,\"/\",\"?\");\nY(192,\"`\",\"~\");Y(219,\"[\",\"{\");Y(2" +
    "20,\"\\\\\",\"|\");Y(221,\"]\",\"}\");Y({i:59,g:186},\";\",\":\");Y(222,\"'\",'\"')" +
    ";var jd=new $c;ad(jd,1,fd);ad(jd,2,gd);ad(jd,4,hd);ad(jd,8,id);(fu" +
    "nction(a){var b=new $c;t(bd(a),function(c){ad(b,a.get(c).code,c)})" +
    ";return b})(jd);/*xxx_rpl_lic*/\nfunction kd(a){Hc.call(this);this." +
    "s=this.b=null;this.c=new v(0,0);this.A=this.h=!1;if(a){ea(a.button" +
    "Pressed)&&(this.b=a.buttonPressed);try{V(a.elementPressed)&&(this." +
    "s=a.elementPressed)}catch(b){this.b=null}this.c=new v(a.clientXY.x" +
    ",a.clientXY.y);this.h=!!a.nextClickIsDoubleClick;this.A=!!a.hasEve" +
    "rInteracted;try{a.element&&V(a.element)&&Ic(this,a.element)}catch(" +
    "c){this.b=null}}}r(kd,Hc);var Z={};Z[Mc]=[0,1,2,null];Z[Vc]=[null," +
    "null,2,null];Z[Pc]=[0,1,2,null];Z[Lc]=[0,1,2,0];Z[Xc]=[0,1,2,0];Z[" +
    "Wc]=Z[Mc];\nZ[Nc]=Z[Pc];Z[Kc]=Z[Lc];function ld(a,b,c,d,e){a.A=!0;r" +
    "eturn Jc(a,b,a.c,md(a,b),c,d,e)}function md(a,b){if(!(b in Z))retu" +
    "rn 0;var c=Z[b][null===a.b?3:a.b];if(null===c)throw new z(13,\"Even" +
    "t does not permit the specified mouse button.\");return c};/*xxx_rp" +
    "l_lic*/\n/*xxx_rpl_lic*/\nfunction nd(a){var b;(b=Sa(a,\"display\"))||" +
    "(b=a.currentStyle?a.currentStyle.display:null);if(\"none\"!=(b||a.st" +
    "yle&&a.style.display))b=Ta(a);else{b=a.style;var c=b.display,d=b.v" +
    "isibility,e=b.position;b.visibility=\"hidden\";b.position=\"absolute\"" +
    ";b.display=\"inline\";var f=Ta(a);b.display=c;b.position=e;b.visibil" +
    "ity=d;b=f}return 0<b.width&&0<b.height||!a.offsetParent?b:nd(a.off" +
    "setParent)};ca(\"_\",function(a,b,c){if(!uc(a,!0))throw new z(11,\"El" +
    "ement is not currently visible and may not be manipulated\");b:{var" +
    " d=b||void 0;if(\"scroll\"==Cc(a,d)){if(a.scrollIntoView&&(a.scrollI" +
    "ntoView(),\"none\"==Cc(a,d)))break b;for(var e=Fc(a,d),f=zc(a);f;f=z" +
    "c(f)){var h=f,k=Bc(h),m,p=h,u=m=void 0,F=void 0,w=void 0,w=Sa(p,\"b" +
    "orderLeftWidth\"),F=Sa(p,\"borderRightWidth\"),u=Sa(p,\"borderTopWidth" +
    "\");m=Sa(p,\"borderBottomWidth\");m=new Ra(parseFloat(u),parseFloat(F" +
    "),parseFloat(m),parseFloat(w));p=e.left-k.left-m.left;\nk=e.top-k.t" +
    "op-m.top;m=h.clientHeight+e.top-e.bottom;h.scrollLeft+=Math.min(p," +
    "Math.max(p-(h.clientWidth+e.left-e.right),0));h.scrollTop+=Math.mi" +
    "n(k,Math.max(k-m,0))}Cc(a,d)}}b?b=new Aa(b.x,b.y):(b=nd(a),b=new A" +
    "a(b.width/2,b.height/2));c=c||new kd;d=b;b=tc(a);e=Bc(a);c.c.x=d.x" +
    "+e.left;c.c.y=d.y+e.top;d=c.a;if(a!=d){try{Ia(x(d)).closed&&(d=nul" +
    "l)}catch(C){d=null}d&&(e=d===Ua.document.documentElement||d===Ua.d" +
    "ocument.body,d=!c.A&&e?null:d,ld(c,Lc,a));Ic(c,a);ld(c,Kc,d,null,b" +
    ")}ld(c,Xc,null,null,b);c.h=!1;\nif(null!==c.b)throw new z(13,\"Canno" +
    "t press more then one button or an already pressed button.\");c.b=0" +
    ";c.s=c.a;if(V(c.a,\"OPTION\")||V(c.a,\"SELECT\")||ld(c,Nc))if(a=c.f||c" +
    ".a,b=Pa(x(a)),a!=b){if(b&&fa(b.blur)&&!V(b,\"BODY\"))try{b.blur()}ca" +
    "tch(L){throw L;}fa(a.focus)&&a.focus()}if(null===c.b)throw new z(1" +
    "3,\"Cannot release a button when no button is pressed.\");c.f&&tc(c." +
    "a)&&(a=c.f,b=xc(c.a),!b||a.multiple)&&(c.a.selected=!b,a.multiple&" +
    "&!Xa(4)||Qc(a,Uc));a=tc(c.a);ld(c,Pc);if(0==c.b&&c.a==c.s){b=c.c;d" +
    "=md(c,\nMc);if(a||tc(c.a))!c.f&&wc(c.a)&&xc(c.a),Jc(c,Mc,b,d,null,0" +
    ",a,void 0);c.h&&ld(c,Wc);c.h=!c.h}else 2==c.b&&ld(c,Vc);Oc={};c.b=" +
    "null;c.s=null});;return this._.apply(null,arguments);}).apply({nav" +
    "igator:typeof window!=\"undefined\"?window.navigator:null},arguments" +
    ");}\n"
  )
  .toString();
  static final String CLICK_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String CLICK_ANDROID_original() {
    return CLICK_ANDROID.replaceAll("xxx_rpl_lic", CLICK_ANDROID_license);
  }

/* field: FIND_ELEMENT_ANDROID license: 

 Copyright 2014 Software Freedom Conservancy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
  static final String FIND_ELEMENT_ANDROID =
  new StringBuilder(
    "function(){return(function(){function k(a){return function(){retur" +
    "n this[a]}}function n(a){return function(){return a}}var aa=this;f" +
    "unction ba(a,b){var c=a.split(\".\"),d=aa;c[0]in d||!d.execScript||d" +
    ".execScript(\"var \"+c[0]);for(var e;c.length&&(e=c.shift());)c.leng" +
    "th||void 0===b?d[e]?d=d[e]:d=d[e]={}:d[e]=b}\nfunction ca(a){var b=" +
    "typeof a;if(\"object\"==b)if(a){if(a instanceof Array)return\"array\";" +
    "if(a instanceof Object)return b;var c=Object.prototype.toString.ca" +
    "ll(a);if(\"[object Window]\"==c)return\"object\";if(\"[object Array]\"==" +
    "c||\"number\"==typeof a.length&&\"undefined\"!=typeof a.splice&&\"undef" +
    "ined\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"spl" +
    "ice\"))return\"array\";if(\"[object Function]\"==c||\"undefined\"!=typeof" +
    " a.call&&\"undefined\"!=typeof a.propertyIsEnumerable&&!a.propertyIs" +
    "Enumerable(\"call\"))return\"function\"}else return\"null\";\nelse if(\"fu" +
    "nction\"==b&&\"undefined\"==typeof a.call)return\"object\";return b}fun" +
    "ction q(a){return\"string\"==typeof a}function da(a){return\"function" +
    "\"==ca(a)}function ea(a,b,c){return a.call.apply(a.bind,arguments)}" +
    "function fa(a,b,c){if(!a)throw Error();if(2<arguments.length){var " +
    "d=Array.prototype.slice.call(arguments,2);return function(){var c=" +
    "Array.prototype.slice.call(arguments);Array.prototype.unshift.appl" +
    "y(c,d);return a.apply(b,c)}}return function(){return a.apply(b,arg" +
    "uments)}}\nfunction ga(a,b,c){ga=Function.prototype.bind&&-1!=Funct" +
    "ion.prototype.bind.toString().indexOf(\"native code\")?ea:fa;return " +
    "ga.apply(null,arguments)}function ha(a,b){var c=Array.prototype.sl" +
    "ice.call(arguments,1);return function(){var b=c.slice();b.push.app" +
    "ly(b,arguments);return a.apply(this,b)}}\nfunction r(a,b){function " +
    "c(){}c.prototype=b.prototype;a.P=b.prototype;a.prototype=new c;a.p" +
    "rototype.constructor=a;a.O=function(a,c,f){for(var g=Array(argumen" +
    "ts.length-2),h=2;h<arguments.length;h++)g[h-2]=arguments[h];return" +
    " b.prototype[c].apply(a,g)}}Function.prototype.bind=Function.proto" +
    "type.bind||function(a,b){if(1<arguments.length){var c=Array.protot" +
    "ype.slice.call(arguments,1);c.unshift(this,a);return ga.apply(null" +
    ",c)}return ga(this,a)};function ia(a){if(Error.captureStackTrace)E" +
    "rror.captureStackTrace(this,ia);else{var b=Error().stack;b&&(this." +
    "stack=b)}a&&(this.message=String(a))}r(ia,Error);ia.prototype.name" +
    "=\"CustomError\";var ja;function ka(a){var b=a.length-1;return 0<=b&" +
    "&a.indexOf(\" \",b)==b}function la(a,b){for(var c=a.split(\"%s\"),d=\"\"" +
    ",e=Array.prototype.slice.call(arguments,1);e.length&&1<c.length;)d" +
    "+=c.shift()+e.shift();return d+c.join(\"%s\")}var ma=String.prototyp" +
    "e.trim?function(a){return a.trim()}:function(a){return a.replace(/" +
    "^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function na(a,b){return a<b?-1:a>b?1:" +
    "0}function oa(a){return String(a).replace(/\\-([a-z])/g,function(a," +
    "c){return c.toUpperCase()})};function pa(a,b){b.unshift(a);ia.call" +
    "(this,la.apply(null,b));b.shift()}r(pa,ia);pa.prototype.name=\"Asse" +
    "rtionError\";function qa(a,b,c){if(!a){var d=\"Assertion failed\";if(" +
    "b)var d=d+(\": \"+b),e=Array.prototype.slice.call(arguments,2);throw" +
    " new pa(\"\"+d,e||[]);}};var ra=Array.prototype;function sa(a,b){if(" +
    "q(a))return q(b)&&1==b.length?a.indexOf(b,0):-1;for(var c=0;c<a.le" +
    "ngth;c++)if(c in a&&a[c]===b)return c;return-1}function t(a,b){for" +
    "(var c=a.length,d=q(a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.call(vo" +
    "id 0,d[e],e,a)}function ta(a,b){for(var c=a.length,d=[],e=0,f=q(a)" +
    "?a.split(\"\"):a,g=0;g<c;g++)if(g in f){var h=f[g];b.call(void 0,h,g" +
    ",a)&&(d[e++]=h)}return d}function ua(a,b,c){var d=c;t(a,function(c" +
    ",f){d=b.call(void 0,d,c,f,a)});return d}\nfunction va(a,b){for(var " +
    "c=a.length,d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void" +
    " 0,d[e],e,a))return!0;return!1}function wa(a,b){for(var c=a.length" +
    ",d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&!b.call(void 0,d[e],e" +
    ",a))return!1;return!0}function xa(a,b){var c;a:{c=a.length;for(var" +
    " d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e," +
    "a)){c=e;break a}c=-1}return 0>c?null:q(a)?a.charAt(c):a[c]}functio" +
    "n ya(a){return ra.concat.apply(ra,arguments)}\nfunction za(a,b,c){q" +
    "a(null!=a.length);return 2>=arguments.length?ra.slice.call(a,b):ra" +
    ".slice.call(a,b,c)};function Aa(a){var b=arguments.length;if(1==b&" +
    "&\"array\"==ca(arguments[0]))return Aa.apply(null,arguments[0]);for(" +
    "var c={},d=0;d<b;d++)c[arguments[d]]=!0;return c};/*xxx_rpl_lic*/\n" +
    "var Ba=window;Aa(\"area base br col command embed hr img input keyg" +
    "en link meta param source track wbr\".split(\" \"));function u(a,b){t" +
    "his.x=void 0!==a?a:0;this.y=void 0!==b?b:0}u.prototype.clone=funct" +
    "ion(){return new u(this.x,this.y)};u.prototype.toString=function()" +
    "{return\"(\"+this.x+\", \"+this.y+\")\"};u.prototype.ceil=function(){thi" +
    "s.x=Math.ceil(this.x);this.y=Math.ceil(this.y);return this};u.prot" +
    "otype.floor=function(){this.x=Math.floor(this.x);this.y=Math.floor" +
    "(this.y);return this};u.prototype.round=function(){this.x=Math.rou" +
    "nd(this.x);this.y=Math.round(this.y);return this};function v(a,b){" +
    "this.width=a;this.height=b}v.prototype.clone=function(){return new" +
    " v(this.width,this.height)};v.prototype.toString=function(){return" +
    "\"(\"+this.width+\" x \"+this.height+\")\"};v.prototype.ceil=function(){" +
    "this.width=Math.ceil(this.width);this.height=Math.ceil(this.height" +
    ");return this};v.prototype.floor=function(){this.width=Math.floor(" +
    "this.width);this.height=Math.floor(this.height);return this};\nv.pr" +
    "ototype.round=function(){this.width=Math.round(this.width);this.he" +
    "ight=Math.round(this.height);return this};var Ca;a:{var Da=aa.navi" +
    "gator;if(Da){var Ea=Da.userAgent;if(Ea){Ca=Ea;break a}}Ca=\"\"};func" +
    "tion w(a){return a?new Fa(x(a)):ja||(ja=new Fa)}function Ga(a){for" +
    "(;a&&1!=a.nodeType;)a=a.previousSibling;return a}function Ha(a,b){" +
    "if(a.contains&&1==b.nodeType)return a==b||a.contains(b);if(\"undefi" +
    "ned\"!=typeof a.compareDocumentPosition)return a==b||Boolean(a.comp" +
    "areDocumentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==" +
    "a}\nfunction Ia(a,b){if(a==b)return 0;if(a.compareDocumentPosition)" +
    "return a.compareDocumentPosition(b)&2?1:-1;if(\"sourceIndex\"in a||a" +
    ".parentNode&&\"sourceIndex\"in a.parentNode){var c=1==a.nodeType,d=1" +
    "==b.nodeType;if(c&&d)return a.sourceIndex-b.sourceIndex;var e=a.pa" +
    "rentNode,f=b.parentNode;return e==f?Ja(a,b):!c&&Ha(e,b)?-1*Ka(a,b)" +
    ":!d&&Ha(f,a)?Ka(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b.sourceIn" +
    "dex:f.sourceIndex)}d=x(a);c=d.createRange();c.selectNode(a);c.coll" +
    "apse(!0);d=d.createRange();d.selectNode(b);\nd.collapse(!0);return " +
    "c.compareBoundaryPoints(aa.Range.START_TO_END,d)}function Ka(a,b){" +
    "var c=a.parentNode;if(c==b)return-1;for(var d=b;d.parentNode!=c;)d" +
    "=d.parentNode;return Ja(d,a)}function Ja(a,b){for(var c=b;c=c.prev" +
    "iousSibling;)if(c==a)return-1;return 1}function x(a){qa(a,\"Node ca" +
    "nnot be null or undefined.\");return 9==a.nodeType?a:a.ownerDocumen" +
    "t||a.document}function La(a,b){a=a.parentNode;for(var c=0;a;){qa(\"" +
    "parentNode\"!=a.name);if(b(a))return a;a=a.parentNode;c++}return nu" +
    "ll}\nfunction Fa(a){this.a=a||aa.document||document}\nfunction y(a,b" +
    ",c,d){a=d||a.a;var e=b&&\"*\"!=b?b.toUpperCase():\"\";if(a.querySelect" +
    "orAll&&a.querySelector&&(e||c))c=a.querySelectorAll(e+(c?\".\"+c:\"\")" +
    ");else if(c&&a.getElementsByClassName)if(b=a.getElementsByClassNam" +
    "e(c),e){a={};for(var f=d=0,g;g=b[f];f++)e==g.nodeName&&(a[d++]=g);" +
    "a.length=d;c=a}else c=b;else if(b=a.getElementsByTagName(e||\"*\"),c" +
    "){a={};for(f=d=0;g=b[f];f++){var e=g.className,h;if(h=\"function\"==" +
    "typeof e.split)h=0<=sa(e.split(/\\s+/),c);h&&(a[d++]=g)}a.length=d;" +
    "c=a}else c=b;return c};/*xxx_rpl_lic*/\nfunction z(a,b){this.a=Ma[a" +
    "]||\"unknown error\";this.message=b||\"\";var c=this.a.replace(/((?:^|" +
    "\\s+)[a-z])/g,function(a){return a.toUpperCase().replace(/^[\\s\\xa0]" +
    "+/g,\"\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+=\"Error\";" +
    "this.name=c;c=Error(this.message);c.name=this.name;this.stack=c.st" +
    "ack||\"\"}r(z,Error);\nvar Ma={15:\"element not selectable\",11:\"elemen" +
    "t not visible\",31:\"ime engine activation failed\",30:\"ime not avail" +
    "able\",24:\"invalid cookie domain\",29:\"invalid element coordinates\"," +
    "12:\"invalid element state\",32:\"invalid selector\",51:\"invalid selec" +
    "tor\",52:\"invalid selector\",17:\"javascript error\",405:\"unsupported " +
    "operation\",34:\"move target out of bounds\",27:\"no such alert\",7:\"no" +
    " such element\",8:\"no such frame\",23:\"no such window\",28:\"script ti" +
    "meout\",33:\"session not created\",10:\"stale element reference\",\n0:\"s" +
    "uccess\",21:\"timeout\",25:\"unable to set cookie\",26:\"unexpected aler" +
    "t open\",13:\"unknown error\",9:\"unknown command\"};z.prototype.toStri" +
    "ng=function(){return this.name+\": \"+this.message};/*xxx_rpl_lic*/\n" +
    "var Na={w:function(a){return!(!a.querySelectorAll||!a.querySelecto" +
    "r)},o:function(a,b){if(!a)throw new z(32,\"No class name specified\"" +
    ");a=ma(a);if(-1!==a.indexOf(\" \"))throw new z(32,\"Compound class na" +
    "mes not permitted\");if(Na.w(b))try{return b.querySelector(\".\"+a.re" +
    "place(/\\./g,\"\\\\.\"))||null}catch(c){throw new z(32,\"An invalid or i" +
    "llegal class name was specified\");}var d=y(w(b),\"*\",a,b);return d." +
    "length?d[0]:null},s:function(a,b){if(!a)throw new z(32,\"No class n" +
    "ame specified\");a=ma(a);if(-1!==a.indexOf(\" \"))throw new z(32,\n\"Co" +
    "mpound class names not permitted\");if(Na.w(b))try{return b.querySe" +
    "lectorAll(\".\"+a.replace(/\\./g,\"\\\\.\"))}catch(c){throw new z(32,\"An " +
    "invalid or illegal class name was specified\");}return y(w(b),\"*\",a" +
    ",b)}};function Oa(a){return(a=a.exec(Ca))?a[1]:\"\"}Oa(/Android\\s+([" +
    "0-9.]+)/)||Oa(/Version\\/([0-9.]+)/);/*xxx_rpl_lic*/\nfunction Pa(a)" +
    "{var b=0,c=ma(String(Qa)).split(\".\");a=ma(String(a)).split(\".\");fo" +
    "r(var d=Math.max(c.length,a.length),e=0;0==b&&e<d;e++){var f=c[e]|" +
    "|\"\",g=a[e]||\"\",h=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),p=RegExp(\"(\\\\d*)(\\\\D*)" +
    "\",\"g\");do{var m=h.exec(f)||[\"\",\"\",\"\"],l=p.exec(g)||[\"\",\"\",\"\"];if(0" +
    "==m[0].length&&0==l[0].length)break;b=na(0==m[1].length?0:parseInt" +
    "(m[1],10),0==l[1].length?0:parseInt(l[1],10))||na(0==m[2].length,0" +
    "==l[2].length)||na(m[2],l[2])}while(0==b)}}\nvar Ra=/Android\\s+([0-" +
    "9\\.]+)/.exec(Ca),Qa=Ra?Ra[1]:\"0\";Pa(2.3);Pa(4);/*xxx_rpl_lic*/\nvar" +
    " Sa={o:function(a,b){da(b.querySelector);if(!a)throw new z(32,\"No " +
    "selector specified\");a=ma(a);var c;try{c=b.querySelector(a)}catch(" +
    "d){throw new z(32,\"An invalid or illegal selector was specified\");" +
    "}return c&&1==c.nodeType?c:null},s:function(a,b){da(b.querySelecto" +
    "rAll);if(!a)throw new z(32,\"No selector specified\");a=ma(a);try{re" +
    "turn b.querySelectorAll(a)}catch(c){throw new z(32,\"An invalid or " +
    "illegal selector was specified\");}}};function Ta(a,b,c,d){this.top" +
    "=a;this.right=b;this.bottom=c;this.left=d}Ta.prototype.clone=funct" +
    "ion(){return new Ta(this.top,this.right,this.bottom,this.left)};Ta" +
    ".prototype.toString=function(){return\"(\"+this.top+\"t, \"+this.right" +
    "+\"r, \"+this.bottom+\"b, \"+this.left+\"l)\"};Ta.prototype.ceil=functio" +
    "n(){this.top=Math.ceil(this.top);this.right=Math.ceil(this.right);" +
    "this.bottom=Math.ceil(this.bottom);this.left=Math.ceil(this.left);" +
    "return this};\nTa.prototype.floor=function(){this.top=Math.floor(th" +
    "is.top);this.right=Math.floor(this.right);this.bottom=Math.floor(t" +
    "his.bottom);this.left=Math.floor(this.left);return this};Ta.protot" +
    "ype.round=function(){this.top=Math.round(this.top);this.right=Math" +
    ".round(this.right);this.bottom=Math.round(this.bottom);this.left=M" +
    "ath.round(this.left);return this};function A(a,b,c,d){this.left=a;" +
    "this.top=b;this.width=c;this.height=d}A.prototype.clone=function()" +
    "{return new A(this.left,this.top,this.width,this.height)};A.protot" +
    "ype.toString=function(){return\"(\"+this.left+\", \"+this.top+\" - \"+th" +
    "is.width+\"w x \"+this.height+\"h)\"};A.prototype.ceil=function(){this" +
    ".left=Math.ceil(this.left);this.top=Math.ceil(this.top);this.width" +
    "=Math.ceil(this.width);this.height=Math.ceil(this.height);return t" +
    "his};\nA.prototype.floor=function(){this.left=Math.floor(this.left)" +
    ";this.top=Math.floor(this.top);this.width=Math.floor(this.width);t" +
    "his.height=Math.floor(this.height);return this};A.prototype.round=" +
    "function(){this.left=Math.round(this.left);this.top=Math.round(thi" +
    "s.top);this.width=Math.round(this.width);this.height=Math.round(th" +
    "is.height);return this};/*\n\n The MIT License\n\n Copyright (c) 2007 " +
    "Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is " +
    "hereby granted, free of charge, to any person obtaining a copy\n of" +
    " this software and associated documentation files (the \"Software\")" +
    ", to\n deal in the Software without restriction, including without " +
    "limitation the\n rights to use, copy, modify, merge, publish, distr" +
    "ibute, sublicense, and/or\n sell copies of the Software, and to per" +
    "mit persons to whom the Software is\n furnished to do so, subject t" +
    "o the following conditions:\n\n The above copyright notice and this " +
    "permission notice shall be included in\n all copies or substantial " +
    "portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITH" +
    "OUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT L" +
    "IMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTIC" +
    "ULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS O" +
    "R COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIA" +
    "BILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISI" +
    "NG\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR " +
    "OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Ua(a,b,c){this.a=a;th" +
    "is.b=b||1;this.f=c||1};/*\n\n The MIT License\n\n Copyright (c) 2007 C" +
    "ybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is h" +
    "ereby granted, free of charge, to any person obtaining a copy\n of " +
    "this software and associated documentation files (the \"Software\")," +
    " to\n deal in the Software without restriction, including without l" +
    "imitation the\n rights to use, copy, modify, merge, publish, distri" +
    "bute, sublicense, and/or\n sell copies of the Software, and to perm" +
    "it persons to whom the Software is\n furnished to do so, subject to" +
    " the following conditions:\n\n The above copyright notice and this p" +
    "ermission notice shall be included in\n all copies or substantial p" +
    "ortions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHO" +
    "UT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LI" +
    "MITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICU" +
    "LAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR" +
    " COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIAB" +
    "ILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISIN" +
    "G\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR O" +
    "THER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyrigh" +
    "t (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Per" +
    "mission is hereby granted, free of charge, to any person obtaining" +
    " a copy\n of this software and associated documentation files (the " +
    "\"Software\"), to\n deal in the Software without restriction, includi" +
    "ng without limitation the\n rights to use, copy, modify, merge, pub" +
    "lish, distribute, sublicense, and/or\n sell copies of the Software," +
    " and to permit persons to whom the Software is\n furnished to do so" +
    ", subject to the following conditions:\n\n The above copyright notic" +
    "e and this permission notice shall be included in\n all copies or s" +
    "ubstantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"A" +
    "S IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDIN" +
    "G BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS F" +
    "OR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE" +
    "\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR" +
    " OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHER" +
    "WISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR " +
    "THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT Licens" +
    "e\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Googl" +
    "e Inc.\n\n Permission is hereby granted, free of charge, to any pers" +
    "on obtaining a copy\n of this software and associated documentation" +
    " files (the \"Software\"), to\n deal in the Software without restrict" +
    "ion, including without limitation the\n rights to use, copy, modify" +
    ", merge, publish, distribute, sublicense, and/or\n sell copies of t" +
    "he Software, and to permit persons to whom the Software is\n furnis" +
    "hed to do so, subject to the following conditions:\n\n The above cop" +
    "yright notice and this permission notice shall be included in\n all" +
    " copies or substantial portions of the Software.\n\n THE SOFTWARE IS" +
    " PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLI" +
    "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY" +
    ",\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVE" +
    "NT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM" +
    ", DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, T" +
    "ORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE " +
    "SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunctio" +
    "n Va(a){this.b=a;this.a=0}function Wa(a){a=a.match(Xa);for(var b=0" +
    ";b<a.length;b++)Ya.test(a[b])&&a.splice(b,1);return new Va(a)}var " +
    "Xa=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\." +
    "\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\"," +
    "\"g\"),Ya=/^\\s/;function C(a,b){return a.b[a.a+(b||0)]}function D(a)" +
    "{return a.b[a.a++]}function Za(a){return a.b.length<=a.a};/*\n\n The" +
    " MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c)" +
    " 2012 Google Inc.\n\n Permission is hereby granted, free of charge, " +
    "to any person obtaining a copy\n of this software and associated do" +
    "cumentation files (the \"Software\"), to\n deal in the Software witho" +
    "ut restriction, including without limitation the\n rights to use, c" +
    "opy, modify, merge, publish, distribute, sublicense, and/or\n sell " +
    "copies of the Software, and to permit persons to whom the Software" +
    " is\n furnished to do so, subject to the following conditions:\n\n Th" +
    "e above copyright notice and this permission notice shall be inclu" +
    "ded in\n all copies or substantial portions of the Software.\n\n THE " +
    "SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRES" +
    "S OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERC" +
    "HANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT" +
    ". IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FO" +
    "R ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF " +
    "CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTIO" +
    "N WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE." +
    "\n*/\nfunction E(a){var b=null,c=a.nodeType;1==c&&(b=a.textContent,b" +
    "=void 0==b||null==b?a.innerText:b,b=void 0==b||null==b?\"\":b);if(\"s" +
    "tring\"!=typeof b)if(9==c||1==c){a=9==c?a.documentElement:a.firstCh" +
    "ild;for(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a.nodeValue),d" +
    "[c++]=a;while(a=a.firstChild);for(;c&&!(a=d[--c].nextSibling););}}" +
    "else b=a.nodeValue;return\"\"+b}\nfunction $a(a,b,c){if(null===b)retu" +
    "rn!0;try{if(!a.getAttribute)return!1}catch(d){return!1}return null" +
    "==c?!!a.getAttribute(b):a.getAttribute(b,2)==c}function ab(a,b,c,d" +
    ",e){return bb.call(null,a,b,q(c)?c:null,q(d)?d:null,e||new F)}\nfun" +
    "ction bb(a,b,c,d,e){b.getElementsByName&&d&&\"name\"==c?(b=b.getElem" +
    "entsByName(d),t(b,function(b){a.a(b)&&G(e,b)})):b.getElementsByCla" +
    "ssName&&d&&\"class\"==c?(b=b.getElementsByClassName(d),t(b,function(" +
    "b){b.className==d&&a.a(b)&&G(e,b)})):a instanceof H?cb(a,b,c,d,e):" +
    "b.getElementsByTagName&&(b=b.getElementsByTagName(a.f()),t(b,funct" +
    "ion(a){$a(a,c,d)&&G(e,a)}));return e}function db(a,b,c,d,e){for(b=" +
    "b.firstChild;b;b=b.nextSibling)$a(b,c,d)&&a.a(b)&&G(e,b);return e}" +
    "\nfunction cb(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)$a(b," +
    "c,d)&&a.a(b)&&G(e,b),cb(a,b,c,d,e)};/*\n\n The MIT License\n\n Copyrig" +
    "ht (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Pe" +
    "rmission is hereby granted, free of charge, to any person obtainin" +
    "g a copy\n of this software and associated documentation files (the" +
    " \"Software\"), to\n deal in the Software without restriction, includ" +
    "ing without limitation the\n rights to use, copy, modify, merge, pu" +
    "blish, distribute, sublicense, and/or\n sell copies of the Software" +
    ", and to permit persons to whom the Software is\n furnished to do s" +
    "o, subject to the following conditions:\n\n The above copyright noti" +
    "ce and this permission notice shall be included in\n all copies or " +
    "substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"" +
    "AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDI" +
    "NG BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS " +
    "FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL TH" +
    "E\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES O" +
    "R OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHE" +
    "RWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR" +
    " THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction F(){this." +
    "b=this.a=null;this.l=0}function eb(a){this.node=a;this.a=this.b=nu" +
    "ll}function fb(a,b){if(!a.a)return b;if(!b.a)return a;for(var c=a." +
    "a,d=b.a,e=null,f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):0" +
    "<Ia(c.node,d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=f" +
    ",g++;for(f=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.l=g;return a}fu" +
    "nction gb(a,b){var c=new eb(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=c" +
    ";a.l++}function G(a,b){var c=new eb(b);c.b=a.b;a.a?a.b.a=c:a.a=a.b" +
    "=c;a.b=c;a.l++}\nfunction hb(a){return(a=a.a)?a.node:null}function " +
    "ib(a){return(a=hb(a))?E(a):\"\"}function I(a,b){return new jb(a,!!b)" +
    "}function jb(a,b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=null}f" +
    "unction J(a){var b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c?" +
    "b.b:b.a;return c.node};/*\n\n The MIT License\n\n Copyright (c) 2007 C" +
    "ybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is h" +
    "ereby granted, free of charge, to any person obtaining a copy\n of " +
    "this software and associated documentation files (the \"Software\")," +
    " to\n deal in the Software without restriction, including without l" +
    "imitation the\n rights to use, copy, modify, merge, publish, distri" +
    "bute, sublicense, and/or\n sell copies of the Software, and to perm" +
    "it persons to whom the Software is\n furnished to do so, subject to" +
    " the following conditions:\n\n The above copyright notice and this p" +
    "ermission notice shall be included in\n all copies or substantial p" +
    "ortions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHO" +
    "UT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LI" +
    "MITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICU" +
    "LAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR" +
    " COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIAB" +
    "ILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISIN" +
    "G\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR O" +
    "THER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction kb(a){switch(a.nodeTyp" +
    "e){case 1:return ha(lb,a);case 9:return kb(a.documentElement);case" +
    " 11:case 10:case 6:case 12:return mb;default:return a.parentNode?k" +
    "b(a.parentNode):mb}}function mb(){return null}function lb(a,b){if(" +
    "a.prefix==b)return a.namespaceURI||\"http://www.w3.org/1999/xhtml\";" +
    "var c=a.getAttributeNode(\"xmlns:\"+b);return c&&c.specified?c.value" +
    "||null:a.parentNode&&9!=a.parentNode.nodeType?lb(a.parentNode,b):n" +
    "ull};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n " +
    "Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted, fre" +
    "e of charge, to any person obtaining a copy\n of this software and " +
    "associated documentation files (the \"Software\"), to\n deal in the S" +
    "oftware without restriction, including without limitation the\n rig" +
    "hts to use, copy, modify, merge, publish, distribute, sublicense, " +
    "and/or\n sell copies of the Software, and to permit persons to whom" +
    " the Software is\n furnished to do so, subject to the following con" +
    "ditions:\n\n The above copyright notice and this permission notice s" +
    "hall be included in\n all copies or substantial portions of the Sof" +
    "tware.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY" +
    " KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRA" +
    "NTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NO" +
    "NINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS" +
    " BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN " +
    "AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR" +
    " IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN " +
    "THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu " +
    "Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby " +
    "granted, free of charge, to any person obtaining a copy\n of this s" +
    "oftware and associated documentation files (the \"Software\"), to\n d" +
    "eal in the Software without restriction, including without limitat" +
    "ion the\n rights to use, copy, modify, merge, publish, distribute, " +
    "sublicense, and/or\n sell copies of the Software, and to permit per" +
    "sons to whom the Software is\n furnished to do so, subject to the f" +
    "ollowing conditions:\n\n The above copyright notice and this permiss" +
    "ion notice shall be included in\n all copies or substantial portion" +
    "s of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WAR" +
    "RANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED " +
    "TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PU" +
    "RPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYR" +
    "IGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY," +
    " WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FRO" +
    "M, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER D" +
    "EALINGS\n IN THE SOFTWARE.\n*/\nfunction K(a){this.i=a;this.b=this.g=" +
    "!1;this.f=null}function L(a){return\"\\n  \"+a.toString().split(\"\\n\")" +
    ".join(\"\\n  \")}function nb(a,b){a.g=b}function ob(a,b){a.b=b}functi" +
    "on M(a,b){var c=a.a(b);return c instanceof F?+ib(c):+c}function O(" +
    "a,b){var c=a.a(b);return c instanceof F?ib(c):\"\"+c}function pb(a,b" +
    "){var c=a.a(b);return c instanceof F?!!c.l:!!c};/*\n\n The MIT Licen" +
    "se\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Goog" +
    "le Inc.\n\n Permission is hereby granted, free of charge, to any per" +
    "son obtaining a copy\n of this software and associated documentatio" +
    "n files (the \"Software\"), to\n deal in the Software without restric" +
    "tion, including without limitation the\n rights to use, copy, modif" +
    "y, merge, publish, distribute, sublicense, and/or\n sell copies of " +
    "the Software, and to permit persons to whom the Software is\n furni" +
    "shed to do so, subject to the following conditions:\n\n The above co" +
    "pyright notice and this permission notice shall be included in\n al" +
    "l copies or substantial portions of the Software.\n\n THE SOFTWARE I" +
    "S PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPL" +
    "IED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILIT" +
    "Y,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EV" +
    "ENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAI" +
    "M, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, " +
    "TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE" +
    " SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfuncti" +
    "on qb(a,b,c){K.call(this,a.i);this.c=a;this.h=b;this.u=c;this.g=b." +
    "g||c.g;this.b=b.b||c.b;this.c==rb&&(c.b||c.g||4==c.i||0==c.i||!b.f" +
    "?b.b||b.g||4==b.i||0==b.i||!c.f||(this.f={name:c.f.name,v:b}):this"
  )
      .append(
    ".f={name:b.f.name,v:c})}r(qb,K);\nfunction sb(a,b,c,d,e){b=b.a(d);c" +
    "=c.a(d);var f;if(b instanceof F&&c instanceof F){e=I(b);for(d=J(e)" +
    ";d;d=J(e))for(b=I(c),f=J(b);f;f=J(b))if(a(E(d),E(f)))return!0;retu" +
    "rn!1}if(b instanceof F||c instanceof F){b instanceof F?e=b:(e=c,c=" +
    "b);e=I(e);b=typeof c;for(d=J(e);d;d=J(e)){switch(b){case \"number\":" +
    "d=+E(d);break;case \"boolean\":d=!!E(d);break;case \"string\":d=E(d);b" +
    "reak;default:throw Error(\"Illegal primitive type for comparison.\")" +
    ";}if(a(d,c))return!0}return!1}return e?\"boolean\"==typeof b||\"boole" +
    "an\"==typeof c?\na(!!b,!!c):\"number\"==typeof b||\"number\"==typeof c?a" +
    "(+b,+c):a(b,c):a(+b,+c)}qb.prototype.a=function(a){return this.c.m" +
    "(this.h,this.u,a)};qb.prototype.toString=function(){var a=\"Binary " +
    "Expression: \"+this.c,a=a+L(this.h);return a+=L(this.u)};function t" +
    "b(a,b,c,d){this.a=a;this.H=b;this.i=c;this.m=d}tb.prototype.toStri" +
    "ng=k(\"a\");var ub={};function P(a,b,c,d){if(ub.hasOwnProperty(a))th" +
    "row Error(\"Binary operator already created: \"+a);a=new tb(a,b,c,d)" +
    ";return ub[a.toString()]=a}\nP(\"div\",6,1,function(a,b,c){return M(a" +
    ",c)/M(b,c)});P(\"mod\",6,1,function(a,b,c){return M(a,c)%M(b,c)});P(" +
    "\"*\",6,1,function(a,b,c){return M(a,c)*M(b,c)});P(\"+\",5,1,function(" +
    "a,b,c){return M(a,c)+M(b,c)});P(\"-\",5,1,function(a,b,c){return M(a" +
    ",c)-M(b,c)});P(\"<\",4,2,function(a,b,c){return sb(function(a,b){ret" +
    "urn a<b},a,b,c)});P(\">\",4,2,function(a,b,c){return sb(function(a,b" +
    "){return a>b},a,b,c)});P(\"<=\",4,2,function(a,b,c){return sb(functi" +
    "on(a,b){return a<=b},a,b,c)});\nP(\">=\",4,2,function(a,b,c){return s" +
    "b(function(a,b){return a>=b},a,b,c)});var rb=P(\"=\",3,2,function(a," +
    "b,c){return sb(function(a,b){return a==b},a,b,c,!0)});P(\"!=\",3,2,f" +
    "unction(a,b,c){return sb(function(a,b){return a!=b},a,b,c,!0)});P(" +
    "\"and\",2,2,function(a,b,c){return pb(a,c)&&pb(b,c)});P(\"or\",1,2,fun" +
    "ction(a,b,c){return pb(a,c)||pb(b,c)});/*\n\n The MIT License\n\n Copy" +
    "right (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n" +
    " Permission is hereby granted, free of charge, to any person obtai" +
    "ning a copy\n of this software and associated documentation files (" +
    "the \"Software\"), to\n deal in the Software without restriction, inc" +
    "luding without limitation the\n rights to use, copy, modify, merge," +
    " publish, distribute, sublicense, and/or\n sell copies of the Softw" +
    "are, and to permit persons to whom the Software is\n furnished to d" +
    "o so, subject to the following conditions:\n\n The above copyright n" +
    "otice and this permission notice shall be included in\n all copies " +
    "or substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDE" +
    "D \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCL" +
    "UDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNE" +
    "SS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL" +
    " THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGE" +
    "S OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR O" +
    "THERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE" +
    " OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction vb(a,b" +
    "){if(b.a.length&&4!=a.i)throw Error(\"Primary expression must evalu" +
    "ate to nodeset if filter has predicate(s).\");K.call(this,a.i);this" +
    ".c=a;this.h=b;this.g=a.g;this.b=a.b}r(vb,K);vb.prototype.a=functio" +
    "n(a){a=this.c.a(a);return wb(this.h,a)};vb.prototype.toString=func" +
    "tion(){var a;a=\"Filter:\"+L(this.c);return a+=L(this.h)};/*\n\n The M" +
    "IT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2" +
    "012 Google Inc.\n\n Permission is hereby granted, free of charge, to" +
    " any person obtaining a copy\n of this software and associated docu" +
    "mentation files (the \"Software\"), to\n deal in the Software without" +
    " restriction, including without limitation the\n rights to use, cop" +
    "y, modify, merge, publish, distribute, sublicense, and/or\n sell co" +
    "pies of the Software, and to permit persons to whom the Software i" +
    "s\n furnished to do so, subject to the following conditions:\n\n The " +
    "above copyright notice and this permission notice shall be include" +
    "d in\n all copies or substantial portions of the Software.\n\n THE SO" +
    "FTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS " +
    "OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHA" +
    "NTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. " +
    "IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR " +
    "ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CO" +
    "NTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION " +
    "WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*" +
    "/\nfunction xb(a,b){if(b.length<a.I)throw Error(\"Function \"+a.j+\" e" +
    "xpects at least\"+a.I+\" arguments, \"+b.length+\" given\");if(null!==a" +
    ".B&&b.length>a.B)throw Error(\"Function \"+a.j+\" expects at most \"+a" +
    ".B+\" arguments, \"+b.length+\" given\");a.N&&t(b,function(b,d){if(4!=" +
    "b.i)throw Error(\"Argument \"+d+\" to function \"+a.j+\" is not of type" +
    " Nodeset: \"+b);});K.call(this,a.i);this.h=a;this.c=b;nb(this,a.g||" +
    "va(b,function(a){return a.g}));ob(this,a.M&&!b.length||a.L&&!!b.le" +
    "ngth||va(b,function(a){return a.b}))}\nr(xb,K);xb.prototype.a=funct" +
    "ion(a){return this.h.m.apply(null,ya(a,this.c))};xb.prototype.toSt" +
    "ring=function(){var a=\"Function: \"+this.h;if(this.c.length)var b=u" +
    "a(this.c,function(a,b){return a+L(b)},\"Arguments:\"),a=a+L(b);retur" +
    "n a};function yb(a,b,c,d,e,f,g,h,p){this.j=a;this.i=b;this.g=c;thi" +
    "s.M=d;this.L=e;this.m=f;this.I=g;this.B=void 0!==h?h:g;this.N=!!p}" +
    "yb.prototype.toString=k(\"j\");var zb={};\nfunction Q(a,b,c,d,e,f,g,h" +
    "){if(zb.hasOwnProperty(a))throw Error(\"Function already created: \"" +
    "+a+\".\");zb[a]=new yb(a,b,c,d,!1,e,f,g,h)}Q(\"boolean\",2,!1,!1,funct" +
    "ion(a,b){return pb(b,a)},1);Q(\"ceiling\",1,!1,!1,function(a,b){retu" +
    "rn Math.ceil(M(b,a))},1);Q(\"concat\",3,!1,!1,function(a,b){var c=za" +
    "(arguments,1);return ua(c,function(b,c){return b+O(c,a)},\"\")},2,nu" +
    "ll);Q(\"contains\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return-" +
    "1!=b.indexOf(a)},2);Q(\"count\",1,!1,!1,function(a,b){return b.a(a)." +
    "l},1,1,!0);\nQ(\"false\",2,!1,!1,n(!1),0);Q(\"floor\",1,!1,!1,function(" +
    "a,b){return Math.floor(M(b,a))},1);Q(\"id\",4,!1,!1,function(a,b){va" +
    "r c=a.a,d=9==c.nodeType?c:c.ownerDocument,c=O(b,a).split(/\\s+/),e=" +
    "[];t(c,function(a){a=d.getElementById(a);!a||0<=sa(e,a)||e.push(a)" +
    "});e.sort(Ia);var f=new F;t(e,function(a){G(f,a)});return f},1);Q(" +
    "\"lang\",2,!1,!1,n(!1),1);Q(\"last\",1,!0,!1,function(a){if(1!=argumen" +
    "ts.length)throw Error(\"Function last expects ()\");return a.f},0);\n" +
    "Q(\"local-name\",3,!1,!0,function(a,b){var c=b?hb(b.a(a)):a.a;return" +
    " c?c.localName||c.nodeName.toLowerCase():\"\"},0,1,!0);Q(\"name\",3,!1" +
    ",!0,function(a,b){var c=b?hb(b.a(a)):a.a;return c?c.nodeName.toLow" +
    "erCase():\"\"},0,1,!0);Q(\"namespace-uri\",3,!0,!1,n(\"\"),0,1,!0);Q(\"no" +
    "rmalize-space\",3,!1,!0,function(a,b){return(b?O(b,a):E(a.a)).repla" +
    "ce(/[\\s\\xa0]+/g,\" \").replace(/^\\s+|\\s+$/g,\"\")},0,1);Q(\"not\",2,!1,!" +
    "1,function(a,b){return!pb(b,a)},1);Q(\"number\",1,!1,!0,function(a,b" +
    "){return b?M(b,a):+E(a.a)},0,1);\nQ(\"position\",1,!0,!1,function(a){" +
    "return a.b},0);Q(\"round\",1,!1,!1,function(a,b){return Math.round(M" +
    "(b,a))},1);Q(\"starts-with\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c," +
    "a);return 0==b.lastIndexOf(a,0)},2);Q(\"string\",3,!1,!0,function(a," +
    "b){return b?O(b,a):E(a.a)},0,1);Q(\"string-length\",1,!1,!0,function" +
    "(a,b){return(b?O(b,a):E(a.a)).length},0,1);\nQ(\"substring\",3,!1,!1," +
    "function(a,b,c,d){c=M(c,a);if(isNaN(c)||Infinity==c||-Infinity==c)" +
    "return\"\";d=d?M(d,a):Infinity;if(isNaN(d)||-Infinity===d)return\"\";c" +
    "=Math.round(c)-1;var e=Math.max(c,0);a=O(b,a);if(Infinity==d)retur" +
    "n a.substring(e);b=Math.round(d);return a.substring(e,c+b)},2,3);Q" +
    "(\"substring-after\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);c=b.i" +
    "ndexOf(a);return-1==c?\"\":b.substring(c+a.length)},2);\nQ(\"substring" +
    "-before\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);a=b.indexOf(a);" +
    "return-1==a?\"\":b.substring(0,a)},2);Q(\"sum\",1,!1,!1,function(a,b){" +
    "for(var c=I(b.a(a)),d=0,e=J(c);e;e=J(c))d+=+E(e);return d},1,1,!0)" +
    ";Q(\"translate\",3,!1,!1,function(a,b,c,d){b=O(b,a);c=O(c,a);var e=O" +
    "(d,a);a=[];for(d=0;d<c.length;d++){var f=c.charAt(d);f in a||(a[f]" +
    "=e.charAt(d))}c=\"\";for(d=0;d<b.length;d++)f=b.charAt(d),c+=f in a?" +
    "a[f]:f;return c},3);Q(\"true\",2,!1,!1,n(!0),0);/*\n\n The MIT License" +
    "\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google" +
    " Inc.\n\n Permission is hereby granted, free of charge, to any perso" +
    "n obtaining a copy\n of this software and associated documentation " +
    "files (the \"Software\"), to\n deal in the Software without restricti" +
    "on, including without limitation the\n rights to use, copy, modify," +
    " merge, publish, distribute, sublicense, and/or\n sell copies of th" +
    "e Software, and to permit persons to whom the Software is\n furnish" +
    "ed to do so, subject to the following conditions:\n\n The above copy" +
    "right notice and this permission notice shall be included in\n all " +
    "copies or substantial portions of the Software.\n\n THE SOFTWARE IS " +
    "PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIE" +
    "D, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY," +
    "\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVEN" +
    "T SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM," +
    " DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TO" +
    "RT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE S" +
    "OFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The" +
    " MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c)" +
    " 2012 Google Inc.\n\n Permission is hereby granted, free of charge, " +
    "to any person obtaining a copy\n of this software and associated do" +
    "cumentation files (the \"Software\"), to\n deal in the Software witho" +
    "ut restriction, including without limitation the\n rights to use, c" +
    "opy, modify, merge, publish, distribute, sublicense, and/or\n sell " +
    "copies of the Software, and to permit persons to whom the Software" +
    " is\n furnished to do so, subject to the following conditions:\n\n Th" +
    "e above copyright notice and this permission notice shall be inclu" +
    "ded in\n all copies or substantial portions of the Software.\n\n THE " +
    "SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRES" +
    "S OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERC" +
    "HANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT" +
    ". IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FO" +
    "R ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF " +
    "CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTIO" +
    "N WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE." +
    "\n*/\nfunction H(a,b){this.h=a;this.c=void 0!==b?b:null;this.b=null;" +
    "switch(a){case \"comment\":this.b=8;break;case \"text\":this.b=3;break" +
    ";case \"processing-instruction\":this.b=7;break;case \"node\":break;de" +
    "fault:throw Error(\"Unexpected argument\");}}function Ab(a){return\"c" +
    "omment\"==a||\"text\"==a||\"processing-instruction\"==a||\"node\"==a}H.pr" +
    "ototype.a=function(a){return null===this.b||this.b==a.nodeType};H." +
    "prototype.f=k(\"h\");H.prototype.toString=function(){var a=\"Kind Tes" +
    "t: \"+this.h;null===this.c||(a+=L(this.c));return a};/*\n\n The MIT L" +
    "icense\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 " +
    "Google Inc.\n\n Permission is hereby granted, free of charge, to any" +
    " person obtaining a copy\n of this software and associated document" +
    "ation files (the \"Software\"), to\n deal in the Software without res" +
    "triction, including without limitation the\n rights to use, copy, m" +
    "odify, merge, publish, distribute, sublicense, and/or\n sell copies" +
    " of the Software, and to permit persons to whom the Software is\n f" +
    "urnished to do so, subject to the following conditions:\n\n The abov" +
    "e copyright notice and this permission notice shall be included in" +
    "\n all copies or substantial portions of the Software.\n\n THE SOFTWA" +
    "RE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n " +
    "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTAB" +
    "ILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN N" +
    "O EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY " +
    "CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRA" +
    "CT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH" +
    " THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfu" +
    "nction Bb(a){K.call(this,3);this.c=a.substring(1,a.length-1)}r(Bb," +
    "K);Bb.prototype.a=k(\"c\");Bb.prototype.toString=function(){return\"L" +
    "iteral: \"+this.c};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu" +
    " Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby" +
    " granted, free of charge, to any person obtaining a copy\n of this " +
    "software and associated documentation files (the \"Software\"), to\n " +
    "deal in the Software without restriction, including without limita" +
    "tion the\n rights to use, copy, modify, merge, publish, distribute," +
    " sublicense, and/or\n sell copies of the Software, and to permit pe" +
    "rsons to whom the Software is\n furnished to do so, subject to the " +
    "following conditions:\n\n The above copyright notice and this permis" +
    "sion notice shall be included in\n all copies or substantial portio" +
    "ns of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WA" +
    "RRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED" +
    " TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR P" +
    "URPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPY" +
    "RIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY" +
    ", WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FR" +
    "OM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER " +
    "DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Cb(a,b){this.j=a.toLowerCas" +
    "e();this.b=b?b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}Cb.pro" +
    "totype.a=function(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=th" +
    "is.j&&this.j!=a.nodeName.toLowerCase()?!1:this.b==(a.namespaceURI?" +
    "a.namespaceURI.toLowerCase():\"http://www.w3.org/1999/xhtml\")};Cb.p" +
    "rototype.f=k(\"j\");Cb.prototype.toString=function(){return\"Name Tes" +
    "t: \"+(\"http://www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+this.j" +
    "};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Cop" +
    "yright (c) 2012 Google Inc.\n\n Permission is hereby granted, free o" +
    "f charge, to any person obtaining a copy\n of this software and ass" +
    "ociated documentation files (the \"Software\"), to\n deal in the Soft" +
    "ware without restriction, including without limitation the\n rights" +
    " to use, copy, modify, merge, publish, distribute, sublicense, and" +
    "/or\n sell copies of the Software, and to permit persons to whom th" +
    "e Software is\n furnished to do so, subject to the following condit" +
    "ions:\n\n The above copyright notice and this permission notice shal" +
    "l be included in\n all copies or substantial portions of the Softwa" +
    "re.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KI" +
    "ND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTI" +
    "ES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONIN" +
    "FRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE" +
    " LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN " +
    "ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN" +
    " CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE" +
    " SOFTWARE.\n*/\nfunction Db(a){K.call(this,1);this.c=a}r(Db,K);Db.pr" +
    "ototype.a=k(\"c\");Db.prototype.toString=function(){return\"Number: \"" +
    "+this.c};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, In" +
    "c.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted," +
    " free of charge, to any person obtaining a copy\n of this software " +
    "and associated documentation files (the \"Software\"), to\n deal in t" +
    "he Software without restriction, including without limitation the\n" +
    " rights to use, copy, modify, merge, publish, distribute, sublicen" +
    "se, and/or\n sell copies of the Software, and to permit persons to " +
    "whom the Software is\n furnished to do so, subject to the following" +
    " conditions:\n\n The above copyright notice and this permission noti" +
    "ce shall be included in\n all copies or substantial portions of the" +
    " Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF" +
    " ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE W" +
    "ARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AN" +
    "D NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOL" +
    "DERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER" +
    " IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT O" +
    "F OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n" +
    " IN THE SOFTWARE.\n*/\nfunction Eb(a,b){K.call(this,a.i);this.h=a;th" +
    "is.c=b;this.g=a.g;this.b=a.b;if(1==this.c.length){var c=this.c[0];" +
    "c.A||c.c!=Fb||(c=c.u,\"*\"!=c.f()&&(this.f={name:c.f(),v:null}))}}r(" +
    "Eb,K);function Gb(){K.call(this,4)}r(Gb,K);Gb.prototype.a=function" +
    "(a){var b=new F;a=a.a;9==a.nodeType?G(b,a):G(b,a.ownerDocument);re" +
    "turn b};Gb.prototype.toString=n(\"Root Helper Expression\");function" +
    " Hb(){K.call(this,4)}r(Hb,K);Hb.prototype.a=function(a){var b=new " +
    "F;G(b,a.a);return b};Hb.prototype.toString=n(\"Context Helper Expre" +
    "ssion\");\nfunction Ib(a){return\"/\"==a||\"//\"==a}Eb.prototype.a=funct" +
    "ion(a){var b=this.h.a(a);if(!(b instanceof F))throw Error(\"Filter " +
    "expression must evaluate to nodeset.\");a=this.c;for(var c=0,d=a.le" +
    "ngth;c<d&&b.l;c++){var e=a[c],f=I(b,e.c.a),g;if(e.g||e.c!=Jb)if(e." +
    "g||e.c!=Kb)for(g=J(f),b=e.a(new Ua(g));null!=(g=J(f));)g=e.a(new U" +
    "a(g)),b=fb(b,g);else g=J(f),b=e.a(new Ua(g));else{for(g=J(f);(b=J(" +
    "f))&&(!g.contains||g.contains(b))&&b.compareDocumentPosition(g)&8;" +
    "g=b);b=e.a(new Ua(g))}}return b};\nEb.prototype.toString=function()" +
    "{var a;a=\"Path Expression:\"+L(this.h);if(this.c.length){var b=ua(t" +
    "his.c,function(a,b){return a+L(b)},\"Steps:\");a+=L(b)}return a};/*\n" +
    "\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyrigh" +
    "t (c) 2012 Google Inc.\n\n Permission is hereby granted, free of cha" +
    "rge, to any person obtaining a copy\n of this software and associat" +
    "ed documentation files (the \"Software\"), to\n deal in the Software " +
    "without restriction, including without limitation the\n rights to u" +
    "se, copy, modify, merge, publish, distribute, sublicense, and/or\n " +
    "sell copies of the Software, and to permit persons to whom the Sof" +
    "tware is\n furnished to do so, subject to the following conditions:" +
    "\n\n The above copyright notice and this permission notice shall be " +
    "included in\n all copies or substantial portions of the Software.\n\n" +
    " THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, E" +
    "XPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF" +
    " MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRING" +
    "EMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIAB" +
    "LE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTIO" +
    "N OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONN" +
    "ECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFT" +
    "WARE.\n*/\nfunction Lb(a,b){this.a=a;this.b=!!b}\nfunction wb(a,b,c){" +
    "for(c=c||0;c<a.a.length;c++)for(var d=a.a[c],e=I(b),f=b.l,g,h=0;g=" +
    "J(e);h++){var p=a.b?f-h:h+1;g=d.a(new Ua(g,p,f));if(\"number\"==type" +
    "of g)p=p==g;else if(\"string\"==typeof g||\"boolean\"==typeof g)p=!!g;" +
    "else if(g instanceof F)p=0<g.l;else throw Error(\"Predicate.evaluat" +
    "e returned an unexpected type.\");if(!p){p=e;g=p.f;var m=p.a;if(!m)" +
    "throw Error(\"Next must be called at least once before remove.\");va" +
    "r l=m.b,m=m.a;l?l.a=m:g.a=m;m?m.b=l:g.b=l;g.l--;p.a=null}}return b" +
    "}\nLb.prototype.toString=function(){return ua(this.a,function(a,b){" +
    "return a+L(b)},\"Predicates:\")};/*\n\n The MIT License\n\n Copyright (c" +
    ") 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permiss" +
    "ion is hereby granted, free of charge, to any person obtaining a c" +
    "opy\n of this software and associated documentation files (the \"Sof" +
    "tware\"), to\n deal in the Software without restriction, including w" +
    "ithout limitation the\n rights to use, copy, modify, merge, publish" +
    ", distribute, sublicense, and/or\n sell copies of the Software, and" +
    " to permit persons to whom the Software is\n furnished to do so, su" +
    "bject to the following conditions:\n\n The above copyright notice an" +
    "d this permission notice shall be included in\n all copies or subst" +
    "antial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS" +
    "\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BU" +
    "T NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A" +
    " PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AU" +
    "THORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTH" +
    "ER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE" +
    ", ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE " +
    "USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction R(a,b,c,d){K.c" +
    "all(this,4);this.c=a;this.u=b;this.h=c||new Lb([]);this.A=!!d;b=th" +
    "is.h;b=0<b.a.length?b.a[0].f:null;a.b&&b&&(this.f={name:b.name,v:b" +
    ".v});a:{a=this.h;for(b=0;b<a.a.length;b++)if(c=a.a[b],c.g||1==c.i|" +
    "|0==c.i){a=!0;break a}a=!1}this.g=a}r(R,K);\nR.prototype.a=function" +
    "(a){var b=a.a,c=null,c=this.f,d=null,e=null,f=0;c&&(d=c.name,e=c.v" +
    "?O(c.v,a):null,f=1);if(this.A)if(this.g||this.c!=Nb)if(a=I((new R(" +
    "Ob,new H(\"node\"))).a(a)),b=J(a))for(c=this.m(b,d,e,f);null!=(b=J(a" +
    "));)c=fb(c,this.m(b,d,e,f));else c=new F;else c=ab(this.u,b,d,e),c" +
    "=wb(this.h,c,f);else c=this.m(a.a,d,e,f);return c};R.prototype.m=f" +
    "unction(a,b,c,d){a=this.c.f(this.u,a,b,c);return a=wb(this.h,a,d)}" +
    ";\nR.prototype.toString=function(){var a;a=\"Step:\"+L(\"Operator: \"+(" +
    "this.A?\"//\":\"/\"));this.c.j&&(a+=L(\"Axis: \"+this.c));a+=L(this.u);i" +
    "f(this.h.a.length){var b=ua(this.h.a,function(a,b){return a+L(b)}," +
    "\"Predicates:\");a+=L(b)}return a};function Pb(a,b,c,d){this.j=a;thi" +
    "s.f=b;this.a=c;this.b=d}Pb.prototype.toString=k(\"j\");var Qb={};fun" +
    "ction S(a,b,c,d){if(Qb.hasOwnProperty(a))throw Error(\"Axis already" +
    " created: \"+a);b=new Pb(a,b,c,!!d);return Qb[a]=b}\nS(\"ancestor\",fu" +
    "nction(a,b){for(var c=new F,d=b;d=d.parentNode;)a.a(d)&&gb(c,d);re" +
    "turn c},!0);S(\"ancestor-or-self\",function(a,b){var c=new F,d=b;do " +
    "a.a(d)&&gb(c,d);while(d=d.parentNode);return c},!0);var Fb=S(\"attr" +
    "ibute\",function(a,b){var c=new F,d=a.f(),e=b.attributes;if(e)if(a " +
    "instanceof H&&null===a.b||\"*\"==d)for(var d=0,f;f=e[d];d++)G(c,f);e" +
    "lse(f=e.getNamedItem(d))&&G(c,f);return c},!1),Nb=S(\"child\",functi" +
    "on(a,b,c,d,e){return db.call(null,a,b,q(c)?c:null,q(d)?d:null,e||n" +
    "ew F)},!1,!0);\nS(\"descendant\",ab,!1,!0);var Ob=S(\"descendant-or-se" +
    "lf\",function(a,b,c,d){var e=new F;$a(b,c,d)&&a.a(b)&&G(e,b);return" +
    " ab(a,b,c,d,e)},!1,!0),Jb=S(\"following\",function(a,b,c,d){var e=ne" +
    "w F;do for(var f=b;f=f.nextSibling;)$a(f,c,d)&&a.a(f)&&G(e,f),e=ab" +
    "(a,f,c,d,e);while(b=b.parentNode);return e},!1,!0);S(\"following-si" +
    "bling\",function(a,b){for(var c=new F,d=b;d=d.nextSibling;)a.a(d)&&" +
    "G(c,d);return c},!1);S(\"namespace\",function(){return new F},!1);\nv" +
    "ar Rb=S(\"parent\",function(a,b){var c=new F;if(9==b.nodeType)return" +
    " c;if(2==b.nodeType)return G(c,b.ownerElement),c;var d=b.parentNod" +
    "e;a.a(d)&&G(c,d);return c},!1),Kb=S(\"preceding\",function(a,b,c,d){" +
    "var e=new F,f=[];do f.unshift(b);while(b=b.parentNode);for(var g=1" +
    ",h=f.length;g<h;g++){var p=[];for(b=f[g];b=b.previousSibling;)p.un" +
    "shift(b);for(var m=0,l=p.length;m<l;m++)b=p[m],$a(b,c,d)&&a.a(b)&&" +
    "G(e,b),e=ab(a,b,c,d,e)}return e},!0,!0);\nS(\"preceding-sibling\",fun" +
    "ction(a,b){for(var c=new F,d=b;d=d.previousSibling;)a.a(d)&&gb(c,d" +
    ");return c},!0);var Sb=S(\"self\",function(a,b){var c=new F;a.a(b)&&" +
    "G(c,b);return c},!1);/*\n\n The MIT License\n\n Copyright (c) 2007 Cyb" +
    "ozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is her" +
    "eby granted, free of charge, to any person obtaining a copy\n of th" +
    "is software and associated documentation files (the \"Software\"), t" +
    "o\n deal in the Software without restriction, including without lim" +
    "itation the\n rights to use, copy, modify, merge, publish, distribu" +
    "te, sublicense, and/or\n sell copies of the Software, and to permit" +
    " persons to whom the Software is\n furnished to do so, subject to t" +
    "he following conditions:\n\n The above copyright notice and this per" +
    "mission notice shall be included in\n all copies or substantial por" +
    "tions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT" +
    " WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMI" +
    "TED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULA" +
    "R PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR C" +
    "OPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABIL" +
    "ITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n" +
    " FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTH" +
    "ER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Tb(a){K.call(this,1);thi" +
    "s.c=a;this.g=a.g;this.b=a.b}r(Tb,K);Tb.prototype.a=function(a){ret" +
    "urn-M(this.c,a)};Tb.prototype.toString=function(){return\"Unary Exp" +
    "ression: -\"+L(this.c)};/*\n\n The MIT License\n\n Copyright (c) 2007 C" +
    "ybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is h" +
    "ereby granted, free of charge, to any person obtaining a copy\n of " +
    "this software and associated documentation files (the \"Software\")," +
    " to\n deal in the Software without restriction, including without l" +
    "imitation the\n rights to use, copy, modify, merge, publish, distri" +
    "bute, sublicense, and/or\n sell copies of the Software, and to perm" +
    "it persons to whom the Software is\n furnished to do so, subject to" +
    " the following conditions:\n\n The above copyright notice and this p" +
    "ermission notice shall be included in\n all copies or substantial p" +
    "ortions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHO" +
    "UT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LI" +
    "MITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICU" +
    "LAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR" +
    " COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIAB" +
    "ILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISIN" +
    "G\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR O" +
    "THER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Ub(a){K.call(this,4);t" +
    "his.c=a;nb(this,va(this.c,function(a){return a.g}));ob(this,va(thi" +
    "s.c,function(a){return a.b}))}r(Ub,K);Ub.prototype.a=function(a){v" +
    "ar b=new F;t(this.c,function(c){c=c.a(a);if(!(c instanceof F))thro" +
    "w Error(\"Path expression must evaluate to NodeSet.\");b=fb(b,c)});r" +
    "eturn b};Ub.prototype.toString=function(){return ua(this.c,functio" +
    "n(a,b){return a+L(b)},\"Union Expression:\")};/*\n\n The MIT License\n\n" +
    " Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google I" +
    "nc.\n\n Permission is hereby granted, free of charge, to any person " +
    "obtaining a copy\n of this software and associated documentation fi" +
    "les (the \"Software\"), to\n deal in the Software without restriction" +
    ", including without limitation the\n rights to use, copy, modify, m" +
    "erge, publish, distribute, sublicense, and/or\n sell copies of the " +
    "Software, and to permit persons to whom the Software is\n furnished" +
    " to do so, subject to the following conditions:\n\n The above copyri" +
    "ght notice and this permission notice shall be included in\n all co" +
    "pies or substantial portions of the Software.\n\n THE SOFTWARE IS PR" +
    "OVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED," +
    " INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n "
  )
      .append(
    "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT " +
    "SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, D" +
    "AMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT" +
    " OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOF" +
    "TWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction V" +
    "b(a,b){this.a=a;this.b=b}function Wb(a){for(var b,c=[];;){T(a,\"Mis" +
    "sing right hand side of binary expression.\");b=Xb(a);var d=D(a.a);" +
    "if(!d)break;var e=(d=ub[d]||null)&&d.H;if(!e){a.a.a--;break}for(;c" +
    ".length&&e<=c[c.length-1].H;)b=new qb(c.pop(),c.pop(),b);c.push(b," +
    "d)}for(;c.length;)b=new qb(c.pop(),c.pop(),b);return b}function T(" +
    "a,b){if(Za(a.a))throw Error(b);}function Yb(a,b){var c=D(a.a);if(c" +
    "!=b)throw Error(\"Bad token, expected: \"+b+\" got: \"+c);}\nfunction Z" +
    "b(a){a=D(a.a);if(\")\"!=a)throw Error(\"Bad token: \"+a);}function $b(" +
    "a){a=D(a.a);if(2>a.length)throw Error(\"Unclosed literal string\");r" +
    "eturn new Bb(a)}function ac(a){var b=D(a.a),c=b.indexOf(\":\");if(-1" +
    "==c)return new Cb(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw E" +
    "rror(\"Namespace prefix not declared: \"+d);b=b.substr(c+1);return n" +
    "ew Cb(b,a)}\nfunction bc(a){var b,c=[],d;if(Ib(C(a.a))){b=D(a.a);d=" +
    "C(a.a);if(\"/\"==b&&(Za(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?!" +
    "[0-9])[\\w]/.test(d)))return new Gb;d=new Gb;T(a,\"Missing next loca" +
    "tion step.\");b=cc(a,b);c.push(b)}else{a:{b=C(a.a);d=b.charAt(0);sw" +
    "itch(d){case \"$\":throw Error(\"Variable reference not allowed in HT" +
    "ML XPath\");case \"(\":D(a.a);b=Wb(a);T(a,'unclosed \"(\"');Yb(a,\")\");b" +
    "reak;case '\"':case \"'\":b=$b(a);break;default:if(isNaN(+b))if(!Ab(b" +
    ")&&/(?![0-9])[\\w]/.test(d)&&\"(\"==C(a.a,1)){b=D(a.a);\nb=zb[b]||null" +
    ";D(a.a);for(d=[];\")\"!=C(a.a);){T(a,\"Missing function argument list" +
    ".\");d.push(Wb(a));if(\",\"!=C(a.a))break;D(a.a)}T(a,\"Unclosed functi" +
    "on argument list.\");Zb(a);b=new xb(b,d)}else{b=null;break a}else b" +
    "=new Db(+D(a.a))}\"[\"==C(a.a)&&(d=new Lb(dc(a)),b=new vb(b,d))}if(b" +
    ")if(Ib(C(a.a)))d=b;else return b;else b=cc(a,\"/\"),d=new Hb,c.push(" +
    "b)}for(;Ib(C(a.a));)b=D(a.a),T(a,\"Missing next location step.\"),b=" +
    "cc(a,b),c.push(b);return new Eb(d,c)}\nfunction cc(a,b){var c,d,e;i" +
    "f(\"/\"!=b&&\"//\"!=b)throw Error('Step op should be \"/\" or \"//\"');if(" +
    "\".\"==C(a.a))return d=new R(Sb,new H(\"node\")),D(a.a),d;if(\"..\"==C(a" +
    ".a))return d=new R(Rb,new H(\"node\")),D(a.a),d;var f;if(\"@\"==C(a.a)" +
    ")f=Fb,D(a.a),T(a,\"Missing attribute name\");else if(\"::\"==C(a.a,1))" +
    "{if(!/(?![0-9])[\\w]/.test(C(a.a).charAt(0)))throw Error(\"Bad token" +
    ": \"+D(a.a));c=D(a.a);f=Qb[c]||null;if(!f)throw Error(\"No axis with" +
    " name: \"+c);D(a.a);T(a,\"Missing node name\")}else f=Nb;c=C(a.a);if(" +
    "/(?![0-9])[\\w]/.test(c.charAt(0)))if(\"(\"==\nC(a.a,1)){if(!Ab(c))thr" +
    "ow Error(\"Invalid node type: \"+c);c=D(a.a);if(!Ab(c))throw Error(\"" +
    "Invalid type name: \"+c);Yb(a,\"(\");T(a,\"Bad nodetype\");e=C(a.a).cha" +
    "rAt(0);var g=null;if('\"'==e||\"'\"==e)g=$b(a);T(a,\"Bad nodetype\");Zb" +
    "(a);c=new H(c,g)}else c=ac(a);else if(\"*\"==c)c=ac(a);else throw Er" +
    "ror(\"Bad token: \"+D(a.a));e=new Lb(dc(a),f.a);return d||new R(f,c," +
    "e,\"//\"==b)}\nfunction dc(a){for(var b=[];\"[\"==C(a.a);){D(a.a);T(a,\"" +
    "Missing predicate expression.\");var c=Wb(a);b.push(c);T(a,\"Unclose" +
    "d predicate expression.\");Yb(a,\"]\")}return b}function Xb(a){if(\"-\"" +
    "==C(a.a))return D(a.a),new Tb(Xb(a));var b=bc(a);if(\"|\"!=C(a.a))a=" +
    "b;else{for(b=[b];\"|\"==D(a.a);)T(a,\"Missing next union location pat" +
    "h.\"),b.push(bc(a));a.a.a--;a=new Ub(b)}return a};/*\n\n The MIT Lice" +
    "nse\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Goo" +
    "gle Inc.\n\n Permission is hereby granted, free of charge, to any pe" +
    "rson obtaining a copy\n of this software and associated documentati" +
    "on files (the \"Software\"), to\n deal in the Software without restri" +
    "ction, including without limitation the\n rights to use, copy, modi" +
    "fy, merge, publish, distribute, sublicense, and/or\n sell copies of" +
    " the Software, and to permit persons to whom the Software is\n furn" +
    "ished to do so, subject to the following conditions:\n\n The above c" +
    "opyright notice and this permission notice shall be included in\n a" +
    "ll copies or substantial portions of the Software.\n\n THE SOFTWARE " +
    "IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMP" +
    "LIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILI" +
    "TY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO E" +
    "VENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLA" +
    "IM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT," +
    " TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH TH" +
    "E SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunct" +
    "ion ec(a,b){if(!a.length)throw Error(\"Empty XPath expression.\");va" +
    "r c=Wa(a);if(Za(c))throw Error(\"Invalid XPath expression.\");b?da(b" +
    ")||(b=ga(b.lookupNamespaceURI,b)):b=n(null);var d=Wb(new Vb(c,b));" +
    "if(!Za(c))throw Error(\"Bad token: \"+D(c));this.evaluate=function(a" +
    ",b){var c=d.a(new Ua(a));return new U(c,b)}}\nfunction U(a,b){if(0=" +
    "=b)if(a instanceof F)b=4;else if(\"string\"==typeof a)b=2;else if(\"n" +
    "umber\"==typeof a)b=1;else if(\"boolean\"==typeof a)b=3;else throw Er" +
    "ror(\"Unexpected evaluation result.\");if(2!=b&&1!=b&&3!=b&&!(a inst" +
    "anceof F))throw Error(\"value could not be converted to the specifi" +
    "ed type\");this.resultType=b;var c;switch(b){case 2:this.stringValu" +
    "e=a instanceof F?ib(a):\"\"+a;break;case 1:this.numberValue=a instan" +
    "ceof F?+ib(a):+a;break;case 3:this.booleanValue=a instanceof F?0<a" +
    ".l:!!a;break;case 4:case 5:case 6:case 7:var d=\nI(a);c=[];for(var " +
    "e=J(d);e;e=J(d))c.push(e);this.snapshotLength=a.l;this.invalidIter" +
    "atorState=!1;break;case 8:case 9:this.singleNodeValue=hb(a);break;" +
    "default:throw Error(\"Unknown XPathResult type.\");}var f=0;this.ite" +
    "rateNext=function(){if(4!=b&&5!=b)throw Error(\"iterateNext called " +
    "with wrong result type\");return f>=c.length?null:c[f++]};this.snap" +
    "shotItem=function(a){if(6!=b&&7!=b)throw Error(\"snapshotItem calle" +
    "d with wrong result type\");return a>=c.length||0>a?null:c[a]}}U.AN" +
    "Y_TYPE=0;\nU.NUMBER_TYPE=1;U.STRING_TYPE=2;U.BOOLEAN_TYPE=3;U.UNORD" +
    "ERED_NODE_ITERATOR_TYPE=4;U.ORDERED_NODE_ITERATOR_TYPE=5;U.UNORDER" +
    "ED_NODE_SNAPSHOT_TYPE=6;U.ORDERED_NODE_SNAPSHOT_TYPE=7;U.ANY_UNORD" +
    "ERED_NODE_TYPE=8;U.FIRST_ORDERED_NODE_TYPE=9;function fc(a){this.l" +
    "ookupNamespaceURI=kb(a)}\nfunction gc(a){a=a||aa;var b=a.document;b" +
    ".evaluate||(a.XPathResult=U,b.evaluate=function(a,b,e,f){return(ne" +
    "w ec(a,e)).evaluate(b,f)},b.createExpression=function(a,b){return " +
    "new ec(a,b)},b.createNSResolver=function(a){return new fc(a)})}ba(" +
    "\"wgxpath.install\",gc);/*xxx_rpl_lic*/\nvar V={};V.C=function(){var " +
    "a={R:\"http://www.w3.org/2000/svg\"};return function(b){return a[b]|" +
    "|null}}();\nV.m=function(a,b,c){var d=x(a);if(!d.documentElement)re" +
    "turn null;gc(d?d.parentWindow||d.defaultView:window);try{for(var e" +
    "=d.createNSResolver?d.createNSResolver(d.documentElement):V.C,f={}" +
    ",g=d.getElementsByTagName(\"*\"),h=0;h<g.length;++h){var p=g[h],m=p." +
    "namespaceURI;if(!f[m]){var l=p.lookupPrefix(m);if(!l){var B=m.matc" +
    "h(\".*/(\\\\w+)/?$\");B?l=B[1]:l=\"xhtml\"}f[m]=l}}var N={},W;for(W in f" +
    ")N[f[W]]=W;e=function(a){return N[a]||null};try{return d.evaluate(" +
    "b,a,e,c,null)}catch(Mb){if(\"TypeError\"===Mb.name)return e=\nd.creat" +
    "eNSResolver?d.createNSResolver(d.documentElement):V.C,d.evaluate(b" +
    ",a,e,c,null);throw Mb;}}catch(vc){throw new z(32,\"Unable to locate" +
    " an element with the xpath expression \"+b+\" because of the followi" +
    "ng error:\\n\"+vc);}};V.D=function(a,b){if(!a||1!=a.nodeType)throw n" +
    "ew z(32,'The result of the xpath expression \"'+b+'\" is: '+a+\". It " +
    "should be an element.\");};\nV.o=function(a,b){var c=function(){var " +
    "c=V.m(b,a,9);return c?c.singleNodeValue||null:b.selectSingleNode?(" +
    "c=x(b),c.setProperty&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b" +
    ".selectSingleNode(a)):null}();null===c||V.D(c,a);return c};\nV.s=fu" +
    "nction(a,b){var c=function(){var c=V.m(b,a,7);if(c){for(var e=c.sn" +
    "apshotLength,f=[],g=0;g<e;++g)f.push(c.snapshotItem(g));return f}r" +
    "eturn b.selectNodes?(c=x(b),c.setProperty&&c.setProperty(\"Selectio" +
    "nLanguage\",\"XPath\"),b.selectNodes(a)):[]}();t(c,function(b){V.D(b," +
    "a)});return c};var hc={aliceblue:\"#f0f8ff\",antiquewhite:\"#faebd7\"," +
    "aqua:\"#00ffff\",aquamarine:\"#7fffd4\",azure:\"#f0ffff\",beige:\"#f5f5dc" +
    "\",bisque:\"#ffe4c4\",black:\"#000000\",blanchedalmond:\"#ffebcd\",blue:\"" +
    "#0000ff\",blueviolet:\"#8a2be2\",brown:\"#a52a2a\",burlywood:\"#deb887\"," +
    "cadetblue:\"#5f9ea0\",chartreuse:\"#7fff00\",chocolate:\"#d2691e\",coral" +
    ":\"#ff7f50\",cornflowerblue:\"#6495ed\",cornsilk:\"#fff8dc\",crimson:\"#d" +
    "c143c\",cyan:\"#00ffff\",darkblue:\"#00008b\",darkcyan:\"#008b8b\",darkgo" +
    "ldenrod:\"#b8860b\",darkgray:\"#a9a9a9\",darkgreen:\"#006400\",\ndarkgrey" +
    ":\"#a9a9a9\",darkkhaki:\"#bdb76b\",darkmagenta:\"#8b008b\",darkolivegree" +
    "n:\"#556b2f\",darkorange:\"#ff8c00\",darkorchid:\"#9932cc\",darkred:\"#8b" +
    "0000\",darksalmon:\"#e9967a\",darkseagreen:\"#8fbc8f\",darkslateblue:\"#" +
    "483d8b\",darkslategray:\"#2f4f4f\",darkslategrey:\"#2f4f4f\",darkturquo" +
    "ise:\"#00ced1\",darkviolet:\"#9400d3\",deeppink:\"#ff1493\",deepskyblue:" +
    "\"#00bfff\",dimgray:\"#696969\",dimgrey:\"#696969\",dodgerblue:\"#1e90ff\"" +
    ",firebrick:\"#b22222\",floralwhite:\"#fffaf0\",forestgreen:\"#228b22\",f" +
    "uchsia:\"#ff00ff\",gainsboro:\"#dcdcdc\",\nghostwhite:\"#f8f8ff\",gold:\"#" +
    "ffd700\",goldenrod:\"#daa520\",gray:\"#808080\",green:\"#008000\",greenye" +
    "llow:\"#adff2f\",grey:\"#808080\",honeydew:\"#f0fff0\",hotpink:\"#ff69b4\"" +
    ",indianred:\"#cd5c5c\",indigo:\"#4b0082\",ivory:\"#fffff0\",khaki:\"#f0e6" +
    "8c\",lavender:\"#e6e6fa\",lavenderblush:\"#fff0f5\",lawngreen:\"#7cfc00\"" +
    ",lemonchiffon:\"#fffacd\",lightblue:\"#add8e6\",lightcoral:\"#f08080\",l" +
    "ightcyan:\"#e0ffff\",lightgoldenrodyellow:\"#fafad2\",lightgray:\"#d3d3" +
    "d3\",lightgreen:\"#90ee90\",lightgrey:\"#d3d3d3\",lightpink:\"#ffb6c1\",l" +
    "ightsalmon:\"#ffa07a\",\nlightseagreen:\"#20b2aa\",lightskyblue:\"#87cef" +
    "a\",lightslategray:\"#778899\",lightslategrey:\"#778899\",lightsteelblu" +
    "e:\"#b0c4de\",lightyellow:\"#ffffe0\",lime:\"#00ff00\",limegreen:\"#32cd3" +
    "2\",linen:\"#faf0e6\",magenta:\"#ff00ff\",maroon:\"#800000\",mediumaquama" +
    "rine:\"#66cdaa\",mediumblue:\"#0000cd\",mediumorchid:\"#ba55d3\",mediump" +
    "urple:\"#9370db\",mediumseagreen:\"#3cb371\",mediumslateblue:\"#7b68ee\"" +
    ",mediumspringgreen:\"#00fa9a\",mediumturquoise:\"#48d1cc\",mediumviole" +
    "tred:\"#c71585\",midnightblue:\"#191970\",mintcream:\"#f5fffa\",mistyros" +
    "e:\"#ffe4e1\",\nmoccasin:\"#ffe4b5\",navajowhite:\"#ffdead\",navy:\"#00008" +
    "0\",oldlace:\"#fdf5e6\",olive:\"#808000\",olivedrab:\"#6b8e23\",orange:\"#" +
    "ffa500\",orangered:\"#ff4500\",orchid:\"#da70d6\",palegoldenrod:\"#eee8a" +
    "a\",palegreen:\"#98fb98\",paleturquoise:\"#afeeee\",palevioletred:\"#db7" +
    "093\",papayawhip:\"#ffefd5\",peachpuff:\"#ffdab9\",peru:\"#cd853f\",pink:" +
    "\"#ffc0cb\",plum:\"#dda0dd\",powderblue:\"#b0e0e6\",purple:\"#800080\",red" +
    ":\"#ff0000\",rosybrown:\"#bc8f8f\",royalblue:\"#4169e1\",saddlebrown:\"#8" +
    "b4513\",salmon:\"#fa8072\",sandybrown:\"#f4a460\",seagreen:\"#2e8b57\",\ns" +
    "eashell:\"#fff5ee\",sienna:\"#a0522d\",silver:\"#c0c0c0\",skyblue:\"#87ce" +
    "eb\",slateblue:\"#6a5acd\",slategray:\"#708090\",slategrey:\"#708090\",sn" +
    "ow:\"#fffafa\",springgreen:\"#00ff7f\",steelblue:\"#4682b4\",tan:\"#d2b48" +
    "c\",teal:\"#008080\",thistle:\"#d8bfd8\",tomato:\"#ff6347\",turquoise:\"#4" +
    "0e0d0\",violet:\"#ee82ee\",wheat:\"#f5deb3\",white:\"#ffffff\",whitesmoke" +
    ":\"#f5f5f5\",yellow:\"#ffff00\",yellowgreen:\"#9acd32\"};/*xxx_rpl_lic*/" +
    "\nvar ic=\"backgroundColor borderTopColor borderRightColor borderBot" +
    "tomColor borderLeftColor color outlineColor\".split(\" \"),jc=/#([0-9" +
    "a-fA-F])([0-9a-fA-F])([0-9a-fA-F])/,kc=/^#(?:[0-9a-f]{3}){1,2}$/i," +
    "lc=/^(?:rgba)?\\((\\d{1,3}),\\s?(\\d{1,3}),\\s?(\\d{1,3}),\\s?(0|1|0\\.\\d*" +
    ")\\)$/i,mc=/^(?:rgb)?\\((0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2}),\\s?(0|[" +
    "1-9]\\d{0,2})\\)$/i;/*xxx_rpl_lic*/\nfunction X(a,b){return!!a&&1==a." +
    "nodeType&&(!b||a.tagName.toUpperCase()==b)}var nc=/[;]+(?=(?:(?:[^" +
    "\"]*\"){2})*[^\"]*$)(?=(?:(?:[^']*'){2})*[^']*$)(?=(?:[^()]*\\([^()]*\\" +
    "))*[^()]*$)/;function oc(a){var b=[];t(a.split(nc),function(a){var" +
    " d=a.indexOf(\":\");0<d&&(a=[a.slice(0,d),a.slice(d+1)],2==a.length&" +
    "&b.push(a[0].toLowerCase(),\":\",a[1],\";\"))});b=b.join(\"\");return b=" +
    "\";\"==b.charAt(b.length-1)?b:b+\";\"}\nfunction pc(a,b){b=b.toLowerCas" +
    "e();if(\"style\"==b)return oc(a.style.cssText);var c=a.getAttributeN" +
    "ode(b);return c&&c.specified?c.value:null}function qc(a){for(a=a.p" +
    "arentNode;a&&1!=a.nodeType&&9!=a.nodeType&&11!=a.nodeType;)a=a.par" +
    "entNode;return X(a)?a:null}\nfunction Y(a,b){var c=oa(b);if(\"float\"" +
    "==c||\"cssFloat\"==c||\"styleFloat\"==c)c=\"cssFloat\";var d;a:{d=c;var " +
    "e=x(a);if(e.defaultView&&e.defaultView.getComputedStyle&&(e=e.defa" +
    "ultView.getComputedStyle(a,null))){d=e[d]||e.getPropertyValue(d)||" +
    "\"\";break a}d=\"\"}d=d||rc(a,c);if(null===d)d=null;else if(0<=sa(ic,c" +
    ")){b:{var f=d.match(lc);if(f){var c=Number(f[1]),e=Number(f[2]),g=" +
    "Number(f[3]),f=Number(f[4]);if(0<=c&&255>=c&&0<=e&&255>=e&&0<=g&&2" +
    "55>=g&&0<=f&&1>=f){c=[c,e,g,f];break b}}c=null}if(!c)b:{if(g=d.mat" +
    "ch(mc))if(c=\nNumber(g[1]),e=Number(g[2]),g=Number(g[3]),0<=c&&255>" +
    "=c&&0<=e&&255>=e&&0<=g&&255>=g){c=[c,e,g,1];break b}c=null}if(!c)b" +
    ":{c=d.toLowerCase();e=hc[c.toLowerCase()];if(!e&&(e=\"#\"==c.charAt(" +
    "0)?c:\"#\"+c,4==e.length&&(e=e.replace(jc,\"#$1$1$2$2$3$3\")),!kc.test" +
    "(e))){c=null;break b}c=[parseInt(e.substr(1,2),16),parseInt(e.subs" +
    "tr(3,2),16),parseInt(e.substr(5,2),16),1]}d=c?\"rgba(\"+c.join(\", \")" +
    "+\")\":d}return d}\nfunction rc(a,b){var c=a.currentStyle||a.style,d=" +
    "c[b];void 0===d&&da(c.getPropertyValue)&&(d=c.getPropertyValue(b))" +
    ";return\"inherit\"!=d?void 0!==d?d:null:(c=qc(a))?rc(c,b):null}\nfunc" +
    "tion sc(a,b){function c(a){if(\"none\"==Y(a,\"display\"))return!1;a=qc" +
    "(a);return!a||c(a)}function d(a){var b=tc(a);return 0<b.height&&0<" +
    "b.width?!0:X(a,\"PATH\")&&(0<b.height||0<b.width)?(a=Y(a,\"stroke-wid" +
    "th\"),!!a&&0<parseInt(a,10)):\"hidden\"!=Y(a,\"overflow\")&&va(a.childN" +
    "odes,function(a){return 3==a.nodeType||X(a)&&d(a)})}function e(a){" +
    "return\"hidden\"==uc(a)&&wa(a.childNodes,function(a){return!X(a)||e(" +
    "a)})}if(!X(a))throw Error(\"Argument to isShown must be of type Ele" +
    "ment\");if(X(a,\"BODY\"))return!0;if(X(a,\n\"OPTION\")||X(a,\"OPTGROUP\"))" +
    "{var f=La(a,function(a){return X(a,\"SELECT\")});return!!f&&sc(f,!0)" +
    "}return(f=wc(a))?!!f.F&&0<f.rect.width&&0<f.rect.height&&sc(f.F,b)" +
    ":X(a,\"INPUT\")&&\"hidden\"==a.type.toLowerCase()||X(a,\"NOSCRIPT\")||\"h" +
    "idden\"==Y(a,\"visibility\")||!c(a)||!b&&0==xc(a)||!d(a)?!1:!e(a)}\nfu" +
    "nction uc(a){function b(a){function b(a){return a==g?!0:0==Y(a,\"di" +
    "splay\").lastIndexOf(\"inline\",0)||\"absolute\"==c&&\"static\"==Y(a,\"pos" +
    "ition\")?!1:!0}var c=Y(a,\"position\");if(\"fixed\"==c)return m=!0,a==g" +
    "?null:g;for(a=qc(a);a&&!b(a);)a=qc(a);return a}function c(a){var b" +
    "=a;if(\"visible\"==p)if(a==g&&h)b=h;else if(a==h)return{x:\"visible\"," +
    "y:\"visible\"};b={x:Y(b,\"overflow-x\"),y:Y(b,\"overflow-y\")};a==g&&(b." +
    "x=\"visible\"==b.x?\"auto\":b.x,b.y=\"visible\"==b.y?\"auto\":b.y);return " +
    "b}function d(a){if(a==g){var b=(new Fa(f)).a;\na=b.body||b.document" +
    "Element;b=b.parentWindow||b.defaultView;a=new u(b.pageXOffset||a.s" +
    "crollLeft,b.pageYOffset||a.scrollTop)}else a=new u(a.scrollLeft,a." +
    "scrollTop);return a}var e=yc(a),f=x(a),g=f.documentElement,h=f.bod" +
    "y,p=Y(g,\"overflow\"),m;for(a=b(a);a;a=b(a)){var l=c(a);if(\"visible\"" +
    "!=l.x||\"visible\"!=l.y){var B=tc(a);if(0==B.width||0==B.height)retu" +
    "rn\"hidden\";var N=e.right<B.left,W=e.bottom<B.top;if(N&&\"hidden\"==l" +
    ".x||W&&\"hidden\"==l.y)return\"hidden\";if(N&&\"visible\"!=l.x||W&&\"visi" +
    "ble\"!=l.y){N=d(a);W=\ne.bottom<B.top-N.y;if(e.right<B.left-N.x&&\"vi" +
    "sible\"!=l.x||W&&\"visible\"!=l.x)return\"hidden\";e=uc(a);return\"hidde" +
    "n\"==e?\"hidden\":\"scroll\"}N=e.left>=B.left+B.width;B=e.top>=B.top+B." +
    "height;if(N&&\"hidden\"==l.x||B&&\"hidden\"==l.y)return\"hidden\";if(N&&" +
    "\"visible\"!=l.x||B&&\"visible\"!=l.y){if(m&&(l=d(a),e.left>=g.scrollW" +
    "idth-l.x||e.right>=g.scrollHeight-l.y))return\"hidden\";e=uc(a);retu" +
    "rn\"hidden\"==e?\"hidden\":\"scroll\"}}}return\"none\"}\nfunction tc(a){var" +
    " b=wc(a);if(b)return b.rect;if(X(a,\"HTML\"))return a=x(a),a=((a?a.p" +
    "arentWindow||a.defaultView:window)||window).document,a=\"CSS1Compat" +
    "\"==a.compatMode?a.documentElement:a.body,a=new v(a.clientWidth,a.c" +
    "lientHeight),new A(0,0,a.width,a.height);var c;try{c=a.getBounding" +
    "ClientRect()}catch(d){return new A(0,0,0,0)}return new A(c.left,c." +
    "top,c.right-c.left,c.bottom-c.top)}\nfunction wc(a){var b=X(a,\"MAP\"" +
    ");if(!b&&!X(a,\"AREA\"))return null;var c=b?a:X(a.parentNode,\"MAP\")?" +
    "a.parentNode:null,d=null,e=null;if(c&&c.name&&(d=x(c),d=V.o('/desc" +
    "endant::*[@usemap = \"#'+c.name+'\"]',d))&&(e=tc(d),!b&&\"default\"!=a" +
    ".shape.toLowerCase())){var f=zc(a);a=Math.min(Math.max(f.left,0),e" +
    ".width);b=Math.min(Math.max(f.top,0),e.height);c=Math.min(f.width," +
    "e.width-a);f=Math.min(f.height,e.height-b);e=new A(a+e.left,b+e.to" +
    "p,c,f)}return{F:d,rect:e||new A(0,0,0,0)}}\nfunction zc(a){var b=a." +
    "shape.toLowerCase();a=a.coords.split(\",\");if(\"rect\"==b&&4==a.lengt" +
    "h){var b=a[0],c=a[1];return new A(b,c,a[2]-b,a[3]-c)}if(\"circle\"==" +
    "b&&3==a.length)return b=a[2],new A(a[0]-b,a[1]-b,2*b,2*b);if(\"poly" +
    "\"==b&&2<a.length){for(var b=a[0],c=a[1],d=b,e=c,f=2;f+1<a.length;f" +
    "+=2)b=Math.min(b,a[f]),d=Math.max(d,a[f]),c=Math.min(c,a[f+1]),e=M" +
    "ath.max(e,a[f+1]);return new A(b,c,d-b,e-c)}return new A(0,0,0,0)}" +
    "function yc(a){a=tc(a);return new Ta(a.top,a.left+a.width,a.top+a." +
    "height,a.left)}\nfunction Ac(a){return a.replace(/^[^\\S\\xa0]+|[^\\S\\" +
    "xa0]+$/g,\"\")}function Bc(a){var b=[];Cc(a,b);var c=b;a=c.length;fo" +
    "r(var b=Array(a),c=q(c)?c.split(\"\"):c,d=0;d<a;d++)d in c&&(b[d]=Ac" +
    ".call(void 0,c[d]));return Ac(b.join(\"\\n\")).replace(/\\xa0/g,\" \")}\n" +
    "function Cc(a,b){if(X(a,\"BR\"))b.push(\"\");else{var c=X(a,\"TD\"),d=Y(" +
    "a,\"display\"),e=!c&&!(0<=sa(Dc,d)),f=void 0!=a.previousElementSibli" +
    "ng?a.previousElementSibling:Ga(a.previousSibling),f=f?Y(f,\"display" +
    "\"):\"\",g=Y(a,\"float\")||Y(a,\"cssFloat\")||Y(a,\"styleFloat\");!e||\"run-" +
    "in\"==f&&\"none\"==g||/^[\\s\\xa0]*$/.test(b[b.length-1]||\"\")||b.push(\"" +
    "\");var h=sc(a),p=null,m=null;h&&(p=Y(a,\"white-space\"),m=Y(a,\"text-" +
    "transform\"));t(a.childNodes,function(a){3==a.nodeType&&h?Ec(a,b,p," +
    "m):X(a)&&Cc(a,b)});f=b[b.length-1]||\"\";\n!c&&\"table-cell\"!=d||!f||k" +
    "a(f)||(b[b.length-1]+=\" \");e&&\"run-in\"!=d&&!/^[\\s\\xa0]*$/.test(f)&" +
    "&b.push(\"\")}}var Dc=\"inline inline-block inline-table none table-c" +
    "ell table-column table-column-group\".split(\" \");\nfunction Ec(a,b,c" +
    ",d){a=a.nodeValue.replace(/[\\u200b\\u200e\\u200f]/g,\"\");a=a.replace(" +
    "/(\\r\\n|\\r|\\n)/g,\"\\n\");if(\"normal\"==c||\"nowrap\"==c)a=a.replace(/\\n/" +
    "g,\" \");a=\"pre\"==c||\"pre-wrap\"==c?a.replace(/[ \\f\\t\\v\\u2028\\u2029]/" +
    "g,\"\\u00a0\"):a.replace(/[\\ \\f\\t\\v\\u2028\\u2029]+/g,\" \");\"capitalize\"" +
    "==d?a=a.replace(/(^|\\s)(\\S)/g,function(a,b,c){return b+c.toUpperCa" +
    "se()}):\"uppercase\"==d?a=a.toUpperCase():\"lowercase\"==d&&(a=a.toLow" +
    "erCase());c=b.pop()||\"\";ka(c)&&0==a.lastIndexOf(\" \",0)&&(a=a.subst" +
    "r(1));b.push(c+a)}\nfunction xc(a){var b=1,c=Y(a,\"opacity\");c&&(b=N" +
    "umber(c));(a=qc(a))&&(b*=xc(a));return b};/*xxx_rpl_lic*/\nvar Fc={" +
    "w:function(a,b){return!(!a.querySelectorAll||!a.querySelector)&&!/" +
    "^\\d.*/.test(b)},o:function(a,b){var c=w(b),d=q(a)?c.a.getElementBy" +
    "Id(a):a;if(!d)return null;if(pc(d,\"id\")==a&&Ha(b,d))return d;c=y(c" +
    ",\"*\");return xa(c,function(c){return pc(c,\"id\")==a&&Ha(b,c)})},s:f" +
    "unction(a,b){if(!a)return[];if(Fc.w(b,a))try{return b.querySelecto" +
    "rAll(\"#\"+Fc.K(a))}catch(c){return[]}var d=y(w(b),\"*\",null,b);retur" +
    "n ta(d,function(b){return pc(b,\"id\")==a})},K:function(a){return a." +
    "replace(/(['\"\\\\#.:;,!?+<>=~*^$|%&@`{}\\-\\/\\[\\]\\(\\)])/g,\n\"\\\\$1\")}};/" +
    "*xxx_rpl_lic*/\nvar Z={},Gc={};Z.J=function(a,b,c){var d;try{d=Sa.s" +
    "(\"a\",b)}catch(e){d=y(w(b),\"A\",null,b)}return xa(d,function(b){b=Bc" +
    "(b);return c&&-1!=b.indexOf(a)||b==a})};Z.G=function(a,b,c){var d;" +
    "try{d=Sa.s(\"a\",b)}catch(e){d=y(w(b),\"A\",null,b)}return ta(d,functi" +
    "on(b){b=Bc(b);return c&&-1!=b.indexOf(a)||b==a})};Z.o=function(a,b" +
    "){return Z.J(a,b,!1)};Z.s=function(a,b){return Z.G(a,b,!1)};Gc.o=f" +
    "unction(a,b){return Z.J(a,b,!0)};Gc.s=function(a,b){return Z.G(a,b" +
    ",!0)};/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\nvar Hc={o:function(a,b){retu" +
    "rn b.getElementsByTagName(a)[0]||null},s:function(a,b){return b.ge" +
    "tElementsByTagName(a)}};/*xxx_rpl_lic*/\nvar Ic={className:Na,\"clas" +
    "s name\":Na,css:Sa,\"css selector\":Sa,id:Fc,linkText:Z,\"link text\":Z" +
    ",name:{o:function(a,b){var c=y(w(b),\"*\",null,b);return xa(c,functi" +
    "on(b){return pc(b,\"name\")==a})},s:function(a,b){var c=y(w(b),\"*\",n" +
    "ull,b);return ta(c,function(b){return pc(b,\"name\")==a})}},partialL" +
    "inkText:Gc,\"partial link text\":Gc,tagName:Hc,\"tag name\":Hc,xpath:V" +
    "};ba(\"_\",function(a,b){var c;a:{for(c in a)if(a.hasOwnProperty(c))" +
    "break a;c=null}if(c){var d=Ic[c];if(d&&da(d.o))return d.o(a[c],b||" +
    "Ba.document)}throw Error(\"Unsupported locator strategy: \"+c);});;r" +
    "eturn this._.apply(null,arguments);}).apply({navigator:typeof wind" +
    "ow!=\"undefined\"?window.navigator:null},arguments);}\n"
  )
  .toString();
  static final String FIND_ELEMENT_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String FIND_ELEMENT_ANDROID_original() {
    return FIND_ELEMENT_ANDROID.replaceAll("xxx_rpl_lic", FIND_ELEMENT_ANDROID_license);
  }

/* field: FIND_ELEMENTS_ANDROID license: 

 Copyright 2014 Software Freedom Conservancy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
  static final String FIND_ELEMENTS_ANDROID =
  new StringBuilder(
    "function(){return(function(){function k(a){return function(){retur" +
    "n this[a]}}function n(a){return function(){return a}}var aa=this;f" +
    "unction ba(a,b){var c=a.split(\".\"),d=aa;c[0]in d||!d.execScript||d" +
    ".execScript(\"var \"+c[0]);for(var e;c.length&&(e=c.shift());)c.leng" +
    "th||void 0===b?d[e]?d=d[e]:d=d[e]={}:d[e]=b}\nfunction ca(a){var b=" +
    "typeof a;if(\"object\"==b)if(a){if(a instanceof Array)return\"array\";" +
    "if(a instanceof Object)return b;var c=Object.prototype.toString.ca" +
    "ll(a);if(\"[object Window]\"==c)return\"object\";if(\"[object Array]\"==" +
    "c||\"number\"==typeof a.length&&\"undefined\"!=typeof a.splice&&\"undef" +
    "ined\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"spl" +
    "ice\"))return\"array\";if(\"[object Function]\"==c||\"undefined\"!=typeof" +
    " a.call&&\"undefined\"!=typeof a.propertyIsEnumerable&&!a.propertyIs" +
    "Enumerable(\"call\"))return\"function\"}else return\"null\";\nelse if(\"fu" +
    "nction\"==b&&\"undefined\"==typeof a.call)return\"object\";return b}fun" +
    "ction q(a){return\"string\"==typeof a}function da(a){return\"function" +
    "\"==ca(a)}function ea(a,b,c){return a.call.apply(a.bind,arguments)}" +
    "function fa(a,b,c){if(!a)throw Error();if(2<arguments.length){var " +
    "d=Array.prototype.slice.call(arguments,2);return function(){var c=" +
    "Array.prototype.slice.call(arguments);Array.prototype.unshift.appl" +
    "y(c,d);return a.apply(b,c)}}return function(){return a.apply(b,arg" +
    "uments)}}\nfunction ga(a,b,c){ga=Function.prototype.bind&&-1!=Funct" +
    "ion.prototype.bind.toString().indexOf(\"native code\")?ea:fa;return " +
    "ga.apply(null,arguments)}function ha(a,b){var c=Array.prototype.sl" +
    "ice.call(arguments,1);return function(){var b=c.slice();b.push.app" +
    "ly(b,arguments);return a.apply(this,b)}}\nfunction r(a,b){function " +
    "c(){}c.prototype=b.prototype;a.P=b.prototype;a.prototype=new c;a.p" +
    "rototype.constructor=a;a.O=function(a,c,f){for(var g=Array(argumen" +
    "ts.length-2),h=2;h<arguments.length;h++)g[h-2]=arguments[h];return" +
    " b.prototype[c].apply(a,g)}}Function.prototype.bind=Function.proto" +
    "type.bind||function(a,b){if(1<arguments.length){var c=Array.protot" +
    "ype.slice.call(arguments,1);c.unshift(this,a);return ga.apply(null" +
    ",c)}return ga(this,a)};function ia(a){if(Error.captureStackTrace)E" +
    "rror.captureStackTrace(this,ia);else{var b=Error().stack;b&&(this." +
    "stack=b)}a&&(this.message=String(a))}r(ia,Error);ia.prototype.name" +
    "=\"CustomError\";var ja;function ka(a){var b=a.length-1;return 0<=b&" +
    "&a.indexOf(\" \",b)==b}function la(a,b){for(var c=a.split(\"%s\"),d=\"\"" +
    ",e=Array.prototype.slice.call(arguments,1);e.length&&1<c.length;)d" +
    "+=c.shift()+e.shift();return d+c.join(\"%s\")}var ma=String.prototyp" +
    "e.trim?function(a){return a.trim()}:function(a){return a.replace(/" +
    "^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function na(a,b){return a<b?-1:a>b?1:" +
    "0}function oa(a){return String(a).replace(/\\-([a-z])/g,function(a," +
    "c){return c.toUpperCase()})};function pa(a,b){b.unshift(a);ia.call" +
    "(this,la.apply(null,b));b.shift()}r(pa,ia);pa.prototype.name=\"Asse" +
    "rtionError\";function qa(a,b,c){if(!a){var d=\"Assertion failed\";if(" +
    "b)var d=d+(\": \"+b),e=Array.prototype.slice.call(arguments,2);throw" +
    " new pa(\"\"+d,e||[]);}};var ra=Array.prototype;function sa(a,b){if(" +
    "q(a))return q(b)&&1==b.length?a.indexOf(b,0):-1;for(var c=0;c<a.le" +
    "ngth;c++)if(c in a&&a[c]===b)return c;return-1}function t(a,b){for" +
    "(var c=a.length,d=q(a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.call(vo" +
    "id 0,d[e],e,a)}function ta(a,b){for(var c=a.length,d=[],e=0,f=q(a)" +
    "?a.split(\"\"):a,g=0;g<c;g++)if(g in f){var h=f[g];b.call(void 0,h,g" +
    ",a)&&(d[e++]=h)}return d}function ua(a,b,c){var d=c;t(a,function(c" +
    ",f){d=b.call(void 0,d,c,f,a)});return d}\nfunction va(a,b){for(var " +
    "c=a.length,d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void" +
    " 0,d[e],e,a))return!0;return!1}function wa(a,b){for(var c=a.length" +
    ",d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&!b.call(void 0,d[e],e" +
    ",a))return!1;return!0}function xa(a,b){var c;a:{c=a.length;for(var" +
    " d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e," +
    "a)){c=e;break a}c=-1}return 0>c?null:q(a)?a.charAt(c):a[c]}functio" +
    "n ya(a){return ra.concat.apply(ra,arguments)}\nfunction za(a,b,c){q" +
    "a(null!=a.length);return 2>=arguments.length?ra.slice.call(a,b):ra" +
    ".slice.call(a,b,c)};function Aa(a){var b=arguments.length;if(1==b&" +
    "&\"array\"==ca(arguments[0]))return Aa.apply(null,arguments[0]);for(" +
    "var c={},d=0;d<b;d++)c[arguments[d]]=!0;return c};/*xxx_rpl_lic*/\n" +
    "var Ba=window;Aa(\"area base br col command embed hr img input keyg" +
    "en link meta param source track wbr\".split(\" \"));function u(a,b){t" +
    "his.x=void 0!==a?a:0;this.y=void 0!==b?b:0}u.prototype.clone=funct" +
    "ion(){return new u(this.x,this.y)};u.prototype.toString=function()" +
    "{return\"(\"+this.x+\", \"+this.y+\")\"};u.prototype.ceil=function(){thi" +
    "s.x=Math.ceil(this.x);this.y=Math.ceil(this.y);return this};u.prot" +
    "otype.floor=function(){this.x=Math.floor(this.x);this.y=Math.floor" +
    "(this.y);return this};u.prototype.round=function(){this.x=Math.rou" +
    "nd(this.x);this.y=Math.round(this.y);return this};function v(a,b){" +
    "this.width=a;this.height=b}v.prototype.clone=function(){return new" +
    " v(this.width,this.height)};v.prototype.toString=function(){return" +
    "\"(\"+this.width+\" x \"+this.height+\")\"};v.prototype.ceil=function(){" +
    "this.width=Math.ceil(this.width);this.height=Math.ceil(this.height" +
    ");return this};v.prototype.floor=function(){this.width=Math.floor(" +
    "this.width);this.height=Math.floor(this.height);return this};\nv.pr" +
    "ototype.round=function(){this.width=Math.round(this.width);this.he" +
    "ight=Math.round(this.height);return this};var Ca;a:{var Da=aa.navi" +
    "gator;if(Da){var Ea=Da.userAgent;if(Ea){Ca=Ea;break a}}Ca=\"\"};func" +
    "tion w(a){return a?new Fa(x(a)):ja||(ja=new Fa)}function Ga(a){for" +
    "(;a&&1!=a.nodeType;)a=a.previousSibling;return a}function Ha(a,b){" +
    "if(a.contains&&1==b.nodeType)return a==b||a.contains(b);if(\"undefi" +
    "ned\"!=typeof a.compareDocumentPosition)return a==b||Boolean(a.comp" +
    "areDocumentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==" +
    "a}\nfunction Ia(a,b){if(a==b)return 0;if(a.compareDocumentPosition)" +
    "return a.compareDocumentPosition(b)&2?1:-1;if(\"sourceIndex\"in a||a" +
    ".parentNode&&\"sourceIndex\"in a.parentNode){var c=1==a.nodeType,d=1" +
    "==b.nodeType;if(c&&d)return a.sourceIndex-b.sourceIndex;var e=a.pa" +
    "rentNode,f=b.parentNode;return e==f?Ja(a,b):!c&&Ha(e,b)?-1*Ka(a,b)" +
    ":!d&&Ha(f,a)?Ka(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b.sourceIn" +
    "dex:f.sourceIndex)}d=x(a);c=d.createRange();c.selectNode(a);c.coll" +
    "apse(!0);d=d.createRange();d.selectNode(b);\nd.collapse(!0);return " +
    "c.compareBoundaryPoints(aa.Range.START_TO_END,d)}function Ka(a,b){" +
    "var c=a.parentNode;if(c==b)return-1;for(var d=b;d.parentNode!=c;)d" +
    "=d.parentNode;return Ja(d,a)}function Ja(a,b){for(var c=b;c=c.prev" +
    "iousSibling;)if(c==a)return-1;return 1}function x(a){qa(a,\"Node ca" +
    "nnot be null or undefined.\");return 9==a.nodeType?a:a.ownerDocumen" +
    "t||a.document}function La(a,b){a=a.parentNode;for(var c=0;a;){qa(\"" +
    "parentNode\"!=a.name);if(b(a))return a;a=a.parentNode;c++}return nu" +
    "ll}\nfunction Fa(a){this.a=a||aa.document||document}\nfunction y(a,b" +
    ",c,d){a=d||a.a;var e=b&&\"*\"!=b?b.toUpperCase():\"\";if(a.querySelect" +
    "orAll&&a.querySelector&&(e||c))c=a.querySelectorAll(e+(c?\".\"+c:\"\")" +
    ");else if(c&&a.getElementsByClassName)if(b=a.getElementsByClassNam" +
    "e(c),e){a={};for(var f=d=0,g;g=b[f];f++)e==g.nodeName&&(a[d++]=g);" +
    "a.length=d;c=a}else c=b;else if(b=a.getElementsByTagName(e||\"*\"),c" +
    "){a={};for(f=d=0;g=b[f];f++){var e=g.className,h;if(h=\"function\"==" +
    "typeof e.split)h=0<=sa(e.split(/\\s+/),c);h&&(a[d++]=g)}a.length=d;" +
    "c=a}else c=b;return c};/*xxx_rpl_lic*/\nfunction z(a,b){this.a=Ma[a" +
    "]||\"unknown error\";this.message=b||\"\";var c=this.a.replace(/((?:^|" +
    "\\s+)[a-z])/g,function(a){return a.toUpperCase().replace(/^[\\s\\xa0]" +
    "+/g,\"\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+=\"Error\";" +
    "this.name=c;c=Error(this.message);c.name=this.name;this.stack=c.st" +
    "ack||\"\"}r(z,Error);\nvar Ma={15:\"element not selectable\",11:\"elemen" +
    "t not visible\",31:\"ime engine activation failed\",30:\"ime not avail" +
    "able\",24:\"invalid cookie domain\",29:\"invalid element coordinates\"," +
    "12:\"invalid element state\",32:\"invalid selector\",51:\"invalid selec" +
    "tor\",52:\"invalid selector\",17:\"javascript error\",405:\"unsupported " +
    "operation\",34:\"move target out of bounds\",27:\"no such alert\",7:\"no" +
    " such element\",8:\"no such frame\",23:\"no such window\",28:\"script ti" +
    "meout\",33:\"session not created\",10:\"stale element reference\",\n0:\"s" +
    "uccess\",21:\"timeout\",25:\"unable to set cookie\",26:\"unexpected aler" +
    "t open\",13:\"unknown error\",9:\"unknown command\"};z.prototype.toStri" +
    "ng=function(){return this.name+\": \"+this.message};/*xxx_rpl_lic*/\n" +
    "var Na={w:function(a){return!(!a.querySelectorAll||!a.querySelecto" +
    "r)},s:function(a,b){if(!a)throw new z(32,\"No class name specified\"" +
    ");a=ma(a);if(-1!==a.indexOf(\" \"))throw new z(32,\"Compound class na" +
    "mes not permitted\");if(Na.w(b))try{return b.querySelector(\".\"+a.re" +
    "place(/\\./g,\"\\\\.\"))||null}catch(c){throw new z(32,\"An invalid or i" +
    "llegal class name was specified\");}var d=y(w(b),\"*\",a,b);return d." +
    "length?d[0]:null},m:function(a,b){if(!a)throw new z(32,\"No class n" +
    "ame specified\");a=ma(a);if(-1!==a.indexOf(\" \"))throw new z(32,\n\"Co" +
    "mpound class names not permitted\");if(Na.w(b))try{return b.querySe" +
    "lectorAll(\".\"+a.replace(/\\./g,\"\\\\.\"))}catch(c){throw new z(32,\"An " +
    "invalid or illegal class name was specified\");}return y(w(b),\"*\",a" +
    ",b)}};function Oa(a){return(a=a.exec(Ca))?a[1]:\"\"}Oa(/Android\\s+([" +
    "0-9.]+)/)||Oa(/Version\\/([0-9.]+)/);/*xxx_rpl_lic*/\nfunction Pa(a)" +
    "{var b=0,c=ma(String(Qa)).split(\".\");a=ma(String(a)).split(\".\");fo" +
    "r(var d=Math.max(c.length,a.length),e=0;0==b&&e<d;e++){var f=c[e]|" +
    "|\"\",g=a[e]||\"\",h=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),p=RegExp(\"(\\\\d*)(\\\\D*)" +
    "\",\"g\");do{var m=h.exec(f)||[\"\",\"\",\"\"],l=p.exec(g)||[\"\",\"\",\"\"];if(0" +
    "==m[0].length&&0==l[0].length)break;b=na(0==m[1].length?0:parseInt" +
    "(m[1],10),0==l[1].length?0:parseInt(l[1],10))||na(0==m[2].length,0" +
    "==l[2].length)||na(m[2],l[2])}while(0==b)}}\nvar Ra=/Android\\s+([0-" +
    "9\\.]+)/.exec(Ca),Qa=Ra?Ra[1]:\"0\";Pa(2.3);Pa(4);/*xxx_rpl_lic*/\nvar" +
    " Sa={s:function(a,b){da(b.querySelector);if(!a)throw new z(32,\"No " +
    "selector specified\");a=ma(a);var c;try{c=b.querySelector(a)}catch(" +
    "d){throw new z(32,\"An invalid or illegal selector was specified\");" +
    "}return c&&1==c.nodeType?c:null},m:function(a,b){da(b.querySelecto" +
    "rAll);if(!a)throw new z(32,\"No selector specified\");a=ma(a);try{re" +
    "turn b.querySelectorAll(a)}catch(c){throw new z(32,\"An invalid or " +
    "illegal selector was specified\");}}};function Ta(a,b,c,d){this.top" +
    "=a;this.right=b;this.bottom=c;this.left=d}Ta.prototype.clone=funct" +
    "ion(){return new Ta(this.top,this.right,this.bottom,this.left)};Ta" +
    ".prototype.toString=function(){return\"(\"+this.top+\"t, \"+this.right" +
    "+\"r, \"+this.bottom+\"b, \"+this.left+\"l)\"};Ta.prototype.ceil=functio" +
    "n(){this.top=Math.ceil(this.top);this.right=Math.ceil(this.right);" +
    "this.bottom=Math.ceil(this.bottom);this.left=Math.ceil(this.left);" +
    "return this};\nTa.prototype.floor=function(){this.top=Math.floor(th" +
    "is.top);this.right=Math.floor(this.right);this.bottom=Math.floor(t" +
    "his.bottom);this.left=Math.floor(this.left);return this};Ta.protot" +
    "ype.round=function(){this.top=Math.round(this.top);this.right=Math" +
    ".round(this.right);this.bottom=Math.round(this.bottom);this.left=M" +
    "ath.round(this.left);return this};function A(a,b,c,d){this.left=a;" +
    "this.top=b;this.width=c;this.height=d}A.prototype.clone=function()" +
    "{return new A(this.left,this.top,this.width,this.height)};A.protot" +
    "ype.toString=function(){return\"(\"+this.left+\", \"+this.top+\" - \"+th" +
    "is.width+\"w x \"+this.height+\"h)\"};A.prototype.ceil=function(){this" +
    ".left=Math.ceil(this.left);this.top=Math.ceil(this.top);this.width" +
    "=Math.ceil(this.width);this.height=Math.ceil(this.height);return t" +
    "his};\nA.prototype.floor=function(){this.left=Math.floor(this.left)" +
    ";this.top=Math.floor(this.top);this.width=Math.floor(this.width);t" +
    "his.height=Math.floor(this.height);return this};A.prototype.round=" +
    "function(){this.left=Math.round(this.left);this.top=Math.round(thi" +
    "s.top);this.width=Math.round(this.width);this.height=Math.round(th" +
    "is.height);return this};/*\n\n The MIT License\n\n Copyright (c) 2007 " +
    "Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is " +
    "hereby granted, free of charge, to any person obtaining a copy\n of" +
    " this software and associated documentation files (the \"Software\")" +
    ", to\n deal in the Software without restriction, including without " +
    "limitation the\n rights to use, copy, modify, merge, publish, distr" +
    "ibute, sublicense, and/or\n sell copies of the Software, and to per" +
    "mit persons to whom the Software is\n furnished to do so, subject t" +
    "o the following conditions:\n\n The above copyright notice and this " +
    "permission notice shall be included in\n all copies or substantial " +
    "portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITH" +
    "OUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT L" +
    "IMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTIC" +
    "ULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS O" +
    "R COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIA" +
    "BILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISI" +
    "NG\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR " +
    "OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Ua(a,b,c){this.a=a;th" +
    "is.b=b||1;this.f=c||1};/*\n\n The MIT License\n\n Copyright (c) 2007 C" +
    "ybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is h" +
    "ereby granted, free of charge, to any person obtaining a copy\n of " +
    "this software and associated documentation files (the \"Software\")," +
    " to\n deal in the Software without restriction, including without l" +
    "imitation the\n rights to use, copy, modify, merge, publish, distri" +
    "bute, sublicense, and/or\n sell copies of the Software, and to perm" +
    "it persons to whom the Software is\n furnished to do so, subject to" +
    " the following conditions:\n\n The above copyright notice and this p" +
    "ermission notice shall be included in\n all copies or substantial p" +
    "ortions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHO" +
    "UT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LI" +
    "MITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICU" +
    "LAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR" +
    " COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIAB" +
    "ILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISIN" +
    "G\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR O" +
    "THER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyrigh" +
    "t (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Per" +
    "mission is hereby granted, free of charge, to any person obtaining" +
    " a copy\n of this software and associated documentation files (the " +
    "\"Software\"), to\n deal in the Software without restriction, includi" +
    "ng without limitation the\n rights to use, copy, modify, merge, pub" +
    "lish, distribute, sublicense, and/or\n sell copies of the Software," +
    " and to permit persons to whom the Software is\n furnished to do so" +
    ", subject to the following conditions:\n\n The above copyright notic" +
    "e and this permission notice shall be included in\n all copies or s" +
    "ubstantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"A" +
    "S IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDIN" +
    "G BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS F" +
    "OR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE" +
    "\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR" +
    " OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHER" +
    "WISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR " +
    "THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT Licens" +
    "e\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Googl" +
    "e Inc.\n\n Permission is hereby granted, free of charge, to any pers" +
    "on obtaining a copy\n of this software and associated documentation" +
    " files (the \"Software\"), to\n deal in the Software without restrict" +
    "ion, including without limitation the\n rights to use, copy, modify" +
    ", merge, publish, distribute, sublicense, and/or\n sell copies of t" +
    "he Software, and to permit persons to whom the Software is\n furnis" +
    "hed to do so, subject to the following conditions:\n\n The above cop" +
    "yright notice and this permission notice shall be included in\n all" +
    " copies or substantial portions of the Software.\n\n THE SOFTWARE IS" +
    " PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLI" +
    "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY" +
    ",\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVE" +
    "NT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM" +
    ", DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, T" +
    "ORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE " +
    "SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunctio" +
    "n Va(a){this.b=a;this.a=0}function Wa(a){a=a.match(Xa);for(var b=0" +
    ";b<a.length;b++)Ya.test(a[b])&&a.splice(b,1);return new Va(a)}var " +
    "Xa=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\." +
    "\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\"," +
    "\"g\"),Ya=/^\\s/;function C(a,b){return a.b[a.a+(b||0)]}function D(a)" +
    "{return a.b[a.a++]}function Za(a){return a.b.length<=a.a};/*\n\n The" +
    " MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c)" +
    " 2012 Google Inc.\n\n Permission is hereby granted, free of charge, " +
    "to any person obtaining a copy\n of this software and associated do" +
    "cumentation files (the \"Software\"), to\n deal in the Software witho" +
    "ut restriction, including without limitation the\n rights to use, c" +
    "opy, modify, merge, publish, distribute, sublicense, and/or\n sell " +
    "copies of the Software, and to permit persons to whom the Software" +
    " is\n furnished to do so, subject to the following conditions:\n\n Th" +
    "e above copyright notice and this permission notice shall be inclu" +
    "ded in\n all copies or substantial portions of the Software.\n\n THE " +
    "SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRES" +
    "S OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERC" +
    "HANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT" +
    ". IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FO" +
    "R ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF " +
    "CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTIO" +
    "N WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE." +
    "\n*/\nfunction E(a){var b=null,c=a.nodeType;1==c&&(b=a.textContent,b" +
    "=void 0==b||null==b?a.innerText:b,b=void 0==b||null==b?\"\":b);if(\"s" +
    "tring\"!=typeof b)if(9==c||1==c){a=9==c?a.documentElement:a.firstCh" +
    "ild;for(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a.nodeValue),d" +
    "[c++]=a;while(a=a.firstChild);for(;c&&!(a=d[--c].nextSibling););}}" +
    "else b=a.nodeValue;return\"\"+b}\nfunction $a(a,b,c){if(null===b)retu" +
    "rn!0;try{if(!a.getAttribute)return!1}catch(d){return!1}return null" +
    "==c?!!a.getAttribute(b):a.getAttribute(b,2)==c}function ab(a,b,c,d" +
    ",e){return bb.call(null,a,b,q(c)?c:null,q(d)?d:null,e||new F)}\nfun" +
    "ction bb(a,b,c,d,e){b.getElementsByName&&d&&\"name\"==c?(b=b.getElem" +
    "entsByName(d),t(b,function(b){a.a(b)&&G(e,b)})):b.getElementsByCla" +
    "ssName&&d&&\"class\"==c?(b=b.getElementsByClassName(d),t(b,function(" +
    "b){b.className==d&&a.a(b)&&G(e,b)})):a instanceof H?cb(a,b,c,d,e):" +
    "b.getElementsByTagName&&(b=b.getElementsByTagName(a.f()),t(b,funct" +
    "ion(a){$a(a,c,d)&&G(e,a)}));return e}function db(a,b,c,d,e){for(b=" +
    "b.firstChild;b;b=b.nextSibling)$a(b,c,d)&&a.a(b)&&G(e,b);return e}" +
    "\nfunction cb(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)$a(b," +
    "c,d)&&a.a(b)&&G(e,b),cb(a,b,c,d,e)};/*\n\n The MIT License\n\n Copyrig" +
    "ht (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Pe" +
    "rmission is hereby granted, free of charge, to any person obtainin" +
    "g a copy\n of this software and associated documentation files (the" +
    " \"Software\"), to\n deal in the Software without restriction, includ" +
    "ing without limitation the\n rights to use, copy, modify, merge, pu" +
    "blish, distribute, sublicense, and/or\n sell copies of the Software" +
    ", and to permit persons to whom the Software is\n furnished to do s" +
    "o, subject to the following conditions:\n\n The above copyright noti" +
    "ce and this permission notice shall be included in\n all copies or " +
    "substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"" +
    "AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDI" +
    "NG BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS " +
    "FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL TH" +
    "E\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES O" +
    "R OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHE" +
    "RWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR" +
    " THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction F(){this." +
    "b=this.a=null;this.l=0}function eb(a){this.node=a;this.a=this.b=nu" +
    "ll}function fb(a,b){if(!a.a)return b;if(!b.a)return a;for(var c=a." +
    "a,d=b.a,e=null,f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):0" +
    "<Ia(c.node,d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=f" +
    ",g++;for(f=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.l=g;return a}fu" +
    "nction gb(a,b){var c=new eb(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=c" +
    ";a.l++}function G(a,b){var c=new eb(b);c.b=a.b;a.a?a.b.a=c:a.a=a.b" +
    "=c;a.b=c;a.l++}\nfunction hb(a){return(a=a.a)?a.node:null}function " +
    "ib(a){return(a=hb(a))?E(a):\"\"}function I(a,b){return new jb(a,!!b)" +
    "}function jb(a,b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=null}f" +
    "unction J(a){var b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c?" +
    "b.b:b.a;return c.node};/*\n\n The MIT License\n\n Copyright (c) 2007 C" +
    "ybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is h" +
    "ereby granted, free of charge, to any person obtaining a copy\n of " +
    "this software and associated documentation files (the \"Software\")," +
    " to\n deal in the Software without restriction, including without l" +
    "imitation the\n rights to use, copy, modify, merge, publish, distri" +
    "bute, sublicense, and/or\n sell copies of the Software, and to perm" +
    "it persons to whom the Software is\n furnished to do so, subject to" +
    " the following conditions:\n\n The above copyright notice and this p" +
    "ermission notice shall be included in\n all copies or substantial p" +
    "ortions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHO" +
    "UT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LI" +
    "MITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICU" +
    "LAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR" +
    " COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIAB" +
    "ILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISIN" +
    "G\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR O" +
    "THER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction kb(a){switch(a.nodeTyp" +
    "e){case 1:return ha(lb,a);case 9:return kb(a.documentElement);case" +
    " 11:case 10:case 6:case 12:return mb;default:return a.parentNode?k" +
    "b(a.parentNode):mb}}function mb(){return null}function lb(a,b){if(" +
    "a.prefix==b)return a.namespaceURI||\"http://www.w3.org/1999/xhtml\";" +
    "var c=a.getAttributeNode(\"xmlns:\"+b);return c&&c.specified?c.value" +
    "||null:a.parentNode&&9!=a.parentNode.nodeType?lb(a.parentNode,b):n" +
    "ull};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n " +
    "Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted, fre" +
    "e of charge, to any person obtaining a copy\n of this software and " +
    "associated documentation files (the \"Software\"), to\n deal in the S" +
    "oftware without restriction, including without limitation the\n rig" +
    "hts to use, copy, modify, merge, publish, distribute, sublicense, " +
    "and/or\n sell copies of the Software, and to permit persons to whom" +
    " the Software is\n furnished to do so, subject to the following con" +
    "ditions:\n\n The above copyright notice and this permission notice s" +
    "hall be included in\n all copies or substantial portions of the Sof" +
    "tware.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY" +
    " KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRA" +
    "NTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NO" +
    "NINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS" +
    " BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN " +
    "AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR" +
    " IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN " +
    "THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu " +
    "Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby " +
    "granted, free of charge, to any person obtaining a copy\n of this s" +
    "oftware and associated documentation files (the \"Software\"), to\n d" +
    "eal in the Software without restriction, including without limitat" +
    "ion the\n rights to use, copy, modify, merge, publish, distribute, " +
    "sublicense, and/or\n sell copies of the Software, and to permit per" +
    "sons to whom the Software is\n furnished to do so, subject to the f" +
    "ollowing conditions:\n\n The above copyright notice and this permiss" +
    "ion notice shall be included in\n all copies or substantial portion" +
    "s of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WAR" +
    "RANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED " +
    "TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PU" +
    "RPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYR" +
    "IGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY," +
    " WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FRO" +
    "M, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER D" +
    "EALINGS\n IN THE SOFTWARE.\n*/\nfunction K(a){this.i=a;this.b=this.g=" +
    "!1;this.f=null}function L(a){return\"\\n  \"+a.toString().split(\"\\n\")" +
    ".join(\"\\n  \")}function nb(a,b){a.g=b}function ob(a,b){a.b=b}functi" +
    "on M(a,b){var c=a.a(b);return c instanceof F?+ib(c):+c}function O(" +
    "a,b){var c=a.a(b);return c instanceof F?ib(c):\"\"+c}function pb(a,b" +
    "){var c=a.a(b);return c instanceof F?!!c.l:!!c};/*\n\n The MIT Licen" +
    "se\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Goog" +
    "le Inc.\n\n Permission is hereby granted, free of charge, to any per" +
    "son obtaining a copy\n of this software and associated documentatio" +
    "n files (the \"Software\"), to\n deal in the Software without restric" +
    "tion, including without limitation the\n rights to use, copy, modif" +
    "y, merge, publish, distribute, sublicense, and/or\n sell copies of " +
    "the Software, and to permit persons to whom the Software is\n furni" +
    "shed to do so, subject to the following conditions:\n\n The above co" +
    "pyright notice and this permission notice shall be included in\n al" +
    "l copies or substantial portions of the Software.\n\n THE SOFTWARE I" +
    "S PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPL" +
    "IED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILIT" +
    "Y,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EV" +
    "ENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAI" +
    "M, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, " +
    "TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE" +
    " SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfuncti" +
    "on qb(a,b,c){K.call(this,a.i);this.c=a;this.h=b;this.u=c;this.g=b." +
    "g||c.g;this.b=b.b||c.b;this.c==rb&&(c.b||c.g||4==c.i||0==c.i||!b.f" +
    "?b.b||b.g||4==b.i||0==b.i||!c.f||(this.f={name:c.f.name,v:b}):this"
  )
      .append(
    ".f={name:b.f.name,v:c})}r(qb,K);\nfunction sb(a,b,c,d,e){b=b.a(d);c" +
    "=c.a(d);var f;if(b instanceof F&&c instanceof F){e=I(b);for(d=J(e)" +
    ";d;d=J(e))for(b=I(c),f=J(b);f;f=J(b))if(a(E(d),E(f)))return!0;retu" +
    "rn!1}if(b instanceof F||c instanceof F){b instanceof F?e=b:(e=c,c=" +
    "b);e=I(e);b=typeof c;for(d=J(e);d;d=J(e)){switch(b){case \"number\":" +
    "d=+E(d);break;case \"boolean\":d=!!E(d);break;case \"string\":d=E(d);b" +
    "reak;default:throw Error(\"Illegal primitive type for comparison.\")" +
    ";}if(a(d,c))return!0}return!1}return e?\"boolean\"==typeof b||\"boole" +
    "an\"==typeof c?\na(!!b,!!c):\"number\"==typeof b||\"number\"==typeof c?a" +
    "(+b,+c):a(b,c):a(+b,+c)}qb.prototype.a=function(a){return this.c.o" +
    "(this.h,this.u,a)};qb.prototype.toString=function(){var a=\"Binary " +
    "Expression: \"+this.c,a=a+L(this.h);return a+=L(this.u)};function t" +
    "b(a,b,c,d){this.a=a;this.H=b;this.i=c;this.o=d}tb.prototype.toStri" +
    "ng=k(\"a\");var ub={};function P(a,b,c,d){if(ub.hasOwnProperty(a))th" +
    "row Error(\"Binary operator already created: \"+a);a=new tb(a,b,c,d)" +
    ";return ub[a.toString()]=a}\nP(\"div\",6,1,function(a,b,c){return M(a" +
    ",c)/M(b,c)});P(\"mod\",6,1,function(a,b,c){return M(a,c)%M(b,c)});P(" +
    "\"*\",6,1,function(a,b,c){return M(a,c)*M(b,c)});P(\"+\",5,1,function(" +
    "a,b,c){return M(a,c)+M(b,c)});P(\"-\",5,1,function(a,b,c){return M(a" +
    ",c)-M(b,c)});P(\"<\",4,2,function(a,b,c){return sb(function(a,b){ret" +
    "urn a<b},a,b,c)});P(\">\",4,2,function(a,b,c){return sb(function(a,b" +
    "){return a>b},a,b,c)});P(\"<=\",4,2,function(a,b,c){return sb(functi" +
    "on(a,b){return a<=b},a,b,c)});\nP(\">=\",4,2,function(a,b,c){return s" +
    "b(function(a,b){return a>=b},a,b,c)});var rb=P(\"=\",3,2,function(a," +
    "b,c){return sb(function(a,b){return a==b},a,b,c,!0)});P(\"!=\",3,2,f" +
    "unction(a,b,c){return sb(function(a,b){return a!=b},a,b,c,!0)});P(" +
    "\"and\",2,2,function(a,b,c){return pb(a,c)&&pb(b,c)});P(\"or\",1,2,fun" +
    "ction(a,b,c){return pb(a,c)||pb(b,c)});/*\n\n The MIT License\n\n Copy" +
    "right (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n" +
    " Permission is hereby granted, free of charge, to any person obtai" +
    "ning a copy\n of this software and associated documentation files (" +
    "the \"Software\"), to\n deal in the Software without restriction, inc" +
    "luding without limitation the\n rights to use, copy, modify, merge," +
    " publish, distribute, sublicense, and/or\n sell copies of the Softw" +
    "are, and to permit persons to whom the Software is\n furnished to d" +
    "o so, subject to the following conditions:\n\n The above copyright n" +
    "otice and this permission notice shall be included in\n all copies " +
    "or substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDE" +
    "D \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCL" +
    "UDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNE" +
    "SS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL" +
    " THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGE" +
    "S OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR O" +
    "THERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE" +
    " OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction vb(a,b" +
    "){if(b.a.length&&4!=a.i)throw Error(\"Primary expression must evalu" +
    "ate to nodeset if filter has predicate(s).\");K.call(this,a.i);this" +
    ".c=a;this.h=b;this.g=a.g;this.b=a.b}r(vb,K);vb.prototype.a=functio" +
    "n(a){a=this.c.a(a);return wb(this.h,a)};vb.prototype.toString=func" +
    "tion(){var a;a=\"Filter:\"+L(this.c);return a+=L(this.h)};/*\n\n The M" +
    "IT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2" +
    "012 Google Inc.\n\n Permission is hereby granted, free of charge, to" +
    " any person obtaining a copy\n of this software and associated docu" +
    "mentation files (the \"Software\"), to\n deal in the Software without" +
    " restriction, including without limitation the\n rights to use, cop" +
    "y, modify, merge, publish, distribute, sublicense, and/or\n sell co" +
    "pies of the Software, and to permit persons to whom the Software i" +
    "s\n furnished to do so, subject to the following conditions:\n\n The " +
    "above copyright notice and this permission notice shall be include" +
    "d in\n all copies or substantial portions of the Software.\n\n THE SO" +
    "FTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS " +
    "OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHA" +
    "NTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. " +
    "IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR " +
    "ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CO" +
    "NTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION " +
    "WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*" +
    "/\nfunction xb(a,b){if(b.length<a.I)throw Error(\"Function \"+a.j+\" e" +
    "xpects at least\"+a.I+\" arguments, \"+b.length+\" given\");if(null!==a" +
    ".B&&b.length>a.B)throw Error(\"Function \"+a.j+\" expects at most \"+a" +
    ".B+\" arguments, \"+b.length+\" given\");a.N&&t(b,function(b,d){if(4!=" +
    "b.i)throw Error(\"Argument \"+d+\" to function \"+a.j+\" is not of type" +
    " Nodeset: \"+b);});K.call(this,a.i);this.h=a;this.c=b;nb(this,a.g||" +
    "va(b,function(a){return a.g}));ob(this,a.M&&!b.length||a.L&&!!b.le" +
    "ngth||va(b,function(a){return a.b}))}\nr(xb,K);xb.prototype.a=funct" +
    "ion(a){return this.h.o.apply(null,ya(a,this.c))};xb.prototype.toSt" +
    "ring=function(){var a=\"Function: \"+this.h;if(this.c.length)var b=u" +
    "a(this.c,function(a,b){return a+L(b)},\"Arguments:\"),a=a+L(b);retur" +
    "n a};function yb(a,b,c,d,e,f,g,h,p){this.j=a;this.i=b;this.g=c;thi" +
    "s.M=d;this.L=e;this.o=f;this.I=g;this.B=void 0!==h?h:g;this.N=!!p}" +
    "yb.prototype.toString=k(\"j\");var zb={};\nfunction Q(a,b,c,d,e,f,g,h" +
    "){if(zb.hasOwnProperty(a))throw Error(\"Function already created: \"" +
    "+a+\".\");zb[a]=new yb(a,b,c,d,!1,e,f,g,h)}Q(\"boolean\",2,!1,!1,funct" +
    "ion(a,b){return pb(b,a)},1);Q(\"ceiling\",1,!1,!1,function(a,b){retu" +
    "rn Math.ceil(M(b,a))},1);Q(\"concat\",3,!1,!1,function(a,b){var c=za" +
    "(arguments,1);return ua(c,function(b,c){return b+O(c,a)},\"\")},2,nu" +
    "ll);Q(\"contains\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return-" +
    "1!=b.indexOf(a)},2);Q(\"count\",1,!1,!1,function(a,b){return b.a(a)." +
    "l},1,1,!0);\nQ(\"false\",2,!1,!1,n(!1),0);Q(\"floor\",1,!1,!1,function(" +
    "a,b){return Math.floor(M(b,a))},1);Q(\"id\",4,!1,!1,function(a,b){va" +
    "r c=a.a,d=9==c.nodeType?c:c.ownerDocument,c=O(b,a).split(/\\s+/),e=" +
    "[];t(c,function(a){a=d.getElementById(a);!a||0<=sa(e,a)||e.push(a)" +
    "});e.sort(Ia);var f=new F;t(e,function(a){G(f,a)});return f},1);Q(" +
    "\"lang\",2,!1,!1,n(!1),1);Q(\"last\",1,!0,!1,function(a){if(1!=argumen" +
    "ts.length)throw Error(\"Function last expects ()\");return a.f},0);\n" +
    "Q(\"local-name\",3,!1,!0,function(a,b){var c=b?hb(b.a(a)):a.a;return" +
    " c?c.localName||c.nodeName.toLowerCase():\"\"},0,1,!0);Q(\"name\",3,!1" +
    ",!0,function(a,b){var c=b?hb(b.a(a)):a.a;return c?c.nodeName.toLow" +
    "erCase():\"\"},0,1,!0);Q(\"namespace-uri\",3,!0,!1,n(\"\"),0,1,!0);Q(\"no" +
    "rmalize-space\",3,!1,!0,function(a,b){return(b?O(b,a):E(a.a)).repla" +
    "ce(/[\\s\\xa0]+/g,\" \").replace(/^\\s+|\\s+$/g,\"\")},0,1);Q(\"not\",2,!1,!" +
    "1,function(a,b){return!pb(b,a)},1);Q(\"number\",1,!1,!0,function(a,b" +
    "){return b?M(b,a):+E(a.a)},0,1);\nQ(\"position\",1,!0,!1,function(a){" +
    "return a.b},0);Q(\"round\",1,!1,!1,function(a,b){return Math.round(M" +
    "(b,a))},1);Q(\"starts-with\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c," +
    "a);return 0==b.lastIndexOf(a,0)},2);Q(\"string\",3,!1,!0,function(a," +
    "b){return b?O(b,a):E(a.a)},0,1);Q(\"string-length\",1,!1,!0,function" +
    "(a,b){return(b?O(b,a):E(a.a)).length},0,1);\nQ(\"substring\",3,!1,!1," +
    "function(a,b,c,d){c=M(c,a);if(isNaN(c)||Infinity==c||-Infinity==c)" +
    "return\"\";d=d?M(d,a):Infinity;if(isNaN(d)||-Infinity===d)return\"\";c" +
    "=Math.round(c)-1;var e=Math.max(c,0);a=O(b,a);if(Infinity==d)retur" +
    "n a.substring(e);b=Math.round(d);return a.substring(e,c+b)},2,3);Q" +
    "(\"substring-after\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);c=b.i" +
    "ndexOf(a);return-1==c?\"\":b.substring(c+a.length)},2);\nQ(\"substring" +
    "-before\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);a=b.indexOf(a);" +
    "return-1==a?\"\":b.substring(0,a)},2);Q(\"sum\",1,!1,!1,function(a,b){" +
    "for(var c=I(b.a(a)),d=0,e=J(c);e;e=J(c))d+=+E(e);return d},1,1,!0)" +
    ";Q(\"translate\",3,!1,!1,function(a,b,c,d){b=O(b,a);c=O(c,a);var e=O" +
    "(d,a);a=[];for(d=0;d<c.length;d++){var f=c.charAt(d);f in a||(a[f]" +
    "=e.charAt(d))}c=\"\";for(d=0;d<b.length;d++)f=b.charAt(d),c+=f in a?" +
    "a[f]:f;return c},3);Q(\"true\",2,!1,!1,n(!0),0);/*\n\n The MIT License" +
    "\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google" +
    " Inc.\n\n Permission is hereby granted, free of charge, to any perso" +
    "n obtaining a copy\n of this software and associated documentation " +
    "files (the \"Software\"), to\n deal in the Software without restricti" +
    "on, including without limitation the\n rights to use, copy, modify," +
    " merge, publish, distribute, sublicense, and/or\n sell copies of th" +
    "e Software, and to permit persons to whom the Software is\n furnish" +
    "ed to do so, subject to the following conditions:\n\n The above copy" +
    "right notice and this permission notice shall be included in\n all " +
    "copies or substantial portions of the Software.\n\n THE SOFTWARE IS " +
    "PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIE" +
    "D, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY," +
    "\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVEN" +
    "T SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM," +
    " DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TO" +
    "RT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE S" +
    "OFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The" +
    " MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c)" +
    " 2012 Google Inc.\n\n Permission is hereby granted, free of charge, " +
    "to any person obtaining a copy\n of this software and associated do" +
    "cumentation files (the \"Software\"), to\n deal in the Software witho" +
    "ut restriction, including without limitation the\n rights to use, c" +
    "opy, modify, merge, publish, distribute, sublicense, and/or\n sell " +
    "copies of the Software, and to permit persons to whom the Software" +
    " is\n furnished to do so, subject to the following conditions:\n\n Th" +
    "e above copyright notice and this permission notice shall be inclu" +
    "ded in\n all copies or substantial portions of the Software.\n\n THE " +
    "SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRES" +
    "S OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERC" +
    "HANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT" +
    ". IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FO" +
    "R ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF " +
    "CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTIO" +
    "N WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE." +
    "\n*/\nfunction H(a,b){this.h=a;this.c=void 0!==b?b:null;this.b=null;" +
    "switch(a){case \"comment\":this.b=8;break;case \"text\":this.b=3;break" +
    ";case \"processing-instruction\":this.b=7;break;case \"node\":break;de" +
    "fault:throw Error(\"Unexpected argument\");}}function Ab(a){return\"c" +
    "omment\"==a||\"text\"==a||\"processing-instruction\"==a||\"node\"==a}H.pr" +
    "ototype.a=function(a){return null===this.b||this.b==a.nodeType};H." +
    "prototype.f=k(\"h\");H.prototype.toString=function(){var a=\"Kind Tes" +
    "t: \"+this.h;null===this.c||(a+=L(this.c));return a};/*\n\n The MIT L" +
    "icense\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 " +
    "Google Inc.\n\n Permission is hereby granted, free of charge, to any" +
    " person obtaining a copy\n of this software and associated document" +
    "ation files (the \"Software\"), to\n deal in the Software without res" +
    "triction, including without limitation the\n rights to use, copy, m" +
    "odify, merge, publish, distribute, sublicense, and/or\n sell copies" +
    " of the Software, and to permit persons to whom the Software is\n f" +
    "urnished to do so, subject to the following conditions:\n\n The abov" +
    "e copyright notice and this permission notice shall be included in" +
    "\n all copies or substantial portions of the Software.\n\n THE SOFTWA" +
    "RE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n " +
    "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTAB" +
    "ILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN N" +
    "O EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY " +
    "CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRA" +
    "CT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH" +
    " THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfu" +
    "nction Bb(a){K.call(this,3);this.c=a.substring(1,a.length-1)}r(Bb," +
    "K);Bb.prototype.a=k(\"c\");Bb.prototype.toString=function(){return\"L" +
    "iteral: \"+this.c};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu" +
    " Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby" +
    " granted, free of charge, to any person obtaining a copy\n of this " +
    "software and associated documentation files (the \"Software\"), to\n " +
    "deal in the Software without restriction, including without limita" +
    "tion the\n rights to use, copy, modify, merge, publish, distribute," +
    " sublicense, and/or\n sell copies of the Software, and to permit pe" +
    "rsons to whom the Software is\n furnished to do so, subject to the " +
    "following conditions:\n\n The above copyright notice and this permis" +
    "sion notice shall be included in\n all copies or substantial portio" +
    "ns of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WA" +
    "RRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED" +
    " TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR P" +
    "URPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPY" +
    "RIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY" +
    ", WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FR" +
    "OM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER " +
    "DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Cb(a,b){this.j=a.toLowerCas" +
    "e();this.b=b?b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}Cb.pro" +
    "totype.a=function(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=th" +
    "is.j&&this.j!=a.nodeName.toLowerCase()?!1:this.b==(a.namespaceURI?" +
    "a.namespaceURI.toLowerCase():\"http://www.w3.org/1999/xhtml\")};Cb.p" +
    "rototype.f=k(\"j\");Cb.prototype.toString=function(){return\"Name Tes" +
    "t: \"+(\"http://www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+this.j" +
    "};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Cop" +
    "yright (c) 2012 Google Inc.\n\n Permission is hereby granted, free o" +
    "f charge, to any person obtaining a copy\n of this software and ass" +
    "ociated documentation files (the \"Software\"), to\n deal in the Soft" +
    "ware without restriction, including without limitation the\n rights" +
    " to use, copy, modify, merge, publish, distribute, sublicense, and" +
    "/or\n sell copies of the Software, and to permit persons to whom th" +
    "e Software is\n furnished to do so, subject to the following condit" +
    "ions:\n\n The above copyright notice and this permission notice shal" +
    "l be included in\n all copies or substantial portions of the Softwa" +
    "re.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KI" +
    "ND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTI" +
    "ES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONIN" +
    "FRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE" +
    " LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN " +
    "ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN" +
    " CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE" +
    " SOFTWARE.\n*/\nfunction Db(a){K.call(this,1);this.c=a}r(Db,K);Db.pr" +
    "ototype.a=k(\"c\");Db.prototype.toString=function(){return\"Number: \"" +
    "+this.c};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, In" +
    "c.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted," +
    " free of charge, to any person obtaining a copy\n of this software " +
    "and associated documentation files (the \"Software\"), to\n deal in t" +
    "he Software without restriction, including without limitation the\n" +
    " rights to use, copy, modify, merge, publish, distribute, sublicen" +
    "se, and/or\n sell copies of the Software, and to permit persons to " +
    "whom the Software is\n furnished to do so, subject to the following" +
    " conditions:\n\n The above copyright notice and this permission noti" +
    "ce shall be included in\n all copies or substantial portions of the" +
    " Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF" +
    " ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE W" +
    "ARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AN" +
    "D NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOL" +
    "DERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER" +
    " IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT O" +
    "F OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n" +
    " IN THE SOFTWARE.\n*/\nfunction Eb(a,b){K.call(this,a.i);this.h=a;th" +
    "is.c=b;this.g=a.g;this.b=a.b;if(1==this.c.length){var c=this.c[0];" +
    "c.A||c.c!=Fb||(c=c.u,\"*\"!=c.f()&&(this.f={name:c.f(),v:null}))}}r(" +
    "Eb,K);function Gb(){K.call(this,4)}r(Gb,K);Gb.prototype.a=function" +
    "(a){var b=new F;a=a.a;9==a.nodeType?G(b,a):G(b,a.ownerDocument);re" +
    "turn b};Gb.prototype.toString=n(\"Root Helper Expression\");function" +
    " Hb(){K.call(this,4)}r(Hb,K);Hb.prototype.a=function(a){var b=new " +
    "F;G(b,a.a);return b};Hb.prototype.toString=n(\"Context Helper Expre" +
    "ssion\");\nfunction Ib(a){return\"/\"==a||\"//\"==a}Eb.prototype.a=funct" +
    "ion(a){var b=this.h.a(a);if(!(b instanceof F))throw Error(\"Filter " +
    "expression must evaluate to nodeset.\");a=this.c;for(var c=0,d=a.le" +
    "ngth;c<d&&b.l;c++){var e=a[c],f=I(b,e.c.a),g;if(e.g||e.c!=Jb)if(e." +
    "g||e.c!=Kb)for(g=J(f),b=e.a(new Ua(g));null!=(g=J(f));)g=e.a(new U" +
    "a(g)),b=fb(b,g);else g=J(f),b=e.a(new Ua(g));else{for(g=J(f);(b=J(" +
    "f))&&(!g.contains||g.contains(b))&&b.compareDocumentPosition(g)&8;" +
    "g=b);b=e.a(new Ua(g))}}return b};\nEb.prototype.toString=function()" +
    "{var a;a=\"Path Expression:\"+L(this.h);if(this.c.length){var b=ua(t" +
    "his.c,function(a,b){return a+L(b)},\"Steps:\");a+=L(b)}return a};/*\n" +
    "\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyrigh" +
    "t (c) 2012 Google Inc.\n\n Permission is hereby granted, free of cha" +
    "rge, to any person obtaining a copy\n of this software and associat" +
    "ed documentation files (the \"Software\"), to\n deal in the Software " +
    "without restriction, including without limitation the\n rights to u" +
    "se, copy, modify, merge, publish, distribute, sublicense, and/or\n " +
    "sell copies of the Software, and to permit persons to whom the Sof" +
    "tware is\n furnished to do so, subject to the following conditions:" +
    "\n\n The above copyright notice and this permission notice shall be " +
    "included in\n all copies or substantial portions of the Software.\n\n" +
    " THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, E" +
    "XPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF" +
    " MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRING" +
    "EMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIAB" +
    "LE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTIO" +
    "N OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONN" +
    "ECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFT" +
    "WARE.\n*/\nfunction Lb(a,b){this.a=a;this.b=!!b}\nfunction wb(a,b,c){" +
    "for(c=c||0;c<a.a.length;c++)for(var d=a.a[c],e=I(b),f=b.l,g,h=0;g=" +
    "J(e);h++){var p=a.b?f-h:h+1;g=d.a(new Ua(g,p,f));if(\"number\"==type" +
    "of g)p=p==g;else if(\"string\"==typeof g||\"boolean\"==typeof g)p=!!g;" +
    "else if(g instanceof F)p=0<g.l;else throw Error(\"Predicate.evaluat" +
    "e returned an unexpected type.\");if(!p){p=e;g=p.f;var m=p.a;if(!m)" +
    "throw Error(\"Next must be called at least once before remove.\");va" +
    "r l=m.b,m=m.a;l?l.a=m:g.a=m;m?m.b=l:g.b=l;g.l--;p.a=null}}return b" +
    "}\nLb.prototype.toString=function(){return ua(this.a,function(a,b){" +
    "return a+L(b)},\"Predicates:\")};/*\n\n The MIT License\n\n Copyright (c" +
    ") 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permiss" +
    "ion is hereby granted, free of charge, to any person obtaining a c" +
    "opy\n of this software and associated documentation files (the \"Sof" +
    "tware\"), to\n deal in the Software without restriction, including w" +
    "ithout limitation the\n rights to use, copy, modify, merge, publish" +
    ", distribute, sublicense, and/or\n sell copies of the Software, and" +
    " to permit persons to whom the Software is\n furnished to do so, su" +
    "bject to the following conditions:\n\n The above copyright notice an" +
    "d this permission notice shall be included in\n all copies or subst" +
    "antial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS" +
    "\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BU" +
    "T NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A" +
    " PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AU" +
    "THORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTH" +
    "ER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE" +
    ", ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE " +
    "USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction R(a,b,c,d){K.c" +
    "all(this,4);this.c=a;this.u=b;this.h=c||new Lb([]);this.A=!!d;b=th" +
    "is.h;b=0<b.a.length?b.a[0].f:null;a.b&&b&&(this.f={name:b.name,v:b" +
    ".v});a:{a=this.h;for(b=0;b<a.a.length;b++)if(c=a.a[b],c.g||1==c.i|" +
    "|0==c.i){a=!0;break a}a=!1}this.g=a}r(R,K);\nR.prototype.a=function" +
    "(a){var b=a.a,c=null,c=this.f,d=null,e=null,f=0;c&&(d=c.name,e=c.v" +
    "?O(c.v,a):null,f=1);if(this.A)if(this.g||this.c!=Nb)if(a=I((new R(" +
    "Ob,new H(\"node\"))).a(a)),b=J(a))for(c=this.o(b,d,e,f);null!=(b=J(a" +
    "));)c=fb(c,this.o(b,d,e,f));else c=new F;else c=ab(this.u,b,d,e),c" +
    "=wb(this.h,c,f);else c=this.o(a.a,d,e,f);return c};R.prototype.o=f" +
    "unction(a,b,c,d){a=this.c.f(this.u,a,b,c);return a=wb(this.h,a,d)}" +
    ";\nR.prototype.toString=function(){var a;a=\"Step:\"+L(\"Operator: \"+(" +
    "this.A?\"//\":\"/\"));this.c.j&&(a+=L(\"Axis: \"+this.c));a+=L(this.u);i" +
    "f(this.h.a.length){var b=ua(this.h.a,function(a,b){return a+L(b)}," +
    "\"Predicates:\");a+=L(b)}return a};function Pb(a,b,c,d){this.j=a;thi" +
    "s.f=b;this.a=c;this.b=d}Pb.prototype.toString=k(\"j\");var Qb={};fun" +
    "ction S(a,b,c,d){if(Qb.hasOwnProperty(a))throw Error(\"Axis already" +
    " created: \"+a);b=new Pb(a,b,c,!!d);return Qb[a]=b}\nS(\"ancestor\",fu" +
    "nction(a,b){for(var c=new F,d=b;d=d.parentNode;)a.a(d)&&gb(c,d);re" +
    "turn c},!0);S(\"ancestor-or-self\",function(a,b){var c=new F,d=b;do " +
    "a.a(d)&&gb(c,d);while(d=d.parentNode);return c},!0);var Fb=S(\"attr" +
    "ibute\",function(a,b){var c=new F,d=a.f(),e=b.attributes;if(e)if(a " +
    "instanceof H&&null===a.b||\"*\"==d)for(var d=0,f;f=e[d];d++)G(c,f);e" +
    "lse(f=e.getNamedItem(d))&&G(c,f);return c},!1),Nb=S(\"child\",functi" +
    "on(a,b,c,d,e){return db.call(null,a,b,q(c)?c:null,q(d)?d:null,e||n" +
    "ew F)},!1,!0);\nS(\"descendant\",ab,!1,!0);var Ob=S(\"descendant-or-se" +
    "lf\",function(a,b,c,d){var e=new F;$a(b,c,d)&&a.a(b)&&G(e,b);return" +
    " ab(a,b,c,d,e)},!1,!0),Jb=S(\"following\",function(a,b,c,d){var e=ne" +
    "w F;do for(var f=b;f=f.nextSibling;)$a(f,c,d)&&a.a(f)&&G(e,f),e=ab" +
    "(a,f,c,d,e);while(b=b.parentNode);return e},!1,!0);S(\"following-si" +
    "bling\",function(a,b){for(var c=new F,d=b;d=d.nextSibling;)a.a(d)&&" +
    "G(c,d);return c},!1);S(\"namespace\",function(){return new F},!1);\nv" +
    "ar Rb=S(\"parent\",function(a,b){var c=new F;if(9==b.nodeType)return" +
    " c;if(2==b.nodeType)return G(c,b.ownerElement),c;var d=b.parentNod" +
    "e;a.a(d)&&G(c,d);return c},!1),Kb=S(\"preceding\",function(a,b,c,d){" +
    "var e=new F,f=[];do f.unshift(b);while(b=b.parentNode);for(var g=1" +
    ",h=f.length;g<h;g++){var p=[];for(b=f[g];b=b.previousSibling;)p.un" +
    "shift(b);for(var m=0,l=p.length;m<l;m++)b=p[m],$a(b,c,d)&&a.a(b)&&" +
    "G(e,b),e=ab(a,b,c,d,e)}return e},!0,!0);\nS(\"preceding-sibling\",fun" +
    "ction(a,b){for(var c=new F,d=b;d=d.previousSibling;)a.a(d)&&gb(c,d" +
    ");return c},!0);var Sb=S(\"self\",function(a,b){var c=new F;a.a(b)&&" +
    "G(c,b);return c},!1);/*\n\n The MIT License\n\n Copyright (c) 2007 Cyb" +
    "ozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is her" +
    "eby granted, free of charge, to any person obtaining a copy\n of th" +
    "is software and associated documentation files (the \"Software\"), t" +
    "o\n deal in the Software without restriction, including without lim" +
    "itation the\n rights to use, copy, modify, merge, publish, distribu" +
    "te, sublicense, and/or\n sell copies of the Software, and to permit" +
    " persons to whom the Software is\n furnished to do so, subject to t" +
    "he following conditions:\n\n The above copyright notice and this per" +
    "mission notice shall be included in\n all copies or substantial por" +
    "tions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT" +
    " WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMI" +
    "TED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULA" +
    "R PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR C" +
    "OPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABIL" +
    "ITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n" +
    " FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTH" +
    "ER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Tb(a){K.call(this,1);thi" +
    "s.c=a;this.g=a.g;this.b=a.b}r(Tb,K);Tb.prototype.a=function(a){ret" +
    "urn-M(this.c,a)};Tb.prototype.toString=function(){return\"Unary Exp" +
    "ression: -\"+L(this.c)};/*\n\n The MIT License\n\n Copyright (c) 2007 C" +
    "ybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is h" +
    "ereby granted, free of charge, to any person obtaining a copy\n of " +
    "this software and associated documentation files (the \"Software\")," +
    " to\n deal in the Software without restriction, including without l" +
    "imitation the\n rights to use, copy, modify, merge, publish, distri" +
    "bute, sublicense, and/or\n sell copies of the Software, and to perm" +
    "it persons to whom the Software is\n furnished to do so, subject to" +
    " the following conditions:\n\n The above copyright notice and this p" +
    "ermission notice shall be included in\n all copies or substantial p" +
    "ortions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHO" +
    "UT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LI" +
    "MITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICU" +
    "LAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR" +
    " COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIAB" +
    "ILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISIN" +
    "G\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR O" +
    "THER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Ub(a){K.call(this,4);t" +
    "his.c=a;nb(this,va(this.c,function(a){return a.g}));ob(this,va(thi" +
    "s.c,function(a){return a.b}))}r(Ub,K);Ub.prototype.a=function(a){v" +
    "ar b=new F;t(this.c,function(c){c=c.a(a);if(!(c instanceof F))thro" +
    "w Error(\"Path expression must evaluate to NodeSet.\");b=fb(b,c)});r" +
    "eturn b};Ub.prototype.toString=function(){return ua(this.c,functio" +
    "n(a,b){return a+L(b)},\"Union Expression:\")};/*\n\n The MIT License\n\n" +
    " Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google I" +
    "nc.\n\n Permission is hereby granted, free of charge, to any person " +
    "obtaining a copy\n of this software and associated documentation fi" +
    "les (the \"Software\"), to\n deal in the Software without restriction" +
    ", including without limitation the\n rights to use, copy, modify, m" +
    "erge, publish, distribute, sublicense, and/or\n sell copies of the " +
    "Software, and to permit persons to whom the Software is\n furnished" +
    " to do so, subject to the following conditions:\n\n The above copyri" +
    "ght notice and this permission notice shall be included in\n all co" +
    "pies or substantial portions of the Software.\n\n THE SOFTWARE IS PR" +
    "OVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED," +
    " INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n "
  )
      .append(
    "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT " +
    "SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, D" +
    "AMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT" +
    " OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOF" +
    "TWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction V" +
    "b(a,b){this.a=a;this.b=b}function Wb(a){for(var b,c=[];;){T(a,\"Mis" +
    "sing right hand side of binary expression.\");b=Xb(a);var d=D(a.a);" +
    "if(!d)break;var e=(d=ub[d]||null)&&d.H;if(!e){a.a.a--;break}for(;c" +
    ".length&&e<=c[c.length-1].H;)b=new qb(c.pop(),c.pop(),b);c.push(b," +
    "d)}for(;c.length;)b=new qb(c.pop(),c.pop(),b);return b}function T(" +
    "a,b){if(Za(a.a))throw Error(b);}function Yb(a,b){var c=D(a.a);if(c" +
    "!=b)throw Error(\"Bad token, expected: \"+b+\" got: \"+c);}\nfunction Z" +
    "b(a){a=D(a.a);if(\")\"!=a)throw Error(\"Bad token: \"+a);}function $b(" +
    "a){a=D(a.a);if(2>a.length)throw Error(\"Unclosed literal string\");r" +
    "eturn new Bb(a)}function ac(a){var b=D(a.a),c=b.indexOf(\":\");if(-1" +
    "==c)return new Cb(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw E" +
    "rror(\"Namespace prefix not declared: \"+d);b=b.substr(c+1);return n" +
    "ew Cb(b,a)}\nfunction bc(a){var b,c=[],d;if(Ib(C(a.a))){b=D(a.a);d=" +
    "C(a.a);if(\"/\"==b&&(Za(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?!" +
    "[0-9])[\\w]/.test(d)))return new Gb;d=new Gb;T(a,\"Missing next loca" +
    "tion step.\");b=cc(a,b);c.push(b)}else{a:{b=C(a.a);d=b.charAt(0);sw" +
    "itch(d){case \"$\":throw Error(\"Variable reference not allowed in HT" +
    "ML XPath\");case \"(\":D(a.a);b=Wb(a);T(a,'unclosed \"(\"');Yb(a,\")\");b" +
    "reak;case '\"':case \"'\":b=$b(a);break;default:if(isNaN(+b))if(!Ab(b" +
    ")&&/(?![0-9])[\\w]/.test(d)&&\"(\"==C(a.a,1)){b=D(a.a);\nb=zb[b]||null" +
    ";D(a.a);for(d=[];\")\"!=C(a.a);){T(a,\"Missing function argument list" +
    ".\");d.push(Wb(a));if(\",\"!=C(a.a))break;D(a.a)}T(a,\"Unclosed functi" +
    "on argument list.\");Zb(a);b=new xb(b,d)}else{b=null;break a}else b" +
    "=new Db(+D(a.a))}\"[\"==C(a.a)&&(d=new Lb(dc(a)),b=new vb(b,d))}if(b" +
    ")if(Ib(C(a.a)))d=b;else return b;else b=cc(a,\"/\"),d=new Hb,c.push(" +
    "b)}for(;Ib(C(a.a));)b=D(a.a),T(a,\"Missing next location step.\"),b=" +
    "cc(a,b),c.push(b);return new Eb(d,c)}\nfunction cc(a,b){var c,d,e;i" +
    "f(\"/\"!=b&&\"//\"!=b)throw Error('Step op should be \"/\" or \"//\"');if(" +
    "\".\"==C(a.a))return d=new R(Sb,new H(\"node\")),D(a.a),d;if(\"..\"==C(a" +
    ".a))return d=new R(Rb,new H(\"node\")),D(a.a),d;var f;if(\"@\"==C(a.a)" +
    ")f=Fb,D(a.a),T(a,\"Missing attribute name\");else if(\"::\"==C(a.a,1))" +
    "{if(!/(?![0-9])[\\w]/.test(C(a.a).charAt(0)))throw Error(\"Bad token" +
    ": \"+D(a.a));c=D(a.a);f=Qb[c]||null;if(!f)throw Error(\"No axis with" +
    " name: \"+c);D(a.a);T(a,\"Missing node name\")}else f=Nb;c=C(a.a);if(" +
    "/(?![0-9])[\\w]/.test(c.charAt(0)))if(\"(\"==\nC(a.a,1)){if(!Ab(c))thr" +
    "ow Error(\"Invalid node type: \"+c);c=D(a.a);if(!Ab(c))throw Error(\"" +
    "Invalid type name: \"+c);Yb(a,\"(\");T(a,\"Bad nodetype\");e=C(a.a).cha" +
    "rAt(0);var g=null;if('\"'==e||\"'\"==e)g=$b(a);T(a,\"Bad nodetype\");Zb" +
    "(a);c=new H(c,g)}else c=ac(a);else if(\"*\"==c)c=ac(a);else throw Er" +
    "ror(\"Bad token: \"+D(a.a));e=new Lb(dc(a),f.a);return d||new R(f,c," +
    "e,\"//\"==b)}\nfunction dc(a){for(var b=[];\"[\"==C(a.a);){D(a.a);T(a,\"" +
    "Missing predicate expression.\");var c=Wb(a);b.push(c);T(a,\"Unclose" +
    "d predicate expression.\");Yb(a,\"]\")}return b}function Xb(a){if(\"-\"" +
    "==C(a.a))return D(a.a),new Tb(Xb(a));var b=bc(a);if(\"|\"!=C(a.a))a=" +
    "b;else{for(b=[b];\"|\"==D(a.a);)T(a,\"Missing next union location pat" +
    "h.\"),b.push(bc(a));a.a.a--;a=new Ub(b)}return a};/*\n\n The MIT Lice" +
    "nse\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Goo" +
    "gle Inc.\n\n Permission is hereby granted, free of charge, to any pe" +
    "rson obtaining a copy\n of this software and associated documentati" +
    "on files (the \"Software\"), to\n deal in the Software without restri" +
    "ction, including without limitation the\n rights to use, copy, modi" +
    "fy, merge, publish, distribute, sublicense, and/or\n sell copies of" +
    " the Software, and to permit persons to whom the Software is\n furn" +
    "ished to do so, subject to the following conditions:\n\n The above c" +
    "opyright notice and this permission notice shall be included in\n a" +
    "ll copies or substantial portions of the Software.\n\n THE SOFTWARE " +
    "IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMP" +
    "LIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILI" +
    "TY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO E" +
    "VENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLA" +
    "IM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT," +
    " TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH TH" +
    "E SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunct" +
    "ion ec(a,b){if(!a.length)throw Error(\"Empty XPath expression.\");va" +
    "r c=Wa(a);if(Za(c))throw Error(\"Invalid XPath expression.\");b?da(b" +
    ")||(b=ga(b.lookupNamespaceURI,b)):b=n(null);var d=Wb(new Vb(c,b));" +
    "if(!Za(c))throw Error(\"Bad token: \"+D(c));this.evaluate=function(a" +
    ",b){var c=d.a(new Ua(a));return new U(c,b)}}\nfunction U(a,b){if(0=" +
    "=b)if(a instanceof F)b=4;else if(\"string\"==typeof a)b=2;else if(\"n" +
    "umber\"==typeof a)b=1;else if(\"boolean\"==typeof a)b=3;else throw Er" +
    "ror(\"Unexpected evaluation result.\");if(2!=b&&1!=b&&3!=b&&!(a inst" +
    "anceof F))throw Error(\"value could not be converted to the specifi" +
    "ed type\");this.resultType=b;var c;switch(b){case 2:this.stringValu" +
    "e=a instanceof F?ib(a):\"\"+a;break;case 1:this.numberValue=a instan" +
    "ceof F?+ib(a):+a;break;case 3:this.booleanValue=a instanceof F?0<a" +
    ".l:!!a;break;case 4:case 5:case 6:case 7:var d=\nI(a);c=[];for(var " +
    "e=J(d);e;e=J(d))c.push(e);this.snapshotLength=a.l;this.invalidIter" +
    "atorState=!1;break;case 8:case 9:this.singleNodeValue=hb(a);break;" +
    "default:throw Error(\"Unknown XPathResult type.\");}var f=0;this.ite" +
    "rateNext=function(){if(4!=b&&5!=b)throw Error(\"iterateNext called " +
    "with wrong result type\");return f>=c.length?null:c[f++]};this.snap" +
    "shotItem=function(a){if(6!=b&&7!=b)throw Error(\"snapshotItem calle" +
    "d with wrong result type\");return a>=c.length||0>a?null:c[a]}}U.AN" +
    "Y_TYPE=0;\nU.NUMBER_TYPE=1;U.STRING_TYPE=2;U.BOOLEAN_TYPE=3;U.UNORD" +
    "ERED_NODE_ITERATOR_TYPE=4;U.ORDERED_NODE_ITERATOR_TYPE=5;U.UNORDER" +
    "ED_NODE_SNAPSHOT_TYPE=6;U.ORDERED_NODE_SNAPSHOT_TYPE=7;U.ANY_UNORD" +
    "ERED_NODE_TYPE=8;U.FIRST_ORDERED_NODE_TYPE=9;function fc(a){this.l" +
    "ookupNamespaceURI=kb(a)}\nfunction gc(a){a=a||aa;var b=a.document;b" +
    ".evaluate||(a.XPathResult=U,b.evaluate=function(a,b,e,f){return(ne" +
    "w ec(a,e)).evaluate(b,f)},b.createExpression=function(a,b){return " +
    "new ec(a,b)},b.createNSResolver=function(a){return new fc(a)})}ba(" +
    "\"wgxpath.install\",gc);/*xxx_rpl_lic*/\nvar V={};V.C=function(){var " +
    "a={R:\"http://www.w3.org/2000/svg\"};return function(b){return a[b]|" +
    "|null}}();\nV.o=function(a,b,c){var d=x(a);if(!d.documentElement)re" +
    "turn null;gc(d?d.parentWindow||d.defaultView:window);try{for(var e" +
    "=d.createNSResolver?d.createNSResolver(d.documentElement):V.C,f={}" +
    ",g=d.getElementsByTagName(\"*\"),h=0;h<g.length;++h){var p=g[h],m=p." +
    "namespaceURI;if(!f[m]){var l=p.lookupPrefix(m);if(!l){var B=m.matc" +
    "h(\".*/(\\\\w+)/?$\");B?l=B[1]:l=\"xhtml\"}f[m]=l}}var N={},W;for(W in f" +
    ")N[f[W]]=W;e=function(a){return N[a]||null};try{return d.evaluate(" +
    "b,a,e,c,null)}catch(Mb){if(\"TypeError\"===Mb.name)return e=\nd.creat" +
    "eNSResolver?d.createNSResolver(d.documentElement):V.C,d.evaluate(b" +
    ",a,e,c,null);throw Mb;}}catch(vc){throw new z(32,\"Unable to locate" +
    " an element with the xpath expression \"+b+\" because of the followi" +
    "ng error:\\n\"+vc);}};V.D=function(a,b){if(!a||1!=a.nodeType)throw n" +
    "ew z(32,'The result of the xpath expression \"'+b+'\" is: '+a+\". It " +
    "should be an element.\");};\nV.s=function(a,b){var c=function(){var " +
    "c=V.o(b,a,9);return c?c.singleNodeValue||null:b.selectSingleNode?(" +
    "c=x(b),c.setProperty&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b" +
    ".selectSingleNode(a)):null}();null===c||V.D(c,a);return c};\nV.m=fu" +
    "nction(a,b){var c=function(){var c=V.o(b,a,7);if(c){for(var e=c.sn" +
    "apshotLength,f=[],g=0;g<e;++g)f.push(c.snapshotItem(g));return f}r" +
    "eturn b.selectNodes?(c=x(b),c.setProperty&&c.setProperty(\"Selectio" +
    "nLanguage\",\"XPath\"),b.selectNodes(a)):[]}();t(c,function(b){V.D(b," +
    "a)});return c};var hc={aliceblue:\"#f0f8ff\",antiquewhite:\"#faebd7\"," +
    "aqua:\"#00ffff\",aquamarine:\"#7fffd4\",azure:\"#f0ffff\",beige:\"#f5f5dc" +
    "\",bisque:\"#ffe4c4\",black:\"#000000\",blanchedalmond:\"#ffebcd\",blue:\"" +
    "#0000ff\",blueviolet:\"#8a2be2\",brown:\"#a52a2a\",burlywood:\"#deb887\"," +
    "cadetblue:\"#5f9ea0\",chartreuse:\"#7fff00\",chocolate:\"#d2691e\",coral" +
    ":\"#ff7f50\",cornflowerblue:\"#6495ed\",cornsilk:\"#fff8dc\",crimson:\"#d" +
    "c143c\",cyan:\"#00ffff\",darkblue:\"#00008b\",darkcyan:\"#008b8b\",darkgo" +
    "ldenrod:\"#b8860b\",darkgray:\"#a9a9a9\",darkgreen:\"#006400\",\ndarkgrey" +
    ":\"#a9a9a9\",darkkhaki:\"#bdb76b\",darkmagenta:\"#8b008b\",darkolivegree" +
    "n:\"#556b2f\",darkorange:\"#ff8c00\",darkorchid:\"#9932cc\",darkred:\"#8b" +
    "0000\",darksalmon:\"#e9967a\",darkseagreen:\"#8fbc8f\",darkslateblue:\"#" +
    "483d8b\",darkslategray:\"#2f4f4f\",darkslategrey:\"#2f4f4f\",darkturquo" +
    "ise:\"#00ced1\",darkviolet:\"#9400d3\",deeppink:\"#ff1493\",deepskyblue:" +
    "\"#00bfff\",dimgray:\"#696969\",dimgrey:\"#696969\",dodgerblue:\"#1e90ff\"" +
    ",firebrick:\"#b22222\",floralwhite:\"#fffaf0\",forestgreen:\"#228b22\",f" +
    "uchsia:\"#ff00ff\",gainsboro:\"#dcdcdc\",\nghostwhite:\"#f8f8ff\",gold:\"#" +
    "ffd700\",goldenrod:\"#daa520\",gray:\"#808080\",green:\"#008000\",greenye" +
    "llow:\"#adff2f\",grey:\"#808080\",honeydew:\"#f0fff0\",hotpink:\"#ff69b4\"" +
    ",indianred:\"#cd5c5c\",indigo:\"#4b0082\",ivory:\"#fffff0\",khaki:\"#f0e6" +
    "8c\",lavender:\"#e6e6fa\",lavenderblush:\"#fff0f5\",lawngreen:\"#7cfc00\"" +
    ",lemonchiffon:\"#fffacd\",lightblue:\"#add8e6\",lightcoral:\"#f08080\",l" +
    "ightcyan:\"#e0ffff\",lightgoldenrodyellow:\"#fafad2\",lightgray:\"#d3d3" +
    "d3\",lightgreen:\"#90ee90\",lightgrey:\"#d3d3d3\",lightpink:\"#ffb6c1\",l" +
    "ightsalmon:\"#ffa07a\",\nlightseagreen:\"#20b2aa\",lightskyblue:\"#87cef" +
    "a\",lightslategray:\"#778899\",lightslategrey:\"#778899\",lightsteelblu" +
    "e:\"#b0c4de\",lightyellow:\"#ffffe0\",lime:\"#00ff00\",limegreen:\"#32cd3" +
    "2\",linen:\"#faf0e6\",magenta:\"#ff00ff\",maroon:\"#800000\",mediumaquama" +
    "rine:\"#66cdaa\",mediumblue:\"#0000cd\",mediumorchid:\"#ba55d3\",mediump" +
    "urple:\"#9370db\",mediumseagreen:\"#3cb371\",mediumslateblue:\"#7b68ee\"" +
    ",mediumspringgreen:\"#00fa9a\",mediumturquoise:\"#48d1cc\",mediumviole" +
    "tred:\"#c71585\",midnightblue:\"#191970\",mintcream:\"#f5fffa\",mistyros" +
    "e:\"#ffe4e1\",\nmoccasin:\"#ffe4b5\",navajowhite:\"#ffdead\",navy:\"#00008" +
    "0\",oldlace:\"#fdf5e6\",olive:\"#808000\",olivedrab:\"#6b8e23\",orange:\"#" +
    "ffa500\",orangered:\"#ff4500\",orchid:\"#da70d6\",palegoldenrod:\"#eee8a" +
    "a\",palegreen:\"#98fb98\",paleturquoise:\"#afeeee\",palevioletred:\"#db7" +
    "093\",papayawhip:\"#ffefd5\",peachpuff:\"#ffdab9\",peru:\"#cd853f\",pink:" +
    "\"#ffc0cb\",plum:\"#dda0dd\",powderblue:\"#b0e0e6\",purple:\"#800080\",red" +
    ":\"#ff0000\",rosybrown:\"#bc8f8f\",royalblue:\"#4169e1\",saddlebrown:\"#8" +
    "b4513\",salmon:\"#fa8072\",sandybrown:\"#f4a460\",seagreen:\"#2e8b57\",\ns" +
    "eashell:\"#fff5ee\",sienna:\"#a0522d\",silver:\"#c0c0c0\",skyblue:\"#87ce" +
    "eb\",slateblue:\"#6a5acd\",slategray:\"#708090\",slategrey:\"#708090\",sn" +
    "ow:\"#fffafa\",springgreen:\"#00ff7f\",steelblue:\"#4682b4\",tan:\"#d2b48" +
    "c\",teal:\"#008080\",thistle:\"#d8bfd8\",tomato:\"#ff6347\",turquoise:\"#4" +
    "0e0d0\",violet:\"#ee82ee\",wheat:\"#f5deb3\",white:\"#ffffff\",whitesmoke" +
    ":\"#f5f5f5\",yellow:\"#ffff00\",yellowgreen:\"#9acd32\"};/*xxx_rpl_lic*/" +
    "\nvar ic=\"backgroundColor borderTopColor borderRightColor borderBot" +
    "tomColor borderLeftColor color outlineColor\".split(\" \"),jc=/#([0-9" +
    "a-fA-F])([0-9a-fA-F])([0-9a-fA-F])/,kc=/^#(?:[0-9a-f]{3}){1,2}$/i," +
    "lc=/^(?:rgba)?\\((\\d{1,3}),\\s?(\\d{1,3}),\\s?(\\d{1,3}),\\s?(0|1|0\\.\\d*" +
    ")\\)$/i,mc=/^(?:rgb)?\\((0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2}),\\s?(0|[" +
    "1-9]\\d{0,2})\\)$/i;/*xxx_rpl_lic*/\nfunction X(a,b){return!!a&&1==a." +
    "nodeType&&(!b||a.tagName.toUpperCase()==b)}var nc=/[;]+(?=(?:(?:[^" +
    "\"]*\"){2})*[^\"]*$)(?=(?:(?:[^']*'){2})*[^']*$)(?=(?:[^()]*\\([^()]*\\" +
    "))*[^()]*$)/;function oc(a){var b=[];t(a.split(nc),function(a){var" +
    " d=a.indexOf(\":\");0<d&&(a=[a.slice(0,d),a.slice(d+1)],2==a.length&" +
    "&b.push(a[0].toLowerCase(),\":\",a[1],\";\"))});b=b.join(\"\");return b=" +
    "\";\"==b.charAt(b.length-1)?b:b+\";\"}\nfunction pc(a,b){b=b.toLowerCas" +
    "e();if(\"style\"==b)return oc(a.style.cssText);var c=a.getAttributeN" +
    "ode(b);return c&&c.specified?c.value:null}function qc(a){for(a=a.p" +
    "arentNode;a&&1!=a.nodeType&&9!=a.nodeType&&11!=a.nodeType;)a=a.par" +
    "entNode;return X(a)?a:null}\nfunction Y(a,b){var c=oa(b);if(\"float\"" +
    "==c||\"cssFloat\"==c||\"styleFloat\"==c)c=\"cssFloat\";var d;a:{d=c;var " +
    "e=x(a);if(e.defaultView&&e.defaultView.getComputedStyle&&(e=e.defa" +
    "ultView.getComputedStyle(a,null))){d=e[d]||e.getPropertyValue(d)||" +
    "\"\";break a}d=\"\"}d=d||rc(a,c);if(null===d)d=null;else if(0<=sa(ic,c" +
    ")){b:{var f=d.match(lc);if(f){var c=Number(f[1]),e=Number(f[2]),g=" +
    "Number(f[3]),f=Number(f[4]);if(0<=c&&255>=c&&0<=e&&255>=e&&0<=g&&2" +
    "55>=g&&0<=f&&1>=f){c=[c,e,g,f];break b}}c=null}if(!c)b:{if(g=d.mat" +
    "ch(mc))if(c=\nNumber(g[1]),e=Number(g[2]),g=Number(g[3]),0<=c&&255>" +
    "=c&&0<=e&&255>=e&&0<=g&&255>=g){c=[c,e,g,1];break b}c=null}if(!c)b" +
    ":{c=d.toLowerCase();e=hc[c.toLowerCase()];if(!e&&(e=\"#\"==c.charAt(" +
    "0)?c:\"#\"+c,4==e.length&&(e=e.replace(jc,\"#$1$1$2$2$3$3\")),!kc.test" +
    "(e))){c=null;break b}c=[parseInt(e.substr(1,2),16),parseInt(e.subs" +
    "tr(3,2),16),parseInt(e.substr(5,2),16),1]}d=c?\"rgba(\"+c.join(\", \")" +
    "+\")\":d}return d}\nfunction rc(a,b){var c=a.currentStyle||a.style,d=" +
    "c[b];void 0===d&&da(c.getPropertyValue)&&(d=c.getPropertyValue(b))" +
    ";return\"inherit\"!=d?void 0!==d?d:null:(c=qc(a))?rc(c,b):null}\nfunc" +
    "tion sc(a,b){function c(a){if(\"none\"==Y(a,\"display\"))return!1;a=qc" +
    "(a);return!a||c(a)}function d(a){var b=tc(a);return 0<b.height&&0<" +
    "b.width?!0:X(a,\"PATH\")&&(0<b.height||0<b.width)?(a=Y(a,\"stroke-wid" +
    "th\"),!!a&&0<parseInt(a,10)):\"hidden\"!=Y(a,\"overflow\")&&va(a.childN" +
    "odes,function(a){return 3==a.nodeType||X(a)&&d(a)})}function e(a){" +
    "return\"hidden\"==uc(a)&&wa(a.childNodes,function(a){return!X(a)||e(" +
    "a)})}if(!X(a))throw Error(\"Argument to isShown must be of type Ele" +
    "ment\");if(X(a,\"BODY\"))return!0;if(X(a,\n\"OPTION\")||X(a,\"OPTGROUP\"))" +
    "{var f=La(a,function(a){return X(a,\"SELECT\")});return!!f&&sc(f,!0)" +
    "}return(f=wc(a))?!!f.F&&0<f.rect.width&&0<f.rect.height&&sc(f.F,b)" +
    ":X(a,\"INPUT\")&&\"hidden\"==a.type.toLowerCase()||X(a,\"NOSCRIPT\")||\"h" +
    "idden\"==Y(a,\"visibility\")||!c(a)||!b&&0==xc(a)||!d(a)?!1:!e(a)}\nfu" +
    "nction uc(a){function b(a){function b(a){return a==g?!0:0==Y(a,\"di" +
    "splay\").lastIndexOf(\"inline\",0)||\"absolute\"==c&&\"static\"==Y(a,\"pos" +
    "ition\")?!1:!0}var c=Y(a,\"position\");if(\"fixed\"==c)return m=!0,a==g" +
    "?null:g;for(a=qc(a);a&&!b(a);)a=qc(a);return a}function c(a){var b" +
    "=a;if(\"visible\"==p)if(a==g&&h)b=h;else if(a==h)return{x:\"visible\"," +
    "y:\"visible\"};b={x:Y(b,\"overflow-x\"),y:Y(b,\"overflow-y\")};a==g&&(b." +
    "x=\"visible\"==b.x?\"auto\":b.x,b.y=\"visible\"==b.y?\"auto\":b.y);return " +
    "b}function d(a){if(a==g){var b=(new Fa(f)).a;\na=b.body||b.document" +
    "Element;b=b.parentWindow||b.defaultView;a=new u(b.pageXOffset||a.s" +
    "crollLeft,b.pageYOffset||a.scrollTop)}else a=new u(a.scrollLeft,a." +
    "scrollTop);return a}var e=yc(a),f=x(a),g=f.documentElement,h=f.bod" +
    "y,p=Y(g,\"overflow\"),m;for(a=b(a);a;a=b(a)){var l=c(a);if(\"visible\"" +
    "!=l.x||\"visible\"!=l.y){var B=tc(a);if(0==B.width||0==B.height)retu" +
    "rn\"hidden\";var N=e.right<B.left,W=e.bottom<B.top;if(N&&\"hidden\"==l" +
    ".x||W&&\"hidden\"==l.y)return\"hidden\";if(N&&\"visible\"!=l.x||W&&\"visi" +
    "ble\"!=l.y){N=d(a);W=\ne.bottom<B.top-N.y;if(e.right<B.left-N.x&&\"vi" +
    "sible\"!=l.x||W&&\"visible\"!=l.x)return\"hidden\";e=uc(a);return\"hidde" +
    "n\"==e?\"hidden\":\"scroll\"}N=e.left>=B.left+B.width;B=e.top>=B.top+B." +
    "height;if(N&&\"hidden\"==l.x||B&&\"hidden\"==l.y)return\"hidden\";if(N&&" +
    "\"visible\"!=l.x||B&&\"visible\"!=l.y){if(m&&(l=d(a),e.left>=g.scrollW" +
    "idth-l.x||e.right>=g.scrollHeight-l.y))return\"hidden\";e=uc(a);retu" +
    "rn\"hidden\"==e?\"hidden\":\"scroll\"}}}return\"none\"}\nfunction tc(a){var" +
    " b=wc(a);if(b)return b.rect;if(X(a,\"HTML\"))return a=x(a),a=((a?a.p" +
    "arentWindow||a.defaultView:window)||window).document,a=\"CSS1Compat" +
    "\"==a.compatMode?a.documentElement:a.body,a=new v(a.clientWidth,a.c" +
    "lientHeight),new A(0,0,a.width,a.height);var c;try{c=a.getBounding" +
    "ClientRect()}catch(d){return new A(0,0,0,0)}return new A(c.left,c." +
    "top,c.right-c.left,c.bottom-c.top)}\nfunction wc(a){var b=X(a,\"MAP\"" +
    ");if(!b&&!X(a,\"AREA\"))return null;var c=b?a:X(a.parentNode,\"MAP\")?" +
    "a.parentNode:null,d=null,e=null;if(c&&c.name&&(d=x(c),d=V.s('/desc" +
    "endant::*[@usemap = \"#'+c.name+'\"]',d))&&(e=tc(d),!b&&\"default\"!=a" +
    ".shape.toLowerCase())){var f=zc(a);a=Math.min(Math.max(f.left,0),e" +
    ".width);b=Math.min(Math.max(f.top,0),e.height);c=Math.min(f.width," +
    "e.width-a);f=Math.min(f.height,e.height-b);e=new A(a+e.left,b+e.to" +
    "p,c,f)}return{F:d,rect:e||new A(0,0,0,0)}}\nfunction zc(a){var b=a." +
    "shape.toLowerCase();a=a.coords.split(\",\");if(\"rect\"==b&&4==a.lengt" +
    "h){var b=a[0],c=a[1];return new A(b,c,a[2]-b,a[3]-c)}if(\"circle\"==" +
    "b&&3==a.length)return b=a[2],new A(a[0]-b,a[1]-b,2*b,2*b);if(\"poly" +
    "\"==b&&2<a.length){for(var b=a[0],c=a[1],d=b,e=c,f=2;f+1<a.length;f" +
    "+=2)b=Math.min(b,a[f]),d=Math.max(d,a[f]),c=Math.min(c,a[f+1]),e=M" +
    "ath.max(e,a[f+1]);return new A(b,c,d-b,e-c)}return new A(0,0,0,0)}" +
    "function yc(a){a=tc(a);return new Ta(a.top,a.left+a.width,a.top+a." +
    "height,a.left)}\nfunction Ac(a){return a.replace(/^[^\\S\\xa0]+|[^\\S\\" +
    "xa0]+$/g,\"\")}function Bc(a){var b=[];Cc(a,b);var c=b;a=c.length;fo" +
    "r(var b=Array(a),c=q(c)?c.split(\"\"):c,d=0;d<a;d++)d in c&&(b[d]=Ac" +
    ".call(void 0,c[d]));return Ac(b.join(\"\\n\")).replace(/\\xa0/g,\" \")}\n" +
    "function Cc(a,b){if(X(a,\"BR\"))b.push(\"\");else{var c=X(a,\"TD\"),d=Y(" +
    "a,\"display\"),e=!c&&!(0<=sa(Dc,d)),f=void 0!=a.previousElementSibli" +
    "ng?a.previousElementSibling:Ga(a.previousSibling),f=f?Y(f,\"display" +
    "\"):\"\",g=Y(a,\"float\")||Y(a,\"cssFloat\")||Y(a,\"styleFloat\");!e||\"run-" +
    "in\"==f&&\"none\"==g||/^[\\s\\xa0]*$/.test(b[b.length-1]||\"\")||b.push(\"" +
    "\");var h=sc(a),p=null,m=null;h&&(p=Y(a,\"white-space\"),m=Y(a,\"text-" +
    "transform\"));t(a.childNodes,function(a){3==a.nodeType&&h?Ec(a,b,p," +
    "m):X(a)&&Cc(a,b)});f=b[b.length-1]||\"\";\n!c&&\"table-cell\"!=d||!f||k" +
    "a(f)||(b[b.length-1]+=\" \");e&&\"run-in\"!=d&&!/^[\\s\\xa0]*$/.test(f)&" +
    "&b.push(\"\")}}var Dc=\"inline inline-block inline-table none table-c" +
    "ell table-column table-column-group\".split(\" \");\nfunction Ec(a,b,c" +
    ",d){a=a.nodeValue.replace(/[\\u200b\\u200e\\u200f]/g,\"\");a=a.replace(" +
    "/(\\r\\n|\\r|\\n)/g,\"\\n\");if(\"normal\"==c||\"nowrap\"==c)a=a.replace(/\\n/" +
    "g,\" \");a=\"pre\"==c||\"pre-wrap\"==c?a.replace(/[ \\f\\t\\v\\u2028\\u2029]/" +
    "g,\"\\u00a0\"):a.replace(/[\\ \\f\\t\\v\\u2028\\u2029]+/g,\" \");\"capitalize\"" +
    "==d?a=a.replace(/(^|\\s)(\\S)/g,function(a,b,c){return b+c.toUpperCa" +
    "se()}):\"uppercase\"==d?a=a.toUpperCase():\"lowercase\"==d&&(a=a.toLow" +
    "erCase());c=b.pop()||\"\";ka(c)&&0==a.lastIndexOf(\" \",0)&&(a=a.subst" +
    "r(1));b.push(c+a)}\nfunction xc(a){var b=1,c=Y(a,\"opacity\");c&&(b=N" +
    "umber(c));(a=qc(a))&&(b*=xc(a));return b};/*xxx_rpl_lic*/\nvar Fc={" +
    "w:function(a,b){return!(!a.querySelectorAll||!a.querySelector)&&!/" +
    "^\\d.*/.test(b)},s:function(a,b){var c=w(b),d=q(a)?c.a.getElementBy" +
    "Id(a):a;if(!d)return null;if(pc(d,\"id\")==a&&Ha(b,d))return d;c=y(c" +
    ",\"*\");return xa(c,function(c){return pc(c,\"id\")==a&&Ha(b,c)})},m:f" +
    "unction(a,b){if(!a)return[];if(Fc.w(b,a))try{return b.querySelecto" +
    "rAll(\"#\"+Fc.K(a))}catch(c){return[]}var d=y(w(b),\"*\",null,b);retur" +
    "n ta(d,function(b){return pc(b,\"id\")==a})},K:function(a){return a." +
    "replace(/(['\"\\\\#.:;,!?+<>=~*^$|%&@`{}\\-\\/\\[\\]\\(\\)])/g,\n\"\\\\$1\")}};/" +
    "*xxx_rpl_lic*/\nvar Z={},Gc={};Z.J=function(a,b,c){var d;try{d=Sa.m" +
    "(\"a\",b)}catch(e){d=y(w(b),\"A\",null,b)}return xa(d,function(b){b=Bc" +
    "(b);return c&&-1!=b.indexOf(a)||b==a})};Z.G=function(a,b,c){var d;" +
    "try{d=Sa.m(\"a\",b)}catch(e){d=y(w(b),\"A\",null,b)}return ta(d,functi" +
    "on(b){b=Bc(b);return c&&-1!=b.indexOf(a)||b==a})};Z.s=function(a,b" +
    "){return Z.J(a,b,!1)};Z.m=function(a,b){return Z.G(a,b,!1)};Gc.s=f" +
    "unction(a,b){return Z.J(a,b,!0)};Gc.m=function(a,b){return Z.G(a,b" +
    ",!0)};/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\nvar Hc={s:function(a,b){retu" +
    "rn b.getElementsByTagName(a)[0]||null},m:function(a,b){return b.ge" +
    "tElementsByTagName(a)}};/*xxx_rpl_lic*/\nvar Ic={className:Na,\"clas" +
    "s name\":Na,css:Sa,\"css selector\":Sa,id:Fc,linkText:Z,\"link text\":Z" +
    ",name:{s:function(a,b){var c=y(w(b),\"*\",null,b);return xa(c,functi" +
    "on(b){return pc(b,\"name\")==a})},m:function(a,b){var c=y(w(b),\"*\",n" +
    "ull,b);return ta(c,function(b){return pc(b,\"name\")==a})}},partialL" +
    "inkText:Gc,\"partial link text\":Gc,tagName:Hc,\"tag name\":Hc,xpath:V" +
    "};ba(\"_\",function(a,b){var c;a:{for(c in a)if(a.hasOwnProperty(c))" +
    "break a;c=null}if(c){var d=Ic[c];if(d&&da(d.m))return d.m(a[c],b||" +
    "Ba.document)}throw Error(\"Unsupported locator strategy: \"+c);});;r" +
    "eturn this._.apply(null,arguments);}).apply({navigator:typeof wind" +
    "ow!=\"undefined\"?window.navigator:null},arguments);}\n"
  )
  .toString();
  static final String FIND_ELEMENTS_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String FIND_ELEMENTS_ANDROID_original() {
    return FIND_ELEMENTS_ANDROID.replaceAll("xxx_rpl_lic", FIND_ELEMENTS_ANDROID_license);
  }

/* field: SEND_KEYS_ANDROID license: 

 Copyright 2014 Software Freedom Conservancy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
  static final String SEND_KEYS_ANDROID =
  new StringBuilder(
    "function(){return(function(){function aa(a){return function(){retu" +
    "rn this[a]}}function ba(a){return function(){return a}}var h,ca=th" +
    "is;function l(a){return void 0!==a}function da(a,b){var c=a.split(" +
    "\".\"),d=ca;c[0]in d||!d.execScript||d.execScript(\"var \"+c[0]);for(v" +
    "ar e;c.length&&(e=c.shift());)!c.length&&l(b)?d[e]=b:d[e]?d=d[e]:d" +
    "=d[e]={}}\nfunction ea(a){var b=typeof a;if(\"object\"==b)if(a){if(a " +
    "instanceof Array)return\"array\";if(a instanceof Object)return b;var" +
    " c=Object.prototype.toString.call(a);if(\"[object Window]\"==c)retur" +
    "n\"object\";if(\"[object Array]\"==c||\"number\"==typeof a.length&&\"unde" +
    "fined\"!=typeof a.splice&&\"undefined\"!=typeof a.propertyIsEnumerabl" +
    "e&&!a.propertyIsEnumerable(\"splice\"))return\"array\";if(\"[object Fun" +
    "ction]\"==c||\"undefined\"!=typeof a.call&&\"undefined\"!=typeof a.prop" +
    "ertyIsEnumerable&&!a.propertyIsEnumerable(\"call\"))return\"function\"" +
    "}else return\"null\";\nelse if(\"function\"==b&&\"undefined\"==typeof a.c" +
    "all)return\"object\";return b}function m(a){return\"string\"==typeof a" +
    "}function fa(a){return\"number\"==typeof a}function ga(a){return\"fun" +
    "ction\"==ea(a)}var ha=\"closure_uid_\"+(1E9*Math.random()>>>0),ia=0;f" +
    "unction ja(a,b,c){return a.call.apply(a.bind,arguments)}\nfunction " +
    "ka(a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.p" +
    "rototype.slice.call(arguments,2);return function(){var c=Array.pro" +
    "totype.slice.call(arguments);Array.prototype.unshift.apply(c,d);re" +
    "turn a.apply(b,c)}}return function(){return a.apply(b,arguments)}}" +
    "function la(a,b,c){la=Function.prototype.bind&&-1!=Function.protot" +
    "ype.bind.toString().indexOf(\"native code\")?ja:ka;return la.apply(n" +
    "ull,arguments)}\nfunction ma(a,b){var c=Array.prototype.slice.call(" +
    "arguments,1);return function(){var b=c.slice();b.push.apply(b,argu" +
    "ments);return a.apply(this,b)}}function n(a,b){function c(){}c.pro" +
    "totype=b.prototype;a.S=b.prototype;a.prototype=new c;a.prototype.c" +
    "onstructor=a;a.P=function(a,c,f){for(var g=Array(arguments.length-" +
    "2),k=2;k<arguments.length;k++)g[k-2]=arguments[k];return b.prototy" +
    "pe[c].apply(a,g)}}\nFunction.prototype.bind=Function.prototype.bind" +
    "||function(a,b){if(1<arguments.length){var c=Array.prototype.slice" +
    ".call(arguments,1);c.unshift(this,a);return la.apply(null,c)}retur" +
    "n la(this,a)};function na(a){if(Error.captureStackTrace)Error.capt" +
    "ureStackTrace(this,na);else{var b=Error().stack;b&&(this.stack=b)}" +
    "a&&(this.message=String(a))}n(na,Error);na.prototype.name=\"CustomE" +
    "rror\";function oa(a,b){for(var c=a.split(\"%s\"),d=\"\",e=Array.protot" +
    "ype.slice.call(arguments,1);e.length&&1<c.length;)d+=c.shift()+e.s" +
    "hift();return d+c.join(\"%s\")}var qa=String.prototype.trim?function" +
    "(a){return a.trim()}:function(a){return a.replace(/^[\\s\\xa0]+|[\\s\\" +
    "xa0]+$/g,\"\")};\nfunction ra(a,b){for(var c=0,d=qa(String(a)).split(" +
    "\".\"),e=qa(String(b)).split(\".\"),f=Math.max(d.length,e.length),g=0;" +
    "0==c&&g<f;g++){var k=d[g]||\"\",p=e[g]||\"\",r=RegExp(\"(\\\\d*)(\\\\D*)\",\"" +
    "g\"),G=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\");do{var x=r.exec(k)||[\"\",\"\",\"\"],t=" +
    "G.exec(p)||[\"\",\"\",\"\"];if(0==x[0].length&&0==t[0].length)break;c=sa" +
    "(0==x[1].length?0:parseInt(x[1],10),0==t[1].length?0:parseInt(t[1]" +
    ",10))||sa(0==x[2].length,0==t[2].length)||sa(x[2],t[2])}while(0==c" +
    ")}return c}function sa(a,b){return a<b?-1:a>b?1:0}\nfunction ta(a){" +
    "return String(a).replace(/\\-([a-z])/g,function(a,c){return c.toUpp" +
    "erCase()})};function ua(a,b){b.unshift(a);na.call(this,oa.apply(nu" +
    "ll,b));b.shift()}n(ua,na);ua.prototype.name=\"AssertionError\";funct" +
    "ion va(a,b,c){if(!a){var d=\"Assertion failed\";if(b)var d=d+(\": \"+b" +
    "),e=Array.prototype.slice.call(arguments,2);throw new ua(\"\"+d,e||[" +
    "]);}};var wa=Array.prototype;function xa(a,b){if(m(a))return m(b)&" +
    "&1==b.length?a.indexOf(b,0):-1;for(var c=0;c<a.length;c++)if(c in " +
    "a&&a[c]===b)return c;return-1}function q(a,b,c){for(var d=a.length" +
    ",e=m(a)?a.split(\"\"):a,f=0;f<d;f++)f in e&&b.call(c,e[f],f,a)}funct" +
    "ion ya(a,b,c){var d=c;q(a,function(c,f){d=b.call(void 0,d,c,f,a)})" +
    ";return d}function za(a,b){for(var c=a.length,d=m(a)?a.split(\"\"):a" +
    ",e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;return!1}" +
    "\nfunction Aa(a,b){for(var c=a.length,d=m(a)?a.split(\"\"):a,e=0;e<c;" +
    "e++)if(e in d&&!b.call(void 0,d[e],e,a))return!1;return!0}function" +
    " Ba(a){return wa.concat.apply(wa,arguments)}function Ca(a,b,c){va(" +
    "null!=a.length);return 2>=arguments.length?wa.slice.call(a,b):wa.s" +
    "lice.call(a,b,c)};function Da(a){var b=[],c=0,d;for(d in a)b[c++]=" +
    "a[d];return b}function Ea(a){var b=arguments.length;if(1==b&&\"arra" +
    "y\"==ea(arguments[0]))return Ea.apply(null,arguments[0]);for(var c=" +
    "{},d=0;d<b;d++)c[arguments[d]]=!0;return c};Ea(\"area base br col c" +
    "ommand embed hr img input keygen link meta param source track wbr\"" +
    ".split(\" \"));function Fa(a,b,c){return Math.min(Math.max(a,b),c)};" +
    "function Ga(a,b){this.x=l(a)?a:0;this.y=l(b)?b:0}h=Ga.prototype;h." +
    "clone=function(){return new Ga(this.x,this.y)};h.toString=function" +
    "(){return\"(\"+this.x+\", \"+this.y+\")\"};h.ceil=function(){this.x=Math" +
    ".ceil(this.x);this.y=Math.ceil(this.y);return this};h.floor=functi" +
    "on(){this.x=Math.floor(this.x);this.y=Math.floor(this.y);return th" +
    "is};h.round=function(){this.x=Math.round(this.x);this.y=Math.round" +
    "(this.y);return this};h.scale=function(a,b){var c=fa(b)?b:a;this.x" +
    "*=a;this.y*=c;return this};function Ha(a,b){this.width=a;this.heig" +
    "ht=b}h=Ha.prototype;h.clone=function(){return new Ha(this.width,th" +
    "is.height)};h.toString=function(){return\"(\"+this.width+\" x \"+this." +
    "height+\")\"};h.ceil=function(){this.width=Math.ceil(this.width);thi" +
    "s.height=Math.ceil(this.height);return this};h.floor=function(){th" +
    "is.width=Math.floor(this.width);this.height=Math.floor(this.height" +
    ");return this};h.round=function(){this.width=Math.round(this.width" +
    ");this.height=Math.round(this.height);return this};\nh.scale=functi" +
    "on(a,b){var c=fa(b)?b:a;this.width*=a;this.height*=c;return this};" +
    "var Ia;a:{var Ja=ca.navigator;if(Ja){var Ka=Ja.userAgent;if(Ka){Ia" +
    "=Ka;break a}}Ia=\"\"};var La=-1!=Ia.indexOf(\"Macintosh\"),Ma=-1!=Ia.i" +
    "ndexOf(\"Windows\"),Na=\"\",Oa=/WebKit\\/(\\S+)/.exec(Ia);Oa&&(Na=Oa?Oa[" +
    "1]:\"\");var Pa=Na,Qa={};function Ra(a){for(;a&&1!=a.nodeType;)a=a.p" +
    "reviousSibling;return a}function Sa(a,b){if(a.contains&&1==b.nodeT" +
    "ype)return a==b||a.contains(b);if(\"undefined\"!=typeof a.compareDoc" +
    "umentPosition)return a==b||Boolean(a.compareDocumentPosition(b)&16" +
    ");for(;b&&a!=b;)b=b.parentNode;return b==a}\nfunction Ta(a,b){if(a=" +
    "=b)return 0;if(a.compareDocumentPosition)return a.compareDocumentP" +
    "osition(b)&2?1:-1;if(\"sourceIndex\"in a||a.parentNode&&\"sourceIndex" +
    "\"in a.parentNode){var c=1==a.nodeType,d=1==b.nodeType;if(c&&d)retu" +
    "rn a.sourceIndex-b.sourceIndex;var e=a.parentNode,f=b.parentNode;r" +
    "eturn e==f?Ua(a,b):!c&&Sa(e,b)?-1*Va(a,b):!d&&Sa(f,a)?Va(b,a):(c?a" +
    ".sourceIndex:e.sourceIndex)-(d?b.sourceIndex:f.sourceIndex)}d=u(a)" +
    ";c=d.createRange();c.selectNode(a);c.collapse(!0);d=d.createRange(" +
    ");d.selectNode(b);\nd.collapse(!0);return c.compareBoundaryPoints(c" +
    "a.Range.START_TO_END,d)}function Va(a,b){var c=a.parentNode;if(c==" +
    "b)return-1;for(var d=b;d.parentNode!=c;)d=d.parentNode;return Ua(d" +
    ",a)}function Ua(a,b){for(var c=b;c=c.previousSibling;)if(c==a)retu" +
    "rn-1;return 1}function u(a){va(a,\"Node cannot be null or undefined" +
    ".\");return 9==a.nodeType?a:a.ownerDocument||a.document}function Wa" +
    "(a,b,c){c||(a=a.parentNode);for(c=0;a;){va(\"parentNode\"!=a.name);i" +
    "f(b(a))return a;a=a.parentNode;c++}return null}\nfunction Xa(a){try" +
    "{return a&&a.activeElement}catch(b){}return null}function Ya(a){th" +
    "is.a=a||ca.document||document}Ya.prototype.contains=Sa;function Za" +
    "(a,b,c,d){this.top=a;this.right=b;this.bottom=c;this.left=d}h=Za.p" +
    "rototype;h.clone=function(){return new Za(this.top,this.right,this" +
    ".bottom,this.left)};h.toString=function(){return\"(\"+this.top+\"t, \"" +
    "+this.right+\"r, \"+this.bottom+\"b, \"+this.left+\"l)\"};h.contains=fun" +
    "ction(a){return this&&a?a instanceof Za?a.left>=this.left&&a.right" +
    "<=this.right&&a.top>=this.top&&a.bottom<=this.bottom:a.x>=this.lef" +
    "t&&a.x<=this.right&&a.y>=this.top&&a.y<=this.bottom:!1};\nh.ceil=fu" +
    "nction(){this.top=Math.ceil(this.top);this.right=Math.ceil(this.ri" +
    "ght);this.bottom=Math.ceil(this.bottom);this.left=Math.ceil(this.l" +
    "eft);return this};h.floor=function(){this.top=Math.floor(this.top)" +
    ";this.right=Math.floor(this.right);this.bottom=Math.floor(this.bot" +
    "tom);this.left=Math.floor(this.left);return this};h.round=function" +
    "(){this.top=Math.round(this.top);this.right=Math.round(this.right)" +
    ";this.bottom=Math.round(this.bottom);this.left=Math.round(this.lef" +
    "t);return this};\nh.scale=function(a,b){var c=fa(b)?b:a;this.left*=" +
    "a;this.right*=a;this.top*=c;this.bottom*=c;return this};function v" +
    "(a,b,c,d){this.left=a;this.top=b;this.width=c;this.height=d}h=v.pr" +
    "ototype;h.clone=function(){return new v(this.left,this.top,this.wi" +
    "dth,this.height)};h.toString=function(){return\"(\"+this.left+\", \"+t" +
    "his.top+\" - \"+this.width+\"w x \"+this.height+\"h)\"};h.contains=funct" +
    "ion(a){return a instanceof v?this.left<=a.left&&this.left+this.wid" +
    "th>=a.left+a.width&&this.top<=a.top&&this.top+this.height>=a.top+a" +
    ".height:a.x>=this.left&&a.x<=this.left+this.width&&a.y>=this.top&&" +
    "a.y<=this.top+this.height};\nh.ceil=function(){this.left=Math.ceil(" +
    "this.left);this.top=Math.ceil(this.top);this.width=Math.ceil(this." +
    "width);this.height=Math.ceil(this.height);return this};h.floor=fun" +
    "ction(){this.left=Math.floor(this.left);this.top=Math.floor(this.t" +
    "op);this.width=Math.floor(this.width);this.height=Math.floor(this." +
    "height);return this};h.round=function(){this.left=Math.round(this." +
    "left);this.top=Math.round(this.top);this.width=Math.round(this.wid" +
    "th);this.height=Math.round(this.height);return this};\nh.scale=func" +
    "tion(a,b){var c=fa(b)?b:a;this.left*=a;this.width*=a;this.top*=c;t" +
    "his.height*=c;return this};function $a(a,b){var c=u(a);return c.de" +
    "faultView&&c.defaultView.getComputedStyle&&(c=c.defaultView.getCom" +
    "putedStyle(a,null))?c[b]||c.getPropertyValue(b)||\"\":\"\"};/*xxx_rpl_" +
    "lic*/\nvar ab=window;/*xxx_rpl_lic*/\nfunction w(a,b){this.code=a;th" +
    "is.a=bb[a]||\"unknown error\";this.message=b||\"\";var c=this.a.replac" +
    "e(/((?:^|\\s+)[a-z])/g,function(a){return a.toUpperCase().replace(/" +
    "^[\\s\\xa0]+/g,\"\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+" +
    "=\"Error\";this.name=c;c=Error(this.message);c.name=this.name;this.s" +
    "tack=c.stack||\"\"}n(w,Error);\nvar bb={15:\"element not selectable\",1" +
    "1:\"element not visible\",31:\"ime engine activation failed\",30:\"ime " +
    "not available\",24:\"invalid cookie domain\",29:\"invalid element coor" +
    "dinates\",12:\"invalid element state\",32:\"invalid selector\",51:\"inva" +
    "lid selector\",52:\"invalid selector\",17:\"javascript error\",405:\"uns" +
    "upported operation\",34:\"move target out of bounds\",27:\"no such ale" +
    "rt\",7:\"no such element\",8:\"no such frame\",23:\"no such window\",28:\"" +
    "script timeout\",33:\"session not created\",10:\"stale element referen" +
    "ce\",\n0:\"success\",21:\"timeout\",25:\"unable to set cookie\",26:\"unexpe" +
    "cted alert open\",13:\"unknown error\",9:\"unknown command\"};w.prototy" +
    "pe.toString=function(){return this.name+\": \"+this.message};/*xxx_r" +
    "pl_lic*/\nfunction cb(a){return(a=a.exec(Ia))?a[1]:\"\"}cb(/Android\\s" +
    "+([0-9.]+)/)||cb(/Version\\/([0-9.]+)/);/*xxx_rpl_lic*/\nvar db=/And" +
    "roid\\s+([0-9\\.]+)/.exec(Ia),eb=db?db[1]:\"0\";ra(eb,2.3);ra(eb,4);/*" +
    "xxx_rpl_lic*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Lab" +
    "s, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby gra" +
    "nted, free of charge, to any person obtaining a copy\n of this soft" +
    "ware and associated documentation files (the \"Software\"), to\n deal" +
    " in the Software without restriction, including without limitation" +
    " the\n rights to use, copy, modify, merge, publish, distribute, sub" +
    "license, and/or\n sell copies of the Software, and to permit person" +
    "s to whom the Software is\n furnished to do so, subject to the foll" +
    "owing conditions:\n\n The above copyright notice and this permission" +
    " notice shall be included in\n all copies or substantial portions o" +
    "f the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRAN" +
    "TY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO " +
    "THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPO" +
    "SE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGH" +
    "T HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WH" +
    "ETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, " +
    "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEAL" +
    "INGS\n IN THE SOFTWARE.\n*/\nfunction fb(a,b,c){this.a=a;this.b=b||1;" +
    "this.f=c||1};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs" +
    ", Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby gran" +
    "ted, free of charge, to any person obtaining a copy\n of this softw" +
    "are and associated documentation files (the \"Software\"), to\n deal " +
    "in the Software without restriction, including without limitation " +
    "the\n rights to use, copy, modify, merge, publish, distribute, subl" +
    "icense, and/or\n sell copies of the Software, and to permit persons" +
    " to whom the Software is\n furnished to do so, subject to the follo" +
    "wing conditions:\n\n The above copyright notice and this permission " +
    "notice shall be included in\n all copies or substantial portions of" +
    " the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANT" +
    "Y OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO T" +
    "HE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOS" +
    "E AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT" +
    " HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHE" +
    "THER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, O" +
    "UT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALI" +
    "NGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007" +
    " Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is" +
    " hereby granted, free of charge, to any person obtaining a copy\n o" +
    "f this software and associated documentation files (the \"Software\"" +
    "), to\n deal in the Software without restriction, including without" +
    " limitation the\n rights to use, copy, modify, merge, publish, dist" +
    "ribute, sublicense, and/or\n sell copies of the Software, and to pe" +
    "rmit persons to whom the Software is\n furnished to do so, subject " +
    "to the following conditions:\n\n The above copyright notice and this" +
    " permission notice shall be included in\n all copies or substantial" +
    " portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WIT" +
    "HOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT " +
    "LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTI" +
    "CULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS " +
    "OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LI" +
    "ABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARIS" +
    "ING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR" +
    " OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyri" +
    "ght (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n P" +
    "ermission is hereby granted, free of charge, to any person obtaini" +
    "ng a copy\n of this software and associated documentation files (th" +
    "e \"Software\"), to\n deal in the Software without restriction, inclu" +
    "ding without limitation the\n rights to use, copy, modify, merge, p" +
    "ublish, distribute, sublicense, and/or\n sell copies of the Softwar" +
    "e, and to permit persons to whom the Software is\n furnished to do " +
    "so, subject to the following conditions:\n\n The above copyright not" +
    "ice and this permission notice shall be included in\n all copies or" +
    " substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED " +
    "\"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUD" +
    "ING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS" +
    " FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL T" +
    "HE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES " +
    "OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTH" +
    "ERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE O" +
    "R THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction gb(a){th" +
    "is.b=a;this.a=0}function hb(a){a=a.match(ib);for(var b=0;b<a.lengt" +
    "h;b++)jb.test(a[b])&&a.splice(b,1);return new gb(a)}var ib=RegExp(" +
    "\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\.\\\\.|::|\\\\d" +
    "+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\",\"g\"),jb=/^" +
    "\\s/;function y(a,b){return a.b[a.a+(b||0)]}function z(a){return a." +
    "b[a.a++]}function kb(a){return a.b.length<=a.a};/*\n\n The MIT Licen" +
    "se\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Goog" +
    "le Inc.\n\n Permission is hereby granted, free of charge, to any per" +
    "son obtaining a copy\n of this software and associated documentatio" +
    "n files (the \"Software\"), to\n deal in the Software without restric" +
    "tion, including without limitation the\n rights to use, copy, modif" +
    "y, merge, publish, distribute, sublicense, and/or\n sell copies of " +
    "the Software, and to permit persons to whom the Software is\n furni" +
    "shed to do so, subject to the following conditions:\n\n The above co" +
    "pyright notice and this permission notice shall be included in\n al" +
    "l copies or substantial portions of the Software.\n\n THE SOFTWARE I" +
    "S PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPL" +
    "IED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILIT" +
    "Y,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EV" +
    "ENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAI" +
    "M, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, " +
    "TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE" +
    " SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfuncti" +
    "on A(a){var b=null,c=a.nodeType;1==c&&(b=a.textContent,b=void 0==b" +
    "||null==b?a.innerText:b,b=void 0==b||null==b?\"\":b);if(\"string\"!=ty" +
    "peof b)if(9==c||1==c){a=9==c?a.documentElement:a.firstChild;for(va" +
    "r c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a.nodeValue),d[c++]=a;wh" +
    "ile(a=a.firstChild);for(;c&&!(a=d[--c].nextSibling););}}else b=a.n" +
    "odeValue;return\"\"+b}\nfunction lb(a,b,c){if(null===b)return!0;try{i" +
    "f(!a.getAttribute)return!1}catch(d){return!1}return null==c?!!a.ge" +
    "tAttribute(b):a.getAttribute(b,2)==c}function mb(a,b,c,d,e){return" +
    " nb.call(null,a,b,m(c)?c:null,m(d)?d:null,e||new B)}\nfunction nb(a" +
    ",b,c,d,e){b.getElementsByName&&d&&\"name\"==c?(b=b.getElementsByName" +
    "(d),q(b,function(b){a.a(b)&&C(e,b)})):b.getElementsByClassName&&d&" +
    "&\"class\"==c?(b=b.getElementsByClassName(d),q(b,function(b){b.class" +
    "Name==d&&a.a(b)&&C(e,b)})):a instanceof D?ob(a,b,c,d,e):b.getEleme" +
    "ntsByTagName&&(b=b.getElementsByTagName(a.f()),q(b,function(a){lb(" +
    "a,c,d)&&C(e,a)}));return e}function pb(a,b,c,d,e){for(b=b.firstChi" +
    "ld;b;b=b.nextSibling)lb(b,c,d)&&a.a(b)&&C(e,b);return e}\nfunction " +
    "ob(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)lb(b,c,d)&&a.a(" +
    "b)&&C(e,b),ob(a,b,c,d,e)};/*\n\n The MIT License\n\n Copyright (c) 200" +
    "7 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission i" +
    "s hereby granted, free of charge, to any person obtaining a copy\n " +
    "of this software and associated documentation files (the \"Software" +
    "\"), to\n deal in the Software without restriction, including withou" +
    "t limitation the\n rights to use, copy, modify, merge, publish, dis" +
    "tribute, sublicense, and/or\n sell copies of the Software, and to p" +
    "ermit persons to whom the Software is\n furnished to do so, subject" +
    " to the following conditions:\n\n The above copyright notice and thi" +
    "s permission notice shall be included in\n all copies or substantia" +
    "l portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WI" +
    "THOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT" +
    " LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PART" +
    "ICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS" +
    " OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n L" +
    "IABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARI" +
    "SING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE O" +
    "R OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction B(){this.b=this.a=n" +
    "ull;this.o=0}function qb(a){this.node=a;this.a=this.b=null}functio" +
    "n rb(a,b){if(!a.a)return b;if(!b.a)return a;for(var c=a.a,d=b.a,e=" +
    "null,f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):0<Ta(c.node" +
    ",d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=f,g++;for(f" +
    "=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.o=g;return a}function sb(" +
    "a,b){var c=new qb(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=c;a.o++}fun" +
    "ction C(a,b){var c=new qb(b);c.b=a.b;a.a?a.b.a=c:a.a=a.b=c;a.b=c;a" +
    ".o++}\nfunction tb(a){return(a=a.a)?a.node:null}function ub(a){retu" +
    "rn(a=tb(a))?A(a):\"\"}function vb(a,b){return new wb(a,!!b)}function" +
    " wb(a,b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=null}function F" +
    "(a){var b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c?b.b:b.a;r" +
    "eturn c.node};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Lab" +
    "s, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby gra" +
    "nted, free of charge, to any person obtaining a copy\n of this soft" +
    "ware and associated documentation files (the \"Software\"), to\n deal" +
    " in the Software without restriction, including without limitation" +
    " the\n rights to use, copy, modify, merge, publish, distribute, sub" +
    "license, and/or\n sell copies of the Software, and to permit person" +
    "s to whom the Software is\n furnished to do so, subject to the foll" +
    "owing conditions:\n\n The above copyright notice and this permission" +
    " notice shall be included in\n all copies or substantial portions o" +
    "f the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRAN" +
    "TY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO " +
    "THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPO" +
    "SE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGH" +
    "T HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WH" +
    "ETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, " +
    "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEAL" +
    "INGS\n IN THE SOFTWARE.\n*/\nfunction xb(a){switch(a.nodeType){case 1" +
    ":return ma(yb,a);case 9:return xb(a.documentElement);case 11:case " +
    "10:case 6:case 12:return zb;default:return a.parentNode?xb(a.paren" +
    "tNode):zb}}function zb(){return null}function yb(a,b){if(a.prefix=" +
    "=b)return a.namespaceURI||\"http://www.w3.org/1999/xhtml\";var c=a.g" +
    "etAttributeNode(\"xmlns:\"+b);return c&&c.specified?c.value||null:a." +
    "parentNode&&9!=a.parentNode.nodeType?yb(a.parentNode,b):null};/*\n\n" +
    " The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright" +
    " (c) 2012 Google Inc.\n\n Permission is hereby granted, free of char" +
    "ge, to any person obtaining a copy\n of this software and associate" +
    "d documentation files (the \"Software\"), to\n deal in the Software w" +
    "ithout restriction, including without limitation the\n rights to us" +
    "e, copy, modify, merge, publish, distribute, sublicense, and/or\n s" +
    "ell copies of the Software, and to permit persons to whom the Soft" +
    "ware is\n furnished to do so, subject to the following conditions:\n" +
    "\n The above copyright notice and this permission notice shall be i" +
    "ncluded in\n all copies or substantial portions of the Software.\n\n " +
    "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EX" +
    "PRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF " +
    "MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGE" +
    "MENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABL" +
    "E FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION" +
    " OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNE" +
    "CTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTW" +
    "ARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc" +
    ".\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted, " +
    "free of charge, to any person obtaining a copy\n of this software a" +
    "nd associated documentation files (the \"Software\"), to\n deal in th" +
    "e Software without restriction, including without limitation the\n " +
    "rights to use, copy, modify, merge, publish, distribute, sublicens" +
    "e, and/or\n sell copies of the Software, and to permit persons to w" +
    "hom the Software is\n furnished to do so, subject to the following " +
    "conditions:\n\n The above copyright notice and this permission notic" +
    "e shall be included in\n all copies or substantial portions of the " +
    "Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF " +
    "ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WA" +
    "RRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND" +
    " NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLD" +
    "ERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER " +
    "IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF" +
    " OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n " +
    "IN THE SOFTWARE.\n*/\nfunction H(a){this.l=a;this.b=this.j=!1;this.f" +
    "=null}function I(a){return\"\\n  \"+a.toString().split(\"\\n\").join(\"\\n" +
    "  \")}function Ab(a,b){a.j=b}function Bb(a,b){a.b=b}function J(a,b)" +
    "{var c=a.a(b);return c instanceof B?+ub(c):+c}function K(a,b){var " +
    "c=a.a(b);return c instanceof B?ub(c):\"\"+c}function Cb(a,b){var c=a" +
    ".a(b);return c instanceof B?!!c.o:!!c};/*\n\n The MIT License\n\n Copy" +
    "right (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n" +
    " Permission is hereby granted, free of charge, to any person obtai" +
    "ning a copy\n of this software and associated documentation files (" +
    "the \"Software\"), to\n deal in the Software without restriction, inc" +
    "luding without limitation the\n rights to use, copy, modify, merge," +
    " publish, distribute, sublicense, and/or\n sell copies of the Softw" +
    "are, and to permit persons to whom the Software is\n furnished to d" +
    "o so, subject to the following conditions:\n\n The above copyright n" +
    "otice and this permission notice shall be included in\n all copies " +
    "or substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDE" +
    "D \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCL" +
    "UDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNE" +
    "SS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL" +
    " THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGE" +
    "S OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR O" +
    "THERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE" +
    " OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Db(a,b" +
    ",c){H.call(this,a.l);this.c=a;this.i=b;this.u=c;this.j=b.j||c.j;th" +
    "is.b=b.b||c.b;this.c==Eb&&(c.b||c.j||4==c.l||0==c.l||!b.f?b.b||b.j" +
    "||4==b.l||0==b.l||!c.f||(this.f={name:c.f.name,w:b}):this.f={name:" +
    "b.f.name,w:c})}n(Db,H);\nfunction Fb(a,b,c,d,e){b=b.a(d);c=c.a(d);v" +
    "ar f;if(b instanceof B&&c instanceof B){e=vb(b);for(d=F(e);d;d=F(e" +
    "))for(b=vb(c),f=F(b);f;f=F(b))if(a(A(d),A(f)))return!0;return!1}if" +
    "(b instanceof B||c instanceof B){b instanceof B?e=b:(e=c,c=b);e=vb" +
    "(e);b=typeof c;for(d=F(e);d;d=F(e)){switch(b){case \"number\":d=+A(d" +
    ");break;case \"boolean\":d=!!A(d);break;case \"string\":d=A(d);break;d" +
    "efault:throw Error(\"Illegal primitive type for comparison.\");}if(a" +
    "(d,c))return!0}return!1}return e?\"boolean\"==typeof b||\"boolean\"==\n" +
    "typeof c?a(!!b,!!c):\"number\"==typeof b||\"number\"==typeof c?a(+b,+c" +
    "):a(b,c):a(+b,+c)}Db.prototype.a=function(a){return this.c.s(this." +
    "i,this.u,a)};Db.prototype.toString=function(){var a=\"Binary Expres" +
    "sion: \"+this.c,a=a+I(this.i);return a+=I(this.u)};function Gb(a,b,"
  )
      .append(
    "c,d){this.a=a;this.I=b;this.l=c;this.s=d}Gb.prototype.toString=aa(" +
    "\"a\");var Hb={};function L(a,b,c,d){if(Hb.hasOwnProperty(a))throw E" +
    "rror(\"Binary operator already created: \"+a);a=new Gb(a,b,c,d);retu" +
    "rn Hb[a.toString()]=a}\nL(\"div\",6,1,function(a,b,c){return J(a,c)/J" +
    "(b,c)});L(\"mod\",6,1,function(a,b,c){return J(a,c)%J(b,c)});L(\"*\",6" +
    ",1,function(a,b,c){return J(a,c)*J(b,c)});L(\"+\",5,1,function(a,b,c" +
    "){return J(a,c)+J(b,c)});L(\"-\",5,1,function(a,b,c){return J(a,c)-J" +
    "(b,c)});L(\"<\",4,2,function(a,b,c){return Fb(function(a,b){return a" +
    "<b},a,b,c)});L(\">\",4,2,function(a,b,c){return Fb(function(a,b){ret" +
    "urn a>b},a,b,c)});L(\"<=\",4,2,function(a,b,c){return Fb(function(a," +
    "b){return a<=b},a,b,c)});\nL(\">=\",4,2,function(a,b,c){return Fb(fun" +
    "ction(a,b){return a>=b},a,b,c)});var Eb=L(\"=\",3,2,function(a,b,c){" +
    "return Fb(function(a,b){return a==b},a,b,c,!0)});L(\"!=\",3,2,functi" +
    "on(a,b,c){return Fb(function(a,b){return a!=b},a,b,c,!0)});L(\"and\"" +
    ",2,2,function(a,b,c){return Cb(a,c)&&Cb(b,c)});L(\"or\",1,2,function" +
    "(a,b,c){return Cb(a,c)||Cb(b,c)});/*\n\n The MIT License\n\n Copyright" +
    " (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Perm" +
    "ission is hereby granted, free of charge, to any person obtaining " +
    "a copy\n of this software and associated documentation files (the \"" +
    "Software\"), to\n deal in the Software without restriction, includin" +
    "g without limitation the\n rights to use, copy, modify, merge, publ" +
    "ish, distribute, sublicense, and/or\n sell copies of the Software, " +
    "and to permit persons to whom the Software is\n furnished to do so," +
    " subject to the following conditions:\n\n The above copyright notice" +
    " and this permission notice shall be included in\n all copies or su" +
    "bstantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS" +
    " IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING" +
    " BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FO" +
    "R A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
    " AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR " +
    "OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERW" +
    "ISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR T" +
    "HE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Ib(a,b){if(" +
    "b.a.length&&4!=a.l)throw Error(\"Primary expression must evaluate t" +
    "o nodeset if filter has predicate(s).\");H.call(this,a.l);this.c=a;" +
    "this.i=b;this.j=a.j;this.b=a.b}n(Ib,H);Ib.prototype.a=function(a){" +
    "a=this.c.a(a);return Jb(this.i,a)};Ib.prototype.toString=function(" +
    "){var a;a=\"Filter:\"+I(this.c);return a+=I(this.i)};/*\n\n The MIT Li" +
    "cense\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 G" +
    "oogle Inc.\n\n Permission is hereby granted, free of charge, to any " +
    "person obtaining a copy\n of this software and associated documenta" +
    "tion files (the \"Software\"), to\n deal in the Software without rest" +
    "riction, including without limitation the\n rights to use, copy, mo" +
    "dify, merge, publish, distribute, sublicense, and/or\n sell copies " +
    "of the Software, and to permit persons to whom the Software is\n fu" +
    "rnished to do so, subject to the following conditions:\n\n The above" +
    " copyright notice and this permission notice shall be included in\n" +
    " all copies or substantial portions of the Software.\n\n THE SOFTWAR" +
    "E IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n I" +
    "MPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABI" +
    "LITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO" +
    " EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY C" +
    "LAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRAC" +
    "T, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH " +
    "THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfun" +
    "ction Kb(a,b){if(b.length<a.K)throw Error(\"Function \"+a.m+\" expect" +
    "s at least\"+a.K+\" arguments, \"+b.length+\" given\");if(null!==a.C&&b" +
    ".length>a.C)throw Error(\"Function \"+a.m+\" expects at most \"+a.C+\" " +
    "arguments, \"+b.length+\" given\");a.L&&q(b,function(b,d){if(4!=b.l)t" +
    "hrow Error(\"Argument \"+d+\" to function \"+a.m+\" is not of type Node" +
    "set: \"+b);});H.call(this,a.l);this.i=a;this.c=b;Ab(this,a.j||za(b," +
    "function(a){return a.j}));Bb(this,a.O&&!b.length||a.N&&!!b.length|" +
    "|za(b,function(a){return a.b}))}\nn(Kb,H);Kb.prototype.a=function(a" +
    "){return this.i.s.apply(null,Ba(a,this.c))};Kb.prototype.toString=" +
    "function(){var a=\"Function: \"+this.i;if(this.c.length)var b=ya(thi" +
    "s.c,function(a,b){return a+I(b)},\"Arguments:\"),a=a+I(b);return a};" +
    "function Lb(a,b,c,d,e,f,g,k,p){this.m=a;this.l=b;this.j=c;this.O=d" +
    ";this.N=e;this.s=f;this.K=g;this.C=l(k)?k:g;this.L=!!p}Lb.prototyp" +
    "e.toString=aa(\"m\");var Mb={};\nfunction M(a,b,c,d,e,f,g,k){if(Mb.ha" +
    "sOwnProperty(a))throw Error(\"Function already created: \"+a+\".\");Mb" +
    "[a]=new Lb(a,b,c,d,!1,e,f,g,k)}M(\"boolean\",2,!1,!1,function(a,b){r" +
    "eturn Cb(b,a)},1);M(\"ceiling\",1,!1,!1,function(a,b){return Math.ce" +
    "il(J(b,a))},1);M(\"concat\",3,!1,!1,function(a,b){var c=Ca(arguments" +
    ",1);return ya(c,function(b,c){return b+K(c,a)},\"\")},2,null);M(\"con" +
    "tains\",2,!1,!1,function(a,b,c){b=K(b,a);a=K(c,a);return-1!=b.index" +
    "Of(a)},2);M(\"count\",1,!1,!1,function(a,b){return b.a(a).o},1,1,!0)" +
    ";\nM(\"false\",2,!1,!1,ba(!1),0);M(\"floor\",1,!1,!1,function(a,b){retu" +
    "rn Math.floor(J(b,a))},1);M(\"id\",4,!1,!1,function(a,b){var c=a.a,d" +
    "=9==c.nodeType?c:c.ownerDocument,c=K(b,a).split(/\\s+/),e=[];q(c,fu" +
    "nction(a){a=d.getElementById(a);!a||0<=xa(e,a)||e.push(a)});e.sort" +
    "(Ta);var f=new B;q(e,function(a){C(f,a)});return f},1);M(\"lang\",2," +
    "!1,!1,ba(!1),1);M(\"last\",1,!0,!1,function(a){if(1!=arguments.lengt" +
    "h)throw Error(\"Function last expects ()\");return a.f},0);\nM(\"local" +
    "-name\",3,!1,!0,function(a,b){var c=b?tb(b.a(a)):a.a;return c?c.loc" +
    "alName||c.nodeName.toLowerCase():\"\"},0,1,!0);M(\"name\",3,!1,!0,func" +
    "tion(a,b){var c=b?tb(b.a(a)):a.a;return c?c.nodeName.toLowerCase()" +
    ":\"\"},0,1,!0);M(\"namespace-uri\",3,!0,!1,ba(\"\"),0,1,!0);M(\"normalize" +
    "-space\",3,!1,!0,function(a,b){return(b?K(b,a):A(a.a)).replace(/[\\s" +
    "\\xa0]+/g,\" \").replace(/^\\s+|\\s+$/g,\"\")},0,1);M(\"not\",2,!1,!1,funct" +
    "ion(a,b){return!Cb(b,a)},1);M(\"number\",1,!1,!0,function(a,b){retur" +
    "n b?J(b,a):+A(a.a)},0,1);\nM(\"position\",1,!0,!1,function(a){return " +
    "a.b},0);M(\"round\",1,!1,!1,function(a,b){return Math.round(J(b,a))}" +
    ",1);M(\"starts-with\",2,!1,!1,function(a,b,c){b=K(b,a);a=K(c,a);retu" +
    "rn 0==b.lastIndexOf(a,0)},2);M(\"string\",3,!1,!0,function(a,b){retu" +
    "rn b?K(b,a):A(a.a)},0,1);M(\"string-length\",1,!1,!0,function(a,b){r" +
    "eturn(b?K(b,a):A(a.a)).length},0,1);\nM(\"substring\",3,!1,!1,functio" +
    "n(a,b,c,d){c=J(c,a);if(isNaN(c)||Infinity==c||-Infinity==c)return\"" +
    "\";d=d?J(d,a):Infinity;if(isNaN(d)||-Infinity===d)return\"\";c=Math.r" +
    "ound(c)-1;var e=Math.max(c,0);a=K(b,a);if(Infinity==d)return a.sub" +
    "string(e);b=Math.round(d);return a.substring(e,c+b)},2,3);M(\"subst" +
    "ring-after\",3,!1,!1,function(a,b,c){b=K(b,a);a=K(c,a);c=b.indexOf(" +
    "a);return-1==c?\"\":b.substring(c+a.length)},2);\nM(\"substring-before" +
    "\",3,!1,!1,function(a,b,c){b=K(b,a);a=K(c,a);a=b.indexOf(a);return-" +
    "1==a?\"\":b.substring(0,a)},2);M(\"sum\",1,!1,!1,function(a,b){for(var" +
    " c=vb(b.a(a)),d=0,e=F(c);e;e=F(c))d+=+A(e);return d},1,1,!0);M(\"tr" +
    "anslate\",3,!1,!1,function(a,b,c,d){b=K(b,a);c=K(c,a);var e=K(d,a);" +
    "a=[];for(d=0;d<c.length;d++){var f=c.charAt(d);f in a||(a[f]=e.cha" +
    "rAt(d))}c=\"\";for(d=0;d<b.length;d++)f=b.charAt(d),c+=f in a?a[f]:f" +
    ";return c},3);M(\"true\",2,!1,!1,ba(!0),0);/*\n\n The MIT License\n\n Co" +
    "pyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc." +
    "\n\n Permission is hereby granted, free of charge, to any person obt" +
    "aining a copy\n of this software and associated documentation files" +
    " (the \"Software\"), to\n deal in the Software without restriction, i" +
    "ncluding without limitation the\n rights to use, copy, modify, merg" +
    "e, publish, distribute, sublicense, and/or\n sell copies of the Sof" +
    "tware, and to permit persons to whom the Software is\n furnished to" +
    " do so, subject to the following conditions:\n\n The above copyright" +
    " notice and this permission notice shall be included in\n all copie" +
    "s or substantial portions of the Software.\n\n THE SOFTWARE IS PROVI" +
    "DED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, IN" +
    "CLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FIT" +
    "NESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHA" +
    "LL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMA" +
    "GES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR" +
    " OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWA" +
    "RE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT " +
    "License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012" +
    " Google Inc.\n\n Permission is hereby granted, free of charge, to an" +
    "y person obtaining a copy\n of this software and associated documen" +
    "tation files (the \"Software\"), to\n deal in the Software without re" +
    "striction, including without limitation the\n rights to use, copy, " +
    "modify, merge, publish, distribute, sublicense, and/or\n sell copie" +
    "s of the Software, and to permit persons to whom the Software is\n " +
    "furnished to do so, subject to the following conditions:\n\n The abo" +
    "ve copyright notice and this permission notice shall be included i" +
    "n\n all copies or substantial portions of the Software.\n\n THE SOFTW" +
    "ARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
    " IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTA" +
    "BILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN " +
    "NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY" +
    " CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTR" +
    "ACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WIT" +
    "H THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nf" +
    "unction D(a,b){this.i=a;this.c=l(b)?b:null;this.b=null;switch(a){c" +
    "ase \"comment\":this.b=8;break;case \"text\":this.b=3;break;case \"proc" +
    "essing-instruction\":this.b=7;break;case \"node\":break;default:throw" +
    " Error(\"Unexpected argument\");}}function Nb(a){return\"comment\"==a|" +
    "|\"text\"==a||\"processing-instruction\"==a||\"node\"==a}D.prototype.a=f" +
    "unction(a){return null===this.b||this.b==a.nodeType};D.prototype.f" +
    "=aa(\"i\");D.prototype.toString=function(){var a=\"Kind Test: \"+this." +
    "i;null===this.c||(a+=I(this.c));return a};/*\n\n The MIT License\n\n C" +
    "opyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc" +
    ".\n\n Permission is hereby granted, free of charge, to any person ob" +
    "taining a copy\n of this software and associated documentation file" +
    "s (the \"Software\"), to\n deal in the Software without restriction, " +
    "including without limitation the\n rights to use, copy, modify, mer" +
    "ge, publish, distribute, sublicense, and/or\n sell copies of the So" +
    "ftware, and to permit persons to whom the Software is\n furnished t" +
    "o do so, subject to the following conditions:\n\n The above copyrigh" +
    "t notice and this permission notice shall be included in\n all copi" +
    "es or substantial portions of the Software.\n\n THE SOFTWARE IS PROV" +
    "IDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, I" +
    "NCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FI" +
    "TNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SH" +
    "ALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAM" +
    "AGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT O" +
    "R OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTW" +
    "ARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Ob(" +
    "a){H.call(this,3);this.c=a.substring(1,a.length-1)}n(Ob,H);Ob.prot" +
    "otype.a=aa(\"c\");Ob.prototype.toString=function(){return\"Literal: \"" +
    "+this.c};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, In" +
    "c.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted," +
    " free of charge, to any person obtaining a copy\n of this software " +
    "and associated documentation files (the \"Software\"), to\n deal in t" +
    "he Software without restriction, including without limitation the\n" +
    " rights to use, copy, modify, merge, publish, distribute, sublicen" +
    "se, and/or\n sell copies of the Software, and to permit persons to " +
    "whom the Software is\n furnished to do so, subject to the following" +
    " conditions:\n\n The above copyright notice and this permission noti" +
    "ce shall be included in\n all copies or substantial portions of the" +
    " Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF" +
    " ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE W" +
    "ARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AN" +
    "D NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOL" +
    "DERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER" +
    " IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT O" +
    "F OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n" +
    " IN THE SOFTWARE.\n*/\nfunction Pb(a,b){this.m=a.toLowerCase();this." +
    "b=b?b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}Pb.prototype.a=" +
    "function(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=this.m&&thi" +
    "s.m!=a.nodeName.toLowerCase()?!1:this.b==(a.namespaceURI?a.namespa" +
    "ceURI.toLowerCase():\"http://www.w3.org/1999/xhtml\")};Pb.prototype." +
    "f=aa(\"m\");Pb.prototype.toString=function(){return\"Name Test: \"+(\"h" +
    "ttp://www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+this.m};/*\n\n T" +
    "he MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (" +
    "c) 2012 Google Inc.\n\n Permission is hereby granted, free of charge" +
    ", to any person obtaining a copy\n of this software and associated " +
    "documentation files (the \"Software\"), to\n deal in the Software wit" +
    "hout restriction, including without limitation the\n rights to use," +
    " copy, modify, merge, publish, distribute, sublicense, and/or\n sel" +
    "l copies of the Software, and to permit persons to whom the Softwa" +
    "re is\n furnished to do so, subject to the following conditions:\n\n " +
    "The above copyright notice and this permission notice shall be inc" +
    "luded in\n all copies or substantial portions of the Software.\n\n TH" +
    "E SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPR" +
    "ESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF ME" +
    "RCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEME" +
    "NT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE " +
    "FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION O" +
    "F CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECT" +
    "ION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWAR" +
    "E.\n*/\nfunction Qb(a){H.call(this,1);this.c=a}n(Qb,H);Qb.prototype." +
    "a=aa(\"c\");Qb.prototype.toString=function(){return\"Number: \"+this.c" +
    "};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Cop" +
    "yright (c) 2012 Google Inc.\n\n Permission is hereby granted, free o" +
    "f charge, to any person obtaining a copy\n of this software and ass" +
    "ociated documentation files (the \"Software\"), to\n deal in the Soft" +
    "ware without restriction, including without limitation the\n rights" +
    " to use, copy, modify, merge, publish, distribute, sublicense, and" +
    "/or\n sell copies of the Software, and to permit persons to whom th" +
    "e Software is\n furnished to do so, subject to the following condit" +
    "ions:\n\n The above copyright notice and this permission notice shal" +
    "l be included in\n all copies or substantial portions of the Softwa" +
    "re.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KI" +
    "ND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTI" +
    "ES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONIN" +
    "FRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE" +
    " LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN " +
    "ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN" +
    " CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE" +
    " SOFTWARE.\n*/\nfunction Rb(a,b){H.call(this,a.l);this.i=a;this.c=b;" +
    "this.j=a.j;this.b=a.b;if(1==this.c.length){var c=this.c[0];c.B||c." +
    "c!=Sb||(c=c.u,\"*\"!=c.f()&&(this.f={name:c.f(),w:null}))}}n(Rb,H);f" +
    "unction Tb(){H.call(this,4)}n(Tb,H);Tb.prototype.a=function(a){var" +
    " b=new B;a=a.a;9==a.nodeType?C(b,a):C(b,a.ownerDocument);return b}" +
    ";Tb.prototype.toString=ba(\"Root Helper Expression\");function Ub(){" +
    "H.call(this,4)}n(Ub,H);Ub.prototype.a=function(a){var b=new B;C(b," +
    "a.a);return b};Ub.prototype.toString=ba(\"Context Helper Expression" +
    "\");\nfunction Vb(a){return\"/\"==a||\"//\"==a}Rb.prototype.a=function(a" +
    "){var b=this.i.a(a);if(!(b instanceof B))throw Error(\"Filter expre" +
    "ssion must evaluate to nodeset.\");a=this.c;for(var c=0,d=a.length;" +
    "c<d&&b.o;c++){var e=a[c],f=vb(b,e.c.a),g;if(e.j||e.c!=Wb)if(e.j||e" +
    ".c!=Xb)for(g=F(f),b=e.a(new fb(g));null!=(g=F(f));)g=e.a(new fb(g)" +
    "),b=rb(b,g);else g=F(f),b=e.a(new fb(g));else{for(g=F(f);(b=F(f))&" +
    "&(!g.contains||g.contains(b))&&b.compareDocumentPosition(g)&8;g=b)" +
    ";b=e.a(new fb(g))}}return b};\nRb.prototype.toString=function(){var" +
    " a;a=\"Path Expression:\"+I(this.i);if(this.c.length){var b=ya(this." +
    "c,function(a,b){return a+I(b)},\"Steps:\");a+=I(b)}return a};/*\n\n Th" +
    "e MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c" +
    ") 2012 Google Inc.\n\n Permission is hereby granted, free of charge," +
    " to any person obtaining a copy\n of this software and associated d" +
    "ocumentation files (the \"Software\"), to\n deal in the Software with" +
    "out restriction, including without limitation the\n rights to use, " +
    "copy, modify, merge, publish, distribute, sublicense, and/or\n sell" +
    " copies of the Software, and to permit persons to whom the Softwar" +
    "e is\n furnished to do so, subject to the following conditions:\n\n T" +
    "he above copyright notice and this permission notice shall be incl" +
    "uded in\n all copies or substantial portions of the Software.\n\n THE" +
    " SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRE" +
    "SS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MER" +
    "CHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMEN" +
    "T. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE F" +
    "OR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF" +
    " CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTI" +
    "ON WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE" +
    ".\n*/\nfunction Yb(a,b){this.a=a;this.b=!!b}\nfunction Jb(a,b,c){for(" +
    "c=c||0;c<a.a.length;c++)for(var d=a.a[c],e=vb(b),f=b.o,g,k=0;g=F(e" +
    ");k++){var p=a.b?f-k:k+1;g=d.a(new fb(g,p,f));if(\"number\"==typeof " +
    "g)p=p==g;else if(\"string\"==typeof g||\"boolean\"==typeof g)p=!!g;els" +
    "e if(g instanceof B)p=0<g.o;else throw Error(\"Predicate.evaluate r" +
    "eturned an unexpected type.\");if(!p){p=e;g=p.f;var r=p.a;if(!r)thr" +
    "ow Error(\"Next must be called at least once before remove.\");var G" +
    "=r.b,r=r.a;G?G.a=r:g.a=r;r?r.b=G:g.b=G;g.o--;p.a=null}}return b}\nY" +
    "b.prototype.toString=function(){return ya(this.a,function(a,b){ret" +
    "urn a+I(b)},\"Predicates:\")};/*\n\n The MIT License\n\n Copyright (c) 2" +
    "007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission" +
    " is hereby granted, free of charge, to any person obtaining a copy" +
    "\n of this software and associated documentation files (the \"Softwa" +
    "re\"), to\n deal in the Software without restriction, including with" +
    "out limitation the\n rights to use, copy, modify, merge, publish, d" +
    "istribute, sublicense, and/or\n sell copies of the Software, and to" +
    " permit persons to whom the Software is\n furnished to do so, subje" +
    "ct to the following conditions:\n\n The above copyright notice and t" +
    "his permission notice shall be included in\n all copies or substant" +
    "ial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", " +
    "WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT N" +
    "OT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PA" +
    "RTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHO" +
    "RS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
    " LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, A" +
    "RISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE" +
    " OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Zb(a,b,c,d){H.cal" +
    "l(this,4);this.c=a;this.u=b;this.i=c||new Yb([]);this.B=!!d;b=this" +
    ".i;b=0<b.a.length?b.a[0].f:null;a.b&&b&&(this.f={name:b.name,w:b.w" +
    "});a:{a=this.i;for(b=0;b<a.a.length;b++)if(c=a.a[b],c.j||1==c.l||0" +
    "==c.l){a=!0;break a}a=!1}this.j=a}n(Zb,H);\nZb.prototype.a=function" +
    "(a){var b=a.a,c=null,c=this.f,d=null,e=null,f=0;c&&(d=c.name,e=c.w" +
    "?K(c.w,a):null,f=1);if(this.B)if(this.j||this.c!=$b)if(a=vb((new Z" +
    "b(ac,new D(\"node\"))).a(a)),b=F(a))for(c=this.s(b,d,e,f);null!=(b=F" +
    "(a));)c=rb(c,this.s(b,d,e,f));else c=new B;else c=mb(this.u,b,d,e)" +
    ",c=Jb(this.i,c,f);else c=this.s(a.a,d,e,f);return c};Zb.prototype." +
    "s=function(a,b,c,d){a=this.c.f(this.u,a,b,c);return a=Jb(this.i,a," +
    "d)};\nZb.prototype.toString=function(){var a;a=\"Step:\"+I(\"Operator:" +
    " \"+(this.B?\"//\":\"/\"));this.c.m&&(a+=I(\"Axis: \"+this.c));a+=I(this." +
    "u);if(this.i.a.length){var b=ya(this.i.a,function(a,b){return a+I(" +
    "b)},\"Predicates:\");a+=I(b)}return a};function bc(a,b,c,d){this.m=a" +
    ";this.f=b;this.a=c;this.b=d}bc.prototype.toString=aa(\"m\");var cc={" +
    "};function N(a,b,c,d){if(cc.hasOwnProperty(a))throw Error(\"Axis al" +
    "ready created: \"+a);b=new bc(a,b,c,!!d);return cc[a]=b}\nN(\"ancesto" +
    "r\",function(a,b){for(var c=new B,d=b;d=d.parentNode;)a.a(d)&&sb(c," +
    "d);return c},!0);N(\"ancestor-or-self\",function(a,b){var c=new B,d=" +
    "b;do a.a(d)&&sb(c,d);while(d=d.parentNode);return c},!0);var Sb=N(" +
    "\"attribute\",function(a,b){var c=new B,d=a.f(),e=b.attributes;if(e)" +
    "if(a instanceof D&&null===a.b||\"*\"==d)for(var d=0,f;f=e[d];d++)C(c" +
    ",f);else(f=e.getNamedItem(d))&&C(c,f);return c},!1),$b=N(\"child\",f" +
    "unction(a,b,c,d,e){return pb.call(null,a,b,m(c)?c:null,m(d)?d:null" +
    ",e||new B)},!1,!0);\nN(\"descendant\",mb,!1,!0);var ac=N(\"descendant-" +
    "or-self\",function(a,b,c,d){var e=new B;lb(b,c,d)&&a.a(b)&&C(e,b);r" +
    "eturn mb(a,b,c,d,e)},!1,!0),Wb=N(\"following\",function(a,b,c,d){var" +
    " e=new B;do for(var f=b;f=f.nextSibling;)lb(f,c,d)&&a.a(f)&&C(e,f)" +
    ",e=mb(a,f,c,d,e);while(b=b.parentNode);return e},!1,!0);N(\"followi" +
    "ng-sibling\",function(a,b){for(var c=new B,d=b;d=d.nextSibling;)a.a" +
    "(d)&&C(c,d);return c},!1);N(\"namespace\",function(){return new B},!" +
    "1);\nvar dc=N(\"parent\",function(a,b){var c=new B;if(9==b.nodeType)r" +
    "eturn c;if(2==b.nodeType)return C(c,b.ownerElement),c;var d=b.pare" +
    "ntNode;a.a(d)&&C(c,d);return c},!1),Xb=N(\"preceding\",function(a,b," +
    "c,d){var e=new B,f=[];do f.unshift(b);while(b=b.parentNode);for(va" +
    "r g=1,k=f.length;g<k;g++){var p=[];for(b=f[g];b=b.previousSibling;" +
    ")p.unshift(b);for(var r=0,G=p.length;r<G;r++)b=p[r],lb(b,c,d)&&a.a" +
    "(b)&&C(e,b),e=mb(a,b,c,d,e)}return e},!0,!0);\nN(\"preceding-sibling" +
    "\",function(a,b){for(var c=new B,d=b;d=d.previousSibling;)a.a(d)&&s" +
    "b(c,d);return c},!0);var ec=N(\"self\",function(a,b){var c=new B;a.a" +
    "(b)&&C(c,b);return c},!1);/*\n\n The MIT License\n\n Copyright (c) 200" +
    "7 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission i" +
    "s hereby granted, free of charge, to any person obtaining a copy\n " +
    "of this software and associated documentation files (the \"Software" +
    "\"), to\n deal in the Software without restriction, including withou" +
    "t limitation the\n rights to use, copy, modify, merge, publish, dis" +
    "tribute, sublicense, and/or\n sell copies of the Software, and to p" +
    "ermit persons to whom the Software is\n furnished to do so, subject" +
    " to the following conditions:\n\n The above copyright notice and thi" +
    "s permission notice shall be included in\n all copies or substantia" +
    "l portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WI" +
    "THOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT" +
    " LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PART" +
    "ICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS" +
    " OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n L" +
    "IABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARI" +
    "SING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE O" +
    "R OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction fc(a){H.call(this,1" +
    ");this.c=a;this.j=a.j;this.b=a.b}n(fc,H);fc.prototype.a=function(a" +
    "){return-J(this.c,a)};fc.prototype.toString=function(){return\"Unar" +
    "y Expression: -\"+I(this.c)};/*\n\n The MIT License\n\n Copyright (c) 2" +
    "007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission" +
    " is hereby granted, free of charge, to any person obtaining a copy" +
    "\n of this software and associated documentation files (the \"Softwa" +
    "re\"), to\n deal in the Software without restriction, including with" +
    "out limitation the\n rights to use, copy, modify, merge, publish, d" +
    "istribute, sublicense, and/or\n sell copies of the Software, and to" +
    " permit persons to whom the Software is\n furnished to do so, subje" +
    "ct to the following conditions:\n\n The above copyright notice and t" +
    "his permission notice shall be included in\n all copies or substant" +
    "ial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", " +
    "WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT N" +
    "OT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PA" +
    "RTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHO" +
    "RS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
    " LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, A" +
    "RISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE" +
    " OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction gc(a){H.call(this" +
    ",4);this.c=a;Ab(this,za(this.c,function(a){return a.j}));Bb(this,z" +
    "a(this.c,function(a){return a.b}))}n(gc,H);gc.prototype.a=function" +
    "(a){var b=new B;q(this.c,function(c){c=c.a(a);if(!(c instanceof B)" +
    ")throw Error(\"Path expression must evaluate to NodeSet.\");b=rb(b,c" +
    ")});return b};gc.prototype.toString=function(){return ya(this.c,fu" +
    "nction(a,b){return a+I(b)},\"Union Expression:\")};/*\n\n The MIT Lice" +
    "nse\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Goo" +
    "gle Inc.\n\n Permission is hereby granted, free of charge, to any pe" +
    "rson obtaining a copy\n of this software and associated documentati" +
    "on files (the \"Software\"), to\n deal in the Software without restri" +
    "ction, including without limitation the\n rights to use, copy, modi" +
    "fy, merge, publish, distribute, sublicense, and/or\n sell copies of" +
    " the Software, and to permit persons to whom the Software is\n furn" +
    "ished to do so, subject to the following conditions:\n\n The above c" +
    "opyright notice and this permission notice shall be included in\n a" +
    "ll copies or substantial portions of the Software.\n\n THE SOFTWARE " +
    "IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMP" +
    "LIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILI" +
    "TY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO E" +
    "VENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLA" +
    "IM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT," +
    " TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH TH" +
    "E SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunct" +
    "ion hc(a,b){this.a=a;this.b=b}function ic(a){for(var b,c=[];;){O(a" +
    ",\"Missing right hand side of binary expression.\");b=jc(a);var d=z(" +
    "a.a);if(!d)break;var e=(d=Hb[d]||null)&&d.I;if(!e){a.a.a--;break}f" +
    "or(;c.length&&e<=c[c.length-1].I;)b=new Db(c.pop(),c.pop(),b);c.pu" +
    "sh(b,d)}for(;c.length;)b=new Db(c.pop(),c.pop(),b);return b}functi" +
    "on O(a,b){if(kb(a.a))throw Error(b);}function kc(a,b){var c=z(a.a)" +
    ";if(c!=b)throw Error(\"Bad token, expected: \"+b+\" got: \"+c);}\nfunct"
  )
      .append(
    "ion lc(a){a=z(a.a);if(\")\"!=a)throw Error(\"Bad token: \"+a);}functio" +
    "n mc(a){a=z(a.a);if(2>a.length)throw Error(\"Unclosed literal strin" +
    "g\");return new Ob(a)}function nc(a){var b=z(a.a),c=b.indexOf(\":\");" +
    "if(-1==c)return new Pb(b);var d=b.substring(0,c);a=a.b(d);if(!a)th" +
    "row Error(\"Namespace prefix not declared: \"+d);b=b.substr(c+1);ret" +
    "urn new Pb(b,a)}\nfunction oc(a){var b,c=[],d;if(Vb(y(a.a))){b=z(a." +
    "a);d=y(a.a);if(\"/\"==b&&(kb(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&" +
    "!/(?![0-9])[\\w]/.test(d)))return new Tb;d=new Tb;O(a,\"Missing next" +
    " location step.\");b=pc(a,b);c.push(b)}else{a:{b=y(a.a);d=b.charAt(" +
    "0);switch(d){case \"$\":throw Error(\"Variable reference not allowed " +
    "in HTML XPath\");case \"(\":z(a.a);b=ic(a);O(a,'unclosed \"(\"');kc(a,\"" +
    ")\");break;case '\"':case \"'\":b=mc(a);break;default:if(isNaN(+b))if(" +
    "!Nb(b)&&/(?![0-9])[\\w]/.test(d)&&\"(\"==y(a.a,1)){b=z(a.a);\nb=Mb[b]|" +
    "|null;z(a.a);for(d=[];\")\"!=y(a.a);){O(a,\"Missing function argument" +
    " list.\");d.push(ic(a));if(\",\"!=y(a.a))break;z(a.a)}O(a,\"Unclosed f" +
    "unction argument list.\");lc(a);b=new Kb(b,d)}else{b=null;break a}e" +
    "lse b=new Qb(+z(a.a))}\"[\"==y(a.a)&&(d=new Yb(qc(a)),b=new Ib(b,d))" +
    "}if(b)if(Vb(y(a.a)))d=b;else return b;else b=pc(a,\"/\"),d=new Ub,c." +
    "push(b)}for(;Vb(y(a.a));)b=z(a.a),O(a,\"Missing next location step." +
    "\"),b=pc(a,b),c.push(b);return new Rb(d,c)}\nfunction pc(a,b){var c," +
    "d,e;if(\"/\"!=b&&\"//\"!=b)throw Error('Step op should be \"/\" or \"//\"'" +
    ");if(\".\"==y(a.a))return d=new Zb(ec,new D(\"node\")),z(a.a),d;if(\".." +
    "\"==y(a.a))return d=new Zb(dc,new D(\"node\")),z(a.a),d;var f;if(\"@\"=" +
    "=y(a.a))f=Sb,z(a.a),O(a,\"Missing attribute name\");else if(\"::\"==y(" +
    "a.a,1)){if(!/(?![0-9])[\\w]/.test(y(a.a).charAt(0)))throw Error(\"Ba" +
    "d token: \"+z(a.a));c=z(a.a);f=cc[c]||null;if(!f)throw Error(\"No ax" +
    "is with name: \"+c);z(a.a);O(a,\"Missing node name\")}else f=$b;c=y(a" +
    ".a);if(/(?![0-9])[\\w]/.test(c.charAt(0)))if(\"(\"==\ny(a.a,1)){if(!Nb" +
    "(c))throw Error(\"Invalid node type: \"+c);c=z(a.a);if(!Nb(c))throw " +
    "Error(\"Invalid type name: \"+c);kc(a,\"(\");O(a,\"Bad nodetype\");e=y(a" +
    ".a).charAt(0);var g=null;if('\"'==e||\"'\"==e)g=mc(a);O(a,\"Bad nodety" +
    "pe\");lc(a);c=new D(c,g)}else c=nc(a);else if(\"*\"==c)c=nc(a);else t" +
    "hrow Error(\"Bad token: \"+z(a.a));e=new Yb(qc(a),f.a);return d||new" +
    " Zb(f,c,e,\"//\"==b)}\nfunction qc(a){for(var b=[];\"[\"==y(a.a);){z(a." +
    "a);O(a,\"Missing predicate expression.\");var c=ic(a);b.push(c);O(a," +
    "\"Unclosed predicate expression.\");kc(a,\"]\")}return b}function jc(a" +
    "){if(\"-\"==y(a.a))return z(a.a),new fc(jc(a));var b=oc(a);if(\"|\"!=y" +
    "(a.a))a=b;else{for(b=[b];\"|\"==z(a.a);)O(a,\"Missing next union loca" +
    "tion path.\"),b.push(oc(a));a.a.a--;a=new gc(b)}return a};/*\n\n The " +
    "MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) " +
    "2012 Google Inc.\n\n Permission is hereby granted, free of charge, t" +
    "o any person obtaining a copy\n of this software and associated doc" +
    "umentation files (the \"Software\"), to\n deal in the Software withou" +
    "t restriction, including without limitation the\n rights to use, co" +
    "py, modify, merge, publish, distribute, sublicense, and/or\n sell c" +
    "opies of the Software, and to permit persons to whom the Software " +
    "is\n furnished to do so, subject to the following conditions:\n\n The" +
    " above copyright notice and this permission notice shall be includ" +
    "ed in\n all copies or substantial portions of the Software.\n\n THE S" +
    "OFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS" +
    " OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCH" +
    "ANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT." +
    " IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR" +
    " ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF C" +
    "ONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION" +
    " WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n" +
    "*/\nfunction rc(a,b){if(!a.length)throw Error(\"Empty XPath expressi" +
    "on.\");var c=hb(a);if(kb(c))throw Error(\"Invalid XPath expression.\"" +
    ");b?ga(b)||(b=la(b.lookupNamespaceURI,b)):b=ba(null);var d=ic(new " +
    "hc(c,b));if(!kb(c))throw Error(\"Bad token: \"+z(c));this.evaluate=f" +
    "unction(a,b){var c=d.a(new fb(a));return new P(c,b)}}\nfunction P(a" +
    ",b){if(0==b)if(a instanceof B)b=4;else if(\"string\"==typeof a)b=2;e" +
    "lse if(\"number\"==typeof a)b=1;else if(\"boolean\"==typeof a)b=3;else" +
    " throw Error(\"Unexpected evaluation result.\");if(2!=b&&1!=b&&3!=b&" +
    "&!(a instanceof B))throw Error(\"value could not be converted to th" +
    "e specified type\");this.resultType=b;var c;switch(b){case 2:this.s" +
    "tringValue=a instanceof B?ub(a):\"\"+a;break;case 1:this.numberValue" +
    "=a instanceof B?+ub(a):+a;break;case 3:this.booleanValue=a instanc" +
    "eof B?0<a.o:!!a;break;case 4:case 5:case 6:case 7:var d=\nvb(a);c=[" +
    "];for(var e=F(d);e;e=F(d))c.push(e);this.snapshotLength=a.o;this.i" +
    "nvalidIteratorState=!1;break;case 8:case 9:this.singleNodeValue=tb" +
    "(a);break;default:throw Error(\"Unknown XPathResult type.\");}var f=" +
    "0;this.iterateNext=function(){if(4!=b&&5!=b)throw Error(\"iterateNe" +
    "xt called with wrong result type\");return f>=c.length?null:c[f++]}" +
    ";this.snapshotItem=function(a){if(6!=b&&7!=b)throw Error(\"snapshot" +
    "Item called with wrong result type\");return a>=c.length||0>a?null:" +
    "c[a]}}P.ANY_TYPE=0;\nP.NUMBER_TYPE=1;P.STRING_TYPE=2;P.BOOLEAN_TYPE" +
    "=3;P.UNORDERED_NODE_ITERATOR_TYPE=4;P.ORDERED_NODE_ITERATOR_TYPE=5" +
    ";P.UNORDERED_NODE_SNAPSHOT_TYPE=6;P.ORDERED_NODE_SNAPSHOT_TYPE=7;P" +
    ".ANY_UNORDERED_NODE_TYPE=8;P.FIRST_ORDERED_NODE_TYPE=9;function sc" +
    "(a){this.lookupNamespaceURI=xb(a)}\nfunction tc(a){a=a||ca;var b=a." +
    "document;b.evaluate||(a.XPathResult=P,b.evaluate=function(a,b,e,f)" +
    "{return(new rc(a,e)).evaluate(b,f)},b.createExpression=function(a," +
    "b){return new rc(a,b)},b.createNSResolver=function(a){return new s" +
    "c(a)})}da(\"wgxpath.install\",tc);/*xxx_rpl_lic*/\nvar Q={};Q.D=funct" +
    "ion(){var a={T:\"http://www.w3.org/2000/svg\"};return function(b){re" +
    "turn a[b]||null}}();\nQ.s=function(a,b,c){var d=u(a);if(!d.document" +
    "Element)return null;tc(d?d.parentWindow||d.defaultView:window);try" +
    "{for(var e=d.createNSResolver?d.createNSResolver(d.documentElement" +
    "):Q.D,f={},g=d.getElementsByTagName(\"*\"),k=0;k<g.length;++k){var p" +
    "=g[k],r=p.namespaceURI;if(!f[r]){var G=p.lookupPrefix(r);if(!G){va" +
    "r x=r.match(\".*/(\\\\w+)/?$\");x?G=x[1]:G=\"xhtml\"}f[r]=G}}var t={},E;" +
    "for(E in f)t[f[E]]=E;e=function(a){return t[a]||null};try{return d" +
    ".evaluate(b,a,e,c,null)}catch(U){if(\"TypeError\"===U.name)return e=" +
    "\nd.createNSResolver?d.createNSResolver(d.documentElement):Q.D,d.ev" +
    "aluate(b,a,e,c,null);throw U;}}catch(pa){throw new w(32,\"Unable to" +
    " locate an element with the xpath expression \"+b+\" because of the " +
    "following error:\\n\"+pa);}};Q.F=function(a,b){if(!a||1!=a.nodeType)" +
    "throw new w(32,'The result of the xpath expression \"'+b+'\" is: '+a" +
    "+\". It should be an element.\");};\nQ.M=function(a,b){var c=function" +
    "(){var c=Q.s(b,a,9);return c?c.singleNodeValue||null:b.selectSingl" +
    "eNode?(c=u(b),c.setProperty&&c.setProperty(\"SelectionLanguage\",\"XP" +
    "ath\"),b.selectSingleNode(a)):null}();null===c||Q.F(c,a);return c};" +
    "\nQ.R=function(a,b){var c=function(){var c=Q.s(b,a,7);if(c){for(var" +
    " e=c.snapshotLength,f=[],g=0;g<e;++g)f.push(c.snapshotItem(g));ret" +
    "urn f}return b.selectNodes?(c=u(b),c.setProperty&&c.setProperty(\"S" +
    "electionLanguage\",\"XPath\"),b.selectNodes(a)):[]}();q(c,function(b)" +
    "{Q.F(b,a)});return c};var uc={aliceblue:\"#f0f8ff\",antiquewhite:\"#f" +
    "aebd7\",aqua:\"#00ffff\",aquamarine:\"#7fffd4\",azure:\"#f0ffff\",beige:\"" +
    "#f5f5dc\",bisque:\"#ffe4c4\",black:\"#000000\",blanchedalmond:\"#ffebcd\"" +
    ",blue:\"#0000ff\",blueviolet:\"#8a2be2\",brown:\"#a52a2a\",burlywood:\"#d" +
    "eb887\",cadetblue:\"#5f9ea0\",chartreuse:\"#7fff00\",chocolate:\"#d2691e" +
    "\",coral:\"#ff7f50\",cornflowerblue:\"#6495ed\",cornsilk:\"#fff8dc\",crim" +
    "son:\"#dc143c\",cyan:\"#00ffff\",darkblue:\"#00008b\",darkcyan:\"#008b8b\"" +
    ",darkgoldenrod:\"#b8860b\",darkgray:\"#a9a9a9\",darkgreen:\"#006400\",\nd" +
    "arkgrey:\"#a9a9a9\",darkkhaki:\"#bdb76b\",darkmagenta:\"#8b008b\",darkol" +
    "ivegreen:\"#556b2f\",darkorange:\"#ff8c00\",darkorchid:\"#9932cc\",darkr" +
    "ed:\"#8b0000\",darksalmon:\"#e9967a\",darkseagreen:\"#8fbc8f\",darkslate" +
    "blue:\"#483d8b\",darkslategray:\"#2f4f4f\",darkslategrey:\"#2f4f4f\",dar" +
    "kturquoise:\"#00ced1\",darkviolet:\"#9400d3\",deeppink:\"#ff1493\",deeps" +
    "kyblue:\"#00bfff\",dimgray:\"#696969\",dimgrey:\"#696969\",dodgerblue:\"#" +
    "1e90ff\",firebrick:\"#b22222\",floralwhite:\"#fffaf0\",forestgreen:\"#22" +
    "8b22\",fuchsia:\"#ff00ff\",gainsboro:\"#dcdcdc\",\nghostwhite:\"#f8f8ff\"," +
    "gold:\"#ffd700\",goldenrod:\"#daa520\",gray:\"#808080\",green:\"#008000\"," +
    "greenyellow:\"#adff2f\",grey:\"#808080\",honeydew:\"#f0fff0\",hotpink:\"#" +
    "ff69b4\",indianred:\"#cd5c5c\",indigo:\"#4b0082\",ivory:\"#fffff0\",khaki" +
    ":\"#f0e68c\",lavender:\"#e6e6fa\",lavenderblush:\"#fff0f5\",lawngreen:\"#" +
    "7cfc00\",lemonchiffon:\"#fffacd\",lightblue:\"#add8e6\",lightcoral:\"#f0" +
    "8080\",lightcyan:\"#e0ffff\",lightgoldenrodyellow:\"#fafad2\",lightgray" +
    ":\"#d3d3d3\",lightgreen:\"#90ee90\",lightgrey:\"#d3d3d3\",lightpink:\"#ff" +
    "b6c1\",lightsalmon:\"#ffa07a\",\nlightseagreen:\"#20b2aa\",lightskyblue:" +
    "\"#87cefa\",lightslategray:\"#778899\",lightslategrey:\"#778899\",lights" +
    "teelblue:\"#b0c4de\",lightyellow:\"#ffffe0\",lime:\"#00ff00\",limegreen:" +
    "\"#32cd32\",linen:\"#faf0e6\",magenta:\"#ff00ff\",maroon:\"#800000\",mediu" +
    "maquamarine:\"#66cdaa\",mediumblue:\"#0000cd\",mediumorchid:\"#ba55d3\"," +
    "mediumpurple:\"#9370db\",mediumseagreen:\"#3cb371\",mediumslateblue:\"#" +
    "7b68ee\",mediumspringgreen:\"#00fa9a\",mediumturquoise:\"#48d1cc\",medi" +
    "umvioletred:\"#c71585\",midnightblue:\"#191970\",mintcream:\"#f5fffa\",m" +
    "istyrose:\"#ffe4e1\",\nmoccasin:\"#ffe4b5\",navajowhite:\"#ffdead\",navy:" +
    "\"#000080\",oldlace:\"#fdf5e6\",olive:\"#808000\",olivedrab:\"#6b8e23\",or" +
    "ange:\"#ffa500\",orangered:\"#ff4500\",orchid:\"#da70d6\",palegoldenrod:" +
    "\"#eee8aa\",palegreen:\"#98fb98\",paleturquoise:\"#afeeee\",palevioletre" +
    "d:\"#db7093\",papayawhip:\"#ffefd5\",peachpuff:\"#ffdab9\",peru:\"#cd853f" +
    "\",pink:\"#ffc0cb\",plum:\"#dda0dd\",powderblue:\"#b0e0e6\",purple:\"#8000" +
    "80\",red:\"#ff0000\",rosybrown:\"#bc8f8f\",royalblue:\"#4169e1\",saddlebr" +
    "own:\"#8b4513\",salmon:\"#fa8072\",sandybrown:\"#f4a460\",seagreen:\"#2e8" +
    "b57\",\nseashell:\"#fff5ee\",sienna:\"#a0522d\",silver:\"#c0c0c0\",skyblue" +
    ":\"#87ceeb\",slateblue:\"#6a5acd\",slategray:\"#708090\",slategrey:\"#708" +
    "090\",snow:\"#fffafa\",springgreen:\"#00ff7f\",steelblue:\"#4682b4\",tan:" +
    "\"#d2b48c\",teal:\"#008080\",thistle:\"#d8bfd8\",tomato:\"#ff6347\",turquo" +
    "ise:\"#40e0d0\",violet:\"#ee82ee\",wheat:\"#f5deb3\",white:\"#ffffff\",whi" +
    "tesmoke:\"#f5f5f5\",yellow:\"#ffff00\",yellowgreen:\"#9acd32\"};/*xxx_rp" +
    "l_lic*/\nvar vc=\"backgroundColor borderTopColor borderRightColor bo" +
    "rderBottomColor borderLeftColor color outlineColor\".split(\" \"),wc=" +
    "/#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])/,xc=/^#(?:[0-9a-f]{3}){1" +
    ",2}$/i,yc=/^(?:rgba)?\\((\\d{1,3}),\\s?(\\d{1,3}),\\s?(\\d{1,3}),\\s?(0|1" +
    "|0\\.\\d*)\\)$/i,zc=/^(?:rgb)?\\((0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2})," +
    "\\s?(0|[1-9]\\d{0,2})\\)$/i;/*xxx_rpl_lic*/\nfunction R(a,b){return!!a" +
    "&&1==a.nodeType&&(!b||a.tagName.toUpperCase()==b)}function Ac(a){r" +
    "eturn Bc(a,!0)&&Cc(a)&&\"none\"!=S(a,\"pointer-events\")}var Dc=\"BUTTO" +
    "N INPUT OPTGROUP OPTION SELECT TEXTAREA\".split(\" \");\nfunction Cc(a" +
    "){var b=a.tagName.toUpperCase();return 0<=xa(Dc,b)?a.disabled?!1:a" +
    ".parentNode&&1==a.parentNode.nodeType&&\"OPTGROUP\"==b||\"OPTION\"==b?" +
    "Cc(a.parentNode):!Wa(a,function(a){var b=a.parentNode;if(b&&R(b,\"F" +
    "IELDSET\")&&b.disabled){if(!R(a,\"LEGEND\"))return!0;for(;a=void 0!=a" +
    ".previousElementSibling?a.previousElementSibling:Ra(a.previousSibl" +
    "ing);)if(R(a,\"LEGEND\"))return!0}return!1},!0):!0}var Ec=\"text sear" +
    "ch tel url email password number\".split(\" \");\nfunction Fc(a){funct" +
    "ion b(a){return\"inherit\"==a.contentEditable?(a=Gc(a))?b(a):!1:\"tru" +
    "e\"==a.contentEditable}return l(a.contentEditable)?l(a.isContentEdi" +
    "table)?a.isContentEditable:b(a):!1}function Hc(a){return(R(a,\"TEXT" +
    "AREA\")?!0:R(a,\"INPUT\")?0<=xa(Ec,a.type.toLowerCase()):Fc(a)?!0:!1)" +
    "&&!a.readOnly}function Gc(a){for(a=a.parentNode;a&&1!=a.nodeType&&" +
    "9!=a.nodeType&&11!=a.nodeType;)a=a.parentNode;return R(a)?a:null}\n" +
    "function S(a,b){var c=ta(b);if(\"float\"==c||\"cssFloat\"==c||\"styleFl" +
    "oat\"==c)c=\"cssFloat\";var d=$a(a,c)||Ic(a,c);if(null===d)d=null;els" +
    "e if(0<=xa(vc,c)){b:{var e=d.match(yc);if(e){var c=Number(e[1]),f=" +
    "Number(e[2]),g=Number(e[3]),e=Number(e[4]);if(0<=c&&255>=c&&0<=f&&" +
    "255>=f&&0<=g&&255>=g&&0<=e&&1>=e){c=[c,f,g,e];break b}}c=null}if(!" +
    "c)b:{if(g=d.match(zc))if(c=Number(g[1]),f=Number(g[2]),g=Number(g[" +
    "3]),0<=c&&255>=c&&0<=f&&255>=f&&0<=g&&255>=g){c=[c,f,g,1];break b}" +
    "c=null}if(!c)b:{c=d.toLowerCase();f=uc[c.toLowerCase()];\nif(!f&&(f" +
    "=\"#\"==c.charAt(0)?c:\"#\"+c,4==f.length&&(f=f.replace(wc,\"#$1$1$2$2$" +
    "3$3\")),!xc.test(f))){c=null;break b}c=[parseInt(f.substr(1,2),16)," +
    "parseInt(f.substr(3,2),16),parseInt(f.substr(5,2),16),1]}d=c?\"rgba" +
    "(\"+c.join(\", \")+\")\":d}return d}function Ic(a,b){var c=a.currentSty" +
    "le||a.style,d=c[b];!l(d)&&ga(c.getPropertyValue)&&(d=c.getProperty" +
    "Value(b));return\"inherit\"!=d?l(d)?d:null:(c=Gc(a))?Ic(c,b):null}\nf" +
    "unction Bc(a,b){function c(a){if(\"none\"==S(a,\"display\"))return!1;a" +
    "=Gc(a);return!a||c(a)}function d(a){var b=Jc(a);return 0<b.height&" +
    "&0<b.width?!0:R(a,\"PATH\")&&(0<b.height||0<b.width)?(a=S(a,\"stroke-" +
    "width\"),!!a&&0<parseInt(a,10)):\"hidden\"!=S(a,\"overflow\")&&za(a.chi" +
    "ldNodes,function(a){return 3==a.nodeType||R(a)&&d(a)})}function e(" +
    "a){return\"hidden\"==Kc(a)&&Aa(a.childNodes,function(a){return!R(a)|" +
    "|e(a)})}if(!R(a))throw Error(\"Argument to isShown must be of type " +
    "Element\");if(R(a,\"BODY\"))return!0;if(R(a,\n\"OPTION\")||R(a,\"OPTGROUP" +
    "\")){var f=Wa(a,function(a){return R(a,\"SELECT\")});return!!f&&Bc(f," +
    "!0)}return(f=Lc(a))?!!f.G&&0<f.rect.width&&0<f.rect.height&&Bc(f.G" +
    ",b):R(a,\"INPUT\")&&\"hidden\"==a.type.toLowerCase()||R(a,\"NOSCRIPT\")|" +
    "|\"hidden\"==S(a,\"visibility\")||!c(a)||!b&&0==Mc(a)||!d(a)?!1:!e(a)}" +
    "\nfunction Kc(a,b){function c(a){function b(a){return a==k?!0:0==S(" +
    "a,\"display\").lastIndexOf(\"inline\",0)||\"absolute\"==c&&\"static\"==S(a" +
    ",\"position\")?!1:!0}var c=S(a,\"position\");if(\"fixed\"==c)return G=!0" +
    ",a==k?null:k;for(a=Gc(a);a&&!b(a);)a=Gc(a);return a}function d(a){" +
    "var b=a;if(\"visible\"==r)if(a==k&&p)b=p;else if(a==p)return{x:\"visi" +
    "ble\",y:\"visible\"};b={x:S(b,\"overflow-x\"),y:S(b,\"overflow-y\")};a==k" +
    "&&(b.x=\"visible\"==b.x?\"auto\":b.x,b.y=\"visible\"==b.y?\"auto\":b.y);re" +
    "turn b}function e(a){if(a==k){var b=(new Ya(g)).a;\na=b.body||b.doc" +
    "umentElement;b=b.parentWindow||b.defaultView;a=new Ga(b.pageXOffse" +
    "t||a.scrollLeft,b.pageYOffset||a.scrollTop)}else a=new Ga(a.scroll" +
    "Left,a.scrollTop);return a}for(var f=Nc(a,b),g=u(a),k=g.documentEl" +
    "ement,p=g.body,r=S(k,\"overflow\"),G,x=c(a);x;x=c(x)){var t=d(x);if(" +
    "\"visible\"!=t.x||\"visible\"!=t.y){var E=Jc(x);if(0==E.width||0==E.he" +
    "ight)return\"hidden\";var U=f.right<E.left,pa=f.bottom<E.top;if(U&&\"" +
    "hidden\"==t.x||pa&&\"hidden\"==t.y)return\"hidden\";if(U&&\"visible\"!=t." +
    "x||pa&&\"visible\"!=t.y){U=\ne(x);pa=f.bottom<E.top-U.y;if(f.right<E." +
    "left-U.x&&\"visible\"!=t.x||pa&&\"visible\"!=t.x)return\"hidden\";f=Kc(x" +
    ");return\"hidden\"==f?\"hidden\":\"scroll\"}U=f.left>=E.left+E.width;E=f" +
    ".top>=E.top+E.height;if(U&&\"hidden\"==t.x||E&&\"hidden\"==t.y)return\"" +
    "hidden\";if(U&&\"visible\"!=t.x||E&&\"visible\"!=t.y){if(G&&(t=e(x),f.l" +
    "eft>=k.scrollWidth-t.x||f.right>=k.scrollHeight-t.y))return\"hidden" +
    "\";f=Kc(x);return\"hidden\"==f?\"hidden\":\"scroll\"}}}return\"none\"}\nfunc" +
    "tion Jc(a){var b=Lc(a);if(b)return b.rect;if(R(a,\"HTML\"))return a=" +
    "u(a),a=((a?a.parentWindow||a.defaultView:window)||window).document" +
    ",a=\"CSS1Compat\"==a.compatMode?a.documentElement:a.body,a=new Ha(a." +
    "clientWidth,a.clientHeight),new v(0,0,a.width,a.height);var c;try{" +
    "c=a.getBoundingClientRect()}catch(d){return new v(0,0,0,0)}return " +
    "new v(c.left,c.top,c.right-c.left,c.bottom-c.top)}\nfunction Lc(a){" +
    "var b=R(a,\"MAP\");if(!b&&!R(a,\"AREA\"))return null;var c=b?a:R(a.par" +
    "entNode,\"MAP\")?a.parentNode:null,d=null,e=null;if(c&&c.name&&(d=u(" +
    "c),d=Q.M('/descendant::*[@usemap = \"#'+c.name+'\"]',d))&&(e=Jc(d),!" +
    "b&&\"default\"!=a.shape.toLowerCase())){var f=Oc(a);a=Math.min(Math." +
    "max(f.left,0),e.width);b=Math.min(Math.max(f.top,0),e.height);c=Ma" +
    "th.min(f.width,e.width-a);f=Math.min(f.height,e.height-b);e=new v(" +
    "a+e.left,b+e.top,c,f)}return{G:d,rect:e||new v(0,0,0,0)}}\nfunction" +
    " Oc(a){var b=a.shape.toLowerCase();a=a.coords.split(\",\");if(\"rect\"" +
    "==b&&4==a.length){var b=a[0],c=a[1];return new v(b,c,a[2]-b,a[3]-c" +
    ")}if(\"circle\"==b&&3==a.length)return b=a[2],new v(a[0]-b,a[1]-b,2*" +
    "b,2*b);if(\"poly\"==b&&2<a.length){for(var b=a[0],c=a[1],d=b,e=c,f=2" +
    ";f+1<a.length;f+=2)b=Math.min(b,a[f]),d=Math.max(d,a[f]),c=Math.mi" +
    "n(c,a[f+1]),e=Math.max(e,a[f+1]);return new v(b,c,d-b,e-c)}return " +
    "new v(0,0,0,0)}\nfunction Nc(a,b){var c;c=Jc(a);c=new Za(c.top,c.le" +
    "ft+c.width,c.top+c.height,c.left);if(b){var d=b instanceof v?b:new" +
    " v(b.x,b.y,1,1);c.left=Fa(c.left+d.left,c.left,c.right);c.top=Fa(c" +
    ".top+d.top,c.top,c.bottom);c.right=Fa(c.left+d.width,c.left,c.righ" +
    "t);c.bottom=Fa(c.top+d.height,c.top,c.bottom)}return c}function Mc" +
    "(a){var b=1,c=S(a,\"opacity\");c&&(b=Number(c));(a=Gc(a))&&(b*=Mc(a)" +
    ");return b};/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_" +
    "rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\nfunction Pc(a){this.a=ab" +
    ".document.documentElement;this.i=null;var b=Xa(u(this.a));b&&Qc(th" +
    "is,b);this.u=a||new Rc}function Qc(a,b){a.a=b;R(b,\"OPTION\")?a.i=Wa" +
    "(b,function(a){return R(a,\"SELECT\")}):a.i=null}function Sc(a){retu" +
    "rn R(a,\"FORM\")}function Tc(a){if(!Sc(a))throw new w(12,\"Element is" +
    " not a form, so could not submit.\");T(a,Uc)&&(R(a.submit)?a.constr" +
    "uctor.prototype.submit.call(a):a.submit())}function Rc(){this.a=0}" +
    ";/*xxx_rpl_lic*/\nra(eb,4);function V(a,b,c){this.a=a;this.b=b;this" +
    ".f=c}V.prototype.J=function(a){a=u(a).createEvent(\"HTMLEvents\");a." +
    "initEvent(this.a,this.b,this.f);return a};V.prototype.toString=aa(" +
    "\"a\");function Vc(a,b,c){V.call(this,a,b,c)}n(Vc,V);Vc.prototype.J=" +
    "function(a,b){var c;c=u(a).createEvent(\"Events\");c.initEvent(this." +
    "a,this.b,this.f);c.altKey=b.altKey;c.ctrlKey=b.ctrlKey;c.metaKey=b" +
    ".metaKey;c.shiftKey=b.shiftKey;c.keyCode=b.charCode||b.keyCode;c.c" +
    "harCode=this==Wc?c.keyCode:0;return c};\nvar Xc=new V(\"blur\",!1,!1)" +
    ",Yc=new V(\"change\",!0,!1),Zc=new V(\"focus\",!1,!1),$c=new V(\"input\"" +
    ",!0,!1),Uc=new V(\"submit\",!0,!0),ad=new V(\"textInput\",!0,!0),bd=ne" +
    "w Vc(\"keydown\",!0,!0),Wc=new Vc(\"keypress\",!0,!0),cd=new Vc(\"keyup" +
    "\",!0,!0);function T(a,b,c){b=b.J(a,c);\"isTrusted\"in b||(b.isTruste" +
    "d=!1);return a.dispatchEvent(b)};function dd(a,b){ed(a)&&(a.select" +
    "ionStart=b)}function W(a,b){var c=0,d=0;ed(a)&&(c=a.selectionStart" +
    ",d=b?-1:a.selectionEnd);return[c,d]}function fd(a,b){ed(a)&&(a.sel" +
    "ectionEnd=b)}function gd(a,b){ed(a)&&(a.selectionStart=b,a.selecti" +
    "onEnd=b)}function hd(a,b){if(ed(a)){var c=a.value,d=a.selectionSta" +
    "rt;a.value=c.substr(0,d)+b+c.substr(a.selectionEnd);a.selectionSta" +
    "rt=d;a.selectionEnd=d+b.length}else throw Error(\"Cannot set the se" +
    "lection end\");}\nfunction ed(a){try{return\"number\"==typeof a.select" +
    "ionStart}catch(b){return!1}};var id=\"StopIteration\"in ca?ca.StopIt" +
    "eration:{message:\"StopIteration\",stack:\"\"};function jd(){}jd.proto" +
    "type.a=function(){throw id;};jd.prototype.A=function(){return this" +
    "};function kd(a,b){this.b={};this.a=[];this.c=this.f=0;var c=argum" +
    "ents.length;if(1<c){if(c%2)throw Error(\"Uneven number of arguments" +
    "\");for(var d=0;d<c;d+=2)ld(this,arguments[d],arguments[d+1])}else " +
    "if(a){if(a instanceof kd)d=md(a),c=a.v();else{var c=[],e=0;for(d i" +
    "n a)c[e++]=d;d=c;c=Da(a)}for(e=0;e<d.length;e++)ld(this,d[e],c[e])" +
    "}}h=kd.prototype;h.v=function(){nd(this);for(var a=[],b=0;b<this.a" +
    ".length;b++)a.push(this.b[this.a[b]]);return a};function md(a){nd(" +
    "a);return a.a.concat()}\nh.clear=function(){this.b={};this.c=this.f" +
    "=this.a.length=0};function nd(a){if(a.f!=a.a.length){for(var b=0,c" +
    "=0;b<a.a.length;){var d=a.a[b];od(a.b,d)&&(a.a[c++]=d);b++}a.a.len" +
    "gth=c}if(a.f!=a.a.length){for(var e={},c=b=0;b<a.a.length;)d=a.a[b" +
    "],od(e,d)||(a.a[c++]=d,e[d]=1),b++;a.a.length=c}}h.get=function(a," +
    "b){return od(this.b,a)?this.b[a]:b};function ld(a,b,c){od(a.b,b)||" +
    "(a.f++,a.a.push(b),a.c++);a.b[b]=c}\nh.forEach=function(a,b){for(va" +
    "r c=md(this),d=0;d<c.length;d++){var e=c[d],f=this.get(e);a.call(b" +
    ",f,e,this)}};h.clone=function(){return new kd(this)};h.A=function(" +
    "a){nd(this);var b=0,c=this.c,d=this,e=new jd;e.a=function(){if(c!=" +
    "d.c)throw Error(\"The map has changed since the iterator was create" +
    "d\");if(b>=d.a.length)throw id;var e=d.a[b++];return a?e:d.b[e]};re" +
    "turn e};function od(a,b){return Object.prototype.hasOwnProperty.ca" +
    "ll(a,b)};function pd(a){if(\"function\"==typeof a.v)return a.v();if(" +
    "m(a))return a.split(\"\");var b=ea(a);if(\"array\"==b||\"object\"==b&&\"n" +
    "umber\"==typeof a.length){for(var b=[],c=a.length,d=0;d<c;d++)b.pus" +
    "h(a[d]);return b}return Da(a)};function qd(a){this.a=new kd;if(a){" +
    "a=pd(a);for(var b=a.length,c=0;c<b;c++){var d=a[c];ld(this.a,rd(d)" +
    ",d)}}}function rd(a){var b=typeof a;return\"object\"==b&&a||\"functio" +
    "n\"==b?\"o\"+(a[ha]||(a[ha]=++ia)):b.substr(0,1)+a}h=qd.prototype;h.c" +
    "lear=function(){this.a.clear()};h.contains=function(a){a=rd(a);ret" +
    "urn od(this.a.b,a)};h.v=function(){return this.a.v()};h.clone=func" +
    "tion(){return new qd(this)};h.A=function(){return this.a.A(!1)};/*" +
    "xxx_rpl_lic*/\nfunction sd(a){Pc.call(this);this.c=Hc(this.a);this." +
    "b=0;this.f=new qd;a&&(q(a.pressed,function(a){td(this,a,!0)},this)" +
    ",this.b=a.currentPos||0)}n(sd,Pc);var ud={};function X(a,b,c){var " +
    "d=typeof a;(\"object\"==d&&null!=a||\"function\"==d)&&(a=a.g);a=new vd" +
    "(a,b,c);!b||b in ud&&!c||(ud[b]={key:a,shift:!1},c&&(ud[c]={key:a," +
    "shift:!0}));return a}function vd(a,b,c){this.code=a;this.a=b||null" +
    ";this.b=c||this.a}var wd=X(8),xd=X(9),yd=X(13),Y=X(16),zd=X(17),Ad" +
    "=X(18),Bd=X(19);X(20);\nvar Cd=X(27),Dd=X(32,\" \"),Ed=X(33),Fd=X(34)" +
    ",Gd=X(35),Hd=X(36),Id=X(37),Jd=X(38),Kd=X(39),Ld=X(40);X(44);var M" +
    "d=X(45),Nd=X(46);X(48,\"0\",\")\");X(49,\"1\",\"!\");X(50,\"2\",\"@\");X(51,\"3" +
    "\",\"#\");X(52,\"4\",\"$\");X(53,\"5\",\"%\");X(54,\"6\",\"^\");X(55,\"7\",\"&\");X(5" +
    "6,\"8\",\"*\");X(57,\"9\",\"(\");X(65,\"a\",\"A\");X(66,\"b\",\"B\");X(67,\"c\",\"C\")" +
    ";X(68,\"d\",\"D\");X(69,\"e\",\"E\");X(70,\"f\",\"F\");X(71,\"g\",\"G\");X(72,\"h\"," +
    "\"H\");X(73,\"i\",\"I\");X(74,\"j\",\"J\");X(75,\"k\",\"K\");X(76,\"l\",\"L\");X(77," +
    "\"m\",\"M\");X(78,\"n\",\"N\");X(79,\"o\",\"O\");X(80,\"p\",\"P\");X(81,\"q\",\"Q\");\n" +
    "X(82,\"r\",\"R\");X(83,\"s\",\"S\");X(84,\"t\",\"T\");X(85,\"u\",\"U\");X(86,\"v\",\"" +
    "V\");X(87,\"w\",\"W\");X(88,\"x\",\"X\");X(89,\"y\",\"Y\");X(90,\"z\",\"Z\");var Od" +
    "=X(Ma?{h:91,g:91}:La?{h:224,g:91}:{h:0,g:91});X(Ma?{h:92,g:92}:La?" +
    "{h:224,g:93}:{h:0,g:92});X(Ma?{h:93,g:93}:La?{h:0,g:0}:{h:93,g:nul" +
    "l});\nvar Pd=X({h:96,g:96},\"0\"),Qd=X({h:97,g:97},\"1\"),Rd=X({h:98,g:" +
    "98},\"2\"),Sd=X({h:99,g:99},\"3\"),Td=X({h:100,g:100},\"4\"),Ud=X({h:101" +
    ",g:101},\"5\"),Vd=X({h:102,g:102},\"6\"),Wd=X({h:103,g:103},\"7\"),Xd=X(" +
    "{h:104,g:104},\"8\"),Yd=X({h:105,g:105},\"9\"),Zd=X({h:106,g:106},\"*\")" +
    ",$d=X({h:107,g:107},\"+\"),ae=X({h:109,g:109},\"-\"),be=X({h:110,g:110" +
    "},\".\"),ce=X({h:111,g:111},\"/\");X(144);\nvar de=X(112),ee=X(113),fe=" +
    "X(114),ge=X(115),he=X(116),ie=X(117),je=X(118),ke=X(119),le=X(120)" +
    ",me=X(121),ne=X(122),oe=X(123),pe=X({h:107,g:187},\"=\",\"+\"),qe=X(10" +
    "8,\",\");X({h:109,g:189},\"-\",\"_\");X(188,\",\",\"<\");X(190,\".\",\">\");X(19" +
    "1,\"/\",\"?\");X(192,\"`\",\"~\");X(219,\"[\",\"{\");X(220,\"\\\\\",\"|\");X(221,\"]\"" +
    ",\"}\");var re=X({h:59,g:186},\";\",\":\");X(222,\"'\",'\"');var se=[Ad,zd," +
    "Od,Y],te=new kd;ld(te,1,Y);ld(te,2,zd);ld(te,4,Ad);ld(te,8,Od);var" +
    " ue=function(a){var b=new kd;q(md(a),function(c){ld(b,a.get(c).cod" +
    "e,c)});return b}(te);\nfunction td(a,b,c){if(0<=xa(se,b)){var d=ue." +
    "get(b.code),e=a.u;e.a=c?e.a|d:e.a&~d}c?ld(a.f.a,rd(b),b):(a=a.f.a," +
    "b=rd(b),od(a.b,b)&&(delete a.b[b],a.f--,a.c++,a.a.length>2*a.f&&nd" +
    "(a)))}function Z(a,b){return a.f.contains(b)}\nfunction ve(a,b){if(" +
    "0<=xa(se,b)&&Z(a,b))throw new w(13,\"Cannot press a modifier key th" +
    "at is already pressed.\");var c=null!==b.code&&we(a,bd,b);if(c&&(!b" +
    ".a&&b!=yd||we(a,Wc,b,!c))&&c&&(xe(a,b),a.c))if(b.a){var c=ye(a,b)," +
    "d=W(a.a,!0)[0]+1;ze(a.a)?(hd(a.a,c),dd(a.a,d)):a.a.value+=c;T(a.a," +
    "ad);T(a.a,$c);a.b=d}else switch(b){case yd:T(a.a,ad);R(a.a,\"TEXTAR" +
    "EA\")&&(c=W(a.a,!0)[0]+1,ze(a.a)?(hd(a.a,\"\\n\"),dd(a.a,c)):a.a.value" +
    "+=\"\\n\",T(a.a,$c),a.b=c);break;case wd:case Nd:Ae(a.a);c=W(a.a,!1);" +
    "c[0]==c[1]&&(b==wd?\n(dd(a.a,c[1]-1),fd(a.a,c[1])):fd(a.a,c[1]+1));" +
    "c=W(a.a,!1);c=!(c[0]==a.a.value.length||0==c[1]);hd(a.a,\"\");c&&T(a" +
    ".a,$c);c=W(a.a,!1);a.b=c[1];break;case Id:case Kd:Ae(a.a);var c=a." +
    "a,e=W(c,!0)[0],f=W(c,!1)[1],g=d=0;b==Id?Z(a,Y)?a.b==e?(d=Math.max(" +
    "e-1,0),g=f,e=d):(d=e,e=g=f-1):e=e==f?Math.max(e-1,0):e:Z(a,Y)?a.b=" +
    "=f?(d=e,e=g=Math.min(f+1,c.value.length)):(d=e+1,g=f,e=d):e=e==f?M" +
    "ath.min(f+1,c.value.length):f;Z(a,Y)?(dd(c,d),fd(c,g)):gd(c,e);a.b" +
    "=e;break;case Hd:case Gd:Ae(a.a),c=a.a,d=W(c,!0)[0],g=W(c,!1)[1],\n" +
    "b==Hd?(Z(a,Y)?(dd(c,0),fd(c,a.b==d?g:d)):gd(c,0),a.b=0):(Z(a,Y)?(a" +
    ".b==d&&dd(c,g),fd(c,c.value.length)):gd(c,c.value.length),a.b=c.va" +
    "lue.length)}td(a,b,!0)}\nfunction xe(a,b){if(b==yd&&R(a.a,\"INPUT\"))" +
    "{var c=Wa(a.a,Sc,!0);if(c){var d=c.getElementsByTagName(\"input\");!" +
    "za(d,function(a){a:{if(R(a,\"INPUT\")){var b=a.type.toLowerCase();if" +
    "(\"submit\"==b||\"image\"==b){a=!0;break a}}if(R(a,\"BUTTON\")&&(b=a.typ" +
    "e.toLowerCase(),\"submit\"==b)){a=!0;break a}a=!1}return a})&&1!=d.l" +
    "ength&&(Qa[534]||(Qa[534]=0<=ra(Pa,534)))||Tc(c)}}}function Be(a,b" +
    "){if(!Z(a,b))throw new w(13,\"Cannot release a key that is not pres" +
    "sed. (\"+b.code+\")\");null===b.code||we(a,cd,b);td(a,b,!1)}\nfunction" +
    " ye(a,b){if(!b.a)throw new w(13,\"not a character key\");return Z(a," +
    "Y)?b.b:b.a}function Ae(a){try{a.selectionStart}catch(b){if(-1!=b.m" +
    "essage.indexOf(\"does not support selection.\"))throw Error(b.messag" +
    "e+\" (For more information, see https://code.google.com/p/chromium/" +
    "issues/detail?id=330456)\");throw b;}}function ze(a){try{Ae(a)}catc" +
    "h(b){return!1}return!0}\nfunction we(a,b,c,d){if(null===c.code)thro" +
    "w new w(13,\"Key must have a keycode to be fired.\");c={altKey:Z(a,A" +
    "d),ctrlKey:Z(a,zd),metaKey:Z(a,Od),shiftKey:Z(a,Y),keyCode:c.code," +
    "charCode:c.a&&b==Wc?ye(a,c).charCodeAt(0):0,preventDefault:!!d};re" +
    "turn T(a.a,b,c)}function Ce(a,b){Qc(a,b);a.c=Hc(b);var c;c=a.i||a." +
    "a;var d=Xa(u(c));if(c==d)c=!1;else{if(d&&ga(d.blur)&&!R(d,\"BODY\"))" +
    "try{d.blur()}catch(e){throw e;}ga(c.focus)?(c.focus(),c=!0):c=!1}a" +
    ".c&&c&&(gd(b,b.value.length),a.b=b.value.length)};/*xxx_rpl_lic*/\n" +
    "/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\nfunction De(a,b,c,d){function e(a)" +
    "{m(a)?q(a.split(\"\"),function(a){if(1!=a.length)throw new w(13,\"Arg" +
    "ument not a single character: \"+a);var b=ud[a];b||(b=a.toUpperCase" +
    "(),b=X(b.charCodeAt(0),a.toLowerCase(),b),b={key:b,shift:a!=b.a});" +
    "a=b;b=Z(f,Y);a.shift&&!b&&ve(f,Y);ve(f,a.key);Be(f,a.key);a.shift&" +
    "&!b&&Be(f,Y)}):0<=xa(se,a)?Z(f,a)?Be(f,a):ve(f,a):(ve(f,a),Be(f,a)" +
    ")}if(a!=Xa(u(a))){if(!Ac(a))throw new w(12,\"Element is not current" +
    "ly interactable and may not be manipulated\");Ee(a)}var f=c||new sd" +
    ";Ce(f,\na);if(\"date\"==a.type){c=\"array\"==ea(b)?b=b.join(\"\"):b;var g" +
    "=/\\d{4}-\\d{2}-\\d{2}/;if(c.match(g)){T(a,Zc);a.value=c.match(g)[0];" +
    "T(a,Yc);T(a,Xc);return}}\"array\"==ea(b)?q(b,e):e(b);d||q(se,functio" +
    "n(a){Z(f,a)&&Be(f,a)})}\nfunction Ee(a){if(\"scroll\"==Kc(a,void 0)){" +
    "if(a.scrollIntoView&&(a.scrollIntoView(),\"none\"==Kc(a,void 0)))ret" +
    "urn;for(var b=Nc(a,void 0),c=Gc(a);c;c=Gc(c)){var d=c,e=Jc(d),f,g=" +
    "d,k=f=void 0,p=void 0,r=void 0,r=$a(g,\"borderLeftWidth\"),p=$a(g,\"b" +
    "orderRightWidth\"),k=$a(g,\"borderTopWidth\");f=$a(g,\"borderBottomWid" +
    "th\");f=new Za(parseFloat(k),parseFloat(p),parseFloat(f),parseFloat" +
    "(r));g=b.left-e.left-f.left;e=b.top-e.top-f.top;f=d.clientHeight+b"
  )
      .append(
    ".top-b.bottom;d.scrollLeft+=Math.min(g,Math.max(g-(d.clientWidth+\n" +
    "b.left-b.right),0));d.scrollTop+=Math.min(e,Math.max(e-f,0))}Kc(a," +
    "void 0)}};/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\nfunction Fe(a,b,c,d){fun" +
    "ction e(){return{H:f,keys:[]}}var f=!!d,g=[],k=e();g.push(k);q(b,f" +
    "unction(a){q(a.split(\"\"),function(a){if(\"\\ue000\"<=a&&\"\\ue03d\">=a){" +
    "var b=Ge[a];if(null===b)g.push(k=e()),f&&(k.H=!1,g.push(k=e()));el" +
    "se if(l(b))k.keys.push(b);else throw Error(\"Unsupported WebDriver " +
    "key: \\\\u\"+a.charCodeAt(0).toString(16));}else switch(a){case \"\\n\":" +
    "k.keys.push(yd);break;case \"\\t\":k.keys.push(xd);break;case \"\\b\":k." +
    "keys.push(wd);break;default:k.keys.push(a)}})});q(g,function(b){De" +
    "(a,b.keys,c,b.H)})}\nvar Ge={\"\\ue000\":null,\"\\ue003\":wd,\"\\ue004\":xd," +
    "\"\\ue006\":yd,\"\\ue007\":yd,\"\\ue008\":Y,\"\\ue009\":zd,\"\\ue00a\":Ad,\"\\ue00b" +
    "\":Bd,\"\\ue00c\":Cd,\"\\ue00d\":Dd,\"\\ue00e\":Ed,\"\\ue00f\":Fd,\"\\ue010\":Gd,\"" +
    "\\ue011\":Hd,\"\\ue012\":Id,\"\\ue013\":Jd,\"\\ue014\":Kd,\"\\ue015\":Ld,\"\\ue016" +
    "\":Md,\"\\ue017\":Nd,\"\\ue018\":re,\"\\ue019\":pe,\"\\ue01a\":Pd,\"\\ue01b\":Qd,\"" +
    "\\ue01c\":Rd,\"\\ue01d\":Sd,\"\\ue01e\":Td,\"\\ue01f\":Ud,\"\\ue020\":Vd,\"\\ue021" +
    "\":Wd,\"\\ue022\":Xd,\"\\ue023\":Yd,\"\\ue024\":Zd,\"\\ue025\":$d,\"\\ue027\":ae,\"" +
    "\\ue028\":be,\"\\ue029\":ce,\"\\ue026\":qe,\"\\ue031\":de,\"\\ue032\":ee,\n\"\\ue03" +
    "3\":fe,\"\\ue034\":ge,\"\\ue035\":he,\"\\ue036\":ie,\"\\ue037\":je,\"\\ue038\":ke," +
    "\"\\ue039\":le,\"\\ue03a\":me,\"\\ue03b\":ne,\"\\ue03c\":oe,\"\\ue03d\":Od};/*xxx" +
    "_rpl_lic*/\nda(\"_\",function(a,b,c,d){c=new sd(c);a||(a=Xa(u(documen" +
    "t)));if(!a)throw Error(\"No element to send keys to\");Fe(a,b,c,d);r" +
    "eturn{pressed:c.f.v(),currentPos:c.b}});;return this._.apply(null," +
    "arguments);}).apply({navigator:typeof window!=\"undefined\"?window.n" +
    "avigator:null},arguments);}\n"
  )
  .toString();
  static final String SEND_KEYS_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String SEND_KEYS_ANDROID_original() {
    return SEND_KEYS_ANDROID.replaceAll("xxx_rpl_lic", SEND_KEYS_ANDROID_license);
  }

/* field: ACTIVE_ELEMENT_ANDROID license: 

 Copyright 2014 Software Freedom Conservancy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
  static final String ACTIVE_ELEMENT_ANDROID =
  new StringBuilder(
    "function(){return(function(){function h(a){return function(){retur" +
    "n this[a]}}function k(a){return function(){return a}}var l=this;fu" +
    "nction aa(a,b){var c=a.split(\".\"),d=l;c[0]in d||!d.execScript||d.e" +
    "xecScript(\"var \"+c[0]);for(var e;c.length&&(e=c.shift());)c.length" +
    "||void 0===b?d[e]?d=d[e]:d=d[e]={}:d[e]=b}\nfunction ba(a){var b=ty" +
    "peof a;if(\"object\"==b)if(a){if(a instanceof Array)return\"array\";if" +
    "(a instanceof Object)return b;var c=Object.prototype.toString.call" +
    "(a);if(\"[object Window]\"==c)return\"object\";if(\"[object Array]\"==c|" +
    "|\"number\"==typeof a.length&&\"undefined\"!=typeof a.splice&&\"undefin" +
    "ed\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"splic" +
    "e\"))return\"array\";if(\"[object Function]\"==c||\"undefined\"!=typeof a" +
    ".call&&\"undefined\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEn" +
    "umerable(\"call\"))return\"function\"}else return\"null\";\nelse if(\"func" +
    "tion\"==b&&\"undefined\"==typeof a.call)return\"object\";return b}funct" +
    "ion m(a){return\"string\"==typeof a}function ca(a,b,c){return a.call" +
    ".apply(a.bind,arguments)}function da(a,b,c){if(!a)throw Error();if" +
    "(2<arguments.length){var d=Array.prototype.slice.call(arguments,2)" +
    ";return function(){var c=Array.prototype.slice.call(arguments);Arr" +
    "ay.prototype.unshift.apply(c,d);return a.apply(b,c)}}return functi" +
    "on(){return a.apply(b,arguments)}}\nfunction n(a,b,c){n=Function.pr" +
    "ototype.bind&&-1!=Function.prototype.bind.toString().indexOf(\"nati" +
    "ve code\")?ca:da;return n.apply(null,arguments)}function ea(a,b){va" +
    "r c=Array.prototype.slice.call(arguments,1);return function(){var " +
    "b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}}\nfun" +
    "ction r(a,b){function c(){}c.prototype=b.prototype;a.G=b.prototype" +
    ";a.prototype=new c;a.prototype.constructor=a;a.F=function(a,c,f){f" +
    "or(var g=Array(arguments.length-2),w=2;w<arguments.length;w++)g[w-" +
    "2]=arguments[w];return b.prototype[c].apply(a,g)}}Function.prototy" +
    "pe.bind=Function.prototype.bind||function(a,b){if(1<arguments.leng" +
    "th){var c=Array.prototype.slice.call(arguments,1);c.unshift(this,a" +
    ");return n.apply(null,c)}return n(this,a)};function t(a){if(Error." +
    "captureStackTrace)Error.captureStackTrace(this,t);else{var b=Error" +
    "().stack;b&&(this.stack=b)}a&&(this.message=String(a))}r(t,Error);" +
    "t.prototype.name=\"CustomError\";function fa(a,b){for(var c=a.split(" +
    "\"%s\"),d=\"\",e=Array.prototype.slice.call(arguments,1);e.length&&1<c" +
    ".length;)d+=c.shift()+e.shift();return d+c.join(\"%s\")}var ga=Strin" +
    "g.prototype.trim?function(a){return a.trim()}:function(a){return a" +
    ".replace(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function ha(a,b){return a<b" +
    "?-1:a>b?1:0};function ia(a,b){b.unshift(a);t.call(this,fa.apply(nu" +
    "ll,b));b.shift()}r(ia,t);ia.prototype.name=\"AssertionError\";functi" +
    "on ja(a,b,c){if(!a){var d=\"Assertion failed\";if(b)var d=d+(\": \"+b)" +
    ",e=Array.prototype.slice.call(arguments,2);throw new ia(\"\"+d,e||[]" +
    ");}};var u=Array.prototype;function v(a,b){for(var c=a.length,d=m(" +
    "a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.call(void 0,d[e],e,a)}funct" +
    "ion x(a,b,c){var d=c;v(a,function(c,f){d=b.call(void 0,d,c,f,a)});" +
    "return d}function y(a,b){for(var c=a.length,d=m(a)?a.split(\"\"):a,e" +
    "=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;return!1}fu" +
    "nction ka(a){return u.concat.apply(u,arguments)}function la(a,b,c)" +
    "{ja(null!=a.length);return 2>=arguments.length?u.slice.call(a,b):u" +
    ".slice.call(a,b,c)};function ma(a){var b=arguments.length;if(1==b&" +
    "&\"array\"==ba(arguments[0]))return ma.apply(null,arguments[0]);for(" +
    "var c={},d=0;d<b;d++)c[arguments[d]]=!0;return c};ma(\"area base br" +
    " col command embed hr img input keygen link meta param source trac" +
    "k wbr\".split(\" \"));var na;a:{var oa=l.navigator;if(oa){var pa=oa.u" +
    "serAgent;if(pa){na=pa;break a}}na=\"\"};function qa(a,b){if(a.contai" +
    "ns&&1==b.nodeType)return a==b||a.contains(b);if(\"undefined\"!=typeo" +
    "f a.compareDocumentPosition)return a==b||Boolean(a.compareDocument" +
    "Position(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==a}\nfunction" +
    " ra(a,b){if(a==b)return 0;if(a.compareDocumentPosition)return a.co" +
    "mpareDocumentPosition(b)&2?1:-1;if(\"sourceIndex\"in a||a.parentNode" +
    "&&\"sourceIndex\"in a.parentNode){var c=1==a.nodeType,d=1==b.nodeTyp" +
    "e;if(c&&d)return a.sourceIndex-b.sourceIndex;var e=a.parentNode,f=" +
    "b.parentNode;return e==f?sa(a,b):!c&&qa(e,b)?-1*ta(a,b):!d&&qa(f,a" +
    ")?ta(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b.sourceIndex:f.sourc" +
    "eIndex)}ja(a,\"Node cannot be null or undefined.\");d=9==a.nodeType?" +
    "a:a.ownerDocument||a.document;c=\nd.createRange();c.selectNode(a);c" +
    ".collapse(!0);d=d.createRange();d.selectNode(b);d.collapse(!0);ret" +
    "urn c.compareBoundaryPoints(l.Range.START_TO_END,d)}function ta(a," +
    "b){var c=a.parentNode;if(c==b)return-1;for(var d=b;d.parentNode!=c" +
    ";)d=d.parentNode;return sa(d,a)}function sa(a,b){for(var c=b;c=c.p" +
    "reviousSibling;)if(c==a)return-1;return 1};/*xxx_rpl_lic*/\n/*xxx_r" +
    "pl_lic*/\n/*xxx_rpl_lic*/\nfunction ua(a){return(a=a.exec(na))?a[1]:" +
    "\"\"}ua(/Android\\s+([0-9.]+)/)||ua(/Version\\/([0-9.]+)/);/*xxx_rpl_l" +
    "ic*/\nfunction va(a){var b=0,c=ga(String(wa)).split(\".\");a=ga(Strin" +
    "g(a)).split(\".\");for(var d=Math.max(c.length,a.length),e=0;0==b&&e" +
    "<d;e++){var f=c[e]||\"\",g=a[e]||\"\",w=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),p=R" +
    "egExp(\"(\\\\d*)(\\\\D*)\",\"g\");do{var q=w.exec(f)||[\"\",\"\",\"\"],C=p.exec(" +
    "g)||[\"\",\"\",\"\"];if(0==q[0].length&&0==C[0].length)break;b=ha(0==q[1" +
    "].length?0:parseInt(q[1],10),0==C[1].length?0:parseInt(C[1],10))||" +
    "ha(0==q[2].length,0==C[2].length)||ha(q[2],C[2])}while(0==b)}}\nvar" +
    " xa=/Android\\s+([0-9\\.]+)/.exec(na),wa=xa?xa[1]:\"0\";va(2.3);va(4);" +
    "/*xxx_rpl_lic*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu L" +
    "abs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby g" +
    "ranted, free of charge, to any person obtaining a copy\n of this so" +
    "ftware and associated documentation files (the \"Software\"), to\n de" +
    "al in the Software without restriction, including without limitati" +
    "on the\n rights to use, copy, modify, merge, publish, distribute, s" +
    "ublicense, and/or\n sell copies of the Software, and to permit pers" +
    "ons to whom the Software is\n furnished to do so, subject to the fo" +
    "llowing conditions:\n\n The above copyright notice and this permissi" +
    "on notice shall be included in\n all copies or substantial portions" +
    " of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARR" +
    "ANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED T" +
    "O THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PUR" +
    "POSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRI" +
    "GHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, " +
    "WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM" +
    ", OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DE" +
    "ALINGS\n IN THE SOFTWARE.\n*/\nfunction z(a,b,c){this.a=a;this.b=b||1" +
    ";this.f=c||1};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Lab" +
    "s, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby gra" +
    "nted, free of charge, to any person obtaining a copy\n of this soft" +
    "ware and associated documentation files (the \"Software\"), to\n deal" +
    " in the Software without restriction, including without limitation" +
    " the\n rights to use, copy, modify, merge, publish, distribute, sub" +
    "license, and/or\n sell copies of the Software, and to permit person" +
    "s to whom the Software is\n furnished to do so, subject to the foll" +
    "owing conditions:\n\n The above copyright notice and this permission" +
    " notice shall be included in\n all copies or substantial portions o" +
    "f the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRAN" +
    "TY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO " +
    "THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPO" +
    "SE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGH" +
    "T HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WH" +
    "ETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, " +
    "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEAL" +
    "INGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 200" +
    "7 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission i" +
    "s hereby granted, free of charge, to any person obtaining a copy\n " +
    "of this software and associated documentation files (the \"Software" +
    "\"), to\n deal in the Software without restriction, including withou" +
    "t limitation the\n rights to use, copy, modify, merge, publish, dis" +
    "tribute, sublicense, and/or\n sell copies of the Software, and to p" +
    "ermit persons to whom the Software is\n furnished to do so, subject" +
    " to the following conditions:\n\n The above copyright notice and thi" +
    "s permission notice shall be included in\n all copies or substantia" +
    "l portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WI" +
    "THOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT" +
    " LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PART" +
    "ICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS" +
    " OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n L" +
    "IABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARI" +
    "SING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE O" +
    "R OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyr" +
    "ight (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n " +
    "Permission is hereby granted, free of charge, to any person obtain" +
    "ing a copy\n of this software and associated documentation files (t" +
    "he \"Software\"), to\n deal in the Software without restriction, incl" +
    "uding without limitation the\n rights to use, copy, modify, merge, " +
    "publish, distribute, sublicense, and/or\n sell copies of the Softwa" +
    "re, and to permit persons to whom the Software is\n furnished to do" +
    " so, subject to the following conditions:\n\n The above copyright no" +
    "tice and this permission notice shall be included in\n all copies o" +
    "r substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED" +
    " \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLU" +
    "DING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNES" +
    "S FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL " +
    "THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES" +
    " OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OT" +
    "HERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE " +
    "OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction ya(a){t" +
    "his.b=a;this.a=0}function za(a){a=a.match(Aa);for(var b=0;b<a.leng" +
    "th;b++)Ba.test(a[b])&&a.splice(b,1);return new ya(a)}var Aa=RegExp" +
    "(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\.\\\\.|::|\\\\" +
    "d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\",\"g\"),Ba=/" +
    "^\\s/;function A(a,b){return a.b[a.a+(b||0)]}function B(a){return a" +
    ".b[a.a++]}function Ca(a){return a.b.length<=a.a};/*\n\n The MIT Lice" +
    "nse\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Goo" +
    "gle Inc.\n\n Permission is hereby granted, free of charge, to any pe" +
    "rson obtaining a copy\n of this software and associated documentati" +
    "on files (the \"Software\"), to\n deal in the Software without restri" +
    "ction, including without limitation the\n rights to use, copy, modi" +
    "fy, merge, publish, distribute, sublicense, and/or\n sell copies of" +
    " the Software, and to permit persons to whom the Software is\n furn" +
    "ished to do so, subject to the following conditions:\n\n The above c" +
    "opyright notice and this permission notice shall be included in\n a" +
    "ll copies or substantial portions of the Software.\n\n THE SOFTWARE " +
    "IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMP" +
    "LIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILI" +
    "TY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO E" +
    "VENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLA" +
    "IM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT," +
    " TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH TH" +
    "E SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunct" +
    "ion D(a){var b=null,c=a.nodeType;1==c&&(b=a.textContent,b=void 0==" +
    "b||null==b?a.innerText:b,b=void 0==b||null==b?\"\":b);if(\"string\"!=t" +
    "ypeof b)if(9==c||1==c){a=9==c?a.documentElement:a.firstChild;for(v" +
    "ar c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a.nodeValue),d[c++]=a;w" +
    "hile(a=a.firstChild);for(;c&&!(a=d[--c].nextSibling););}}else b=a." +
    "nodeValue;return\"\"+b}\nfunction E(a,b,c){if(null===b)return!0;try{i" +
    "f(!a.getAttribute)return!1}catch(d){return!1}return null==c?!!a.ge" +
    "tAttribute(b):a.getAttribute(b,2)==c}function F(a,b,c,d,e){return " +
    "Da.call(null,a,b,m(c)?c:null,m(d)?d:null,e||new G)}\nfunction Da(a," +
    "b,c,d,e){b.getElementsByName&&d&&\"name\"==c?(b=b.getElementsByName(" +
    "d),v(b,function(b){a.a(b)&&H(e,b)})):b.getElementsByClassName&&d&&" +
    "\"class\"==c?(b=b.getElementsByClassName(d),v(b,function(b){b.classN" +
    "ame==d&&a.a(b)&&H(e,b)})):a instanceof I?Ea(a,b,c,d,e):b.getElemen" +
    "tsByTagName&&(b=b.getElementsByTagName(a.f()),v(b,function(a){E(a," +
    "c,d)&&H(e,a)}));return e}function Fa(a,b,c,d,e){for(b=b.firstChild" +
    ";b;b=b.nextSibling)E(b,c,d)&&a.a(b)&&H(e,b);return e}\nfunction Ea(" +
    "a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)E(b,c,d)&&a.a(b)&&" +
    "H(e,b),Ea(a,b,c,d,e)};/*\n\n The MIT License\n\n Copyright (c) 2007 Cy" +
    "bozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is he" +
    "reby granted, free of charge, to any person obtaining a copy\n of t" +
    "his software and associated documentation files (the \"Software\"), " +
    "to\n deal in the Software without restriction, including without li" +
    "mitation the\n rights to use, copy, modify, merge, publish, distrib" +
    "ute, sublicense, and/or\n sell copies of the Software, and to permi" +
    "t persons to whom the Software is\n furnished to do so, subject to " +
    "the following conditions:\n\n The above copyright notice and this pe" +
    "rmission notice shall be included in\n all copies or substantial po" +
    "rtions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOU" +
    "T WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIM" +
    "ITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICUL" +
    "AR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR " +
    "COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABI" +
    "LITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING" +
    "\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OT" +
    "HER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction G(){this.b=this.a=null;" +
    "this.l=0}function Ga(a){this.node=a;this.a=this.b=null}function Ha" +
    "(a,b){if(!a.a)return b;if(!b.a)return a;for(var c=a.a,d=b.a,e=null" +
    ",f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):0<ra(c.node,d.n" +
    "ode)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=f,g++;for(f=c||" +
    "d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.l=g;return a}function Ia(a,b)" +
    "{var c=new Ga(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=c;a.l++}functio" +
    "n H(a,b){var c=new Ga(b);c.b=a.b;a.a?a.b.a=c:a.a=a.b=c;a.b=c;a.l++" +
    "}\nfunction Ja(a){return(a=a.a)?a.node:null}function Ka(a){return(a" +
    "=Ja(a))?D(a):\"\"}function J(a,b){return new La(a,!!b)}function La(a" +
    ",b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=null}function K(a){v" +
    "ar b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c?b.b:b.a;return" +
    " c.node};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, In" +
    "c.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted," +
    " free of charge, to any person obtaining a copy\n of this software " +
    "and associated documentation files (the \"Software\"), to\n deal in t" +
    "he Software without restriction, including without limitation the\n" +
    " rights to use, copy, modify, merge, publish, distribute, sublicen" +
    "se, and/or\n sell copies of the Software, and to permit persons to " +
    "whom the Software is\n furnished to do so, subject to the following" +
    " conditions:\n\n The above copyright notice and this permission noti" +
    "ce shall be included in\n all copies or substantial portions of the" +
    " Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF" +
    " ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE W" +
    "ARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AN" +
    "D NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOL" +
    "DERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER" +
    " IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT O" +
    "F OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n" +
    " IN THE SOFTWARE.\n*/\nfunction Ma(a){switch(a.nodeType){case 1:retu" +
    "rn ea(Na,a);case 9:return Ma(a.documentElement);case 11:case 10:ca" +
    "se 6:case 12:return Oa;default:return a.parentNode?Ma(a.parentNode" +
    "):Oa}}function Oa(){return null}function Na(a,b){if(a.prefix==b)re" +
    "turn a.namespaceURI||\"http://www.w3.org/1999/xhtml\";var c=a.getAtt" +
    "ributeNode(\"xmlns:\"+b);return c&&c.specified?c.value||null:a.paren" +
    "tNode&&9!=a.parentNode.nodeType?Na(a.parentNode,b):null};/*\n\n The " +
    "MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) " +
    "2012 Google Inc.\n\n Permission is hereby granted, free of charge, t" +
    "o any person obtaining a copy\n of this software and associated doc" +
    "umentation files (the \"Software\"), to\n deal in the Software withou" +
    "t restriction, including without limitation the\n rights to use, co" +
    "py, modify, merge, publish, distribute, sublicense, and/or\n sell c" +
    "opies of the Software, and to permit persons to whom the Software " +
    "is\n furnished to do so, subject to the following conditions:\n\n The" +
    " above copyright notice and this permission notice shall be includ" +
    "ed in\n all copies or substantial portions of the Software.\n\n THE S" +
    "OFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS" +
    " OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCH" +
    "ANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT." +
    " IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR" +
    " ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF C" +
    "ONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION" +
    " WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n" +
    "*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Co" +
    "pyright (c) 2012 Google Inc.\n\n Permission is hereby granted, free " +
    "of charge, to any person obtaining a copy\n of this software and as" +
    "sociated documentation files (the \"Software\"), to\n deal in the Sof" +
    "tware without restriction, including without limitation the\n right" +
    "s to use, copy, modify, merge, publish, distribute, sublicense, an" +
    "d/or\n sell copies of the Software, and to permit persons to whom t" +
    "he Software is\n furnished to do so, subject to the following condi" +
    "tions:\n\n The above copyright notice and this permission notice sha" +
    "ll be included in\n all copies or substantial portions of the Softw" +
    "are.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY K" +
    "IND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANT" +
    "IES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONI" +
    "NFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS B" +
    "E LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN" +
    " ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR I" +
    "N CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN TH" +
    "E SOFTWARE.\n*/\nfunction L(a){this.i=a;this.b=this.g=!1;this.f=null" +
    "}function M(a){return\"\\n  \"+a.toString().split(\"\\n\").join(\"\\n  \")}" +
    "function Pa(a,b){a.g=b}function Qa(a,b){a.b=b}function N(a,b){var " +
    "c=a.a(b);return c instanceof G?+Ka(c):+c}function O(a,b){var c=a.a" +
    "(b);return c instanceof G?Ka(c):\"\"+c}function P(a,b){var c=a.a(b);" +
    "return c instanceof G?!!c.l:!!c};/*\n\n The MIT License\n\n Copyright " +
    "(c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permi" +
    "ssion is hereby granted, free of charge, to any person obtaining a" +
    " copy\n of this software and associated documentation files (the \"S" +
    "oftware\"), to\n deal in the Software without restriction, including" +
    " without limitation the\n rights to use, copy, modify, merge, publi" +
    "sh, distribute, sublicense, and/or\n sell copies of the Software, a" +
    "nd to permit persons to whom the Software is\n furnished to do so, " +
    "subject to the following conditions:\n\n The above copyright notice " +
    "and this permission notice shall be included in\n all copies or sub" +
    "stantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS " +
    "IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING " +
    "BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR" +
    " A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n " +
    "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR O" +
    "THER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWI" +
    "SE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR TH" +
    "E USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Q(a,b,c){L.c" +
    "all(this,a.i);this.c=a;this.h=b;this.o=c;this.g=b.g||c.g;this.b=b." +
    "b||c.b;this.c==Ra&&(c.b||c.g||4==c.i||0==c.i||!b.f?b.b||b.g||4==b." +
    "i||0==b.i||!c.f||(this.f={name:c.f.name,s:b}):this.f={name:b.f.nam" +
    "e,s:c})}r(Q,L);\nfunction R(a,b,c,d,e){b=b.a(d);c=c.a(d);var f;if(b" +
    " instanceof G&&c instanceof G){e=J(b);for(d=K(e);d;d=K(e))for(b=J(" +
    "c),f=K(b);f;f=K(b))if(a(D(d),D(f)))return!0;return!1}if(b instance" +
    "of G||c instanceof G){b instanceof G?e=b:(e=c,c=b);e=J(e);b=typeof" +
    " c;for(d=K(e);d;d=K(e)){switch(b){case \"number\":d=+D(d);break;case" +
    " \"boolean\":d=!!D(d);break;case \"string\":d=D(d);break;default:throw" +
    " Error(\"Illegal primitive type for comparison.\");}if(a(d,c))return" +
    "!0}return!1}return e?\"boolean\"==typeof b||\"boolean\"==typeof c?\na(!" +
    "!b,!!c):\"number\"==typeof b||\"number\"==typeof c?a(+b,+c):a(b,c):a(+" +
    "b,+c)}Q.prototype.a=function(a){return this.c.m(this.h,this.o,a)};" +
    "Q.prototype.toString=function(){var a=\"Binary Expression: \"+this.c" +
    ",a=a+M(this.h);return a+=M(this.o)};function Sa(a,b,c,d){this.a=a;" +
    "this.w=b;this.i=c;this.m=d}Sa.prototype.toString=h(\"a\");var Ta={};" +
    "function S(a,b,c,d){if(Ta.hasOwnProperty(a))throw Error(\"Binary op" +
    "erator already created: \"+a);a=new Sa(a,b,c,d);return Ta[a.toStrin" +
    "g()]=a}\nS(\"div\",6,1,function(a,b,c){return N(a,c)/N(b,c)});S(\"mod\"" +
    ",6,1,function(a,b,c){return N(a,c)%N(b,c)});S(\"*\",6,1,function(a,b" +
    ",c){return N(a,c)*N(b,c)});S(\"+\",5,1,function(a,b,c){return N(a,c)" +
    "+N(b,c)});S(\"-\",5,1,function(a,b,c){return N(a,c)-N(b,c)});S(\"<\",4" +
    ",2,function(a,b,c){return R(function(a,b){return a<b},a,b,c)});S(\"" +
    ">\",4,2,function(a,b,c){return R(function(a,b){return a>b},a,b,c)})" +
    ";S(\"<=\",4,2,function(a,b,c){return R(function(a,b){return a<=b},a," +
    "b,c)});\nS(\">=\",4,2,function(a,b,c){return R(function(a,b){return a" +
    ">=b},a,b,c)});var Ra=S(\"=\",3,2,function(a,b,c){return R(function(a" +
    ",b){return a==b},a,b,c,!0)});S(\"!=\",3,2,function(a,b,c){return R(f" +
    "unction(a,b){return a!=b},a,b,c,!0)});S(\"and\",2,2,function(a,b,c){" +
    "return P(a,c)&&P(b,c)});S(\"or\",1,2,function(a,b,c){return P(a,c)||" +
    "P(b,c)});/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, In" +
    "c.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted," +
    " free of charge, to any person obtaining a copy\n of this software " +
    "and associated documentation files (the \"Software\"), to\n deal in t" +
    "he Software without restriction, including without limitation the\n" +
    " rights to use, copy, modify, merge, publish, distribute, sublicen" +
    "se, and/or\n sell copies of the Software, and to permit persons to " +
    "whom the Software is\n furnished to do so, subject to the following" +
    " conditions:\n\n The above copyright notice and this permission noti" +
    "ce shall be included in\n all copies or substantial portions of the" +
    " Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF" +
    " ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE W" +
    "ARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AN" +
    "D NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOL" +
    "DERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER" +
    " IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT O" +
    "F OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n" +
    " IN THE SOFTWARE.\n*/\nfunction Ua(a,b){if(b.a.length&&4!=a.i)throw " +
    "Error(\"Primary expression must evaluate to nodeset if filter has p" +
    "redicate(s).\");L.call(this,a.i);this.c=a;this.h=b;this.g=a.g;this." +
    "b=a.b}r(Ua,L);Ua.prototype.a=function(a){a=this.c.a(a);return Va(t" +
    "his.h,a)};Ua.prototype.toString=function(){var a;a=\"Filter:\"+M(thi" +
    "s.c);return a+=M(this.h)};/*\n\n The MIT License\n\n Copyright (c) 200" +
    "7 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission i" +
    "s hereby granted, free of charge, to any person obtaining a copy\n " +
    "of this software and associated documentation files (the \"Software" +
    "\"), to\n deal in the Software without restriction, including withou" +
    "t limitation the\n rights to use, copy, modify, merge, publish, dis" +
    "tribute, sublicense, and/or\n sell copies of the Software, and to p" +
    "ermit persons to whom the Software is\n furnished to do so, subject" +
    " to the following conditions:\n\n The above copyright notice and thi" +
    "s permission notice shall be included in\n all copies or substantia" +
    "l portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WI" +
    "THOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT" +
    " LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PART" +
    "ICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS" +
    " OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n L" +
    "IABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARI" +
    "SING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE O" +
    "R OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Wa(a,b){if(b.length" +
    "<a.A)throw Error(\"Function \"+a.j+\" expects at least\"+a.A+\" argumen" +
    "ts, \"+b.length+\" given\");if(null!==a.v&&b.length>a.v)throw Error(\"" +
    "Function \"+a.j+\" expects at most \"+a.v+\" arguments, \"+b.length+\" g" +
    "iven\");a.B&&v(b,function(b,d){if(4!=b.i)throw Error(\"Argument \"+d+" +
    "\" to function \"+a.j+\" is not of type Nodeset: \"+b);});L.call(this," +
    "a.i);this.h=a;this.c=b;Pa(this,a.g||y(b,function(a){return a.g}));" +
    "Qa(this,a.D&&!b.length||a.C&&!!b.length||y(b,function(a){return a." +
    "b}))}r(Wa,L);\nWa.prototype.a=function(a){return this.h.m.apply(nul" +
    "l,ka(a,this.c))};Wa.prototype.toString=function(){var a=\"Function:" +
    " \"+this.h;if(this.c.length)var b=x(this.c,function(a,b){return a+M" +
    "(b)},\"Arguments:\"),a=a+M(b);return a};function Xa(a,b,c,d,e,f,g,w," +
    "p){this.j=a;this.i=b;this.g=c;this.D=d;this.C=e;this.m=f;this.A=g;" +
    "this.v=void 0!==w?w:g;this.B=!!p}Xa.prototype.toString=h(\"j\");var " +
    "Ya={};\nfunction T(a,b,c,d,e,f,g,w){if(Ya.hasOwnProperty(a))throw E" +
    "rror(\"Function already created: \"+a+\".\");Ya[a]=new Xa(a,b,c,d,!1,e" +
    ",f,g,w)}T(\"boolean\",2,!1,!1,function(a,b){return P(b,a)},1);T(\"cei" +
    "ling\",1,!1,!1,function(a,b){return Math.ceil(N(b,a))},1);T(\"concat" +
    "\",3,!1,!1,function(a,b){var c=la(arguments,1);return x(c,function(" +
    "b,c){return b+O(c,a)},\"\")},2,null);T(\"contains\",2,!1,!1,function(a" +
    ",b,c){b=O(b,a);a=O(c,a);return-1!=b.indexOf(a)},2);T(\"count\",1,!1," +
    "!1,function(a,b){return b.a(a).l},1,1,!0);\nT(\"false\",2,!1,!1,k(!1)" +
    ",0);T(\"floor\",1,!1,!1,function(a,b){return Math.floor(N(b,a))},1);" +
    "T(\"id\",4,!1,!1,function(a,b){var c=a.a,d=9==c.nodeType?c:c.ownerDo" +
    "cument,c=O(b,a).split(/\\s+/),e=[];v(c,function(a){a=d.getElementBy" +
    "Id(a);var b;if(!(b=!a)){a:if(m(e))b=m(a)&&1==a.length?e.indexOf(a," +
    "0):-1;else{for(b=0;b<e.length;b++)if(b in e&&e[b]===a)break a;b=-1" +
    "}b=0<=b}b||e.push(a)});e.sort(ra);var f=new G;v(e,function(a){H(f," +
    "a)});return f},1);T(\"lang\",2,!1,!1,k(!1),1);\nT(\"last\",1,!0,!1,func" +
    "tion(a){if(1!=arguments.length)throw Error(\"Function last expects "
  )
      .append(
    "()\");return a.f},0);T(\"local-name\",3,!1,!0,function(a,b){var c=b?J" +
    "a(b.a(a)):a.a;return c?c.localName||c.nodeName.toLowerCase():\"\"},0" +
    ",1,!0);T(\"name\",3,!1,!0,function(a,b){var c=b?Ja(b.a(a)):a.a;retur" +
    "n c?c.nodeName.toLowerCase():\"\"},0,1,!0);T(\"namespace-uri\",3,!0,!1" +
    ",k(\"\"),0,1,!0);T(\"normalize-space\",3,!1,!0,function(a,b){return(b?" +
    "O(b,a):D(a.a)).replace(/[\\s\\xa0]+/g,\" \").replace(/^\\s+|\\s+$/g,\"\")}" +
    ",0,1);\nT(\"not\",2,!1,!1,function(a,b){return!P(b,a)},1);T(\"number\"," +
    "1,!1,!0,function(a,b){return b?N(b,a):+D(a.a)},0,1);T(\"position\",1" +
    ",!0,!1,function(a){return a.b},0);T(\"round\",1,!1,!1,function(a,b){" +
    "return Math.round(N(b,a))},1);T(\"starts-with\",2,!1,!1,function(a,b" +
    ",c){b=O(b,a);a=O(c,a);return 0==b.lastIndexOf(a,0)},2);T(\"string\"," +
    "3,!1,!0,function(a,b){return b?O(b,a):D(a.a)},0,1);T(\"string-lengt" +
    "h\",1,!1,!0,function(a,b){return(b?O(b,a):D(a.a)).length},0,1);\nT(\"" +
    "substring\",3,!1,!1,function(a,b,c,d){c=N(c,a);if(isNaN(c)||Infinit" +
    "y==c||-Infinity==c)return\"\";d=d?N(d,a):Infinity;if(isNaN(d)||-Infi" +
    "nity===d)return\"\";c=Math.round(c)-1;var e=Math.max(c,0);a=O(b,a);i" +
    "f(Infinity==d)return a.substring(e);b=Math.round(d);return a.subst" +
    "ring(e,c+b)},2,3);T(\"substring-after\",3,!1,!1,function(a,b,c){b=O(" +
    "b,a);a=O(c,a);c=b.indexOf(a);return-1==c?\"\":b.substring(c+a.length" +
    ")},2);\nT(\"substring-before\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c" +
    ",a);a=b.indexOf(a);return-1==a?\"\":b.substring(0,a)},2);T(\"sum\",1,!" +
    "1,!1,function(a,b){for(var c=J(b.a(a)),d=0,e=K(c);e;e=K(c))d+=+D(e" +
    ");return d},1,1,!0);T(\"translate\",3,!1,!1,function(a,b,c,d){b=O(b," +
    "a);c=O(c,a);var e=O(d,a);a=[];for(d=0;d<c.length;d++){var f=c.char" +
    "At(d);f in a||(a[f]=e.charAt(d))}c=\"\";for(d=0;d<b.length;d++)f=b.c" +
    "harAt(d),c+=f in a?a[f]:f;return c},3);T(\"true\",2,!1,!1,k(!0),0);/" +
    "*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyri" +
    "ght (c) 2012 Google Inc.\n\n Permission is hereby granted, free of c" +
    "harge, to any person obtaining a copy\n of this software and associ" +
    "ated documentation files (the \"Software\"), to\n deal in the Softwar" +
    "e without restriction, including without limitation the\n rights to" +
    " use, copy, modify, merge, publish, distribute, sublicense, and/or" +
    "\n sell copies of the Software, and to permit persons to whom the S" +
    "oftware is\n furnished to do so, subject to the following condition" +
    "s:\n\n The above copyright notice and this permission notice shall b" +
    "e included in\n all copies or substantial portions of the Software." +
    "\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND," +
    " EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES " +
    "OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRI" +
    "NGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LI" +
    "ABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACT" +
    "ION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CO" +
    "NNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SO" +
    "FTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, " +
    "Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby grante" +
    "d, free of charge, to any person obtaining a copy\n of this softwar" +
    "e and associated documentation files (the \"Software\"), to\n deal in" +
    " the Software without restriction, including without limitation th" +
    "e\n rights to use, copy, modify, merge, publish, distribute, sublic" +
    "ense, and/or\n sell copies of the Software, and to permit persons t" +
    "o whom the Software is\n furnished to do so, subject to the followi" +
    "ng conditions:\n\n The above copyright notice and this permission no" +
    "tice shall be included in\n all copies or substantial portions of t" +
    "he Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY " +
    "OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE" +
    " WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE " +
    "AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT H" +
    "OLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETH" +
    "ER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT" +
    " OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALING" +
    "S\n IN THE SOFTWARE.\n*/\nfunction I(a,b){this.h=a;this.c=void 0!==b?" +
    "b:null;this.b=null;switch(a){case \"comment\":this.b=8;break;case \"t" +
    "ext\":this.b=3;break;case \"processing-instruction\":this.b=7;break;c" +
    "ase \"node\":break;default:throw Error(\"Unexpected argument\");}}func" +
    "tion Za(a){return\"comment\"==a||\"text\"==a||\"processing-instruction\"" +
    "==a||\"node\"==a}I.prototype.a=function(a){return null===this.b||thi" +
    "s.b==a.nodeType};I.prototype.f=h(\"h\");I.prototype.toString=functio" +
    "n(){var a=\"Kind Test: \"+this.h;null===this.c||(a+=M(this.c));retur" +
    "n a};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n " +
    "Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted, fre" +
    "e of charge, to any person obtaining a copy\n of this software and " +
    "associated documentation files (the \"Software\"), to\n deal in the S" +
    "oftware without restriction, including without limitation the\n rig" +
    "hts to use, copy, modify, merge, publish, distribute, sublicense, " +
    "and/or\n sell copies of the Software, and to permit persons to whom" +
    " the Software is\n furnished to do so, subject to the following con" +
    "ditions:\n\n The above copyright notice and this permission notice s" +
    "hall be included in\n all copies or substantial portions of the Sof" +
    "tware.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY" +
    " KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRA" +
    "NTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NO" +
    "NINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS" +
    " BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN " +
    "AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR" +
    " IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN " +
    "THE SOFTWARE.\n*/\nfunction $a(a){L.call(this,3);this.c=a.substring(" +
    "1,a.length-1)}r($a,L);$a.prototype.a=h(\"c\");$a.prototype.toString=" +
    "function(){return\"Literal: \"+this.c};/*\n\n The MIT License\n\n Copyri" +
    "ght (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n P" +
    "ermission is hereby granted, free of charge, to any person obtaini" +
    "ng a copy\n of this software and associated documentation files (th" +
    "e \"Software\"), to\n deal in the Software without restriction, inclu" +
    "ding without limitation the\n rights to use, copy, modify, merge, p" +
    "ublish, distribute, sublicense, and/or\n sell copies of the Softwar" +
    "e, and to permit persons to whom the Software is\n furnished to do " +
    "so, subject to the following conditions:\n\n The above copyright not" +
    "ice and this permission notice shall be included in\n all copies or" +
    " substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED " +
    "\"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUD" +
    "ING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS" +
    " FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL T" +
    "HE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES " +
    "OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTH" +
    "ERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE O" +
    "R THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction U(a,b){t" +
    "his.j=a.toLowerCase();this.b=b?b.toLowerCase():\"http://www.w3.org/" +
    "1999/xhtml\"}U.prototype.a=function(a){var b=a.nodeType;return 1!=b" +
    "&&2!=b?!1:\"*\"!=this.j&&this.j!=a.nodeName.toLowerCase()?!1:this.b=" +
    "=(a.namespaceURI?a.namespaceURI.toLowerCase():\"http://www.w3.org/1" +
    "999/xhtml\")};U.prototype.f=h(\"j\");U.prototype.toString=function(){" +
    "return\"Name Test: \"+(\"http://www.w3.org/1999/xhtml\"==this.b?\"\":thi" +
    "s.b+\":\")+this.j};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu " +
    "Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby " +
    "granted, free of charge, to any person obtaining a copy\n of this s" +
    "oftware and associated documentation files (the \"Software\"), to\n d" +
    "eal in the Software without restriction, including without limitat" +
    "ion the\n rights to use, copy, modify, merge, publish, distribute, " +
    "sublicense, and/or\n sell copies of the Software, and to permit per" +
    "sons to whom the Software is\n furnished to do so, subject to the f" +
    "ollowing conditions:\n\n The above copyright notice and this permiss" +
    "ion notice shall be included in\n all copies or substantial portion" +
    "s of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WAR" +
    "RANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED " +
    "TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PU" +
    "RPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYR" +
    "IGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY," +
    " WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FRO" +
    "M, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER D" +
    "EALINGS\n IN THE SOFTWARE.\n*/\nfunction ab(a){L.call(this,1);this.c=" +
    "a}r(ab,L);ab.prototype.a=h(\"c\");ab.prototype.toString=function(){r" +
    "eturn\"Number: \"+this.c};/*\n\n The MIT License\n\n Copyright (c) 2007 " +
    "Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is " +
    "hereby granted, free of charge, to any person obtaining a copy\n of" +
    " this software and associated documentation files (the \"Software\")" +
    ", to\n deal in the Software without restriction, including without " +
    "limitation the\n rights to use, copy, modify, merge, publish, distr" +
    "ibute, sublicense, and/or\n sell copies of the Software, and to per" +
    "mit persons to whom the Software is\n furnished to do so, subject t" +
    "o the following conditions:\n\n The above copyright notice and this " +
    "permission notice shall be included in\n all copies or substantial " +
    "portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITH" +
    "OUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT L" +
    "IMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTIC" +
    "ULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS O" +
    "R COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIA" +
    "BILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISI" +
    "NG\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR " +
    "OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction bb(a,b){L.call(this,a" +
    ".i);this.h=a;this.c=b;this.g=a.g;this.b=a.b;if(1==this.c.length){v" +
    "ar c=this.c[0];c.u||c.c!=cb||(c=c.o,\"*\"!=c.f()&&(this.f={name:c.f(" +
    "),s:null}))}}r(bb,L);function V(){L.call(this,4)}r(V,L);V.prototyp" +
    "e.a=function(a){var b=new G;a=a.a;9==a.nodeType?H(b,a):H(b,a.owner" +
    "Document);return b};V.prototype.toString=k(\"Root Helper Expression" +
    "\");function db(){L.call(this,4)}r(db,L);db.prototype.a=function(a)" +
    "{var b=new G;H(b,a.a);return b};db.prototype.toString=k(\"Context H" +
    "elper Expression\");\nfunction eb(a){return\"/\"==a||\"//\"==a}bb.protot" +
    "ype.a=function(a){var b=this.h.a(a);if(!(b instanceof G))throw Err" +
    "or(\"Filter expression must evaluate to nodeset.\");a=this.c;for(var" +
    " c=0,d=a.length;c<d&&b.l;c++){var e=a[c],f=J(b,e.c.a),g;if(e.g||e." +
    "c!=fb)if(e.g||e.c!=gb)for(g=K(f),b=e.a(new z(g));null!=(g=K(f));)g" +
    "=e.a(new z(g)),b=Ha(b,g);else g=K(f),b=e.a(new z(g));else{for(g=K(" +
    "f);(b=K(f))&&(!g.contains||g.contains(b))&&b.compareDocumentPositi" +
    "on(g)&8;g=b);b=e.a(new z(g))}}return b};\nbb.prototype.toString=fun" +
    "ction(){var a;a=\"Path Expression:\"+M(this.h);if(this.c.length){var" +
    " b=x(this.c,function(a,b){return a+M(b)},\"Steps:\");a+=M(b)}return " +
    "a};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Co" +
    "pyright (c) 2012 Google Inc.\n\n Permission is hereby granted, free " +
    "of charge, to any person obtaining a copy\n of this software and as" +
    "sociated documentation files (the \"Software\"), to\n deal in the Sof" +
    "tware without restriction, including without limitation the\n right" +
    "s to use, copy, modify, merge, publish, distribute, sublicense, an" +
    "d/or\n sell copies of the Software, and to permit persons to whom t" +
    "he Software is\n furnished to do so, subject to the following condi" +
    "tions:\n\n The above copyright notice and this permission notice sha" +
    "ll be included in\n all copies or substantial portions of the Softw" +
    "are.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY K" +
    "IND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANT" +
    "IES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONI" +
    "NFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS B" +
    "E LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN" +
    " ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR I" +
    "N CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN TH" +
    "E SOFTWARE.\n*/\nfunction hb(a,b){this.a=a;this.b=!!b}\nfunction Va(a" +
    ",b,c){for(c=c||0;c<a.a.length;c++)for(var d=a.a[c],e=J(b),f=b.l,g," +
    "w=0;g=K(e);w++){var p=a.b?f-w:w+1;g=d.a(new z(g,p,f));if(\"number\"=" +
    "=typeof g)p=p==g;else if(\"string\"==typeof g||\"boolean\"==typeof g)p" +
    "=!!g;else if(g instanceof G)p=0<g.l;else throw Error(\"Predicate.ev" +
    "aluate returned an unexpected type.\");if(!p){p=e;g=p.f;var q=p.a;i" +
    "f(!q)throw Error(\"Next must be called at least once before remove." +
    "\");var C=q.b,q=q.a;C?C.a=q:g.a=q;q?q.b=C:g.b=C;g.l--;p.a=null}}ret" +
    "urn b}\nhb.prototype.toString=function(){return x(this.a,function(a" +
    ",b){return a+M(b)},\"Predicates:\")};/*\n\n The MIT License\n\n Copyrigh" +
    "t (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Per" +
    "mission is hereby granted, free of charge, to any person obtaining" +
    " a copy\n of this software and associated documentation files (the " +
    "\"Software\"), to\n deal in the Software without restriction, includi" +
    "ng without limitation the\n rights to use, copy, modify, merge, pub" +
    "lish, distribute, sublicense, and/or\n sell copies of the Software," +
    " and to permit persons to whom the Software is\n furnished to do so" +
    ", subject to the following conditions:\n\n The above copyright notic" +
    "e and this permission notice shall be included in\n all copies or s" +
    "ubstantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"A" +
    "S IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDIN" +
    "G BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS F" +
    "OR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE" +
    "\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR" +
    " OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHER" +
    "WISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR " +
    "THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction W(a,b,c,d)" +
    "{L.call(this,4);this.c=a;this.o=b;this.h=c||new hb([]);this.u=!!d;" +
    "b=this.h;b=0<b.a.length?b.a[0].f:null;a.b&&b&&(this.f={name:b.name" +
    ",s:b.s});a:{a=this.h;for(b=0;b<a.a.length;b++)if(c=a.a[b],c.g||1==" +
    "c.i||0==c.i){a=!0;break a}a=!1}this.g=a}r(W,L);\nW.prototype.a=func" +
    "tion(a){var b=a.a,c=null,c=this.f,d=null,e=null,f=0;c&&(d=c.name,e" +
    "=c.s?O(c.s,a):null,f=1);if(this.u)if(this.g||this.c!=ib)if(a=J((ne" +
    "w W(jb,new I(\"node\"))).a(a)),b=K(a))for(c=this.m(b,d,e,f);null!=(b" +
    "=K(a));)c=Ha(c,this.m(b,d,e,f));else c=new G;else c=F(this.o,b,d,e" +
    "),c=Va(this.h,c,f);else c=this.m(a.a,d,e,f);return c};W.prototype." +
    "m=function(a,b,c,d){a=this.c.f(this.o,a,b,c);return a=Va(this.h,a," +
    "d)};\nW.prototype.toString=function(){var a;a=\"Step:\"+M(\"Operator: " +
    "\"+(this.u?\"//\":\"/\"));this.c.j&&(a+=M(\"Axis: \"+this.c));a+=M(this.o" +
    ");if(this.h.a.length){var b=x(this.h.a,function(a,b){return a+M(b)" +
    "},\"Predicates:\");a+=M(b)}return a};function kb(a,b,c,d){this.j=a;t" +
    "his.f=b;this.a=c;this.b=d}kb.prototype.toString=h(\"j\");var lb={};f" +
    "unction X(a,b,c,d){if(lb.hasOwnProperty(a))throw Error(\"Axis alrea" +
    "dy created: \"+a);b=new kb(a,b,c,!!d);return lb[a]=b}\nX(\"ancestor\"," +
    "function(a,b){for(var c=new G,d=b;d=d.parentNode;)a.a(d)&&Ia(c,d);" +
    "return c},!0);X(\"ancestor-or-self\",function(a,b){var c=new G,d=b;d" +
    "o a.a(d)&&Ia(c,d);while(d=d.parentNode);return c},!0);var cb=X(\"at" +
    "tribute\",function(a,b){var c=new G,d=a.f(),e=b.attributes;if(e)if(" +
    "a instanceof I&&null===a.b||\"*\"==d)for(var d=0,f;f=e[d];d++)H(c,f)" +
    ";else(f=e.getNamedItem(d))&&H(c,f);return c},!1),ib=X(\"child\",func" +
    "tion(a,b,c,d,e){return Fa.call(null,a,b,m(c)?c:null,m(d)?d:null,e|" +
    "|new G)},!1,!0);\nX(\"descendant\",F,!1,!0);var jb=X(\"descendant-or-s" +
    "elf\",function(a,b,c,d){var e=new G;E(b,c,d)&&a.a(b)&&H(e,b);return" +
    " F(a,b,c,d,e)},!1,!0),fb=X(\"following\",function(a,b,c,d){var e=new" +
    " G;do for(var f=b;f=f.nextSibling;)E(f,c,d)&&a.a(f)&&H(e,f),e=F(a," +
    "f,c,d,e);while(b=b.parentNode);return e},!1,!0);X(\"following-sibli" +
    "ng\",function(a,b){for(var c=new G,d=b;d=d.nextSibling;)a.a(d)&&H(c" +
    ",d);return c},!1);X(\"namespace\",function(){return new G},!1);\nvar " +
    "mb=X(\"parent\",function(a,b){var c=new G;if(9==b.nodeType)return c;" +
    "if(2==b.nodeType)return H(c,b.ownerElement),c;var d=b.parentNode;a" +
    ".a(d)&&H(c,d);return c},!1),gb=X(\"preceding\",function(a,b,c,d){var" +
    " e=new G,f=[];do f.unshift(b);while(b=b.parentNode);for(var g=1,w=" +
    "f.length;g<w;g++){var p=[];for(b=f[g];b=b.previousSibling;)p.unshi" +
    "ft(b);for(var q=0,C=p.length;q<C;q++)b=p[q],E(b,c,d)&&a.a(b)&&H(e," +
    "b),e=F(a,b,c,d,e)}return e},!0,!0);\nX(\"preceding-sibling\",function" +
    "(a,b){for(var c=new G,d=b;d=d.previousSibling;)a.a(d)&&Ia(c,d);ret" +
    "urn c},!0);var nb=X(\"self\",function(a,b){var c=new G;a.a(b)&&H(c,b" +
    ");return c},!1);/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu L" +
    "abs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby g" +
    "ranted, free of charge, to any person obtaining a copy\n of this so" +
    "ftware and associated documentation files (the \"Software\"), to\n de" +
    "al in the Software without restriction, including without limitati" +
    "on the\n rights to use, copy, modify, merge, publish, distribute, s" +
    "ublicense, and/or\n sell copies of the Software, and to permit pers" +
    "ons to whom the Software is\n furnished to do so, subject to the fo" +
    "llowing conditions:\n\n The above copyright notice and this permissi" +
    "on notice shall be included in\n all copies or substantial portions" +
    " of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARR" +
    "ANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED T" +
    "O THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PUR" +
    "POSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRI" +
    "GHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, " +
    "WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM" +
    ", OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DE" +
    "ALINGS\n IN THE SOFTWARE.\n*/\nfunction ob(a){L.call(this,1);this.c=a" +
    ";this.g=a.g;this.b=a.b}r(ob,L);ob.prototype.a=function(a){return-N" +
    "(this.c,a)};ob.prototype.toString=function(){return\"Unary Expressi" +
    "on: -\"+M(this.c)};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu" +
    " Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby" +
    " granted, free of charge, to any person obtaining a copy\n of this " +
    "software and associated documentation files (the \"Software\"), to\n " +
    "deal in the Software without restriction, including without limita" +
    "tion the\n rights to use, copy, modify, merge, publish, distribute," +
    " sublicense, and/or\n sell copies of the Software, and to permit pe" +
    "rsons to whom the Software is\n furnished to do so, subject to the " +
    "following conditions:\n\n The above copyright notice and this permis" +
    "sion notice shall be included in\n all copies or substantial portio" +
    "ns of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WA" +
    "RRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED" +
    " TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR P" +
    "URPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPY" +
    "RIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY" +
    ", WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FR" +
    "OM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER " +
    "DEALINGS\n IN THE SOFTWARE.\n*/\nfunction pb(a){L.call(this,4);this.c" +
    "=a;Pa(this,y(this.c,function(a){return a.g}));Qa(this,y(this.c,fun" +
    "ction(a){return a.b}))}r(pb,L);pb.prototype.a=function(a){var b=ne" +
    "w G;v(this.c,function(c){c=c.a(a);if(!(c instanceof G))throw Error" +
    "(\"Path expression must evaluate to NodeSet.\");b=Ha(b,c)});return b" +
    "};pb.prototype.toString=function(){return x(this.c,function(a,b){r" +
    "eturn a+M(b)},\"Union Expression:\")};/*\n\n The MIT License\n\n Copyrig" +
    "ht (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Pe" +
    "rmission is hereby granted, free of charge, to any person obtainin" +
    "g a copy\n of this software and associated documentation files (the" +
    " \"Software\"), to\n deal in the Software without restriction, includ" +
    "ing without limitation the\n rights to use, copy, modify, merge, pu" +
    "blish, distribute, sublicense, and/or\n sell copies of the Software" +
    ", and to permit persons to whom the Software is\n furnished to do s" +
    "o, subject to the following conditions:\n\n The above copyright noti" +
    "ce and this permission notice shall be included in\n all copies or " +
    "substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"" +
    "AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDI" +
    "NG BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS " +
    "FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL TH" +
    "E\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES O" +
    "R OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHE" +
    "RWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR" +
    " THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction qb(a,b){t" +
    "his.a=a;this.b=b}function rb(a){for(var b,c=[];;){Y(a,\"Missing rig" +
    "ht hand side of binary expression.\");b=sb(a);var d=B(a.a);if(!d)br" +
    "eak;var e=(d=Ta[d]||null)&&d.w;if(!e){a.a.a--;break}for(;c.length&" +
    "&e<=c[c.length-1].w;)b=new Q(c.pop(),c.pop(),b);c.push(b,d)}for(;c" +
    ".length;)b=new Q(c.pop(),c.pop(),b);return b}function Y(a,b){if(Ca" +
    "(a.a))throw Error(b);}function tb(a,b){var c=B(a.a);if(c!=b)throw " +
    "Error(\"Bad token, expected: \"+b+\" got: \"+c);}\nfunction ub(a){a=B(a" +
    ".a);if(\")\"!=a)throw Error(\"Bad token: \"+a);}function vb(a){a=B(a.a" +
    ");if(2>a.length)throw Error(\"Unclosed literal string\");return new " +
    "$a(a)}function wb(a){var b=B(a.a),c=b.indexOf(\":\");if(-1==c)return" +
    " new U(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw Error(\"Names" +
    "pace prefix not declared: \"+d);b=b.substr(c+1);return new U(b,a)}\n" +
    "function xb(a){var b,c=[],d;if(eb(A(a.a))){b=B(a.a);d=A(a.a);if(\"/" +
    "\"==b&&(Ca(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?![0-9])[\\w]/." +
    "test(d)))return new V;d=new V;Y(a,\"Missing next location step.\");b" +
    "=yb(a,b);c.push(b)}else{a:{b=A(a.a);d=b.charAt(0);switch(d){case \"" +
    "$\":throw Error(\"Variable reference not allowed in HTML XPath\");cas" +
    "e \"(\":B(a.a);b=rb(a);Y(a,'unclosed \"(\"');tb(a,\")\");break;case '\"':" +
    "case \"'\":b=vb(a);break;default:if(isNaN(+b))if(!Za(b)&&/(?![0-9])[" +
    "\\w]/.test(d)&&\"(\"==A(a.a,1)){b=B(a.a);b=\nYa[b]||null;B(a.a);for(d=" +
    "[];\")\"!=A(a.a);){Y(a,\"Missing function argument list.\");d.push(rb(" +
    "a));if(\",\"!=A(a.a))break;B(a.a)}Y(a,\"Unclosed function argument li" +
    "st.\");ub(a);b=new Wa(b,d)}else{b=null;break a}else b=new ab(+B(a.a" +
    "))}\"[\"==A(a.a)&&(d=new hb(zb(a)),b=new Ua(b,d))}if(b)if(eb(A(a.a))" +
    ")d=b;else return b;else b=yb(a,\"/\"),d=new db,c.push(b)}for(;eb(A(a" +
    ".a));)b=B(a.a),Y(a,\"Missing next location step.\"),b=yb(a,b),c.push" +
    "(b);return new bb(d,c)}\nfunction yb(a,b){var c,d,e;if(\"/\"!=b&&\"//\"" +
    "!=b)throw Error('Step op should be \"/\" or \"//\"');if(\".\"==A(a.a))re" +
    "turn d=new W(nb,new I(\"node\")),B(a.a),d;if(\"..\"==A(a.a))return d=n" +
    "ew W(mb,new I(\"node\")),B(a.a),d;var f;if(\"@\"==A(a.a))f=cb,B(a.a),Y" +
    "(a,\"Missing attribute name\");else if(\"::\"==A(a.a,1)){if(!/(?![0-9]" +
    ")[\\w]/.test(A(a.a).charAt(0)))throw Error(\"Bad token: \"+B(a.a));c=" +
    "B(a.a);f=lb[c]||null;if(!f)throw Error(\"No axis with name: \"+c);B(" +
    "a.a);Y(a,\"Missing node name\")}else f=ib;c=A(a.a);if(/(?![0-9])[\\w]" +
    "/.test(c.charAt(0)))if(\"(\"==\nA(a.a,1)){if(!Za(c))throw Error(\"Inva" +
    "lid node type: \"+c);c=B(a.a);if(!Za(c))throw Error(\"Invalid type n" +
    "ame: \"+c);tb(a,\"(\");Y(a,\"Bad nodetype\");e=A(a.a).charAt(0);var g=n" +
    "ull;if('\"'==e||\"'\"==e)g=vb(a);Y(a,\"Bad nodetype\");ub(a);c=new I(c," +
    "g)}else c=wb(a);else if(\"*\"==c)c=wb(a);else throw Error(\"Bad token" +
    ": \"+B(a.a));e=new hb(zb(a),f.a);return d||new W(f,c,e,\"//\"==b)}\nfu" +
    "nction zb(a){for(var b=[];\"[\"==A(a.a);){B(a.a);Y(a,\"Missing predic" +
    "ate expression.\");var c=rb(a);b.push(c);Y(a,\"Unclosed predicate ex" +
    "pression.\");tb(a,\"]\")}return b}function sb(a){if(\"-\"==A(a.a))retur" +
    "n B(a.a),new ob(sb(a));var b=xb(a);if(\"|\"!=A(a.a))a=b;else{for(b=[" +
    "b];\"|\"==B(a.a);)Y(a,\"Missing next union location path.\"),b.push(xb" +
    "(a));a.a.a--;a=new pb(b)}return a};/*\n\n The MIT License\n\n Copyrigh" +
    "t (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Per" +
    "mission is hereby granted, free of charge, to any person obtaining" +
    " a copy\n of this software and associated documentation files (the " +
    "\"Software\"), to\n deal in the Software without restriction, includi" +
    "ng without limitation the\n rights to use, copy, modify, merge, pub" +
    "lish, distribute, sublicense, and/or\n sell copies of the Software," +
    " and to permit persons to whom the Software is\n furnished to do so" +
    ", subject to the following conditions:\n\n The above copyright notic" +
    "e and this permission notice shall be included in\n all copies or s" +
    "ubstantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"A" +
    "S IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDIN" +
    "G BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS F" +
    "OR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE" +
    "\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR" +
    " OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHER" +
    "WISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR " +
    "THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Ab(a,b){if" +
    "(!a.length)throw Error(\"Empty XPath expression.\");var c=za(a);if(C" +
    "a(c))throw Error(\"Invalid XPath expression.\");b?\"function\"==ba(b)|" +
    "|(b=n(b.lookupNamespaceURI,b)):b=k(null);var d=rb(new qb(c,b));if(" +
    "!Ca(c))throw Error(\"Bad token: \"+B(c));this.evaluate=function(a,b)" +
    "{var c=d.a(new z(a));return new Z(c,b)}}\nfunction Z(a,b){if(0==b)i" +
    "f(a instanceof G)b=4;else if(\"string\"==typeof a)b=2;else if(\"numbe" +
    "r\"==typeof a)b=1;else if(\"boolean\"==typeof a)b=3;else throw Error(" +
    "\"Unexpected evaluation result.\");if(2!=b&&1!=b&&3!=b&&!(a instance" +
    "of G))throw Error(\"value could not be converted to the specified t" +
    "ype\");this.resultType=b;var c;switch(b){case 2:this.stringValue=a " +
    "instanceof G?Ka(a):\"\"+a;break;case 1:this.numberValue=a instanceof" +
    " G?+Ka(a):+a;break;case 3:this.booleanValue=a instanceof G?0<a.l:!" +
    "!a;break;case 4:case 5:case 6:case 7:var d=\nJ(a);c=[];for(var e=K(" +
    "d);e;e=K(d))c.push(e);this.snapshotLength=a.l;this.invalidIterator" +
    "State=!1;break;case 8:case 9:this.singleNodeValue=Ja(a);break;defa" +
    "ult:throw Error(\"Unknown XPathResult type.\");}var f=0;this.iterate" +
    "Next=function(){if(4!=b&&5!=b)throw Error(\"iterateNext called with" +
    " wrong result type\");return f>=c.length?null:c[f++]};this.snapshot" +
    "Item=function(a){if(6!=b&&7!=b)throw Error(\"snapshotItem called wi" +
    "th wrong result type\");return a>=c.length||0>a?null:c[a]}}Z.ANY_TY" +
    "PE=0;\nZ.NUMBER_TYPE=1;Z.STRING_TYPE=2;Z.BOOLEAN_TYPE=3;Z.UNORDERED" +
    "_NODE_ITERATOR_TYPE=4;Z.ORDERED_NODE_ITERATOR_TYPE=5;Z.UNORDERED_N" +
    "ODE_SNAPSHOT_TYPE=6;Z.ORDERED_NODE_SNAPSHOT_TYPE=7;Z.ANY_UNORDERED" +
    "_NODE_TYPE=8;Z.FIRST_ORDERED_NODE_TYPE=9;function Bb(a){this.looku" +
    "pNamespaceURI=Ma(a)}aa(\"wgxpath.install\",function(a){a=a||l;var b=" +
    "a.document;b.evaluate||(a.XPathResult=Z,b.evaluate=function(a,b,e," +
    "f){return(new Ab(a,e)).evaluate(b,f)},b.createExpression=function("
  )
      .append(
    "a,b){return new Ab(a,b)},b.createNSResolver=function(a){return new" +
    " Bb(a)})});/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_r" +
    "pl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl" +
    "_lic*/\n/*xxx_rpl_lic*/\naa(\"_\",function(){return document.activeEle" +
    "ment||document.body});;return this._.apply(null,arguments);}).appl" +
    "y({navigator:typeof window!=\"undefined\"?window.navigator:null},arg" +
    "uments);}\n"
  )
  .toString();
  static final String ACTIVE_ELEMENT_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String ACTIVE_ELEMENT_ANDROID_original() {
    return ACTIVE_ELEMENT_ANDROID.replaceAll("xxx_rpl_lic", ACTIVE_ELEMENT_ANDROID_license);
  }

/* field: FRAME_BY_ID_OR_NAME_ANDROID license: 

 Copyright 2014 Software Freedom Conservancy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
  static final String FRAME_BY_ID_OR_NAME_ANDROID =
  new StringBuilder(
    "function(){return(function(){function k(a){return function(){retur" +
    "n this[a]}}function n(a){return function(){return a}}var aa=this;f" +
    "unction ba(a,b){var c=a.split(\".\"),d=aa;c[0]in d||!d.execScript||d" +
    ".execScript(\"var \"+c[0]);for(var e;c.length&&(e=c.shift());)c.leng" +
    "th||void 0===b?d[e]?d=d[e]:d=d[e]={}:d[e]=b}\nfunction ca(a){var b=" +
    "typeof a;if(\"object\"==b)if(a){if(a instanceof Array)return\"array\";" +
    "if(a instanceof Object)return b;var c=Object.prototype.toString.ca" +
    "ll(a);if(\"[object Window]\"==c)return\"object\";if(\"[object Array]\"==" +
    "c||\"number\"==typeof a.length&&\"undefined\"!=typeof a.splice&&\"undef" +
    "ined\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"spl" +
    "ice\"))return\"array\";if(\"[object Function]\"==c||\"undefined\"!=typeof" +
    " a.call&&\"undefined\"!=typeof a.propertyIsEnumerable&&!a.propertyIs" +
    "Enumerable(\"call\"))return\"function\"}else return\"null\";\nelse if(\"fu" +
    "nction\"==b&&\"undefined\"==typeof a.call)return\"object\";return b}fun" +
    "ction q(a){return\"string\"==typeof a}function da(a){return\"function" +
    "\"==ca(a)}function ea(a,b,c){return a.call.apply(a.bind,arguments)}" +
    "function fa(a,b,c){if(!a)throw Error();if(2<arguments.length){var " +
    "d=Array.prototype.slice.call(arguments,2);return function(){var c=" +
    "Array.prototype.slice.call(arguments);Array.prototype.unshift.appl" +
    "y(c,d);return a.apply(b,c)}}return function(){return a.apply(b,arg" +
    "uments)}}\nfunction ga(a,b,c){ga=Function.prototype.bind&&-1!=Funct" +
    "ion.prototype.bind.toString().indexOf(\"native code\")?ea:fa;return " +
    "ga.apply(null,arguments)}function ha(a,b){var c=Array.prototype.sl" +
    "ice.call(arguments,1);return function(){var b=c.slice();b.push.app" +
    "ly(b,arguments);return a.apply(this,b)}}\nfunction r(a,b){function " +
    "c(){}c.prototype=b.prototype;a.P=b.prototype;a.prototype=new c;a.p" +
    "rototype.constructor=a;a.O=function(a,c,f){for(var g=Array(argumen" +
    "ts.length-2),h=2;h<arguments.length;h++)g[h-2]=arguments[h];return" +
    " b.prototype[c].apply(a,g)}}Function.prototype.bind=Function.proto" +
    "type.bind||function(a,b){if(1<arguments.length){var c=Array.protot" +
    "ype.slice.call(arguments,1);c.unshift(this,a);return ga.apply(null" +
    ",c)}return ga(this,a)};function ia(a){if(Error.captureStackTrace)E" +
    "rror.captureStackTrace(this,ia);else{var b=Error().stack;b&&(this." +
    "stack=b)}a&&(this.message=String(a))}r(ia,Error);ia.prototype.name" +
    "=\"CustomError\";var ja;function ka(a){var b=a.length-1;return 0<=b&" +
    "&a.indexOf(\" \",b)==b}function la(a,b){for(var c=a.split(\"%s\"),d=\"\"" +
    ",e=Array.prototype.slice.call(arguments,1);e.length&&1<c.length;)d" +
    "+=c.shift()+e.shift();return d+c.join(\"%s\")}var ma=String.prototyp" +
    "e.trim?function(a){return a.trim()}:function(a){return a.replace(/" +
    "^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function na(a,b){return a<b?-1:a>b?1:" +
    "0}function oa(a){return String(a).replace(/\\-([a-z])/g,function(a," +
    "c){return c.toUpperCase()})};function pa(a,b){b.unshift(a);ia.call" +
    "(this,la.apply(null,b));b.shift()}r(pa,ia);pa.prototype.name=\"Asse" +
    "rtionError\";function qa(a,b,c){if(!a){var d=\"Assertion failed\";if(" +
    "b)var d=d+(\": \"+b),e=Array.prototype.slice.call(arguments,2);throw" +
    " new pa(\"\"+d,e||[]);}};var ra=Array.prototype;function sa(a,b){if(" +
    "q(a))return q(b)&&1==b.length?a.indexOf(b,0):-1;for(var c=0;c<a.le" +
    "ngth;c++)if(c in a&&a[c]===b)return c;return-1}function t(a,b){for" +
    "(var c=a.length,d=q(a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.call(vo" +
    "id 0,d[e],e,a)}function ta(a,b){for(var c=a.length,d=[],e=0,f=q(a)" +
    "?a.split(\"\"):a,g=0;g<c;g++)if(g in f){var h=f[g];b.call(void 0,h,g" +
    ",a)&&(d[e++]=h)}return d}function ua(a,b,c){var d=c;t(a,function(c" +
    ",f){d=b.call(void 0,d,c,f,a)});return d}\nfunction va(a,b){for(var " +
    "c=a.length,d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void" +
    " 0,d[e],e,a))return!0;return!1}function wa(a,b){for(var c=a.length" +
    ",d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&!b.call(void 0,d[e],e" +
    ",a))return!1;return!0}function xa(a,b){var c;a:{c=a.length;for(var" +
    " d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e," +
    "a)){c=e;break a}c=-1}return 0>c?null:q(a)?a.charAt(c):a[c]}functio" +
    "n ya(a){return ra.concat.apply(ra,arguments)}\nfunction za(a,b,c){q" +
    "a(null!=a.length);return 2>=arguments.length?ra.slice.call(a,b):ra" +
    ".slice.call(a,b,c)};function Aa(a){var b=arguments.length;if(1==b&" +
    "&\"array\"==ca(arguments[0]))return Aa.apply(null,arguments[0]);for(" +
    "var c={},d=0;d<b;d++)c[arguments[d]]=!0;return c};Aa(\"area base br" +
    " col command embed hr img input keygen link meta param source trac" +
    "k wbr\".split(\" \"));function u(a,b){this.x=void 0!==a?a:0;this.y=vo" +
    "id 0!==b?b:0}u.prototype.clone=function(){return new u(this.x,this" +
    ".y)};u.prototype.toString=function(){return\"(\"+this.x+\", \"+this.y+" +
    "\")\"};u.prototype.ceil=function(){this.x=Math.ceil(this.x);this.y=M" +
    "ath.ceil(this.y);return this};u.prototype.floor=function(){this.x=" +
    "Math.floor(this.x);this.y=Math.floor(this.y);return this};u.protot" +
    "ype.round=function(){this.x=Math.round(this.x);this.y=Math.round(t" +
    "his.y);return this};function v(a,b){this.width=a;this.height=b}v.p" +
    "rototype.clone=function(){return new v(this.width,this.height)};v." +
    "prototype.toString=function(){return\"(\"+this.width+\" x \"+this.heig" +
    "ht+\")\"};v.prototype.ceil=function(){this.width=Math.ceil(this.widt" +
    "h);this.height=Math.ceil(this.height);return this};v.prototype.flo" +
    "or=function(){this.width=Math.floor(this.width);this.height=Math.f" +
    "loor(this.height);return this};\nv.prototype.round=function(){this." +
    "width=Math.round(this.width);this.height=Math.round(this.height);r" +
    "eturn this};var Ba;a:{var Ca=aa.navigator;if(Ca){var Da=Ca.userAge" +
    "nt;if(Da){Ba=Da;break a}}Ba=\"\"};function w(a){return a?new Ea(x(a)" +
    "):ja||(ja=new Ea)}function Fa(a){return a?a.parentWindow||a.defaul" +
    "tView:window}function Ga(a){for(;a&&1!=a.nodeType;)a=a.previousSib" +
    "ling;return a}function Ha(a,b){if(a.contains&&1==b.nodeType)return" +
    " a==b||a.contains(b);if(\"undefined\"!=typeof a.compareDocumentPosit" +
    "ion)return a==b||Boolean(a.compareDocumentPosition(b)&16);for(;b&&" +
    "a!=b;)b=b.parentNode;return b==a}\nfunction Ia(a,b){if(a==b)return " +
    "0;if(a.compareDocumentPosition)return a.compareDocumentPosition(b)" +
    "&2?1:-1;if(\"sourceIndex\"in a||a.parentNode&&\"sourceIndex\"in a.pare" +
    "ntNode){var c=1==a.nodeType,d=1==b.nodeType;if(c&&d)return a.sourc" +
    "eIndex-b.sourceIndex;var e=a.parentNode,f=b.parentNode;return e==f" +
    "?Ja(a,b):!c&&Ha(e,b)?-1*Ka(a,b):!d&&Ha(f,a)?Ka(b,a):(c?a.sourceInd" +
    "ex:e.sourceIndex)-(d?b.sourceIndex:f.sourceIndex)}d=x(a);c=d.creat" +
    "eRange();c.selectNode(a);c.collapse(!0);d=d.createRange();d.select" +
    "Node(b);\nd.collapse(!0);return c.compareBoundaryPoints(aa.Range.ST" +
    "ART_TO_END,d)}function Ka(a,b){var c=a.parentNode;if(c==b)return-1" +
    ";for(var d=b;d.parentNode!=c;)d=d.parentNode;return Ja(d,a)}functi" +
    "on Ja(a,b){for(var c=b;c=c.previousSibling;)if(c==a)return-1;retur" +
    "n 1}function x(a){qa(a,\"Node cannot be null or undefined.\");return" +
    " 9==a.nodeType?a:a.ownerDocument||a.document}function La(a,b){a=a." +
    "parentNode;for(var c=0;a;){qa(\"parentNode\"!=a.name);if(b(a))return" +
    " a;a=a.parentNode;c++}return null}\nfunction Ea(a){this.a=a||aa.doc" +
    "ument||document}\nfunction y(a,b,c,d){a=d||a.a;var e=b&&\"*\"!=b?b.to" +
    "UpperCase():\"\";if(a.querySelectorAll&&a.querySelector&&(e||c))c=a." +
    "querySelectorAll(e+(c?\".\"+c:\"\"));else if(c&&a.getElementsByClassNa" +
    "me)if(b=a.getElementsByClassName(c),e){a={};for(var f=d=0,g;g=b[f]" +
    ";f++)e==g.nodeName&&(a[d++]=g);a.length=d;c=a}else c=b;else if(b=a" +
    ".getElementsByTagName(e||\"*\"),c){a={};for(f=d=0;g=b[f];f++){var e=" +
    "g.className,h;if(h=\"function\"==typeof e.split)h=0<=sa(e.split(/\\s+" +
    "/),c);h&&(a[d++]=g)}a.length=d;c=a}else c=b;return c};/*xxx_rpl_li" +
    "c*/\nvar Ma=window;/*xxx_rpl_lic*/\nfunction z(a,b){this.a=Na[a]||\"u" +
    "nknown error\";this.message=b||\"\";var c=this.a.replace(/((?:^|\\s+)[" +
    "a-z])/g,function(a){return a.toUpperCase().replace(/^[\\s\\xa0]+/g,\"" +
    "\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+=\"Error\";this." +
    "name=c;c=Error(this.message);c.name=this.name;this.stack=c.stack||" +
    "\"\"}r(z,Error);\nvar Na={15:\"element not selectable\",11:\"element not" +
    " visible\",31:\"ime engine activation failed\",30:\"ime not available\"" +
    ",24:\"invalid cookie domain\",29:\"invalid element coordinates\",12:\"i" +
    "nvalid element state\",32:\"invalid selector\",51:\"invalid selector\"," +
    "52:\"invalid selector\",17:\"javascript error\",405:\"unsupported opera" +
    "tion\",34:\"move target out of bounds\",27:\"no such alert\",7:\"no such" +
    " element\",8:\"no such frame\",23:\"no such window\",28:\"script timeout" +
    "\",33:\"session not created\",10:\"stale element reference\",\n0:\"succes" +
    "s\",21:\"timeout\",25:\"unable to set cookie\",26:\"unexpected alert ope" +
    "n\",13:\"unknown error\",9:\"unknown command\"};z.prototype.toString=fu" +
    "nction(){return this.name+\": \"+this.message};/*xxx_rpl_lic*/\nvar O" +
    "a={w:function(a){return!(!a.querySelectorAll||!a.querySelector)},s" +
    ":function(a,b){if(!a)throw new z(32,\"No class name specified\");a=m" +
    "a(a);if(-1!==a.indexOf(\" \"))throw new z(32,\"Compound class names n" +
    "ot permitted\");if(Oa.w(b))try{return b.querySelector(\".\"+a.replace" +
    "(/\\./g,\"\\\\.\"))||null}catch(c){throw new z(32,\"An invalid or illega" +
    "l class name was specified\");}var d=y(w(b),\"*\",a,b);return d.lengt" +
    "h?d[0]:null},m:function(a,b){if(!a)throw new z(32,\"No class name s" +
    "pecified\");a=ma(a);if(-1!==a.indexOf(\" \"))throw new z(32,\n\"Compoun" +
    "d class names not permitted\");if(Oa.w(b))try{return b.querySelecto" +
    "rAll(\".\"+a.replace(/\\./g,\"\\\\.\"))}catch(c){throw new z(32,\"An inval" +
    "id or illegal class name was specified\");}return y(w(b),\"*\",a,b)}}" +
    ";function Pa(a){return(a=a.exec(Ba))?a[1]:\"\"}Pa(/Android\\s+([0-9.]" +
    "+)/)||Pa(/Version\\/([0-9.]+)/);/*xxx_rpl_lic*/\nfunction Qa(a){var " +
    "b=0,c=ma(String(Ra)).split(\".\");a=ma(String(a)).split(\".\");for(var" +
    " d=Math.max(c.length,a.length),e=0;0==b&&e<d;e++){var f=c[e]||\"\",g" +
    "=a[e]||\"\",h=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),p=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"" +
    ");do{var m=h.exec(f)||[\"\",\"\",\"\"],l=p.exec(g)||[\"\",\"\",\"\"];if(0==m[0" +
    "].length&&0==l[0].length)break;b=na(0==m[1].length?0:parseInt(m[1]" +
    ",10),0==l[1].length?0:parseInt(l[1],10))||na(0==m[2].length,0==l[2" +
    "].length)||na(m[2],l[2])}while(0==b)}}\nvar Sa=/Android\\s+([0-9\\.]+" +
    ")/.exec(Ba),Ra=Sa?Sa[1]:\"0\";Qa(2.3);Qa(4);/*xxx_rpl_lic*/\nvar Ta={" +
    "s:function(a,b){da(b.querySelector);if(!a)throw new z(32,\"No selec" +
    "tor specified\");a=ma(a);var c;try{c=b.querySelector(a)}catch(d){th" +
    "row new z(32,\"An invalid or illegal selector was specified\");}retu" +
    "rn c&&1==c.nodeType?c:null},m:function(a,b){da(b.querySelectorAll)" +
    ";if(!a)throw new z(32,\"No selector specified\");a=ma(a);try{return " +
    "b.querySelectorAll(a)}catch(c){throw new z(32,\"An invalid or illeg" +
    "al selector was specified\");}}};function Ua(a,b,c,d){this.top=a;th" +
    "is.right=b;this.bottom=c;this.left=d}Ua.prototype.clone=function()" +
    "{return new Ua(this.top,this.right,this.bottom,this.left)};Ua.prot" +
    "otype.toString=function(){return\"(\"+this.top+\"t, \"+this.right+\"r, " +
    "\"+this.bottom+\"b, \"+this.left+\"l)\"};Ua.prototype.ceil=function(){t" +
    "his.top=Math.ceil(this.top);this.right=Math.ceil(this.right);this." +
    "bottom=Math.ceil(this.bottom);this.left=Math.ceil(this.left);retur" +
    "n this};\nUa.prototype.floor=function(){this.top=Math.floor(this.to" +
    "p);this.right=Math.floor(this.right);this.bottom=Math.floor(this.b" +
    "ottom);this.left=Math.floor(this.left);return this};Ua.prototype.r" +
    "ound=function(){this.top=Math.round(this.top);this.right=Math.roun" +
    "d(this.right);this.bottom=Math.round(this.bottom);this.left=Math.r" +
    "ound(this.left);return this};function A(a,b,c,d){this.left=a;this." +
    "top=b;this.width=c;this.height=d}A.prototype.clone=function(){retu" +
    "rn new A(this.left,this.top,this.width,this.height)};A.prototype.t" +
    "oString=function(){return\"(\"+this.left+\", \"+this.top+\" - \"+this.wi" +
    "dth+\"w x \"+this.height+\"h)\"};A.prototype.ceil=function(){this.left" +
    "=Math.ceil(this.left);this.top=Math.ceil(this.top);this.width=Math" +
    ".ceil(this.width);this.height=Math.ceil(this.height);return this};" +
    "\nA.prototype.floor=function(){this.left=Math.floor(this.left);this" +
    ".top=Math.floor(this.top);this.width=Math.floor(this.width);this.h" +
    "eight=Math.floor(this.height);return this};A.prototype.round=funct" +
    "ion(){this.left=Math.round(this.left);this.top=Math.round(this.top" +
    ");this.width=Math.round(this.width);this.height=Math.round(this.he" +
    "ight);return this};/*\n\n The MIT License\n\n Copyright (c) 2007 Cyboz" +
    "u Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereb" +
    "y granted, free of charge, to any person obtaining a copy\n of this" +
    " software and associated documentation files (the \"Software\"), to\n" +
    " deal in the Software without restriction, including without limit" +
    "ation the\n rights to use, copy, modify, merge, publish, distribute" +
    ", sublicense, and/or\n sell copies of the Software, and to permit p" +
    "ersons to whom the Software is\n furnished to do so, subject to the" +
    " following conditions:\n\n The above copyright notice and this permi" +
    "ssion notice shall be included in\n all copies or substantial porti" +
    "ons of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT W" +
    "ARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITE" +
    "D TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR " +
    "PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COP" +
    "YRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILIT" +
    "Y, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n F" +
    "ROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER" +
    " DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Va(a,b,c){this.a=a;this.b=" +
    "b||1;this.f=c||1};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu" +
    " Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby" +
    " granted, free of charge, to any person obtaining a copy\n of this " +
    "software and associated documentation files (the \"Software\"), to\n " +
    "deal in the Software without restriction, including without limita" +
    "tion the\n rights to use, copy, modify, merge, publish, distribute," +
    " sublicense, and/or\n sell copies of the Software, and to permit pe" +
    "rsons to whom the Software is\n furnished to do so, subject to the " +
    "following conditions:\n\n The above copyright notice and this permis" +
    "sion notice shall be included in\n all copies or substantial portio" +
    "ns of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WA" +
    "RRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED" +
    " TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR P" +
    "URPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPY" +
    "RIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY" +
    ", WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FR" +
    "OM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER " +
    "DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c)" +
    " 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permissi" +
    "on is hereby granted, free of charge, to any person obtaining a co" +
    "py\n of this software and associated documentation files (the \"Soft" +
    "ware\"), to\n deal in the Software without restriction, including wi" +
    "thout limitation the\n rights to use, copy, modify, merge, publish," +
    " distribute, sublicense, and/or\n sell copies of the Software, and " +
    "to permit persons to whom the Software is\n furnished to do so, sub" +
    "ject to the following conditions:\n\n The above copyright notice and" +
    " this permission notice shall be included in\n all copies or substa" +
    "ntial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\"" +
    ", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT" +
    " NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A " +
    "PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUT" +
    "HORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHE" +
    "R\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE," +
    " ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE U" +
    "SE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n C" +
    "opyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc" +
    ".\n\n Permission is hereby granted, free of charge, to any person ob" +
    "taining a copy\n of this software and associated documentation file" +
    "s (the \"Software\"), to\n deal in the Software without restriction, " +
    "including without limitation the\n rights to use, copy, modify, mer" +
    "ge, publish, distribute, sublicense, and/or\n sell copies of the So" +
    "ftware, and to permit persons to whom the Software is\n furnished t" +
    "o do so, subject to the following conditions:\n\n The above copyrigh" +
    "t notice and this permission notice shall be included in\n all copi" +
    "es or substantial portions of the Software.\n\n THE SOFTWARE IS PROV" +
    "IDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, I" +
    "NCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FI" +
    "TNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SH" +
    "ALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAM" +
    "AGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT O" +
    "R OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTW" +
    "ARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Wa(" +
    "a){this.b=a;this.a=0}function Xa(a){a=a.match(Ya);for(var b=0;b<a." +
    "length;b++)Za.test(a[b])&&a.splice(b,1);return new Wa(a)}var Ya=Re" +
    "gExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\/\\\\/|\\\\.\\\\.|:" +
    ":|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s+|.\",\"g\")," +
    "Za=/^\\s/;function C(a,b){return a.b[a.a+(b||0)]}function D(a){retu" +
    "rn a.b[a.a++]}function $a(a){return a.b.length<=a.a};/*\n\n The MIT " +
    "License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012" +
    " Google Inc.\n\n Permission is hereby granted, free of charge, to an" +
    "y person obtaining a copy\n of this software and associated documen" +
    "tation files (the \"Software\"), to\n deal in the Software without re" +
    "striction, including without limitation the\n rights to use, copy, " +
    "modify, merge, publish, distribute, sublicense, and/or\n sell copie" +
    "s of the Software, and to permit persons to whom the Software is\n " +
    "furnished to do so, subject to the following conditions:\n\n The abo" +
    "ve copyright notice and this permission notice shall be included i" +
    "n\n all copies or substantial portions of the Software.\n\n THE SOFTW" +
    "ARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
    " IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTA" +
    "BILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN " +
    "NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY" +
    " CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTR" +
    "ACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WIT" +
    "H THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nf" +
    "unction E(a){var b=null,c=a.nodeType;1==c&&(b=a.textContent,b=void" +
    " 0==b||null==b?a.innerText:b,b=void 0==b||null==b?\"\":b);if(\"string" +
    "\"!=typeof b)if(9==c||1==c){a=9==c?a.documentElement:a.firstChild;f" +
    "or(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a.nodeValue),d[c++]" +
    "=a;while(a=a.firstChild);for(;c&&!(a=d[--c].nextSibling););}}else " +
    "b=a.nodeValue;return\"\"+b}\nfunction ab(a,b,c){if(null===b)return!0;" +
    "try{if(!a.getAttribute)return!1}catch(d){return!1}return null==c?!" +
    "!a.getAttribute(b):a.getAttribute(b,2)==c}function bb(a,b,c,d,e){r" +
    "eturn cb.call(null,a,b,q(c)?c:null,q(d)?d:null,e||new F)}\nfunction" +
    " cb(a,b,c,d,e){b.getElementsByName&&d&&\"name\"==c?(b=b.getElementsB" +
    "yName(d),t(b,function(b){a.a(b)&&G(e,b)})):b.getElementsByClassNam" +
    "e&&d&&\"class\"==c?(b=b.getElementsByClassName(d),t(b,function(b){b." +
    "className==d&&a.a(b)&&G(e,b)})):a instanceof H?db(a,b,c,d,e):b.get" +
    "ElementsByTagName&&(b=b.getElementsByTagName(a.f()),t(b,function(a" +
    "){ab(a,c,d)&&G(e,a)}));return e}function eb(a,b,c,d,e){for(b=b.fir" +
    "stChild;b;b=b.nextSibling)ab(b,c,d)&&a.a(b)&&G(e,b);return e}\nfunc" +
    "tion db(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)ab(b,c,d)&" +
    "&a.a(b)&&G(e,b),db(a,b,c,d,e)};/*\n\n The MIT License\n\n Copyright (c" +
    ") 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permiss" +
    "ion is hereby granted, free of charge, to any person obtaining a c" +
    "opy\n of this software and associated documentation files (the \"Sof" +
    "tware\"), to\n deal in the Software without restriction, including w" +
    "ithout limitation the\n rights to use, copy, modify, merge, publish" +
    ", distribute, sublicense, and/or\n sell copies of the Software, and" +
    " to permit persons to whom the Software is\n furnished to do so, su" +
    "bject to the following conditions:\n\n The above copyright notice an" +
    "d this permission notice shall be included in\n all copies or subst" +
    "antial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS" +
    "\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BU" +
    "T NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A" +
    " PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AU" +
    "THORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTH" +
    "ER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE" +
    ", ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE " +
    "USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction F(){this.b=thi" +
    "s.a=null;this.l=0}function fb(a){this.node=a;this.a=this.b=null}fu" +
    "nction gb(a,b){if(!a.a)return b;if(!b.a)return a;for(var c=a.a,d=b" +
    ".a,e=null,f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):0<Ia(c" +
    ".node,d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=f,g++;" +
    "for(f=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.l=g;return a}functio" +
    "n hb(a,b){var c=new fb(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=c;a.l+" +
    "+}function G(a,b){var c=new fb(b);c.b=a.b;a.a?a.b.a=c:a.a=a.b=c;a." +
    "b=c;a.l++}\nfunction ib(a){return(a=a.a)?a.node:null}function jb(a)" +
    "{return(a=ib(a))?E(a):\"\"}function I(a,b){return new kb(a,!!b)}func" +
    "tion kb(a,b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=null}functi" +
    "on J(a){var b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c?b.b:b" +
    ".a;return c.node};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu" +
    " Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby" +
    " granted, free of charge, to any person obtaining a copy\n of this " +
    "software and associated documentation files (the \"Software\"), to\n " +
    "deal in the Software without restriction, including without limita" +
    "tion the\n rights to use, copy, modify, merge, publish, distribute," +
    " sublicense, and/or\n sell copies of the Software, and to permit pe" +
    "rsons to whom the Software is\n furnished to do so, subject to the " +
    "following conditions:\n\n The above copyright notice and this permis" +
    "sion notice shall be included in\n all copies or substantial portio" +
    "ns of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WA" +
    "RRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED" +
    " TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR P" +
    "URPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPY" +
    "RIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY" +
    ", WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FR" +
    "OM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER " +
    "DEALINGS\n IN THE SOFTWARE.\n*/\nfunction lb(a){switch(a.nodeType){ca" +
    "se 1:return ha(mb,a);case 9:return lb(a.documentElement);case 11:c" +
    "ase 10:case 6:case 12:return nb;default:return a.parentNode?lb(a.p" +
    "arentNode):nb}}function nb(){return null}function mb(a,b){if(a.pre" +
    "fix==b)return a.namespaceURI||\"http://www.w3.org/1999/xhtml\";var c" +
    "=a.getAttributeNode(\"xmlns:\"+b);return c&&c.specified?c.value||nul" +
    "l:a.parentNode&&9!=a.parentNode.nodeType?mb(a.parentNode,b):null};" +
    "/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyr" +
    "ight (c) 2012 Google Inc.\n\n Permission is hereby granted, free of " +
    "charge, to any person obtaining a copy\n of this software and assoc" +
    "iated documentation files (the \"Software\"), to\n deal in the Softwa" +
    "re without restriction, including without limitation the\n rights t" +
    "o use, copy, modify, merge, publish, distribute, sublicense, and/o" +
    "r\n sell copies of the Software, and to permit persons to whom the " +
    "Software is\n furnished to do so, subject to the following conditio" +
    "ns:\n\n The above copyright notice and this permission notice shall " +
    "be included in\n all copies or substantial portions of the Software" +
    ".\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND" +
    ", EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES" +
    " OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFR" +
    "INGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE L" +
    "IABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN AC" +
    "TION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN C" +
    "ONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE S" +
    "OFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs," +
    " Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby grant" +
    "ed, free of charge, to any person obtaining a copy\n of this softwa" +
    "re and associated documentation files (the \"Software\"), to\n deal i" +
    "n the Software without restriction, including without limitation t" +
    "he\n rights to use, copy, modify, merge, publish, distribute, subli" +
    "cense, and/or\n sell copies of the Software, and to permit persons " +
    "to whom the Software is\n furnished to do so, subject to the follow" +
    "ing conditions:\n\n The above copyright notice and this permission n" +
    "otice shall be included in\n all copies or substantial portions of " +
    "the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY" +
    " OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO TH" +
    "E WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE" +
    " AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT " +
    "HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHET" +
    "HER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OU" +
    "T OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALIN" +
    "GS\n IN THE SOFTWARE.\n*/\nfunction K(a){this.i=a;this.b=this.g=!1;th" +
    "is.f=null}function L(a){return\"\\n  \"+a.toString().split(\"\\n\").join" +
    "(\"\\n  \")}function ob(a,b){a.g=b}function pb(a,b){a.b=b}function M(" +
    "a,b){var c=a.a(b);return c instanceof F?+jb(c):+c}function O(a,b){" +
    "var c=a.a(b);return c instanceof F?jb(c):\"\"+c}function qb(a,b){var" +
    " c=a.a(b);return c instanceof F?!!c.l:!!c};/*\n\n The MIT License\n\n " +
    "Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google In" +
    "c.\n\n Permission is hereby granted, free of charge, to any person o" +
    "btaining a copy\n of this software and associated documentation fil" +
    "es (the \"Software\"), to\n deal in the Software without restriction," +
    " including without limitation the\n rights to use, copy, modify, me" +
    "rge, publish, distribute, sublicense, and/or\n sell copies of the S" +
    "oftware, and to permit persons to whom the Software is\n furnished " +
    "to do so, subject to the following conditions:\n\n The above copyrig" +
    "ht notice and this permission notice shall be included in\n all cop" +
    "ies or substantial portions of the Software.\n\n THE SOFTWARE IS PRO" +
    "VIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, " +
    "INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n F" +
    "ITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT S" +
    "HALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DA" +
    "MAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT " +
    "OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFT" +
    "WARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction rb" +
    "(a,b,c){K.call(this,a.i);this.c=a;this.h=b;this.u=c;this.g=b.g||c." +
    "g;this.b=b.b||c.b;this.c==sb&&(c.b||c.g||4==c.i||0==c.i||!b.f?b.b|"
  )
      .append(
    "|b.g||4==b.i||0==b.i||!c.f||(this.f={name:c.f.name,v:b}):this.f={n" +
    "ame:b.f.name,v:c})}r(rb,K);\nfunction tb(a,b,c,d,e){b=b.a(d);c=c.a(" +
    "d);var f;if(b instanceof F&&c instanceof F){e=I(b);for(d=J(e);d;d=" +
    "J(e))for(b=I(c),f=J(b);f;f=J(b))if(a(E(d),E(f)))return!0;return!1}" +
    "if(b instanceof F||c instanceof F){b instanceof F?e=b:(e=c,c=b);e=" +
    "I(e);b=typeof c;for(d=J(e);d;d=J(e)){switch(b){case \"number\":d=+E(" +
    "d);break;case \"boolean\":d=!!E(d);break;case \"string\":d=E(d);break;" +
    "default:throw Error(\"Illegal primitive type for comparison.\");}if(" +
    "a(d,c))return!0}return!1}return e?\"boolean\"==typeof b||\"boolean\"==" +
    "typeof c?\na(!!b,!!c):\"number\"==typeof b||\"number\"==typeof c?a(+b,+" +
    "c):a(b,c):a(+b,+c)}rb.prototype.a=function(a){return this.c.o(this" +
    ".h,this.u,a)};rb.prototype.toString=function(){var a=\"Binary Expre" +
    "ssion: \"+this.c,a=a+L(this.h);return a+=L(this.u)};function ub(a,b" +
    ",c,d){this.a=a;this.H=b;this.i=c;this.o=d}ub.prototype.toString=k(" +
    "\"a\");var vb={};function P(a,b,c,d){if(vb.hasOwnProperty(a))throw E" +
    "rror(\"Binary operator already created: \"+a);a=new ub(a,b,c,d);retu" +
    "rn vb[a.toString()]=a}\nP(\"div\",6,1,function(a,b,c){return M(a,c)/M" +
    "(b,c)});P(\"mod\",6,1,function(a,b,c){return M(a,c)%M(b,c)});P(\"*\",6" +
    ",1,function(a,b,c){return M(a,c)*M(b,c)});P(\"+\",5,1,function(a,b,c" +
    "){return M(a,c)+M(b,c)});P(\"-\",5,1,function(a,b,c){return M(a,c)-M" +
    "(b,c)});P(\"<\",4,2,function(a,b,c){return tb(function(a,b){return a" +
    "<b},a,b,c)});P(\">\",4,2,function(a,b,c){return tb(function(a,b){ret" +
    "urn a>b},a,b,c)});P(\"<=\",4,2,function(a,b,c){return tb(function(a," +
    "b){return a<=b},a,b,c)});\nP(\">=\",4,2,function(a,b,c){return tb(fun" +
    "ction(a,b){return a>=b},a,b,c)});var sb=P(\"=\",3,2,function(a,b,c){" +
    "return tb(function(a,b){return a==b},a,b,c,!0)});P(\"!=\",3,2,functi" +
    "on(a,b,c){return tb(function(a,b){return a!=b},a,b,c,!0)});P(\"and\"" +
    ",2,2,function(a,b,c){return qb(a,c)&&qb(b,c)});P(\"or\",1,2,function" +
    "(a,b,c){return qb(a,c)||qb(b,c)});/*\n\n The MIT License\n\n Copyright" +
    " (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Perm" +
    "ission is hereby granted, free of charge, to any person obtaining " +
    "a copy\n of this software and associated documentation files (the \"" +
    "Software\"), to\n deal in the Software without restriction, includin" +
    "g without limitation the\n rights to use, copy, modify, merge, publ" +
    "ish, distribute, sublicense, and/or\n sell copies of the Software, " +
    "and to permit persons to whom the Software is\n furnished to do so," +
    " subject to the following conditions:\n\n The above copyright notice" +
    " and this permission notice shall be included in\n all copies or su" +
    "bstantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS" +
    " IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING" +
    " BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FO" +
    "R A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
    " AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR " +
    "OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERW" +
    "ISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR T" +
    "HE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction wb(a,b){if(" +
    "b.a.length&&4!=a.i)throw Error(\"Primary expression must evaluate t" +
    "o nodeset if filter has predicate(s).\");K.call(this,a.i);this.c=a;" +
    "this.h=b;this.g=a.g;this.b=a.b}r(wb,K);wb.prototype.a=function(a){" +
    "a=this.c.a(a);return xb(this.h,a)};wb.prototype.toString=function(" +
    "){var a;a=\"Filter:\"+L(this.c);return a+=L(this.h)};/*\n\n The MIT Li" +
    "cense\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 G" +
    "oogle Inc.\n\n Permission is hereby granted, free of charge, to any " +
    "person obtaining a copy\n of this software and associated documenta" +
    "tion files (the \"Software\"), to\n deal in the Software without rest" +
    "riction, including without limitation the\n rights to use, copy, mo" +
    "dify, merge, publish, distribute, sublicense, and/or\n sell copies " +
    "of the Software, and to permit persons to whom the Software is\n fu" +
    "rnished to do so, subject to the following conditions:\n\n The above" +
    " copyright notice and this permission notice shall be included in\n" +
    " all copies or substantial portions of the Software.\n\n THE SOFTWAR" +
    "E IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n I" +
    "MPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABI" +
    "LITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO" +
    " EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY C" +
    "LAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRAC" +
    "T, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH " +
    "THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfun" +
    "ction yb(a,b){if(b.length<a.I)throw Error(\"Function \"+a.j+\" expect" +
    "s at least\"+a.I+\" arguments, \"+b.length+\" given\");if(null!==a.B&&b" +
    ".length>a.B)throw Error(\"Function \"+a.j+\" expects at most \"+a.B+\" " +
    "arguments, \"+b.length+\" given\");a.N&&t(b,function(b,d){if(4!=b.i)t" +
    "hrow Error(\"Argument \"+d+\" to function \"+a.j+\" is not of type Node" +
    "set: \"+b);});K.call(this,a.i);this.h=a;this.c=b;ob(this,a.g||va(b," +
    "function(a){return a.g}));pb(this,a.M&&!b.length||a.L&&!!b.length|" +
    "|va(b,function(a){return a.b}))}\nr(yb,K);yb.prototype.a=function(a" +
    "){return this.h.o.apply(null,ya(a,this.c))};yb.prototype.toString=" +
    "function(){var a=\"Function: \"+this.h;if(this.c.length)var b=ua(thi" +
    "s.c,function(a,b){return a+L(b)},\"Arguments:\"),a=a+L(b);return a};" +
    "function zb(a,b,c,d,e,f,g,h,p){this.j=a;this.i=b;this.g=c;this.M=d" +
    ";this.L=e;this.o=f;this.I=g;this.B=void 0!==h?h:g;this.N=!!p}zb.pr" +
    "ototype.toString=k(\"j\");var Ab={};\nfunction Q(a,b,c,d,e,f,g,h){if(" +
    "Ab.hasOwnProperty(a))throw Error(\"Function already created: \"+a+\"." +
    "\");Ab[a]=new zb(a,b,c,d,!1,e,f,g,h)}Q(\"boolean\",2,!1,!1,function(a" +
    ",b){return qb(b,a)},1);Q(\"ceiling\",1,!1,!1,function(a,b){return Ma" +
    "th.ceil(M(b,a))},1);Q(\"concat\",3,!1,!1,function(a,b){var c=za(argu" +
    "ments,1);return ua(c,function(b,c){return b+O(c,a)},\"\")},2,null);Q" +
    "(\"contains\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);return-1!=b." +
    "indexOf(a)},2);Q(\"count\",1,!1,!1,function(a,b){return b.a(a).l},1," +
    "1,!0);\nQ(\"false\",2,!1,!1,n(!1),0);Q(\"floor\",1,!1,!1,function(a,b){" +
    "return Math.floor(M(b,a))},1);Q(\"id\",4,!1,!1,function(a,b){var c=a" +
    ".a,d=9==c.nodeType?c:c.ownerDocument,c=O(b,a).split(/\\s+/),e=[];t(" +
    "c,function(a){a=d.getElementById(a);!a||0<=sa(e,a)||e.push(a)});e." +
    "sort(Ia);var f=new F;t(e,function(a){G(f,a)});return f},1);Q(\"lang" +
    "\",2,!1,!1,n(!1),1);Q(\"last\",1,!0,!1,function(a){if(1!=arguments.le" +
    "ngth)throw Error(\"Function last expects ()\");return a.f},0);\nQ(\"lo" +
    "cal-name\",3,!1,!0,function(a,b){var c=b?ib(b.a(a)):a.a;return c?c." +
    "localName||c.nodeName.toLowerCase():\"\"},0,1,!0);Q(\"name\",3,!1,!0,f" +
    "unction(a,b){var c=b?ib(b.a(a)):a.a;return c?c.nodeName.toLowerCas" +
    "e():\"\"},0,1,!0);Q(\"namespace-uri\",3,!0,!1,n(\"\"),0,1,!0);Q(\"normali" +
    "ze-space\",3,!1,!0,function(a,b){return(b?O(b,a):E(a.a)).replace(/[" +
    "\\s\\xa0]+/g,\" \").replace(/^\\s+|\\s+$/g,\"\")},0,1);Q(\"not\",2,!1,!1,fun" +
    "ction(a,b){return!qb(b,a)},1);Q(\"number\",1,!1,!0,function(a,b){ret" +
    "urn b?M(b,a):+E(a.a)},0,1);\nQ(\"position\",1,!0,!1,function(a){retur" +
    "n a.b},0);Q(\"round\",1,!1,!1,function(a,b){return Math.round(M(b,a)" +
    ")},1);Q(\"starts-with\",2,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);re" +
    "turn 0==b.lastIndexOf(a,0)},2);Q(\"string\",3,!1,!0,function(a,b){re" +
    "turn b?O(b,a):E(a.a)},0,1);Q(\"string-length\",1,!1,!0,function(a,b)" +
    "{return(b?O(b,a):E(a.a)).length},0,1);\nQ(\"substring\",3,!1,!1,funct" +
    "ion(a,b,c,d){c=M(c,a);if(isNaN(c)||Infinity==c||-Infinity==c)retur" +
    "n\"\";d=d?M(d,a):Infinity;if(isNaN(d)||-Infinity===d)return\"\";c=Math" +
    ".round(c)-1;var e=Math.max(c,0);a=O(b,a);if(Infinity==d)return a.s" +
    "ubstring(e);b=Math.round(d);return a.substring(e,c+b)},2,3);Q(\"sub" +
    "string-after\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);c=b.indexO" +
    "f(a);return-1==c?\"\":b.substring(c+a.length)},2);\nQ(\"substring-befo" +
    "re\",3,!1,!1,function(a,b,c){b=O(b,a);a=O(c,a);a=b.indexOf(a);retur" +
    "n-1==a?\"\":b.substring(0,a)},2);Q(\"sum\",1,!1,!1,function(a,b){for(v" +
    "ar c=I(b.a(a)),d=0,e=J(c);e;e=J(c))d+=+E(e);return d},1,1,!0);Q(\"t" +
    "ranslate\",3,!1,!1,function(a,b,c,d){b=O(b,a);c=O(c,a);var e=O(d,a)" +
    ";a=[];for(d=0;d<c.length;d++){var f=c.charAt(d);f in a||(a[f]=e.ch" +
    "arAt(d))}c=\"\";for(d=0;d<b.length;d++)f=b.charAt(d),c+=f in a?a[f]:" +
    "f;return c},3);Q(\"true\",2,!1,!1,n(!0),0);/*\n\n The MIT License\n\n Co" +
    "pyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc." +
    "\n\n Permission is hereby granted, free of charge, to any person obt" +
    "aining a copy\n of this software and associated documentation files" +
    " (the \"Software\"), to\n deal in the Software without restriction, i" +
    "ncluding without limitation the\n rights to use, copy, modify, merg" +
    "e, publish, distribute, sublicense, and/or\n sell copies of the Sof" +
    "tware, and to permit persons to whom the Software is\n furnished to" +
    " do so, subject to the following conditions:\n\n The above copyright" +
    " notice and this permission notice shall be included in\n all copie" +
    "s or substantial portions of the Software.\n\n THE SOFTWARE IS PROVI" +
    "DED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, IN" +
    "CLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FIT" +
    "NESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHA" +
    "LL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMA" +
    "GES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR" +
    " OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWA" +
    "RE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT " +
    "License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012" +
    " Google Inc.\n\n Permission is hereby granted, free of charge, to an" +
    "y person obtaining a copy\n of this software and associated documen" +
    "tation files (the \"Software\"), to\n deal in the Software without re" +
    "striction, including without limitation the\n rights to use, copy, " +
    "modify, merge, publish, distribute, sublicense, and/or\n sell copie" +
    "s of the Software, and to permit persons to whom the Software is\n " +
    "furnished to do so, subject to the following conditions:\n\n The abo" +
    "ve copyright notice and this permission notice shall be included i" +
    "n\n all copies or substantial portions of the Software.\n\n THE SOFTW" +
    "ARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
    " IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTA" +
    "BILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN " +
    "NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY" +
    " CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTR" +
    "ACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WIT" +
    "H THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nf" +
    "unction H(a,b){this.h=a;this.c=void 0!==b?b:null;this.b=null;switc" +
    "h(a){case \"comment\":this.b=8;break;case \"text\":this.b=3;break;case" +
    " \"processing-instruction\":this.b=7;break;case \"node\":break;default" +
    ":throw Error(\"Unexpected argument\");}}function Bb(a){return\"commen" +
    "t\"==a||\"text\"==a||\"processing-instruction\"==a||\"node\"==a}H.prototy" +
    "pe.a=function(a){return null===this.b||this.b==a.nodeType};H.proto" +
    "type.f=k(\"h\");H.prototype.toString=function(){var a=\"Kind Test: \"+" +
    "this.h;null===this.c||(a+=L(this.c));return a};/*\n\n The MIT Licens" +
    "e\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Googl" +
    "e Inc.\n\n Permission is hereby granted, free of charge, to any pers" +
    "on obtaining a copy\n of this software and associated documentation" +
    " files (the \"Software\"), to\n deal in the Software without restrict" +
    "ion, including without limitation the\n rights to use, copy, modify" +
    ", merge, publish, distribute, sublicense, and/or\n sell copies of t" +
    "he Software, and to permit persons to whom the Software is\n furnis" +
    "hed to do so, subject to the following conditions:\n\n The above cop" +
    "yright notice and this permission notice shall be included in\n all" +
    " copies or substantial portions of the Software.\n\n THE SOFTWARE IS" +
    " PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLI" +
    "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY" +
    ",\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVE" +
    "NT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM" +
    ", DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, T" +
    "ORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE " +
    "SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunctio" +
    "n Cb(a){K.call(this,3);this.c=a.substring(1,a.length-1)}r(Cb,K);Cb" +
    ".prototype.a=k(\"c\");Cb.prototype.toString=function(){return\"Litera" +
    "l: \"+this.c};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs" +
    ", Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby gran" +
    "ted, free of charge, to any person obtaining a copy\n of this softw" +
    "are and associated documentation files (the \"Software\"), to\n deal " +
    "in the Software without restriction, including without limitation " +
    "the\n rights to use, copy, modify, merge, publish, distribute, subl" +
    "icense, and/or\n sell copies of the Software, and to permit persons" +
    " to whom the Software is\n furnished to do so, subject to the follo" +
    "wing conditions:\n\n The above copyright notice and this permission " +
    "notice shall be included in\n all copies or substantial portions of" +
    " the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANT" +
    "Y OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO T" +
    "HE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOS" +
    "E AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT" +
    " HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHE" +
    "THER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, O" +
    "UT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALI" +
    "NGS\n IN THE SOFTWARE.\n*/\nfunction Db(a,b){this.j=a.toLowerCase();t" +
    "his.b=b?b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}Db.prototyp" +
    "e.a=function(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=this.j&" +
    "&this.j!=a.nodeName.toLowerCase()?!1:this.b==(a.namespaceURI?a.nam" +
    "espaceURI.toLowerCase():\"http://www.w3.org/1999/xhtml\")};Db.protot" +
    "ype.f=k(\"j\");Db.prototype.toString=function(){return\"Name Test: \"+" +
    "(\"http://www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+this.j};/*\n" +
    "\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyrigh" +
    "t (c) 2012 Google Inc.\n\n Permission is hereby granted, free of cha" +
    "rge, to any person obtaining a copy\n of this software and associat" +
    "ed documentation files (the \"Software\"), to\n deal in the Software " +
    "without restriction, including without limitation the\n rights to u" +
    "se, copy, modify, merge, publish, distribute, sublicense, and/or\n " +
    "sell copies of the Software, and to permit persons to whom the Sof" +
    "tware is\n furnished to do so, subject to the following conditions:" +
    "\n\n The above copyright notice and this permission notice shall be " +
    "included in\n all copies or substantial portions of the Software.\n\n" +
    " THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, E" +
    "XPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF" +
    " MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRING" +
    "EMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIAB" +
    "LE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTIO" +
    "N OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONN" +
    "ECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFT" +
    "WARE.\n*/\nfunction Eb(a){K.call(this,1);this.c=a}r(Eb,K);Eb.prototy" +
    "pe.a=k(\"c\");Eb.prototype.toString=function(){return\"Number: \"+this" +
    ".c};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n C" +
    "opyright (c) 2012 Google Inc.\n\n Permission is hereby granted, free" +
    " of charge, to any person obtaining a copy\n of this software and a" +
    "ssociated documentation files (the \"Software\"), to\n deal in the So" +
    "ftware without restriction, including without limitation the\n righ" +
    "ts to use, copy, modify, merge, publish, distribute, sublicense, a" +
    "nd/or\n sell copies of the Software, and to permit persons to whom " +
    "the Software is\n furnished to do so, subject to the following cond" +
    "itions:\n\n The above copyright notice and this permission notice sh" +
    "all be included in\n all copies or substantial portions of the Soft" +
    "ware.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY " +
    "KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRAN" +
    "TIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NON" +
    "INFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS " +
    "BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN A" +
    "N ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR " +
    "IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN T" +
    "HE SOFTWARE.\n*/\nfunction Fb(a,b){K.call(this,a.i);this.h=a;this.c=" +
    "b;this.g=a.g;this.b=a.b;if(1==this.c.length){var c=this.c[0];c.A||" +
    "c.c!=Gb||(c=c.u,\"*\"!=c.f()&&(this.f={name:c.f(),v:null}))}}r(Fb,K)" +
    ";function Hb(){K.call(this,4)}r(Hb,K);Hb.prototype.a=function(a){v" +
    "ar b=new F;a=a.a;9==a.nodeType?G(b,a):G(b,a.ownerDocument);return " +
    "b};Hb.prototype.toString=n(\"Root Helper Expression\");function Ib()" +
    "{K.call(this,4)}r(Ib,K);Ib.prototype.a=function(a){var b=new F;G(b" +
    ",a.a);return b};Ib.prototype.toString=n(\"Context Helper Expression" +
    "\");\nfunction Jb(a){return\"/\"==a||\"//\"==a}Fb.prototype.a=function(a" +
    "){var b=this.h.a(a);if(!(b instanceof F))throw Error(\"Filter expre" +
    "ssion must evaluate to nodeset.\");a=this.c;for(var c=0,d=a.length;" +
    "c<d&&b.l;c++){var e=a[c],f=I(b,e.c.a),g;if(e.g||e.c!=Kb)if(e.g||e." +
    "c!=Lb)for(g=J(f),b=e.a(new Va(g));null!=(g=J(f));)g=e.a(new Va(g))" +
    ",b=gb(b,g);else g=J(f),b=e.a(new Va(g));else{for(g=J(f);(b=J(f))&&" +
    "(!g.contains||g.contains(b))&&b.compareDocumentPosition(g)&8;g=b);" +
    "b=e.a(new Va(g))}}return b};\nFb.prototype.toString=function(){var " +
    "a;a=\"Path Expression:\"+L(this.h);if(this.c.length){var b=ua(this.c" +
    ",function(a,b){return a+L(b)},\"Steps:\");a+=L(b)}return a};/*\n\n The" +
    " MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c)" +
    " 2012 Google Inc.\n\n Permission is hereby granted, free of charge, " +
    "to any person obtaining a copy\n of this software and associated do" +
    "cumentation files (the \"Software\"), to\n deal in the Software witho" +
    "ut restriction, including without limitation the\n rights to use, c" +
    "opy, modify, merge, publish, distribute, sublicense, and/or\n sell " +
    "copies of the Software, and to permit persons to whom the Software" +
    " is\n furnished to do so, subject to the following conditions:\n\n Th" +
    "e above copyright notice and this permission notice shall be inclu" +
    "ded in\n all copies or substantial portions of the Software.\n\n THE " +
    "SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRES" +
    "S OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERC" +
    "HANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT" +
    ". IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FO" +
    "R ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF " +
    "CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTIO" +
    "N WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE." +
    "\n*/\nfunction Mb(a,b){this.a=a;this.b=!!b}\nfunction xb(a,b,c){for(c" +
    "=c||0;c<a.a.length;c++)for(var d=a.a[c],e=I(b),f=b.l,g,h=0;g=J(e);" +
    "h++){var p=a.b?f-h:h+1;g=d.a(new Va(g,p,f));if(\"number\"==typeof g)" +
    "p=p==g;else if(\"string\"==typeof g||\"boolean\"==typeof g)p=!!g;else " +
    "if(g instanceof F)p=0<g.l;else throw Error(\"Predicate.evaluate ret" +
    "urned an unexpected type.\");if(!p){p=e;g=p.f;var m=p.a;if(!m)throw" +
    " Error(\"Next must be called at least once before remove.\");var l=m" +
    ".b,m=m.a;l?l.a=m:g.a=m;m?m.b=l:g.b=l;g.l--;p.a=null}}return b}\nMb." +
    "prototype.toString=function(){return ua(this.a,function(a,b){retur" +
    "n a+L(b)},\"Predicates:\")};/*\n\n The MIT License\n\n Copyright (c) 200" +
    "7 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission i" +
    "s hereby granted, free of charge, to any person obtaining a copy\n " +
    "of this software and associated documentation files (the \"Software" +
    "\"), to\n deal in the Software without restriction, including withou" +
    "t limitation the\n rights to use, copy, modify, merge, publish, dis" +
    "tribute, sublicense, and/or\n sell copies of the Software, and to p" +
    "ermit persons to whom the Software is\n furnished to do so, subject" +
    " to the following conditions:\n\n The above copyright notice and thi" +
    "s permission notice shall be included in\n all copies or substantia" +
    "l portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WI" +
    "THOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT" +
    " LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PART" +
    "ICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS" +
    " OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n L" +
    "IABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARI" +
    "SING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE O" +
    "R OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction R(a,b,c,d){K.call(t" +
    "his,4);this.c=a;this.u=b;this.h=c||new Mb([]);this.A=!!d;b=this.h;" +
    "b=0<b.a.length?b.a[0].f:null;a.b&&b&&(this.f={name:b.name,v:b.v});" +
    "a:{a=this.h;for(b=0;b<a.a.length;b++)if(c=a.a[b],c.g||1==c.i||0==c" +
    ".i){a=!0;break a}a=!1}this.g=a}r(R,K);\nR.prototype.a=function(a){v" +
    "ar b=a.a,c=null,c=this.f,d=null,e=null,f=0;c&&(d=c.name,e=c.v?O(c." +
    "v,a):null,f=1);if(this.A)if(this.g||this.c!=Nb)if(a=I((new R(Pb,ne" +
    "w H(\"node\"))).a(a)),b=J(a))for(c=this.o(b,d,e,f);null!=(b=J(a));)c" +
    "=gb(c,this.o(b,d,e,f));else c=new F;else c=bb(this.u,b,d,e),c=xb(t" +
    "his.h,c,f);else c=this.o(a.a,d,e,f);return c};R.prototype.o=functi" +
    "on(a,b,c,d){a=this.c.f(this.u,a,b,c);return a=xb(this.h,a,d)};\nR.p" +
    "rototype.toString=function(){var a;a=\"Step:\"+L(\"Operator: \"+(this." +
    "A?\"//\":\"/\"));this.c.j&&(a+=L(\"Axis: \"+this.c));a+=L(this.u);if(thi" +
    "s.h.a.length){var b=ua(this.h.a,function(a,b){return a+L(b)},\"Pred" +
    "icates:\");a+=L(b)}return a};function Qb(a,b,c,d){this.j=a;this.f=b" +
    ";this.a=c;this.b=d}Qb.prototype.toString=k(\"j\");var Rb={};function" +
    " S(a,b,c,d){if(Rb.hasOwnProperty(a))throw Error(\"Axis already crea" +
    "ted: \"+a);b=new Qb(a,b,c,!!d);return Rb[a]=b}\nS(\"ancestor\",functio" +
    "n(a,b){for(var c=new F,d=b;d=d.parentNode;)a.a(d)&&hb(c,d);return " +
    "c},!0);S(\"ancestor-or-self\",function(a,b){var c=new F,d=b;do a.a(d" +
    ")&&hb(c,d);while(d=d.parentNode);return c},!0);var Gb=S(\"attribute" +
    "\",function(a,b){var c=new F,d=a.f(),e=b.attributes;if(e)if(a insta" +
    "nceof H&&null===a.b||\"*\"==d)for(var d=0,f;f=e[d];d++)G(c,f);else(f" +
    "=e.getNamedItem(d))&&G(c,f);return c},!1),Nb=S(\"child\",function(a," +
    "b,c,d,e){return eb.call(null,a,b,q(c)?c:null,q(d)?d:null,e||new F)" +
    "},!1,!0);\nS(\"descendant\",bb,!1,!0);var Pb=S(\"descendant-or-self\",f" +
    "unction(a,b,c,d){var e=new F;ab(b,c,d)&&a.a(b)&&G(e,b);return bb(a" +
    ",b,c,d,e)},!1,!0),Kb=S(\"following\",function(a,b,c,d){var e=new F;d" +
    "o for(var f=b;f=f.nextSibling;)ab(f,c,d)&&a.a(f)&&G(e,f),e=bb(a,f," +
    "c,d,e);while(b=b.parentNode);return e},!1,!0);S(\"following-sibling" +
    "\",function(a,b){for(var c=new F,d=b;d=d.nextSibling;)a.a(d)&&G(c,d" +
    ");return c},!1);S(\"namespace\",function(){return new F},!1);\nvar Sb" +
    "=S(\"parent\",function(a,b){var c=new F;if(9==b.nodeType)return c;if" +
    "(2==b.nodeType)return G(c,b.ownerElement),c;var d=b.parentNode;a.a" +
    "(d)&&G(c,d);return c},!1),Lb=S(\"preceding\",function(a,b,c,d){var e" +
    "=new F,f=[];do f.unshift(b);while(b=b.parentNode);for(var g=1,h=f." +
    "length;g<h;g++){var p=[];for(b=f[g];b=b.previousSibling;)p.unshift" +
    "(b);for(var m=0,l=p.length;m<l;m++)b=p[m],ab(b,c,d)&&a.a(b)&&G(e,b" +
    "),e=bb(a,b,c,d,e)}return e},!0,!0);\nS(\"preceding-sibling\",function" +
    "(a,b){for(var c=new F,d=b;d=d.previousSibling;)a.a(d)&&hb(c,d);ret" +
    "urn c},!0);var Tb=S(\"self\",function(a,b){var c=new F;a.a(b)&&G(c,b" +
    ");return c},!1);/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu L" +
    "abs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby g" +
    "ranted, free of charge, to any person obtaining a copy\n of this so" +
    "ftware and associated documentation files (the \"Software\"), to\n de" +
    "al in the Software without restriction, including without limitati" +
    "on the\n rights to use, copy, modify, merge, publish, distribute, s" +
    "ublicense, and/or\n sell copies of the Software, and to permit pers" +
    "ons to whom the Software is\n furnished to do so, subject to the fo" +
    "llowing conditions:\n\n The above copyright notice and this permissi" +
    "on notice shall be included in\n all copies or substantial portions" +
    " of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARR" +
    "ANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED T" +
    "O THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PUR" +
    "POSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRI" +
    "GHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, " +
    "WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM" +
    ", OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DE" +
    "ALINGS\n IN THE SOFTWARE.\n*/\nfunction Ub(a){K.call(this,1);this.c=a" +
    ";this.g=a.g;this.b=a.b}r(Ub,K);Ub.prototype.a=function(a){return-M" +
    "(this.c,a)};Ub.prototype.toString=function(){return\"Unary Expressi" +
    "on: -\"+L(this.c)};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu" +
    " Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby" +
    " granted, free of charge, to any person obtaining a copy\n of this " +
    "software and associated documentation files (the \"Software\"), to\n " +
    "deal in the Software without restriction, including without limita" +
    "tion the\n rights to use, copy, modify, merge, publish, distribute," +
    " sublicense, and/or\n sell copies of the Software, and to permit pe" +
    "rsons to whom the Software is\n furnished to do so, subject to the " +
    "following conditions:\n\n The above copyright notice and this permis" +
    "sion notice shall be included in\n all copies or substantial portio" +
    "ns of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WA" +
    "RRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED" +
    " TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR P" +
    "URPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPY" +
    "RIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY" +
    ", WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FR" +
    "OM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER " +
    "DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Vb(a){K.call(this,4);this.c" +
    "=a;ob(this,va(this.c,function(a){return a.g}));pb(this,va(this.c,f" +
    "unction(a){return a.b}))}r(Vb,K);Vb.prototype.a=function(a){var b=" +
    "new F;t(this.c,function(c){c=c.a(a);if(!(c instanceof F))throw Err" +
    "or(\"Path expression must evaluate to NodeSet.\");b=gb(b,c)});return" +
    " b};Vb.prototype.toString=function(){return ua(this.c,function(a,b" +
    "){return a+L(b)},\"Union Expression:\")};/*\n\n The MIT License\n\n Copy" +
    "right (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n" +
    " Permission is hereby granted, free of charge, to any person obtai" +
    "ning a copy\n of this software and associated documentation files (" +
    "the \"Software\"), to\n deal in the Software without restriction, inc" +
    "luding without limitation the\n rights to use, copy, modify, merge," +
    " publish, distribute, sublicense, and/or\n sell copies of the Softw" +
    "are, and to permit persons to whom the Software is\n furnished to d" +
    "o so, subject to the following conditions:\n\n The above copyright n" +
    "otice and this permission notice shall be included in\n all copies " +
    "or substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDE" +
    "D \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCL"
  )
      .append(
    "UDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNE" +
    "SS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL" +
    " THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGE" +
    "S OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR O" +
    "THERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE" +
    " OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Wb(a,b" +
    "){this.a=a;this.b=b}function Xb(a){for(var b,c=[];;){T(a,\"Missing " +
    "right hand side of binary expression.\");b=Yb(a);var d=D(a.a);if(!d" +
    ")break;var e=(d=vb[d]||null)&&d.H;if(!e){a.a.a--;break}for(;c.leng" +
    "th&&e<=c[c.length-1].H;)b=new rb(c.pop(),c.pop(),b);c.push(b,d)}fo" +
    "r(;c.length;)b=new rb(c.pop(),c.pop(),b);return b}function T(a,b){" +
    "if($a(a.a))throw Error(b);}function Zb(a,b){var c=D(a.a);if(c!=b)t" +
    "hrow Error(\"Bad token, expected: \"+b+\" got: \"+c);}\nfunction $b(a){" +
    "a=D(a.a);if(\")\"!=a)throw Error(\"Bad token: \"+a);}function ac(a){a=" +
    "D(a.a);if(2>a.length)throw Error(\"Unclosed literal string\");return" +
    " new Cb(a)}function bc(a){var b=D(a.a),c=b.indexOf(\":\");if(-1==c)r" +
    "eturn new Db(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw Error(" +
    "\"Namespace prefix not declared: \"+d);b=b.substr(c+1);return new Db" +
    "(b,a)}\nfunction cc(a){var b,c=[],d;if(Jb(C(a.a))){b=D(a.a);d=C(a.a" +
    ");if(\"/\"==b&&($a(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?![0-9]" +
    ")[\\w]/.test(d)))return new Hb;d=new Hb;T(a,\"Missing next location " +
    "step.\");b=dc(a,b);c.push(b)}else{a:{b=C(a.a);d=b.charAt(0);switch(" +
    "d){case \"$\":throw Error(\"Variable reference not allowed in HTML XP" +
    "ath\");case \"(\":D(a.a);b=Xb(a);T(a,'unclosed \"(\"');Zb(a,\")\");break;" +
    "case '\"':case \"'\":b=ac(a);break;default:if(isNaN(+b))if(!Bb(b)&&/(" +
    "?![0-9])[\\w]/.test(d)&&\"(\"==C(a.a,1)){b=D(a.a);\nb=Ab[b]||null;D(a." +
    "a);for(d=[];\")\"!=C(a.a);){T(a,\"Missing function argument list.\");d" +
    ".push(Xb(a));if(\",\"!=C(a.a))break;D(a.a)}T(a,\"Unclosed function ar" +
    "gument list.\");$b(a);b=new yb(b,d)}else{b=null;break a}else b=new " +
    "Eb(+D(a.a))}\"[\"==C(a.a)&&(d=new Mb(ec(a)),b=new wb(b,d))}if(b)if(J" +
    "b(C(a.a)))d=b;else return b;else b=dc(a,\"/\"),d=new Ib,c.push(b)}fo" +
    "r(;Jb(C(a.a));)b=D(a.a),T(a,\"Missing next location step.\"),b=dc(a," +
    "b),c.push(b);return new Fb(d,c)}\nfunction dc(a,b){var c,d,e;if(\"/\"" +
    "!=b&&\"//\"!=b)throw Error('Step op should be \"/\" or \"//\"');if(\".\"==" +
    "C(a.a))return d=new R(Tb,new H(\"node\")),D(a.a),d;if(\"..\"==C(a.a))r" +
    "eturn d=new R(Sb,new H(\"node\")),D(a.a),d;var f;if(\"@\"==C(a.a))f=Gb" +
    ",D(a.a),T(a,\"Missing attribute name\");else if(\"::\"==C(a.a,1)){if(!" +
    "/(?![0-9])[\\w]/.test(C(a.a).charAt(0)))throw Error(\"Bad token: \"+D" +
    "(a.a));c=D(a.a);f=Rb[c]||null;if(!f)throw Error(\"No axis with name" +
    ": \"+c);D(a.a);T(a,\"Missing node name\")}else f=Nb;c=C(a.a);if(/(?![" +
    "0-9])[\\w]/.test(c.charAt(0)))if(\"(\"==\nC(a.a,1)){if(!Bb(c))throw Er" +
    "ror(\"Invalid node type: \"+c);c=D(a.a);if(!Bb(c))throw Error(\"Inval" +
    "id type name: \"+c);Zb(a,\"(\");T(a,\"Bad nodetype\");e=C(a.a).charAt(0" +
    ");var g=null;if('\"'==e||\"'\"==e)g=ac(a);T(a,\"Bad nodetype\");$b(a);c" +
    "=new H(c,g)}else c=bc(a);else if(\"*\"==c)c=bc(a);else throw Error(\"" +
    "Bad token: \"+D(a.a));e=new Mb(ec(a),f.a);return d||new R(f,c,e,\"//" +
    "\"==b)}\nfunction ec(a){for(var b=[];\"[\"==C(a.a);){D(a.a);T(a,\"Missi" +
    "ng predicate expression.\");var c=Xb(a);b.push(c);T(a,\"Unclosed pre" +
    "dicate expression.\");Zb(a,\"]\")}return b}function Yb(a){if(\"-\"==C(a" +
    ".a))return D(a.a),new Ub(Yb(a));var b=cc(a);if(\"|\"!=C(a.a))a=b;els" +
    "e{for(b=[b];\"|\"==D(a.a);)T(a,\"Missing next union location path.\")," +
    "b.push(cc(a));a.a.a--;a=new Vb(b)}return a};/*\n\n The MIT License\n\n" +
    " Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google I" +
    "nc.\n\n Permission is hereby granted, free of charge, to any person " +
    "obtaining a copy\n of this software and associated documentation fi" +
    "les (the \"Software\"), to\n deal in the Software without restriction" +
    ", including without limitation the\n rights to use, copy, modify, m" +
    "erge, publish, distribute, sublicense, and/or\n sell copies of the " +
    "Software, and to permit persons to whom the Software is\n furnished" +
    " to do so, subject to the following conditions:\n\n The above copyri" +
    "ght notice and this permission notice shall be included in\n all co" +
    "pies or substantial portions of the Software.\n\n THE SOFTWARE IS PR" +
    "OVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED," +
    " INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n " +
    "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT " +
    "SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, D" +
    "AMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT" +
    " OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOF" +
    "TWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction f" +
    "c(a,b){if(!a.length)throw Error(\"Empty XPath expression.\");var c=X" +
    "a(a);if($a(c))throw Error(\"Invalid XPath expression.\");b?da(b)||(b" +
    "=ga(b.lookupNamespaceURI,b)):b=n(null);var d=Xb(new Wb(c,b));if(!$" +
    "a(c))throw Error(\"Bad token: \"+D(c));this.evaluate=function(a,b){v" +
    "ar c=d.a(new Va(a));return new U(c,b)}}\nfunction U(a,b){if(0==b)if" +
    "(a instanceof F)b=4;else if(\"string\"==typeof a)b=2;else if(\"number" +
    "\"==typeof a)b=1;else if(\"boolean\"==typeof a)b=3;else throw Error(\"" +
    "Unexpected evaluation result.\");if(2!=b&&1!=b&&3!=b&&!(a instanceo" +
    "f F))throw Error(\"value could not be converted to the specified ty" +
    "pe\");this.resultType=b;var c;switch(b){case 2:this.stringValue=a i" +
    "nstanceof F?jb(a):\"\"+a;break;case 1:this.numberValue=a instanceof " +
    "F?+jb(a):+a;break;case 3:this.booleanValue=a instanceof F?0<a.l:!!" +
    "a;break;case 4:case 5:case 6:case 7:var d=\nI(a);c=[];for(var e=J(d" +
    ");e;e=J(d))c.push(e);this.snapshotLength=a.l;this.invalidIteratorS" +
    "tate=!1;break;case 8:case 9:this.singleNodeValue=ib(a);break;defau" +
    "lt:throw Error(\"Unknown XPathResult type.\");}var f=0;this.iterateN" +
    "ext=function(){if(4!=b&&5!=b)throw Error(\"iterateNext called with " +
    "wrong result type\");return f>=c.length?null:c[f++]};this.snapshotI" +
    "tem=function(a){if(6!=b&&7!=b)throw Error(\"snapshotItem called wit" +
    "h wrong result type\");return a>=c.length||0>a?null:c[a]}}U.ANY_TYP" +
    "E=0;\nU.NUMBER_TYPE=1;U.STRING_TYPE=2;U.BOOLEAN_TYPE=3;U.UNORDERED_" +
    "NODE_ITERATOR_TYPE=4;U.ORDERED_NODE_ITERATOR_TYPE=5;U.UNORDERED_NO" +
    "DE_SNAPSHOT_TYPE=6;U.ORDERED_NODE_SNAPSHOT_TYPE=7;U.ANY_UNORDERED_" +
    "NODE_TYPE=8;U.FIRST_ORDERED_NODE_TYPE=9;function gc(a){this.lookup" +
    "NamespaceURI=lb(a)}\nfunction hc(a){a=a||aa;var b=a.document;b.eval" +
    "uate||(a.XPathResult=U,b.evaluate=function(a,b,e,f){return(new fc(" +
    "a,e)).evaluate(b,f)},b.createExpression=function(a,b){return new f" +
    "c(a,b)},b.createNSResolver=function(a){return new gc(a)})}ba(\"wgxp" +
    "ath.install\",hc);/*xxx_rpl_lic*/\nvar V={};V.C=function(){var a={R:" +
    "\"http://www.w3.org/2000/svg\"};return function(b){return a[b]||null" +
    "}}();\nV.o=function(a,b,c){var d=x(a);if(!d.documentElement)return " +
    "null;hc(Fa(d));try{for(var e=d.createNSResolver?d.createNSResolver" +
    "(d.documentElement):V.C,f={},g=d.getElementsByTagName(\"*\"),h=0;h<g" +
    ".length;++h){var p=g[h],m=p.namespaceURI;if(!f[m]){var l=p.lookupP" +
    "refix(m);if(!l){var B=m.match(\".*/(\\\\w+)/?$\");B?l=B[1]:l=\"xhtml\"}f" +
    "[m]=l}}var N={},W;for(W in f)N[f[W]]=W;e=function(a){return N[a]||" +
    "null};try{return d.evaluate(b,a,e,c,null)}catch(Ob){if(\"TypeError\"" +
    "===Ob.name)return e=d.createNSResolver?d.createNSResolver(d.docume" +
    "ntElement):\nV.C,d.evaluate(b,a,e,c,null);throw Ob;}}catch(wc){thro" +
    "w new z(32,\"Unable to locate an element with the xpath expression " +
    "\"+b+\" because of the following error:\\n\"+wc);}};V.D=function(a,b){" +
    "if(!a||1!=a.nodeType)throw new z(32,'The result of the xpath expre" +
    "ssion \"'+b+'\" is: '+a+\". It should be an element.\");};\nV.s=functio" +
    "n(a,b){var c=function(){var c=V.o(b,a,9);return c?c.singleNodeValu" +
    "e||null:b.selectSingleNode?(c=x(b),c.setProperty&&c.setProperty(\"S" +
    "electionLanguage\",\"XPath\"),b.selectSingleNode(a)):null}();null===c" +
    "||V.D(c,a);return c};\nV.m=function(a,b){var c=function(){var c=V.o" +
    "(b,a,7);if(c){for(var e=c.snapshotLength,f=[],g=0;g<e;++g)f.push(c" +
    ".snapshotItem(g));return f}return b.selectNodes?(c=x(b),c.setPrope" +
    "rty&&c.setProperty(\"SelectionLanguage\",\"XPath\"),b.selectNodes(a)):" +
    "[]}();t(c,function(b){V.D(b,a)});return c};var ic={aliceblue:\"#f0f" +
    "8ff\",antiquewhite:\"#faebd7\",aqua:\"#00ffff\",aquamarine:\"#7fffd4\",az" +
    "ure:\"#f0ffff\",beige:\"#f5f5dc\",bisque:\"#ffe4c4\",black:\"#000000\",bla" +
    "nchedalmond:\"#ffebcd\",blue:\"#0000ff\",blueviolet:\"#8a2be2\",brown:\"#" +
    "a52a2a\",burlywood:\"#deb887\",cadetblue:\"#5f9ea0\",chartreuse:\"#7fff0" +
    "0\",chocolate:\"#d2691e\",coral:\"#ff7f50\",cornflowerblue:\"#6495ed\",co" +
    "rnsilk:\"#fff8dc\",crimson:\"#dc143c\",cyan:\"#00ffff\",darkblue:\"#00008" +
    "b\",darkcyan:\"#008b8b\",darkgoldenrod:\"#b8860b\",darkgray:\"#a9a9a9\",d" +
    "arkgreen:\"#006400\",\ndarkgrey:\"#a9a9a9\",darkkhaki:\"#bdb76b\",darkmag" +
    "enta:\"#8b008b\",darkolivegreen:\"#556b2f\",darkorange:\"#ff8c00\",darko" +
    "rchid:\"#9932cc\",darkred:\"#8b0000\",darksalmon:\"#e9967a\",darkseagree" +
    "n:\"#8fbc8f\",darkslateblue:\"#483d8b\",darkslategray:\"#2f4f4f\",darksl" +
    "ategrey:\"#2f4f4f\",darkturquoise:\"#00ced1\",darkviolet:\"#9400d3\",dee" +
    "ppink:\"#ff1493\",deepskyblue:\"#00bfff\",dimgray:\"#696969\",dimgrey:\"#" +
    "696969\",dodgerblue:\"#1e90ff\",firebrick:\"#b22222\",floralwhite:\"#fff" +
    "af0\",forestgreen:\"#228b22\",fuchsia:\"#ff00ff\",gainsboro:\"#dcdcdc\",\n" +
    "ghostwhite:\"#f8f8ff\",gold:\"#ffd700\",goldenrod:\"#daa520\",gray:\"#808" +
    "080\",green:\"#008000\",greenyellow:\"#adff2f\",grey:\"#808080\",honeydew" +
    ":\"#f0fff0\",hotpink:\"#ff69b4\",indianred:\"#cd5c5c\",indigo:\"#4b0082\"," +
    "ivory:\"#fffff0\",khaki:\"#f0e68c\",lavender:\"#e6e6fa\",lavenderblush:\"" +
    "#fff0f5\",lawngreen:\"#7cfc00\",lemonchiffon:\"#fffacd\",lightblue:\"#ad" +
    "d8e6\",lightcoral:\"#f08080\",lightcyan:\"#e0ffff\",lightgoldenrodyello" +
    "w:\"#fafad2\",lightgray:\"#d3d3d3\",lightgreen:\"#90ee90\",lightgrey:\"#d" +
    "3d3d3\",lightpink:\"#ffb6c1\",lightsalmon:\"#ffa07a\",\nlightseagreen:\"#" +
    "20b2aa\",lightskyblue:\"#87cefa\",lightslategray:\"#778899\",lightslate" +
    "grey:\"#778899\",lightsteelblue:\"#b0c4de\",lightyellow:\"#ffffe0\",lime" +
    ":\"#00ff00\",limegreen:\"#32cd32\",linen:\"#faf0e6\",magenta:\"#ff00ff\",m" +
    "aroon:\"#800000\",mediumaquamarine:\"#66cdaa\",mediumblue:\"#0000cd\",me" +
    "diumorchid:\"#ba55d3\",mediumpurple:\"#9370db\",mediumseagreen:\"#3cb37" +
    "1\",mediumslateblue:\"#7b68ee\",mediumspringgreen:\"#00fa9a\",mediumtur" +
    "quoise:\"#48d1cc\",mediumvioletred:\"#c71585\",midnightblue:\"#191970\"," +
    "mintcream:\"#f5fffa\",mistyrose:\"#ffe4e1\",\nmoccasin:\"#ffe4b5\",navajo" +
    "white:\"#ffdead\",navy:\"#000080\",oldlace:\"#fdf5e6\",olive:\"#808000\",o" +
    "livedrab:\"#6b8e23\",orange:\"#ffa500\",orangered:\"#ff4500\",orchid:\"#d" +
    "a70d6\",palegoldenrod:\"#eee8aa\",palegreen:\"#98fb98\",paleturquoise:\"" +
    "#afeeee\",palevioletred:\"#db7093\",papayawhip:\"#ffefd5\",peachpuff:\"#" +
    "ffdab9\",peru:\"#cd853f\",pink:\"#ffc0cb\",plum:\"#dda0dd\",powderblue:\"#" +
    "b0e0e6\",purple:\"#800080\",red:\"#ff0000\",rosybrown:\"#bc8f8f\",royalbl" +
    "ue:\"#4169e1\",saddlebrown:\"#8b4513\",salmon:\"#fa8072\",sandybrown:\"#f" +
    "4a460\",seagreen:\"#2e8b57\",\nseashell:\"#fff5ee\",sienna:\"#a0522d\",sil" +
    "ver:\"#c0c0c0\",skyblue:\"#87ceeb\",slateblue:\"#6a5acd\",slategray:\"#70" +
    "8090\",slategrey:\"#708090\",snow:\"#fffafa\",springgreen:\"#00ff7f\",ste" +
    "elblue:\"#4682b4\",tan:\"#d2b48c\",teal:\"#008080\",thistle:\"#d8bfd8\",to" +
    "mato:\"#ff6347\",turquoise:\"#40e0d0\",violet:\"#ee82ee\",wheat:\"#f5deb3" +
    "\",white:\"#ffffff\",whitesmoke:\"#f5f5f5\",yellow:\"#ffff00\",yellowgree" +
    "n:\"#9acd32\"};/*xxx_rpl_lic*/\nvar jc=\"backgroundColor borderTopColo" +
    "r borderRightColor borderBottomColor borderLeftColor color outline" +
    "Color\".split(\" \"),kc=/#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])/,lc" +
    "=/^#(?:[0-9a-f]{3}){1,2}$/i,mc=/^(?:rgba)?\\((\\d{1,3}),\\s?(\\d{1,3})" +
    ",\\s?(\\d{1,3}),\\s?(0|1|0\\.\\d*)\\)$/i,nc=/^(?:rgb)?\\((0|[1-9]\\d{0,2})" +
    ",\\s?(0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2})\\)$/i;/*xxx_rpl_lic*/\nfunc" +
    "tion X(a,b){return!!a&&1==a.nodeType&&(!b||a.tagName.toUpperCase()" +
    "==b)}var oc=/[;]+(?=(?:(?:[^\"]*\"){2})*[^\"]*$)(?=(?:(?:[^']*'){2})*" +
    "[^']*$)(?=(?:[^()]*\\([^()]*\\))*[^()]*$)/;function pc(a){var b=[];t" +
    "(a.split(oc),function(a){var d=a.indexOf(\":\");0<d&&(a=[a.slice(0,d" +
    "),a.slice(d+1)],2==a.length&&b.push(a[0].toLowerCase(),\":\",a[1],\";" +
    "\"))});b=b.join(\"\");return b=\";\"==b.charAt(b.length-1)?b:b+\";\"}\nfun" +
    "ction qc(a,b){b=b.toLowerCase();if(\"style\"==b)return pc(a.style.cs" +
    "sText);var c=a.getAttributeNode(b);return c&&c.specified?c.value:n" +
    "ull}function rc(a){for(a=a.parentNode;a&&1!=a.nodeType&&9!=a.nodeT" +
    "ype&&11!=a.nodeType;)a=a.parentNode;return X(a)?a:null}\nfunction Y" +
    "(a,b){var c=oa(b);if(\"float\"==c||\"cssFloat\"==c||\"styleFloat\"==c)c=" +
    "\"cssFloat\";var d;a:{d=c;var e=x(a);if(e.defaultView&&e.defaultView" +
    ".getComputedStyle&&(e=e.defaultView.getComputedStyle(a,null))){d=e" +
    "[d]||e.getPropertyValue(d)||\"\";break a}d=\"\"}d=d||sc(a,c);if(null==" +
    "=d)d=null;else if(0<=sa(jc,c)){b:{var f=d.match(mc);if(f){var c=Nu" +
    "mber(f[1]),e=Number(f[2]),g=Number(f[3]),f=Number(f[4]);if(0<=c&&2" +
    "55>=c&&0<=e&&255>=e&&0<=g&&255>=g&&0<=f&&1>=f){c=[c,e,g,f];break b" +
    "}}c=null}if(!c)b:{if(g=d.match(nc))if(c=\nNumber(g[1]),e=Number(g[2" +
    "]),g=Number(g[3]),0<=c&&255>=c&&0<=e&&255>=e&&0<=g&&255>=g){c=[c,e" +
    ",g,1];break b}c=null}if(!c)b:{c=d.toLowerCase();e=ic[c.toLowerCase" +
    "()];if(!e&&(e=\"#\"==c.charAt(0)?c:\"#\"+c,4==e.length&&(e=e.replace(k" +
    "c,\"#$1$1$2$2$3$3\")),!lc.test(e))){c=null;break b}c=[parseInt(e.sub" +
    "str(1,2),16),parseInt(e.substr(3,2),16),parseInt(e.substr(5,2),16)" +
    ",1]}d=c?\"rgba(\"+c.join(\", \")+\")\":d}return d}\nfunction sc(a,b){var " +
    "c=a.currentStyle||a.style,d=c[b];void 0===d&&da(c.getPropertyValue" +
    ")&&(d=c.getPropertyValue(b));return\"inherit\"!=d?void 0!==d?d:null:" +
    "(c=rc(a))?sc(c,b):null}\nfunction tc(a,b){function c(a){if(\"none\"==" +
    "Y(a,\"display\"))return!1;a=rc(a);return!a||c(a)}function d(a){var b" +
    "=uc(a);return 0<b.height&&0<b.width?!0:X(a,\"PATH\")&&(0<b.height||0" +
    "<b.width)?(a=Y(a,\"stroke-width\"),!!a&&0<parseInt(a,10)):\"hidden\"!=" +
    "Y(a,\"overflow\")&&va(a.childNodes,function(a){return 3==a.nodeType|" +
    "|X(a)&&d(a)})}function e(a){return\"hidden\"==vc(a)&&wa(a.childNodes" +
    ",function(a){return!X(a)||e(a)})}if(!X(a))throw Error(\"Argument to" +
    " isShown must be of type Element\");if(X(a,\"BODY\"))return!0;if(X(a," +
    "\n\"OPTION\")||X(a,\"OPTGROUP\")){var f=La(a,function(a){return X(a,\"SE" +
    "LECT\")});return!!f&&tc(f,!0)}return(f=xc(a))?!!f.F&&0<f.rect.width" +
    "&&0<f.rect.height&&tc(f.F,b):X(a,\"INPUT\")&&\"hidden\"==a.type.toLowe" +
    "rCase()||X(a,\"NOSCRIPT\")||\"hidden\"==Y(a,\"visibility\")||!c(a)||!b&&" +
    "0==yc(a)||!d(a)?!1:!e(a)}\nfunction vc(a){function b(a){function b(" +
    "a){return a==g?!0:0==Y(a,\"display\").lastIndexOf(\"inline\",0)||\"abso" +
    "lute\"==c&&\"static\"==Y(a,\"position\")?!1:!0}var c=Y(a,\"position\");if" +
    "(\"fixed\"==c)return m=!0,a==g?null:g;for(a=rc(a);a&&!b(a);)a=rc(a);" +
    "return a}function c(a){var b=a;if(\"visible\"==p)if(a==g&&h)b=h;else" +
    " if(a==h)return{x:\"visible\",y:\"visible\"};b={x:Y(b,\"overflow-x\"),y:" +
    "Y(b,\"overflow-y\")};a==g&&(b.x=\"visible\"==b.x?\"auto\":b.x,b.y=\"visib" +
    "le\"==b.y?\"auto\":b.y);return b}function d(a){if(a==g){var b=(new Ea" +
    "(f)).a;\na=b.body||b.documentElement;b=b.parentWindow||b.defaultVie" +
    "w;a=new u(b.pageXOffset||a.scrollLeft,b.pageYOffset||a.scrollTop)}" +
    "else a=new u(a.scrollLeft,a.scrollTop);return a}var e=zc(a),f=x(a)" +
    ",g=f.documentElement,h=f.body,p=Y(g,\"overflow\"),m;for(a=b(a);a;a=b" +
    "(a)){var l=c(a);if(\"visible\"!=l.x||\"visible\"!=l.y){var B=uc(a);if(" +
    "0==B.width||0==B.height)return\"hidden\";var N=e.right<B.left,W=e.bo" +
    "ttom<B.top;if(N&&\"hidden\"==l.x||W&&\"hidden\"==l.y)return\"hidden\";if" +
    "(N&&\"visible\"!=l.x||W&&\"visible\"!=l.y){N=d(a);W=\ne.bottom<B.top-N." +
    "y;if(e.right<B.left-N.x&&\"visible\"!=l.x||W&&\"visible\"!=l.x)return\"" +
    "hidden\";e=vc(a);return\"hidden\"==e?\"hidden\":\"scroll\"}N=e.left>=B.le" +
    "ft+B.width;B=e.top>=B.top+B.height;if(N&&\"hidden\"==l.x||B&&\"hidden" +
    "\"==l.y)return\"hidden\";if(N&&\"visible\"!=l.x||B&&\"visible\"!=l.y){if(" +
    "m&&(l=d(a),e.left>=g.scrollWidth-l.x||e.right>=g.scrollHeight-l.y)" +
    ")return\"hidden\";e=vc(a);return\"hidden\"==e?\"hidden\":\"scroll\"}}}retu" +
    "rn\"none\"}\nfunction uc(a){var b=xc(a);if(b)return b.rect;if(X(a,\"HT" +
    "ML\"))return a=x(a),a=(Fa(a)||window).document,a=\"CSS1Compat\"==a.co" +
    "mpatMode?a.documentElement:a.body,a=new v(a.clientWidth,a.clientHe" +
    "ight),new A(0,0,a.width,a.height);var c;try{c=a.getBoundingClientR" +
    "ect()}catch(d){return new A(0,0,0,0)}return new A(c.left,c.top,c.r" +
    "ight-c.left,c.bottom-c.top)}\nfunction xc(a){var b=X(a,\"MAP\");if(!b" +
    "&&!X(a,\"AREA\"))return null;var c=b?a:X(a.parentNode,\"MAP\")?a.paren" +
    "tNode:null,d=null,e=null;if(c&&c.name&&(d=x(c),d=V.s('/descendant:" +
    ":*[@usemap = \"#'+c.name+'\"]',d))&&(e=uc(d),!b&&\"default\"!=a.shape." +
    "toLowerCase())){var f=Ac(a);a=Math.min(Math.max(f.left,0),e.width)" +
    ";b=Math.min(Math.max(f.top,0),e.height);c=Math.min(f.width,e.width" +
    "-a);f=Math.min(f.height,e.height-b);e=new A(a+e.left,b+e.top,c,f)}" +
    "return{F:d,rect:e||new A(0,0,0,0)}}\nfunction Ac(a){var b=a.shape.t" +
    "oLowerCase();a=a.coords.split(\",\");if(\"rect\"==b&&4==a.length){var " +
    "b=a[0],c=a[1];return new A(b,c,a[2]-b,a[3]-c)}if(\"circle\"==b&&3==a" +
    ".length)return b=a[2],new A(a[0]-b,a[1]-b,2*b,2*b);if(\"poly\"==b&&2" +
    "<a.length){for(var b=a[0],c=a[1],d=b,e=c,f=2;f+1<a.length;f+=2)b=M" +
    "ath.min(b,a[f]),d=Math.max(d,a[f]),c=Math.min(c,a[f+1]),e=Math.max" +
    "(e,a[f+1]);return new A(b,c,d-b,e-c)}return new A(0,0,0,0)}functio" +
    "n zc(a){a=uc(a);return new Ua(a.top,a.left+a.width,a.top+a.height," +
    "a.left)}\nfunction Bc(a){return a.replace(/^[^\\S\\xa0]+|[^\\S\\xa0]+$/" +
    "g,\"\")}function Cc(a){var b=[];Dc(a,b);var c=b;a=c.length;for(var b" +
    "=Array(a),c=q(c)?c.split(\"\"):c,d=0;d<a;d++)d in c&&(b[d]=Bc.call(v" +
    "oid 0,c[d]));return Bc(b.join(\"\\n\")).replace(/\\xa0/g,\" \")}\nfunctio" +
    "n Dc(a,b){if(X(a,\"BR\"))b.push(\"\");else{var c=X(a,\"TD\"),d=Y(a,\"disp" +
    "lay\"),e=!c&&!(0<=sa(Ec,d)),f=void 0!=a.previousElementSibling?a.pr" +
    "eviousElementSibling:Ga(a.previousSibling),f=f?Y(f,\"display\"):\"\",g" +
    "=Y(a,\"float\")||Y(a,\"cssFloat\")||Y(a,\"styleFloat\");!e||\"run-in\"==f&" +
    "&\"none\"==g||/^[\\s\\xa0]*$/.test(b[b.length-1]||\"\")||b.push(\"\");var " +
    "h=tc(a),p=null,m=null;h&&(p=Y(a,\"white-space\"),m=Y(a,\"text-transfo" +
    "rm\"));t(a.childNodes,function(a){3==a.nodeType&&h?Fc(a,b,p,m):X(a)" +
    "&&Dc(a,b)});f=b[b.length-1]||\"\";\n!c&&\"table-cell\"!=d||!f||ka(f)||(" +
    "b[b.length-1]+=\" \");e&&\"run-in\"!=d&&!/^[\\s\\xa0]*$/.test(f)&&b.push" +
    "(\"\")}}var Ec=\"inline inline-block inline-table none table-cell tab" +
    "le-column table-column-group\".split(\" \");\nfunction Fc(a,b,c,d){a=a" +
    ".nodeValue.replace(/[\\u200b\\u200e\\u200f]/g,\"\");a=a.replace(/(\\r\\n|" +
    "\\r|\\n)/g,\"\\n\");if(\"normal\"==c||\"nowrap\"==c)a=a.replace(/\\n/g,\" \");" +
    "a=\"pre\"==c||\"pre-wrap\"==c?a.replace(/[ \\f\\t\\v\\u2028\\u2029]/g,\"\\u00" +
    "a0\"):a.replace(/[\\ \\f\\t\\v\\u2028\\u2029]+/g,\" \");\"capitalize\"==d?a=a" +
    ".replace(/(^|\\s)(\\S)/g,function(a,b,c){return b+c.toUpperCase()}):" +
    "\"uppercase\"==d?a=a.toUpperCase():\"lowercase\"==d&&(a=a.toLowerCase(" +
    "));c=b.pop()||\"\";ka(c)&&0==a.lastIndexOf(\" \",0)&&(a=a.substr(1));b" +
    ".push(c+a)}\nfunction yc(a){var b=1,c=Y(a,\"opacity\");c&&(b=Number(c" +
    "));(a=rc(a))&&(b*=yc(a));return b};/*xxx_rpl_lic*/\nvar Gc={w:funct" +
    "ion(a,b){return!(!a.querySelectorAll||!a.querySelector)&&!/^\\d.*/." +
    "test(b)},s:function(a,b){var c=w(b),d=q(a)?c.a.getElementById(a):a" +
    ";if(!d)return null;if(qc(d,\"id\")==a&&Ha(b,d))return d;c=y(c,\"*\");r" +
    "eturn xa(c,function(c){return qc(c,\"id\")==a&&Ha(b,c)})},m:function" +
    "(a,b){if(!a)return[];if(Gc.w(b,a))try{return b.querySelectorAll(\"#" +
    "\"+Gc.K(a))}catch(c){return[]}var d=y(w(b),\"*\",null,b);return ta(d," +
    "function(b){return qc(b,\"id\")==a})},K:function(a){return a.replace" +
    "(/(['\"\\\\#.:;,!?+<>=~*^$|%&@`{}\\-\\/\\[\\]\\(\\)])/g,\n\"\\\\$1\")}};/*xxx_rp" +
    "l_lic*/\nvar Z={},Hc={};Z.J=function(a,b,c){var d;try{d=Ta.m(\"a\",b)" +
    "}catch(e){d=y(w(b),\"A\",null,b)}return xa(d,function(b){b=Cc(b);ret" +
    "urn c&&-1!=b.indexOf(a)||b==a})};Z.G=function(a,b,c){var d;try{d=T" +
    "a.m(\"a\",b)}catch(e){d=y(w(b),\"A\",null,b)}return ta(d,function(b){b" +
    "=Cc(b);return c&&-1!=b.indexOf(a)||b==a})};Z.s=function(a,b){retur" +
    "n Z.J(a,b,!1)};Z.m=function(a,b){return Z.G(a,b,!1)};Hc.s=function" +
    "(a,b){return Z.J(a,b,!0)};Hc.m=function(a,b){return Z.G(a,b,!0)};/" +
    "*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\nvar Ic={s:function(a,b){return b.ge" +
    "tElementsByTagName(a)[0]||null},m:function(a,b){return b.getElemen" +
    "tsByTagName(a)}};/*xxx_rpl_lic*/\nvar Jc={className:Oa,\"class name\"" +
    ":Oa,css:Ta,\"css selector\":Ta,id:Gc,linkText:Z,\"link text\":Z,name:{" +
    "s:function(a,b){var c=y(w(b),\"*\",null,b);return xa(c,function(b){r" +
    "eturn qc(b,\"name\")==a})},m:function(a,b){var c=y(w(b),\"*\",null,b);" +
    "return ta(c,function(b){return qc(b,\"name\")==a})}},partialLinkText" +
    ":Hc,\"partial link text\":Hc,tagName:Ic,\"tag name\":Ic,xpath:V};/*xxx" +
    "_rpl_lic*/\nba(\"_\",function(a,b){for(var c=b||Ma,d=c.frames.length," +
    "e=0;e<d;e++){var f=c.frames[e];if((f.frameElement||f).name==a)retu" +
    "rn f.document?f:f.contentWindow||Fa(f.contentDocument||f.contentWi" +
    "ndow.document)}var g;a:{e={id:a};c=c.document;b:{for(g in e)if(e.h" +
    "asOwnProperty(g))break b;g=null}if(g&&(d=Jc[g])&&da(d.m)){g=d.m(e[" +
    "g],c||Ma.document);break a}throw Error(\"Unsupported locator strate" +
    "gy: \"+g);}for(e=0;e<g.length;e++)if(c=g[e],X(c,\"FRAME\")||X(c,\"IFRA" +
    "ME\"))return e=g[e],e.contentWindow||Fa(e.contentDocument||\ne.conte" +
    "ntWindow.document);return null});;return this._.apply(null,argumen" +
    "ts);}).apply({navigator:typeof window!=\"undefined\"?window.navigato" +
    "r:null},arguments);}\n"
  )
  .toString();
  static final String FRAME_BY_ID_OR_NAME_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String FRAME_BY_ID_OR_NAME_ANDROID_original() {
    return FRAME_BY_ID_OR_NAME_ANDROID.replaceAll("xxx_rpl_lic", FRAME_BY_ID_OR_NAME_ANDROID_license);
  }

/* field: FRAME_BY_INDEX_ANDROID license: 

 Copyright 2014 Software Freedom Conservancy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
  static final String FRAME_BY_INDEX_ANDROID =
  new StringBuilder(
    "function(){return(function(){function h(a){return function(){retur" +
    "n this[a]}}function k(a){return function(){return a}}var l=this;fu" +
    "nction aa(a,b){var c=a.split(\".\"),d=l;c[0]in d||!d.execScript||d.e" +
    "xecScript(\"var \"+c[0]);for(var e;c.length&&(e=c.shift());)c.length" +
    "||void 0===b?d[e]?d=d[e]:d=d[e]={}:d[e]=b}\nfunction ba(a){var b=ty" +
    "peof a;if(\"object\"==b)if(a){if(a instanceof Array)return\"array\";if" +
    "(a instanceof Object)return b;var c=Object.prototype.toString.call" +
    "(a);if(\"[object Window]\"==c)return\"object\";if(\"[object Array]\"==c|" +
    "|\"number\"==typeof a.length&&\"undefined\"!=typeof a.splice&&\"undefin" +
    "ed\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"splic" +
    "e\"))return\"array\";if(\"[object Function]\"==c||\"undefined\"!=typeof a" +
    ".call&&\"undefined\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEn" +
    "umerable(\"call\"))return\"function\"}else return\"null\";\nelse if(\"func" +
    "tion\"==b&&\"undefined\"==typeof a.call)return\"object\";return b}funct" +
    "ion m(a){return\"string\"==typeof a}function ca(a,b,c){return a.call" +
    ".apply(a.bind,arguments)}function da(a,b,c){if(!a)throw Error();if" +
    "(2<arguments.length){var d=Array.prototype.slice.call(arguments,2)" +
    ";return function(){var c=Array.prototype.slice.call(arguments);Arr" +
    "ay.prototype.unshift.apply(c,d);return a.apply(b,c)}}return functi" +
    "on(){return a.apply(b,arguments)}}\nfunction n(a,b,c){n=Function.pr" +
    "ototype.bind&&-1!=Function.prototype.bind.toString().indexOf(\"nati" +
    "ve code\")?ca:da;return n.apply(null,arguments)}function ea(a,b){va" +
    "r c=Array.prototype.slice.call(arguments,1);return function(){var " +
    "b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}}\nfun" +
    "ction r(a,b){function c(){}c.prototype=b.prototype;a.G=b.prototype" +
    ";a.prototype=new c;a.prototype.constructor=a;a.F=function(a,c,f){f" +
    "or(var g=Array(arguments.length-2),w=2;w<arguments.length;w++)g[w-" +
    "2]=arguments[w];return b.prototype[c].apply(a,g)}}Function.prototy" +
    "pe.bind=Function.prototype.bind||function(a,b){if(1<arguments.leng" +
    "th){var c=Array.prototype.slice.call(arguments,1);c.unshift(this,a" +
    ");return n.apply(null,c)}return n(this,a)};function t(a){if(Error." +
    "captureStackTrace)Error.captureStackTrace(this,t);else{var b=Error" +
    "().stack;b&&(this.stack=b)}a&&(this.message=String(a))}r(t,Error);" +
    "t.prototype.name=\"CustomError\";function fa(a,b){for(var c=a.split(" +
    "\"%s\"),d=\"\",e=Array.prototype.slice.call(arguments,1);e.length&&1<c" +
    ".length;)d+=c.shift()+e.shift();return d+c.join(\"%s\")}var ga=Strin" +
    "g.prototype.trim?function(a){return a.trim()}:function(a){return a" +
    ".replace(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function ha(a,b){return a<b" +
    "?-1:a>b?1:0};function ia(a,b){b.unshift(a);t.call(this,fa.apply(nu" +
    "ll,b));b.shift()}r(ia,t);ia.prototype.name=\"AssertionError\";functi" +
    "on ja(a,b,c){if(!a){var d=\"Assertion failed\";if(b)var d=d+(\": \"+b)" +
    ",e=Array.prototype.slice.call(arguments,2);throw new ia(\"\"+d,e||[]" +
    ");}};var u=Array.prototype;function v(a,b){for(var c=a.length,d=m(" +
    "a)?a.split(\"\"):a,e=0;e<c;e++)e in d&&b.call(void 0,d[e],e,a)}funct" +
    "ion x(a,b,c){var d=c;v(a,function(c,f){d=b.call(void 0,d,c,f,a)});" +
    "return d}function y(a,b){for(var c=a.length,d=m(a)?a.split(\"\"):a,e" +
    "=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;return!1}fu" +
    "nction ka(a){return u.concat.apply(u,arguments)}function la(a,b,c)" +
    "{ja(null!=a.length);return 2>=arguments.length?u.slice.call(a,b):u" +
    ".slice.call(a,b,c)};function ma(a){var b=arguments.length;if(1==b&" +
    "&\"array\"==ba(arguments[0]))return ma.apply(null,arguments[0]);for(" +
    "var c={},d=0;d<b;d++)c[arguments[d]]=!0;return c};ma(\"area base br" +
    " col command embed hr img input keygen link meta param source trac" +
    "k wbr\".split(\" \"));var na;a:{var oa=l.navigator;if(oa){var pa=oa.u" +
    "serAgent;if(pa){na=pa;break a}}na=\"\"};function qa(a,b){if(a.contai" +
    "ns&&1==b.nodeType)return a==b||a.contains(b);if(\"undefined\"!=typeo" +
    "f a.compareDocumentPosition)return a==b||Boolean(a.compareDocument" +
    "Position(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==a}\nfunction" +
    " ra(a,b){if(a==b)return 0;if(a.compareDocumentPosition)return a.co" +
    "mpareDocumentPosition(b)&2?1:-1;if(\"sourceIndex\"in a||a.parentNode" +
    "&&\"sourceIndex\"in a.parentNode){var c=1==a.nodeType,d=1==b.nodeTyp" +
    "e;if(c&&d)return a.sourceIndex-b.sourceIndex;var e=a.parentNode,f=" +
    "b.parentNode;return e==f?sa(a,b):!c&&qa(e,b)?-1*ta(a,b):!d&&qa(f,a" +
    ")?ta(b,a):(c?a.sourceIndex:e.sourceIndex)-(d?b.sourceIndex:f.sourc" +
    "eIndex)}ja(a,\"Node cannot be null or undefined.\");d=9==a.nodeType?" +
    "a:a.ownerDocument||a.document;c=\nd.createRange();c.selectNode(a);c" +
    ".collapse(!0);d=d.createRange();d.selectNode(b);d.collapse(!0);ret" +
    "urn c.compareBoundaryPoints(l.Range.START_TO_END,d)}function ta(a," +
    "b){var c=a.parentNode;if(c==b)return-1;for(var d=b;d.parentNode!=c" +
    ";)d=d.parentNode;return sa(d,a)}function sa(a,b){for(var c=b;c=c.p" +
    "reviousSibling;)if(c==a)return-1;return 1};/*xxx_rpl_lic*/\nvar ua=" +
    "window;/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\nfunction va(a){return(a=a.e" +
    "xec(na))?a[1]:\"\"}va(/Android\\s+([0-9.]+)/)||va(/Version\\/([0-9.]+)" +
    "/);/*xxx_rpl_lic*/\nfunction wa(a){var b=0,c=ga(String(xa)).split(\"" +
    ".\");a=ga(String(a)).split(\".\");for(var d=Math.max(c.length,a.lengt" +
    "h),e=0;0==b&&e<d;e++){var f=c[e]||\"\",g=a[e]||\"\",w=RegExp(\"(\\\\d*)(\\" +
    "\\D*)\",\"g\"),p=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\");do{var q=w.exec(f)||[\"\",\"\"" +
    ",\"\"],C=p.exec(g)||[\"\",\"\",\"\"];if(0==q[0].length&&0==C[0].length)bre" +
    "ak;b=ha(0==q[1].length?0:parseInt(q[1],10),0==C[1].length?0:parseI" +
    "nt(C[1],10))||ha(0==q[2].length,0==C[2].length)||ha(q[2],C[2])}whi" +
    "le(0==b)}}\nvar ya=/Android\\s+([0-9\\.]+)/.exec(na),xa=ya?ya[1]:\"0\";" +
    "wa(2.3);wa(4);/*xxx_rpl_lic*/\n/*\n\n The MIT License\n\n Copyright (c)" +
    " 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permissi" +
    "on is hereby granted, free of charge, to any person obtaining a co" +
    "py\n of this software and associated documentation files (the \"Soft" +
    "ware\"), to\n deal in the Software without restriction, including wi" +
    "thout limitation the\n rights to use, copy, modify, merge, publish," +
    " distribute, sublicense, and/or\n sell copies of the Software, and " +
    "to permit persons to whom the Software is\n furnished to do so, sub" +
    "ject to the following conditions:\n\n The above copyright notice and" +
    " this permission notice shall be included in\n all copies or substa" +
    "ntial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\"" +
    ", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT" +
    " NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A " +
    "PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUT" +
    "HORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHE" +
    "R\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE," +
    " ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE U" +
    "SE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction z(a,b,c){this.a" +
    "=a;this.b=b||1;this.f=c||1};/*\n\n The MIT License\n\n Copyright (c) 2" +
    "007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission" +
    " is hereby granted, free of charge, to any person obtaining a copy" +
    "\n of this software and associated documentation files (the \"Softwa" +
    "re\"), to\n deal in the Software without restriction, including with" +
    "out limitation the\n rights to use, copy, modify, merge, publish, d" +
    "istribute, sublicense, and/or\n sell copies of the Software, and to" +
    " permit persons to whom the Software is\n furnished to do so, subje" +
    "ct to the following conditions:\n\n The above copyright notice and t" +
    "his permission notice shall be included in\n all copies or substant" +
    "ial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", " +
    "WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT N" +
    "OT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PA" +
    "RTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHO" +
    "RS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
    " LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, A" +
    "RISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE" +
    " OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Cop" +
    "yright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n" +
    "\n Permission is hereby granted, free of charge, to any person obta" +
    "ining a copy\n of this software and associated documentation files " +
    "(the \"Software\"), to\n deal in the Software without restriction, in" +
    "cluding without limitation the\n rights to use, copy, modify, merge" +
    ", publish, distribute, sublicense, and/or\n sell copies of the Soft" +
    "ware, and to permit persons to whom the Software is\n furnished to " +
    "do so, subject to the following conditions:\n\n The above copyright " +
    "notice and this permission notice shall be included in\n all copies" +
    " or substantial portions of the Software.\n\n THE SOFTWARE IS PROVID" +
    "ED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INC" +
    "LUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITN" +
    "ESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHAL" +
    "L THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAG" +
    "ES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR " +
    "OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWAR" +
    "E OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT L" +
    "icense\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 " +
    "Google Inc.\n\n Permission is hereby granted, free of charge, to any" +
    " person obtaining a copy\n of this software and associated document" +
    "ation files (the \"Software\"), to\n deal in the Software without res" +
    "triction, including without limitation the\n rights to use, copy, m" +
    "odify, merge, publish, distribute, sublicense, and/or\n sell copies" +
    " of the Software, and to permit persons to whom the Software is\n f" +
    "urnished to do so, subject to the following conditions:\n\n The abov" +
    "e copyright notice and this permission notice shall be included in" +
    "\n all copies or substantial portions of the Software.\n\n THE SOFTWA" +
    "RE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n " +
    "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTAB" +
    "ILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN N" +
    "O EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY " +
    "CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRA" +
    "CT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH" +
    " THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfu" +
    "nction za(a){this.b=a;this.a=0}function Aa(a){a=a.match(Ba);for(va" +
    "r b=0;b<a.length;b++)Ca.test(a[b])&&a.splice(b,1);return new za(a)" +
    "}var Ba=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\/\\\\" +
    "/|\\\\.\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|\\\\s" +
    "+|.\",\"g\"),Ca=/^\\s/;function A(a,b){return a.b[a.a+(b||0)]}function" +
    " B(a){return a.b[a.a++]}function Da(a){return a.b.length<=a.a};/*\n" +
    "\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyrigh" +
    "t (c) 2012 Google Inc.\n\n Permission is hereby granted, free of cha" +
    "rge, to any person obtaining a copy\n of this software and associat" +
    "ed documentation files (the \"Software\"), to\n deal in the Software " +
    "without restriction, including without limitation the\n rights to u" +
    "se, copy, modify, merge, publish, distribute, sublicense, and/or\n " +
    "sell copies of the Software, and to permit persons to whom the Sof" +
    "tware is\n furnished to do so, subject to the following conditions:" +
    "\n\n The above copyright notice and this permission notice shall be " +
    "included in\n all copies or substantial portions of the Software.\n\n" +
    " THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, E" +
    "XPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF" +
    " MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRING" +
    "EMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIAB" +
    "LE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTIO" +
    "N OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONN" +
    "ECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFT" +
    "WARE.\n*/\nfunction D(a){var b=null,c=a.nodeType;1==c&&(b=a.textCont" +
    "ent,b=void 0==b||null==b?a.innerText:b,b=void 0==b||null==b?\"\":b);" +
    "if(\"string\"!=typeof b)if(9==c||1==c){a=9==c?a.documentElement:a.fi" +
    "rstChild;for(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a.nodeVal" +
    "ue),d[c++]=a;while(a=a.firstChild);for(;c&&!(a=d[--c].nextSibling)" +
    ";);}}else b=a.nodeValue;return\"\"+b}\nfunction E(a,b,c){if(null===b)" +
    "return!0;try{if(!a.getAttribute)return!1}catch(d){return!1}return " +
    "null==c?!!a.getAttribute(b):a.getAttribute(b,2)==c}function F(a,b," +
    "c,d,e){return Ea.call(null,a,b,m(c)?c:null,m(d)?d:null,e||new G)}\n" +
    "function Ea(a,b,c,d,e){b.getElementsByName&&d&&\"name\"==c?(b=b.getE" +
    "lementsByName(d),v(b,function(b){a.a(b)&&H(e,b)})):b.getElementsBy" +
    "ClassName&&d&&\"class\"==c?(b=b.getElementsByClassName(d),v(b,functi" +
    "on(b){b.className==d&&a.a(b)&&H(e,b)})):a instanceof I?Fa(a,b,c,d," +
    "e):b.getElementsByTagName&&(b=b.getElementsByTagName(a.f()),v(b,fu" +
    "nction(a){E(a,c,d)&&H(e,a)}));return e}function Ga(a,b,c,d,e){for(" +
    "b=b.firstChild;b;b=b.nextSibling)E(b,c,d)&&a.a(b)&&H(e,b);return e" +
    "}\nfunction Fa(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)E(b," +
    "c,d)&&a.a(b)&&H(e,b),Fa(a,b,c,d,e)};/*\n\n The MIT License\n\n Copyrig" +
    "ht (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Pe" +
    "rmission is hereby granted, free of charge, to any person obtainin" +
    "g a copy\n of this software and associated documentation files (the" +
    " \"Software\"), to\n deal in the Software without restriction, includ" +
    "ing without limitation the\n rights to use, copy, modify, merge, pu" +
    "blish, distribute, sublicense, and/or\n sell copies of the Software" +
    ", and to permit persons to whom the Software is\n furnished to do s" +
    "o, subject to the following conditions:\n\n The above copyright noti" +
    "ce and this permission notice shall be included in\n all copies or " +
    "substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"" +
    "AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDI" +
    "NG BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS " +
    "FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL TH" +
    "E\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES O" +
    "R OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHE" +
    "RWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR" +
    " THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction G(){this." +
    "b=this.a=null;this.l=0}function Ha(a){this.node=a;this.a=this.b=nu" +
    "ll}function Ia(a,b){if(!a.a)return b;if(!b.a)return a;for(var c=a." +
    "a,d=b.a,e=null,f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d.a):0" +
    "<ra(c.node,d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f,e=f" +
    ",g++;for(f=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.l=g;return a}fu" +
    "nction Ja(a,b){var c=new Ha(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a.a=c" +
    ";a.l++}function H(a,b){var c=new Ha(b);c.b=a.b;a.a?a.b.a=c:a.a=a.b" +
    "=c;a.b=c;a.l++}\nfunction Ka(a){return(a=a.a)?a.node:null}function " +
    "La(a){return(a=Ka(a))?D(a):\"\"}function J(a,b){return new Ma(a,!!b)" +
    "}function Ma(a,b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=null}f" +
    "unction K(a){var b=a.b;if(null==b)return null;var c=a.a=b;a.b=a.c?" +
    "b.b:b.a;return c.node};/*\n\n The MIT License\n\n Copyright (c) 2007 C" +
    "ybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is h" +
    "ereby granted, free of charge, to any person obtaining a copy\n of " +
    "this software and associated documentation files (the \"Software\")," +
    " to\n deal in the Software without restriction, including without l" +
    "imitation the\n rights to use, copy, modify, merge, publish, distri" +
    "bute, sublicense, and/or\n sell copies of the Software, and to perm" +
    "it persons to whom the Software is\n furnished to do so, subject to" +
    " the following conditions:\n\n The above copyright notice and this p" +
    "ermission notice shall be included in\n all copies or substantial p" +
    "ortions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHO" +
    "UT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LI" +
    "MITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICU" +
    "LAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR" +
    " COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIAB" +
    "ILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISIN" +
    "G\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR O" +
    "THER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Na(a){switch(a.nodeTyp" +
    "e){case 1:return ea(Oa,a);case 9:return Na(a.documentElement);case" +
    " 11:case 10:case 6:case 12:return Pa;default:return a.parentNode?N" +
    "a(a.parentNode):Pa}}function Pa(){return null}function Oa(a,b){if(" +
    "a.prefix==b)return a.namespaceURI||\"http://www.w3.org/1999/xhtml\";" +
    "var c=a.getAttributeNode(\"xmlns:\"+b);return c&&c.specified?c.value" +
    "||null:a.parentNode&&9!=a.parentNode.nodeType?Oa(a.parentNode,b):n" +
    "ull};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n " +
    "Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted, fre" +
    "e of charge, to any person obtaining a copy\n of this software and " +
    "associated documentation files (the \"Software\"), to\n deal in the S" +
    "oftware without restriction, including without limitation the\n rig" +
    "hts to use, copy, modify, merge, publish, distribute, sublicense, " +
    "and/or\n sell copies of the Software, and to permit persons to whom" +
    " the Software is\n furnished to do so, subject to the following con" +
    "ditions:\n\n The above copyright notice and this permission notice s" +
    "hall be included in\n all copies or substantial portions of the Sof" +
    "tware.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY" +
    " KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRA" +
    "NTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NO" +
    "NINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS" +
    " BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN " +
    "AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR" +
    " IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN " +
    "THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu " +
    "Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby " +
    "granted, free of charge, to any person obtaining a copy\n of this s" +
    "oftware and associated documentation files (the \"Software\"), to\n d" +
    "eal in the Software without restriction, including without limitat" +
    "ion the\n rights to use, copy, modify, merge, publish, distribute, " +
    "sublicense, and/or\n sell copies of the Software, and to permit per" +
    "sons to whom the Software is\n furnished to do so, subject to the f" +
    "ollowing conditions:\n\n The above copyright notice and this permiss" +
    "ion notice shall be included in\n all copies or substantial portion" +
    "s of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WAR" +
    "RANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED " +
    "TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PU" +
    "RPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYR" +
    "IGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY," +
    " WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FRO" +
    "M, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER D" +
    "EALINGS\n IN THE SOFTWARE.\n*/\nfunction L(a){this.i=a;this.b=this.g=" +
    "!1;this.f=null}function M(a){return\"\\n  \"+a.toString().split(\"\\n\")" +
    ".join(\"\\n  \")}function Qa(a,b){a.g=b}function Ra(a,b){a.b=b}functi" +
    "on N(a,b){var c=a.a(b);return c instanceof G?+La(c):+c}function O(" +
    "a,b){var c=a.a(b);return c instanceof G?La(c):\"\"+c}function P(a,b)" +
    "{var c=a.a(b);return c instanceof G?!!c.l:!!c};/*\n\n The MIT Licens" +
    "e\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Googl" +
    "e Inc.\n\n Permission is hereby granted, free of charge, to any pers" +
    "on obtaining a copy\n of this software and associated documentation" +
    " files (the \"Software\"), to\n deal in the Software without restrict" +
    "ion, including without limitation the\n rights to use, copy, modify" +
    ", merge, publish, distribute, sublicense, and/or\n sell copies of t" +
    "he Software, and to permit persons to whom the Software is\n furnis" +
    "hed to do so, subject to the following conditions:\n\n The above cop" +
    "yright notice and this permission notice shall be included in\n all" +
    " copies or substantial portions of the Software.\n\n THE SOFTWARE IS" +
    " PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLI" +
    "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY" +
    ",\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVE" +
    "NT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM" +
    ", DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, T" +
    "ORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE " +
    "SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunctio" +
    "n Q(a,b,c){L.call(this,a.i);this.c=a;this.h=b;this.o=c;this.g=b.g|" +
    "|c.g;this.b=b.b||c.b;this.c==Sa&&(c.b||c.g||4==c.i||0==c.i||!b.f?b" +
    ".b||b.g||4==b.i||0==b.i||!c.f||(this.f={name:c.f.name,s:b}):this.f" +
    "={name:b.f.name,s:c})}r(Q,L);\nfunction R(a,b,c,d,e){b=b.a(d);c=c.a" +
    "(d);var f;if(b instanceof G&&c instanceof G){e=J(b);for(d=K(e);d;d" +
    "=K(e))for(b=J(c),f=K(b);f;f=K(b))if(a(D(d),D(f)))return!0;return!1" +
    "}if(b instanceof G||c instanceof G){b instanceof G?e=b:(e=c,c=b);e" +
    "=J(e);b=typeof c;for(d=K(e);d;d=K(e)){switch(b){case \"number\":d=+D" +
    "(d);break;case \"boolean\":d=!!D(d);break;case \"string\":d=D(d);break" +
    ";default:throw Error(\"Illegal primitive type for comparison.\");}if" +
    "(a(d,c))return!0}return!1}return e?\"boolean\"==typeof b||\"boolean\"=" +
    "=typeof c?\na(!!b,!!c):\"number\"==typeof b||\"number\"==typeof c?a(+b," +
    "+c):a(b,c):a(+b,+c)}Q.prototype.a=function(a){return this.c.m(this" +
    ".h,this.o,a)};Q.prototype.toString=function(){var a=\"Binary Expres" +
    "sion: \"+this.c,a=a+M(this.h);return a+=M(this.o)};function Ta(a,b," +
    "c,d){this.a=a;this.w=b;this.i=c;this.m=d}Ta.prototype.toString=h(\"" +
    "a\");var Ua={};function S(a,b,c,d){if(Ua.hasOwnProperty(a))throw Er" +
    "ror(\"Binary operator already created: \"+a);a=new Ta(a,b,c,d);retur" +
    "n Ua[a.toString()]=a}\nS(\"div\",6,1,function(a,b,c){return N(a,c)/N(" +
    "b,c)});S(\"mod\",6,1,function(a,b,c){return N(a,c)%N(b,c)});S(\"*\",6," +
    "1,function(a,b,c){return N(a,c)*N(b,c)});S(\"+\",5,1,function(a,b,c)" +
    "{return N(a,c)+N(b,c)});S(\"-\",5,1,function(a,b,c){return N(a,c)-N(" +
    "b,c)});S(\"<\",4,2,function(a,b,c){return R(function(a,b){return a<b" +
    "},a,b,c)});S(\">\",4,2,function(a,b,c){return R(function(a,b){return" +
    " a>b},a,b,c)});S(\"<=\",4,2,function(a,b,c){return R(function(a,b){r" +
    "eturn a<=b},a,b,c)});\nS(\">=\",4,2,function(a,b,c){return R(function" +
    "(a,b){return a>=b},a,b,c)});var Sa=S(\"=\",3,2,function(a,b,c){retur" +
    "n R(function(a,b){return a==b},a,b,c,!0)});S(\"!=\",3,2,function(a,b" +
    ",c){return R(function(a,b){return a!=b},a,b,c,!0)});S(\"and\",2,2,fu" +
    "nction(a,b,c){return P(a,c)&&P(b,c)});S(\"or\",1,2,function(a,b,c){r" +
    "eturn P(a,c)||P(b,c)});/*\n\n The MIT License\n\n Copyright (c) 2007 C" +
    "ybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is h" +
    "ereby granted, free of charge, to any person obtaining a copy\n of " +
    "this software and associated documentation files (the \"Software\")," +
    " to\n deal in the Software without restriction, including without l" +
    "imitation the\n rights to use, copy, modify, merge, publish, distri" +
    "bute, sublicense, and/or\n sell copies of the Software, and to perm" +
    "it persons to whom the Software is\n furnished to do so, subject to" +
    " the following conditions:\n\n The above copyright notice and this p" +
    "ermission notice shall be included in\n all copies or substantial p" +
    "ortions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHO" +
    "UT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LI" +
    "MITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICU" +
    "LAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR" +
    " COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIAB" +
    "ILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISIN" +
    "G\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR O" +
    "THER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Va(a,b){if(b.a.length&" +
    "&4!=a.i)throw Error(\"Primary expression must evaluate to nodeset i" +
    "f filter has predicate(s).\");L.call(this,a.i);this.c=a;this.h=b;th" +
    "is.g=a.g;this.b=a.b}r(Va,L);Va.prototype.a=function(a){a=this.c.a(" +
    "a);return Wa(this.h,a)};Va.prototype.toString=function(){var a;a=\"" +
    "Filter:\"+M(this.c);return a+=M(this.h)};/*\n\n The MIT License\n\n Cop" +
    "yright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n" +
    "\n Permission is hereby granted, free of charge, to any person obta" +
    "ining a copy\n of this software and associated documentation files " +
    "(the \"Software\"), to\n deal in the Software without restriction, in" +
    "cluding without limitation the\n rights to use, copy, modify, merge" +
    ", publish, distribute, sublicense, and/or\n sell copies of the Soft" +
    "ware, and to permit persons to whom the Software is\n furnished to " +
    "do so, subject to the following conditions:\n\n The above copyright " +
    "notice and this permission notice shall be included in\n all copies" +
    " or substantial portions of the Software.\n\n THE SOFTWARE IS PROVID" +
    "ED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INC" +
    "LUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITN" +
    "ESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHAL" +
    "L THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAG" +
    "ES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR " +
    "OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWAR" +
    "E OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Xa(a," +
    "b){if(b.length<a.A)throw Error(\"Function \"+a.j+\" expects at least\"" +
    "+a.A+\" arguments, \"+b.length+\" given\");if(null!==a.v&&b.length>a.v" +
    ")throw Error(\"Function \"+a.j+\" expects at most \"+a.v+\" arguments, " +
    "\"+b.length+\" given\");a.B&&v(b,function(b,d){if(4!=b.i)throw Error(" +
    "\"Argument \"+d+\" to function \"+a.j+\" is not of type Nodeset: \"+b);}" +
    ");L.call(this,a.i);this.h=a;this.c=b;Qa(this,a.g||y(b,function(a){" +
    "return a.g}));Ra(this,a.D&&!b.length||a.C&&!!b.length||y(b,functio" +
    "n(a){return a.b}))}r(Xa,L);\nXa.prototype.a=function(a){return this" +
    ".h.m.apply(null,ka(a,this.c))};Xa.prototype.toString=function(){va" +
    "r a=\"Function: \"+this.h;if(this.c.length)var b=x(this.c,function(a" +
    ",b){return a+M(b)},\"Arguments:\"),a=a+M(b);return a};function Ya(a," +
    "b,c,d,e,f,g,w,p){this.j=a;this.i=b;this.g=c;this.D=d;this.C=e;this" +
    ".m=f;this.A=g;this.v=void 0!==w?w:g;this.B=!!p}Ya.prototype.toStri" +
    "ng=h(\"j\");var Za={};\nfunction T(a,b,c,d,e,f,g,w){if(Za.hasOwnPrope" +
    "rty(a))throw Error(\"Function already created: \"+a+\".\");Za[a]=new Y" +
    "a(a,b,c,d,!1,e,f,g,w)}T(\"boolean\",2,!1,!1,function(a,b){return P(b" +
    ",a)},1);T(\"ceiling\",1,!1,!1,function(a,b){return Math.ceil(N(b,a))" +
    "},1);T(\"concat\",3,!1,!1,function(a,b){var c=la(arguments,1);return" +
    " x(c,function(b,c){return b+O(c,a)},\"\")},2,null);T(\"contains\",2,!1" +
    ",!1,function(a,b,c){b=O(b,a);a=O(c,a);return-1!=b.indexOf(a)},2);T" +
    "(\"count\",1,!1,!1,function(a,b){return b.a(a).l},1,1,!0);\nT(\"false\"" +
    ",2,!1,!1,k(!1),0);T(\"floor\",1,!1,!1,function(a,b){return Math.floo" +
    "r(N(b,a))},1);T(\"id\",4,!1,!1,function(a,b){var c=a.a,d=9==c.nodeTy" +
    "pe?c:c.ownerDocument,c=O(b,a).split(/\\s+/),e=[];v(c,function(a){a=" +
    "d.getElementById(a);var b;if(!(b=!a)){a:if(m(e))b=m(a)&&1==a.lengt" +
    "h?e.indexOf(a,0):-1;else{for(b=0;b<e.length;b++)if(b in e&&e[b]===" +
    "a)break a;b=-1}b=0<=b}b||e.push(a)});e.sort(ra);var f=new G;v(e,fu" +
    "nction(a){H(f,a)});return f},1);T(\"lang\",2,!1,!1,k(!1),1);\nT(\"last" +
    "\",1,!0,!1,function(a){if(1!=arguments.length)throw Error(\"Function"
  )
      .append(
    " last expects ()\");return a.f},0);T(\"local-name\",3,!1,!0,function(" +
    "a,b){var c=b?Ka(b.a(a)):a.a;return c?c.localName||c.nodeName.toLow" +
    "erCase():\"\"},0,1,!0);T(\"name\",3,!1,!0,function(a,b){var c=b?Ka(b.a" +
    "(a)):a.a;return c?c.nodeName.toLowerCase():\"\"},0,1,!0);T(\"namespac" +
    "e-uri\",3,!0,!1,k(\"\"),0,1,!0);T(\"normalize-space\",3,!1,!0,function(" +
    "a,b){return(b?O(b,a):D(a.a)).replace(/[\\s\\xa0]+/g,\" \").replace(/^\\" +
    "s+|\\s+$/g,\"\")},0,1);\nT(\"not\",2,!1,!1,function(a,b){return!P(b,a)}," +
    "1);T(\"number\",1,!1,!0,function(a,b){return b?N(b,a):+D(a.a)},0,1);" +
    "T(\"position\",1,!0,!1,function(a){return a.b},0);T(\"round\",1,!1,!1," +
    "function(a,b){return Math.round(N(b,a))},1);T(\"starts-with\",2,!1,!" +
    "1,function(a,b,c){b=O(b,a);a=O(c,a);return 0==b.lastIndexOf(a,0)}," +
    "2);T(\"string\",3,!1,!0,function(a,b){return b?O(b,a):D(a.a)},0,1);T" +
    "(\"string-length\",1,!1,!0,function(a,b){return(b?O(b,a):D(a.a)).len" +
    "gth},0,1);\nT(\"substring\",3,!1,!1,function(a,b,c,d){c=N(c,a);if(isN" +
    "aN(c)||Infinity==c||-Infinity==c)return\"\";d=d?N(d,a):Infinity;if(i" +
    "sNaN(d)||-Infinity===d)return\"\";c=Math.round(c)-1;var e=Math.max(c" +
    ",0);a=O(b,a);if(Infinity==d)return a.substring(e);b=Math.round(d);" +
    "return a.substring(e,c+b)},2,3);T(\"substring-after\",3,!1,!1,functi" +
    "on(a,b,c){b=O(b,a);a=O(c,a);c=b.indexOf(a);return-1==c?\"\":b.substr" +
    "ing(c+a.length)},2);\nT(\"substring-before\",3,!1,!1,function(a,b,c){" +
    "b=O(b,a);a=O(c,a);a=b.indexOf(a);return-1==a?\"\":b.substring(0,a)}," +
    "2);T(\"sum\",1,!1,!1,function(a,b){for(var c=J(b.a(a)),d=0,e=K(c);e;" +
    "e=K(c))d+=+D(e);return d},1,1,!0);T(\"translate\",3,!1,!1,function(a" +
    ",b,c,d){b=O(b,a);c=O(c,a);var e=O(d,a);a=[];for(d=0;d<c.length;d++" +
    "){var f=c.charAt(d);f in a||(a[f]=e.charAt(d))}c=\"\";for(d=0;d<b.le" +
    "ngth;d++)f=b.charAt(d),c+=f in a?a[f]:f;return c},3);T(\"true\",2,!1" +
    ",!1,k(!0),0);/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs" +
    ", Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby gran" +
    "ted, free of charge, to any person obtaining a copy\n of this softw" +
    "are and associated documentation files (the \"Software\"), to\n deal " +
    "in the Software without restriction, including without limitation " +
    "the\n rights to use, copy, modify, merge, publish, distribute, subl" +
    "icense, and/or\n sell copies of the Software, and to permit persons" +
    " to whom the Software is\n furnished to do so, subject to the follo" +
    "wing conditions:\n\n The above copyright notice and this permission " +
    "notice shall be included in\n all copies or substantial portions of" +
    " the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANT" +
    "Y OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO T" +
    "HE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOS" +
    "E AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT" +
    " HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHE" +
    "THER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, O" +
    "UT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALI" +
    "NGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007" +
    " Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is" +
    " hereby granted, free of charge, to any person obtaining a copy\n o" +
    "f this software and associated documentation files (the \"Software\"" +
    "), to\n deal in the Software without restriction, including without" +
    " limitation the\n rights to use, copy, modify, merge, publish, dist" +
    "ribute, sublicense, and/or\n sell copies of the Software, and to pe" +
    "rmit persons to whom the Software is\n furnished to do so, subject " +
    "to the following conditions:\n\n The above copyright notice and this" +
    " permission notice shall be included in\n all copies or substantial" +
    " portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WIT" +
    "HOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT " +
    "LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTI" +
    "CULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS " +
    "OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LI" +
    "ABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARIS" +
    "ING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR" +
    " OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction I(a,b){this.h=a;this" +
    ".c=void 0!==b?b:null;this.b=null;switch(a){case \"comment\":this.b=8" +
    ";break;case \"text\":this.b=3;break;case \"processing-instruction\":th" +
    "is.b=7;break;case \"node\":break;default:throw Error(\"Unexpected arg" +
    "ument\");}}function $a(a){return\"comment\"==a||\"text\"==a||\"processin" +
    "g-instruction\"==a||\"node\"==a}I.prototype.a=function(a){return null" +
    "===this.b||this.b==a.nodeType};I.prototype.f=h(\"h\");I.prototype.to" +
    "String=function(){var a=\"Kind Test: \"+this.h;null===this.c||(a+=M(" +
    "this.c));return a};/*\n\n The MIT License\n\n Copyright (c) 2007 Cyboz" +
    "u Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereb" +
    "y granted, free of charge, to any person obtaining a copy\n of this" +
    " software and associated documentation files (the \"Software\"), to\n" +
    " deal in the Software without restriction, including without limit" +
    "ation the\n rights to use, copy, modify, merge, publish, distribute" +
    ", sublicense, and/or\n sell copies of the Software, and to permit p" +
    "ersons to whom the Software is\n furnished to do so, subject to the" +
    " following conditions:\n\n The above copyright notice and this permi" +
    "ssion notice shall be included in\n all copies or substantial porti" +
    "ons of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT W" +
    "ARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITE" +
    "D TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR " +
    "PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COP" +
    "YRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILIT" +
    "Y, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n F" +
    "ROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER" +
    " DEALINGS\n IN THE SOFTWARE.\n*/\nfunction ab(a){L.call(this,3);this." +
    "c=a.substring(1,a.length-1)}r(ab,L);ab.prototype.a=h(\"c\");ab.proto" +
    "type.toString=function(){return\"Literal: \"+this.c};/*\n\n The MIT Li" +
    "cense\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 G" +
    "oogle Inc.\n\n Permission is hereby granted, free of charge, to any " +
    "person obtaining a copy\n of this software and associated documenta" +
    "tion files (the \"Software\"), to\n deal in the Software without rest" +
    "riction, including without limitation the\n rights to use, copy, mo" +
    "dify, merge, publish, distribute, sublicense, and/or\n sell copies " +
    "of the Software, and to permit persons to whom the Software is\n fu" +
    "rnished to do so, subject to the following conditions:\n\n The above" +
    " copyright notice and this permission notice shall be included in\n" +
    " all copies or substantial portions of the Software.\n\n THE SOFTWAR" +
    "E IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n I" +
    "MPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABI" +
    "LITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO" +
    " EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY C" +
    "LAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRAC" +
    "T, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH " +
    "THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfun" +
    "ction U(a,b){this.j=a.toLowerCase();this.b=b?b.toLowerCase():\"http" +
    "://www.w3.org/1999/xhtml\"}U.prototype.a=function(a){var b=a.nodeTy" +
    "pe;return 1!=b&&2!=b?!1:\"*\"!=this.j&&this.j!=a.nodeName.toLowerCas" +
    "e()?!1:this.b==(a.namespaceURI?a.namespaceURI.toLowerCase():\"http:" +
    "//www.w3.org/1999/xhtml\")};U.prototype.f=h(\"j\");U.prototype.toStri" +
    "ng=function(){return\"Name Test: \"+(\"http://www.w3.org/1999/xhtml\"=" +
    "=this.b?\"\":this.b+\":\")+this.j};/*\n\n The MIT License\n\n Copyright (c" +
    ") 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permiss" +
    "ion is hereby granted, free of charge, to any person obtaining a c" +
    "opy\n of this software and associated documentation files (the \"Sof" +
    "tware\"), to\n deal in the Software without restriction, including w" +
    "ithout limitation the\n rights to use, copy, modify, merge, publish" +
    ", distribute, sublicense, and/or\n sell copies of the Software, and" +
    " to permit persons to whom the Software is\n furnished to do so, su" +
    "bject to the following conditions:\n\n The above copyright notice an" +
    "d this permission notice shall be included in\n all copies or subst" +
    "antial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS" +
    "\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BU" +
    "T NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A" +
    " PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AU" +
    "THORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTH" +
    "ER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE" +
    ", ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE " +
    "USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction bb(a){L.call(t" +
    "his,1);this.c=a}r(bb,L);bb.prototype.a=h(\"c\");bb.prototype.toStrin" +
    "g=function(){return\"Number: \"+this.c};/*\n\n The MIT License\n\n Copyr" +
    "ight (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n " +
    "Permission is hereby granted, free of charge, to any person obtain" +
    "ing a copy\n of this software and associated documentation files (t" +
    "he \"Software\"), to\n deal in the Software without restriction, incl" +
    "uding without limitation the\n rights to use, copy, modify, merge, " +
    "publish, distribute, sublicense, and/or\n sell copies of the Softwa" +
    "re, and to permit persons to whom the Software is\n furnished to do" +
    " so, subject to the following conditions:\n\n The above copyright no" +
    "tice and this permission notice shall be included in\n all copies o" +
    "r substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED" +
    " \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLU" +
    "DING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNES" +
    "S FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL " +
    "THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES" +
    " OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OT" +
    "HERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE " +
    "OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction cb(a,b)" +
    "{L.call(this,a.i);this.h=a;this.c=b;this.g=a.g;this.b=a.b;if(1==th" +
    "is.c.length){var c=this.c[0];c.u||c.c!=db||(c=c.o,\"*\"!=c.f()&&(thi" +
    "s.f={name:c.f(),s:null}))}}r(cb,L);function V(){L.call(this,4)}r(V" +
    ",L);V.prototype.a=function(a){var b=new G;a=a.a;9==a.nodeType?H(b," +
    "a):H(b,a.ownerDocument);return b};V.prototype.toString=k(\"Root Hel" +
    "per Expression\");function eb(){L.call(this,4)}r(eb,L);eb.prototype" +
    ".a=function(a){var b=new G;H(b,a.a);return b};eb.prototype.toStrin" +
    "g=k(\"Context Helper Expression\");\nfunction fb(a){return\"/\"==a||\"//" +
    "\"==a}cb.prototype.a=function(a){var b=this.h.a(a);if(!(b instanceo" +
    "f G))throw Error(\"Filter expression must evaluate to nodeset.\");a=" +
    "this.c;for(var c=0,d=a.length;c<d&&b.l;c++){var e=a[c],f=J(b,e.c.a" +
    "),g;if(e.g||e.c!=gb)if(e.g||e.c!=hb)for(g=K(f),b=e.a(new z(g));nul" +
    "l!=(g=K(f));)g=e.a(new z(g)),b=Ia(b,g);else g=K(f),b=e.a(new z(g))" +
    ";else{for(g=K(f);(b=K(f))&&(!g.contains||g.contains(b))&&b.compare" +
    "DocumentPosition(g)&8;g=b);b=e.a(new z(g))}}return b};\ncb.prototyp" +
    "e.toString=function(){var a;a=\"Path Expression:\"+M(this.h);if(this" +
    ".c.length){var b=x(this.c,function(a,b){return a+M(b)},\"Steps:\");a" +
    "+=M(b)}return a};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu " +
    "Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby " +
    "granted, free of charge, to any person obtaining a copy\n of this s" +
    "oftware and associated documentation files (the \"Software\"), to\n d" +
    "eal in the Software without restriction, including without limitat" +
    "ion the\n rights to use, copy, modify, merge, publish, distribute, " +
    "sublicense, and/or\n sell copies of the Software, and to permit per" +
    "sons to whom the Software is\n furnished to do so, subject to the f" +
    "ollowing conditions:\n\n The above copyright notice and this permiss" +
    "ion notice shall be included in\n all copies or substantial portion" +
    "s of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WAR" +
    "RANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED " +
    "TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PU" +
    "RPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYR" +
    "IGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY," +
    " WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FRO" +
    "M, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER D" +
    "EALINGS\n IN THE SOFTWARE.\n*/\nfunction ib(a,b){this.a=a;this.b=!!b}" +
    "\nfunction Wa(a,b,c){for(c=c||0;c<a.a.length;c++)for(var d=a.a[c],e" +
    "=J(b),f=b.l,g,w=0;g=K(e);w++){var p=a.b?f-w:w+1;g=d.a(new z(g,p,f)" +
    ");if(\"number\"==typeof g)p=p==g;else if(\"string\"==typeof g||\"boolea" +
    "n\"==typeof g)p=!!g;else if(g instanceof G)p=0<g.l;else throw Error" +
    "(\"Predicate.evaluate returned an unexpected type.\");if(!p){p=e;g=p" +
    ".f;var q=p.a;if(!q)throw Error(\"Next must be called at least once " +
    "before remove.\");var C=q.b,q=q.a;C?C.a=q:g.a=q;q?q.b=C:g.b=C;g.l--" +
    ";p.a=null}}return b}\nib.prototype.toString=function(){return x(thi" +
    "s.a,function(a,b){return a+M(b)},\"Predicates:\")};/*\n\n The MIT Lice" +
    "nse\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Goo" +
    "gle Inc.\n\n Permission is hereby granted, free of charge, to any pe" +
    "rson obtaining a copy\n of this software and associated documentati" +
    "on files (the \"Software\"), to\n deal in the Software without restri" +
    "ction, including without limitation the\n rights to use, copy, modi" +
    "fy, merge, publish, distribute, sublicense, and/or\n sell copies of" +
    " the Software, and to permit persons to whom the Software is\n furn" +
    "ished to do so, subject to the following conditions:\n\n The above c" +
    "opyright notice and this permission notice shall be included in\n a" +
    "ll copies or substantial portions of the Software.\n\n THE SOFTWARE " +
    "IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMP" +
    "LIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILI" +
    "TY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO E" +
    "VENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLA" +
    "IM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT," +
    " TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH TH" +
    "E SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunct" +
    "ion W(a,b,c,d){L.call(this,4);this.c=a;this.o=b;this.h=c||new ib([" +
    "]);this.u=!!d;b=this.h;b=0<b.a.length?b.a[0].f:null;a.b&&b&&(this." +
    "f={name:b.name,s:b.s});a:{a=this.h;for(b=0;b<a.a.length;b++)if(c=a" +
    ".a[b],c.g||1==c.i||0==c.i){a=!0;break a}a=!1}this.g=a}r(W,L);\nW.pr" +
    "ototype.a=function(a){var b=a.a,c=null,c=this.f,d=null,e=null,f=0;" +
    "c&&(d=c.name,e=c.s?O(c.s,a):null,f=1);if(this.u)if(this.g||this.c!" +
    "=jb)if(a=J((new W(kb,new I(\"node\"))).a(a)),b=K(a))for(c=this.m(b,d" +
    ",e,f);null!=(b=K(a));)c=Ia(c,this.m(b,d,e,f));else c=new G;else c=" +
    "F(this.o,b,d,e),c=Wa(this.h,c,f);else c=this.m(a.a,d,e,f);return c" +
    "};W.prototype.m=function(a,b,c,d){a=this.c.f(this.o,a,b,c);return " +
    "a=Wa(this.h,a,d)};\nW.prototype.toString=function(){var a;a=\"Step:\"" +
    "+M(\"Operator: \"+(this.u?\"//\":\"/\"));this.c.j&&(a+=M(\"Axis: \"+this.c" +
    "));a+=M(this.o);if(this.h.a.length){var b=x(this.h.a,function(a,b)" +
    "{return a+M(b)},\"Predicates:\");a+=M(b)}return a};function lb(a,b,c" +
    ",d){this.j=a;this.f=b;this.a=c;this.b=d}lb.prototype.toString=h(\"j" +
    "\");var mb={};function X(a,b,c,d){if(mb.hasOwnProperty(a))throw Err" +
    "or(\"Axis already created: \"+a);b=new lb(a,b,c,!!d);return mb[a]=b}" +
    "\nX(\"ancestor\",function(a,b){for(var c=new G,d=b;d=d.parentNode;)a." +
    "a(d)&&Ja(c,d);return c},!0);X(\"ancestor-or-self\",function(a,b){var" +
    " c=new G,d=b;do a.a(d)&&Ja(c,d);while(d=d.parentNode);return c},!0" +
    ");var db=X(\"attribute\",function(a,b){var c=new G,d=a.f(),e=b.attri" +
    "butes;if(e)if(a instanceof I&&null===a.b||\"*\"==d)for(var d=0,f;f=e" +
    "[d];d++)H(c,f);else(f=e.getNamedItem(d))&&H(c,f);return c},!1),jb=" +
    "X(\"child\",function(a,b,c,d,e){return Ga.call(null,a,b,m(c)?c:null," +
    "m(d)?d:null,e||new G)},!1,!0);\nX(\"descendant\",F,!1,!0);var kb=X(\"d" +
    "escendant-or-self\",function(a,b,c,d){var e=new G;E(b,c,d)&&a.a(b)&" +
    "&H(e,b);return F(a,b,c,d,e)},!1,!0),gb=X(\"following\",function(a,b," +
    "c,d){var e=new G;do for(var f=b;f=f.nextSibling;)E(f,c,d)&&a.a(f)&" +
    "&H(e,f),e=F(a,f,c,d,e);while(b=b.parentNode);return e},!1,!0);X(\"f" +
    "ollowing-sibling\",function(a,b){for(var c=new G,d=b;d=d.nextSiblin" +
    "g;)a.a(d)&&H(c,d);return c},!1);X(\"namespace\",function(){return ne" +
    "w G},!1);\nvar nb=X(\"parent\",function(a,b){var c=new G;if(9==b.node" +
    "Type)return c;if(2==b.nodeType)return H(c,b.ownerElement),c;var d=" +
    "b.parentNode;a.a(d)&&H(c,d);return c},!1),hb=X(\"preceding\",functio" +
    "n(a,b,c,d){var e=new G,f=[];do f.unshift(b);while(b=b.parentNode);" +
    "for(var g=1,w=f.length;g<w;g++){var p=[];for(b=f[g];b=b.previousSi" +
    "bling;)p.unshift(b);for(var q=0,C=p.length;q<C;q++)b=p[q],E(b,c,d)" +
    "&&a.a(b)&&H(e,b),e=F(a,b,c,d,e)}return e},!0,!0);\nX(\"preceding-sib" +
    "ling\",function(a,b){for(var c=new G,d=b;d=d.previousSibling;)a.a(d" +
    ")&&Ja(c,d);return c},!0);var ob=X(\"self\",function(a,b){var c=new G" +
    ";a.a(b)&&H(c,b);return c},!1);/*\n\n The MIT License\n\n Copyright (c)" +
    " 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permissi" +
    "on is hereby granted, free of charge, to any person obtaining a co" +
    "py\n of this software and associated documentation files (the \"Soft" +
    "ware\"), to\n deal in the Software without restriction, including wi" +
    "thout limitation the\n rights to use, copy, modify, merge, publish," +
    " distribute, sublicense, and/or\n sell copies of the Software, and " +
    "to permit persons to whom the Software is\n furnished to do so, sub" +
    "ject to the following conditions:\n\n The above copyright notice and" +
    " this permission notice shall be included in\n all copies or substa" +
    "ntial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\"" +
    ", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT" +
    " NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A " +
    "PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUT" +
    "HORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHE" +
    "R\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE," +
    " ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE U" +
    "SE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction pb(a){L.call(th" +
    "is,1);this.c=a;this.g=a.g;this.b=a.b}r(pb,L);pb.prototype.a=functi" +
    "on(a){return-N(this.c,a)};pb.prototype.toString=function(){return\"" +
    "Unary Expression: -\"+M(this.c)};/*\n\n The MIT License\n\n Copyright (" +
    "c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permis" +
    "sion is hereby granted, free of charge, to any person obtaining a " +
    "copy\n of this software and associated documentation files (the \"So" +
    "ftware\"), to\n deal in the Software without restriction, including " +
    "without limitation the\n rights to use, copy, modify, merge, publis" +
    "h, distribute, sublicense, and/or\n sell copies of the Software, an" +
    "d to permit persons to whom the Software is\n furnished to do so, s" +
    "ubject to the following conditions:\n\n The above copyright notice a" +
    "nd this permission notice shall be included in\n all copies or subs" +
    "tantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS I" +
    "S\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING B" +
    "UT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR " +
    "A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n A" +
    "UTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OT" +
    "HER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWIS" +
    "E, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE" +
    " USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction qb(a){L.call(" +
    "this,4);this.c=a;Qa(this,y(this.c,function(a){return a.g}));Ra(thi" +
    "s,y(this.c,function(a){return a.b}))}r(qb,L);qb.prototype.a=functi" +
    "on(a){var b=new G;v(this.c,function(c){c=c.a(a);if(!(c instanceof " +
    "G))throw Error(\"Path expression must evaluate to NodeSet.\");b=Ia(b" +
    ",c)});return b};qb.prototype.toString=function(){return x(this.c,f" +
    "unction(a,b){return a+M(b)},\"Union Expression:\")};/*\n\n The MIT Lic" +
    "ense\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Go" +
    "ogle Inc.\n\n Permission is hereby granted, free of charge, to any p" +
    "erson obtaining a copy\n of this software and associated documentat" +
    "ion files (the \"Software\"), to\n deal in the Software without restr" +
    "iction, including without limitation the\n rights to use, copy, mod" +
    "ify, merge, publish, distribute, sublicense, and/or\n sell copies o" +
    "f the Software, and to permit persons to whom the Software is\n fur" +
    "nished to do so, subject to the following conditions:\n\n The above " +
    "copyright notice and this permission notice shall be included in\n " +
    "all copies or substantial portions of the Software.\n\n THE SOFTWARE" +
    " IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IM" +
    "PLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABIL" +
    "ITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO " +
    "EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CL" +
    "AIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT" +
    ", TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH T" +
    "HE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunc" +
    "tion rb(a,b){this.a=a;this.b=b}function sb(a){for(var b,c=[];;){Y(" +
    "a,\"Missing right hand side of binary expression.\");b=tb(a);var d=B" +
    "(a.a);if(!d)break;var e=(d=Ua[d]||null)&&d.w;if(!e){a.a.a--;break}" +
    "for(;c.length&&e<=c[c.length-1].w;)b=new Q(c.pop(),c.pop(),b);c.pu" +
    "sh(b,d)}for(;c.length;)b=new Q(c.pop(),c.pop(),b);return b}functio" +
    "n Y(a,b){if(Da(a.a))throw Error(b);}function ub(a,b){var c=B(a.a);" +
    "if(c!=b)throw Error(\"Bad token, expected: \"+b+\" got: \"+c);}\nfuncti" +
    "on vb(a){a=B(a.a);if(\")\"!=a)throw Error(\"Bad token: \"+a);}function" +
    " wb(a){a=B(a.a);if(2>a.length)throw Error(\"Unclosed literal string" +
    "\");return new ab(a)}function xb(a){var b=B(a.a),c=b.indexOf(\":\");i" +
    "f(-1==c)return new U(b);var d=b.substring(0,c);a=a.b(d);if(!a)thro" +
    "w Error(\"Namespace prefix not declared: \"+d);b=b.substr(c+1);retur" +
    "n new U(b,a)}\nfunction yb(a){var b,c=[],d;if(fb(A(a.a))){b=B(a.a);" +
    "d=A(a.a);if(\"/\"==b&&(Da(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(" +
    "?![0-9])[\\w]/.test(d)))return new V;d=new V;Y(a,\"Missing next loca" +
    "tion step.\");b=zb(a,b);c.push(b)}else{a:{b=A(a.a);d=b.charAt(0);sw" +
    "itch(d){case \"$\":throw Error(\"Variable reference not allowed in HT" +
    "ML XPath\");case \"(\":B(a.a);b=sb(a);Y(a,'unclosed \"(\"');ub(a,\")\");b" +
    "reak;case '\"':case \"'\":b=wb(a);break;default:if(isNaN(+b))if(!$a(b" +
    ")&&/(?![0-9])[\\w]/.test(d)&&\"(\"==A(a.a,1)){b=B(a.a);b=\nZa[b]||null" +
    ";B(a.a);for(d=[];\")\"!=A(a.a);){Y(a,\"Missing function argument list" +
    ".\");d.push(sb(a));if(\",\"!=A(a.a))break;B(a.a)}Y(a,\"Unclosed functi" +
    "on argument list.\");vb(a);b=new Xa(b,d)}else{b=null;break a}else b" +
    "=new bb(+B(a.a))}\"[\"==A(a.a)&&(d=new ib(Ab(a)),b=new Va(b,d))}if(b" +
    ")if(fb(A(a.a)))d=b;else return b;else b=zb(a,\"/\"),d=new eb,c.push(" +
    "b)}for(;fb(A(a.a));)b=B(a.a),Y(a,\"Missing next location step.\"),b=" +
    "zb(a,b),c.push(b);return new cb(d,c)}\nfunction zb(a,b){var c,d,e;i" +
    "f(\"/\"!=b&&\"//\"!=b)throw Error('Step op should be \"/\" or \"//\"');if(" +
    "\".\"==A(a.a))return d=new W(ob,new I(\"node\")),B(a.a),d;if(\"..\"==A(a" +
    ".a))return d=new W(nb,new I(\"node\")),B(a.a),d;var f;if(\"@\"==A(a.a)" +
    ")f=db,B(a.a),Y(a,\"Missing attribute name\");else if(\"::\"==A(a.a,1))" +
    "{if(!/(?![0-9])[\\w]/.test(A(a.a).charAt(0)))throw Error(\"Bad token" +
    ": \"+B(a.a));c=B(a.a);f=mb[c]||null;if(!f)throw Error(\"No axis with" +
    " name: \"+c);B(a.a);Y(a,\"Missing node name\")}else f=jb;c=A(a.a);if(" +
    "/(?![0-9])[\\w]/.test(c.charAt(0)))if(\"(\"==\nA(a.a,1)){if(!$a(c))thr" +
    "ow Error(\"Invalid node type: \"+c);c=B(a.a);if(!$a(c))throw Error(\"" +
    "Invalid type name: \"+c);ub(a,\"(\");Y(a,\"Bad nodetype\");e=A(a.a).cha" +
    "rAt(0);var g=null;if('\"'==e||\"'\"==e)g=wb(a);Y(a,\"Bad nodetype\");vb" +
    "(a);c=new I(c,g)}else c=xb(a);else if(\"*\"==c)c=xb(a);else throw Er" +
    "ror(\"Bad token: \"+B(a.a));e=new ib(Ab(a),f.a);return d||new W(f,c," +
    "e,\"//\"==b)}\nfunction Ab(a){for(var b=[];\"[\"==A(a.a);){B(a.a);Y(a,\"" +
    "Missing predicate expression.\");var c=sb(a);b.push(c);Y(a,\"Unclose" +
    "d predicate expression.\");ub(a,\"]\")}return b}function tb(a){if(\"-\"" +
    "==A(a.a))return B(a.a),new pb(tb(a));var b=yb(a);if(\"|\"!=A(a.a))a=" +
    "b;else{for(b=[b];\"|\"==B(a.a);)Y(a,\"Missing next union location pat" +
    "h.\"),b.push(yb(a));a.a.a--;a=new qb(b)}return a};/*\n\n The MIT Lice" +
    "nse\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Goo" +
    "gle Inc.\n\n Permission is hereby granted, free of charge, to any pe" +
    "rson obtaining a copy\n of this software and associated documentati" +
    "on files (the \"Software\"), to\n deal in the Software without restri" +
    "ction, including without limitation the\n rights to use, copy, modi" +
    "fy, merge, publish, distribute, sublicense, and/or\n sell copies of" +
    " the Software, and to permit persons to whom the Software is\n furn" +
    "ished to do so, subject to the following conditions:\n\n The above c" +
    "opyright notice and this permission notice shall be included in\n a" +
    "ll copies or substantial portions of the Software.\n\n THE SOFTWARE " +
    "IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMP" +
    "LIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILI" +
    "TY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO E" +
    "VENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLA" +
    "IM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT," +
    " TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH TH" +
    "E SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunct" +
    "ion Bb(a,b){if(!a.length)throw Error(\"Empty XPath expression.\");va" +
    "r c=Aa(a);if(Da(c))throw Error(\"Invalid XPath expression.\");b?\"fun" +
    "ction\"==ba(b)||(b=n(b.lookupNamespaceURI,b)):b=k(null);var d=sb(ne" +
    "w rb(c,b));if(!Da(c))throw Error(\"Bad token: \"+B(c));this.evaluate" +
    "=function(a,b){var c=d.a(new z(a));return new Z(c,b)}}\nfunction Z(" +
    "a,b){if(0==b)if(a instanceof G)b=4;else if(\"string\"==typeof a)b=2;" +
    "else if(\"number\"==typeof a)b=1;else if(\"boolean\"==typeof a)b=3;els" +
    "e throw Error(\"Unexpected evaluation result.\");if(2!=b&&1!=b&&3!=b" +
    "&&!(a instanceof G))throw Error(\"value could not be converted to t" +
    "he specified type\");this.resultType=b;var c;switch(b){case 2:this." +
    "stringValue=a instanceof G?La(a):\"\"+a;break;case 1:this.numberValu" +
    "e=a instanceof G?+La(a):+a;break;case 3:this.booleanValue=a instan" +
    "ceof G?0<a.l:!!a;break;case 4:case 5:case 6:case 7:var d=\nJ(a);c=[" +
    "];for(var e=K(d);e;e=K(d))c.push(e);this.snapshotLength=a.l;this.i" +
    "nvalidIteratorState=!1;break;case 8:case 9:this.singleNodeValue=Ka" +
    "(a);break;default:throw Error(\"Unknown XPathResult type.\");}var f=" +
    "0;this.iterateNext=function(){if(4!=b&&5!=b)throw Error(\"iterateNe" +
    "xt called with wrong result type\");return f>=c.length?null:c[f++]}" +
    ";this.snapshotItem=function(a){if(6!=b&&7!=b)throw Error(\"snapshot" +
    "Item called with wrong result type\");return a>=c.length||0>a?null:" +
    "c[a]}}Z.ANY_TYPE=0;\nZ.NUMBER_TYPE=1;Z.STRING_TYPE=2;Z.BOOLEAN_TYPE" +
    "=3;Z.UNORDERED_NODE_ITERATOR_TYPE=4;Z.ORDERED_NODE_ITERATOR_TYPE=5" +
    ";Z.UNORDERED_NODE_SNAPSHOT_TYPE=6;Z.ORDERED_NODE_SNAPSHOT_TYPE=7;Z" +
    ".ANY_UNORDERED_NODE_TYPE=8;Z.FIRST_ORDERED_NODE_TYPE=9;function Cb" +
    "(a){this.lookupNamespaceURI=Na(a)}aa(\"wgxpath.install\",function(a)" +
    "{a=a||l;var b=a.document;b.evaluate||(a.XPathResult=Z,b.evaluate=f" +
    "unction(a,b,e,f){return(new Bb(a,e)).evaluate(b,f)},b.createExpres"
  )
      .append(
    "sion=function(a,b){return new Bb(a,b)},b.createNSResolver=function" +
    "(a){return new Cb(a)})});/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl" +
    "_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_l" +
    "ic*/\n/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\naa(\"_\",function(a,b){return(b" +
    "||ua).frames[a]||null});;return this._.apply(null,arguments);}).ap" +
    "ply({navigator:typeof window!=\"undefined\"?window.navigator:null},a" +
    "rguments);}\n"
  )
  .toString();
  static final String FRAME_BY_INDEX_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String FRAME_BY_INDEX_ANDROID_original() {
    return FRAME_BY_INDEX_ANDROID.replaceAll("xxx_rpl_lic", FRAME_BY_INDEX_ANDROID_license);
  }

/* field: GET_VISIBLE_TEXT_ANDROID license: 

 Copyright 2014 Software Freedom Conservancy

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
  static final String GET_VISIBLE_TEXT_ANDROID =
  new StringBuilder(
    "function(){return(function(){function h(a){return function(){retur" +
    "n this[a]}}function p(a){return function(){return a}}var aa=this;f" +
    "unction ba(a,b){var c=a.split(\".\"),d=aa;c[0]in d||!d.execScript||d" +
    ".execScript(\"var \"+c[0]);for(var e;c.length&&(e=c.shift());)c.leng" +
    "th||void 0===b?d[e]?d=d[e]:d=d[e]={}:d[e]=b}\nfunction ca(a){var b=" +
    "typeof a;if(\"object\"==b)if(a){if(a instanceof Array)return\"array\";" +
    "if(a instanceof Object)return b;var c=Object.prototype.toString.ca" +
    "ll(a);if(\"[object Window]\"==c)return\"object\";if(\"[object Array]\"==" +
    "c||\"number\"==typeof a.length&&\"undefined\"!=typeof a.splice&&\"undef" +
    "ined\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"spl" +
    "ice\"))return\"array\";if(\"[object Function]\"==c||\"undefined\"!=typeof" +
    " a.call&&\"undefined\"!=typeof a.propertyIsEnumerable&&!a.propertyIs" +
    "Enumerable(\"call\"))return\"function\"}else return\"null\";\nelse if(\"fu" +
    "nction\"==b&&\"undefined\"==typeof a.call)return\"object\";return b}fun" +
    "ction q(a){return\"string\"==typeof a}function da(a,b,c){return a.ca" +
    "ll.apply(a.bind,arguments)}function ea(a,b,c){if(!a)throw Error();" +
    "if(2<arguments.length){var d=Array.prototype.slice.call(arguments," +
    "2);return function(){var c=Array.prototype.slice.call(arguments);A" +
    "rray.prototype.unshift.apply(c,d);return a.apply(b,c)}}return func" +
    "tion(){return a.apply(b,arguments)}}\nfunction fa(a,b,c){fa=Functio" +
    "n.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf(\"" +
    "native code\")?da:ea;return fa.apply(null,arguments)}function ga(a," +
    "b){var c=Array.prototype.slice.call(arguments,1);return function()" +
    "{var b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}" +
    "}\nfunction r(a,b){function c(){}c.prototype=b.prototype;a.H=b.prot" +
    "otype;a.prototype=new c;a.prototype.constructor=a;a.G=function(a,c" +
    ",f){for(var g=Array(arguments.length-2),n=2;n<arguments.length;n++" +
    ")g[n-2]=arguments[n];return b.prototype[c].apply(a,g)}}Function.pr" +
    "ototype.bind=Function.prototype.bind||function(a,b){if(1<arguments" +
    ".length){var c=Array.prototype.slice.call(arguments,1);c.unshift(t" +
    "his,a);return fa.apply(null,c)}return fa(this,a)};function ha(a){i" +
    "f(Error.captureStackTrace)Error.captureStackTrace(this,ha);else{va" +
    "r b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(a))}r(" +
    "ha,Error);ha.prototype.name=\"CustomError\";function ia(a){var b=a.l" +
    "ength-1;return 0<=b&&a.indexOf(\" \",b)==b}function ja(a,b){for(var " +
    "c=a.split(\"%s\"),d=\"\",e=Array.prototype.slice.call(arguments,1);e.l" +
    "ength&&1<c.length;)d+=c.shift()+e.shift();return d+c.join(\"%s\")}va" +
    "r ka=String.prototype.trim?function(a){return a.trim()}:function(a" +
    "){return a.replace(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function la(a,b){" +
    "return a<b?-1:a>b?1:0}function ma(a){return String(a).replace(/\\-(" +
    "[a-z])/g,function(a,c){return c.toUpperCase()})};function na(a,b){" +
    "b.unshift(a);ha.call(this,ja.apply(null,b));b.shift()}r(na,ha);na." +
    "prototype.name=\"AssertionError\";function oa(a,b,c){if(!a){var d=\"A" +
    "ssertion failed\";if(b)var d=d+(\": \"+b),e=Array.prototype.slice.cal" +
    "l(arguments,2);throw new na(\"\"+d,e||[]);}};var pa=Array.prototype;" +
    "function qa(a,b){if(q(a))return q(b)&&1==b.length?a.indexOf(b,0):-" +
    "1;for(var c=0;c<a.length;c++)if(c in a&&a[c]===b)return c;return-1" +
    "}function t(a,b){for(var c=a.length,d=q(a)?a.split(\"\"):a,e=0;e<c;e" +
    "++)e in d&&b.call(void 0,d[e],e,a)}function u(a,b,c){var d=c;t(a,f" +
    "unction(c,f){d=b.call(void 0,d,c,f,a)});return d}function ra(a,b){" +
    "for(var c=a.length,d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&b.c" +
    "all(void 0,d[e],e,a))return!0;return!1}\nfunction sa(a,b){for(var c" +
    "=a.length,d=q(a)?a.split(\"\"):a,e=0;e<c;e++)if(e in d&&!b.call(void" +
    " 0,d[e],e,a))return!1;return!0}function ta(a){return pa.concat.app" +
    "ly(pa,arguments)}function ua(a,b,c){oa(null!=a.length);return 2>=a" +
    "rguments.length?pa.slice.call(a,b):pa.slice.call(a,b,c)};function " +
    "va(a){var b=arguments.length;if(1==b&&\"array\"==ca(arguments[0]))re" +
    "turn va.apply(null,arguments[0]);for(var c={},d=0;d<b;d++)c[argume" +
    "nts[d]]=!0;return c};va(\"area base br col command embed hr img inp" +
    "ut keygen link meta param source track wbr\".split(\" \"));function v" +
    "(a,b){this.x=void 0!==a?a:0;this.y=void 0!==b?b:0}v.prototype.clon" +
    "e=function(){return new v(this.x,this.y)};v.prototype.toString=fun" +
    "ction(){return\"(\"+this.x+\", \"+this.y+\")\"};v.prototype.ceil=functio" +
    "n(){this.x=Math.ceil(this.x);this.y=Math.ceil(this.y);return this}" +
    ";v.prototype.floor=function(){this.x=Math.floor(this.x);this.y=Mat" +
    "h.floor(this.y);return this};v.prototype.round=function(){this.x=M" +
    "ath.round(this.x);this.y=Math.round(this.y);return this};function " +
    "w(a,b){this.width=a;this.height=b}w.prototype.clone=function(){ret" +
    "urn new w(this.width,this.height)};w.prototype.toString=function()" +
    "{return\"(\"+this.width+\" x \"+this.height+\")\"};w.prototype.ceil=func" +
    "tion(){this.width=Math.ceil(this.width);this.height=Math.ceil(this" +
    ".height);return this};w.prototype.floor=function(){this.width=Math" +
    ".floor(this.width);this.height=Math.floor(this.height);return this" +
    "};\nw.prototype.round=function(){this.width=Math.round(this.width);" +
    "this.height=Math.round(this.height);return this};var wa;a:{var xa=" +
    "aa.navigator;if(xa){var ya=xa.userAgent;if(ya){wa=ya;break a}}wa=\"" +
    "\"};function za(a){for(;a&&1!=a.nodeType;)a=a.previousSibling;retur" +
    "n a}function Aa(a,b){if(a.contains&&1==b.nodeType)return a==b||a.c" +
    "ontains(b);if(\"undefined\"!=typeof a.compareDocumentPosition)return" +
    " a==b||Boolean(a.compareDocumentPosition(b)&16);for(;b&&a!=b;)b=b." +
    "parentNode;return b==a}\nfunction Ba(a,b){if(a==b)return 0;if(a.com" +
    "pareDocumentPosition)return a.compareDocumentPosition(b)&2?1:-1;if" +
    "(\"sourceIndex\"in a||a.parentNode&&\"sourceIndex\"in a.parentNode){va" +
    "r c=1==a.nodeType,d=1==b.nodeType;if(c&&d)return a.sourceIndex-b.s" +
    "ourceIndex;var e=a.parentNode,f=b.parentNode;return e==f?Ca(a,b):!" +
    "c&&Aa(e,b)?-1*Da(a,b):!d&&Aa(f,a)?Da(b,a):(c?a.sourceIndex:e.sourc" +
    "eIndex)-(d?b.sourceIndex:f.sourceIndex)}d=x(a);c=d.createRange();c" +
    ".selectNode(a);c.collapse(!0);d=d.createRange();d.selectNode(b);\nd" +
    ".collapse(!0);return c.compareBoundaryPoints(aa.Range.START_TO_END" +
    ",d)}function Da(a,b){var c=a.parentNode;if(c==b)return-1;for(var d" +
    "=b;d.parentNode!=c;)d=d.parentNode;return Ca(d,a)}function Ca(a,b)" +
    "{for(var c=b;c=c.previousSibling;)if(c==a)return-1;return 1}functi" +
    "on x(a){oa(a,\"Node cannot be null or undefined.\");return 9==a.node" +
    "Type?a:a.ownerDocument||a.document}function Ea(a,b){a=a.parentNode" +
    ";for(var c=0;a;){oa(\"parentNode\"!=a.name);if(b(a))return a;a=a.par" +
    "entNode;c++}return null}\nfunction Fa(a){this.a=a||aa.document||doc" +
    "ument};function y(a,b,c,d){this.top=a;this.right=b;this.bottom=c;t" +
    "his.left=d}y.prototype.clone=function(){return new y(this.top,this" +
    ".right,this.bottom,this.left)};y.prototype.toString=function(){ret" +
    "urn\"(\"+this.top+\"t, \"+this.right+\"r, \"+this.bottom+\"b, \"+this.left" +
    "+\"l)\"};y.prototype.ceil=function(){this.top=Math.ceil(this.top);th" +
    "is.right=Math.ceil(this.right);this.bottom=Math.ceil(this.bottom);" +
    "this.left=Math.ceil(this.left);return this};\ny.prototype.floor=fun" +
    "ction(){this.top=Math.floor(this.top);this.right=Math.floor(this.r" +
    "ight);this.bottom=Math.floor(this.bottom);this.left=Math.floor(thi" +
    "s.left);return this};y.prototype.round=function(){this.top=Math.ro" +
    "und(this.top);this.right=Math.round(this.right);this.bottom=Math.r" +
    "ound(this.bottom);this.left=Math.round(this.left);return this};fun" +
    "ction z(a,b,c,d){this.left=a;this.top=b;this.width=c;this.height=d" +
    "}z.prototype.clone=function(){return new z(this.left,this.top,this" +
    ".width,this.height)};z.prototype.toString=function(){return\"(\"+thi" +
    "s.left+\", \"+this.top+\" - \"+this.width+\"w x \"+this.height+\"h)\"};z.p" +
    "rototype.ceil=function(){this.left=Math.ceil(this.left);this.top=M" +
    "ath.ceil(this.top);this.width=Math.ceil(this.width);this.height=Ma" +
    "th.ceil(this.height);return this};\nz.prototype.floor=function(){th" +
    "is.left=Math.floor(this.left);this.top=Math.floor(this.top);this.w" +
    "idth=Math.floor(this.width);this.height=Math.floor(this.height);re" +
    "turn this};z.prototype.round=function(){this.left=Math.round(this." +
    "left);this.top=Math.round(this.top);this.width=Math.round(this.wid" +
    "th);this.height=Math.round(this.height);return this};/*xxx_rpl_lic" +
    "*/\n/*xxx_rpl_lic*/\nfunction Ga(a,b){this.a=Ha[a]||\"unknown error\";" +
    "this.message=b||\"\";var c=this.a.replace(/((?:^|\\s+)[a-z])/g,functi" +
    "on(a){return a.toUpperCase().replace(/^[\\s\\xa0]+/g,\"\")}),d=c.lengt" +
    "h-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+=\"Error\";this.name=c;c=Error" +
    "(this.message);c.name=this.name;this.stack=c.stack||\"\"}r(Ga,Error)" +
    ";\nvar Ha={15:\"element not selectable\",11:\"element not visible\",31:" +
    "\"ime engine activation failed\",30:\"ime not available\",24:\"invalid " +
    "cookie domain\",29:\"invalid element coordinates\",12:\"invalid elemen" +
    "t state\",32:\"invalid selector\",51:\"invalid selector\",52:\"invalid s" +
    "elector\",17:\"javascript error\",405:\"unsupported operation\",34:\"mov" +
    "e target out of bounds\",27:\"no such alert\",7:\"no such element\",8:\"" +
    "no such frame\",23:\"no such window\",28:\"script timeout\",33:\"session" +
    " not created\",10:\"stale element reference\",\n0:\"success\",21:\"timeou" +
    "t\",25:\"unable to set cookie\",26:\"unexpected alert open\",13:\"unknow" +
    "n error\",9:\"unknown command\"};Ga.prototype.toString=function(){ret" +
    "urn this.name+\": \"+this.message};/*\n\n The MIT License\n\n Copyright " +
    "(c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permi" +
    "ssion is hereby granted, free of charge, to any person obtaining a" +
    " copy\n of this software and associated documentation files (the \"S" +
    "oftware\"), to\n deal in the Software without restriction, including" +
    " without limitation the\n rights to use, copy, modify, merge, publi" +
    "sh, distribute, sublicense, and/or\n sell copies of the Software, a" +
    "nd to permit persons to whom the Software is\n furnished to do so, " +
    "subject to the following conditions:\n\n The above copyright notice " +
    "and this permission notice shall be included in\n all copies or sub" +
    "stantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS " +
    "IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING " +
    "BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR" +
    " A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n " +
    "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR O" +
    "THER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWI" +
    "SE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR TH" +
    "E USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction A(a,b,c){thi" +
    "s.a=a;this.b=b||1;this.f=c||1};/*\n\n The MIT License\n\n Copyright (c" +
    ") 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permiss" +
    "ion is hereby granted, free of charge, to any person obtaining a c" +
    "opy\n of this software and associated documentation files (the \"Sof" +
    "tware\"), to\n deal in the Software without restriction, including w" +
    "ithout limitation the\n rights to use, copy, modify, merge, publish" +
    ", distribute, sublicense, and/or\n sell copies of the Software, and" +
    " to permit persons to whom the Software is\n furnished to do so, su" +
    "bject to the following conditions:\n\n The above copyright notice an" +
    "d this permission notice shall be included in\n all copies or subst" +
    "antial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS" +
    "\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BU" +
    "T NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A" +
    " PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AU" +
    "THORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTH" +
    "ER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE" +
    ", ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE " +
    "USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n " +
    "Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google In" +
    "c.\n\n Permission is hereby granted, free of charge, to any person o" +
    "btaining a copy\n of this software and associated documentation fil" +
    "es (the \"Software\"), to\n deal in the Software without restriction," +
    " including without limitation the\n rights to use, copy, modify, me" +
    "rge, publish, distribute, sublicense, and/or\n sell copies of the S" +
    "oftware, and to permit persons to whom the Software is\n furnished " +
    "to do so, subject to the following conditions:\n\n The above copyrig" +
    "ht notice and this permission notice shall be included in\n all cop" +
    "ies or substantial portions of the Software.\n\n THE SOFTWARE IS PRO" +
    "VIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, " +
    "INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n F" +
    "ITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT S" +
    "HALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DA" +
    "MAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT " +
    "OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFT" +
    "WARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MI" +
    "T License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 20" +
    "12 Google Inc.\n\n Permission is hereby granted, free of charge, to " +
    "any person obtaining a copy\n of this software and associated docum" +
    "entation files (the \"Software\"), to\n deal in the Software without " +
    "restriction, including without limitation the\n rights to use, copy" +
    ", modify, merge, publish, distribute, sublicense, and/or\n sell cop" +
    "ies of the Software, and to permit persons to whom the Software is" +
    "\n furnished to do so, subject to the following conditions:\n\n The a" +
    "bove copyright notice and this permission notice shall be included" +
    " in\n all copies or substantial portions of the Software.\n\n THE SOF" +
    "TWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS O" +
    "R\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHAN" +
    "TABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. I" +
    "N NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR A" +
    "NY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CON" +
    "TRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION W" +
    "ITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/" +
    "\nfunction Ia(a){this.b=a;this.a=0}function Ja(a){a=a.match(Ka);for" +
    "(var b=0;b<a.length;b++)La.test(a[b])&&a.splice(b,1);return new Ia" +
    "(a)}var Ka=RegExp(\"\\\\$?(?:(?![0-9-])[\\\\w-]+:)?(?![0-9-])[\\\\w-]+|\\\\" +
    "/\\\\/|\\\\.\\\\.|::|\\\\d+(?:\\\\.\\\\d*)?|\\\\.\\\\d+|\\\"[^\\\"]*\\\"|'[^']*'|[!<>]=|" +
    "\\\\s+|.\",\"g\"),La=/^\\s/;function C(a,b){return a.b[a.a+(b||0)]}funct" +
    "ion D(a){return a.b[a.a++]}function Ma(a){return a.b.length<=a.a};" +
    "/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyr" +
    "ight (c) 2012 Google Inc.\n\n Permission is hereby granted, free of " +
    "charge, to any person obtaining a copy\n of this software and assoc" +
    "iated documentation files (the \"Software\"), to\n deal in the Softwa" +
    "re without restriction, including without limitation the\n rights t" +
    "o use, copy, modify, merge, publish, distribute, sublicense, and/o" +
    "r\n sell copies of the Software, and to permit persons to whom the " +
    "Software is\n furnished to do so, subject to the following conditio" +
    "ns:\n\n The above copyright notice and this permission notice shall " +
    "be included in\n all copies or substantial portions of the Software" +
    ".\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND" +
    ", EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES" +
    " OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFR" +
    "INGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE L" +
    "IABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN AC" +
    "TION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN C" +
    "ONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE S" +
    "OFTWARE.\n*/\nfunction E(a){var b=null,c=a.nodeType;1==c&&(b=a.textC" +
    "ontent,b=void 0==b||null==b?a.innerText:b,b=void 0==b||null==b?\"\":" +
    "b);if(\"string\"!=typeof b)if(9==c||1==c){a=9==c?a.documentElement:a" +
    ".firstChild;for(var c=0,d=[],b=\"\";a;){do 1!=a.nodeType&&(b+=a.node" +
    "Value),d[c++]=a;while(a=a.firstChild);for(;c&&!(a=d[--c].nextSibli" +
    "ng););}}else b=a.nodeValue;return\"\"+b}\nfunction F(a,b,c){if(null==" +
    "=b)return!0;try{if(!a.getAttribute)return!1}catch(d){return!1}retu" +
    "rn null==c?!!a.getAttribute(b):a.getAttribute(b,2)==c}function Na(" +
    "a,b,c,d,e){return Oa.call(null,a,b,q(c)?c:null,q(d)?d:null,e||new " +
    "G)}\nfunction Oa(a,b,c,d,e){b.getElementsByName&&d&&\"name\"==c?(b=b." +
    "getElementsByName(d),t(b,function(b){a.a(b)&&H(e,b)})):b.getElemen" +
    "tsByClassName&&d&&\"class\"==c?(b=b.getElementsByClassName(d),t(b,fu" +
    "nction(b){b.className==d&&a.a(b)&&H(e,b)})):a instanceof J?Pa(a,b," +
    "c,d,e):b.getElementsByTagName&&(b=b.getElementsByTagName(a.f()),t(" +
    "b,function(a){F(a,c,d)&&H(e,a)}));return e}function Qa(a,b,c,d,e){" +
    "for(b=b.firstChild;b;b=b.nextSibling)F(b,c,d)&&a.a(b)&&H(e,b);retu" +
    "rn e}\nfunction Pa(a,b,c,d,e){for(b=b.firstChild;b;b=b.nextSibling)" +
    "F(b,c,d)&&a.a(b)&&H(e,b),Pa(a,b,c,d,e)};/*\n\n The MIT License\n\n Cop" +
    "yright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n" +
    "\n Permission is hereby granted, free of charge, to any person obta" +
    "ining a copy\n of this software and associated documentation files " +
    "(the \"Software\"), to\n deal in the Software without restriction, in" +
    "cluding without limitation the\n rights to use, copy, modify, merge" +
    ", publish, distribute, sublicense, and/or\n sell copies of the Soft" +
    "ware, and to permit persons to whom the Software is\n furnished to " +
    "do so, subject to the following conditions:\n\n The above copyright " +
    "notice and this permission notice shall be included in\n all copies" +
    " or substantial portions of the Software.\n\n THE SOFTWARE IS PROVID" +
    "ED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INC" +
    "LUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITN" +
    "ESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHAL" +
    "L THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAG" +
    "ES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR " +
    "OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWAR" +
    "E OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction G(){t" +
    "his.b=this.a=null;this.l=0}function Ra(a){this.node=a;this.a=this." +
    "b=null}function Sa(a,b){if(!a.a)return b;if(!b.a)return a;for(var " +
    "c=a.a,d=b.a,e=null,f=null,g=0;c&&d;)c.node==d.node?(f=c,c=c.a,d=d." +
    "a):0<Ba(c.node,d.node)?(f=d,d=d.a):(f=c,c=c.a),(f.b=e)?e.a=f:a.a=f" +
    ",e=f,g++;for(f=c||d;f;)f.b=e,e=e.a=f,g++,f=f.a;a.b=e;a.l=g;return " +
    "a}function Ta(a,b){var c=new Ra(b);c.a=a.a;a.b?a.a.b=c:a.a=a.b=c;a" +
    ".a=c;a.l++}function H(a,b){var c=new Ra(b);c.b=a.b;a.a?a.b.a=c:a.a" +
    "=a.b=c;a.b=c;a.l++}\nfunction Ua(a){return(a=a.a)?a.node:null}funct" +
    "ion Va(a){return(a=Ua(a))?E(a):\"\"}function K(a,b){return new Wa(a," +
    "!!b)}function Wa(a,b){this.f=a;this.b=(this.c=b)?a.b:a.a;this.a=nu" +
    "ll}function L(a){var b=a.b;if(null==b)return null;var c=a.a=b;a.b=" +
    "a.c?b.b:b.a;return c.node};/*\n\n The MIT License\n\n Copyright (c) 20" +
    "07 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission " +
    "is hereby granted, free of charge, to any person obtaining a copy\n" +
    " of this software and associated documentation files (the \"Softwar" +
    "e\"), to\n deal in the Software without restriction, including witho" +
    "ut limitation the\n rights to use, copy, modify, merge, publish, di" +
    "stribute, sublicense, and/or\n sell copies of the Software, and to " +
    "permit persons to whom the Software is\n furnished to do so, subjec" +
    "t to the following conditions:\n\n The above copyright notice and th" +
    "is permission notice shall be included in\n all copies or substanti" +
    "al portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", W" +
    "ITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NO" +
    "T LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PAR" +
    "TICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHOR" +
    "S OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n " +
    "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, AR" +
    "ISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE " +
    "OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Xa(a){switch(a.nod" +
    "eType){case 1:return ga(Ya,a);case 9:return Xa(a.documentElement);" +
    "case 11:case 10:case 6:case 12:return Za;default:return a.parentNo" +
    "de?Xa(a.parentNode):Za}}function Za(){return null}function Ya(a,b)" +
    "{if(a.prefix==b)return a.namespaceURI||\"http://www.w3.org/1999/xht" +
    "ml\";var c=a.getAttributeNode(\"xmlns:\"+b);return c&&c.specified?c.v" +
    "alue||null:a.parentNode&&9!=a.parentNode.nodeType?Ya(a.parentNode," +
    "b):null};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, In" +
    "c.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted," +
    " free of charge, to any person obtaining a copy\n of this software " +
    "and associated documentation files (the \"Software\"), to\n deal in t" +
    "he Software without restriction, including without limitation the\n" +
    " rights to use, copy, modify, merge, publish, distribute, sublicen" +
    "se, and/or\n sell copies of the Software, and to permit persons to " +
    "whom the Software is\n furnished to do so, subject to the following" +
    " conditions:\n\n The above copyright notice and this permission noti" +
    "ce shall be included in\n all copies or substantial portions of the" +
    " Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF" +
    " ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE W" +
    "ARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AN" +
    "D NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOL" +
    "DERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER" +
    " IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT O" +
    "F OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n" +
    " IN THE SOFTWARE.\n*/\n/*\n\n The MIT License\n\n Copyright (c) 2007 Cyb" +
    "ozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is her" +
    "eby granted, free of charge, to any person obtaining a copy\n of th" +
    "is software and associated documentation files (the \"Software\"), t" +
    "o\n deal in the Software without restriction, including without lim" +
    "itation the\n rights to use, copy, modify, merge, publish, distribu" +
    "te, sublicense, and/or\n sell copies of the Software, and to permit" +
    " persons to whom the Software is\n furnished to do so, subject to t" +
    "he following conditions:\n\n The above copyright notice and this per" +
    "mission notice shall be included in\n all copies or substantial por" +
    "tions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT" +
    " WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMI" +
    "TED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULA" +
    "R PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR C" +
    "OPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABIL" +
    "ITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n" +
    " FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTH" +
    "ER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction M(a){this.i=a;this.b=thi" +
    "s.g=!1;this.f=null}function N(a){return\"\\n  \"+a.toString().split(\"" +
    "\\n\").join(\"\\n  \")}function $a(a,b){a.g=b}function ab(a,b){a.b=b}fu" +
    "nction O(a,b){var c=a.a(b);return c instanceof G?+Va(c):+c}functio" +
    "n P(a,b){var c=a.a(b);return c instanceof G?Va(c):\"\"+c}function Q(" +
    "a,b){var c=a.a(b);return c instanceof G?!!c.l:!!c};/*\n\n The MIT Li" +
    "cense\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 G" +
    "oogle Inc.\n\n Permission is hereby granted, free of charge, to any " +
    "person obtaining a copy\n of this software and associated documenta" +
    "tion files (the \"Software\"), to\n deal in the Software without rest" +
    "riction, including without limitation the\n rights to use, copy, mo" +
    "dify, merge, publish, distribute, sublicense, and/or\n sell copies " +
    "of the Software, and to permit persons to whom the Software is\n fu" +
    "rnished to do so, subject to the following conditions:\n\n The above" +
    " copyright notice and this permission notice shall be included in\n" +
    " all copies or substantial portions of the Software.\n\n THE SOFTWAR" +
    "E IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n I" +
    "MPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABI" +
    "LITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO" +
    " EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY C" +
    "LAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRAC" +
    "T, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH " +
    "THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfun" +
    "ction bb(a,b,c){M.call(this,a.i);this.c=a;this.h=b;this.o=c;this.g" +
    "=b.g||c.g;this.b=b.b||c.b;this.c==cb&&(c.b||c.g||4==c.i||0==c.i||!" +
    "b.f?b.b||b.g||4==b.i||0==b.i||!c.f||(this.f={name:c.f.name,s:b}):t" +
    "his.f={name:b.f.name,s:c})}r(bb,M);\nfunction db(a,b,c,d,e){b=b.a(d" +
    ");c=c.a(d);var f;if(b instanceof G&&c instanceof G){e=K(b);for(d=L" +
    "(e);d;d=L(e))for(b=K(c),f=L(b);f;f=L(b))if(a(E(d),E(f)))return!0;r" +
    "eturn!1}if(b instanceof G||c instanceof G){b instanceof G?e=b:(e=c" +
    ",c=b);e=K(e);b=typeof c;for(d=L(e);d;d=L(e)){switch(b){case \"numbe" +
    "r\":d=+E(d);break;case \"boolean\":d=!!E(d);break;case \"string\":d=E(d" +
    ");break;default:throw Error(\"Illegal primitive type for comparison" +
    ".\");}if(a(d,c))return!0}return!1}return e?\"boolean\"==typeof b||\"bo" +
    "olean\"==typeof c?\na(!!b,!!c):\"number\"==typeof b||\"number\"==typeof " +
    "c?a(+b,+c):a(b,c):a(+b,+c)}bb.prototype.a=function(a){return this." +
    "c.m(this.h,this.o,a)};bb.prototype.toString=function(){var a=\"Bina" +
    "ry Expression: \"+this.c,a=a+N(this.h);return a+=N(this.o)};functio" +
    "n eb(a,b,c,d){this.a=a;this.A=b;this.i=c;this.m=d}eb.prototype.toS" +
    "tring=h(\"a\");var fb={};function R(a,b,c,d){if(fb.hasOwnProperty(a)" +
    ")throw Error(\"Binary operator already created: \"+a);a=new eb(a,b,c" +
    ",d);return fb[a.toString()]=a}\nR(\"div\",6,1,function(a,b,c){return " +
    "O(a,c)/O(b,c)});R(\"mod\",6,1,function(a,b,c){return O(a,c)%O(b,c)})" +
    ";R(\"*\",6,1,function(a,b,c){return O(a,c)*O(b,c)});R(\"+\",5,1,functi" +
    "on(a,b,c){return O(a,c)+O(b,c)});R(\"-\",5,1,function(a,b,c){return " +
    "O(a,c)-O(b,c)});R(\"<\",4,2,function(a,b,c){return db(function(a,b){" +
    "return a<b},a,b,c)});R(\">\",4,2,function(a,b,c){return db(function(" +
    "a,b){return a>b},a,b,c)});R(\"<=\",4,2,function(a,b,c){return db(fun" +
    "ction(a,b){return a<=b},a,b,c)});\nR(\">=\",4,2,function(a,b,c){retur" +
    "n db(function(a,b){return a>=b},a,b,c)});var cb=R(\"=\",3,2,function" +
    "(a,b,c){return db(function(a,b){return a==b},a,b,c,!0)});R(\"!=\",3," +
    "2,function(a,b,c){return db(function(a,b){return a!=b},a,b,c,!0)})" +
    ";R(\"and\",2,2,function(a,b,c){return Q(a,c)&&Q(b,c)});R(\"or\",1,2,fu" +
    "nction(a,b,c){return Q(a,c)||Q(b,c)});/*\n\n The MIT License\n\n Copyr" +
    "ight (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n " +
    "Permission is hereby granted, free of charge, to any person obtain" +
    "ing a copy\n of this software and associated documentation files (t" +
    "he \"Software\"), to\n deal in the Software without restriction, incl" +
    "uding without limitation the\n rights to use, copy, modify, merge, " +
    "publish, distribute, sublicense, and/or\n sell copies of the Softwa" +
    "re, and to permit persons to whom the Software is\n furnished to do" +
    " so, subject to the following conditions:\n\n The above copyright no" +
    "tice and this permission notice shall be included in\n all copies o" +
    "r substantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED" +
    " \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLU" +
    "DING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNES" +
    "S FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL " +
    "THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES"
  )
      .append(
    " OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OT" +
    "HERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE " +
    "OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction gb(a,b)" +
    "{if(b.a.length&&4!=a.i)throw Error(\"Primary expression must evalua" +
    "te to nodeset if filter has predicate(s).\");M.call(this,a.i);this." +
    "c=a;this.h=b;this.g=a.g;this.b=a.b}r(gb,M);gb.prototype.a=function" +
    "(a){a=this.c.a(a);return hb(this.h,a)};gb.prototype.toString=funct" +
    "ion(){var a;a=\"Filter:\"+N(this.c);return a+=N(this.h)};/*\n\n The MI" +
    "T License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 20" +
    "12 Google Inc.\n\n Permission is hereby granted, free of charge, to " +
    "any person obtaining a copy\n of this software and associated docum" +
    "entation files (the \"Software\"), to\n deal in the Software without " +
    "restriction, including without limitation the\n rights to use, copy" +
    ", modify, merge, publish, distribute, sublicense, and/or\n sell cop" +
    "ies of the Software, and to permit persons to whom the Software is" +
    "\n furnished to do so, subject to the following conditions:\n\n The a" +
    "bove copyright notice and this permission notice shall be included" +
    " in\n all copies or substantial portions of the Software.\n\n THE SOF" +
    "TWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS O" +
    "R\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHAN" +
    "TABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. I" +
    "N NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR A" +
    "NY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CON" +
    "TRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION W" +
    "ITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/" +
    "\nfunction ib(a,b){if(b.length<a.B)throw Error(\"Function \"+a.j+\" ex" +
    "pects at least\"+a.B+\" arguments, \"+b.length+\" given\");if(null!==a." +
    "v&&b.length>a.v)throw Error(\"Function \"+a.j+\" expects at most \"+a." +
    "v+\" arguments, \"+b.length+\" given\");a.C&&t(b,function(b,d){if(4!=b" +
    ".i)throw Error(\"Argument \"+d+\" to function \"+a.j+\" is not of type " +
    "Nodeset: \"+b);});M.call(this,a.i);this.h=a;this.c=b;$a(this,a.g||r" +
    "a(b,function(a){return a.g}));ab(this,a.F&&!b.length||a.D&&!!b.len" +
    "gth||ra(b,function(a){return a.b}))}\nr(ib,M);ib.prototype.a=functi" +
    "on(a){return this.h.m.apply(null,ta(a,this.c))};ib.prototype.toStr" +
    "ing=function(){var a=\"Function: \"+this.h;if(this.c.length)var b=u(" +
    "this.c,function(a,b){return a+N(b)},\"Arguments:\"),a=a+N(b);return " +
    "a};function jb(a,b,c,d,e,f,g,n,m){this.j=a;this.i=b;this.g=c;this." +
    "F=d;this.D=e;this.m=f;this.B=g;this.v=void 0!==n?n:g;this.C=!!m}jb" +
    ".prototype.toString=h(\"j\");var kb={};\nfunction S(a,b,c,d,e,f,g,n){" +
    "if(kb.hasOwnProperty(a))throw Error(\"Function already created: \"+a" +
    "+\".\");kb[a]=new jb(a,b,c,d,!1,e,f,g,n)}S(\"boolean\",2,!1,!1,functio" +
    "n(a,b){return Q(b,a)},1);S(\"ceiling\",1,!1,!1,function(a,b){return " +
    "Math.ceil(O(b,a))},1);S(\"concat\",3,!1,!1,function(a,b){var c=ua(ar" +
    "guments,1);return u(c,function(b,c){return b+P(c,a)},\"\")},2,null);" +
    "S(\"contains\",2,!1,!1,function(a,b,c){b=P(b,a);a=P(c,a);return-1!=b" +
    ".indexOf(a)},2);S(\"count\",1,!1,!1,function(a,b){return b.a(a).l},1" +
    ",1,!0);\nS(\"false\",2,!1,!1,p(!1),0);S(\"floor\",1,!1,!1,function(a,b)" +
    "{return Math.floor(O(b,a))},1);S(\"id\",4,!1,!1,function(a,b){var c=" +
    "a.a,d=9==c.nodeType?c:c.ownerDocument,c=P(b,a).split(/\\s+/),e=[];t" +
    "(c,function(a){a=d.getElementById(a);!a||0<=qa(e,a)||e.push(a)});e" +
    ".sort(Ba);var f=new G;t(e,function(a){H(f,a)});return f},1);S(\"lan" +
    "g\",2,!1,!1,p(!1),1);S(\"last\",1,!0,!1,function(a){if(1!=arguments.l" +
    "ength)throw Error(\"Function last expects ()\");return a.f},0);\nS(\"l" +
    "ocal-name\",3,!1,!0,function(a,b){var c=b?Ua(b.a(a)):a.a;return c?c" +
    ".localName||c.nodeName.toLowerCase():\"\"},0,1,!0);S(\"name\",3,!1,!0," +
    "function(a,b){var c=b?Ua(b.a(a)):a.a;return c?c.nodeName.toLowerCa" +
    "se():\"\"},0,1,!0);S(\"namespace-uri\",3,!0,!1,p(\"\"),0,1,!0);S(\"normal" +
    "ize-space\",3,!1,!0,function(a,b){return(b?P(b,a):E(a.a)).replace(/" +
    "[\\s\\xa0]+/g,\" \").replace(/^\\s+|\\s+$/g,\"\")},0,1);S(\"not\",2,!1,!1,fu" +
    "nction(a,b){return!Q(b,a)},1);S(\"number\",1,!1,!0,function(a,b){ret" +
    "urn b?O(b,a):+E(a.a)},0,1);\nS(\"position\",1,!0,!1,function(a){retur" +
    "n a.b},0);S(\"round\",1,!1,!1,function(a,b){return Math.round(O(b,a)" +
    ")},1);S(\"starts-with\",2,!1,!1,function(a,b,c){b=P(b,a);a=P(c,a);re" +
    "turn 0==b.lastIndexOf(a,0)},2);S(\"string\",3,!1,!0,function(a,b){re" +
    "turn b?P(b,a):E(a.a)},0,1);S(\"string-length\",1,!1,!0,function(a,b)" +
    "{return(b?P(b,a):E(a.a)).length},0,1);\nS(\"substring\",3,!1,!1,funct" +
    "ion(a,b,c,d){c=O(c,a);if(isNaN(c)||Infinity==c||-Infinity==c)retur" +
    "n\"\";d=d?O(d,a):Infinity;if(isNaN(d)||-Infinity===d)return\"\";c=Math" +
    ".round(c)-1;var e=Math.max(c,0);a=P(b,a);if(Infinity==d)return a.s" +
    "ubstring(e);b=Math.round(d);return a.substring(e,c+b)},2,3);S(\"sub" +
    "string-after\",3,!1,!1,function(a,b,c){b=P(b,a);a=P(c,a);c=b.indexO" +
    "f(a);return-1==c?\"\":b.substring(c+a.length)},2);\nS(\"substring-befo" +
    "re\",3,!1,!1,function(a,b,c){b=P(b,a);a=P(c,a);a=b.indexOf(a);retur" +
    "n-1==a?\"\":b.substring(0,a)},2);S(\"sum\",1,!1,!1,function(a,b){for(v" +
    "ar c=K(b.a(a)),d=0,e=L(c);e;e=L(c))d+=+E(e);return d},1,1,!0);S(\"t" +
    "ranslate\",3,!1,!1,function(a,b,c,d){b=P(b,a);c=P(c,a);var e=P(d,a)" +
    ";a=[];for(d=0;d<c.length;d++){var f=c.charAt(d);f in a||(a[f]=e.ch" +
    "arAt(d))}c=\"\";for(d=0;d<b.length;d++)f=b.charAt(d),c+=f in a?a[f]:" +
    "f;return c},3);S(\"true\",2,!1,!1,p(!0),0);/*\n\n The MIT License\n\n Co" +
    "pyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc." +
    "\n\n Permission is hereby granted, free of charge, to any person obt" +
    "aining a copy\n of this software and associated documentation files" +
    " (the \"Software\"), to\n deal in the Software without restriction, i" +
    "ncluding without limitation the\n rights to use, copy, modify, merg" +
    "e, publish, distribute, sublicense, and/or\n sell copies of the Sof" +
    "tware, and to permit persons to whom the Software is\n furnished to" +
    " do so, subject to the following conditions:\n\n The above copyright" +
    " notice and this permission notice shall be included in\n all copie" +
    "s or substantial portions of the Software.\n\n THE SOFTWARE IS PROVI" +
    "DED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, IN" +
    "CLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FIT" +
    "NESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHA" +
    "LL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMA" +
    "GES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR" +
    " OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWA" +
    "RE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\n/*\n\n The MIT " +
    "License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012" +
    " Google Inc.\n\n Permission is hereby granted, free of charge, to an" +
    "y person obtaining a copy\n of this software and associated documen" +
    "tation files (the \"Software\"), to\n deal in the Software without re" +
    "striction, including without limitation the\n rights to use, copy, " +
    "modify, merge, publish, distribute, sublicense, and/or\n sell copie" +
    "s of the Software, and to permit persons to whom the Software is\n " +
    "furnished to do so, subject to the following conditions:\n\n The abo" +
    "ve copyright notice and this permission notice shall be included i" +
    "n\n all copies or substantial portions of the Software.\n\n THE SOFTW" +
    "ARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
    " IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTA" +
    "BILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN " +
    "NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY" +
    " CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTR" +
    "ACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WIT" +
    "H THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nf" +
    "unction J(a,b){this.h=a;this.c=void 0!==b?b:null;this.b=null;switc" +
    "h(a){case \"comment\":this.b=8;break;case \"text\":this.b=3;break;case" +
    " \"processing-instruction\":this.b=7;break;case \"node\":break;default" +
    ":throw Error(\"Unexpected argument\");}}function lb(a){return\"commen" +
    "t\"==a||\"text\"==a||\"processing-instruction\"==a||\"node\"==a}J.prototy" +
    "pe.a=function(a){return null===this.b||this.b==a.nodeType};J.proto" +
    "type.f=h(\"h\");J.prototype.toString=function(){var a=\"Kind Test: \"+" +
    "this.h;null===this.c||(a+=N(this.c));return a};/*\n\n The MIT Licens" +
    "e\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Googl" +
    "e Inc.\n\n Permission is hereby granted, free of charge, to any pers" +
    "on obtaining a copy\n of this software and associated documentation" +
    " files (the \"Software\"), to\n deal in the Software without restrict" +
    "ion, including without limitation the\n rights to use, copy, modify" +
    ", merge, publish, distribute, sublicense, and/or\n sell copies of t" +
    "he Software, and to permit persons to whom the Software is\n furnis" +
    "hed to do so, subject to the following conditions:\n\n The above cop" +
    "yright notice and this permission notice shall be included in\n all" +
    " copies or substantial portions of the Software.\n\n THE SOFTWARE IS" +
    " PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLI" +
    "ED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY" +
    ",\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVE" +
    "NT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM" +
    ", DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, T" +
    "ORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE " +
    "SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunctio" +
    "n mb(a){M.call(this,3);this.c=a.substring(1,a.length-1)}r(mb,M);mb" +
    ".prototype.a=h(\"c\");mb.prototype.toString=function(){return\"Litera" +
    "l: \"+this.c};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs" +
    ", Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby gran" +
    "ted, free of charge, to any person obtaining a copy\n of this softw" +
    "are and associated documentation files (the \"Software\"), to\n deal " +
    "in the Software without restriction, including without limitation " +
    "the\n rights to use, copy, modify, merge, publish, distribute, subl" +
    "icense, and/or\n sell copies of the Software, and to permit persons" +
    " to whom the Software is\n furnished to do so, subject to the follo" +
    "wing conditions:\n\n The above copyright notice and this permission " +
    "notice shall be included in\n all copies or substantial portions of" +
    " the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANT" +
    "Y OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO T" +
    "HE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOS" +
    "E AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT" +
    " HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHE" +
    "THER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, O" +
    "UT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALI" +
    "NGS\n IN THE SOFTWARE.\n*/\nfunction nb(a,b){this.j=a.toLowerCase();t" +
    "his.b=b?b.toLowerCase():\"http://www.w3.org/1999/xhtml\"}nb.prototyp" +
    "e.a=function(a){var b=a.nodeType;return 1!=b&&2!=b?!1:\"*\"!=this.j&" +
    "&this.j!=a.nodeName.toLowerCase()?!1:this.b==(a.namespaceURI?a.nam" +
    "espaceURI.toLowerCase():\"http://www.w3.org/1999/xhtml\")};nb.protot" +
    "ype.f=h(\"j\");nb.prototype.toString=function(){return\"Name Test: \"+" +
    "(\"http://www.w3.org/1999/xhtml\"==this.b?\"\":this.b+\":\")+this.j};/*\n" +
    "\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyrigh" +
    "t (c) 2012 Google Inc.\n\n Permission is hereby granted, free of cha" +
    "rge, to any person obtaining a copy\n of this software and associat" +
    "ed documentation files (the \"Software\"), to\n deal in the Software " +
    "without restriction, including without limitation the\n rights to u" +
    "se, copy, modify, merge, publish, distribute, sublicense, and/or\n " +
    "sell copies of the Software, and to permit persons to whom the Sof" +
    "tware is\n furnished to do so, subject to the following conditions:" +
    "\n\n The above copyright notice and this permission notice shall be " +
    "included in\n all copies or substantial portions of the Software.\n\n" +
    " THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, E" +
    "XPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF" +
    " MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRING" +
    "EMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIAB" +
    "LE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTIO" +
    "N OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONN" +
    "ECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFT" +
    "WARE.\n*/\nfunction ob(a){M.call(this,1);this.c=a}r(ob,M);ob.prototy" +
    "pe.a=h(\"c\");ob.prototype.toString=function(){return\"Number: \"+this" +
    ".c};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n C" +
    "opyright (c) 2012 Google Inc.\n\n Permission is hereby granted, free" +
    " of charge, to any person obtaining a copy\n of this software and a" +
    "ssociated documentation files (the \"Software\"), to\n deal in the So" +
    "ftware without restriction, including without limitation the\n righ" +
    "ts to use, copy, modify, merge, publish, distribute, sublicense, a" +
    "nd/or\n sell copies of the Software, and to permit persons to whom " +
    "the Software is\n furnished to do so, subject to the following cond" +
    "itions:\n\n The above copyright notice and this permission notice sh" +
    "all be included in\n all copies or substantial portions of the Soft" +
    "ware.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY " +
    "KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRAN" +
    "TIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NON" +
    "INFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS " +
    "BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN A" +
    "N ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR " +
    "IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN T" +
    "HE SOFTWARE.\n*/\nfunction pb(a,b){M.call(this,a.i);this.h=a;this.c=" +
    "b;this.g=a.g;this.b=a.b;if(1==this.c.length){var c=this.c[0];c.u||" +
    "c.c!=qb||(c=c.o,\"*\"!=c.f()&&(this.f={name:c.f(),s:null}))}}r(pb,M)" +
    ";function rb(){M.call(this,4)}r(rb,M);rb.prototype.a=function(a){v" +
    "ar b=new G;a=a.a;9==a.nodeType?H(b,a):H(b,a.ownerDocument);return " +
    "b};rb.prototype.toString=p(\"Root Helper Expression\");function sb()" +
    "{M.call(this,4)}r(sb,M);sb.prototype.a=function(a){var b=new G;H(b" +
    ",a.a);return b};sb.prototype.toString=p(\"Context Helper Expression" +
    "\");\nfunction tb(a){return\"/\"==a||\"//\"==a}pb.prototype.a=function(a" +
    "){var b=this.h.a(a);if(!(b instanceof G))throw Error(\"Filter expre" +
    "ssion must evaluate to nodeset.\");a=this.c;for(var c=0,d=a.length;" +
    "c<d&&b.l;c++){var e=a[c],f=K(b,e.c.a),g;if(e.g||e.c!=ub)if(e.g||e." +
    "c!=vb)for(g=L(f),b=e.a(new A(g));null!=(g=L(f));)g=e.a(new A(g)),b" +
    "=Sa(b,g);else g=L(f),b=e.a(new A(g));else{for(g=L(f);(b=L(f))&&(!g" +
    ".contains||g.contains(b))&&b.compareDocumentPosition(g)&8;g=b);b=e" +
    ".a(new A(g))}}return b};\npb.prototype.toString=function(){var a;a=" +
    "\"Path Expression:\"+N(this.h);if(this.c.length){var b=u(this.c,func" +
    "tion(a,b){return a+N(b)},\"Steps:\");a+=N(b)}return a};/*\n\n The MIT " +
    "License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012" +
    " Google Inc.\n\n Permission is hereby granted, free of charge, to an" +
    "y person obtaining a copy\n of this software and associated documen" +
    "tation files (the \"Software\"), to\n deal in the Software without re" +
    "striction, including without limitation the\n rights to use, copy, " +
    "modify, merge, publish, distribute, sublicense, and/or\n sell copie" +
    "s of the Software, and to permit persons to whom the Software is\n " +
    "furnished to do so, subject to the following conditions:\n\n The abo" +
    "ve copyright notice and this permission notice shall be included i" +
    "n\n all copies or substantial portions of the Software.\n\n THE SOFTW" +
    "ARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
    " IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTA" +
    "BILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN " +
    "NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY" +
    " CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN AN ACTION OF CONTR" +
    "ACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR IN CONNECTION WIT" +
    "H THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nf" +
    "unction wb(a,b){this.a=a;this.b=!!b}\nfunction hb(a,b,c){for(c=c||0" +
    ";c<a.a.length;c++)for(var d=a.a[c],e=K(b),f=b.l,g,n=0;g=L(e);n++){" +
    "var m=a.b?f-n:n+1;g=d.a(new A(g,m,f));if(\"number\"==typeof g)m=m==g" +
    ";else if(\"string\"==typeof g||\"boolean\"==typeof g)m=!!g;else if(g i" +
    "nstanceof G)m=0<g.l;else throw Error(\"Predicate.evaluate returned " +
    "an unexpected type.\");if(!m){m=e;g=m.f;var l=m.a;if(!l)throw Error" +
    "(\"Next must be called at least once before remove.\");var k=l.b,l=l" +
    ".a;k?k.a=l:g.a=l;l?l.b=k:g.b=k;g.l--;m.a=null}}return b}\nwb.protot" +
    "ype.toString=function(){return u(this.a,function(a,b){return a+N(b" +
    ")},\"Predicates:\")};/*\n\n The MIT License\n\n Copyright (c) 2007 Cyboz" +
    "u Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission is hereb" +
    "y granted, free of charge, to any person obtaining a copy\n of this" +
    " software and associated documentation files (the \"Software\"), to\n" +
    " deal in the Software without restriction, including without limit" +
    "ation the\n rights to use, copy, modify, merge, publish, distribute" +
    ", sublicense, and/or\n sell copies of the Software, and to permit p" +
    "ersons to whom the Software is\n furnished to do so, subject to the" +
    " following conditions:\n\n The above copyright notice and this permi" +
    "ssion notice shall be included in\n all copies or substantial porti" +
    "ons of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT W" +
    "ARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITE" +
    "D TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR " +
    "PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COP" +
    "YRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILIT" +
    "Y, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n F" +
    "ROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER" +
    " DEALINGS\n IN THE SOFTWARE.\n*/\nfunction T(a,b,c,d){M.call(this,4);" +
    "this.c=a;this.o=b;this.h=c||new wb([]);this.u=!!d;b=this.h;b=0<b.a" +
    ".length?b.a[0].f:null;a.b&&b&&(this.f={name:b.name,s:b.s});a:{a=th" +
    "is.h;for(b=0;b<a.a.length;b++)if(c=a.a[b],c.g||1==c.i||0==c.i){a=!" +
    "0;break a}a=!1}this.g=a}r(T,M);\nT.prototype.a=function(a){var b=a." +
    "a,c=null,c=this.f,d=null,e=null,f=0;c&&(d=c.name,e=c.s?P(c.s,a):nu" +
    "ll,f=1);if(this.u)if(this.g||this.c!=xb)if(a=K((new T(yb,new J(\"no" +
    "de\"))).a(a)),b=L(a))for(c=this.m(b,d,e,f);null!=(b=L(a));)c=Sa(c,t" +
    "his.m(b,d,e,f));else c=new G;else c=Na(this.o,b,d,e),c=hb(this.h,c" +
    ",f);else c=this.m(a.a,d,e,f);return c};T.prototype.m=function(a,b," +
    "c,d){a=this.c.f(this.o,a,b,c);return a=hb(this.h,a,d)};\nT.prototyp" +
    "e.toString=function(){var a;a=\"Step:\"+N(\"Operator: \"+(this.u?\"//\":" +
    "\"/\"));this.c.j&&(a+=N(\"Axis: \"+this.c));a+=N(this.o);if(this.h.a.l" +
    "ength){var b=u(this.h.a,function(a,b){return a+N(b)},\"Predicates:\"" +
    ");a+=N(b)}return a};function zb(a,b,c,d){this.j=a;this.f=b;this.a=" +
    "c;this.b=d}zb.prototype.toString=h(\"j\");var Ab={};function U(a,b,c" +
    ",d){if(Ab.hasOwnProperty(a))throw Error(\"Axis already created: \"+a" +
    ");b=new zb(a,b,c,!!d);return Ab[a]=b}\nU(\"ancestor\",function(a,b){f" +
    "or(var c=new G,d=b;d=d.parentNode;)a.a(d)&&Ta(c,d);return c},!0);U" +
    "(\"ancestor-or-self\",function(a,b){var c=new G,d=b;do a.a(d)&&Ta(c," +
    "d);while(d=d.parentNode);return c},!0);var qb=U(\"attribute\",functi" +
    "on(a,b){var c=new G,d=a.f(),e=b.attributes;if(e)if(a instanceof J&" +
    "&null===a.b||\"*\"==d)for(var d=0,f;f=e[d];d++)H(c,f);else(f=e.getNa" +
    "medItem(d))&&H(c,f);return c},!1),xb=U(\"child\",function(a,b,c,d,e)" +
    "{return Qa.call(null,a,b,q(c)?c:null,q(d)?d:null,e||new G)},!1,!0)" +
    ";\nU(\"descendant\",Na,!1,!0);var yb=U(\"descendant-or-self\",function(" +
    "a,b,c,d){var e=new G;F(b,c,d)&&a.a(b)&&H(e,b);return Na(a,b,c,d,e)" +
    "},!1,!0),ub=U(\"following\",function(a,b,c,d){var e=new G;do for(var" +
    " f=b;f=f.nextSibling;)F(f,c,d)&&a.a(f)&&H(e,f),e=Na(a,f,c,d,e);whi" +
    "le(b=b.parentNode);return e},!1,!0);U(\"following-sibling\",function" +
    "(a,b){for(var c=new G,d=b;d=d.nextSibling;)a.a(d)&&H(c,d);return c" +
    "},!1);U(\"namespace\",function(){return new G},!1);\nvar Bb=U(\"parent" +
    "\",function(a,b){var c=new G;if(9==b.nodeType)return c;if(2==b.node" +
    "Type)return H(c,b.ownerElement),c;var d=b.parentNode;a.a(d)&&H(c,d" +
    ");return c},!1),vb=U(\"preceding\",function(a,b,c,d){var e=new G,f=[" +
    "];do f.unshift(b);while(b=b.parentNode);for(var g=1,n=f.length;g<n" +
    ";g++){var m=[];for(b=f[g];b=b.previousSibling;)m.unshift(b);for(va" +
    "r l=0,k=m.length;l<k;l++)b=m[l],F(b,c,d)&&a.a(b)&&H(e,b),e=Na(a,b," +
    "c,d,e)}return e},!0,!0);\nU(\"preceding-sibling\",function(a,b){for(v" +
    "ar c=new G,d=b;d=d.previousSibling;)a.a(d)&&Ta(c,d);return c},!0);" +
    "var Cb=U(\"self\",function(a,b){var c=new G;a.a(b)&&H(c,b);return c}" +
    ",!1);/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc.\n " +
    "Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted, fre" +
    "e of charge, to any person obtaining a copy\n of this software and " +
    "associated documentation files (the \"Software\"), to\n deal in the S" +
    "oftware without restriction, including without limitation the\n rig" +
    "hts to use, copy, modify, merge, publish, distribute, sublicense, " +
    "and/or\n sell copies of the Software, and to permit persons to whom" +
    " the Software is\n furnished to do so, subject to the following con" +
    "ditions:\n\n The above copyright notice and this permission notice s" +
    "hall be included in\n all copies or substantial portions of the Sof" +
    "tware.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY" +
    " KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRA" +
    "NTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND NO" +
    "NINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDERS" +
    " BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER IN " +
    "AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF OR" +
    " IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n IN " +
    "THE SOFTWARE.\n*/\nfunction Db(a){M.call(this,1);this.c=a;this.g=a.g" +
    ";this.b=a.b}r(Db,M);Db.prototype.a=function(a){return-O(this.c,a)}" +
    ";Db.prototype.toString=function(){return\"Unary Expression: -\"+N(th" +
    "is.c)};/*\n\n The MIT License\n\n Copyright (c) 2007 Cybozu Labs, Inc." +
    "\n Copyright (c) 2012 Google Inc.\n\n Permission is hereby granted, f" +
    "ree of charge, to any person obtaining a copy\n of this software an" +
    "d associated documentation files (the \"Software\"), to\n deal in the" +
    " Software without restriction, including without limitation the\n r" +
    "ights to use, copy, modify, merge, publish, distribute, sublicense" +
    ", and/or\n sell copies of the Software, and to permit persons to wh" +
    "om the Software is\n furnished to do so, subject to the following c" +
    "onditions:\n\n The above copyright notice and this permission notice" +
    " shall be included in\n all copies or substantial portions of the S" +
    "oftware.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF A" +
    "NY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NOT LIMITED TO THE WAR" +
    "RANTIES OF MERCHANTABILITY,\n FITNESS FOR A PARTICULAR PURPOSE AND " +
    "NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHORS OR COPYRIGHT HOLDE" +
    "RS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n LIABILITY, WHETHER I" +
    "N AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n FROM, OUT OF " +
    "OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS\n I" +
    "N THE SOFTWARE.\n*/\nfunction Eb(a){M.call(this,4);this.c=a;$a(this," +
    "ra(this.c,function(a){return a.g}));ab(this,ra(this.c,function(a){" +
    "return a.b}))}r(Eb,M);Eb.prototype.a=function(a){var b=new G;t(thi" +
    "s.c,function(c){c=c.a(a);if(!(c instanceof G))throw Error(\"Path ex" +
    "pression must evaluate to NodeSet.\");b=Sa(b,c)});return b};Eb.prot" +
    "otype.toString=function(){return u(this.c,function(a,b){return a+N" +
    "(b)},\"Union Expression:\")};/*\n\n The MIT License\n\n Copyright (c) 20" +
    "07 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permission " +
    "is hereby granted, free of charge, to any person obtaining a copy\n" +
    " of this software and associated documentation files (the \"Softwar" +
    "e\"), to\n deal in the Software without restriction, including witho" +
    "ut limitation the\n rights to use, copy, modify, merge, publish, di" +
    "stribute, sublicense, and/or\n sell copies of the Software, and to " +
    "permit persons to whom the Software is\n furnished to do so, subjec" +
    "t to the following conditions:\n\n The above copyright notice and th" +
    "is permission notice shall be included in\n all copies or substanti" +
    "al portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS IS\", W" +
    "ITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING BUT NO" +
    "T LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR A PAR" +
    "TICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n AUTHOR" +
    "S OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n " +
    "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, AR" +
    "ISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE " +
    "OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Fb(a,b){this.a=a;t" +
    "his.b=b}function Gb(a){for(var b,c=[];;){W(a,\"Missing right hand s" +
    "ide of binary expression.\");b=Hb(a);var d=D(a.a);if(!d)break;var e" +
    "=(d=fb[d]||null)&&d.A;if(!e){a.a.a--;break}for(;c.length&&e<=c[c.l" +
    "ength-1].A;)b=new bb(c.pop(),c.pop(),b);c.push(b,d)}for(;c.length;" +
    ")b=new bb(c.pop(),c.pop(),b);return b}function W(a,b){if(Ma(a.a))t" +
    "hrow Error(b);}function Ib(a,b){var c=D(a.a);if(c!=b)throw Error(\"" +
    "Bad token, expected: \"+b+\" got: \"+c);}\nfunction Jb(a){a=D(a.a);if(" +
    "\")\"!=a)throw Error(\"Bad token: \"+a);}function Kb(a){a=D(a.a);if(2>" +
    "a.length)throw Error(\"Unclosed literal string\");return new mb(a)}f" +
    "unction Lb(a){var b=D(a.a),c=b.indexOf(\":\");if(-1==c)return new nb" +
    "(b);var d=b.substring(0,c);a=a.b(d);if(!a)throw Error(\"Namespace p" +
    "refix not declared: \"+d);b=b.substr(c+1);return new nb(b,a)}\nfunct" +
    "ion Mb(a){var b,c=[],d;if(tb(C(a.a))){b=D(a.a);d=C(a.a);if(\"/\"==b&" +
    "&(Ma(a.a)||\".\"!=d&&\"..\"!=d&&\"@\"!=d&&\"*\"!=d&&!/(?![0-9])[\\w]/.test(" +
    "d)))return new rb;d=new rb;W(a,\"Missing next location step.\");b=Nb" +
    "(a,b);c.push(b)}else{a:{b=C(a.a);d=b.charAt(0);switch(d){case \"$\":" +
    "throw Error(\"Variable reference not allowed in HTML XPath\");case \"" +
    "(\":D(a.a);b=Gb(a);W(a,'unclosed \"(\"');Ib(a,\")\");break;case '\"':cas" +
    "e \"'\":b=Kb(a);break;default:if(isNaN(+b))if(!lb(b)&&/(?![0-9])[\\w]" +
    "/.test(d)&&\"(\"==C(a.a,1)){b=D(a.a);\nb=kb[b]||null;D(a.a);for(d=[];" +
    "\")\"!=C(a.a);){W(a,\"Missing function argument list.\");d.push(Gb(a))" +
    ";if(\",\"!=C(a.a))break;D(a.a)}W(a,\"Unclosed function argument list." +
    "\");Jb(a);b=new ib(b,d)}else{b=null;break a}else b=new ob(+D(a.a))}" +
    "\"[\"==C(a.a)&&(d=new wb(Ob(a)),b=new gb(b,d))}if(b)if(tb(C(a.a)))d=" +
    "b;else return b;else b=Nb(a,\"/\"),d=new sb,c.push(b)}for(;tb(C(a.a)" +
    ");)b=D(a.a),W(a,\"Missing next location step.\"),b=Nb(a,b),c.push(b)" +
    ";return new pb(d,c)}\nfunction Nb(a,b){var c,d,e;if(\"/\"!=b&&\"//\"!=b" +
    ")throw Error('Step op should be \"/\" or \"//\"');if(\".\"==C(a.a))retur" +
    "n d=new T(Cb,new J(\"node\")),D(a.a),d;if(\"..\"==C(a.a))return d=new " +
    "T(Bb,new J(\"node\")),D(a.a),d;var f;if(\"@\"==C(a.a))f=qb,D(a.a),W(a," +
    "\"Missing attribute name\");else if(\"::\"==C(a.a,1)){if(!/(?![0-9])[\\" +
    "w]/.test(C(a.a).charAt(0)))throw Error(\"Bad token: \"+D(a.a));c=D(a" +
    ".a);f=Ab[c]||null;if(!f)throw Error(\"No axis with name: \"+c);D(a.a" +
    ");W(a,\"Missing node name\")}else f=xb;c=C(a.a);if(/(?![0-9])[\\w]/.t" +
    "est(c.charAt(0)))if(\"(\"==\nC(a.a,1)){if(!lb(c))throw Error(\"Invalid" +
    " node type: \"+c);c=D(a.a);if(!lb(c))throw Error(\"Invalid type name" +
    ": \"+c);Ib(a,\"(\");W(a,\"Bad nodetype\");e=C(a.a).charAt(0);var g=null"
  )
      .append(
    ";if('\"'==e||\"'\"==e)g=Kb(a);W(a,\"Bad nodetype\");Jb(a);c=new J(c,g)}" +
    "else c=Lb(a);else if(\"*\"==c)c=Lb(a);else throw Error(\"Bad token: \"" +
    "+D(a.a));e=new wb(Ob(a),f.a);return d||new T(f,c,e,\"//\"==b)}\nfunct" +
    "ion Ob(a){for(var b=[];\"[\"==C(a.a);){D(a.a);W(a,\"Missing predicate" +
    " expression.\");var c=Gb(a);b.push(c);W(a,\"Unclosed predicate expre" +
    "ssion.\");Ib(a,\"]\")}return b}function Hb(a){if(\"-\"==C(a.a))return D" +
    "(a.a),new Db(Hb(a));var b=Mb(a);if(\"|\"!=C(a.a))a=b;else{for(b=[b];" +
    "\"|\"==D(a.a);)W(a,\"Missing next union location path.\"),b.push(Mb(a)" +
    ");a.a.a--;a=new Eb(b)}return a};/*\n\n The MIT License\n\n Copyright (" +
    "c) 2007 Cybozu Labs, Inc.\n Copyright (c) 2012 Google Inc.\n\n Permis" +
    "sion is hereby granted, free of charge, to any person obtaining a " +
    "copy\n of this software and associated documentation files (the \"So" +
    "ftware\"), to\n deal in the Software without restriction, including " +
    "without limitation the\n rights to use, copy, modify, merge, publis" +
    "h, distribute, sublicense, and/or\n sell copies of the Software, an" +
    "d to permit persons to whom the Software is\n furnished to do so, s" +
    "ubject to the following conditions:\n\n The above copyright notice a" +
    "nd this permission notice shall be included in\n all copies or subs" +
    "tantial portions of the Software.\n\n THE SOFTWARE IS PROVIDED \"AS I" +
    "S\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n IMPLIED, INCLUDING B" +
    "UT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n FITNESS FOR " +
    "A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n A" +
    "UTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OT" +
    "HER\n LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWIS" +
    "E, ARISING\n FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE" +
    " USE OR OTHER DEALINGS\n IN THE SOFTWARE.\n*/\nfunction Pb(a,b){if(!a" +
    ".length)throw Error(\"Empty XPath expression.\");var c=Ja(a);if(Ma(c" +
    "))throw Error(\"Invalid XPath expression.\");b?\"function\"==ca(b)||(b" +
    "=fa(b.lookupNamespaceURI,b)):b=p(null);var d=Gb(new Fb(c,b));if(!M" +
    "a(c))throw Error(\"Bad token: \"+D(c));this.evaluate=function(a,b){v" +
    "ar c=d.a(new A(a));return new X(c,b)}}\nfunction X(a,b){if(0==b)if(" +
    "a instanceof G)b=4;else if(\"string\"==typeof a)b=2;else if(\"number\"" +
    "==typeof a)b=1;else if(\"boolean\"==typeof a)b=3;else throw Error(\"U" +
    "nexpected evaluation result.\");if(2!=b&&1!=b&&3!=b&&!(a instanceof" +
    " G))throw Error(\"value could not be converted to the specified typ" +
    "e\");this.resultType=b;var c;switch(b){case 2:this.stringValue=a in" +
    "stanceof G?Va(a):\"\"+a;break;case 1:this.numberValue=a instanceof G" +
    "?+Va(a):+a;break;case 3:this.booleanValue=a instanceof G?0<a.l:!!a" +
    ";break;case 4:case 5:case 6:case 7:var d=\nK(a);c=[];for(var e=L(d)" +
    ";e;e=L(d))c.push(e);this.snapshotLength=a.l;this.invalidIteratorSt" +
    "ate=!1;break;case 8:case 9:this.singleNodeValue=Ua(a);break;defaul" +
    "t:throw Error(\"Unknown XPathResult type.\");}var f=0;this.iterateNe" +
    "xt=function(){if(4!=b&&5!=b)throw Error(\"iterateNext called with w" +
    "rong result type\");return f>=c.length?null:c[f++]};this.snapshotIt" +
    "em=function(a){if(6!=b&&7!=b)throw Error(\"snapshotItem called with" +
    " wrong result type\");return a>=c.length||0>a?null:c[a]}}X.ANY_TYPE" +
    "=0;\nX.NUMBER_TYPE=1;X.STRING_TYPE=2;X.BOOLEAN_TYPE=3;X.UNORDERED_N" +
    "ODE_ITERATOR_TYPE=4;X.ORDERED_NODE_ITERATOR_TYPE=5;X.UNORDERED_NOD" +
    "E_SNAPSHOT_TYPE=6;X.ORDERED_NODE_SNAPSHOT_TYPE=7;X.ANY_UNORDERED_N" +
    "ODE_TYPE=8;X.FIRST_ORDERED_NODE_TYPE=9;function Qb(a){this.lookupN" +
    "amespaceURI=Xa(a)}\nfunction Rb(a){a=a||aa;var b=a.document;b.evalu" +
    "ate||(a.XPathResult=X,b.evaluate=function(a,b,e,f){return(new Pb(a" +
    ",e)).evaluate(b,f)},b.createExpression=function(a,b){return new Pb" +
    "(a,b)},b.createNSResolver=function(a){return new Qb(a)})}ba(\"wgxpa" +
    "th.install\",Rb);/*xxx_rpl_lic*/\nvar Sb=function(){var a={I:\"http:/" +
    "/www.w3.org/2000/svg\"};return function(b){return a[b]||null}}();\nf" +
    "unction Tb(a,b){var c=x(a);if(!c.documentElement)return null;Rb(c?" +
    "c.parentWindow||c.defaultView:window);try{for(var d=c.createNSReso" +
    "lver?c.createNSResolver(c.documentElement):Sb,e={},f=c.getElements" +
    "ByTagName(\"*\"),g=0;g<f.length;++g){var n=f[g],m=n.namespaceURI;if(" +
    "!e[m]){var l=n.lookupPrefix(m);if(!l){var k=m.match(\".*/(\\\\w+)/?$\"" +
    ");k?l=k[1]:l=\"xhtml\"}e[m]=l}}var B={},I;for(I in e)B[e[I]]=I;d=fun" +
    "ction(a){return B[a]||null};try{return c.evaluate(b,a,d,9,null)}ca" +
    "tch(V){if(\"TypeError\"===V.name)return d=\nc.createNSResolver?c.crea" +
    "teNSResolver(c.documentElement):Sb,c.evaluate(b,a,d,9,null);throw " +
    "V;}}catch(fc){throw new Ga(32,\"Unable to locate an element with th" +
    "e xpath expression \"+b+\" because of the following error:\\n\"+fc);}}" +
    "\nfunction Ub(a,b){var c=function(){var c=Tb(b,a);return c?c.single" +
    "NodeValue||null:b.selectSingleNode?(c=x(b),c.setProperty&&c.setPro" +
    "perty(\"SelectionLanguage\",\"XPath\"),b.selectSingleNode(a)):null}();" +
    "if(null!==c&&(!c||1!=c.nodeType))throw new Ga(32,'The result of th" +
    "e xpath expression \"'+a+'\" is: '+c+\". It should be an element.\");r" +
    "eturn c};var Vb={aliceblue:\"#f0f8ff\",antiquewhite:\"#faebd7\",aqua:\"" +
    "#00ffff\",aquamarine:\"#7fffd4\",azure:\"#f0ffff\",beige:\"#f5f5dc\",bisq" +
    "ue:\"#ffe4c4\",black:\"#000000\",blanchedalmond:\"#ffebcd\",blue:\"#0000f" +
    "f\",blueviolet:\"#8a2be2\",brown:\"#a52a2a\",burlywood:\"#deb887\",cadetb" +
    "lue:\"#5f9ea0\",chartreuse:\"#7fff00\",chocolate:\"#d2691e\",coral:\"#ff7" +
    "f50\",cornflowerblue:\"#6495ed\",cornsilk:\"#fff8dc\",crimson:\"#dc143c\"" +
    ",cyan:\"#00ffff\",darkblue:\"#00008b\",darkcyan:\"#008b8b\",darkgoldenro" +
    "d:\"#b8860b\",darkgray:\"#a9a9a9\",darkgreen:\"#006400\",\ndarkgrey:\"#a9a" +
    "9a9\",darkkhaki:\"#bdb76b\",darkmagenta:\"#8b008b\",darkolivegreen:\"#55" +
    "6b2f\",darkorange:\"#ff8c00\",darkorchid:\"#9932cc\",darkred:\"#8b0000\"," +
    "darksalmon:\"#e9967a\",darkseagreen:\"#8fbc8f\",darkslateblue:\"#483d8b" +
    "\",darkslategray:\"#2f4f4f\",darkslategrey:\"#2f4f4f\",darkturquoise:\"#" +
    "00ced1\",darkviolet:\"#9400d3\",deeppink:\"#ff1493\",deepskyblue:\"#00bf" +
    "ff\",dimgray:\"#696969\",dimgrey:\"#696969\",dodgerblue:\"#1e90ff\",fireb" +
    "rick:\"#b22222\",floralwhite:\"#fffaf0\",forestgreen:\"#228b22\",fuchsia" +
    ":\"#ff00ff\",gainsboro:\"#dcdcdc\",\nghostwhite:\"#f8f8ff\",gold:\"#ffd700" +
    "\",goldenrod:\"#daa520\",gray:\"#808080\",green:\"#008000\",greenyellow:\"" +
    "#adff2f\",grey:\"#808080\",honeydew:\"#f0fff0\",hotpink:\"#ff69b4\",india" +
    "nred:\"#cd5c5c\",indigo:\"#4b0082\",ivory:\"#fffff0\",khaki:\"#f0e68c\",la" +
    "vender:\"#e6e6fa\",lavenderblush:\"#fff0f5\",lawngreen:\"#7cfc00\",lemon" +
    "chiffon:\"#fffacd\",lightblue:\"#add8e6\",lightcoral:\"#f08080\",lightcy" +
    "an:\"#e0ffff\",lightgoldenrodyellow:\"#fafad2\",lightgray:\"#d3d3d3\",li" +
    "ghtgreen:\"#90ee90\",lightgrey:\"#d3d3d3\",lightpink:\"#ffb6c1\",lightsa" +
    "lmon:\"#ffa07a\",\nlightseagreen:\"#20b2aa\",lightskyblue:\"#87cefa\",lig" +
    "htslategray:\"#778899\",lightslategrey:\"#778899\",lightsteelblue:\"#b0" +
    "c4de\",lightyellow:\"#ffffe0\",lime:\"#00ff00\",limegreen:\"#32cd32\",lin" +
    "en:\"#faf0e6\",magenta:\"#ff00ff\",maroon:\"#800000\",mediumaquamarine:\"" +
    "#66cdaa\",mediumblue:\"#0000cd\",mediumorchid:\"#ba55d3\",mediumpurple:" +
    "\"#9370db\",mediumseagreen:\"#3cb371\",mediumslateblue:\"#7b68ee\",mediu" +
    "mspringgreen:\"#00fa9a\",mediumturquoise:\"#48d1cc\",mediumvioletred:\"" +
    "#c71585\",midnightblue:\"#191970\",mintcream:\"#f5fffa\",mistyrose:\"#ff" +
    "e4e1\",\nmoccasin:\"#ffe4b5\",navajowhite:\"#ffdead\",navy:\"#000080\",old" +
    "lace:\"#fdf5e6\",olive:\"#808000\",olivedrab:\"#6b8e23\",orange:\"#ffa500" +
    "\",orangered:\"#ff4500\",orchid:\"#da70d6\",palegoldenrod:\"#eee8aa\",pal" +
    "egreen:\"#98fb98\",paleturquoise:\"#afeeee\",palevioletred:\"#db7093\",p" +
    "apayawhip:\"#ffefd5\",peachpuff:\"#ffdab9\",peru:\"#cd853f\",pink:\"#ffc0" +
    "cb\",plum:\"#dda0dd\",powderblue:\"#b0e0e6\",purple:\"#800080\",red:\"#ff0" +
    "000\",rosybrown:\"#bc8f8f\",royalblue:\"#4169e1\",saddlebrown:\"#8b4513\"" +
    ",salmon:\"#fa8072\",sandybrown:\"#f4a460\",seagreen:\"#2e8b57\",\nseashel" +
    "l:\"#fff5ee\",sienna:\"#a0522d\",silver:\"#c0c0c0\",skyblue:\"#87ceeb\",sl" +
    "ateblue:\"#6a5acd\",slategray:\"#708090\",slategrey:\"#708090\",snow:\"#f" +
    "ffafa\",springgreen:\"#00ff7f\",steelblue:\"#4682b4\",tan:\"#d2b48c\",tea" +
    "l:\"#008080\",thistle:\"#d8bfd8\",tomato:\"#ff6347\",turquoise:\"#40e0d0\"" +
    ",violet:\"#ee82ee\",wheat:\"#f5deb3\",white:\"#ffffff\",whitesmoke:\"#f5f" +
    "5f5\",yellow:\"#ffff00\",yellowgreen:\"#9acd32\"};/*xxx_rpl_lic*/\nvar W" +
    "b=\"backgroundColor borderTopColor borderRightColor borderBottomCol" +
    "or borderLeftColor color outlineColor\".split(\" \"),Xb=/#([0-9a-fA-F" +
    "])([0-9a-fA-F])([0-9a-fA-F])/,Yb=/^#(?:[0-9a-f]{3}){1,2}$/i,Zb=/^(" +
    "?:rgba)?\\((\\d{1,3}),\\s?(\\d{1,3}),\\s?(\\d{1,3}),\\s?(0|1|0\\.\\d*)\\)$/i" +
    ",$b=/^(?:rgb)?\\((0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d{0,2}),\\s?(0|[1-9]\\d" +
    "{0,2})\\)$/i;function ac(a){return(a=a.exec(wa))?a[1]:\"\"}ac(/Androi" +
    "d\\s+([0-9.]+)/)||ac(/Version\\/([0-9.]+)/);/*xxx_rpl_lic*/\nfunction" +
    " bc(a){var b=0,c=ka(String(cc)).split(\".\");a=ka(String(a)).split(\"" +
    ".\");for(var d=Math.max(c.length,a.length),e=0;0==b&&e<d;e++){var f" +
    "=c[e]||\"\",g=a[e]||\"\",n=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),m=RegExp(\"(\\\\d*)" +
    "(\\\\D*)\",\"g\");do{var l=n.exec(f)||[\"\",\"\",\"\"],k=m.exec(g)||[\"\",\"\",\"\"" +
    "];if(0==l[0].length&&0==k[0].length)break;b=la(0==l[1].length?0:pa" +
    "rseInt(l[1],10),0==k[1].length?0:parseInt(k[1],10))||la(0==l[2].le" +
    "ngth,0==k[2].length)||la(l[2],k[2])}while(0==b)}}\nvar dc=/Android\\" +
    "s+([0-9\\.]+)/.exec(wa),cc=dc?dc[1]:\"0\";bc(2.3);bc(4);/*xxx_rpl_lic" +
    "*/\nfunction Y(a,b){return!!a&&1==a.nodeType&&(!b||a.tagName.toUppe" +
    "rCase()==b)}function ec(a){for(a=a.parentNode;a&&1!=a.nodeType&&9!" +
    "=a.nodeType&&11!=a.nodeType;)a=a.parentNode;return Y(a)?a:null}\nfu" +
    "nction Z(a,b){var c=ma(b);if(\"float\"==c||\"cssFloat\"==c||\"styleFloa" +
    "t\"==c)c=\"cssFloat\";var d;a:{d=c;var e=x(a);if(e.defaultView&&e.def" +
    "aultView.getComputedStyle&&(e=e.defaultView.getComputedStyle(a,nul" +
    "l))){d=e[d]||e.getPropertyValue(d)||\"\";break a}d=\"\"}d=d||gc(a,c);i" +
    "f(null===d)d=null;else if(0<=qa(Wb,c)){b:{var f=d.match(Zb);if(f){" +
    "var c=Number(f[1]),e=Number(f[2]),g=Number(f[3]),f=Number(f[4]);if" +
    "(0<=c&&255>=c&&0<=e&&255>=e&&0<=g&&255>=g&&0<=f&&1>=f){c=[c,e,g,f]" +
    ";break b}}c=null}if(!c)b:{if(g=d.match($b))if(c=\nNumber(g[1]),e=Nu" +
    "mber(g[2]),g=Number(g[3]),0<=c&&255>=c&&0<=e&&255>=e&&0<=g&&255>=g" +
    "){c=[c,e,g,1];break b}c=null}if(!c)b:{c=d.toLowerCase();e=Vb[c.toL" +
    "owerCase()];if(!e&&(e=\"#\"==c.charAt(0)?c:\"#\"+c,4==e.length&&(e=e.r" +
    "eplace(Xb,\"#$1$1$2$2$3$3\")),!Yb.test(e))){c=null;break b}c=[parseI" +
    "nt(e.substr(1,2),16),parseInt(e.substr(3,2),16),parseInt(e.substr(" +
    "5,2),16),1]}d=c?\"rgba(\"+c.join(\", \")+\")\":d}return d}\nfunction gc(a" +
    ",b){var c=a.currentStyle||a.style,d=c[b];void 0===d&&\"function\"==c" +
    "a(c.getPropertyValue)&&(d=c.getPropertyValue(b));return\"inherit\"!=" +
    "d?void 0!==d?d:null:(c=ec(a))?gc(c,b):null}\nfunction hc(a,b){funct" +
    "ion c(a){if(\"none\"==Z(a,\"display\"))return!1;a=ec(a);return!a||c(a)" +
    "}function d(a){var b=ic(a);return 0<b.height&&0<b.width?!0:Y(a,\"PA" +
    "TH\")&&(0<b.height||0<b.width)?(a=Z(a,\"stroke-width\"),!!a&&0<parseI" +
    "nt(a,10)):\"hidden\"!=Z(a,\"overflow\")&&ra(a.childNodes,function(a){r" +
    "eturn 3==a.nodeType||Y(a)&&d(a)})}function e(a){return\"hidden\"==jc" +
    "(a)&&sa(a.childNodes,function(a){return!Y(a)||e(a)})}if(!Y(a))thro" +
    "w Error(\"Argument to isShown must be of type Element\");if(Y(a,\"BOD" +
    "Y\"))return!0;if(Y(a,\n\"OPTION\")||Y(a,\"OPTGROUP\")){var f=Ea(a,functi" +
    "on(a){return Y(a,\"SELECT\")});return!!f&&hc(f,!0)}return(f=kc(a))?!" +
    "!f.w&&0<f.rect.width&&0<f.rect.height&&hc(f.w,b):Y(a,\"INPUT\")&&\"hi" +
    "dden\"==a.type.toLowerCase()||Y(a,\"NOSCRIPT\")||\"hidden\"==Z(a,\"visib" +
    "ility\")||!c(a)||!b&&0==lc(a)||!d(a)?!1:!e(a)}\nfunction jc(a){funct" +
    "ion b(a){function b(a){return a==g?!0:0==Z(a,\"display\").lastIndexO" +
    "f(\"inline\",0)||\"absolute\"==c&&\"static\"==Z(a,\"position\")?!1:!0}var " +
    "c=Z(a,\"position\");if(\"fixed\"==c)return l=!0,a==g?null:g;for(a=ec(a" +
    ");a&&!b(a);)a=ec(a);return a}function c(a){var b=a;if(\"visible\"==m" +
    ")if(a==g&&n)b=n;else if(a==n)return{x:\"visible\",y:\"visible\"};b={x:" +
    "Z(b,\"overflow-x\"),y:Z(b,\"overflow-y\")};a==g&&(b.x=\"visible\"==b.x?\"" +
    "auto\":b.x,b.y=\"visible\"==b.y?\"auto\":b.y);return b}function d(a){if" +
    "(a==g){var b=(new Fa(f)).a;\na=b.body||b.documentElement;b=b.parent" +
    "Window||b.defaultView;a=new v(b.pageXOffset||a.scrollLeft,b.pageYO" +
    "ffset||a.scrollTop)}else a=new v(a.scrollLeft,a.scrollTop);return " +
    "a}var e=mc(a),f=x(a),g=f.documentElement,n=f.body,m=Z(g,\"overflow\"" +
    "),l;for(a=b(a);a;a=b(a)){var k=c(a);if(\"visible\"!=k.x||\"visible\"!=" +
    "k.y){var B=ic(a);if(0==B.width||0==B.height)return\"hidden\";var I=e" +
    ".right<B.left,V=e.bottom<B.top;if(I&&\"hidden\"==k.x||V&&\"hidden\"==k" +
    ".y)return\"hidden\";if(I&&\"visible\"!=k.x||V&&\"visible\"!=k.y){I=d(a);" +
    "V=\ne.bottom<B.top-I.y;if(e.right<B.left-I.x&&\"visible\"!=k.x||V&&\"v" +
    "isible\"!=k.x)return\"hidden\";e=jc(a);return\"hidden\"==e?\"hidden\":\"sc" +
    "roll\"}I=e.left>=B.left+B.width;B=e.top>=B.top+B.height;if(I&&\"hidd" +
    "en\"==k.x||B&&\"hidden\"==k.y)return\"hidden\";if(I&&\"visible\"!=k.x||B&" +
    "&\"visible\"!=k.y){if(l&&(k=d(a),e.left>=g.scrollWidth-k.x||e.right>" +
    "=g.scrollHeight-k.y))return\"hidden\";e=jc(a);return\"hidden\"==e?\"hid" +
    "den\":\"scroll\"}}}return\"none\"}\nfunction ic(a){var b=kc(a);if(b)retu" +
    "rn b.rect;if(Y(a,\"HTML\"))return a=x(a),a=((a?a.parentWindow||a.def" +
    "aultView:window)||window).document,a=\"CSS1Compat\"==a.compatMode?a." +
    "documentElement:a.body,a=new w(a.clientWidth,a.clientHeight),new z" +
    "(0,0,a.width,a.height);var c;try{c=a.getBoundingClientRect()}catch" +
    "(d){return new z(0,0,0,0)}return new z(c.left,c.top,c.right-c.left" +
    ",c.bottom-c.top)}\nfunction kc(a){var b=Y(a,\"MAP\");if(!b&&!Y(a,\"ARE" +
    "A\"))return null;var c=b?a:Y(a.parentNode,\"MAP\")?a.parentNode:null," +
    "d=null,e=null;if(c&&c.name&&(d=x(c),d=Ub('/descendant::*[@usemap =" +
    " \"#'+c.name+'\"]',d))&&(e=ic(d),!b&&\"default\"!=a.shape.toLowerCase(" +
    "))){var f=nc(a);a=Math.min(Math.max(f.left,0),e.width);b=Math.min(" +
    "Math.max(f.top,0),e.height);c=Math.min(f.width,e.width-a);f=Math.m" +
    "in(f.height,e.height-b);e=new z(a+e.left,b+e.top,c,f)}return{w:d,r" +
    "ect:e||new z(0,0,0,0)}}\nfunction nc(a){var b=a.shape.toLowerCase()" +
    ";a=a.coords.split(\",\");if(\"rect\"==b&&4==a.length){var b=a[0],c=a[1" +
    "];return new z(b,c,a[2]-b,a[3]-c)}if(\"circle\"==b&&3==a.length)retu" +
    "rn b=a[2],new z(a[0]-b,a[1]-b,2*b,2*b);if(\"poly\"==b&&2<a.length){f" +
    "or(var b=a[0],c=a[1],d=b,e=c,f=2;f+1<a.length;f+=2)b=Math.min(b,a[" +
    "f]),d=Math.max(d,a[f]),c=Math.min(c,a[f+1]),e=Math.max(e,a[f+1]);r" +
    "eturn new z(b,c,d-b,e-c)}return new z(0,0,0,0)}function mc(a){a=ic" +
    "(a);return new y(a.top,a.left+a.width,a.top+a.height,a.left)}\nfunc" +
    "tion oc(a){return a.replace(/^[^\\S\\xa0]+|[^\\S\\xa0]+$/g,\"\")}\nfuncti" +
    "on pc(a,b){if(Y(a,\"BR\"))b.push(\"\");else{var c=Y(a,\"TD\"),d=Z(a,\"dis" +
    "play\"),e=!c&&!(0<=qa(qc,d)),f=void 0!=a.previousElementSibling?a.p" +
    "reviousElementSibling:za(a.previousSibling),f=f?Z(f,\"display\"):\"\"," +
    "g=Z(a,\"float\")||Z(a,\"cssFloat\")||Z(a,\"styleFloat\");!e||\"run-in\"==f" +
    "&&\"none\"==g||/^[\\s\\xa0]*$/.test(b[b.length-1]||\"\")||b.push(\"\");var" +
    " n=hc(a),m=null,l=null;n&&(m=Z(a,\"white-space\"),l=Z(a,\"text-transf" +
    "orm\"));t(a.childNodes,function(a){3==a.nodeType&&n?rc(a,b,m,l):Y(a" +
    ")&&pc(a,b)});f=b[b.length-1]||\"\";\n!c&&\"table-cell\"!=d||!f||ia(f)||" +
    "(b[b.length-1]+=\" \");e&&\"run-in\"!=d&&!/^[\\s\\xa0]*$/.test(f)&&b.pus" +
    "h(\"\")}}var qc=\"inline inline-block inline-table none table-cell ta" +
    "ble-column table-column-group\".split(\" \");\nfunction rc(a,b,c,d){a=" +
    "a.nodeValue.replace(/[\\u200b\\u200e\\u200f]/g,\"\");a=a.replace(/(\\r\\n" +
    "|\\r|\\n)/g,\"\\n\");if(\"normal\"==c||\"nowrap\"==c)a=a.replace(/\\n/g,\" \")" +
    ";a=\"pre\"==c||\"pre-wrap\"==c?a.replace(/[ \\f\\t\\v\\u2028\\u2029]/g,\"\\u0" +
    "0a0\"):a.replace(/[\\ \\f\\t\\v\\u2028\\u2029]+/g,\" \");\"capitalize\"==d?a=" +
    "a.replace(/(^|\\s)(\\S)/g,function(a,b,c){return b+c.toUpperCase()})" +
    ":\"uppercase\"==d?a=a.toUpperCase():\"lowercase\"==d&&(a=a.toLowerCase" +
    "());c=b.pop()||\"\";ia(c)&&0==a.lastIndexOf(\" \",0)&&(a=a.substr(1));" +
    "b.push(c+a)}\nfunction lc(a){var b=1,c=Z(a,\"opacity\");c&&(b=Number(" +
    "c));(a=ec(a))&&(b*=lc(a));return b};ba(\"_\",function(a){var b=[];pc" +
    "(a,b);var c=b;a=c.length;for(var b=Array(a),c=q(c)?c.split(\"\"):c,d" +
    "=0;d<a;d++)d in c&&(b[d]=oc.call(void 0,c[d]));return oc(b.join(\"\\" +
    "n\")).replace(/\\xa0/g,\" \")});;return this._.apply(null,arguments);}" +
    ").apply({navigator:typeof window!=\"undefined\"?window.navigator:nul" +
    "l},arguments);}\n"
  )
  .toString();
  static final String GET_VISIBLE_TEXT_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String GET_VISIBLE_TEXT_ANDROID_original() {
    return GET_VISIBLE_TEXT_ANDROID.replaceAll("xxx_rpl_lic", GET_VISIBLE_TEXT_ANDROID_license);
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      {
        String message =     "CLEAR_ANDROID third_party/javascript/browser_automation/bot/fragme" +
    "nts/clear_android.js";
        System.out.println(message);
      }
      {
        String message =     "CLICK_ANDROID third_party/javascript/browser_automation/bot/fragme" +
    "nts/click_android.js";
        System.out.println(message);
      }
      {
        String message =     "FIND_ELEMENT_ANDROID third_party/javascript/browser_automation/bot" +
    "/fragments/find_element_android.js";
        System.out.println(message);
      }
      {
        String message =     "FIND_ELEMENTS_ANDROID third_party/javascript/browser_automation/bo" +
    "t/fragments/find_elements_android.js";
        System.out.println(message);
      }
      {
        String message =     "SEND_KEYS_ANDROID third_party/javascript/browser_automation/webdri" +
    "ver/atoms/fragments/send_keys_android.js";
        System.out.println(message);
      }
      {
        String message =     "ACTIVE_ELEMENT_ANDROID tools/android/webdriver/atom/active_element" +
    "_android.js";
        System.out.println(message);
      }
      {
        String message =     "FRAME_BY_ID_OR_NAME_ANDROID tools/android/webdriver/atom/frame_by_" +
    "id_or_name_android.js";
        System.out.println(message);
      }
      {
        String message =     "FRAME_BY_INDEX_ANDROID tools/android/webdriver/atom/frame_by_index" +
    "_android.js";
        System.out.println(message);
      }
      {
        String message =     "GET_VISIBLE_TEXT_ANDROID tools/android/webdriver/atom/get_visible_" +
    "text_android.js";
        System.out.println(message);
      }
      System.exit(0);
    }
    String name = args[0];
    if("CLEAR_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.CLEAR_ANDROID_original());
      System.exit(0);
    }
    if("CLICK_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.CLICK_ANDROID_original());
      System.exit(0);
    }
    if("FIND_ELEMENT_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.FIND_ELEMENT_ANDROID_original());
      System.exit(0);
    }
    if("FIND_ELEMENTS_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.FIND_ELEMENTS_ANDROID_original());
      System.exit(0);
    }
    if("SEND_KEYS_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.SEND_KEYS_ANDROID_original());
      System.exit(0);
    }
    if("ACTIVE_ELEMENT_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.ACTIVE_ELEMENT_ANDROID_original());
      System.exit(0);
    }
    if("FRAME_BY_ID_OR_NAME_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.FRAME_BY_ID_OR_NAME_ANDROID_original());
      System.exit(0);
    }
    if("FRAME_BY_INDEX_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.FRAME_BY_INDEX_ANDROID_original());
      System.exit(0);
    }
    if("GET_VISIBLE_TEXT_ANDROID".equals(name)) {
      System.out.print(WebDriverAtomScripts.GET_VISIBLE_TEXT_ANDROID_original());
      System.exit(0);
    }
    System.exit(1);
  }
}