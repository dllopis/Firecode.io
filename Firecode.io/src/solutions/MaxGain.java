package solutions;

public class MaxGain {

	public static int maxGain(int[] a) {
		
		if(a == null || a.length < 2)
	        return 0;
		
		int gain = 0;
	    int currentMax = 0;
	    int currentMin = a[0];
	    int indexMin = 0;
	    
	    for(int i = 1;i<a.length;i++)	{
	    	if(a[i] <= currentMin && i <= indexMin)	{
	    		currentMin = a[i];
	    		indexMin = i;
	    	}
	    	if(a[i] >= currentMax &&  i > indexMin)
	    		currentMax = a[i];
	    	
	    	if((currentMax - currentMin) > gain)
	    		gain = currentMax - currentMin;
	    }
	    return gain;
	}
	
	public static void main(String[] args) {
		int[] a = {100,40,20,10};
		int[] b = {0,50,10,100,30};
		int[] c = {1,1};
		int[] d = {0,100,0,100,0,100};
		int[] e = null;
		
		System.out.println(maxGain(a));
		System.out.println(maxGain(b));
		System.out.println(maxGain(c));
		System.out.println(maxGain(d));
		System.out.println(maxGain(e));
	}
}
