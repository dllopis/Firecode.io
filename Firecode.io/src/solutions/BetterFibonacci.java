package solutions;

public class BetterFibonacci {

	public static int betterFibonacci(int n) {
		
	    int b = 0;
	    int a = 1;
	    int sum = 0;
	    for(int i = 1; i <= n; i++) {
	      sum = a + b;
	      b = a;
	      a = sum;
	    }
	    return sum;
	  }
	
	public static void main(String[] args) {
		int n = 1;
		System.out.println(betterFibonacci(1));

	}

}
