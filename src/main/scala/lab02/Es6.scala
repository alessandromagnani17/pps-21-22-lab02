package lab02

object Es6:

  def fib(n: Int): Int = n match
    case 0 => n
    case 1 => n + fib(n-1)
    case _ => fib(n-1) + fib(n-2)