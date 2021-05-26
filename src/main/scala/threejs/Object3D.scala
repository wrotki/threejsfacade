package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait PositionParameters extends js.Object {
  var x: Float = js.native
  var y: Float = js.native
  var z: Float = js.native
}

object PositionParameters {
  def apply(x: Float, y: Float, z: Float): PositionParameters =
    js.Dynamic.literal(x = x, y = y, z = z).asInstanceOf[PositionParameters]
}

@js.native
trait RotationParameters extends js.Object {
  var x: Float = js.native
  var y: Float = js.native
  var z: Float = js.native
}

object RotationParameters {
  def apply(x: Float, y: Float, z: Float): RotationParameters =
    js.Dynamic.literal(x = x, y = y, z = z).asInstanceOf[RotationParameters]
}

@js.native
@JSGlobal("THREE.Object3D")
class Object3D extends js.Object {
  var position: Vector3 = js.native
  var rotation: RotationParameters = js.native

  def  add(object3d: Object3D): Object3D = js.native// TODO: .add ( object : Object3D, ... ) : this
}
