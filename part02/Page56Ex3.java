package homework.part02;
//� ���������� a � b �������� ����� �����, ��� ���� b ������ a.
//�������� ���������, ������� ����� ������������ � �������� �� ����� �����
//��������������� ����� �� ������� [a;b].

public class Page56Ex3 {
	public static void main(String[] args) {
		int a = 4;
		int b = 10;
		System.out.println((int) (Math.random() * (b - a + 1)) + a); // [a;b] (max - min + 1) + min
		System.out.println((int) (Math.random() * (b - a + 1)) + a);
		System.out.println((int) (Math.random() * (b - a + 1)) + a);
		System.out.println((int) (Math.random() * (b - a + 1)) + a);
		System.out.println((int) (Math.random() * (b - a + 1)) + a);

	}

}
