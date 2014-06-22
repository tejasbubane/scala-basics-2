// transform from java collections to Scala collections
// while using java libraries which return java objects

import java.util

val al = new util.ArrayList[Int]()
al.add(1)
al.add(2)
al.add(100)
al

import collection.JavaConverters._
val sl = al.asScala