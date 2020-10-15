import java.util.Scanner;
public class lr1_z2 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Введите число:");
int a = sc.nextInt();
sc.close();
int a1 = a%10;
int b1 = a/10;
int a2 = b1%10;
int b2 = b1/10;
int sum = a1 + a2 + b2;
System.out.println("Сумма цифр:" + sum);

}
	}
