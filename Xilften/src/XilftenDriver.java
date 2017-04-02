//@author sj2
public class XilftenDriver 
{
	public static void main (String[] args)
	{
		LinkedList movies;
		TextIO.putln("Enter movie data to begin.");

		TextIO.putln("Enter movie title");
		String title = TextIO.getln();
		
		TextIO.putln("Enter movie rating from 1 - 5");
		int rating = TextIO.getInt();
		
		TextIO.putln("Enter movie description");
		TextIO.getln();
		String description = TextIO.getln();
		
		TextIO.putln("Enter genre");
		String genre = TextIO.getln();
		
		TextIO.putln("Have you seen it? y/n");
		char decision = TextIO.getChar();
		boolean seen = decision=='y';
		
		Movie obj = new Movie(title, description, genre, rating, seen);

		TextIO.putln("How many actors/actresses?");
		int actorNumber = TextIO.getInt();
		TextIO.getln();
		for (int i = 0; i < actorNumber; i++ )
		{
			TextIO.putln("Enter actor/actress name");
			obj.addActor(TextIO.getln());
		}
		
		movies = new LinkedList (obj, null);
				
		Movie meme = new Movie("AAAA", "placeholder", "sad", 1, false);
		meme.addActor("Hubert Cumberdale");
		
		movies.insert(meme);
		
		int input = 0;
		
		do 
		{
			TextIO.putln ("Enter 1 to add a movie\n" +
						"Enter 2 to remove a movie\n" +
						"Enter 3 display all movies\n" +
						"Enter 4 to display movies above a certain rating\n" +
						"Enter 5 to display movies of a specific genre\n" +
						"Enter 6 to show all movies with a certain actor/actress\n" +
						"Enter 7 to show all unseen movies\n" +
						"Enter -1 to exit");
			
			input = TextIO.getInt();
			
			switch (input)
			{
			case 1: 
				TextIO.getln();
				TextIO.putln("Enter movie title");
				
				
				title = TextIO.getln();
				
				TextIO.putln("Enter movie rating from 1 - 5");
				
				rating = TextIO.getInt();
				
				TextIO.putln("Enter movie description");
				TextIO.getln();
				description = TextIO.getln();
				
				TextIO.putln("Enter genre");
				
				genre = TextIO.getln();
				
				TextIO.putln("Have you seen it? y/n");
				
				decision = TextIO.getChar();
				seen = decision=='y';
				
				obj = new Movie(title, description, genre, rating, seen);

				TextIO.putln("How many actors/actresses?");
				
				actorNumber = TextIO.getInt();
				TextIO.getln();
				
				for (int i = 0; i < actorNumber; i++ )
				{
					TextIO.putln("Enter actor/actress name");
					obj.addActor(TextIO.getln());
				}
				movies.insert(obj);
				break;
			
			case 2:
				TextIO.putln("Enter title of movie to remove");
				TextIO.getln();

				title = TextIO.getln();
				
				movies.remove(title);
				break;
				
			case 3:
				TextIO.putln(movies);
				break;
				
			case 4:
				TextIO.putln ("Enter rating cutoff");
				rating = TextIO.getInt();
				TextIO.putln(movies.getHighRatings(rating));
				break;
				
			case 5:
				TextIO.putln ("Enter genre");
				genre = TextIO.getln();
				TextIO.putln(movies.getGenres(genre));
				break;
			
			case 6:
				TextIO.putln ("Enter actor/actress name");
				String actor = TextIO.getln();
				TextIO.putln(movies.getActors(actor));
				break;
				
			case 7:
				movies.getUnseen();
				break;
			
			default:
				TextIO.putln("Incorrect value entered.");
				break;
				
			case -1:
				TextIO.putln("Are you sure? All data will be lost. y/n");
				decision = TextIO.getChar();
				
				if (decision != 'y')
				{
					input = 0;
				}
				
			}
		}
		while (input != -1);
	}
}
