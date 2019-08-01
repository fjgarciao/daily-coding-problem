package email

import email.Problem_1._
import org.scalatest.{FunSuite, Matchers}

class Problem_1Test extends FunSuite with Matchers {

  test("findNumbers 0(n^2) returns true") {
    val k = 17;
    val arr = Array(10, 15, 3, 7)

    new FindNumbers_0n2().findNumbers(k, arr) should(be(true))
  }

  test("findNumbers 0(n^2) returns false") {
    val k = 16;
    val arr = Array(10, 15, 3, 7)

    new FindNumbers_0n2().findNumbers(k, arr) should(be(false))
  }

  test("findNumbers 0(n) returns true") {
    val k = 17;
    val arr = Array(10, 15, 3, 7)

    new FindNumbers_0n().findNumbers(k, arr) should(be(true))
  }

  test("findNumbers 0(n) returns false") {
    val k = 16;
    val arr = Array(10, 15, 3, 7)

    new FindNumbers_0n().findNumbers(k, arr) should(be(false))
  }

  test("findNumbers 0(n) returns true, test lazyness") {
    val k = 17;
    val arr = Array(10, 7, 3, 15)

    println("\n\nTest lazyness")
    new FindNumbers_0n().findNumbers(k, arr) should(be(true))
  }

}
