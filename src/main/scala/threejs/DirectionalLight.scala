package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("THREE.DirectionalLight")
class DirectionalLight(color: Int, intensity: Float) extends Light(color, intensity) {
  var target: Object3D = js.native
}

case object DirectionalLight {

  def apply(color: Int, intensity: Float, target: Object3D, x: Float, y: Float, z: Float): DirectionalLight = {
    val ret = new DirectionalLight(color, intensity)
    ret.position.x = x
    ret.position.y = y
    ret.position.z = z
    ret.target = target
    ret
  }
}
