package Test

import lab02.Es8
import org.junit.Assert.assertEquals
import org.junit.Test

class Es8Test:

  val es8 = Es8

  @Test def testFilterWithNone() =
    assertEquals(es8.Option.None(), es8.Option.filter[Int](es8.Option.None[Int](), _ > 8))
  
  @Test def testFilterWithSomeHigher() =
    assertEquals(es8.Option.Some(10), es8.Option.filter[Int](es8.Option.Some(10), _ > 8))
  
  @Test def testFilterWithSomeLower() =
    assertEquals(es8.Option.None(), es8.Option.filter[Int](es8.Option.Some(8), _ > 10))
  
  @Test def testMapWithNone() =
    assertEquals(es8.Option.None(), es8.Option.map[Int](es8.Option.None[Int](), _ > 8))
  
  @Test def testMapWithSomeHigher() =
    assertEquals(es8.Option.Some(true), es8.Option.map[Int](es8.Option.Some(10), _ > 8))
  
  @Test def testMapWithSomeLower() =
    assertEquals(es8.Option.Some(false), es8.Option.map[Int](es8.Option.Some(8), _ > 10))
  
  @Test def testMap2WithNone() =
    assertEquals(es8.Option.None(), es8.Option.map2[Int, Double](es8.Option.None[Int](), es8.Option.Some(10)))
  
  @Test def testMap2WithSome() =
    assertEquals(es8.Option.Some(10), es8.Option.map2[Int, Double](es8.Option.Some(10), es8.Option.Some(8)))