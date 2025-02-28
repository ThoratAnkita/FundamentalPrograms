package basic.programs;

import java.util.Scanner;

public class FibnacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Fibonacci series:");
		int a=0;
		System.out.println(a);
		int b=1;
		System.out.println(b);
		int c;
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		

	}

}
