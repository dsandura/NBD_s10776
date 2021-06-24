package cw2.zd4

object zd4 {

  def tripleCallFunction(number: Int, fx: Int => Int): Int = {
    fx(fx(fx(number)));
  }

  def main(args: Array[String]): Unit = {
    val num = 2;
    //zmienna która zawiera w sobie funkcje
    val fx = (x:Int) => x*2;
    println(tripleCallFunction(num, fx));
  }
}
