package homework.part08;

import java.util.LinkedList;

/*1). �������� ����� Student, ��������������� ���������� �� �����
�������� ������� getName() � � ��� ����� ������� getCourse(). ��������
����� printStudents(LinkedList students, int course), ������� �������� ������
��������� � ����� ����� � �������� � ������� ����� ��� ��������� �� ������,
������� ��������� �� ������ �����. ������������� ��� ����� (��� �����
�������������� �������� ������� ������� �������� ������ Student �
��������� �� � ������). �������� ������ union(LinkedList set1, LinkedList
set2) � intersect(LinkedList set1, LinkedList set2), ����������� ��������
����������� � ����������� ���� ��������. ������������� ������ ����
������� �� ���� �������������� ����������� ����������. (���
����������� �������� ��������������� �����, ��������� ��� ��������
��������� �� �������.) ���������� ��������� Comparable ���, �����
�������� ������������� �� ������ �����. ��������� ������, ��������� �����
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
