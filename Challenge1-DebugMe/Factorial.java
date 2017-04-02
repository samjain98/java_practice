
/**
 * A program to calculate a factorial. The given code may contain errors. Fix the
 * given code and add additional code to calculate a factorial and pass the unit
 * tests. Hint sometimes an 'int' just 'aint big enough.
 * 
 * @see Factorial-ReadMe.txt for details on how to complete this program.
 * @author sj2
 */
public class Factorial {
	public static void main(String[] args) {
		long max = 0;
		long total = 1;
		while (max < 1 || max >= 21) {
			total = 1;
			max = TextIO.getlnInt();
			System.out.println("Enter a number between 1 and 20 inclusive.");
			for ( int i = 1; i <= max; i++ )
			{
				total *= i;
			}
		}
		TextIO.putln(max + "! = " + total);
	}
}
