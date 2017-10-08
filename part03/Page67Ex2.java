package homework.part03;
//������� ��������� ������ �� 5 ����� �� 8 �������� � ������ ��
//��������� ����� ����� �� ������� [-99;99]. ������� ������ �� �����. �����
//�� ��������� ������ ������� �� ����� �������� ������������� ��������
//����� ������� (��� ������ �� ����� ��������).

public class Page67Ex2 {
	public static void main(String[] args) {

		// ������� ��������� ������ �� ��������� ����� �� ������� [-99;99]
		// (max - min + 1) + min c ��������� ������

		int[][] mas = new int[5][8];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 199) - 99; // [10;99] (max - min + 1) + min
			}

		}
		// ����� �������

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}

			System.out.println();
		}

		// ����� ������������ �������� �������� ������� � ������� �� �����

		//int temp = -100;
		int temp = mas[0][0];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > temp) {
					temp = mas[i][j];
				}
			}
		}

		System.out.println("�������� ���� �������� = " + temp);
	}

}
