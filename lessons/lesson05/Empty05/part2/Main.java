package empty05.part2;

public class Main {
	public static void main(String[] args) {

		// MobilePhone iPhone = new MobilePhone();
		MobilePhone iPhone = new MobilePhone(500);  //���� ��������� �
		MobilePhone huawei = new MobilePhone(350, "GG");

		// ������ ����
		int rez = iPhone.costPhone(10);
		System.out.println(rez);

		MobilePhone lg = new MobilePhone();
		lg.copy(iPhone);
		
		lg.show();
		
		// iPhone.copy2(); �������� ����� copy2 ������� ���������� ����� ob ����� IPhone

	//iPhone.copy2();
	//ob.show(); // ???? - ������
		
		MobilePhone dd = iPhone.copy2();
		
		dd.show();

	
		

	}
}