import java.util.Scanner;
public class lr1_z1 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Введите число:");
int a = sc.nextInt();
sc.close();
System.out.println("Последняя цифра числа:" + a%10);

}
	}
