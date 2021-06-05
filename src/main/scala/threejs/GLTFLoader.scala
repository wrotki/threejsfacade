package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("THREE.GLTFLoader")
class GLTFLoader extends Loader {
  def load(url: String, onLoad: js.Function1[js.Object, Unit], onProgress: js.Function1[js.Any, Unit] = js.native, onError: js.Function1[js.Any, Unit] = js.native): Unit = js.native
}
