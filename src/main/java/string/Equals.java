package string;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="mukesh";
		java.util.ArrayList<String>list=new java.util.ArrayList<String>();
		list.add("vicky");
		list.add("dinesh");
		list.add("mukesh");
		list.add("kavin");
		for(String str:list) {
			if(str.equals(str1)) {
				System.out.println("mukesh prsent");
				
			}
			
			
		}
		
	}

}
