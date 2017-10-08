package homework.part04;

/*������ ���������� �������. �������� ������� ������ �
������������ ��������� �� ������� ��������� �� ������� � ��������
�������.*/

public class Page74Ex36 {
	public static void main(String[] args) {

		// ������ ������������ ���������� �������

		int n = 5;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 10) + 1; // [1;10]
			}

		}
		// ����� �������

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}

			System.out.println();
		}

		int indStrZadan = 2; // ������� ������ ������ �� �������

		// ���������� ������� ������ � ������������ ��������� �� ���������

		int indStrIskom = 0;
		int temp = mas[0][0];

		for (int i = 1; i < mas.length; i++) {
			if (mas[i][i] > temp) {
				temp = mas[i][i];
				indStrIskom = i;
			}

		}
		System.out.println(
				"������ ������ � ���� ����. �� ��������� =" + indStrIskom + " ����� ������ =" + (indStrIskom + 1));

		// �� ������� ������ ������� ������ �������� � ���������

		int[] tempStr = mas[indStrZadan];
		mas[indStrZadan] = mas[indStrIskom];
		mas[indStrIskom] = tempStr;
		// � ������� ��� ����������� ������

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}

			System.out.println();
		}

	}
}
