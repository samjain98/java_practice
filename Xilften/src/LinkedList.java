/**
 * @author sj2
 *
 */
public class LinkedList {

	private LinkedList next; 	
	private final Movie obj;

	public LinkedList(Movie item, LinkedList next) {
		this.obj = item;
		this.next = next;
	}

	public String toString() {
		if (next == null)
			return obj.toString();// BASE CASE; no more recursion required

		// Recursive case:
		String restOfString = next.toString(); // Forward Recursion
		return obj + ";" + restOfString;
	}

	public int getCount() {
		if (next == null)
			return 1; // BASE CASE; no more recursion required!

		return 1 + next.getCount(); // Forward recursion
	}
	
	public void remove(String movieTitle)
	{
		LinkedList head = this;
		
		while (head.next != null)
		{
			if (next.next.obj.getTitle().equals(movieTitle))
			{
				head.next = head.next.next;
				return;
			}
			
			head = head.next;
		}
	}
	
	public String getHighRatings( int cutoff ) 
	{
		if (next == null)
		{
			if (obj.getRating() > cutoff )
			{
				return obj.getTitle();
			}
		}
		else
		{
			if (obj.getRating() > cutoff )
			{
				return obj.getTitle() + " ," + next.getHighRatings(cutoff);
			}
			
			return next.getHighRatings(cutoff);
		}
		return next.getHighRatings(cutoff);
	}
	
	public String getGenres( String genre ) 
	{
		if (next == null)
		{
			if (obj.getGenre().equals(genre))
			{
				return obj.getTitle();
			}
		}
		else
		{
			if (obj.getGenre().equals(genre))
			{
				return obj.getTitle() + " ," + next.getGenres(genre);
			}
			
			return next.getGenres(genre);
		}
		return next.getGenres(genre);
	}
	
	public String getActors( String name ) 
	{
		if (next == null)
		{
			if (obj.getActors().contains(name))
			{
				return obj.getTitle();
			}
		}
		else
		{
			if (obj.getActors().contains(name))
			{
				return obj.getTitle() + " ," + next.getActors(name);
			}
			
			return next.getActors(name);
		}
		return next.getActors(name);
	}
	
	public void getUnseen()
	{
		LinkedList cur = this;
		
		int highest = 0;
		
		String best = "";
		
		while (cur != null)
		{
			if (!cur.obj.getSeen())
			{
				System.out.println(cur.obj);
				if (cur.obj.getRating() > highest)
				{
					best = cur.obj.getTitle();
					highest = cur.obj.getRating();
				}
			}
			
			cur = cur.next;
		}
		
		System.out.println( "The best movie is " + best);
	}
	
	public LinkedList insert(Movie movie) 
	{
    
		if (next != null)
		{
	    	 if( movie.getTitle().compareTo(next.obj.getTitle()) < 0)
	    	 {
	    		 return new LinkedList(movie,this);
	    	 }
	    	 
	    	 next.insert(movie);
	    }
		
		else if (next == null)
		{
			this.next = new LinkedList(movie,next);
		}
		 
		  return this;		  
	}                                        

}
