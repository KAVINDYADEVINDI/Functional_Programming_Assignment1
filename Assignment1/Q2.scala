
object Q2 {
  	def main(args:Array[String])
  	{
    		println("--------------The Volume Of Sphere----------- ")
    		println("Enter radius of sphere: ")
  		var r=scala.io.StdIn.readFloat()
  		var V=volume(r)
   		println("Volume of sphere with "+r+" radius = "+V)
  	}
  	def volume(r:Float):Float=
 	{
    		val pi=3.14  //pi is constant value
  		var V=(4*pi*r*r*r)/3
  		var ans=V.toFloat
    		return ans
  	}
}