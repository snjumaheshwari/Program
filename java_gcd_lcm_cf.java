/*
You will be given two arrays of integers. You will be asked to determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.

Complete the getTotalX function which takes  integer arrays  and 
 as parameters and returns an integer denoting the number of integers between the two sets.
 */
 
import java.util.Scanner;
import java.math;

class Solution{
	
	static int lcm_finder(int a[])
	{
		
	}
	
	static int hcf_finder(int []a , int []b)
	{
		
	}
	
	 static int getTotalX(int[] a, int[] b{
		int Lcm=lcm_finder(a);
		int Hcf=hcf_finder(b);
		

		}

 private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
	
}