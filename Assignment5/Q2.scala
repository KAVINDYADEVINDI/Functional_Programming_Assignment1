
object Q2 extends App {
  val x= new Rational(3,4)
  val y= new Rational(5,8)
  val z= new Rational(2,7)
  
  println("x="+x+" ,y=" +y+" ,z="+z)
  val ans= x.sub(y).sub(z) 	 //call sub function
  println("x-y-z = "+ans)
}
class Rational(n:Int,d:Int){
  require(d>0,"d must be greater than 0 ")//predefined function
  def numer=n/gcd(n,d);
  def denom=d/gcd(n,d);
  
  def this(n:Int)=this(n,1)// constructor
  
  private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)//abstraction

  def sub(r: Rational) =new Rational((this.numer * r.denom)- (r.numer * this.denom),
  this.denom * r.denom)	//substraction function
  
  override def toString=numer+"/"+denom
}