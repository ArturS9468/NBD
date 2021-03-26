package org.nbd.com
package exercise2

class KontoBankowe (private var stanKonta: Double) {

  def this() {
    this(0);
  }

  def wplata(kwota: Double): Unit = {
    stanKonta += kwota
  }

  def wyplata(kwota: Double): Unit = {
    stanKonta -= kwota
  }

  def pokazStanKonta(): Double = stanKonta

}
