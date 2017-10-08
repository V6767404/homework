
public class Main {
	public static void main(String[] args) {

		MobilePhone iPhone = new MobilePhone(); // new - динамическое выделение памяти
												// слева по сути объявление переменной
				// справа -создание объекта
				// в iPhone находиться ссылка как по аналогии с массивом
	
	System.out.println(iPhone);
	iPhone.cost =99999;
	iPhone.model = "X";
	System.out.println(iPhone.cost + " " + iPhone.model);
	
	MobilePhone huawei = new MobilePhone(); //создан новый участок памяти и новая ссылка
	huawei.cost =650;
	huawei.model = "G";
	System.out.println(huawei.cost + " " + huawei.model);
	
/*	MobilePhone samsung = iPhone; //скопировали ссылку - по сути при изменении 
	System.out.println(samsung.cost + " " + samsung.model);
	
	iPhone=null; //удалили ссылку . В самсунге остается сслыка. Через переменную iPhone недоступное
	samsung=null; // а вот теперь удалена последняя ссылка и память в итоге с данными почиститься
	//
*/	
	//System.out.println(samsung.cost + " " + samsung.model);
	
	
/*	iPhone.show();
	huawei.show();
	
	iPhone.costPhone(); 
	huawei.costPhone();
	
	iPhone.costPhone(2); //то что передается в метод - аргумент принимаем - параметры возвращает
	huawei.costPhone(300);
	
	iPhone.test(56,3.14, "вававы");
*/	
					

	System.out.println("-----------");
	
	iPhone.show();
	huawei.show();
	
	System.out.println("-----------");
	
	iPhone.show();
	huawei.show();
	
	iPhone.copy(huawei); //каждый объект который вызывает метод передается автоматом!!
							// второй мы педаем как аргумент	
	iPhone.costPhone(2); 
	huawei.costPhone(2);

}}
