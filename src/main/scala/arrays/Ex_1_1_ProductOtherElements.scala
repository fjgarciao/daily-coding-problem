package arrays

object Ex_1_1_ProductOtherElements {

  private def mult(acc: Int, v: Int)= acc * v

  trait ProductOtherElements {
    /**
      * Returns a new array were ith position is the product of all the rest elements in the array
      *
      * @param arr input array
      * @return a new array were ith position is the product of all the rest elements in the array
      */
    def products(arr: Array[Int]): Seq[Int]
  }

  class POE_Without_Division extends ProductOtherElements {
    /**
      * Complexity:
      * - Time : 0(3n)
      * - Space: 0(3n)
      */
    def products(arr: Array[Int]) = {
      if (arr.isEmpty) arr
      else {
        val prefixes = arr.tail.scanLeft(arr.head)(mult)
        val suffixes = arr.dropRight(1).scanRight(arr.last)(mult)

        for(index <- arr.indices) yield {
          if (index == 0) suffixes(index + 1)
          else if (index == arr.length - 1) prefixes(index - 1)
          else prefixes(index - 1) * suffixes(index + 1)
        }
      }
    }
  }

  class POE_With_Division extends ProductOtherElements {
    /**
      * Complexity:
      * - Time : 0(2n)
      * - Space: 0(n)
      */
    def products(arr: Array[Int]) = {
      if (arr.isEmpty) arr
      else {
        val products = arr.foldLeft(1)(mult)
        for(value <- arr) yield { if (value == 0) 0 else products / value }
      }
    }
  }

}
