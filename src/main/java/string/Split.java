package string;

public class Split {
	
	public static void main(String[]args) {
		
	
	
	String s1="java string split method by javatpoint";
	String[] split = s1.split("\\s");
	for(String w:split) {
		System.out.println(w);
		
	}
	
	System.out.println("returning to words");
	for(String m:s1.split("\\s", 0)) {
		System.out.println(m);	
	}
	
	System.out.println("returning to words:");
	for(String w:s1.split("\\s", 1)) {
		System.out.println(w);
		
	}
	
	

}
}