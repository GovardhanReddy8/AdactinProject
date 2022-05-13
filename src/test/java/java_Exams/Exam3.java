package java_Exams;

public class Exam3 {
	public static void main(String[] args) {
		String s1="hgf hdgf hdgr jhdfg";
		char[] allchars = s1.toCharArray();
		for (int i = 0; i < allchars.length; i++) {
			if (s1.indexOf(s1.charAt(i))==s1.lastIndexOf(s1.charAt(i))) {
				System.out.println(""+s1.charAt(i));
				
			}
			
		}
	}

}
