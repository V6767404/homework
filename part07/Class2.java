package homework.part07;

// ������� ����� � ������� ������� ����, ������� �������� �������� ���� int.
// ������� ����� � ���� ������, ������� ������ � ��������� ������. ������ ������ 
// �� ���������� ��������� �� 5 �� 15.
// ��������� ������ ���������� �� ��������� �� -5 �� +5.
// ������ �����, ������� ��������� ��� ���� ������� � �������� �� ������.
// ����� ��������� �������: ������ ������� ������� ������� ����� �� ������ ������� ������� ������� � ��.
// 
// � ����� �������� ������, ������� ����� ����������. 
// 
// � ������ ������ ������� �� ���� �� ���������� �  ���, ��� ���� ������ � ���������� ������ 
// ������ ���������� ��������.
// � ������� ������� ������ �� ������� �������, ����������� � ������ ������ � �Ѩ.
// 
// ��������, ������� �� ���������� ��-�� ������ �� ������� �������, ����� �� 2.
//

public class Class2 {

	public int mas[];

	public int[] createMas() { // �������� �������

		int n = (int) (int) (Math.random() * 11) + 5; // �����-�� ��������� �������� �� 5 �� 15
		mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 11) - 5; // random [-5;5]
		}
		return mas;
	}

	public static void showMas(int[] mas) { // ������� ������
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
	}

	public static void divMas(int[] mas1, int[] mas2) { // ����� ������� ���� ��������

		int n = (mas1.length >= mas2.length) ? mas1.length : mas2.length; // ���� n ��������� ������ ����� ��������
																			// ������� ����� ������������
		int[] res = new int[n];
		int temp = 0;

		try {

			for (int i = 0; i < n; i++) {
				temp = i;
				res[i] = mas1[i] / mas2[i];

			}

		} catch (ArithmeticException e) {
			System.out.println("������� �� ���� �� ������� = "+temp);
			

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������������ �������");
			

		}
		showMas(res);
	}
}
