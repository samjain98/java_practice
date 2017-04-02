/**
 * A program to search for to encrypt and decrypt lines of text. See
 * CaesarCipher.txt
 * Hints: line.charAt( int ) is useful.
 * You'll need loops, and conditions and variables
 * You'll need to read the Test cases to understand how your program should work.
 * Good Programming Hints: "DRY: Don't Repeat Yourself"
 * Try to make your program as short as possible.
 * TODO: add your netid to the line below
 * @author sj2
 */
public class CaesarCipher {

	public static void main(String[] strings) {
		//TODO: Delete the following line and write your implementation here-
		boolean finish = false;
		int shift = 0;
		do 
		{
			TextIO.putln("Please enter the shift value (between -25..-1 and 1..25)");
			shift = TextIO.getlnInt();
			
			if (shift == 999 || shift == -999)
				finish = true;
			else if (shift == 0 || shift > 25 || shift < -25 )
				TextIO.putln(shift + " is not a valid shift value.");
			else
				finish = true;
			
		}while (!finish);
		finish = false;
		
		
		if (shift==999)
		{
			TextIO.putln("Using position shift");
			do
			{
				String newPhrase = "";
				char [] keys = new char[26];
	
			    for (int i = 0; i < 26; i++ )
			    {
			        keys[i] = (char)(i + 65);
			    }
	
				TextIO.putln("Please enter the source text (empty line to quit)");
				
				String phrase = TextIO.getln();
				
				if ( phrase.equals("") )
				{
					finish = true;
					TextIO.putln("Bye.");
				}
				else
				{						
					String upper = phrase.toUpperCase();
					
					for ( int i = 0; i < upper.length(); i++)
					{
						shift = i;
						int pos = (int)(upper.charAt(i)) - 65;
	
						if (pos >= 0 && pos <= 25 )
						{
							int adjustment = shift;
							
							if (shift < 0)
							{
								adjustment += 26;
							}
							
							while ((pos + adjustment) >= 26)
							{
								adjustment -= 26;
							}
							
							pos += adjustment;
							newPhrase += keys[pos];
						}
						else
						{
							newPhrase+= upper.charAt(i);
						}
					}
					
					TextIO.putln("Source   :" + phrase);
					TextIO.putln("Processed:" + newPhrase);
				}
			}while (!finish);
		}
		else if (shift ==-999)
		{
			TextIO.putln("Using position shift");
			do
			{
				String newPhrase = "";
				char [] keys = new char[26];
	
			    for (int i = 0; i < 26; i++ )
			    {
			        keys[i] = (char)(i + 65);
			    }
	
				TextIO.putln("Please enter the source text (empty line to quit)");
				
				String phrase = TextIO.getln();
				
				if ( phrase.equals("") )
				{
					finish = true;
					TextIO.putln("Bye.");
				}
				else
				{						
					String upper = phrase.toUpperCase();
					
					for ( int i = 0; i < upper.length(); i++)
					{
						shift = -1 * i;
						int pos = (int)(upper.charAt(i)) - 65;
	
						if (pos >= 0 && pos <= 25 )
						{
							int adjustment = shift;
							
							while(adjustment < 0)
							{
								adjustment += 26;
							}
							
							while ((pos + adjustment) >= 26)
							{
								adjustment -= 26;
							}
							
							pos += adjustment;
							newPhrase += keys[pos];
						}
						else
						{
							newPhrase+= upper.charAt(i);
						}
					}
					
					TextIO.putln("Source   :" + phrase);
					TextIO.putln("Processed:" + newPhrase);
				}
			}while (!finish);
			
		}
		else
		{
			TextIO.putln("Using shift value of " + shift);
			do
			{
				String newPhrase = "";
				char [] keys = new char[26];
	
			    for (int i = 0; i < 26; i++ )
			    {
			        keys[i] = (char)(i + 65);
			    }
	
				TextIO.putln("Please enter the source text (empty line to quit)");
				
				String phrase = TextIO.getln();
				
				if ( phrase.equals("") )
				{
					finish = true;
					TextIO.putln("Bye.");
				}
				else
				{						
					String upper = phrase.toUpperCase();
					
					for ( int i = 0; i < upper.length(); i++)
					{
						int pos = (int)(upper.charAt(i)) - 65;
	
						if (pos >= 0 && pos <= 25 )
						{
							int adjustment = shift;
							
							if (shift < 0)
							{
								adjustment += 26;
							}
							
							while ((pos + adjustment) >= 26)
							{
								adjustment -= 26;
							}
							
							pos += adjustment;
							newPhrase += keys[pos];
						}
						else
						{
							newPhrase+= upper.charAt(i);
						}
					}
					
					TextIO.putln("Source   :" + phrase);
					TextIO.putln("Processed:" + newPhrase);
				}
			}while (!finish);
		}
			
	}

}
