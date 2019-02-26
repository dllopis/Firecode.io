package level2;

import java.util.HashMap;

public class StringCompression {

	public static String compressString(String text) {
		
	    HashMap<Character,Integer> map = new HashMap<>();
	    String result = "";
	    
	    for(int i = 0;i<text.length();i++)  {
	        if(map.containsKey(text.charAt(i))) {
	            map.put(text.charAt(i),map.get(text.charAt(i)) + 1);
	        }else
	            map.put(text.charAt(i), 1);
	    }
	    
	    System.out.println(map.entrySet());
	    
	    for(Character c :  map.keySet())	{
	    	if(map.get(c) > 1)	{
	    		result += c;
	    		result += map.get(c);
	    	}	else	{
	    		result += c;
	    	}
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		String text = "aaaabbbbbc";
		System.out.println(compressString(text));

	}

}
