object Q2 extends App {
 
  val p1= point(3,4);
  println("point = "+p1)
  
  println("Enter the value of (x,y) that you want to move: ")
  val Array(dx,dy) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
  
  val p2= p1.move(dx,dy)
  println("Moving point = "+p2)
  
}

case class point(x:Int,y:Int){
   def move(dx:Int,dy:Int)=point(this.x+dx,this.y+dy)
}