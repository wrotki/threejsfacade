package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.typedarray.{Float32Array, TypedArray}

@js.native
@JSImport("three", "BufferAttribute")
class BufferAttribute(array : Float32Array /* TODO should be TypedArray */, itemSize : Integer, normalized : Boolean = false) extends js.Object {

}
