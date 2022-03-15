package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "BufferGeometry")
class BufferGeometry extends js.Object {

  def setAttribute ( name : String, attribute : BufferAttribute ): js.Object = js.native
  def getAttribute ( name : String ): BufferAttribute = js.native
  def translate ( x : Float, y : Float, z : Float ) : BufferGeometry = js.native
}
