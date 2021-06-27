package cw1.zd1_zd4

object cw1 {

  val week: List[String] = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

  //val weekDays = new StringBuilder();

  def getCommaSeperatedDays(): String = {
    val allDays = new StringBuilder();
    for (day <- week) {
      allDays.append(day + ",");
    }
    allDays.deleteCharAt(allDays.length() - 1);

    return allDays.toString();
  }

  def getDaysStartingWithLetterP(): String = {
    val daysWithLetterP = new StringBuilder();
    for (day <- week) {
      if (day.startsWith("M")) {
        daysWithLetterP.append(day + ",");
        daysWithLetterP.deleteCharAt(daysWithLetterP.length() - 1);
      }
    }
    return daysWithLetterP.toString();
  }

  def getCommaSeperatedDaysUsingWhileLoop(): String = {
    val allDays = new StringBuilder();
    var index = 0;
    while (index < week.length) {
      allDays.append(week(index) + ",");
      index += 1;
    }
    allDays.deleteCharAt(allDays.length() - 1);
    return allDays.toString();
  }

  def getCommaSeperatedDaysUsingRecursive(index: Int = 0, weekDays: StringBuilder = new StringBuilder()): String = {
    weekDays.append(week(index) + ",");
    if (index < week.length - 1) {
      getCommaSeperatedDaysUsingRecursive(index + 1, weekDays);
    }
    else {
      weekDays.deleteCharAt(weekDays.length() - 1);
      return weekDays.toString();
    }
  }

  def getCommaSeperatedUsingRecursiveReverse(index: Int = week.length - 1, weekDays: StringBuilder = new StringBuilder): String = {
    weekDays.append((week(index)) + ",");
    if (index > 0) {
      getCommaSeperatedUsingRecursiveReverse(index - 1, weekDays);
    }
    else {
      weekDays.deleteCharAt(weekDays.length() - 1);
      return weekDays.toString();
    }
  }

  /*Stwórz funkcję korzystającą z rekurencji ogonowej do zwrócenia
  oddzielonego przecinkami stringa zawierającego elementy listy z ćwiczenia 1 */
  def getCommaSeperatedUsingTailRecursion(index: Int = 0, weekDays: StringBuilder = new StringBuilder): String = {
    weekDays.append((week(index)) + ",");
    if (index >= week.length - 1) {
      weekDays.deleteCharAt(weekDays.length() - 1);
      return weekDays.toString();
    }
    getCommaSeperatedUsingTailRecursion(index + 1, weekDays);
  }

  /*Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią
  stringa z elementami oddzielonymi przecinkami korzystając z: a. Metody foldl
   */

  def getCommaSeperatedUsingFoldLeft(): String = {
    val str = week.foldLeft("")(_ + _ + ",");
    return str.substring(0, str.length - 1);
  }

  def getCommaSeperatedUsingFoldRight(): String = {
    val str = week.foldRight("")((a, b) => {
      a + "," + b;
    });
    return str.substring(0, str.length - 1);
  }

  def getCommaSeperatedUsingFoldLeftStartingWithP(): String = {
    val str = week.foldLeft("")((a, b) =>
      if (b.startsWith("T"))
        a + b + ","
      else a
    )
    return str.substring(0, str.length - 1);
  }


  def main(args: Array[String]): Unit = {
    println(getCommaSeperatedDays());
    println(getDaysStartingWithLetterP());
    println(getCommaSeperatedDaysUsingWhileLoop());
    println(getCommaSeperatedDaysUsingRecursive());
    println(getCommaSeperatedUsingRecursiveReverse());
    println(getCommaSeperatedUsingTailRecursion());
    println(getCommaSeperatedUsingFoldLeft());
    println(getCommaSeperatedUsingFoldRight());
    println(getCommaSeperatedUsingFoldLeftStartingWithP());

  }

}
