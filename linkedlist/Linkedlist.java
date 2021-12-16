package linkedlist;

public class Linkedlist
{
	Node head ;
	
	public void insertAtLast(int value)
	{
		Node new_node = new Node() ; // create new node object
		new_node.data = value  ;
		new_node.next = null ;
		
		if(head == null)  // if head is null make new node as head of linkedlist
		{
			head = new_node ;
		}
		else
		{
			Node temp = head ;  // temp node for travesing linked list
			while(temp.next != null )
			{
				temp = temp.next ;
			}
			 temp.next = new_node ;   // after reaching last node, pass the reference of new node to last node
			
		}
	}
	
	public void insertAtStart(int value)
	{
		Node new_node = new Node() ; // create new node object
		new_node.data = value  ;
		new_node.next = null ;
		
		new_node.next = head ;  // pass reference present in head node to first inserted node
		head = new_node ;   // make first node as head now
	}
	
	public void insertAtIndex(int index , int value)
	{
		Node new_node = new Node() ; // create new node object
		new_node.data = value  ;
		new_node.next = null ;
		
		if(index == 0)
		{
			insertAtStart(value) ;
		}
		else
		{
			Node temp = head ;
			for(int i =0 ; i < index-1 ;i++)
			{
				temp = temp.next ;
			}
			new_node.next = temp.next ;
			temp.next = new_node ;
		}
	}
	
	public void deleteAtIndex(int index)
	{
		if(index == 0)  // if we want to delete the first element
		{
			head = head.next ;  // make the reference in head as the next node 
		}
		else
		{
			Node n = head ;
			Node n1 = null ;
			for(int i =0 ; i < index -1 ; i++)
			{
				n= n.next  ;
			}
			n1 = n.next  ;     // pass the reference of element to be deleted in n1
			n.next = n1.next ;  // now what's n1 next reference pass that reference to n.next
			n1 = null ;        // making reference of n1 as null , available for GC
		}
	}
	
	public void show()   // display elements of the linked list
	{
		Node n = head ;
		System.out.print("[ ");
		while(n.next != null)
		{
			System.out.print( n.data + " ");
			n = n.next ;
		}
		System.out.print(n.data );   // to print value of last node whose next value is null
		System.out.print(" ]");
	}

}
