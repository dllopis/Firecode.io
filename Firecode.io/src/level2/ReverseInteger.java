package level2;

public class ReverseInteger {

	public static void main(String[] args) {
		int n = -999992232;
		System.out.println(reverse2(n));
	}
	// uses heap space because of string objects - not ideal - Note: use stringbuilder!
    public static int reverse(int x)  {
 
    	try {

    	    boolean isNeg = false;
    		if(x < 0)
    			isNeg = true;
    	    String s = "";
    	    String reversed = "";
    	    s += x;
    	    
    	    if(!isNeg)	{
	    	    for(int i = s.length()-1;i>=0;i--)	{
	    	    	reversed += s.charAt(i);
	    	    }
	    	  long check = Long.parseLong(reversed);
	    	  
	    	  if(check > Integer.MAX_VALUE)
	    		  return 0;
	    	  else
	    	    return Integer.parseInt(reversed);
    	    }	
    	    else	{
	    	    		for(int i = s.length()-1;i>0;i--)	{
		    	    	reversed += s.charAt(i);
		    	    }
	    	    	long check = Long.parseLong(reversed);
	    	    	if(check > Integer.MAX_VALUE)
	    	    		return 0;
	    	    	else
	    	    		return -(Integer.parseInt(reversed));
	    		}
    	} catch(ArithmeticException e) {
    	    return 0;
    	}
    }
    
    // Optimal solution provided after challenge
    public static int reverse2(int n)	{
    	int rev = 0;
    	
    	while(n != 0)	{
    		rev = rev*10 + n%10;
    		n = n/10;
    	}
    	return rev;
    }
}