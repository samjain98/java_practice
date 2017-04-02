/**
 * See CipherBreaker.txt for instructions.
 * TODO: add your netid to the upper below
 * 
 * @author sj2
 */
public class CipherBreaker {

	public static void main(String[] args) {
		TextIO.putln("Text?");
		String line = TextIO.getln();
		
		TextIO.putln(line);
		
		String upper = line.toUpperCase();
		int spaces = 0;
		int punctuation = 0;
		int digits = 0;
		int [] letterCounts = new int[26];
		
		for ( int i = 0; i < upper.length(); i++ )
		{
			if ((int) (upper.charAt(i)) >= 65 && (int) (upper.charAt(i)) < 91)
				letterCounts[(int) (upper.charAt(i)) - 65]++;
			else if (upper.charAt(i) == ' ')
				spaces++;
			else if (upper.charAt(i) == '\"' || upper.charAt(i) == '\'' || upper.charAt(i) == '.' || upper.charAt(i) == ',' || upper.charAt(i) == '!' || upper.charAt(i) == '-')
				punctuation++;
			else if ((int)upper.charAt(i) >= 48 && (int)upper.charAt(i) <= 57)
				digits++;
		}
		
		for (int i = 0; i < 26; i++)
		{
			if (letterCounts[i] != 0)
			{
				TextIO.putln( (char)(i + 65) + ":" + letterCounts[i]);
			}
		}
		
		if (digits != 0) TextIO.putln( "DIGITS:" + digits);
		if (spaces != 0) TextIO.putln( "SPACES:" + spaces);
		if (punctuation != 0) TextIO.putln( "PUNCTUATION:" + punctuation);
		
	}
}