package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicatesFromList {

	public static ArrayList<String> removeDuplicates(List<String> input) {
	    TreeSet<String> set = new TreeSet<>();
	    
	    for(int i = 0;i<input.size();i++)	{
	    	set.add(input.get(i));
	    }
	    
	    return new ArrayList<String>(set);
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Hello");
		list.add("Hey");
		list.add("Hi");
		list.add("Hello");
		list.add("Hey");
		
		System.out.println("Original: " + list);
		System.out.println("No Duplicates and Lexicographical order: " + removeDuplicates(list));
	}

}
