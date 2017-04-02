/**
 * Prints sum of odd numbers in a specific format.
 * TODO: add your netid to the line below
 * @author sj2
 */
public class OddSum { 
/**
Example output if user enters 10:
Max?
1 + 3 + 5 + 7 + 9 = 25
25 = 9 + 7 + 5 + 3 + 1

Example output if user enters 11:
Max?
1 + 3 + 5 + 7 + 9 + 11 = 36
36 = 11 + 9 + 7 + 5 + 3 + 1

 */
 public static void main(String[] args) { 
	 
	 TextIO.putln("Max?");
	 int max = TextIO.getlnInt();
	 int total = 0;
	 String expression = "";
	 String expression2 = "";
	 
	 if ( max %2== 0 )
	 	 for ( int i = max - 1; i > 0; i-=2 )
		 {
			 expression2 += (i + " + ");
		 }
	 
	 else 
	 {
		 for ( int i = max; i > 0; i-=2 )
		 {
			 expression2 += (i + " + ");
		 }
	 }
	 
	 for ( int i = 1; i <= max; i+=2 )
	 {
		 expression += (i + " + ");
		 total += i;
	 }
	 
	 String output1 = expression.substring(0, expression.length() - 3) + " = " + total;
	 String output2 = total + " = " + expression2.substring(0, expression.length() - 3);
	 TextIO.putln(output1);
	 TextIO.putln(output2);

  } // end of main method
} // end of class 
