package com.rabitarochan.parent

import java.util.Iterator
import scala.collection.JavaConversions._
import sun.misc.Service

object Main extends App {
  val services = Service.providers(classOf[PrintTrait]).asInstanceOf[Iterator[PrintTrait]]

  val message = "Hello world"

  services.foreach(p => p.print(message))

}
