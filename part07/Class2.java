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

	public static void divMas(int[] mas1, int[] mas2) { // ����� ������� ���� ��������,

		// mas1.int n = (mas1.length >= mas2.length) ? mas1.length : mas2.length;
		int[] tempmas;
		int n;
		if (mas1.length >= mas2.length) {
			n = mas1.length;
			tempmas = mas1;
		} else {
			n = mas2.length;
			tempmas = mas2;
		}

		int[] res = new int[n];
		int temp = 0;
		boolean cheak = false;

		for (int i = 0; i < n; i++) {
			temp = i;
			try {
				res[i] = mas1[i] / mas2[i];
			} catch (ArithmeticException e) {
				System.out.println("������� �� ���� �� ������� = " + temp);

			} catch (ArrayIndexOutOfBoundsException e) {
				cheak = true;
				System.out.println("������������ ������� �� ������� = "+ temp); 
				break; //���
				

			}

		}
		if (cheak) { //����������� ��� ������ ������������ �������
			for (int j = temp; j < n; j++) {
			 res[j] = tempmas[j]/2; }
		}
		showMas(res);
	}
}
