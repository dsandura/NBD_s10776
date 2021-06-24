package cw1.zd6

object zd6 {

  def printTuples(t: (Int, String, Double)) = {
    println(t._1 + " " +  t._2 + " " + t._3);

  }

  def main(args: Array[String]): Unit = {
   printTuples(3, "abc", 5.5);

  }
}
