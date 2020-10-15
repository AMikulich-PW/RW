import java.util.Scanner;
public class lr1_z4 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("¬ведите число:");
int a = sc.nextInt();
sc.close();
if (a>0) {
	a++;
} if(a<0) {
	a--;
	a--;
} if (a==0) {
	a = 10;
}
System.out.println(a);
}
	}

