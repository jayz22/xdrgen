// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

/* jshint maxstatements:2147483647  */
/* jshint esnext:true  */

import * as XDR from 'js-xdr';


var types = XDR.config(xdr => {
// === xdr source ============================================================
//
//   const FOO = 1;
//
// ===========================================================================
xdr.const("FOO", 1);

// === xdr source ============================================================
//
//   typedef int TestArray[FOO];
//
// ===========================================================================
xdr.typedef("TestArray", xdr.array(xdr.int(), xdr.lookup("FOO")));

// === xdr source ============================================================
//
//   typedef int TestArray2<FOO>;
//
// ===========================================================================
xdr.typedef("TestArray2", xdr.varArray(xdr.int(), xdr.lookup("FOO")));

});
export default types;
