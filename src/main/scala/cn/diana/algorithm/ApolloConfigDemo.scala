package cn.diana.algorithm

import cn.diana.algorithm.ApolloConfigDemo.{DEFAULT_VALUE, config, ip}
import com.ctrip.framework.apollo.{Config, ConfigChangeListener, ConfigService}
import com.ctrip.framework.apollo.model.ConfigChangeEvent

class ApolloConfigDemo(){

  def getConfig(key: String) = {
    val result = config.getProperty(key, DEFAULT_VALUE)
    println(String.format("Loading key : %s with value: %s", key, result))
    ip = result
    result
  }

  def returnIp(): String ={
    ip
  }

}


object ApolloConfigDemo{

  private val DEFAULT_VALUE = "undefined"
  private var config: Config = _
  private var ip = "192.167.2.236"

  def apply(): ApolloConfigDemo = {
    val changeListener = new ConfigChangeListener {
      override def onChange(configChangeEvent: ConfigChangeEvent): Unit = {
        println("Changes for namespace {}", configChangeEvent.getNamespace)
        import scala.collection.JavaConverters._
        val keys = configChangeEvent.changedKeys().asScala
        keys.foreach(k => {
          val change = configChangeEvent.getChange(k)
          ip = change.getNewValue
          println("Change - ip: ", ip)
          println("Change - key: {}, oldValue: {}, newValue: {}, changeType: {}", change.getPropertyName, change.getOldValue, change.getNewValue, change.getChangeType)
        })
      }
    }
    config = ConfigService.getConfig("development.databaseinfo") // namespace的名字
    config.addChangeListener(changeListener)
    new ApolloConfigDemo()
  }


}
