//Math � random

public class Les3Ex3 {

	public static void main(String[] args) {

		/*
		 * System.out.println(Math.pow(5,5)); // ���������� � �������. ��������� double
		 * System.out.println(Math.round(3.55)); //���������� =4
		 * System.out.println(Math.sqrt(121)); //���������� ������. ��������� double
		 * System.out.println(Math.abs(-56)); //���������� ��������
		 */

		// System.out.println(Math.random()); //[0;1)
		System.out.println(Math.random() * 9 + 1); // [1;9] (max - min + 1) + min

/*		System.out.println((int) (Math.random() * 9 + 1));
		System.out.println((int) (Math.random() * 9 + 1));
		System.out.println((int) (Math.random() * 9 + 1));
		System.out.println((int) (Math.random() * 9 + 1));
		System.out.println((int) (Math.random() * 9 + 1));*/

		System.out.println((int)( Math.random() * 22 - 11)); // [-10;10] (max -min +2)-(min+1)
		System.out.println((int)( Math.random() * 22 - 11)); // ��� ������ � ������������� ����������
		System.out.println((int)( Math.random() * 22 - 11)); 
		System.out.println((int)( Math.random() * 22 - 11)); 
		 
		System.out.println("");
	
		System.out.println((int)( Math.random() * 21) - 10); //��� ��� �� ������ ������� �� �� �������
		System.out.println((int)( Math.random() * 21) - 10);
		System.out.println((int)( Math.random() * 21) - 10);
		System.out.println((int)( Math.random() * 21) - 10);
		
		System.out.println("");	
	
		System.out.println((int)( Math.random() * 21 - 10)); // ����� "-10" ������� �� �������
		
		/*System.out.println((int)(Math.random() * 21) - 10);    // [-10; 10]  (max - min + 2) - (min + 1)
		System.out.println((int)(Math.random() * 21) - 10);
		System.out.println((int)(Math.random() * 21) - 10);
		System.out.println((int)(Math.random() * 21) - 10);
		System.out.println((int)(Math.random() * 21) - 10);*/
	}
}
