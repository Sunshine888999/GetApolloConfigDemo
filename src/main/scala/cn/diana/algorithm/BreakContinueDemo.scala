package cn.diana.algorithm

object BreakContinueDemo {

  def main(args: Array[String]): Unit = {
//    breakDemo()
    continueDemo()
  }

  def continueDemo(): Unit ={
    import scala.util.control.Breaks._
    for(i <- 0 until 7){
      breakable{
        if(i == 3 || i == 4) {
          break
        }
        println("当前数字为：" + i)
      }
    }
  }

  def breakDemo(): Unit ={
    import scala.util.control.Breaks._
    breakable(
      for(i <- 0 until 5) {
        println("当前数字为：" + i)
        if(i == 3){
          break()
        }
      }
    )
  }

}
