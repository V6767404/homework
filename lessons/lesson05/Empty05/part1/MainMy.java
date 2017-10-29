package empty05.part1;

public class MainMy {

	public static void main(String[] args) {

		MobilePhoneMy iPhone = new MobilePhoneMy(); // new - динамическое выделение памяти
		// слева по сути объявление переменной
		// справа -создание объекта
		// в iPhone находиться ссылка как по аналогии с массивом
		
		System.out.println(iPhone); //выведет ссылку
		iPhone.cost = 500;
		iPhone.model = "X";
		System.out.println("iPhone " + iPhone.cost + " " + iPhone.model);

		MobilePhoneMy huawei = new MobilePhoneMy(); // создан новый участок памяти и новая ссылка
		huawei.cost = 350;
		huawei.model = "G";
		System.out.println("huawei " + huawei.cost + " " + huawei.model);

		MobilePhoneMy samsung = iPhone; // скопировали ссылку - по сути при изменении
		System.out.println("samsung " + samsung.cost + " " + samsung.model);

		// iPhone=null; //удалили ссылку . В самсунге остается сслыка. Через переменную
		// iPhone недоступное
		// samsung=null; // а вот теперь удалена последняя ссылка и память в итоге с
		// данными почиститься
		// System.out.println(samsung.cost + " " + samsung.model);

		iPhone.show();
		huawei.show();

		iPhone.costPhones();
		huawei.costPhones();

		iPhone.costPhones(2); // то что передается в метод - аргумент принимаем - параметры возвращает
		huawei.costPhones(300);

		iPhone.test(56, 3.14, "вававы");

		System.out.println("-----------");

		
		 iPhone.show(); huawei.show();
		 
		System.out.println("-----------");
		  
		 iPhone.show(); huawei.show();
		 
		  iPhone.copy(huawei); //каждый объект который вызывает метод передается внутрь метода автоматом!! 
		  // второй мы педаем как аргумент 
		  iPhone.costPhones(2);
		  huawei.costPhones(2);
		 
		// MobilePhone huawei = new MobilePhone(1, GGG); по второму конструктору
	}

}
