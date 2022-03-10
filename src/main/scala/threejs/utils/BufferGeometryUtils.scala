package threejs.utils

import threejs.BufferGeometry

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport


// examples/jsm/utils/BufferGeometryUtils.js

@js.native
@JSImport("three/examples/jsm/utils/BufferGeometryUtils.js", JSImport.Namespace)
object BufferGeometryUtils extends js.Object {
  def mergeBufferGeometries(geometries : js.Array[BufferGeometry], useGroups : Boolean): BufferGeometry = js.native
}
