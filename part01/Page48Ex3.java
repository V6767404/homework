//����������� ����������� ���� ����������� ��������� �����
//���������� � ����������. ����� �� ����� � ������� break

public class Page48Ex3 {

	public static void main(String[] args) {

		int n = 20; // �������� �������� ����������
					// ��� �������� n>20 ��� �� ������� �����

		long calc = 1;
		int i = 1;

		while (true) {
			i++;
			calc = calc * i;
			System.out.println(calc + " ��������� " + i);
			if (i == n) {
				break;
			}

		}

	}

}
//if (number==0) {
//	fact =1;
//	break;

