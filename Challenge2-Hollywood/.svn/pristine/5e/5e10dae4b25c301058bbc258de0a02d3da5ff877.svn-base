/**
 * A program to run a simple survey and report the results. See MovieSurvey.txt
 * for more information. TODO: add your netid to the line below
 * 
 * @author sj2
 */
public class MovieSurvey {
	public static void main(String[] arg) {
		
		TextIO.putln("Welcome. We're interested in how people are watching movies this year.");
		TextIO.putln("Thanks for your time. - The WRITERS GUILD OF AMERICA.");
		TextIO.putln("Please tell us about how you've watched movies in the last month.");
		
		TextIO.putln("How many movies have you seen at the cinema?");
		int cinema = TextIO.getlnInt();
		
		TextIO.putln("How many movies have you seen using a DVD or VHS player?");
		int hardCopy = TextIO.getlnInt();
		
		TextIO.putln("How many movies have you seen using a Computer?");
		int computer = TextIO.getlnInt();
		
		TextIO.putf("Summary: %d Cinema movies, %d DVD/VHS movies, %d Computer movies\n", cinema, hardCopy, computer);

		TextIO.putf("Total: %d movies\n", cinema+hardCopy+computer);
		
		TextIO.putf("Fraction of movies seen at a cinema: %.2f%%\n", ( ( (cinema/1.0) *100) / (cinema+hardCopy+computer) ) );
		
		TextIO.putf("Fraction of movies seen outside of a cinema: %.2f%%\n", ( ( ( (hardCopy+computer) / 1.0) * 100 ) / (cinema+hardCopy+computer) ) );
	}
}
