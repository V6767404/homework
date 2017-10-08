package homework.part04;

/*
1. ����� ������� ������������ ������, �������� table:
int table[ ] [ ] = new int[ 4] [ ];
table[0] = new int[7];
table[1] = new int[3];
able[2] = new int[5];
table[3] = new int[1];
���������� ����� ��������, � ���������� ��������� � ������ ������
�������� ��������� ������� � ��������� �� 1 �� 10.
2. ��������� ��� ������-������ ����������.
3. ������� ������ ������� (���� �� �������� ��� ������, � �� ������
��� ������� ) 
4. ���������� ����������� ������ �������, ����� �� ������ ���������
(��� ������).
5. ������� ������������ ������.
��� ������� table ��������� ����� ��������� ���:
table[0] = new int[1];
table[1] = new int[3];
table[2] = new int[5];
table[3] = new int[7];
*/

public class Page69Ex1 {
	public static void main(String[] args) {

		// 1. ������� ������������ ������
		int n = 6;
		int[][] mas = new int[n][];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = new int[(int) (Math.random() * 10 + 1)]; // ������ ���-�� ��������� � ������� �������� [1;10]

		}
		// 2. ��������� ��� ������-������ ����������.

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 41) - 20; // [-20;20]
			}
		}

		// 3. ������� ������ �������

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}

		// 4. ���������� ����������� ������ �������, ����� �� ������ ��������� (���
		// ������).
		// 5. ������� ������������ ������.

		// ���������� ����� ������� ��� ���������� ����� (i) � ����������� � ��
		// ��������� (math[i].length)

		// System.out.println(mas[1]);

		for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i].length > mas[j].length) {
					int[] temp = mas[i];
					mas[i] = mas[j];
					mas[j] = temp;
				}
			}
		}
		
		System.out.println("������ ������� �������������:");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
