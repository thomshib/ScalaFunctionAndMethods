//explore var, val, lazyval, def keywords

//val is immutable

val volume = 1000

println(volume)

//val cannot be reassigned; this doesn't work

//volume = 200


//var is mutable

var stockPrice = 79
println(stockPrice)
stockPrice = 80
println(stockPrice)


//method definition using def

def finalValue:Int = stockPrice * volume

//invoke the method
finalValue


//lazyval is lazily evaluated; i.e at the first time of reference in code
// it is not evaluated at defintion


val faceValue = 5
lazy val lazyFaceValue = 5

faceValue
lazyFaceValue


//val resassignmet quirks

val data = {
  println("Array is initialized")
  Array("MSFT","GM","TM")
}

println("Before accessing data")
data.foreach(println)

println("---------------------")
data.foreach(println)

//val do not permit reassignment but allow modifications to the object

//no reassignment possible, see below

//data = { println("Reassignment")
//  Array("FAC")
//}

//object modification is allowed

data(0) = "AAPL"
data(1) = "TSLA"
println("---------------------")
data.foreach(println)

//--------------------def-----------------

//def is used to define methods
// methods are only evaluated at the time of invocation of the method

def data:Array[String] = {
  println("Array is initialized")
  Array("GOOG","TM","MSFT")
}

println("Before Accessing the data    ")
data.foreach(println)

//method is evaluated again before each invocation
println("---------------------")
data.foreach(println)


//-------------lazyval-----------------

val stockPrice = 14
lazy val volume = {
  println("Assigning lazy val");
  100
}

println("Calculating finalvalue")
var finalValue = stockPrice * volume
print(s"Final value is $finalValue")


// a lazy val is evaluated only once at the time of first reference
//this is unlike def which is evaluated every time

lazy val data ={
  println("Array is initialized")
  Array("GOOG","MSFT", "TM")
}

println("Before accessing data")
data.foreach(println)
println("---------------------")
data.foreach(println)
