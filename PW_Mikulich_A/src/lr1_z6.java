import java.util.Scanner;
public class lr1_z6 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("������� �����:");
int a = sc.nextInt();
sc.close();
if (a==0) {
	String ch = "������� �����";
	System.out.println(ch);
} if (( a%2 == 0 ) & (a>0)) {
	String ch = "�������������, ������ �����";
	System.out.println(ch);
}if (( a%2 == 0 ) & (a<0)) {
	String ch = "�������������, ������ �����";
	System.out.println(ch);
}if (( a%2 != 0 ) & (a>0)) {
	String ch = "�������������, �������� �����";
	System.out.println(ch);
}if (( a%2 != 0 ) & (a<0)) {
	String ch = "�������������, �������� �����";
	System.out.println(ch);
}

	}
}
