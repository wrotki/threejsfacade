package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait MeshBasicMaterialParameters extends js.Object {
  var color: String = js.native
  var map: Texture = js.native
}

object MeshBasicMaterialParameters {
  def apply(color: String): MeshBasicMaterialParameters =
    js.Dynamic.literal(color = color).asInstanceOf[MeshBasicMaterialParameters]
  def apply(map: Texture): MeshBasicMaterialParameters =
    js.Dynamic.literal(map = map).asInstanceOf[MeshBasicMaterialParameters]
}

@js.native
@JSImport("three", "MeshBasicMaterial")
class MeshBasicMaterial(parameters: MeshBasicMaterialParameters) extends Material {
  var color: Color = js.native
  var map: Texture = js.native
}
