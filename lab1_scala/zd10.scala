package cw1.zd10

object zd10 {

  val listOfRealNumbers = List(-6, -5, 0, 1, 2.2, 3);

  def convertListAbsoluteValues(list: List[Double]): List[Double] = {
    val valuesFromRanch = list.filter(n => n >= -5 && n <= 12);
    val absoluteListOfValues = valuesFromRanch.map(math.abs);
    return absoluteListOfValues;
  }

  def main(args: Array[String]): Unit = {
    println(convertListAbsoluteValues(listOfRealNumbers));

  }

}
