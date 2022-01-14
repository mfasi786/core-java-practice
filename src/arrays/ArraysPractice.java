package arrays;

public class ArraysPractice {

	public static void main(String[] args) {

		
		/*
		 * ARRAYS: Indexed collection of fixed number of homogenous data elements. The
		 * main advantage of arrays is that we can represent huge number of values by
		 * single variable. Recommended way of initializing the array is int[] x; Where
		 * name is clearly separated from type. 
		 * 
		 * During declaration size cannot be specified otherwise compilation error. int[6] x;
		 * invalid whereas int[] x; is valid. int[] a,b; where a and b are both 1 D array.
		 * 
		 * 2D ARRAY: int[][] x; Valid 2d array declarations: int[][] x; int [][]x; int
		 * x[][]; int[] []x; int [] x[]; int []x[]; All are valid styles. int[] a[]b;
		 * means a is 2D while b is 1D. int[] a[] b[]; both and b are 2d. int[] [] a,b;
		 * both a and b are still 2d array refer 1D declaration above. Also space is ignored by compiler. 
		 * 
		 * int[] []a, []b; Here compile time error because if the
		 * before [] style is used, then only the first variable is allowed [], not the
		 * subsequent variables. But you can use [] after the variable for b.
		 * 
		 * 
		 * ARRAY CREATION: int[] x = new int [5]; Notice that NEW keyword is used hence
		 * all arrays are OBJECT. All arrays have a corresponding class that is why we
		 * use NEW. These classes are not available to user but they are present in java.lang. These
		 * classes names starts with [ to keep them from the users. Ex: 1 D array of Int
		 * = [I (sq bracket with I for int) 
		 * 
		 * At the time of array creation, specifying size is mandatory. If size is not specified compiler will give error.
		 */

			
			
		// INVALID compile time error
		// int [] x = new int[5];
		
		int [] a = new int[5]; //VALID
		int [] b = new int[0]; //VALID just like main method's arguments.
		int [] c = new int[-3]; //VALID to declare but error during runtime. Compiler only checks if its an int or not. int can store -ve.
		int [] d = new int['a']; //VALID since a will be converted to 97. Whatever can be promoted to int will be promoted.
		
		
		
		
		

	}

}
