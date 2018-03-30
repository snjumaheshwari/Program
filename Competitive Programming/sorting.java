class Bubble_Sort{
	
	static void BubbleSort(int A[], int n)
	{
		// Complexity :- O(n**2) in all case..
		for(int pass=n-1; pass>=0;pass--)
				{
						for(int i=0;i<=pass-1;i++)
						{
							if(A[i]>A[i+1])
							{
								// swap A[i] and A[i+1]
								int temp=A[i];
								A[i]=A[i+1];
								A[i+1]=temp;
							}	
						}
				}
	}
	
	
	static void BubbleSortImproved(int A[], int n)
	{
		boolean swapped=true;
		// Complexity :- O(n**2) in Worst and average case... O(n) in Best case..
			for(int pass=n-1,pass>=0 && swapped ; pass--)
			{
			swapped=false;
				for(int i=0;i<=pass-1;i++)
				{
					if(A[i]>A[i+1])
					{
						// swap A[i] and A[i+1]
								int temp=A[i];
								A[i]=A[i+1];
								A[i+1]=temp;
								
						// set swapped to true..
						swapped =true;
						
					}
				}
				
			}
		
		
	}
	
		public static void main(String[] ar)
		{
				
			
		}
}





class Selection_Sort{
	
	void SelectionSort(int A[], int n)
	
	
	
}
