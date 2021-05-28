package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

@js.native
trait MeshStandardMaterialParameters extends js.Object {
  var color: String = js.native
}

object MeshStandardMaterialParameters {
  def apply(color: String): MeshStandardMaterialParameters =
    js.Dynamic.literal(color = color).asInstanceOf[MeshStandardMaterialParameters]
}

@js.native
@JSGlobal("THREE.MeshStandardMaterial")
class MeshStandardMaterial(parameters: MeshStandardMaterialParameters) extends Material {
  var color: Color = js.native
  var emissive: Color = js.native
  var metalness: Float = js.native
  var roughness: Float = js.native
}
