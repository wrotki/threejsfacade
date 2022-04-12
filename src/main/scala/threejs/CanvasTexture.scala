package threejs

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "CanvasTexture")
class CanvasTexture(canvas: HTMLElement) extends Texture {

}
