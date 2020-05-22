object Q1 {
 	def main(args:Array[String])
 	{
 		   println("--------------Convert celcius(°C) temperature in to fahrenheit(°F)----------- ")
   		   println("Enter temperature in celcius(°C) : ")
    		   var C=scala.io.StdIn.readFloat()
    		   var F=temp(C)
    		   println(C+" °C = "+F+" °F")
  	}
  	def temp(C:Float):Float=
  	{
    		    var fahrenheit=(C *1.8000)+32.00
  	                       var ans=fahrenheit.toFloat
    		    return ans
  	}
}