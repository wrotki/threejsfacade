package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import org.scalajs.dom.Element

@js.native
@JSImport("three/examples/jsm/controls/FlyControls.js", "FlyControls")
class FlyControls(camera: Camera, htmlDOMElement: Element) extends EventDispatcher {
  var dragToLook: Boolean = js.native
  var movementSpeed: Float = js.native
  var rollSpeed: Float = js.native

  def update(delta: Float): Unit = js.native
}
