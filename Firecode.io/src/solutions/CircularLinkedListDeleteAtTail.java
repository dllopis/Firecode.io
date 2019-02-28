package solutions;

public class CircularLinkedListDeleteAtTail {
	
	public ListNode deleteAtTail(ListNode head) {
	    
		ListNode current = head;
		ListNode previous = head;
		
		while(current.next != head)	{
			previous = current;
			current = current.next;
		}
		
		previous.next = head;
	    current = null;
	        
	    return head;
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n1;
		
		int count = 0;
		ListNode current = n1;
		while(count != 3)	{
			System.out.println(current.data);
			current = current.next;
			count++;
		}
	}
}


