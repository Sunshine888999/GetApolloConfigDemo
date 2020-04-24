package cn.diana.algorithm.companion

class Statistics {

  val id = Statistics.newUniqueNumber()

  private var secondId = 0.0

  def selfId(amount: Double): Double = {
    secondId += amount
    secondId
  }

  def secondIdCur = secondId

}

object Statistics {
  private var num = 0

  private def newUniqueNumber() = {
    num += 1
    num
  }
}

object StatisticsTest {
  def main(args: Array[String]): Unit = {
    val s = new Statistics
    println(s.id)
    println(s.selfId(1))
    println("=" * 10)

    val s1 = new Statistics
    println(s1.id)
    println(s1.selfId(10))
    println("=" * 10)

    val s2 = new Statistics
    println(s2.id)

    println("a " + s.secondIdCur + "; b " + s1.secondIdCur)
  }
}