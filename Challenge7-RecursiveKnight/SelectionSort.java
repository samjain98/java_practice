//@author sj2
public class SelectionSort {
	/**
	 * Sorts the entire array using selection sort
	 * This is just a wrapper method that calls the 
	 * recursive method with the correct parameter lo,hi values.
	 * @param data
	 */
	public static void sort(double[] data) 
	{
		sort (data, 0, data.length-1);
	}

	/** Recursively sorts the sub array lo...hi using selection sort algorithm.*/
	public static void sort(double[] data, int lo, int hi) 
	{
		if (lo >= hi)
		{
			
		}
		else
		{
			int minIndex = findMin (data, lo, hi);
			swap (data, lo, minIndex);
			sort (data, lo+1, hi);
		}
	}

	/** Helper method for selection sort: Swaps values at indices i and j*/
	public static void swap(double[] data, int i, int j) 
	{
		double holder = data[i];
		data[i] = data[j];
		data[j] = holder;
	}

	/**
	 * Recursively finds the position of the smallest value of the values lo...hi (inclusive). 
	 * @param data
	 * @param lo
	 * @param hi
	 * @return
	 */
	public static int findMin(double[] data, int lo, int hi) 
	{
		double smallest = data[lo];
		
		int smallIndex = lo;
		
		for (int i = lo; i <= hi; i++)
		{
			if (data[i] < smallest)
			{
				smallest = data[i];
				smallIndex = i;
			}
		}
		
		return smallIndex;
	}

}
