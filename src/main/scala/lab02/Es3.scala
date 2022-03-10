package lab02

object Es3:
  
  // parity with definition function
  def parityWithDef(n: Int): String = n match
    case n if n%2 == 0 => "even"
    case _ => "odd"

  // parity with val
  val parityWithVal: Int => String = _ match
    case n if n%2 == 0 => "even"
    case _ => "odd"

  // neg function
  def neg(x: String => Boolean): String => Boolean =
    (e:String) => !x(e)

  def empty(x: String): Boolean =
    x == ""

  def notEmpty = neg(empty)
  
  // neg function with generic predicates
  def negWithGenerics[A](x: A => Boolean): A => Boolean =
    e => !x(e)

  def emptyWithGenerics[A](x: A): Boolean =
    x == ""

  def notEmptyWithGenerics = negWithGenerics(emptyWithGenerics) 

