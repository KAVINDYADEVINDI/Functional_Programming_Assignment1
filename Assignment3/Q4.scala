
object Q4 {
  def main(args:Array[String])
  {
     println("Enter the number to find odd or even: ")
     var number=scala.io.StdIn.readInt()
     
     if(odd_even(number))
     {
       println(number+" is even number")
     }
     else
     {
      println(number+" is odd number")
     }
      
  }
  def odd_even(n:Int):Boolean=
  { n  match
    {
    case 0 =>true //base case
    
    case 1 => false
    
    case n if(n<0)=>odd_even(-n)
    
    case _ =>odd_even(n-2)
    }
  }
  
}