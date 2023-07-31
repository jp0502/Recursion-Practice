package testspace;


public class bunnyEars {
	
	public static int getears(int bunnies) {
		  
		  if (bunnies == 0){
		    return 0;
		  }
		  
		  if (bunnies == 1){
		    return 2;
		  }
		  
		  else {
		    return 2 + getears(bunnies-1);
		    // if bunnies = 5:
		    // 2 + bunnyEars(5-1) + bunnyEars(4-1) +  bunnyEars(3-1) +  bunnyEars(2-1) + bunnyEars(1-1)
		    // 2 + bunnyEars(5-1) + bunnyEars(4-1) +  bunnyEars(3-1) +  bunnyEars(2-1) + 0  
		    // 2 + bunnyEars(5-1) + bunnyEars(4-1) +  bunnyEars(3-1) +  1 + 0  
		    // 2 + bunnyEars(5-1) + bunnyEars(4-1) +  2 +  2 + 0  
		    // 2 + bunnyEars(5-1) + 2 +  2 +  2 + 0  
		    // 2 + 2 + 2 +  2 +  2 + 0  

		  }
	}
		
	public static void main(String[] args) {
		System.out.println(getears(10));
	}
}
		



