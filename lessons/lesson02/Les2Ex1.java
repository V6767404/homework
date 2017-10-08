public class Les2Ex1 {

	public static void main(String[] args) {
		int a = 56;

		String s = "rweoirweoir oirweir roiwe";

		// все типы данных прошли теперь операторы
		System.out.println(5 + 5);
		System.out.println(5 - 5);
		System.out.println(5 * 5);
		System.out.println(5 / 2); // по дефолту int
		System.out.println(5 / 2.0); // сдсь одно вещественное и результат double
		System.out.println(5 > 5);
		System.out.println(5 < 5);
		System.out.println(5 >= 5);
		System.out.println(5 <= 5); // операторы разделям пробелами по код конвеншн
		// Ctrl-Shift-F - автоматическое выравниваине кода
		
		System.out.println(5 == 5); //сравнение , не путать с присваиванием	
		System.out.println(5 != 5);
		
		System.out.println(5 % 2); //отсаток . хорошо для определения четности
		
		double d = 3.14;
		int c = (int)d; 
		System.out.println(c);
		double f=a; //такое без приведения работает
		
		
		

	}

}
