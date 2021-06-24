package cw1.zd9

object zd9 {

  val listOfIntegers= List(1,2,3);

  def increaseListNumbers(list: List[Int]): List[Int] = {
    val increasedListOfIntegers= list.map(_+1);
    return increasedListOfIntegers;;

  }

  def main(args: Array[String]): Unit = {
    println(increaseListNumbers(listOfIntegers));

  }
}