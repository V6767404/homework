
public class Main {
	public static void main(String[] args) {

		MobilePhone iPhone = new MobilePhone(); // new - ������������ ��������� ������
												// ����� �� ���� ���������� ����������
				// ������ -�������� �������
				// � iPhone ���������� ������ ��� �� �������� � ��������
	
	System.out.println(iPhone);
	iPhone.cost =99999;
	iPhone.model = "X";
	System.out.println(iPhone.cost + " " + iPhone.model);
	
	MobilePhone huawei = new MobilePhone(); //������ ����� ������� ������ � ����� ������
	huawei.cost =650;
	huawei.model = "G";
	System.out.println(huawei.cost + " " + huawei.model);
	
/*	MobilePhone samsung = iPhone; //����������� ������ - �� ���� ��� ��������� 
	System.out.println(samsung.cost + " " + samsung.model);
	
	iPhone=null; //������� ������ . � �������� �������� ������. ����� ���������� iPhone �����������
	samsung=null; // � ��� ������ ������� ��������� ������ � ������ � ����� � ������� �����������
	//
*/	
	//System.out.println(samsung.cost + " " + samsung.model);
	
	
/*	iPhone.show();
	huawei.show();
	
	iPhone.costPhone(); 
	huawei.costPhone();
	
	iPhone.costPhone(2); //�� ��� ���������� � ����� - �������� ��������� - ��������� ����������
	huawei.costPhone(300);
	
	iPhone.test(56,3.14, "������");
*/	
					

	System.out.println("-----------");
	
	iPhone.show();
	huawei.show();
	
	System.out.println("-----------");
	
	iPhone.show();
	huawei.show();
	
	iPhone.copy(huawei); //������ ������ ������� �������� ����� ���������� ���������!!
							// ������ �� ������ ��� ��������	
	iPhone.costPhone(2); 
	huawei.costPhone(2);

}}
