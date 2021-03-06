
/* A class to implement the various pixel effects.
 *
 * Todo: Put your netid (i.e. username) in the line below
 * 
 * @author sj2
 */
public class PixelEffects {

	/** Copies the source image to a new 2D integer image */
	public static int[][] copy(int[][] source) {
		// Create a NEW 2D integer array and copy the colors across
		// See redeye code below 
		int [][] copy = new int [source.length][source[0].length]; 
		
		for (int row = 0; row <source.length; row ++)
		{
			for (int col = 0; col <source[row].length; col++)
			{
				copy[row][col] = source[row][col];
			}
		}
		return copy;
	}
	/**
	 * Resize the array image to the new width and height
	 * You are going to need to figure out how to map between a pixel
	 * in the destination image to a pixel in the source image
	 * @param source
	 * @param newWidth
	 * @param newHeight
	 * @return
	 */
	public static int[][] resize(int[][] source, int newWidth, int newHeight) {
		
		int [][] resized = new int [newWidth][newHeight];
		
		double widthFactor = (double)(source.length) /newWidth;
		double heightFactor = (double)(source[0].length)/newHeight;
		
		for (int rows = 0; rows < newWidth; rows++)
		{
			for (int cols = 0; cols < newHeight; cols++)
			{
				resized[rows][cols]= source[(int)(rows*widthFactor)][(int)(cols*heightFactor)];
			}
		}
		
		
		return resized;
		// Hints: Use two nested for loops between 0... newWidth-1 and 0.. newHeight-1 inclusive.
		// Hint: You can just use relative proportion to calculate the x (or y coordinate)  in the original image.
		// For example if you're setting a pixel halfway across the image, you should be reading half way across the original image too.
	}

	/**
	 * Half the size of the image. This method should be just one line! Just
	 * delegate the work to resize()!
	 */
	public static int[][] half(int[][] source) 
	{
		return resize(source, source.length/2, source[0].length/2); // Fix Me
	}
	
	/**
	 * Create a new image array that is the same dimesions of the reference
	 * array. The array may be larger or smaller than the source. Hint -
	 * this methods should be just one line - delegate the work to resize()!
	 * 
	 * @param source
	 *            the source image
	 * @param reference
	 * @return the resized image
	 */
	public static int[][] resize(int[][] source, int[][] reference) {
		return resize(source, reference.length, reference[0].length);
	}

	/** Flip the image vertically */
	public static int[][] flip(int[][] source) {
		int[][] newImg = new int[source.length][source[0].length];
		
		for (int row = 0; row < source.length; row++)
		{
			for ( int col = 0; col<source[0].length; col++ )
			{
				int srcPos = newImg[0].length - col - 1;
				
				newImg[row][col] = source[row][srcPos];
			}
		}
		
		return newImg;
	}

	/** Reverse the image horizontally */
	public static int[][] mirror(int[][] source) {
		
		int[][] newImg = new int[source.length][source[0].length];

		for (int row = 0; row < source.length; row++)
		{
			for ( int col = 0; col<source[0].length; col++ )
			{
				int srcPos = newImg.length - row - 1;
				
				newImg[row][col] = source[srcPos][col];
			}
		}
		
		return newImg;
	}

	/** Rotate the image */
	public static int[][] rotateLeft(int[][] source) {

		
		int[][] newImg = new int[source[0].length][source.length];

		for (int row = 0; row < newImg.length; row++)
		{
			for ( int col = 0; col<newImg[0].length; col++ )
			{
				int srcPos = newImg[0].length - col - 1;
				newImg[row][col] = source[srcPos][row];
			}
		}
		return newImg;
	}

	/** Merge the red,blue,green components from two images */
	public static int[][] merge(int[][] sourceA, int[][] sourceB) {
		// The output should be the same size as the input. Scale (x,y) values
		// when reading the background
		// (e.g. so the far right pixel of the source is merged with the
		// far-right pixel ofthe background).
		int [][] result = new int [sourceA.length][sourceA[0].length];
		for (int rows = 0; rows < sourceA.length; rows++ )
		{
			for (int cols = 0; cols < sourceA[0].length; cols++ )
			{
				int red = (RGBUtilities.toRed(sourceA[rows][cols]) + RGBUtilities.toRed(sourceB[rows][cols]))/2;
				int green = (RGBUtilities.toGreen(sourceA[rows][cols]) + RGBUtilities.toGreen(sourceB[rows][cols]))/2;
				int blue = (RGBUtilities.toBlue(sourceA[rows][cols]) + RGBUtilities.toBlue(sourceB[rows][cols]))/2;
				
				result[rows][cols] = RGBUtilities.toRGB(red, green, blue);
			}
		}
		
		return result;
	}

	/**
	 * Replace the green areas of the foreground image with parts of the back
	 * image
	 */
	public static int[][] chromaKey(int[][] foreImage, int[][] backImage) {
		// If the image has a different size than the background use the
		// resize() method
		// create an image the same as the background size.
		
		
		int [][] newImg = new int [foreImage.length][foreImage[0].length];
		
		for (int rows = 0; rows < backImage.length; rows++)
		{
			for ( int cols = 0; cols < backImage[0].length; cols++ )
			{
				if(RGBUtilities.toRed(foreImage[rows][cols]) == 0  && RGBUtilities.toBlue(foreImage[rows][cols]) == 0 && RGBUtilities.toGreen(foreImage[rows][cols]) > 0)
				{
					newImg[rows][cols] = backImage[rows][cols];
				}
				else
				{
					newImg[rows][cols] = foreImage[rows][cols];
				}
			}
		}
		
		return newImg;
	}

	/** Removes "redeye" caused by a camera flash. sourceB is not used */
	public static int[][] redeye(int[][] source, int[][] sourceB) {

		int width = source.length, height = source[0].length;
		int[][] result = new int[width][height];
		for (int i = 0; i < width; i++)
			for (int j = 0; j < height; j++) {
				int rgb = source[i][j];
				int red = RGBUtilities.toRed(rgb);
				int green = RGBUtilities.toGreen(rgb);
				int blue = RGBUtilities.toBlue(rgb);
				if (red > 4 * Math.max(green, blue) && red > 64)
					red = green = blue = 0;
				result[i][j] = RGBUtilities.toRGB(red, green, blue);
			}

		return result;
	}

	/* Upto you! do something fun to the image */
	public static int[][] funky(int[][] source, int[][] sourceB) {
		// You need to invent your own image effect
		// Minimum boring requirements to pass autograder:
		
		
		
		// Does not ask for any user input and returns a new 2D array
		// Todo: remove this return null
		return (new int[3][3]);
	}
}
