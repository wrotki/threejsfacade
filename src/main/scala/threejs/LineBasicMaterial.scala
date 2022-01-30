package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait LineMaterialParameters extends js.Object {
  var color: String = js.native
}

object LineMaterialParameters {
  def apply(color: String): LineMaterialParameters =
    js.Dynamic.literal(color = color).asInstanceOf[LineMaterialParameters]
}

@js.native
@JSGlobal("THREE.LineBasicMaterial")
class LineBasicMaterial(parameters: LineMaterialParameters) extends Material {

}
