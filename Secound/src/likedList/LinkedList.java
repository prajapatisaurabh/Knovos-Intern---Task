package likedList;


// implement singly linkedList
public class LinkedList {
	
	Node head; // Head of List
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next = null;
		}
	}
	
	
	// Insert A Node
	public static LinkedList insert(LinkedList ls ,int data) {
	
		Node new_node = new  Node(data);
		new_node.next= null;
		
		if (ls.head == null) {
			ls.head = new_node;
		}else {
			Node last = ls.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		
		return ls;
	}
	
	// Print List
	public static void printList(LinkedList ls) {
		Node currentNode = ls.head;
		System.out.print("Linked List :- [ ");
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			
			currentNode = currentNode.next;
		}
		
		System.out.println("] \n");
		
		
	}
	
	// Delete By Key
	public static LinkedList deleteByKey(LinkedList ls , int key) {
		Node current_node = ls.head;
		Node prev = null;
		
		
		// case 1: If Head Node it self Hold Key
		
		if (current_node != null && current_node.data == key ) {
			ls.head = current_node.next;
			
			System.out.println("Delete key is :- " + key);
			
			return ls;
		}
		
		// Case 2 : If key is other then someWhere other then head
		
		while(current_node != null && current_node.data != key) {
			prev = current_node;
			current_node = current_node.next;
		}
		
		if (current_node != null) {
			prev.next = current_node.next;
			
			System.out.println("Delete key is :- " + key);
			
		}
		
		if (current_node == null) {
			System.out.println("Key is Not Fount");
		}
		
		return ls;
	}
	
	
	public static LinkedList  deleteAtPosition(LinkedList ls , int index) {
		
		Node current_node = ls.head , prev = null;
		
		// case 1 : if index is 0 then head node itself to be deleted
		
		if (index == 0 && current_node != null) {
			ls.head = current_node.next;
			
			System.out.println(index + " -: Position element deleted ");
			
			return ls;
		}
		
		// case 2 : if index is greter then 0 but less then size of linked list
		
		int counter = 0;
		
		while(current_node != null) {
				if (counter == index) {
					prev.next = current_node.next;

					System.out.println(index + " -: Position element deleted ");
					break;
				}else {
					prev = current_node;
					current_node = current_node.next;
					counter++;
				}
		}
		
		if (current_node == null) {
			System.out.println("Not Fount index");
		}
		
		
			
		
		return ls;
	}
	
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list = list.insert(list, 5);
		list = list.insert(list, 6);
		list = list.insert(list, 7);
		list = list.insert(list, 8);
		
		printList(list);
		
	//	deleteByKey(list, 88);
		deleteAtPosition(list, 2);
		printList(list);
	}

}
