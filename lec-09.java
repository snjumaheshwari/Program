
class Testarray {
	public static void main(String args[]) {

		int a[] = new int[5];// declaration and instantiation
		a[0] = 10;//initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		
		// printing array
		for (int i = 0; i < a.length; i++)// length is the property of array
		{
			System.out.println(a[i]);
		}

	}
}

// Example 2
class Testarray1 {
	public static void main(String args[]) {

		int a[] = { 33, 3, 4, 5 };// declaration, instantiation and
									// initialization

		// printing array
		for (int i = 0; i < a.length; i++)
			// length is the property of array
			System.out.println(a[i]);

	}
}

class Test{
	public static void main(String[] args)
	{
		
		int arr[][]={{3,4,5},{5,6,7},{7,8,9},{9,8,7}};
		for(int[] a:arr)
		{	
			for(int b:a)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		
		}
	
	}
	
}

// Multi Dimensional Array

class Testarray3 {
	public static void main(String args[]) {

		// declaring and initializing 2D array
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 }, { 4, 4, 5 } };

		// printing 2D array
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}

// Copy Array

class TestArrayCopyDemo {
	public static void main(String[] args) {
		char  Sonali[]= { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a',
				't', 'e', 'd' };
		char[] Snehdeep = new char[7];

		// System.arraycopy(src, srcPos, dest, destPos, length)
		System.arraycopy(Sonali, 2, Snehdeep, 0, 7);
		String str=new String(Snehdeep);
		System.out.println(str);
	}
}

// Addition of 2 matrices in java

class Testarray5 {
	public static void main(String args[]) {
		// creating two matrices
		int a[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 4 }, { 3, 4, 5 } };

		// creating another matrix to store the sum of two matrices
		int c[][] = new int[2][3];

		// adding and printing addition of 2 matrices
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// new line
		}

	}
}


