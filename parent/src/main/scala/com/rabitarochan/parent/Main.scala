package com.rabitarochan.parent

import java.util.Iterator
import java.util.ServiceLoader
import scala.collection.JavaConversions._


object Main extends App {
  val loader = ServiceLoader.load(classOf[PrintTrait])

  val message = "Hello world"

  loader.foreach(p => p.print(message))
}
