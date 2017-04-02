
/**
 * Complete the class method 'analyze' that takes a SimplePublicPair object as an argument
 * and returns a new SimplePublicTriple object.
 * The SimplePublicTriple needs to set up as follows:
 * x = the minimum value of 'a' and 'b'
 * y = the maximum value of 'a' and 'b'
 * description:a*b=M 
 *   where a,b, and M are replaced with the numerical values of a, b and the multiplication of a and b.
 * Your code will create a SimplePublicTriple, initializes the three fields and return a reference to the SimplePublicTriple object.
 * @author sj2
 */
public class UsingPublicFieldsIsEasy {
	
	public static SimplePublicTriple analyze(SimplePublicPair in) {
		int x = 0;
		int y = 0;
		SimplePublicTriple obj = new SimplePublicTriple();
		
		if (in.a >= in.b )
		{
			obj.y = in.a;
			obj.x = in.b;
		}
		else
		{
			obj.y = in.b;
			obj.x = in.a;
		}
		obj.description = in.a + "*" + in.b + "=" + in.a*in.b;
		
		return obj;
	}
}
