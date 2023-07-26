package string;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="what do you know me";
System.out.println(s1.contains("do"));
System.out.println(s1.contains("what"));
System.out.println(s1.contains("hello"));


       String s2="hello ,good morning";
       
       boolean isContains=s2.contains("moring");
       System.out.println(isContains);
       
       //indexof
       int indexOf = s1.indexOf('o', 7);
       System.out.println(indexOf);
       
       //uppercase
       String upperCase = s1.toUpperCase();
       System.out.println(upperCase);
       
       String S3="HOW ARE YOU";
       String lowerCase = S3.toLowerCase();
       System.out.println(lowerCase);

	}

}
