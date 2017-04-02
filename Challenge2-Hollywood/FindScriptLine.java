/**
 * A program to search for specific lines and print their line number.
 * See FindScriptLine.txt for more details
 * TODO: add your netid to the line below
 * @author sj2
 */
public class FindScriptLine {

	public static void main(String[] args) {
// TODO: Implement the functionality described in FindScriptLine.txt
// TODO: Test your code manually and using the automated unit tests in FindScriptLineTest
		TextIO.putln("Please enter the word(s) to search for");
		String query = TextIO.getln();
		
		TextIO.putln("Searching for \'" + query + "\'");
		
		TextIO.readFile("thematrix.txt");
		
		int lineNumber = 0;
		
		while (false == TextIO.eof()) 
		{
			String line = TextIO.getln();
			lineNumber++;
			line = line.replace("\t", "");
			line = line.trim();
			if (line.toLowerCase().indexOf(query.toLowerCase()) != -1)
			{
				TextIO.putln(lineNumber + " - " +line);
			}
			
		}
		
		TextIO.putln("Done Searching for \'" + query + "\'");
	}
}
