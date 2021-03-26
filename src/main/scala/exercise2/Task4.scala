package org.nbd.com
package exercise2

object Task4 {

  def main(args: Array[String]): Unit = {
    println(multiplyBySelfTriple(multiplyBySelf, 2))
    println(multiplyBySelfTriple(multiplyBySelf, 3))
    println(multiplyBySelfTriple(multiplyBySelf, 4))
  }


  def multiplyBySelf(x: Int) = x * x

  def multiplyBySelfTriple(method: (Int) => Int, value: Int) : Int = {
    var result = method(value)
    result = method(result)
    result = method(result)
    result
  }

}
