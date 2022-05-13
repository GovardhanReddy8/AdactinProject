package java_Exams;

import java.awt.Container;
import java.util.HashMap;
import java.util.Iterator;

public class exam2 {
	public static void main(String[] args) {
		String s1="hgf jdhfgu sjfg kahgfv";
		char[] allchars = s1.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < allchars.length; i++) {
			char c= s1.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
				
			}else {
				hmap.put(c, 1);
			}
			
		}
		System.out.println(hmap);
		for (int i = 0; i < allchars.length; i++) {
			if (hmap.get(s1.charAt(i))==1) {
				
			}
			System.out.println("char:"+s1.charAt(i));
			break;
			
		}
		
	}

}
