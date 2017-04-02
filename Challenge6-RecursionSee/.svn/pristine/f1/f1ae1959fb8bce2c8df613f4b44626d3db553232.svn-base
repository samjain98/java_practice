/**
 * @author sj2
 *
 */
public class GeneAnalysis
{
	/** Wrapper method. Returns the length of the longest 
	 * common subsequence
	 */
	public static int score(String gene1, String gene2)
	{
		//System.out.println(score (gene1.toCharArray(), gene2.toCharArray(), gene1.length()-1, gene2.length()-1));
		return score (gene1.toCharArray(), gene2.toCharArray(), gene1.length()-1, gene2.length()-1);
	}
	
	public static int score (char [] gene1, char[] gene2, int i, int j)
	{
		if (gene1.length == 0 || gene2.length == 0 )
		{
			return 0;
		}
		
		if (i == 0 && j == 0)
		{
			return 1;
		}
		
		if (i == 0)
		{
			return score (gene1, gene2, i, j-1);
		}
		if (j == 0)
		{
			return score(gene1, gene2, i-1, j);
		}
		
		int twoSteps = score(gene1, gene2, i - 1, j - 1);
		int iStep = score(gene1, gene2, i-1, j);
		int jStep = score (gene1, gene2, i, j-1);
		
		if (gene1[i] == gene2[j])
		{
			return 1 + twoSteps;
		}
		else if (iStep > jStep)
		{
			return iStep;
		}
		else
		{
			return jStep;
		}
	}

	/** Implements longest common subsequence recursive search
The recursive case is defined as
					S(i-1, j)
S(i,j) = max {		S(i,j-1)
					S(i-1,j-1)
					
					S(i-1,j-1) +1 if gene1[i] = gene2[j]

NB  0<=i < gene1.length
    0<=j < gene2.length

You need to figure out the base case.
	 * */
//	define a private recursive Class method 'score' that 
//	returns an integer the score.
//	The method should take four parameters- 
//	two char arrays and two integers (gene1,gene2,i,j)
//	i and j are the indices into gene1 and gene2 respectively.

}
// Use local variables to store a recursive result so that you  do not need to calculate it again.

// Do not use a loops.
