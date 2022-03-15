package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "PolyhedronGeometry")
class PolyhedronGeometry
  extends BufferGeometry {

  def this(vertices: js.Array[Float], faces: js.Array[Int], radius: Double = js.native, detail: Double = js.native) = this()
}
