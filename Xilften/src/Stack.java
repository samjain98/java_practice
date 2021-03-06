//@author sj2
public class Stack {
	
	private String[] stack = new String[0];
	private int size = 0;
	
	/** Adds a value to the top of the stack.*/
	
	public void push (String value)
	{
		size++;
		
		if (size > stack.length - 1) 
		{
			String[] old = stack;
			stack = new String[size * 2];
			
			for (int i = 0; i < old.length; i++)
				stack[i+1] = old[i];
			
			stack[0] = value;
		}
		else
		{
			String[] old = new String[stack.length]; 
			for (int i = 0; i < stack.length; i++)
			{
				old[i] = stack[i];
			}
			
			for (int i = 0; i < old.length -1; i++)
				stack[i+1] = old[i];
			
			stack[0] = value;
		}
	}
	
	/** Removes the topmost string. If the stack is empty, returns null. */
	public String pop() 
	{
		if (isEmpty())
		{
			return null;
		}
		
		String[] old = new String[stack.length]; 
		for (int i = 0; i < stack.length; i++)
		{
			old[i] = stack[i];
		}
		
		for (int i = 0; i < old.length -1; i++)
			stack[i] = old[i+1];
		
		String data = old[0];
		size--;
		return data;
	}
	
	/** Returns the topmost string but does not remove it. If the stack is empty, returns null. */
	public String peek() 
	{
		if (isEmpty())
		{
			return null;
		}
		String data = stack[0];
		return data;
	}
	
	/** Returns true iff the stack is empty */
	public boolean isEmpty() {
		return size==0;
	}

	/** Returns the number of items in the stack. */
	public int length() 
	{
		return size;
	}
	
	public boolean contains(String val)
	{
		for (int i = 0; i < stack.length; i ++)
		{
			if (stack[i].equals(val))
			{
				return true;
			}
		}
		
		return false;
	}
	
	/** Returns a string representation of the stack. Each string is separated by a newline. Returns an empty string if the stack is empty. */
	public String toString() {
		String output = "";
		
		for (int i = size-1; i >= 0; i--)
		{

			output += stack[i] + ", ";

		}
		return output;
	}
}
