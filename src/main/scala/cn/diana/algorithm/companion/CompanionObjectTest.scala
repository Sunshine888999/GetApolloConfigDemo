package cn.diana.algorithm.companion

object CompanionObjectTest {

  def main(args: Array[String]): Unit = {
    //类名后加括号，相当于调用伴生对象的apply方法
    val a = Companion()
    a.fun()
    println("======分割线======")
    //对象加括号相当于调用对象的apply方法
    println(a())
    println(new Companion().apply())
    println(Companion.funObject())
    println("***********分割线***********")

    val com1 = new Companion
    println("id为：" + com1.id)
    com1.setVariable()

    val com2 = new Companion
    println("id为：" + com2.id)

  }

}
