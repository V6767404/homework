//������ - ������������� ����� ��������� ������ ���� ������

public class Les3Ex4 {
	public static void main(String[] args) {
		// System.out.println();

		// int a=4;
		// int b=7;
		// int c=2;
		// int d=9;

		int[] mas = new int[5]; // [0,0,0,0,0]

		System.out.println(mas); // � ���������� mas ��������� ���� ������ �� �������� ������, �� �� ��������

		// 0,1,2,3,4 ������! ��������� �� ������� ����� ��������� �� ������ ��������
		// ����� ���������� � �������

		System.out.println(mas[4]); // ���� 5-�� ����� ������ ��� ������� ����� ������ ��� ������� � �����

		// mas[2] = 56;

		// ����� ���� �������� ������� - ������ for (�������� while)
		for (int i = 0; i < mas.length; i++) { // mas.length - �������� - ������ ������
			System.out.print(mas[i] + "\t");
		}

		// �������� ������ ��������
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 11 + 5); // [5;15]
		}

		// ������ ���� ������� �������

		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= max) {
				max = mas[i];
			}
		}
		System.out.println();
		System.out.println(max);
		
		//

		int[] mas2 = { 43543, 543, 5, 345, 43, 543, 5, 435, 43, 543, 543, 5, 43, 534 };
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + "\t");
		}
	}
}
