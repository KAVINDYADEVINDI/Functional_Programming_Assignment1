
object Q3 {
  	def main(args:Array[String])
  	{
   		 println("--------------Total Wholesale cost of 60 copies----------- ")
    
  		 var cover:Double=24.95D                      //cover price a copy
   		 println("Cover price of a book             :Rs. "+cover)
    
    		 var disc=(24.95*40)/100                         //discount of a copy
    		 println("discount of a book                :Rs. "+disc)
    
    		 var cover_cost=24.95-disc                       //cover cost of a copy
   		 println("Cover cost of a book              :Rs. "+f"$cover_cost%1.2f")
    
    		 var cover_cost_60=(24.95-disc)*60        //cover cost of 60 copies
   		 println("Cover cost of 60 copies           :Rs. "+f"$cover_cost_60%1.2f")
    
   		 var shipping_cost=3+(10*0.75)      //shipping cost
   		 println("Shipping cost of 60 copies        :Rs. "+shipping_cost) 
    
    		 var total=(cover_cost*60)+shipping_cost      //total cost of 60 copies
    
    		 println("Total Wholesale cost of 60 copies :Rs. "+f"$total%1.2f")
  	}
  
}