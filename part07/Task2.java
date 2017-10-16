package homework.part07;

public class Task2 {
	public static void main(String[] args) {

		Class2 cl = new Class2();

		int[] mas1 = cl.createMas(); // создаем первый массив
		int[] mas2 = cl.createMas(); // создаем второй массив
		
		Class2.showMas(mas1);
		Class2.showMas(mas2);
		
		Class2.divMas(mas1,mas2);
		
	}

}
