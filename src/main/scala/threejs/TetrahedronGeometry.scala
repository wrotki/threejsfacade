package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "TetrahedronGeometry")
class TetrahedronGeometry(radius : Float, detail : Int)
  extends PolyhedronGeometry {

}
