/**
 * Add you netid here..
 * @author sj2
 *
 */
public class PlayListUtil {

	/**
	 * Debug ME! Use the unit tests to reverse engineer how this method should work.
	 * Hint: Fix the formatting (shift-cmd-F) to help debug the following code
	 * @param list
	 * @param maximum
	 */
	public static void list(String[] list, int maximum) {
		int i = 0;
		if (maximum == -1)
		{
			for (i = 0; i < list.length; i++)
			{
				TextIO.putln(   ""  + (i+1) + ". " + list[i] );
			}
		}
		else
		{
			for (i = 0; i < maximum; i++)
			{
				TextIO.putln(   ""  + (i+1) + ". " + list[i] );
			}
		}
	}

	/**
	 * Appends or prepends the title
	 * @param list
	 * @param title
	 * @param prepend if true, prepend the title otherwise append the title
	 * @return a new list with the title prepended or appended to the original list
	 */
	public static String[] add(String[] list, String title, boolean prepend) 
	{
		String [] newList = new String[list.length+1];
		if (prepend)
		{
			newList[0] = title;
			
			for ( int i = 0; i< list.length; i++)
			{
				newList[i+1] = list[i];
			}
		}
		else
		{
			int i;
			for (i = 0; i< list.length; i++)
			{
				newList[i] = list[i];
			}
			
			newList[i] = title;
		}
		return newList;
	}
	/**
	 * Returns a new list with the element at index removed.
	 * @param list the original list
	 * @param index the array index to remove.
	 * @return a new list with the String at position 'index', absent.
	 */
	public static String[] discard(String[] list, int index) 
	{
		String[] newList = new String[list.length-1];
		
		int newCount = 0;
		
		for ( int i = 0; i < list.length; i++ )
		{
			if (i != index)
			{
				newList[newCount] = list[i];
				newCount++;
			}
		}
		
		return newList;
		
	}
	

}
