package linkedlist;

public class RunnerClass {

	public static void main(String[] args) 
	{
		Linkedlist  list = new Linkedlist();
		list.insertAtLast(10);
		list.insertAtLast(20);
		list.insertAtLast(30);
		list.insertAtLast(40);
		list.insertAtLast(50);
		list.show();
		
		list.insertAtStart(33);
		System.out.println("\n new linked list after insert at start:");
		list.show();
		
		list.insertAtIndex(2, 66);
		list.insertAtIndex(3, 77);
		System.out.println("\n new linked list after insert at given index:");
		list.show();
		
		list.deleteAtIndex(3);
		list.deleteAtIndex(5);
		System.out.println("\n new list after delete is:");
		list.show();
		

	}

}
