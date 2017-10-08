package homework.part03;

//C������ ��������� ������ �� 7 ����� �� 4 ������� � ������ ��
//��������� ����� ����� �� ������� [-5;5]. ������� ������ �� �����.
//���������� � ������� �� ����� ������ ������ � ���������� �� ������
//������������� ���������. ���� ����� ����� ���������, �� ������� ������
//������ ������������� �� ���.

public class Page67Ex3 {
	public static void main(String[] args) {

		// ������� ��������� ������ �� ��������� ����� �� ������� [-5;5]
		// (max - min + 1) + min c ��������� ������

		int[][] mas = new int[7][4];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 11) - 5; // [-5;5] (max - min + 1) + min
			}

		}
		// ����� �������

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
		// ������� �� ����� ������ ������ � ���������� �� ������ ������������� ���������

		int temp = -4000;
		int k = 0;

		for (int i = 0; i < mas.length; i++) {

			int proiz = 1;
			for (int j = 0; j < mas[i].length; j++) {
				proiz = Math.abs(mas[i][j] * proiz);
			}
			System.out.println("������������ = " + i + "-�� " + proiz);

			if (proiz > temp) {
				temp = proiz;
				k = i;
			}
		}

		System.out.println("������ ������� ������ = " + k);
	}
}
