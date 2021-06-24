package cw1.zd8

object zd8 {
  val numbers: List[Int] = List(1,0,2,3,0);

  def generateListWithoutZerosUsingRecursive(valueToBeRemoved: Int, inputNumbers: List[Int]): List[Int]= inputNumbers match {
      case Nil => Nil
      case head :: tail =>
      if(head == valueToBeRemoved)
        generateListWithoutZerosUsingRecursive(valueToBeRemoved,tail)
        else
          head :: generateListWithoutZerosUsingRecursive(valueToBeRemoved, tail);
  }

  def main(args: Array[String]): Unit = {
    println(generateListWithoutZerosUsingRecursive(0, numbers));

  }

}
