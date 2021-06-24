package cw2

class KontoBankowe(początkowyStanKonta: Double) {
  def this() {
    this(0);

  }
 private var _stanKonta: Double = początkowyStanKonta;

  def stanKonta: Double = _stanKonta;

  def wplata(depozyt: Double): Unit = {
  _stanKonta = depozyt + _stanKonta;
    println("Twoje saldo po wpłacie " + depozyt + "PLN " + "wynosi: " + _stanKonta);
  }

  def wyplata(wyplata: Double): Unit = {
    if(_stanKonta>=wyplata) {
      _stanKonta = _stanKonta - wyplata;
      println("Twoje saldo po wypłacie " + wyplata + "PLN " + "wynosi: " + _stanKonta);
    }
    else println("Nie masz wystarczających środków na wypłatę")

  }
}



