package array;

import java.util.Scanner;

public class Add_EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of elements");
		n=s.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter all the elemants");
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			
		}
		System.out.println("odd numbers");
		
		for(int i=0;i<n;i++) {
			
		
		if(a[i]%2 !=0) {
			System.out.println(a[i] +"");
			
		}
		}
		System.out.println("");
		System.out.println("even numbers");
		for(int i=0;i<n;i++) {
			
			if(a[i]%2==0) {
				System.out.println(a[i]+ "");
			}
			
		}

	}

}
