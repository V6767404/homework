//� ������� ����� while � ��������� if ����������� �������� ����� �
//�������� �� (����� �� 1 �� 10).
//1-��������
//2-������
//� �.�

public class Page48Ex1 {
	public static void main(String[] args) {
		
		int n = 1;
		
	//	System.out.println(n % 2); ������ 1 % 2 =1

		while (n < 11) {
			
			if (n%2>0) {
				System.out.println(n + "-��������");
			} else {
			System.out.println(n + "-������");
			}
		n++;
		}
	
	}
}
			
	/*		int n = 0;

			while (n < 10) {
				n++;
				if (n == 5) {
					continue;
				}
				System.out.println(n + " Hello");
			}
				

*/

