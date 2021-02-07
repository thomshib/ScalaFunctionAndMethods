//https://www.cis.upenn.edu/~matuszek/Concise%20Guides/Concise%20Scala.html
//https://data-flair.training/blogs/scala-list/

//List is immutable and represents a linked list.


val a:List[Int] = List(1,2,3)

//If it’ll hold more than one kind, we use ‘Any’.
val b:List[Any] = List(1,2,"test")

println(b.head)

val e:List[List[Int]] = List(List(1,2,3), List(4,5,6))

//Defining Scala List using :: and Nil
//Think of Nil as an empty list, and :: as cons

val c = 1 :: 2 :: 3 :: Nil

val d = "a" :: ("b" :: Nil)




//Operations on List

//list concat :::
val x = List(1,2,3)
val y = List(4,5,6)

val z = x ::: y

x.:::(y)

//Fill methods

val a = List.fill(7)(1)

val g = List.tabulate(7)(n=>n*2)

val h = List.tabulate(3,7)(_*_)


//Anonymous Function
List(1,2,3,4).foreach(elem => print(elem))

//short form of the above _ stands for param
List(1,2,3,4).foreach(print(_))

//this takes two params

val sum1 = List(1,2,3,4).reduceLeft((a,b) => a + b)
//this is equivalent as above
val sum2 = List(1,2,3,4).reduceLeft(_+_)

//reverse a list
List(1,2,3,4).reverse

val g = List(1,2,3)
g.::("4")
g:::List(4,5,6
)

var sb = new StringBuilder()
g.addString(sb)


//select an element from list; zero indexed

g.apply(2)

g.contains(4)

var arr = Array(0,0,0,0,0,0,0,0,0,0,0,0,0)
g.copyToArray(arr,2,3)
arr

//distinct
val j = List(1,4,1,3,2,1)

j.distinct

j.drop(2)

j.dropRight(2)


var  m = List(1,3,5,4,2)
m.dropWhile(x  => { x % 2 != 0})

m.exists(x => {x % 2 == 0})
m.filter(x => { x % 2 == 0})

//applies the function to every element of the list
m.map( x => x * x)

m.mkString
m.mkString("|")





