package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait MeshBasicMaterialParameters extends js.Object {
  var color: String = js.native
}

object MeshBasicMaterialParameters {
  def apply(color: String): MeshBasicMaterialParameters =
    js.Dynamic.literal(color = color).asInstanceOf[MeshBasicMaterialParameters]
}

@js.native
@JSImport("three", "MeshBasicMaterial")
class MeshBasicMaterial(parameters: MeshBasicMaterialParameters) extends Material {
  var color: Color = js.native
}
