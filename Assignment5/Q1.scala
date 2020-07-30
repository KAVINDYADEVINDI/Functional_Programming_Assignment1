object Q1 extends App {
  val r1= new Rational(3,4)
  
  println(r1)
  println("Negative Rational Number is "+r1.neg)
}
class Rational(n:Int,d:Int){
  require(d>0,"d must be greater than 0 ")//predefined function
  def numer=n/gcd(n,d);
  def denom=d/gcd(n,d);
  
  def this(n:Int)=this(n,1)// constructor
  
  private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)//abstraction

  
  def neg=new Rational(-this.numer,this.denom)//calculate negative rational number method
  
  override def toString=numer+"/"+denom
}