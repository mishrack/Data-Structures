package stacks;

public class StackRunner {

	public static void main(String[] args)
	{
		StaticStack nums = new StaticStack() ;
		System.out.println("Stack is empty: "+ nums.isEmpty());  // at start , stack is empty
		nums.push(10);
		nums.push(20);
		nums.push(30);
		nums.push(40);
		nums.push(50);
		//nums.push(60);   // will throw error:  java.lang.RuntimeException: StackOverFlow Error
		System.out.println(nums.size());
		nums.show();
		System.out.println("\n");
		
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		//System.out.println(nums.pop());  // will throw error:  java.lang.RuntimeException: StackUnderFlow Error
		System.out.println("Stack is empty: "+ nums.isEmpty());
		nums.show();
		
		System.out.println(nums.size());
	}

}
