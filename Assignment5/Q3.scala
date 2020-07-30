
object Q3 extends App {
  
  class account(id:String,account:Int,blc:Double)
  {
    val NIC:String=id;
    val accountNumber:Int=account;
    var balance:Double=blc;

    
    def transfer(toAccount:account,value:Double)
    {
      if(balance>value)
	{
	this.balance=this.balance-value;  //account balance of the sender  is decreased 
      	toAccount.balance=toAccount.balance+value;
	}
	else
	{
	println("Your account balnce is not sufficient.");
	}
      
    }
     override def toString ="["+NIC+":"+accountNumber +":"+ balance+"]"
  }
  
  var account1=new account("9732810",1005000,10000);
  var account2=new account("9732811",1006000,5000);
  var value=5000;
  account1.transfer(account2, value);
  println("----------bank tranfer---------");
  println();
  println("Your balance :"+account1.balance);
  println("You transfered  "+value+ " to "+account2.accountNumber);
  
  
}

