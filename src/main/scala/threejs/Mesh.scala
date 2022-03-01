package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Mesh")
class Mesh(var geometry: BufferGeometry, var material: Material) extends Object3D {
}
