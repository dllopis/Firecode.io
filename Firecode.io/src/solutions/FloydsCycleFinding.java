package solutions;

public class FloydsCycleFinding {

	public static boolean isCycle(ListNode head)	{
		
		ListNode slow = head, fast = head;
		  
		while(slow != null && fast !=null) {
		    // Slow move 1 node
		    slow = slow.next;
		    
		    // Fast moves 2 nodes
		    if(fast.next != null) {
		    	fast = fast.next.next;
		    } else {
		    	break;
		    }
		    //if slow and fast meet, then there is a loop
		    if(slow == fast) { 
		    	return true;
		    }
		  }           
		return false;
	} 
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		
		head.next = n2;
		n2.next = n3;
		n3.next = head;
		
		System.out.println("Is Cycle? : " + isCycle(head));
	}

}
