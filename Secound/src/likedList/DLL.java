package likedList;

public class DLL {

	Node head;

	class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
		}
	}

	// Push data to DLL

	public void push(int data) {
		Node new_node = new Node(data);

		new_node.next = head;
		new_node.prev = null;

		if (head != null) {
			head.prev = new_node;
		}

		head = new_node;

	}

	// Add a Node at the end of DLL

	void append(int data) {
		Node new_node = new Node(data);

		Node last = head;
		new_node.next = null;

		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}

		while (last.next != null)
			last = last.next;

		last.next = new_node;
		new_node.prev = last;

	}

	// Insert After given A Node

	public void insertAfter(Node prev_node, int new_data) {

		if (prev_node != null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}

		Node new_node = new Node(new_data);

		new_node.next = prev_node.next;

		prev_node.next = new_node;

		new_node.prev = prev_node;

		if (new_node.next != null)
			new_node.next.prev = new_node;

	}

	// print dll

	public void printList(Node node) {
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse  Direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args) {
		DLL dll = new DLL();
		dll.push(1);
		dll.push(2);
		dll.push(3);
		dll.push(4);
		dll.push(5);

		dll.printList(dll.head);

	}

}
