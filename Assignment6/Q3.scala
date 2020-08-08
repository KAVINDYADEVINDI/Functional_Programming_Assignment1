object Q3 extends App {
   println("Enter the value of (x,y) in point 1: ")
  val Array(a1,b1) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  
  println("Enter the value of (x,y) in point 2: ")
  val Array(a2,b2) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  
  val p1= point(a1,b1);
  val p2= point(a2,b2);
   
  println("Distance between point1 & point2= "+(p1-p2))
  println(" Answer format: point(distance of x, distance of y)")// return point(distance of x, distance of y)
  
}

case class point(x:Int,y:Int){
   def -(P:point)=
     if(this.x>P.x && this.y>P.y)
     {
       point(this.x-P.x , this.y-P.y)
     }
     else if(this.x<P.x && this.y>P.y)
     {
       point(P.x-this.x, this.y-P.y)
     }
     else if(this.x<P.x && this.y<P.y)
     {
       point(P.x-this.x, P.y-this.y)
     }
     else if(this.x>P.x && this.y<P.y)
     {
       point(this.x-P.x, P.y-this.y)
     }
}