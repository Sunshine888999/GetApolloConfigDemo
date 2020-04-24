package cn.diana.algorithm

import com.google.common.base.Charsets
import java.io.BufferedReader
import java.io.InputStreamReader


object SimpleApolloConfigDemoTest {

  def main(args: Array[String]): Unit = {
    var a = ApolloConfigDemo()
    println("Apollo Config Demo. Please input key to get the value. Input quit to exit.")
    import scala.util.control.Breaks._
    while(true){
      breakable {
        print("请输入查询的参数：")
        var input = new BufferedReader(new InputStreamReader(System.in, Charsets.UTF_8)).readLine
        if (input == null || input.length == 0) break()
        input = input.trim
        if (input.equalsIgnoreCase("quit")) System.exit(0)
        a.getConfig(input)
        println(a.returnIp())
      }
    }
  }

}