package level2;

import java.util.HashMap;

public class Anagram {

	public static boolean isAnagram(String input1, String input2) {
	    HashMap<Character,Integer> map = new HashMap<>();
	    
	    for(int i = 0;i<input1.length();i++)  {
	        if(map.containsKey(input1.charAt(i)))    {
	            map.put(input1.charAt(i),map.get(input1.charAt(i)) + 1);
	        }else
	            map.put(input1.charAt(i),1);
	    }
	    for(int i = 0;i<input2.length();i++)  {
	        if(!map.containsKey(input2.charAt(i)))
	            return false;
	        map.put(input2.charAt(i),map.get(input2.charAt(i)) - 1);
	        if(map.get(input2.charAt(i)) < 0)
	            return false;
	    }
	    return true;
	}
	
	public static boolean fireIOsolution(String input1, String input2) {
	    if(input1 == null || input2 == null || (input1.length() != input2.length())){
	        return false;
	    } else {
	        int[] buffer = new int[26];
	        for(int i=0; i < input1.length(); i++){
	            buffer[input1.charAt(i) - 'a']++;
	            buffer[input2.charAt(i) - 'a']--;
	        }
	        for(int j=0; j < buffer.length; j++){
	            if(buffer[j] != 0) return false;
	        }
	        return true;
	    }
	}
	
	public static void main(String[] args) {
		String a = "joeyjoey";
		String b = "marymary";
		
		System.out.println("Anagram? : " + isAnagram(a,b));

	}

}
