package email

import scala.collection.{SortedSet, mutable}

object Problem_1 {

  trait FindNumbers {
    /**
      * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
      *
      * @param k k value
      * @param arr array of values
      * @return TRUE if whether any two numbers from the list add up to k
      */
    def findNumbers(k: Int, arr: Array[Int]): Boolean
  }

  class FindNumbers_0n2 extends FindNumbers {

    /**
      * Complexity
      * Time : 0(n^2)
      * Space: 0(2n)
      */
    override def findNumbers(k: Int, arr: Array[Int]): Boolean = {
      val length = arr.length
      if (length < 2) false
      else {
        val indices = for(i <- 0 until length - 1; j <- i + 1 until length if arr(i) + arr(j) == k) yield (i, j)
        if (indices.length == 0) {
          println("No solutions found.")
          false
        } else {
          println("Solutions:")
          indices.foreach(ind => println(s"(${ind._1}, ${ind._2}) -> ${arr(ind._1)} + ${arr(ind._2)} = $k"))
          true
        }
      }
    }
  }

  class FindNumbers_0n extends FindNumbers {
    /**
      * Complexity
      * Time : 0(n)
      * Space: 0(n)
      */
    override def findNumbers(k: Int, arr: Array[Int]): Boolean = {
      var substracts : mutable.SortedSet[Int] = mutable.SortedSet()
      arr.exists(v => {
        println(s"Looking for $v...")
        if (substracts.contains(v)) {
          println(s"Found $v. Finished!")
          true
        } else {
          println(s"$v not found.")
          val sub = k - v
          substracts += sub

          println(s"Added $sub.")
          false
        }
      })
    }
  }
}
