package java_Exams;

import java.util.Iterator;

public class Exam4 {
	public static void main(String[] args) {
		String s1="gh!ghf @hhgf4r3 kj2gh3h5&";
		char[] allchars = s1.toCharArray();
		int alphna=0;
		int digit=0;
		int symbol=0;
		int space=0;
		for (int i = 0; i < allchars.length; i++) {
			if (Character.isAlphabetic(allchars[i])) {
				alphna++;
				
					
				}else if (Character.isDigit(allchars[i])) {
					digit++;
				
			}else if (Character.isSpace(allchars[i])) {
				space++;
				
			}else {
				symbol++;
			}
		}
		System.out.println(""+alphna);
		System.out.println(""+digit);
		System.out.println(""+symbol);
		System.out.println(""+space);
	}

}
