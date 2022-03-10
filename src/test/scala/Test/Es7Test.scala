package Test

import lab02.Es7
import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test

class Es7Test:
  
  val es7 = Es7

  @Test def testPerimeterRectangle() =
    assertEquals(14, es7.Shape.perimeter(es7.Shape.Rectangle(3,4)), 0.01)

  @Test def testPerimeterCircle() =
    assertEquals(18.85, es7.Shape.perimeter(es7.Shape.Circle(3)), 0.01)

  @Test def testPerimeterSquare() =
    assertEquals(12, es7.Shape.perimeter(es7.Shape.Square(3)), 0.01)

  @Test def testAreaRectangle() =
    assertEquals(12, es7.Shape.area(es7.Shape.Rectangle(3,4)), 0.01)

  @Test def testAreaCircle() =
    assertEquals(28.27, es7.Shape.area(es7.Shape.Circle(3)), 0.01)

  @Test def testAreaSquare() =
    assertEquals(9, es7.Shape.area(es7.Shape.Square(3)), 0.01)