import java.util.Scanner;
public class lr1_z5 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("������� ������ �����:");
int a1 = sc.nextInt();
System.out.println("������� ������ �����:");
int a2 = sc.nextInt();
System.out.println("������� ������ �����:");
int a3 = sc.nextInt();
sc.close();
int min = a1;
if (min>a2) {
	min = a2;
} if (min>a3) {
	min = a3;
}
System.out.println(min);
}
	}