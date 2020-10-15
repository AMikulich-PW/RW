public class lr1_z10 {
    public static void main (String[] args) {
    int arr[] = {15, 10, 0, -6, -5, 3, 0, 34, 0, 32, 56, 0, 24, -52};
    int n = arr.length;
 	{
 		int count = 0;  
	        for (int i = 0; i < n; i++)
	            if (arr[i] != 0)
	                arr[count++] = arr[i]; 
	        while (count < n)
	            arr[count++] = 0;
	    }
	        for (int i=0; i<n; i++)
	            System.out.print(arr[i]+",");
	    }
}
	
