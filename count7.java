package testspace;

public class count7 {
	
	public static int getcount7(int n) {
		  int count = 0;
		  if (n == 0){
		    return 0;
		  }
		  if ( n % 10 == 7){
			  getcount7(n/10);
		    count++;
		  }
		  return count + getcount7(n/10);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getcount7(778727));
	}

}
