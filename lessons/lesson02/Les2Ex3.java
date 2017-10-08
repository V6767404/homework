
public class Les2Ex3 {

	// for, while

	public static void main(String[] args) {

		int n = 0; // n += 7; это тоже n= n+7

		for (int i = 0; i < 10; i++) { // инициальзация, условие, итерация
			System.out.println(i + " hello");
		}
		
	//	for (int i = 0, j=10; i < j; i++, j--)
			

		// for удобно использовать когда известно количество операторов
		//while когда кога неизвестно
		
		while (n < 10) {
			System.out.println(n + " Hello");
			n++;
		}
		
		
		//задание пропустить вывод строки 5+hello - для пропуска "continue"
		
	/*	while (n < 10) {
			n++;
			if (n == 5) {
				continue;
			}
			System.out.println(n + " Hello");

		}*/

		//таже задача но остановка по break
		//здесь будет бесконечный цикл n изначально будет больше 10
		
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

		// do while - по меньшей мере одна итерация будет выполнена
		
	// n=0;
		
		do {
			n++;
			System.out.println("hello");

		} while (n < 10);


	

	

	}

}
