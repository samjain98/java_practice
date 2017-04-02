//@author sj2
public class GridCounting {
	/** Returns the total number of possible routes (paths) from
	 * (x,y) to (tx,ty).
	 * There are only three valid kinds of moves:
	 *  Increment x by one.
	 *  Increment x by two.
	 *  Increment y by one.
	 *  
	 *  Hint: You'll need to test two base cases.
	 */
	public static int count(int x,int y, int tx, int ty) 
	{
		boolean move1 = isValid(x+1, y, tx, ty);
		boolean move2 = isValid(x+2, y, tx, ty);
		boolean move3 = isValid(x, y+1, tx, ty);
		
		if (x == tx && y == ty)
		{
			return 1;
		}
		if (!move1&&!move2&&!move3)
		{
			return 0;
		}
		
		if (move1&&move2&&move3)
		{
			int one = count(x+1, y, tx, ty);
			int two = count(x+2, y, tx, ty);
			int three = count(x, y+1, tx, ty);
			return count(x+1, y, tx, ty) + count(x+2, y, tx, ty) + count(x, y+1, tx, ty);
		}
		else if (move1&&move2)
		{
			int one = count(x+1, y, tx, ty);
			int two = count(x+2, y, tx, ty);
			return count(x+1, y, tx, ty) + count(x+2, y, tx, ty);
		}
		else if (move1&&move3)
		{
			int one = count(x+1, y, tx, ty);
			int three = count(x, y+1, tx, ty);

			return count(x+1, y, tx, ty) + count(x, y+1, tx, ty);
		}
		else if (move2&&move3)
		{
			int two = count(x+2, y, tx, ty);
			int three = count(x, y+1, tx, ty);
			return count(x+2, y, tx, ty) + count(x, y+1, tx, ty);
		}
		else if (move1)
		{
			int one = count(x+1, y, tx, ty);

			return count(x+1, y, tx, ty);
		}
		else if (move2)
		{
			int two = count(x+2, y, tx, ty);

			return count(x+2, y, tx, ty);
		}
		else
		{
			int three = count(x, y+1, tx, ty);

			return count(x, y+1, tx, ty);
		}
	}
	
	public static boolean isValid (int x, int y, int tx, int ty)
	{
		return (x <= tx && y <= ty && x >= 0 && y >= 0);
	}
}
