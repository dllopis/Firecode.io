package level2;

public class BinaryRepresentation {

	public static String computeBinary(int val) {
		if(val == 0)
			return "0";
		
		StringBuilder sb = new StringBuilder();
		
		while(val > 0)	{
			sb.append(val % 2);
			val = val/2;
			//val >>= 1; // the same as above line
		}
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		String result = computeBinary(5);
		System.out.println(result);
	}

}
