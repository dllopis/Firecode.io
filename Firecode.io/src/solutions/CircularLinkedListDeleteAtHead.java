package solutions;

public class CircularLinkedListDeleteAtHead {

	public static ListNode deleteAtHead(ListNode head) {        
	    if (head == null)
	        return null;
	    
	    ListNode curr = head;
	    
	    // Traverse to tail
	    while(curr.next != head) {
	        curr = curr.next;
	    }
	    
	    curr.next = head.next;        
	    head.next = null;
	    head = curr.next;
	    
	    return head;
	}
	public static void displayCycle(ListNode head,int count)	{

		System.out.print("Cycle running " + count + " times: ");
		
		while(count > 0)	{
			System.out.print(head.data + " ");
			head = head.next;
			count--;
		}System.out.println("\n");
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		
		head.next = n2;
		n2.next = n3;
		n3.next = head;
		
		System.out.println("Original: " + head.data);
		displayCycle(head,9);
		
		ListNode solution = deleteAtHead(head);
		System.out.println("Old head deleted. New head: " + solution.data);
		displayCycle(solution,10);
	}

}
