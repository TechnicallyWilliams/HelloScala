package helloScala.unit

import helloScala.HelloWorld
import org.scalatest.{FlatSpec, Matchers}

class exampleSpec extends FlatSpec with Matchers  {
 behavior of "helloScala project"

  it should "compute text message" in {
    HelloWorld.computeMessage() shouldEqual "hello world: "
  }

  it should "compute result number" in {
     HelloWorld.computeNumber() shouldEqual 123
  }
}
