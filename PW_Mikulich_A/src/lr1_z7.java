import java.util.Scanner;
public class lr1_z7 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("������� ��� ������(905,194,491,800):");
int a = sc.nextInt();
sc.close();
if (a==905) {
	double st = 4.15*10;
	System.out.println("������. ��������� ���������:" + st);
}if (a==194) {
	double st = 1.98*10;
	System.out.println("������. ��������� ���������:" + st);
}if (a==491) {
	double st = 2.69*10;
	System.out.println("���������. ��������� ���������:" + st);
}if (a==800) {
	double st = 5.00*10;
	System.out.println("�����. ��������� ���������:" + st);
}
}
}