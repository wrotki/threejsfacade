package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("THREE.DirectionalLight")
class DirectionalLight(color: Int, intensity: Float) extends Light(color, intensity) {
}
