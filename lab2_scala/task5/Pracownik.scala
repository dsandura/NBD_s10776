package cw2.zd5

trait Pracownik extends Osoba{
  var pensja : Double;
  override def podatek: Double = 0.2
}
