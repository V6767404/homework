
public class Les2Ex3 {

	// for, while

	public static void main(String[] args) {

		int n = 0; // n += 7; ��� ���� n= n+7

		for (int i = 0; i < 10; i++) { // �������������, �������, ��������
			System.out.println(i + " hello");
		}
		
	//	for (int i = 0, j=10; i < j; i++, j--)
			

		// for ������ ������������ ����� �������� ���������� ����������
		//while ����� ���� ����������
		
		while (n < 10) {
			System.out.println(n + " Hello");
			n++;
		}
		
		
		//������� ���������� ����� ������ 5+hello - ��� �������� "continue"
		
	/*	while (n < 10) {
			n++;
			if (n == 5) {
				continue;
			}
			System.out.println(n + " Hello");

		}*/

		//���� ������ �� ��������� �� break
		//����� ����� ����������� ���� n ���������� ����� ������ 10
		
		n=0;
		
		while (true) {
			n++;
			if (n == 5) {
				continue;
			}
			System.out.println(n + " Hello");
			if (n == 10) {
				break;
			}

		}

		// do while - �� ������� ���� ���� �������� ����� ���������
		
	// n=0;
		
		do {
			n++;
			System.out.println("hello");

		} while (n < 10);


	

	

	}

}
