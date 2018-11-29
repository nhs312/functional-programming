/**
  * Created by nhs312@gmail.com on 2018-11-30.
  */
class MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }


  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}
