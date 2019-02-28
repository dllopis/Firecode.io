package solutions;

import java.util.HashMap;

/*
 * Check if two strings are permutations of one another
 * Example: "CAT" and "ACT" yields true
 * Example" "HELLO" and "ALOHA" yields false
 *
 */
public class Permutations {
	
	public static boolean permutation(String str1, String str2) {
		//Check edge cases
		if(str1 == null || str2 == null || str1.length() != str2.length())
			return false;
		// no need to apply algorithm; inputs are the same
		if(str1 == str2)
			return true;
		
		// convert to avoid case issues
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		// map will store all the character from first input
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i = 0;i<str1.length();i++)	{
			if(map.containsKey(str1.charAt(i)))	{
				map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
			}else
				map.put(str1.charAt(i),1);
		}
		
/*		check each character from second input with the map
		if it exist, we decrement the frequency(value) and check to see if it is less than zero
		which means that it is not a permutation (character frequency is greater than first input)*/
		
		for(int i = 0;i<str2.length();i++)	{
			if(!map.containsKey(str2.charAt(i)))
				return false;
			else if(map.containsKey(str2.charAt(i)))	{
				map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
				if(map.get(str2.charAt(i)) < 0)
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String a = "empty";
		String b = null;
		
		String c = "Cat";
		String d = "tac";
		
		String e = "same";
		String f = "same";
		
		System.out.println("Input 1: " + a + "\t" + "Input 2: " + b);
		System.out.println(permutation(a,b) + "\n");
		
		System.out.println("Input 1: " + c + "\t" + "Input 2: " + d);
		System.out.println(permutation(c,d)+ "\n");
		
		System.out.println("Input 1: " + e + "\t" + "Input 2: " + f);
		System.out.println(permutation(e,f)+ "\n");
	}

}
