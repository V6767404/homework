package homework.part07;

public class TaskLes9 {

	public static void main(String[] args) {

		ClassLes9 cl = new ClassLes9();

		int[] mas1 = cl.createMas(); // ������� ������ ������
		int[] mas2 = cl.createMas(); // ������� ������ ������
		ClassLes9.showMas(mas1);
		ClassLes9.showMas(mas2);
		ClassLes9.divMas(mas1,mas2);
		//ClassLes9.showMas(mas1);
	}

}
