package cn.diana.algorithm.companion

class Companion{

  val id = Companion.count

  def apply() = println("我是类")

  def fun(){
    println("我是类中的方法")
  }

  def setVariable() ={
    Companion.addCount()
    println("目前的id为：%s" + id)
  }


}

object Companion{

  private var count = 0

  def apply() = {
    println("我是伴生对象")
    new Companion()    //返回Companion类的对象实例
  }

  def funObject(): Unit ={
    println("我是伴生对象中的方法")
  }

  def addCount(): Int ={
    count += 1
    count
  }

}




