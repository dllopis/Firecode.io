package solutions;

public class InsertAtPosition {

	public static ListNode insertAtPosition(ListNode head, int data, int pos) {
		
		if(head == null)	{
			return new ListNode(data);
		}
		
		ListNode newNode = new ListNode(data);
		
		if(pos == 1)	{
			newNode.next = head;
			head = newNode;
			return head;
		}
		
		ListNode current = head;
		ListNode previous = head;
		int count = 0;
		
		while(current != null)	{
			count++;
			
			if(count == pos)	{
				previous.next = newNode;
				newNode.next = current;
				break;
			}

			previous = current;
			current = current.next;
		}
		System.out.println("count: " + count);
		if(pos > count)
			previous.next = newNode;
		return head;
	}
	public static void displayList(ListNode node)	{
		
		while(node != null)	{
			System.out.print(node.data + " ");
			node = node.next;
		}System.out.println("");
	}
	public static void main(String[] args) {
		ListNode head = new ListNode(9);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(3);
		
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		ListNode solution = insertAtPosition(head,8,6);
		displayList(solution);
	}

}
