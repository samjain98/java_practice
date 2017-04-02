//@author sj2
public class StaticMethodsAreEasy 
{
// Oh no... Someone removed  the methods but left the comments!!
// Hint: Get the Geocache class working and passing its tests first.

	/**
	 * Returns an array of num geocaches. Each geocache is initialized to a random
	 * (x,y) location.
	 * if num is less than zero, just return an empty array of length 0.
	 * 
	 * @param num
	 *            number of geocaches to create
	 * @return array of newly minted Points
	 */
	//write the method here...
	public static Geocache[] createGeocaches(int quantity)
	{
		Geocache [] caches = new Geocache [0];
		if (quantity > 0)
		{
			caches = new Geocache [quantity];
			
			for (int i = 0; i < caches.length; i++)
			{
				caches[i] = new Geocache (( (int) (Math.random() * 1000) - 500) , ((int)(Math.random() * 1000) - 500) );
			}
			
			return caches;
		}
		else
		{
			return caches;
		}
	}
	
	/**
	 * Modifies geocaches if the geocache's X value is less than the allowable minimum
	 * value.
	 * 
	 * @param p
	 *            array of geocaches
	 * @param minX
	 *            minimum X value.
	 * @return number of modified geocaches (i.e. x values were too small).
	 */
	//write the method here...
	public static void ensureMinimumXValue(Geocache[] caches, double value)
	{
		for (int i = 0; i < caches.length; i++)
		{
			if (caches[i].getX() < value)
			{
				caches[i].setX(value);
			}
		}
	}
	
	/**
	 * Counts the number of geocaches that are equal to the given geocache
	 * Hint: Use geocache.equals() method 
	 * @param p -
	 *            geocache array
	 * @param test -
	 *            test geocache (compared using .equal)
	 * @return number of matching geocaches
	 */
	
	public static int countEqual (Geocache[] caches, Geocache compare)
	{
		int count = 0;
		for (int i = 0; i < caches.length; i++)
		{
			if ( caches[i].equals(compare) )
				count++;
		}
		
		return count;
	}
}
