package testspace;

public class powerN {
	
	public static int getpowerN(int base, int n) {
		  if (base == 1){
		    return 1;
		  }
		  if (n == 1){
		    return base;
		  }
		  return base*=getpowerN(base,n-1);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getpowerN(2,5));
	}

}
