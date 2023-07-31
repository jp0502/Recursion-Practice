package testspace;

public class Fibonacci {
	public int fibonacci(int n) {
		  if (n == 0){
		    return 0;
		  }
		  
		  if (n == 1){
		    return 1;
		  }
		  
		  else {
		      return fibonacci(n-1) + fibonacci(n-2);
		      // if n = 6:
		      
		      // call stacks:
		      // fibbonacci(5) + fibonacci(4)
		      // fibonacci (5) + fibonacci(4) + fibonacci(3) + fibonacci(2)
		      // fibonacci (5) + fibonacci(4) + fibonacci(3) + fibonacci(2) + fibonacci(1) + fibonacci(0)
		      
		      // calls being fulfilled: 
		      // fibonacci (5) + fibonacci(4) + fibonacci(3) + fibonacci(2) + fibonacci(1) + 0
		      // fibonacci (5) + fibonacci(4) + fibonacci(3) + fibonacci(2) + 1 + 0
		      // fibonacci (5) + fibonacci(4) + fibonacci(3) + 1 + 1 + 0
		      // fibonacci (5) + fibonacci(4) + 2 + 1 + 1 + 0
		      // fibonacci (5) + 3 + 2 + 1 + 1 + 0
		      // 5 + 3 + 2 + 1 + 1 + 0
		      


		  }
		}

}
