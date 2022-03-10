package lab02

object Es7:

  enum Shape:
    case Rectangle (width: Double, height: Double)
    case Circle (radius: Double)
    case Square (height: Double)

  object Shape:
    def perimeter(shape: Shape): Double = shape match
      case Rectangle (width, height) => width * 2 + height * 2
      case Circle (radius) => (Math.PI * 2) * radius
      case Square (height) => height * 4

    def area(shape: Shape): Double = shape match
      case Rectangle (width, height) => width * height
      case Circle (radius) => Math.PI * radius * radius
      case Square (height) => height * height