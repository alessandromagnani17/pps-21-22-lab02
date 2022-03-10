package lab02

object Es8:

  enum Option[A]:
    case Some(a: A)
    case None()

  object Option:
    def filter[A](option: Option[A], f: A => Boolean): Option[A] = option match
      case Some(a: A) if f(a) => Some(a)
      case Some(a: A) if !f(a) => None()
      case _ => None()

    def map[A](option: Option[A], f: A => Boolean): Option[Boolean] = option match
      case Some(a: A) if f(a) => Some(true)
      case Some(a: A) if !f(a) => Some(false)
      case _ => None()

    def map2[A, B](option: Option[A], option2: Option[B]): Option[A] = option match
      case Some(a: A) if option != None() && option2 != None() => Some(a)
      case _ => None()
  import Option.*
