package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Material")
class Material() extends js.Object {
  var side: Int = js.native
}


object Material {
  val DoubleSide = 2
}