//Functions

def transformInt(x:Int, f: Int => Int ) :Int ={
  f(x)
}

def cubeIt(x: Int) :Int ={ x * x * x}

def squareIt(x:Int): Int = { x * x }

val result = transformInt(2, cubeIt)

println(result)


transformInt(3, x => x * x * x)