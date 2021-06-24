package cw2.zd5

object zd5 {

  def main(args: Array[String]) : Unit = {
    val pracownik = new Osoba("", "", 0.5) with Pracownik {
      var pensja = 3500;
    }

    val student = new Osoba("", "", 0.5) with Student

    val studentPracownik = new Osoba("", "", 0.5) with Student with Pracownik{
      var pensja = 3500;
    };

    val pracownikStudent = new Osoba("", "", 0.5) with Pracownik with Student{
      var pensja = 3500;
    };

    val nauczyciel = new Osoba("", "", 0.5) with Nauczyciel{
      var pensja = 3500;
    }

    println(pracownik.podatek);
    println(student.podatek);
    println(studentPracownik.podatek);
    println(pracownikStudent.podatek);
    println(nauczyciel.podatek);
  };
}

