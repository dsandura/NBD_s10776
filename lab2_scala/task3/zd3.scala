package cw2.zd3

object zd3 {
  def displayWelcomeMessage(o: Osoba){
  val textToDisplay = o match {
    case Osoba("Szymon", _) => s"Witaj, ${o.imie}"
    case Osoba("Diana", _) => s"Cześć, ${o.imie}"
    case Osoba("Aspen", _) => s"Howdy, ${o.imie}"
  }
    println(textToDisplay)
  }

  def main(args: Array[String]): Unit = {
    val peopleList: List[Osoba] = List(
      new Osoba("Szymon","Sandura"),
      new Osoba("Diana","Sandura"),
      new Osoba("Aspen", "Sandura")
    )
    peopleList.foreach(o => displayWelcomeMessage(o));
  }
}
