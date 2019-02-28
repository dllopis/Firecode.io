package solutions;

public class Pow {

	public static double pow(double x, int n) {
	    
	    double result = 1;
	    
	    if(n == 0)
	        return 1;
	    else    {
	        if(n < 0)   {
	            for(int i = 0;i<Math.abs(n);i++)    {
	                result *= 1/x;
	            }
	        }else   {
	            for(int i = 0;i<n;i++)  {
	                result *= x;
	            }
	        }
	        return result;
	    }
	}
	
	public static void main(String[] args) {
		int base = 2;
		int power = -1;
		
		System.out.println(pow(base,power));

	}

}
