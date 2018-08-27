package helloScala

object HelloWorld {

  def computeMessage(): String = {
    return "hello world: "
  }

  def computeNumber(): Int = {
    return 123
  }

  def main(args: Array[String]): Unit =  {
    val message = computeMessage ()

    val number = computeNumber ()

    println(message + number)
  }
}
