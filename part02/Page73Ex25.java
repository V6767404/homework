package homework.part02;

//�������� ������ �� 20-�� ������ ����� ��������� � �������� ���
//�� �����. ����������, ��� ������ � ������ ����� ������������������
//����� ��������, � ������ ��������� � ����� ���� ����������

public class Page73Ex25 {

	public static void main(String[] args) {
		int[] mas = new int[20];

		mas[0] = 0;
		mas[1] = 1;
		mas[2] = 1;

		for (int i = 3; i < mas.length; i++) {
			mas[i] = mas[i - 1] + mas[i - 2];
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}

	}

}
