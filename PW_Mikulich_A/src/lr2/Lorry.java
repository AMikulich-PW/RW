package lr2;

public class Lorry extends Car {
    double gryzPod;

    void start() {
        System.out.println("�������� ������");
    }

    void stop() {
        System.out.println("�������� �����������");
    }

    void printinfo() {
        System.out.println("����� ������: " + marka + "\n ������ ������: " + clas + "\n ��� ������: " + wt + "\n ���������������� ������: " + gryzPod + "\n �������� ������: " + motor.might + "\n ������������� ������: " + motor.maker);
    }
}
