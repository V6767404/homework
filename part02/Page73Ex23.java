package homework.part02;
//�������� 2 ������� �� 5 ��������� ����� ����� �� ������� [0;5]

//������, �������� ������� �� ����� � ���� ��������� �������. ����������
//������� �������������� ��������� ������� ������� � ��������, ��� ������
//�� �������� ��� �������� ��������� ������ (���� ��������, ��� �� �������
//�������������� �����).

public class Page73Ex23 {
	public static void main(String[] args) {

		int[] mas1 = new int[5];
		int[] mas2 = new int[5]; //?? �������� �� � ��� ������������ ���� ���������� ��������� ��������� ��������

		// ������� � ������� ��� �������

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = (int) (Math.random() * 6); // [0;5]
		}
		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = (int) (Math.random() * 6); // [0;5]
		}
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + " ");
		}
		System.out.println();

		// ������� ������� ��������������� ��� ���� ��������
		
		int sumMas1 = 0;
		int sumMas2 = 0;
		for (int i = 0; i < mas1.length; i++) {
			sumMas1 = sumMas1 + mas1[i];
		}
		for (int i = 0; i < mas2.length; i++) {
			sumMas2 = sumMas2 + mas2[i];
		}
		System.out.println("����� ������� " + sumMas1);
		System.out.println("����� ������� " + sumMas2);

		int aveSumMas1 = sumMas1 / mas1.length;
		int aveSumMas2 = sumMas2 / mas2.length;
		
		// ���������� � ������� ���������
		
		if (aveSumMas1 == aveSumMas2) {
			System.out.print("������� ���� ������� � ������� = " + aveSumMas1);
		}
		if (aveSumMas1 > aveSumMas2) {
			System.out.print("������� ���� ������� ������ � = " + aveSumMas1);
		}
		
		System.out.print("������� ���� ������� ������ � = " + aveSumMas2);

	}

}
