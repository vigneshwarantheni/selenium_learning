package string;

public class Indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="this is the indexof string";
		
		int index1=str1.indexOf("is");
		System.out.println(index1);
		int index2 = str1.indexOf("string");
		System.out.println(index2);

		System.out.println(index1+" "+index2);
		
		int index3 = str1.indexOf("of", 4);
		System.out.println(index3);
		
		//replace a string
		
		String replace = str1.replace('i', 'p');
		System.out.println(replace);
	}

}
