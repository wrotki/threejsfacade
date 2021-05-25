package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

@js.native
trait MeshStandardMaterialParameters extends js.Object {
  var color: String = js.native
}

object MeshStandardMaterialParameters {
  def apply(color: String): MeshBasicMaterialParameters =
    js.Dynamic.literal(color = color).asInstanceOf[MeshBasicMaterialParameters]
}

@js.native
@JSGlobal("THREE.MeshStandardMaterial")
class MeshStandardMaterial(parameters: MeshStandardMaterialParameters) extends Material {
  var color: Color = js.native
}