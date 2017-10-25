package homework.part08;

import java.util.LinkedList;

/*1). Ќапишите класс Student, предоставл€ющий информацию об имени
студента методом getName() и о его курсе методом getCourse(). Ќапишите
метод printStudents(LinkedList students, int course), который получает список
студентов и номер курса и печатает в консоль имена тех студентов из списка,
которые обучаютс€ на данном курсе. ѕротестируйте ваш метод (дл€ этого
предварительно придетс€ создать дес€ток объектов класса Student и
поместить их в список). Ќапишите методы union(LinkedList set1, LinkedList
set2) и intersect(LinkedList set1, LinkedList set2), реализующих операции
объединени€ и пересечени€ двух множеств. ѕротестируйте работу этих
методах на двух предварительно заполненных множествах. (¬ам
понадобитс€ написать вспомогательный метод, вывод€щий все элементы
множества на консоль.) –еализуйте интерфейс Comparable так, чтобы
студенты сортировались по номеру курса. ѕроверить работу, использу€ класс
TreeSet.*/

public class Student {
	
	private String name;
	private int course;
	
	String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    int getCourse (){
        return course;
    }

    void setCorse(int course)  {
      this.course=course;
    }
	
	public void printStudents (LinkedList<String> students, int course) {
		for (String str : students) System.out.println(str);
			
			
		
	}
	
	

}
