package string;

public class Endswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="welcome java";
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.endsWith("java"));
		
		
		//Equals
		
		String s2="java selenium";
		String s3="welcome java";
		String s4="JAVA SELENIUM";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s4));
		
	}

}
