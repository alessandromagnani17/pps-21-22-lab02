package lab02

object Es5:
  
  def compose(f: Int => Int, g: Int => Int): Int => Int =
    e => f(g(e))

  // generic version of compose
  def composeWithGenerics[A, B, C] (f: B => C, g: A => B): A => C =
    e => f(g(e))