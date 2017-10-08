package homework.part04;
/*��������� ����� � ����� ������������� ��������� ������� A[N,
N], ����������� ��� ������� ����������*/

public class Page74Ex34 {
	public static void main(String[] args) {

		// ������� ��������� ������ ����������� [n,n] � ��������� ���������� �������
		// [-5;5]

		int n = 4;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 11) - 5; // [-5;5]
			}

		}
		// ����� �������

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}

			System.out.println();
		}

		// ������� ����� ��� ������� ���������� (� �������� ������������� ���������)
		
		int rem = 0;
		int sum = 0;
		int amount = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = rem; j < mas[i].length; j++) {
				if (mas[i][j] > 0) {              // ����� ������ -������� ������ ������� �������
					sum = mas[i][j] + sum;
					amount++;
					// System.out.println(amount);
				}

			}

			rem++;
		}
		System.out.println("����� �����. ��������� = " + sum);
		System.out.println("���-�� �����. ��������� = " + amount);
	}
}
