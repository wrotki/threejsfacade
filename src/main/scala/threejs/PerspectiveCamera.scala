package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// https://github.com/mrdoob/three.js/blob/master/src/cameras/PerspectiveCamera.js

@js.native
@JSImport("three", "PerspectiveCamera")
class PerspectiveCamera(fov: Float, aspect: Float, near: Float, far: Float) extends Camera {
}
