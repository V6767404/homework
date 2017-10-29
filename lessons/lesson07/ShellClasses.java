package lesson07_2;

import java.math.BigInteger;

public class ShellClasses {

	
		public static void main(String[] args) {

	/*		BigInteger bi1 = new BigInteger(
					"4658743658743265987234658743658765874326587436583276587432658743265874365");

			BigInteger bi2 = new BigInteger(
					"4658743658743265987234658743658765874326587436583276587432658743265874365");

			System.out.println(bi1.add(bi2));
			System.out.println(bi1.multiply(bi2));
			System.out.println(bi1.divide(bi2));
			System.out.println(bi1.subtract(bi2));
			System.out.println(bi1.pow(3000));*/

	

			
			 StringBuilder sb = new StringBuilder(); 
			 StringBuffer sf = new StringBuffer();
			 
			 System.out.println("gfdfdggd" + 5436456 + "gfdgfdsgfdgd" + "gfdgfdgfd" +	365345435);
			 
			 sb.append("gfdsghfdghfd");
			 sb.append("fdgfdgfdg").append(45345).append("fdgfdgfd");
			 
			 System.out.println(sb.toString());
			 
			 System.out.println(sb); // выводит тоже что и предыдуш и в чем сымсл?
			// String s = sb.toString();
			 

			
		//	 String s1 = new String("hello how are you my friend s"); 
		//	 String s2 = new String("helLo");
			 
		//	 System.out.println(s1.equals(s2)); 
		//	 System.out.println(s1.replace('l', '@')); //замена симвода на символ
		//	 System.out.println(s1.replace("ll", "!!!!!!!!!!!!!!!!!!!!!")); // замена части строки на часть
		//	 System.out.println(s1.substring(10, 20));//возвращает кусок строки из нашей строки 
		//	 System.out.println(s1.indexOf("a", 7)); //возвращает индекс определённого элемента по символу ? 
		//	 System.out.println(s1.charAt(2));  //возвращает символ по его индексу
			 
		//	 String [] mas = s1.split(" "); //разделяет строку на подстроки и заполняет массив строк
		//	 System.out.println(mas[2]);
			 
		//	 System.out.println(s1.indexOf("sssss"));
			 

			
	/*		//проверим есть ли в пароле цифры и заглавые буквы
			
			 String password = "fdkjfdg43gf"; 
			 
			 char [] mas = password.toCharArray();  //преобразование строки в массив символов
			 boolean bol1 = false, bol2 = false;
			 
			 for(int i = 0; i < mas.length; i++){ 
				 if(Character.isUpperCase(mas[i])){  
					 bol1	= true; } 
				 if(Character.isDigit(mas[i])){ 
					 bol2 = true; } 
				 }
			 
			 if(bol1 && bol2){ 
				 System.out.println(true); 
				 }else{ System.out.println(false);			 
				 }
			 */

		
		/*	 Character ch = new Character('h');
			 
			 System.out.println(Character.isLetter(ch));  //true
			 System.out.println(Character.isDigit(ch));		 //false
			 System.out.println(Character.isUpperCase(ch));  //false
			 System.out.println(Character.isLowerCase(ch));  //true
			 System.out.println(Character.isWhitespace(ch));  //false
			 System.out.println(Character.isLetterOrDigit(ch)); //true
			 System.out.println(Character.toUpperCase(ch)); //H
*/			 

			
		/*	 int a = 56;
			  
			 Integer in = new Integer(56); 
			 Integer in2 = new Integer(56);
			 System.out.println(a+a);
			 System.out.println(in+in2); // тоже 112 в чем глубокий смысл здесь Intiger ?
*/			  
			/* String s = "54364";
			 
			 int aa = Integer.parseInt(s); //преобразует строку вчисло //54364
			 
			 int g = Integer.valueOf("45"); //преобразует число в строку  - в чем отличие?
			  
			 System.out.println(aa);
			 System.out.println(g);*/

		}

	}
