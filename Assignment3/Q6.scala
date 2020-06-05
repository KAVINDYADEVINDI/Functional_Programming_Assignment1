
object Q6 {
  def main(args:Array[String])
  {
     println("Enter the number: ")
     var number=scala.io.StdIn.readInt()
     
     println("Fibonacci numbers are: ")
     var ans=fiboseq(number)
  }
  
  def fibo(n:Int):Int=
  {n match
    {
    case 0 =>0
    
    case n if(n==1) => 1
    
    case _ =>fibo(n-1)+fibo(n-2)
    }
  }
  
  def fiboseq(n:Int):Unit=
  {
    if(n>0) fiboseq(n-1)
    println(fibo(n))
  }
}