package testspace;

public class bunnyEars2 {
	public static int getbunnyEars2(int bunnies) {
		  if (bunnies == 0){
		    return 0;
		  }
		  if (bunnies % 2 == 0){
		    return 3 + getbunnyEars2(bunnies-1);
		  }

		  return 2+getbunnyEars2(bunnies-1) ;
		}
	
	public static void main(String[] args) {
		System.out.println(getbunnyEars2(10));
	}
}	
