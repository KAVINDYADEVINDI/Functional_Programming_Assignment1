object Q4 extends App {

  println("Enter the value of (x,y) that you want to inverted: ")
  val Array(a,b) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  
  val p1=point(a,b)
  val p2= p1.invert(a,b)
  println("Inverted point = "+p2)
  
}

case class point(x:Int,y:Int){
   def invert(x:Int,y:Int)=point(-this.x,-this.y)
}