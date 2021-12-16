package queue;

//Demonstration of Circular Queue

public class CircularQueue 
{
	int[] queue = new int[5] ;  // taking 5 as array size
	int size = 0;  // size of queue
	int front ;  // first element of queue
	int last ;   // last element of queue
	
	public void enQueue(int data)
	{
		if(!isFull())
		{
		queue[last] = data ;     // adding element in queue
		last = (last+1) % 5 ;    // after every 5 iteration last will be back to its original position
		size++ ;			     // size is now increased by 1
		}
		else
			throw new RuntimeException("Queue is full") ;
	}
	public int deQueue()   // removes queue element and returns
	{
		int data = queue[front];     // data is the element to be removed
		if(!isEmpty())
		{
		front = (front+1) % 5   ;   // after every 5 iteration front will be back to its original position
		size-- ; 
		}
		else
			throw new RuntimeException("Queue is Empty") ;
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
			System.out.print(queue[(front+i)%5] + " ");
		}
		System.out.println();
	}

}
