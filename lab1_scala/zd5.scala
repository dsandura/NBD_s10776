package cw1

package object zd5 {
  val products = Map("peanut butter" -> 20, "ice-cream" -> 30);

  def increasePrice(): Map[String, Double] = {
    val increasedPriceProducts = products.map(pair=>(pair._1, pair._2*1.1));
    return increasedPriceProducts;

  }

  def main(args: Array[String]): Unit = {
    println(increasePrice());

  }

}
