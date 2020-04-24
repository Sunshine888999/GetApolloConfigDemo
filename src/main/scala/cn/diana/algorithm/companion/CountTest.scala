package cn.diana.algorithm.companion


class CountAdd {
  val id = CountAdd.updateNum()

}

object CountAdd {
  private var num = 0

  private def updateNum() = {
    num += 1
    num
  }
}





object CountTest {

  def main(args: Array[String]): Unit = {
    val c1 = new CountAdd
    println(c1.id)

    val c2 = new CountAdd
    println(c2.id)
  }

}
