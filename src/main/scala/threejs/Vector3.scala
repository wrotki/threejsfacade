package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("THREE.Vector3")
class Vector3(var x: Float, var y: Float, var z: Float) extends js.Any {
  def set( x : Float, y : Float, z : Float ) : js.Any = js.native
}
