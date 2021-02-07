import jdk.jshell.execution.Util
//DataStrcutures

//Tuples
//Immutable Lists

val dishes = ("corn", "spinach" ,"noodles")

println(dishes)

println(dishes._1)

//keyvalue pair

val menu = "veg" -> "corn"

println(menu._2)


//Lists
//cannot hold more than one type
//zero based

val osList = List("Win10", "WinXP","Win8")

println(osList(0))

println(osList.head)
println(osList.tail)

for(ver <- osList) {println(ver )}

val backwardsList = osList.map( (ver:String) => {ver.reverse})

for(ver <- backwardsList) {println(ver  )}

//reduce() to combine together all items in a collection using some function
val numberList = List(1,2,3,4,5)
val sum = numberList.reduce( (x:Int, y:Int) => { x + y } )

//filter
val iHateFives = numberList.filter((x:Int) => { x != 5} )

// _ is a placeholder for every element of the list
val iHateThrees = numberList.filter(( _ != 3   ))


//concatenate list

val moreNumbers = List(6,7,8)
val lotsOfNumbers = numberList ++ moreNumbers


// dictionaries DS
// called MAPS in Scala
//datatypes needs to be same

val shipList = Map("Picard" -> "Enterprise", "Kirk" -> "EnterPrise-D")

println(shipList("Picard"))

//missing keys handling
println(shipList.contains("Archer"))

val archersShip = util.Try(shipList("Archer")) getOrElse("Unkown")
println(archersShip )










