package queue;

// Linear and Circular queue runner object are implemented in this class
public class QueueRunner {

	public static void main(String[] args) 
	{
		QueueDemo queue = new QueueDemo() ;
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.show();
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		queue.show();
		
		
		// Circular Queue
		CircularQueue cq = new CircularQueue() ;
		System.out.println(cq.isEmpty());   // empty at start
		cq.enQueue(10);
		cq.enQueue(20);
		cq.enQueue(30);
		cq.enQueue(40);
		cq.enQueue(50);
		cq.show();
		System.out.println(cq.deQueue());  // removing element 
		System.out.println(cq.deQueue());
		cq.enQueue(60);
		cq.enQueue(70);
		cq.show();
		System.out.println(cq.isFull());
		

	}

}

/* Output:
Elements : 10 20 30 40 
10
20
Elements : 30 40 
true
Elements : 10 20 30 40 50 
10
20
Elements : 30 40 50 60 70 
true

*/
