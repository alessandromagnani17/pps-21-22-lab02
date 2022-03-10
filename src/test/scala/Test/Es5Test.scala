package Test

import lab02.Es5
import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test

class Es5Test:
  
  val es5 = Es5

  @Test def testCompose() =
    assertEquals(9, es5.compose(_ - 1, _ * 2)(5))

  @Test def testComposeWithGenerics() =
    assertEquals(9, es5.composeWithGenerics[Int, Int, Int](_ - 1, _ * 2)(5))