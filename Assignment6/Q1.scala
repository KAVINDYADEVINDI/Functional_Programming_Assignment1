object Q1 extends App {
  
  println("Enter the value of (x,y) in point 1: ")
  val Array(a1,b1) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  
  println("Enter the value of (x,y) in point 2: ")
  val Array(a2,b2) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  
  val p1= point(a1,b1);  
  val p2= point(a2,b2);
   
  println("Adding point="+(p1+p2))
  
}

case class point(x:Int,y:Int){
   def +(P:point)=point(this.x+P.x , this.y+P.y)
}