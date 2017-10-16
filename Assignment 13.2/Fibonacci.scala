

object Fibonacci {
 
  
  //by using loop
  def fibonacci_by_forloop(n : Int,nth:Int) :Unit = {
    var result = "1"
    
    if(n<2){
      println(n)
    }
    
    
    else{
      var temp :BigInt = 0
      var no1:BigInt = 0
      var no2:BigInt =1
      for(i <- 1 until n){
        temp = no1+no2
        no1 = no2
        no2 = temp
        result= result + temp
      }
      
      println(s"The Fibonacci series is : "+ result)
      println(s"The digit at $nth position of series is : "+result.charAt(nth-1).toChar)
    }
    
    
  }
  
  //method used to print fibo series with the recursion
  def fibonacci_by_recursion(x:Int,nth:Int):Unit = {
    var result = "1"
    
    def recursion(x:Int ,prev :BigInt=0,next :BigInt = 1):Unit= x match {
      case 0 => prev
      case 1 => next
      case _ =>
        result = result + (next+prev)
        recursion(x - 1 ,next,next+prev) //recursive call 
      
       
    }
    recursion(x) //first call
    println(s"\nwhen we use reccursion : ")
    println(s"The Fibonacci series is: "+ result)
    println(s"The digit at place $nth of the above Fibonacci series : "+result.charAt(nth-1).toChar)
  }
  
  
  //main 
  def main(args:Array[String]):Unit = {
    
    
    println("\nEnter the no of digits for the Fibonacci Series:")
    var digits:Int = readInt()
    
    println("Enter the position to be found in the fibonacci series:")
    var nth:Int = readInt()
    
    fibonacci_by_forloop(digits,nth) // loop method called
    fibonacci_by_recursion(digits,nth) //recursive method called
    
  }
  
  
}
