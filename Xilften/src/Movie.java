//@author sj2
public class Movie 
{
	private String title, description, genre;
	private int rating;
	private boolean haveSeen;
	private Stack actors;
	
	public Movie (String title, String description, String genre, int rating, boolean haveSeen)
	{
		this.title = title;
		this.description = description;
		this.genre = genre;
		this.rating = rating;
		this.haveSeen = haveSeen;
		actors = new Stack();
	}
	
	public void addActor( String name )
	{
		actors.push(name);
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getRating()
	{
		return rating;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public Stack getActors()
	{
		return actors;
	}
	
	public boolean getSeen()
	{
		return haveSeen;
	}
	
	public String toString()
	{
		String output = "";
		
		output += "Title: " + title + "\n" +
				"Description: " + description + "\n" +
				"Actors: " + actors + "\n" +
				"Genre: " + genre + "\n" + 
				"Rating: " + rating + "\n" +
				"Seen? " + haveSeen + "\n";
		
		return output;
	}
}
