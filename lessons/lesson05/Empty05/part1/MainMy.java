package empty05.part1;

public class MainMy {

	public static void main(String[] args) {

		MobilePhoneMy iPhone = new MobilePhoneMy(); // new - ������������ ��������� ������
		// ����� �� ���� ���������� ����������
		// ������ -�������� �������
		// � iPhone ���������� ������ ��� �� �������� � ��������
		
		System.out.println(iPhone); //������� ������
		iPhone.cost = 500;
		iPhone.model = "X";
		System.out.println("iPhone " + iPhone.cost + " " + iPhone.model);

		MobilePhoneMy huawei = new MobilePhoneMy(); // ������ ����� ������� ������ � ����� ������
		huawei.cost = 350;
		huawei.model = "G";
		System.out.println("huawei " + huawei.cost + " " + huawei.model);

		MobilePhoneMy samsung = iPhone; // ����������� ������ - �� ���� ��� ���������
		System.out.println("samsung " + samsung.cost + " " + samsung.model);

		// iPhone=null; //������� ������ . � �������� �������� ������. ����� ����������
		// iPhone �����������
		// samsung=null; // � ��� ������ ������� ��������� ������ � ������ � ����� �
		// ������� �����������
		// System.out.println(samsung.cost + " " + samsung.model);

		iPhone.show();
		huawei.show();

		iPhone.costPhones();
		huawei.costPhones();

		iPhone.costPhones(2); // �� ��� ���������� � ����� - �������� ��������� - ��������� ����������
		huawei.costPhones(300);

		iPhone.test(56, 3.14, "������");

		System.out.println("-----------");

		
		 iPhone.show(); huawei.show();
		 
		System.out.println("-----------");
		  
		 iPhone.show(); huawei.show();
		 
		  iPhone.copy(huawei); //������ ������ ������� �������� ����� ���������� ������ ������ ���������!! 
		  // ������ �� ������ ��� �������� 
		  iPhone.costPhones(2);
		  huawei.costPhones(2);
		 
		// MobilePhone huawei = new MobilePhone(1, GGG); �� ������� ������������
	}

}
