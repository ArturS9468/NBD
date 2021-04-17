package org.nbd.com
package exercise2

class KontoBankowe {

  private var stanKonta: Double = 0

  def this(stan: Double) {
    this()
    stanKonta = stan
  }

  def wplata(kwota: Double): Unit = {
    stanKonta += kwota
  }

  def wyplata(kwota: Double): Unit = {
    stanKonta -= kwota
  }

  def pokazStanKonta(): Double = stanKonta

}
