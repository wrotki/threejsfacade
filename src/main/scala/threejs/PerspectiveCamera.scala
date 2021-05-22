package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

// https://github.com/mrdoob/three.js/blob/master/src/cameras/PerspectiveCamera.js

@js.native
@JSGlobal("THREE.PerspectiveCamera")
class PerspectiveCamera(fov: Float, aspect: Float, near: Float, far: Float) extends Camera {
}
