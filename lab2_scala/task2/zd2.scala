package cw2

object zd2 {

  def main(args: Array[String]): Unit = {
   val kontoBankowe = new KontoBankowe(100);
    kontoBankowe.wplata(10);
    kontoBankowe.wyplata(20);
    kontoBankowe.wyplata(100);


  }

}
