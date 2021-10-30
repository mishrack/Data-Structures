package linkedlist;

// Main class to run Singly linked list demo program

public class RunnerClass {

	public static void main(String[] args) 
	{
		Linkedlist  list = new Linkedlist();  // create new object 
		list.insertAtLast(10);  // add node in linked list object
		list.insertAtLast(20);
		list.insertAtLast(30);
		list.insertAtLast(40);
		list.insertAtLast(50);
		list.show();           // display linkedlist elements
		
		list.insertAtStart(33);  // insert at start of linked list
		System.out.println("\n new linked list after insert at start:");
		list.show();
		
		list.insertAtIndex(2, 66);   // insert at given index
		list.insertAtIndex(3, 77);
		System.out.println("\n new linked list after insert at given index:");
		list.show();
		
		list.deleteAtIndex(3);   // delete element from a given index
		list.deleteAtIndex(5);
		System.out.println("\n new list after delete is:");
		list.show();
		

	}

}
