package homework.part03;
//������� ��������� ������ �� 8 ����� �� 5 �������� � ������ ��
//��������� ����� ����� �� ������� [10;99]. ������� ������ �� �����.

public class Page67Ex1 {

	public static void main(String[] args) {

		// ������� ��������� ������ �� ��������� ����� �� ������� [10;99]

		int[][] mas = new int[8][5];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 90 + 10); // [10;99] (max - min + 1) + min
			}

		}
		// ����� �������

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}

			System.out.println();
		}

	}
}