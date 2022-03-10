package lab02

object Es4:
  
  // curried val
  val p1: Int => Int => Int => Boolean = x => y => z => x match
    case x if x > y || x > z || y > z => false
    case _ => true

  // non-curried val
  val p2: (x: Int, y: Int, z: Int) => Boolean = (x, y, z) => x match
    case x if x > y || x > z || y > z => false
    case _ => true

  // curried def
  def p3(x: Int)(y : Int)(z: Int): Boolean = x match
    case x if x > y || x > z || y > z => false
    case _ => true

  // def p3(x: Int)(y : Int)(z: Int): Boolean = !(x > y) || !(x > z) || !(y > z)

  // non-curried def
  def p4(x: Int, y : Int, z: Int): Boolean = x match
    case x if x > y || x > z || y > z => false
    case _ => true