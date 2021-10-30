package stacks;

// Demonstration of Dynamic stack using array

public class DynamicStack 
{
	int capacity = 2 ;
	int[] dstack = new int[capacity] ;
	int top = 0;
	
	public void push(int data)   // adds data to the stack, no Run time exception : Stack Overflow as the array expands 
	{
		if(capacity == size())   // if it is true then we need to expand our array
		{
			expand() ;
			System.out.println("top is now: " +top);  
			dstack[top] = data ; 
			top++ ;
		}
		else
		{
			dstack[top] = data ;  
			top++ ;
		}
	}
	private void expand() 
	{
		int length = size() ;  // storing length of prevous array
		int[] new_arr = new int[capacity*2] ;   // declaring array of twice capacity
		
		System.arraycopy(dstack, 0, new_arr, 0, length);  // copy the elements of old array into new array
		dstack = new_arr ;        // no making the reference of old as new array
		
		capacity *= 2 ;    // changing the existing capacity to twice 
	}
	
	public int pop()  // removes the top element of the stack and returns it
	{
		int data ;
		if(isEmpty())
		{
			throw new RuntimeException("StackUnderFlow Error") ;
		}
		else
		{
			data = dstack[top-1] ;
			dstack[--top] = 0 ;
			
			shrink() ;  // shrinking array capacity if elements remains is less then 1/4
		}
		return data ;
	}
	
	private void shrink()   // calling shrink method to reduce size of the stack
	{
		int length = size() ;
		if(length <= (capacity/2)/2)  // if length is 1/4 th of capacity then reduce capacity of array
		{
			capacity /= 2 ;
			int[] new_arr = new int[capacity] ;
			System.arraycopy(dstack, 0, new_arr, 0, length);
			dstack = new_arr ;
		}
	}
	public int peek()   //  returns the top element of the stack
	{
		int data = dstack[top-1] ;
		return data ;
	}
	public int size()   // returns the current size of the stack
	{
		return top ;
	}
	public boolean isEmpty()   // checks if the stack is empty or not
	{
		return top <= 0;
	}
	public void show()    // display the content of the stack
	{
		for(int n : dstack)
		{
			System.out.print(n + " ");
		}
		System.out.println("\n");
	}
}

