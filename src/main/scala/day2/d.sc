trait Base

class D1 extends Base
class D2 extends Base


// for all below examples
// refer The class hierarchy diagram from Odersky text-book
// notice types of all xs

def x = if(true) new D1 else new D2

def x1 = if(true) "asasd" else 2

def x2 = if(true) "asasd" else throw new RuntimeException

def x3 = if(true) 100 else throw new RuntimeException

def x4 = throw new RuntimeException
// Nothing is subtype of everything
// this does not mean it extends everything
// this is more of conceptual base at language level to help correct type inference

def s: String = "asasd"
def s1: String = null //still typechecks

def s2: String = null: Null

// def s3: Int = null: Null // this does not work
// null is not subtype of Int(AnyVal), its subtype of all AnyRef(String is AnyRef: java.lang.String)

// type-inference always checks for LEAST UPPER BOUND in the class hierarchy

def y: Unit = 1 // this is not type-casting, it is type-discarding

def y1: Any = 1 // Any is the topMost superclass
y1.asInstanceOf[Int]

val y3 = new Nothing