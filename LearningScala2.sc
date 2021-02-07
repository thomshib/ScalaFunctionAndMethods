
val number = 5

number match {
  case 1 => println("One")
  case 2 => println("Two")
  case _ => println("SomeThing else")
}

for( x <- 1 to 4){
  val squared = x * x
  println(squared)
}

var x = 10

while( x >= 0){
  println(x)
  x -= 1
}


//Expressions

{ val x = 10; x + 20}