package queue;

// Demonstration of Linear Queue using array of fixed size
// Linear queue has some problem which were resolved using circular queue
public class QueueDemo 
{
	int[] queue = new int[5] ;  // taking 5 as array size
	int size = 0;  // size of queue
	int front ;  // first element of queue
	int last ;   // last element of queue
	
	public void enQueue(int data)
	{
		queue[last] = data ;  // adding element in queue
		last++ ;              // 1 member is added therefore last is moved
		size++ ;			  // size is now increased by 1
	}
	public int deQueue()   // removes queue element and returns
	{
		int data = queue[front];   // data is the element to be removed
		front++ ;
		size-- ;
		return data ;
	}
  public int getSize()
	{
		return size ;
	}
	public boolean isEmpty()
	{
		return getSize() == 0;
	}
	public boolean isFull()
	{
		return getSize() == 5;
	}
	public void show()
	{
		System.out.print("Elements : ");
		for(int i=0 ;i< size; i++)
		{
			System.out.print(queue[front+i] + " ");
		}
		System.out.println();
	}
	
}
