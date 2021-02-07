//VALUES Are immutable constants

val hello:String = "Holla!"


//VARIABLES are mutable

var helloThere:String = hello

helloThere = hello + " There!"

print((helloThere))

val numberOne:Int = 1
val truth:Boolean = true
val pi:Double = 3.141526
val piSinglePrecision:Float = 3.141526f
val letterA:Char = 'A'
val bigNumber:Long = 1234567L
val smallNumber:Byte = 127

println(f"PI Single Precision is $piSinglePrecision%.3f")
println(f"Zero padding on the left $numberOne%05d")
println(s"I can display number $numberOne and truth $truth")
println(s"It can include expressions ${1+2}")

val ans:String = "To life, the universe and everythig is 42."
val pattern = """.* ([\   d]+).*""".r

val pattern(answerString) = ans

val answer = answerString.toInt
println(s"The pattern found is $answer")
