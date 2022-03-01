package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Quaternion")
class Quaternion(var x: Float, var y: Float, var z: Float, var w: Float) extends js.Any {
  def identity () : Quaternion = js.native
  def multiply ( q : Quaternion ) : Quaternion = js.native
  def normalize () : Quaternion = js.native
  def copy ( q : Quaternion ) : Quaternion = js.native
  override def clone () : Quaternion = js.native
  def setFromAxisAngle ( axis : Vector3, angle : Float ) : Quaternion = js.native
}
