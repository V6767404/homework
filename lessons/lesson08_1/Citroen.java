package lesson8_1;

public class Citroen extends Cars {

	public String color;

	public Citroen(int cost, String model, String color) {
		super(cost, model); // передача управления на уровень выше
		this.color = color;
	}

	public void showCitroen() {
		System.out.println(cost + " " + model + " " + color);
	}

	public void show() {
		super.show(); // переопределение метода (из супер класса)
		System.out.print(" " + color);
		
		//прав клавишей -Sourse - Overide Imlement - можно так искать суперметоды для переопределения
	}
//второй урок
	public final void meth() { //final запрещает переопределять
		//может быть final поле - определяет константу public final int MAX=576 (сразу нужно проиницилиз)
		//static - будет одна единственная - иначе будет создаваться для всех Citroenov
		//final class - всего три может быть final вариантов
	}
//	public abstract void meth2(); //абстрактный метод - весь класс дб тогда абстактным
	//не имеет тело; по сути это шаблон для переопределения
	//противополож final - вы обязаны переопределить абстрактный метод

}
