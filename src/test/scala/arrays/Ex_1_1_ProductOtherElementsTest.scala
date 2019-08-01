package arrays

import arrays.Ex_1_1_ProductOtherElements._
import org.scalatest.{FunSuite, Matchers}

class Ex_1_1_ProductOtherElementsTest extends FunSuite with Matchers {

  test("POE_With_Division products []") {
    val values : Array[Int] = Array()
    val expected : Array[Int] = Array()

    new POE_With_Division().products(values) should(be(expected))
  }

  test("POE_With_Division products [1, 2, 3, 4, 5]") {
    val values = Array(1, 2, 3, 4, 5)
    val expected = Array(120, 60, 40, 30, 24)

    new POE_With_Division().products(values) should(be(expected))
  }

  test("POE_With_Division products [5, 4, 3, 2, 1]") {
    val values = Array(5, 4, 3, 2, 1)
    val expected = Array(24, 30, 40, 60, 120)

    new POE_With_Division().products(values) should(be(expected))
  }

  test("POE_Without_Division products []") {
    val values : Array[Int] = Array()
    val expected : Array[Int] = Array()

    new POE_Without_Division().products(values) should(be(expected))
  }

  test("POE_Without_Division products [1, 2, 3, 4, 5]") {
    val values = Array(1, 2, 3, 4, 5)
    val expected = Array(120, 60, 40, 30, 24)

    new POE_Without_Division().products(values) should(be(expected))
  }

  test("POE_Without_Division products [5, 4, 3, 2, 1]") {
    val values = Array(5, 4, 3, 2, 1)
    val expected = Array(24, 30, 40, 60, 120)

    new POE_Without_Division().products(values) should(be(expected))
  }
}
