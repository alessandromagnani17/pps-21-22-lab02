package Test

import lab02.Es3
import org.junit.Assert.{assertEquals, assertTrue}
import org.junit.Test

class Es3Test:
  val es3 = Es3

  @Test def testParityWithVal() =
    assertEquals("even", es3.parityWithVal(2))

  @Test def testParityWithDef() =
    assertEquals("odd", es3.parityWithDef(3))
  
  @Test def testNeg() =
    assertTrue(es3.notEmpty("foo"))

  @Test def testNegWithGenerics() =
    assertTrue(es3.notEmptyWithGenerics(8.5))

