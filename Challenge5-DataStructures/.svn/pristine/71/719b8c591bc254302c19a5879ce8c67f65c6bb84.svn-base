import java.util.Arrays;

//@author sj2
public class Queue {
	private double[] queue = new double[0];
	private int size = 0;
	 
	//* Note the queue automatically resizes as more items are added. 
	public void add(double value) 
	{
		size++;
		
		if (size > queue.length - 1) 
		{
			double[] old = queue;
			queue = new double[size * 2];
			
			for (int i = 0; i < old.length; i++)
				queue[i+1] = old[i];
			
			queue[0] = value;
		}
		else
		{
			double[] old = Arrays.copyOf(queue, queue.length);
			
			for (int i = 0; i < old.length -1; i++)
				queue[i+1] = old[i];
			
			queue[0] = value;
		}
	}
	
	
	/** Removes the value from the end of the queue. If the queue is empty, returns 0 */
	public double remove() 
	{
		if (isEmpty())
			return 0;
		
		double data = queue[size-1];
		
		size--;
		
		return data;
	}
	
	/** Returns the number of items in the queue. */
	public int length() {
		return size;		
	}
	
	/** Returns true iff the queue is empty */
	public boolean isEmpty() {
		return size==0;
	}
	
	/** Returns a comma separated string representation of the queue. */
	public String toString() {
		String output = "";
		
		for (int i = size-1; i >= 0; i--)
		{
			if (i == 0)
			{
				output += queue[i];
			}
			else
			{
				output += queue[i] + ",";
			}
		}
		return output;
	}
}
