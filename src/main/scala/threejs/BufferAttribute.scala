package threejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.typedarray.{Float32Array, TypedArray}

@js.native
@JSGlobal("THREE.BufferAttribute")
class BufferAttribute(array : Float32Array /* TODO should be TypedArray */, itemSize : Integer, normalized : Boolean = false) extends js.Object {

}
