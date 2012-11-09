package com.rabitarochan.child

import com.rabitarochan.parent.PrintTrait

class Print extends PrintTrait {

  def print(s: String): Unit = {
    println("child: " + s)
  }

}
