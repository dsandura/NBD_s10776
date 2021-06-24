package cw1.zd7

object zd7 {
  val products = Map("peanut butter" -> 20, "ice-cream" -> 30);
  //val products = Map[String, Int]();

  def main(args: Array[String]): Unit = {
    if(!products.isEmpty) {
      var some = products.get("peanut butter");
      var none = products.get("test");
      println(some);
      println(none);
    }
    else
      println("There are no products");

  }



}
