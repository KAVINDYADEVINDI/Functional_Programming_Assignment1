
object Q3 {
  def main(args:Array[String])
  {
     println("Enter the number: ")
     var number=scala.io.StdIn.readInt()
     
     var ans=sum(number)
     println("Sum("+number+") = "+ans)
      
  }
  def sum(n:Int):Int=
  { n  match
    {
    case 1 =>1 //base case
    
    case _ => n+sum(n-1)
    }
  }
  
}