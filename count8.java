package testspace;

public class count8 {
	
	public static int getcount8(int n) {
		  int count = 0;
		  if (n == 0){
		    return 0;
		  }
		  if (n % 10 == 8){
		    if ((n/10) % 10 == 8){
		      count+=2;
		      getcount8(n/100);
		    }
		    else {
		      count++;
		      getcount8(n / 10);
		    }
		  }
		  return count+=getcount8(n/10);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getcount8(881888));
	}

}
