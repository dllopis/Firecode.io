package solutions;

public class InsertPairStar {

	/*
	 * Recursive approach to problem -- Firecode.io solution -- Not mine
	 */
	public static String insertPairStar(String s) {
		if(s == null)
			return null;
	    if(s.length() <= 1)
	    	return s;
	    
	    if(s.substring(0, 1).equals(s.substring(1,2)))	{
	    	return s.substring(0,1) + "*" + insertPairStar(s.substring(1,s.length()));
	    }
		return s.substring(0,1) + insertPairStar(s.substring(1,s.length()));
	}
	
	/*
	 * Iterative approach to problem -- My solution
	 */
	public static String insertPairStar2(String b)	{
		if(b == null)
			return null;
		if(b.length() == 1)
			return b;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<b.length()-1;i++)	{
			// match is found add first character and a * to string builder
			if(b.charAt(i) == b.charAt(i+1))
				sb.append(b.charAt(i) + "*");
			else
				sb.append(b.charAt(i));	// match not found add character to SB
		}sb.append(b.charAt(b.length()-1)); // last character must be added
		
		return sb.toString();
	}
	/* -- Not mine --
	 * solution found after challenge was completed
	 * shows a nice use of string builder with recursion
	 */
	public static String insertPairStar3(String s) {
	    if (s == null || s.length() < 2) return s;
	    
	    StringBuilder front = new StringBuilder(s.substring(0,2));
	    
	    if (front.charAt(0) == front.charAt(1)) {
	        front.insert(1, '*');
	        return front.deleteCharAt(2).append(insertPairStar(s.substring(1))).toString();
	    }
	    return front.deleteCharAt(1).append(insertPairStar(s.substring(1))).toString();
	}
	
	public static void main(String[] args) {
		
		String a = "cacaaacccbbedeea";
		String b = "ccacccaabeeeeed";
		
		System.out.println("Recursive approach result: " + insertPairStar(a));
		System.out.println("Iterative approach result: " + insertPairStar2(b));
	}
}
