package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

@js.native
trait MeshBasicMaterialParameters extends js.Object {
  var color: String = js.native
}

object MeshBasicMaterialParameters {
  def apply(color: String): MeshBasicMaterialParameters =
    js.Dynamic.literal(color = color).asInstanceOf[MeshBasicMaterialParameters]
}

@js.native
@JSGlobal("THREE.MeshBasicMaterial")
class MeshBasicMaterial(parameters: MeshBasicMaterialParameters) extends Material {
//  @JSName("color")
  var color: Color = js.native
}
