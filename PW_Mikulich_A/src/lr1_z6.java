import java.util.Scanner;
public class lr1_z6 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Введите число:");
int a = sc.nextInt();
sc.close();
if (a==0) {
	String ch = "Нулевое число";
	System.out.println(ch);
} if (( a%2 == 0 ) & (a>0)) {
	String ch = "Положительное, четное число";
	System.out.println(ch);
}if (( a%2 == 0 ) & (a<0)) {
	String ch = "Отрицательное, четное число";
	System.out.println(ch);
}if (( a%2 != 0 ) & (a>0)) {
	String ch = "Положительное, нечетное число";
	System.out.println(ch);
}if (( a%2 != 0 ) & (a<0)) {
	String ch = "Отрицательное, нечетное число";
	System.out.println(ch);
}

	}
}
