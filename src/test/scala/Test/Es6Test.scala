package Test

import lab02.Es6
import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test

class Es6Test:
  
  val es6 = Es6

  @Test def testFib() =
    assertEquals(3, es6.fib(4))