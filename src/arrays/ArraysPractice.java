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
		//int [] c = new int[-3]; //VALID to declare but error during runtime. Compiler only checks if its an int or not. int can store -ve.
		int [] d = new int['a']; //VALID since a will be converted to 97. Whatever can be promoted to int will be promoted.
		//int [] e = new int[10l]; //INVALID
		//long []  f = new long [10l]; //INVALID because size must always be specified as int.
		
		//ALLOWED TYPES FOR SIZE ARE INT< SHORT< BYTE< CHAR
		//Whatever the size and type used - the total memory to be allocated must not exceed the available heap memory.  
		
		
		//ARRAY OF ARRAYS:: In Java, there are no matrix styled arrays, instead they are Array or Arrays.
		//This is because they are memory efficient.
		
		int[][] twoDArray = new int[3][]; 
		//Then later we can add the inner arrays as required
		//Note that the base level size must be specified, that is 3 in this case
		
		twoDArray[0] = new int[5];
		twoDArray[1] = new int[1];
		twoDArray[2] = new int[10];
		
		
		//THREE DIMENSIONAL ARRAY: 
		
		int[][][] threeDArray = new int[2][][]; //Two 3D arrays
		
		threeDArray[0] =  new int [3][]; //Means that the first array element of 3D array has three 2D arrays
		threeDArray[1] =  new int [1][]; //Means that the second array element of 3D array has one 2D array
		
		threeDArray[0][0] =  new int [2];
		threeDArray[0][1] =  new int [4];
		threeDArray[0][2] =  new int [6];		
		
		threeDArray[1][0] =  new int [3];

		
		//ALL ARRAYS are initialized with a 0 if INT/LONG. NULL for a String. Default values for each type.
		int [] aOne = new int[5];
		System.out.println("Printing default values of an array");
		System.out.println(aOne[0]);
				
		long [] aTwo = new long[5];
		System.out.println(aTwo[0]);
		
		String [] aThree = new String[5];
		System.out.println(aThree[0]);
		
		//Whenever we print any reference variable, internally toString() method will be called which is implemented by default to return the String in the following form.
		//classname@hascode_in_hexadecimal form		
		int[][] twoDArrayOne = new int[3][2]; 
		System.out.println("-----------------------------------");
		System.out.println("Printing 2D arrays");
		System.out.println(twoDArrayOne);
		System.out.println(twoDArrayOne[0]);
		System.out.println(twoDArrayOne[0][0]);
		
		
		
		//If an inner array is not given a size and try to print, the default is not zero but instead NPE		
		int[][] twoDArrayTwo = new int[2][]; 
		System.out.println("-----------------------------------");
		System.out.println("Printing 2D arrays where inner is not sized");
		System.out.println(twoDArrayTwo);
		System.out.println(twoDArrayTwo[0]); //This is null because the inner array has not been specified yet.
		// System.out.println(twoDArrayTwo[0][0]); //This will throw NPE as you cannot perform any operation on null
		
		
		//ARRAY DECLARATION, CREATION AND INITIALIZATION WITH DEFAULTS:
		int[] g = {100, 500, 1000};
		char[] h = {'A', 'B'};
		String[] i = {"Hello", "World"};
		int[][] j = {{1,2,3}, {50,100,150,200,250}};
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
