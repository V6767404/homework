package homework.part02;
//�������� ������ �� 8 ��������� ����� ����� �� ������� [1;10].
//�������� ������ �� ����� � ������. �������� ������ ������� � ��������
//�������� �� ����. ����� �������� ������ �� ����� �� ��������� ������

public class Page73Ex22 {

	public static void main(String[] args) {

		// System.out.println((int) (Math.random() * 10)+1); //[1;10]

		int[] mas = new int[8];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) ((Math.random() * 10) + 1); // [1;10]
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		// ������ ��������� � �������� �������� �� 0 � �����
		int ammount = 0;
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 != 0) {
				mas[i] = 0;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}
