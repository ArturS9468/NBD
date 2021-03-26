package org.nbd.com
package exercise2

object Task5 {

  def main(args: Array[String]): Unit = {

    val nauczyciel = new Osoba2("Marek", "Markowski", 35) with Nauczyciel {
      var pensja: Double = 100
    }
    println(s"Dla nauczyciela: ${nauczyciel.getImie()}")
    println(s"Podatek: ${nauczyciel.getPodatek()}")
    println(nauczyciel.getPensja())


    val pracownik = new Osoba2("Czarek", "Czarkowski", 40) with Pracownik {
      var pensja: Double = 75
    }
    println(s"Dla pracownika: ${pracownik.getImie()}")
    println(s"Podatek: ${pracownik.getPodatek()}")
    println(pracownik.getPensja())


    val student = new Osoba2("Jarek", "Jarkowski", 100) with Student
    println(s"Dla studenta: ${student.getImie()}")
    println(s"Podatek: ${student.getPodatek()}")


    val mixStudent = new Osoba2("Franek", "Frankowski", 50) with Student with Pracownik {
      var pensja: Double = 50
    }
    println(s"Dla mixa zaczynajac od studenta: ${mixStudent.getImie()}")
    println(s"Podatek: ${mixStudent.getPodatek()}")



    val mixPracownik = new Osoba2("Bronek", "Bronkowski", 80) with Pracownik with Student {
      var pensja: Double = 45
    }
    println(s"Dla mixa zaczynajac od pracownika: ${mixPracownik.getImie()}")
    println(s"Podatek: ${mixPracownik.getPodatek()}")




  }


}
