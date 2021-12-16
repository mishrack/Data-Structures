package arrays;

public class DynamicArrays {

	int length = 0 ;   // actual number of elements in the array
	int capacity =0 ;  // number of elements array can accomodate
	int[] arr ;
//---------------- constructors -------------------------
	public DynamicArrays()  
	{
		this(16);
	}
	public DynamicArrays(int capacity) 
	{ 
		if(capacity < 0) throw new IllegalArgumentException("Illegal Capacity: "+ capacity);
		this.capacity = capacity ;
		arr = new int[capacity] ;	
	}
//-------------------  METHODS -------------------------------------
	
	public  int size()  // size of the array
	{
		return length ;
	}
	public boolean isEmpty()  // check if array is empty or not
	{
		return size() == 0 ;
	}
	public int getElement(int index)  // find element at any index
	{
		if(length == 0)
			return -1 ;
		return arr[index] ;
	}
	public void setElement(int index, int element)  // set element at any index
	{
		arr[index] = element ;
	}
	public void clear()  // clear content of the array
	{
		for(int i =0 ; i< capacity ; i++)
		{
			arr[i] = -1 ;
		}
		length = 0;
	}
	public void addElement(int element)
	{
		if(length+1 > capacity )  // resize if array is small
		{
			if(capacity == 0) 
				capacity = 1;
			else
				capacity *= 2 ;   // double the size of array
			
			int[] new_arr = new int[capacity] ;
			for(int i= 0; i< length; i++)
			{
				new_arr[i] = arr[i] ;
			}
			arr = new_arr ;  // now the extra spaces are filled with default values 
		}
		arr[length++] = element ; // add the new element to the array
	}
	public void removeAtIndex(int index)  // removes element of specific index
	{
		// check if the index is valid or not
		if(index>= length && index < 0) throw new IndexOutOfBoundsException() ;
		int data = arr[index] ;
		int[] new_arr = new int[length-1];
		for(int i=0, j=0 ; i< length ; i++,j++)
		{
			if(i == index)
				j-- ;     // skips the index element 
			else
			{
				new_arr[j] = arr[i] ;
			}
			arr = new_arr ;
			capacity = --length ;
			System.out.println(data);
		}
	}	
	public boolean removeElement(int element)  // remove an element for array
	{
		for(int i =0 ; i< length ;i++)
		{
			if(arr[i] == element)
			{
				removeAtIndex(i) ;
				return true ;
			}
		}
		return false ;
	}
	public int indexOfElement(int element)  // find index of an element of array
	{
		for(int i =0 ; i< length ;i++)
		{
			if(arr[i] == element)
				return i ;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{

	}
}

