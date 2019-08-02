package arrays

import Ex_1_3_MaxSubarraySum._
import org.scalatest.{FunSuite, Matchers}

class Ex_1_3_MaxSubarraySumTest extends FunSuite with Matchers {

  test("maxSubarraySum_0n of [34, -50, 42, 14, -5, 86] is 137") {
    val arr = Array(34, -50, 42, 14, -5, 86)
    val expected = 137

    new MaxSubarraySum_0n().maxSubArraySum(arr) should(be(expected))
  }

  test("maxSubarraySum_0n of [-5, -1, -8, -9] is 0") {
    val arr = Array(-5, -1, -8, -9)
    val expected = 0

    new MaxSubarraySum_0n().maxSubArraySum(arr) should(be(expected))
  }

  test("maxSubarraySum_0n of [-74, 56, 73, 84, -47, 98, 34, -95, 94, 9] is 306") {
    val arr = Array(-74, 56, 73, 84, -47, 98, 34, -95, 94, 9)
    val expected = 306

    new MaxSubarraySum_0n().maxSubArraySum(arr) should(be(expected))
  }
}
