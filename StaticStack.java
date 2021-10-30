// Demonstration of stack implemented using fixed array size.

/*
Methods implemented are:
push(), pop(), peek(), size(), isEmpty(),show()
*/
package stacks;

public class StaticStack 
{
	int[] stack = new int[5] ;  // capacity of the stack is of 5
	int top = 0 ;   // initialize top of stack as 1
	
	public void push(int data)   // adds data to the stack
	{
		if(top == 5)
		{
			throw new RuntimeException("StackOverFlow Error");
		}
		else
		{
			stack[top] = data ;  
			top++ ;
		}
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
		data = stack[top-1] ;
		stack[--top] = 0 ;
		}
		return data ;
	}
	public int peek()   //  returns the top element of the stack
	{
		int data = stack[top-1] ;
		return data ;
	}
	public String size()   // returns the current size of the stack
	{
		return "\nsize of the stack is: "+top ;
	}
	public boolean isEmpty()   // checks if the stack is empty or not
	{
		return top <= 0;
	}
	public void show()    // display the content of the stack
	{
		for(int n : stack)
		{
			System.out.print(n + " ");
		}
	}
}
