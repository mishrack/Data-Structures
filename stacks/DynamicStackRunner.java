package stacks;

public class DynamicStackRunner {

	public static void main(String[] args) 
	{
		DynamicStack nums = new DynamicStack() ;
		System.out.println("Stack is empty: "+ nums.isEmpty());  // at start , stack is empty
		nums.push(60);
		nums.show();
		nums.push(70);
		nums.show();
		nums.push(80);
		nums.show();
		nums.push(90);
		nums.show();
		nums.push(100);
		nums.show();
		System.out.println(nums.size()); // 4
		System.out.println(nums.capacity);
		nums.push(90);
		nums.push(70);
		nums.push(55);
		nums.push(66);
		nums.push(77);
		nums.push(88);
		nums.show();
		System.out.println(nums.size());  // 8
		
		nums.pop();
		nums.pop();
		nums.pop();
		nums.pop();
		nums.pop();
		nums.pop();
		nums.pop();
		nums.show();
		System.out.println(nums.size());
		System.out.println(nums.peek());
		

	}

}
