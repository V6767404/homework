package lesson8_2;

public interface Inter extends Inter2 {/* extends Inter2 */ // интерфейс может наследовать интерфейсы
	// прописываем абстрактыне методы только
	// то интерфейс шаблон класса
	// объект абстрактного класса создать нельзя
	// можно сразу писать void.. тк по дефолту абстрактн

	public abstract void meth1();

	public abstract void meth2();

	// можно создать здесь статич метод в интерфейса (с 8 java)
	// статич методы не переопределяться
	public static void meth3() {

	}
}