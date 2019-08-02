package arrays

object Ex_1_3_MaxSubarraySum {

  trait MaxSubarraySum {
    /**
      * Given an array of numbers, find the maximum sum of any contiguous subarray of the array
      * @param arr array of values
      * @return the maximum sum of any contiguous subarray of the array
      */
    def maxSubArraySum(arr: Array[Int]): Int
  }

  class MaxSubarraySum_0n extends MaxSubarraySum {
    /**
      * Complexity:
      * Time : 0(n)
      * Space: 0(1)
      */
    override def maxSubArraySum(arr: Array[Int]): Int = {
      arr.foldLeft((0, 0))((acc, v) => {  // acc = (max, currentMax)
        val current = acc._2 + v
        if (current > acc._1) (current, current)
        else if (v > acc._1) (v, v)
        else (acc._1, current)
      })._1
    }
  }
}
