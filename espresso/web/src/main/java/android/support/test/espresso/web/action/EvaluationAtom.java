package android.support.test.espresso.web.action;
// GENERATED CODE DO NOT EDIT
final class EvaluationAtom {
/* field: EXECUTE_SCRIPT_ANDROID license:

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
  static final String EXECUTE_SCRIPT_ANDROID =
    "function(){return(function(){function g(a){var b=typeof a;if(\"obje" +
    "ct\"==b)if(a){if(a instanceof Array)return\"array\";if(a instanceof O" +
    "bject)return b;var c=Object.prototype.toString.call(a);if(\"[object" +
    " Window]\"==c)return\"object\";if(\"[object Array]\"==c||\"number\"==type" +
    "of a.length&&\"undefined\"!=typeof a.splice&&\"undefined\"!=typeof a.p" +
    "ropertyIsEnumerable&&!a.propertyIsEnumerable(\"splice\"))return\"arra" +
    "y\";if(\"[object Function]\"==c||\"undefined\"!=typeof a.call&&\"undefin" +
    "ed\"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(\"call\"" +
    "))return\"function\"}else return\"null\";\nelse if(\"function\"==b&&\"unde" +
    "fined\"==typeof a.call)return\"object\";return b}function k(a){var b=" +
    "g(a);return\"array\"==b||\"object\"==b&&\"number\"==typeof a.length}func" +
    "tion n(a){var b=typeof a;return\"object\"==b&&null!=a||\"function\"==b" +
    "}function p(a,b,c){return a.call.apply(a.bind,arguments)}\nfunction" +
    " q(a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.p" +
    "rototype.slice.call(arguments,2);return function(){var c=Array.pro" +
    "totype.slice.call(arguments);Array.prototype.unshift.apply(c,d);re" +
    "turn a.apply(b,c)}}return function(){return a.apply(b,arguments)}}" +
    "function r(a,b,c){r=Function.prototype.bind&&-1!=Function.prototyp" +
    "e.bind.toString().indexOf(\"native code\")?p:q;return r.apply(null,a" +
    "rguments)}var t=Date.now||function(){return+new Date};\nFunction.pr" +
    "ototype.bind=Function.prototype.bind||function(a,b){if(1<arguments" +
    ".length){var c=Array.prototype.slice.call(arguments,1);c.unshift(t" +
    "his,a);return r.apply(null,c)}return r(this,a)};var u=String.proto" +
    "type.trim?function(a){return a.trim()}:function(a){return a.replac" +
    "e(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};function v(a,b){return a<b?-1:a>b?" +
    "1:0};function w(a,b){for(var c=a.length,d=Array(c),f=\"string\"==typ" +
    "eof a?a.split(\"\"):a,e=0;e<c;e++)e in f&&(d[e]=b.call(void 0,f[e],e" +
    ",a));return d};function x(a,b){var c={},d;for(d in a)b.call(void 0" +
    ",a[d],d,a)&&(c[d]=a[d]);return c}function A(a,b){var c={},d;for(d " +
    "in a)c[d]=b.call(void 0,a[d],d,a);return c}function B(a,b){for(var" +
    " c in a)if(b.call(void 0,a[c],c,a))return c};var C;a:{var D=this.n" +
    "avigator;if(D){var E=D.userAgent;if(E){C=E;break a}}C=\"\"};/*xxx_rp" +
    "l_lic*/\nvar F=window;/*xxx_rpl_lic*/\nfunction G(a,b){this.code=a;t" +
    "his.b=H[a]||\"unknown error\";this.message=b||\"\";var c=this.b.replac" +
    "e(/((?:^|\\s+)[a-z])/g,function(a){return a.toUpperCase().replace(/" +
    "^[\\s\\xa0]+/g,\"\")}),d=c.length-5;if(0>d||c.indexOf(\"Error\",d)!=d)c+" +
    "=\"Error\";this.name=c;c=Error(this.message);c.name=this.name;this.s" +
    "tack=c.stack||\"\"}\n(function(){var a=Error;function b(){}b.prototyp" +
    "e=a.prototype;G.c=a.prototype;G.prototype=new b;G.prototype.constr" +
    "uctor=G;G.b=function(b,d,f){for(var e=Array(arguments.length-2),l=" +
    "2;l<arguments.length;l++)e[l-2]=arguments[l];return a.prototype[d]" +
    ".apply(b,e)}})();\nvar H={15:\"element not selectable\",11:\"element n" +
    "ot visible\",31:\"ime engine activation failed\",30:\"ime not availabl" +
    "e\",24:\"invalid cookie domain\",29:\"invalid element coordinates\",12:" +
    "\"invalid element state\",32:\"invalid selector\",51:\"invalid selector" +
    "\",52:\"invalid selector\",17:\"javascript error\",405:\"unsupported ope" +
    "ration\",34:\"move target out of bounds\",27:\"no such alert\",7:\"no su" +
    "ch element\",8:\"no such frame\",23:\"no such window\",28:\"script timeo" +
    "ut\",33:\"session not created\",10:\"stale element reference\",\n0:\"succ" +
    "ess\",21:\"timeout\",25:\"unable to set cookie\",26:\"unexpected alert o" +
    "pen\",13:\"unknown error\",9:\"unknown command\"};G.prototype.toString=" +
    "function(){return this.name+\": \"+this.message};function I(){}\nfunc" +
    "tion J(a,b,c){if(null==b)c.push(\"null\");else{if(\"object\"==typeof b" +
    "){if(\"array\"==g(b)){var d=b;b=d.length;c.push(\"[\");for(var f=\"\",e=" +
    "0;e<b;e++)c.push(f),J(a,d[e],c),f=\",\";c.push(\"]\");return}if(b inst" +
    "anceof String||b instanceof Number||b instanceof Boolean)b=b.value" +
    "Of();else{c.push(\"{\");f=\"\";for(d in b)Object.prototype.hasOwnPrope" +
    "rty.call(b,d)&&(e=b[d],\"function\"!=typeof e&&(c.push(f),K(d,c),c.p" +
    "ush(\":\"),J(a,e,c),f=\",\"));c.push(\"}\");return}}switch(typeof b){cas" +
    "e \"string\":K(b,c);break;case \"number\":c.push(isFinite(b)&&\n!isNaN(" +
    "b)?b:\"null\");break;case \"boolean\":c.push(b);break;case \"function\":" +
    "break;default:throw Error(\"Unknown type: \"+typeof b);}}}var L={'\"'" +
    ":'\\\\\"',\"\\\\\":\"\\\\\\\\\",\"/\":\"\\\\/\",\"\\b\":\"\\\\b\",\"\\f\":\"\\\\f\",\"\\n\":\"\\\\n\",\"\\r\"" +
    ":\"\\\\r\",\"\\t\":\"\\\\t\",\"\\x0B\":\"\\\\u000b\"},M=/\\uffff/.test(\"\\uffff\")?/[\\\\" +
    "\\\"\\x00-\\x1f\\x7f-\\uffff]/g:/[\\\\\\\"\\x00-\\x1f\\x7f-\\xff]/g;function K(a" +
    ",b){b.push('\"',a.replace(M,function(a){var b=L[a];b||(b=\"\\\\u\"+(a.c" +
    "harCodeAt(0)|65536).toString(16).substr(1),L[a]=b);return b}),'\"')" +
    "};function N(a){return(a=a.exec(C))?a[1]:\"\"}N(/Android\\s+([0-9.]+)" +
    "/)||N(/Version\\/([0-9.]+)/);/*xxx_rpl_lic*/\nfunction O(a){var b=0," +
    "c=u(String(aa)).split(\".\");a=u(String(a)).split(\".\");for(var d=Mat" +
    "h.max(c.length,a.length),f=0;0==b&&f<d;f++){var e=c[f]||\"\",l=a[f]|" +
    "|\"\",y=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),z=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\");do{v" +
    "ar h=y.exec(e)||[\"\",\"\",\"\"],m=z.exec(l)||[\"\",\"\",\"\"];if(0==h[0].leng" +
    "th&&0==m[0].length)break;b=v(0==h[1].length?0:parseInt(h[1],10),0=" +
    "=m[1].length?0:parseInt(m[1],10))||v(0==h[2].length,0==m[2].length" +
    ")||v(h[2],m[2])}while(0==b)}}var P=/Android\\s+([0-9\\.]+)/.exec(C)," +
    "aa=P?P[1]:\"0\";O(2.3);\nO(4);/*xxx_rpl_lic*/\n/*xxx_rpl_lic*/\n/*xxx_r" +
    "pl_lic*/\nfunction Q(a){switch(g(a)){case \"string\":case \"number\":ca" +
    "se \"boolean\":return a;case \"function\":return a.toString();case \"ar" +
    "ray\":return w(a,Q);case \"object\":if(\"nodeType\"in a&&(1==a.nodeType" +
    "||9==a.nodeType)){var b={};b.ELEMENT=R(a);return b}if(\"document\"in" +
    " a)return b={},b.WINDOW=R(a),b;if(k(a))return w(a,Q);a=x(a,functio" +
    "n(a,b){return\"number\"==typeof b||\"string\"==typeof b});return A(a,Q" +
    ");default:return null}}\nfunction S(a,b){return\"array\"==g(a)?w(a,fu" +
    "nction(a){return S(a,b)}):n(a)?\"function\"==typeof a?a:\"ELEMENT\"in " +
    "a?T(a.ELEMENT,b):\"WINDOW\"in a?T(a.WINDOW,b):A(a,function(a){return" +
    " S(a,b)}):a}function U(a){a=a||document;var b=a.$wdc_;b||(b=a.$wdc" +
    "_={},b.a=t());b.a||(b.a=t());return b}function R(a){var b=U(a.owne" +
    "rDocument),c=B(b,function(b){return b==a});c||(c=\":wdc:\"+b.a++,b[c" +
    "]=a);return c}\nfunction T(a,b){a=decodeURIComponent(a);var c=b||do" +
    "cument,d=U(c);if(!(a in d))throw new G(10,\"Element does not exist " +
    "in cache\");var f=d[a];if(\"setInterval\"in f){if(f.closed)throw dele" +
    "te d[a],new G(23,\"Window has been closed.\");return f}for(var e=f;e" +
    ";){if(e==c.documentElement)return f;e=e.parentNode}delete d[a];thr" +
    "ow new G(10,\"Element is no longer attached to the DOM\");};function" +
    " V(a,b,c,d){d=d||F;var f;try{a:{var e=a;if(\"string\"==typeof e)try{" +
    "a=new d.Function(e);break a}catch(l){throw l;}a=d==window?e:new d." +
    "Function(\"return (\"+e+\").apply(null,arguments);\")}var y=S(b,d.docu" +
    "ment),z=a.apply(null,y);f={status:0,value:Q(z)}}catch(h){f={status" +
    ":\"code\"in h?h.code:13,value:{message:h.message}}}c&&(a=[],J(new I," +
    "f,a),f=a.join(\"\"));return f}var W=[\"_\"],X=this;W[0]in X||!X.execSc" +
    "ript||X.execScript(\"var \"+W[0]);\nfor(var Y;W.length&&(Y=W.shift())" +
    ";){var Z;if(Z=!W.length)Z=void 0!==V;Z?X[Y]=V:X[Y]?X=X[Y]:X=X[Y]={" +
    "}};;return this._.apply(null,arguments);}).apply({navigator:typeof" +
    " window!=\"undefined\"?window.navigator:null},arguments);}\n";
  static final String EXECUTE_SCRIPT_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String EXECUTE_SCRIPT_ANDROID_original() {
    return EXECUTE_SCRIPT_ANDROID.replaceAll("xxx_rpl_lic", EXECUTE_SCRIPT_ANDROID_license);
  }

/* field: GET_ELEMENT_ANDROID license:

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
  static final String GET_ELEMENT_ANDROID =
    "function(){return(function(){function f(a,c,b){return a.call.apply" +
    "(a.bind,arguments)}function h(a,c,b){if(!a)throw Error();if(2<argu" +
    "ments.length){var e=Array.prototype.slice.call(arguments,2);return" +
    " function(){var d=Array.prototype.slice.call(arguments);Array.prot" +
    "otype.unshift.apply(d,e);return a.apply(c,d)}}return function(){re" +
    "turn a.apply(c,arguments)}}function n(a,c,b){n=Function.prototype." +
    "bind&&-1!=Function.prototype.bind.toString().indexOf(\"native code\"" +
    ")?f:h;return n.apply(null,arguments)}var p=Date.now||function(){re" +
    "turn+new Date};\nFunction.prototype.bind=Function.prototype.bind||f" +
    "unction(a,c){if(1<arguments.length){var b=Array.prototype.slice.ca" +
    "ll(arguments,1);b.unshift(this,a);return n.apply(null,b)}return n(" +
    "this,a)};var q=String.prototype.trim?function(a){return a.trim()}:" +
    "function(a){return a.replace(/^[\\s\\xa0]+|[\\s\\xa0]+$/g,\"\")};functio" +
    "n r(a,c){return a<c?-1:a>c?1:0};var t;a:{var u=this.navigator;if(u" +
    "){var v=u.userAgent;if(v){t=v;break a}}t=\"\"};/*xxx_rpl_lic*/\n/*xxx" +
    "_rpl_lic*/\nfunction w(a,c){this.code=a;this.a=x[a]||\"unknown error" +
    "\";this.message=c||\"\";var b=this.a.replace(/((?:^|\\s+)[a-z])/g,func" +
    "tion(a){return a.toUpperCase().replace(/^[\\s\\xa0]+/g,\"\")}),e=b.len" +
    "gth-5;if(0>e||b.indexOf(\"Error\",e)!=e)b+=\"Error\";this.name=b;b=Err" +
    "or(this.message);b.name=this.name;this.stack=b.stack||\"\"}\n(functio" +
    "n(){var a=Error;function c(){}c.prototype=a.prototype;w.c=a.protot" +
    "ype;w.prototype=new c;w.prototype.constructor=w;w.a=function(b,c,d" +
    "){for(var g=Array(arguments.length-2),k=2;k<arguments.length;k++)g" +
    "[k-2]=arguments[k];return a.prototype[c].apply(b,g)}})();\nvar x={1" +
    "5:\"element not selectable\",11:\"element not visible\",31:\"ime engine" +
    " activation failed\",30:\"ime not available\",24:\"invalid cookie doma" +
    "in\",29:\"invalid element coordinates\",12:\"invalid element state\",32" +
    ":\"invalid selector\",51:\"invalid selector\",52:\"invalid selector\",17" +
    ":\"javascript error\",405:\"unsupported operation\",34:\"move target ou" +
    "t of bounds\",27:\"no such alert\",7:\"no such element\",8:\"no such fra" +
    "me\",23:\"no such window\",28:\"script timeout\",33:\"session not create" +
    "d\",10:\"stale element reference\",\n0:\"success\",21:\"timeout\",25:\"unab" +
    "le to set cookie\",26:\"unexpected alert open\",13:\"unknown error\",9:" +
    "\"unknown command\"};w.prototype.toString=function(){return this.nam" +
    "e+\": \"+this.message};function y(a){return(a=a.exec(t))?a[1]:\"\"}y(/" +
    "Android\\s+([0-9.]+)/)||y(/Version\\/([0-9.]+)/);/*xxx_rpl_lic*/\nfun" +
    "ction z(a){var c=0,b=q(String(A)).split(\".\");a=q(String(a)).split(" +
    "\".\");for(var e=Math.max(b.length,a.length),d=0;0==c&&d<e;d++){var " +
    "g=b[d]||\"\",k=a[d]||\"\",H=RegExp(\"(\\\\d*)(\\\\D*)\",\"g\"),I=RegExp(\"(\\\\d*" +
    ")(\\\\D*)\",\"g\");do{var l=H.exec(g)||[\"\",\"\",\"\"],m=I.exec(k)||[\"\",\"\",\"" +
    "\"];if(0==l[0].length&&0==m[0].length)break;c=r(0==l[1].length?0:pa" +
    "rseInt(l[1],10),0==m[1].length?0:parseInt(m[1],10))||r(0==l[2].len" +
    "gth,0==m[2].length)||r(l[2],m[2])}while(0==c)}}var B=/Android\\s+([" +
    "0-9\\.]+)/.exec(t),A=B?B[1]:\"0\";z(2.3);\nz(4);/*xxx_rpl_lic*/\n/*xxx_" +
    "rpl_lic*/\n/*xxx_rpl_lic*/\nfunction C(a,c){a=decodeURIComponent(a);" +
    "var b=c||document,e;e=b||document;var d=e.$wdc_;d||(d=e.$wdc_={},d" +
    ".b=p());d.b||(d.b=p());e=d;if(!(a in e))throw new w(10,\"Element do" +
    "es not exist in cache\");d=e[a];if(\"setInterval\"in d){if(d.closed)t" +
    "hrow delete e[a],new w(23,\"Window has been closed.\");return d}for(" +
    "var g=d;g;){if(g==b.documentElement)return d;g=g.parentNode}delete" +
    " e[a];throw new w(10,\"Element is no longer attached to the DOM\");}" +
    "var D=[\"_\"],E=this;D[0]in E||!E.execScript||E.execScript(\"var \"+D[" +
    "0]);\nfor(var F;D.length&&(F=D.shift());){var G;if(G=!D.length)G=vo" +
    "id 0!==C;G?E[F]=C:E[F]?E=E[F]:E=E[F]={}};;return this._.apply(null" +
    ",arguments);}).apply({navigator:typeof window!=\"undefined\"?window." +
    "navigator:null},arguments);}\n";
  static final String GET_ELEMENT_ANDROID_license =
    "\n\n Copyright 2014 Software Freedom Conservancy\n\n Licensed under th" +
    "e Apache License, Version 2.0 (the \"License\");\n you may not use th" +
    "is file except in compliance with the License.\n You may obtain a c" +
    "opy of the License at\n\n      http://www.apache.org/licenses/LICENS" +
    "E-2.0\n\n Unless required by applicable law or agreed to in writing," +
    " software\n distributed under the License is distributed on an \"AS " +
    "IS\" BASIS,\n WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either e" +
    "xpress or implied.\n See the License for the specific language gove" +
    "rning permissions and\n limitations under the License.\n";
  private static final String GET_ELEMENT_ANDROID_original() {
    return GET_ELEMENT_ANDROID.replaceAll("xxx_rpl_lic", GET_ELEMENT_ANDROID_license);
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      {
        String message =     "EXECUTE_SCRIPT_ANDROID third_party/javascript/browser_automation/b" +
    "ot/fragments/execute_script_android.js";
        System.out.println(message);
      }
      {
        String message =     "GET_ELEMENT_ANDROID tools/android/webdriver/atom/get_element_andro" +
    "id.js";
        System.out.println(message);
      }
      System.exit(0);
    }
    String name = args[0];
    if("EXECUTE_SCRIPT_ANDROID".equals(name)) {
      System.out.print(EvaluationAtom.EXECUTE_SCRIPT_ANDROID_original());
      System.exit(0);
    }
    if("GET_ELEMENT_ANDROID".equals(name)) {
      System.out.print(EvaluationAtom.GET_ELEMENT_ANDROID_original());
      System.exit(0);
    }
    System.exit(1);
  }
}