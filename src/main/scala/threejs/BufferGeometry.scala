package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "BufferGeometry")
class BufferGeometry extends js.Object {

  def setAttribute ( name : String, attribute : BufferAttribute ): js.Object = js.native
}
