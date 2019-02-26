package level2;

import java.util.ArrayList;
import java.util.TreeMap;

public class IsomorphicStrings {

	public static boolean isIsomorphic(String input1, String input2) {
		
		if(input1.length() != input2.length())
			return false;
		System.out.println("Input 1: " + input1);
	    TreeMap<Character,Integer> map1 = addToMap(new TreeMap<>(), input1);
	    
	    System.out.println("Input 2: " + input2);
	    TreeMap<Character,Integer> map2 = addToMap(new TreeMap<>(), input2);

	    return new ArrayList<>( map1.values() ).equals(new ArrayList<>( map2.values() ));
	}
	
	private static TreeMap<Character, Integer> addToMap(TreeMap<Character,Integer> map, String input)	{
		for(int i = 0;i<input.length();i++)	{
	    	if(map.containsKey(input.charAt(i)))	{
	    		map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
	    	}else
	    		map.put(input.charAt(i), 1);
	    }System.out.println("Key-Value pairs: " + map.entrySet() + "\n");
		
		return map;
	}
	public static void main(String[] args) {
		System.out.println("Isomorphic Strings ? : " + isIsomorphic("css", "dll"));
	}

}
