package com.eulers.work

/**
 * Created by johnthomas on 27/01/2016.
 */

object Euler006 {
  def main(args: Array[String]): Unit = {
    val number             = 1 to 100
    def sqre(x: Int)       = x*x
    println("Result" +( (sqre(number.sum)) - number.map(sqre).sum ))
  }

}
