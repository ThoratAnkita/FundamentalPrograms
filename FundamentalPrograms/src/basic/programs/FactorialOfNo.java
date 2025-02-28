package basic.programs;

import java.util.Scanner;

public class FactorialOfNo {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to find its factorial");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		

	}

}
