class task08
{
	public static void removeDuplicate(int arr[], int n) 
	{
	    int j = 0;
	    int[] temp = new int[n];
	    
	    for (int i = 0; i < n-1; i++) 
	    {
	        if (arr[i] != arr[i+1]) 
	        {
	            temp[j] = arr[i];
	            j++;
	        }
	    }
	
	    temp[j++] = arr[n-1];
	
	    for (int i = 0; i < j; i++)
	    {
	    	arr[i] = temp[i];
	    }
	    
	    for (int i = 0; i < j; i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	
	}
	
	public static void main (String[] args)
	{
	    int arr[] = {1, 3, 5, 5, 7, 9};
	    int n = arr.length;
	    
	    if (n > 1)
	    {
	        removeDuplicate(arr, n);
	    }
	}
}