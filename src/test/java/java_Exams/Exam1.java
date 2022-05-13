package java_Exams;

import java.util.Iterator;


public class Exam1 {
	public static void main(String[] args) {
		
		String s1=" hgjhd jsdfhguakr kfsrhfburg kjghsegy";
		char[] allchars = s1.toCharArray();
		for (int i = 0; i < allchars.length; i++) {
			char c = s1.charAt(i);
			int count=0;
			for (int j = 0; j < allchars.length; j++) {
				if (c==allchars[j]) {
					count++;
					
				}
				
			}
			if (count==1) {
				System.out.println("first non-Repeating latter:"+c);
				break;
				
			}
			
		}
		
		
		
		
		
	}
}