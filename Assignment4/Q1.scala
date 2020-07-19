
object Q1 extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  
  val Encrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size);
  val Decrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size);
  
  val cipher=(algo :(Char,Int,String)=>Char, s:String, key:Int, a:String)=>s.map(algo(_,key,a));
  
  //enter your text that want to be encrypted
  println("Enter the text : ");
  var txt: String= scala.io.StdIn.readLine();
  
  //call encrypt function
  val ct=cipher(Encrypt, txt ,5 , alphabet);//character shifting by 5
  println("Encrypt text : "+ct);
  
  //call decrypt function
  val cp=cipher(Decrypt, ct ,5 , alphabet);
  println("Decrypt text : "+cp);
  //print decrypt text
  
}