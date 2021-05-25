package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

@js.native
@JSGlobal("THREE.Light")
class Light(color: Int, intensity: Float) extends Object3D {
  @JSName("color")
  var color_prop: Color = js.native
}
