//�������� ���� while ��������� ����� ������������������ 1, 4, 7,
//10� �� ��� ���, ���� �� ������������ �� �������� 300 ��� ����� 200.
//�������� ���������� ���� �����.

public class Page48Ex2 {

	public static void main(String[] args) {

		// if ( a > 10 && a > 20) - ���������� �
		// if ( a > 10 || a > 20) - ���������� ���
		// if (( a > 40 || a>10 ) && a > 30)

		int n = 1;
		int i = 0;
		int sum = 1;
		int cmp = 1;

		while (cmp <= 300 && sum <= 200) {
			i++;
			System.out.println(n);

			// System.out.println("�����= " + sum);
			// System.out.println("�����= " + cmp);

			n = n + 3;
			sum = sum + n;
			cmp = cmp * n;
		}

		System.out.println("���������� �����= " + i);

		// System.out.println("����� ���= " + sum);
		// System.out.println("������������ ���= " + cmp);
	}
}