
object Q1 {
  def main(args:Array[String])
  {
     println("Enter the number to find prime or not: ")
     var p_number=scala.io.StdIn.readInt()
     
     println(p_number+" is prime number: ")
     
     if(prime(p_number))
     {
       println("true")
     }
     else
     {
       println("false")
     }
     
  }
  def prime(num:Int, x:Int=2):Boolean=
  { x match
    {
    case x if(num==x)=>true
    
    case x if(gcd(num,x)>1)=>false
    
    case _ =>prime(num,x+1)
    }
  
  }
  
  def gcd(a:Int,b:Int):Int=
  {b match
    {
    case 0=>a
    case b if b>a =>gcd(b,a)
    case _ =>gcd(b,a%b)
    }
  }
}