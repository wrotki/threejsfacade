package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName}

@js.native
@JSImport("three", "Light")
class Light(color: Int, intensity: Float) extends Object3D {
  @JSName("color")
  var color_prop: Color = js.native
}
