package empty05.part2;

public class Main {
	public static void main(String[] args) {

		// MobilePhone iPhone = new MobilePhone();
		MobilePhone iPhone = new MobilePhone(500);  //если поставить в
		MobilePhone huawei = new MobilePhone(350, "GG");

		// второй урок
		int rez = iPhone.costPhone(10);
		System.out.println(rez);

		MobilePhone lg = new MobilePhone();
		lg.copy(iPhone);
		
		lg.show();
		
		// iPhone.copy2(); вызывает метод copy2 который возвращает объкт ob копию IPhone

	//iPhone.copy2();
	//ob.show(); // ???? - ошибка
		
		MobilePhone dd = iPhone.copy2();
		
		dd.show();

	
		

	}
}