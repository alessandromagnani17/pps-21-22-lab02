package Test

import lab02.Es4
import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test

class Es4Test:

  val es4 = Es4

  @Test def testP1() =
    assertFalse(es4.p1(2)(4)(3))

  @Test def testP2() =
    assertFalse(es4.p2(2, 4, 3))

  @Test def testP3() =
    assertFalse(es4.p3(2)(4)(3))

  @Test def testP4() =
    assertFalse(es4.p4(2, 4, 3))



