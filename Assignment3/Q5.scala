
object Q5 {
  def main(args:Array[String])
  {
     println("Enter the number: ")
     var number=scala.io.StdIn.readInt()
     
     var ans=even(number-1)
     println("Addition of Even numbers less than "+number+": "+ans)
     
     
  }
  def even(n:Int):Int=
  {n match
    {
    case 1 =>0
    
    case n if(n%2==0) => (n+even(n-1))
    
    case _ =>0+even(n-1)
    }
 
  }
  
}