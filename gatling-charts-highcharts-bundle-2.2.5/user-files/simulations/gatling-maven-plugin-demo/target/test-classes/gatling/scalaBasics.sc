import java.awt.Event

import io.gatling.http.referer.RefererHandling

import scala.concurrent.duration._

val duration = 5 seconds

//define function
def addOne(i: Int): Int = {
  i + 1
}
addOne(20)

//another way to define it
def addOne2(i: Int) = i + 1
addOne2(30)

//val as a function
val addOne3: Int => Int = (i: Int) => i + 1
addOne3(40)

//same shit # way to write
val addOne4: Int => Int = i => i + 1

//same shit # way to write
val addOne5: Int => Int = _ + 1

//Multiline
val text = """line 1
    line 2
    line 3
  """
//Strip margin remove all spaces
val text2 =
  """line1
    |line2
    |line3
  """.stripMargin

val string1 = "Hello"
val string2 = "bar"
val text3 = s"$string1 $string2"

val text4 =
  s"""$string1
     |$string2
   """.stripMargin

//standard for loop
for (i <- 0 to 9) {
  println(i)
}

//compacted loop
for (i <- 0 to 9) yield i

//if else
def evenOrOdd(number: Int): String =
  if (number % 2 == 0)
    "even"
  else
    "odd"

evenOrOdd(3)

//List
val list = List(1,2)

//put 3 at the beginning
val list2 = 3 :: list
list2//no need to use println

//Tuple
val pair = (1,2)
val elt1 = pair._1
val elt2 = pair._2

val (elt11,elt12) = pair

//Map
val map = Map(("a",1),("b",2))

val map2 = Map("a" -> 1, "b" -> 2)

//Mutable collection
val arrayBuffer = collection.mutable.ArrayBuffer(1,2)
arrayBuffer += 3

//Looping
//With side effect
for (i <- List(1,2)) println(i)

//nested loop
for {
  i <- List(1,2)
  j <- List(3,4)
} println (i * j)

//filter in loop(condition)
for {
  i <- List(1,2) if i % 2 == 0
  j <- List(3,4)
} println (i*j)

//Without side effect
val results = for {
  i <- List(1,2) if i % 2 == 0
  j <- List(3,4)
} yield (i * j)
  println (results)

//Option list contenant une valeur ou zero valeur
// cest pourqoi pour récupérer la valeur il faut itérer
val opt1 = Option("foo")

val i: String = null
val opt2 = Option(i)

for {
  opt3 <- Some("foo")
} println(opt3)

def concat(opt1: Option[String], opt2: Option[String]): Option[String] =
  for {
    s1 <- opt1
    s2 <- opt2
  } yield (s1 + s2)

concat (Some("foo"), Some("bar"))
concat (Some("foo"), None)
concat (None, Some("bar"))
concat (None, None)



