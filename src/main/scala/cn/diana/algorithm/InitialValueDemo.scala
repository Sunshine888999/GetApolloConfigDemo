package cn.diana.algorithm

object InitialValueDemo {

  def main(args: Array[String]): Unit = {
    var str = ""
    str = "123"
    println("字符串类型的值：" + str)
    var list = List[String]()
    list = list ++ List("123")
    println("列表类型的值：" + list)

//    另一种表示方式，仅限在类中定义使用
    var name = People().name
    println("另一种方式字符串的表示：" + name)
    var scores = People().scores
    println("另一种方式列表的表示：" + scores)
    var age = People().age
    println("另一种方式整型的表示：" + age)
  }

}

case class People(){
  var name: String = _
  var scores: List[Int] = _
  var age: Int = _
}


