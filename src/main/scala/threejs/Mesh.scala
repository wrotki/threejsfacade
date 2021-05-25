package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal


@js.native
@JSGlobal("THREE.Mesh")
class Mesh(var geometry: BufferGeometry, var material: Material) extends Object3D {
}
