package cn.diana.algorithm.companion

class People (val count: Int, val name: String){

  override def toString: String = {
    "count: " + count + ", name: " + name
  }
}

object People {
  private var count = 0

  private def countAdd = {
    count += 1
    count
  }

  def apply(name: String): People = {
    new People(countAdd, name)
  }
}

object AddTest {

  def main(args: Array[String]): Unit = {
    val p1 = People("zhangsan")
    println(p1.toString)

    val p2 = People("zhangsan")
    println(p2.toString)
  }

}

