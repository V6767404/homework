package homework.part02;
//�������� ������ �� ���� �������� ����� �� 1 �� 99, �������� ��� ��
//����� � ������, � ����� ���� �� ������ �������� �� ����� ���� � ������, �� �
//�������� ������� (99 97 95 93 � 7 5 3 1)

public class Page61Ex2 {

	public static void main(String[] args) {

		int n = 100 / 2;
		int[] mas = new int[n];

		int m = 1;

		for (int i = 0; i < mas.length; i++) {
			mas[i] = m; //
			m = m + 2;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");

		}
		System.out.print("\n");

		// for (int i = mas.length-1; i = 0; i--) ���� �� �������� ������� �� ��������?

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[mas.length - 1 - i] + "\t");

		}
	}

}
