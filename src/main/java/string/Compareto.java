package string;

public class Compareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="hello";
      String s2="hello";
      String s3="mello";
      String s4="flag";
      System.out.println(s1.compareTo(s2));
      System.out.println(s1.compareTo(s3));
      System.out.println(s1.compareTo(s4));
      
      
      //compareto casesentive
      
      String in= new String("JAVA");
      
      String on=new String("java");
      System.out.println(in.compareTo(on));
	}
	

}
