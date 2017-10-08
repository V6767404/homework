package homework.part02;
//�������� ������ �� 15 ��������� ����� ����� �� ������� [0;9].
//�������� ������ �� �����. ����������� ������� � ������� ������ ���������
//� �������� ��� ���������� �� ����� �� ��������� ������.

public class Page61Ex3 {

	public static void main(String[] args) {

		int[] mas = new int[15]; // �������� ������, � ������ ���������� 0

		// �������� ������ ��������
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 10); // [0;9] 
		}

		// ����� ���� �������� �������
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		// ������� ������ ����� (0 - ���� ������)
		int ammount = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				ammount++;
			}
		}
		System.out.print("������ = " + ammount);
	}
}
