
public class lr1_z9 {
	public static void main(String[] args){
		 
		int[] a = { 15, 10, 51, -6, -5, 3, -10, 34, 0, 32, 56, -12, 24, -52};
		
		for (int i=0; i<a.length; i++){
			System.out.print(a[i]+ ",");
		}
		System.out.println();
		
		int n = a.length;
	
		int temp;
 
		for (int i = 0; i < n/2; i++) {
		    temp = a[n-i-1];
		    a[n-i-1] = a[i];
		    a[i] = temp;
		}
		
		for (int i=0; i<a.length; i++){
			System.out.print(a[i]+ ",");
		}
	}
}