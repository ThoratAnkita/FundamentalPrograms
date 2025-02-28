package basic.programs;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		System.out.println("Enter a number to check if it is prime or not:");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		
		int temp=0;
		if(num<=1)
		{
			System.out.println("Not prime");
		}
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0) 
			{
				temp=temp+1;
			}

	}
		if(temp>0)
			System.out.println("not prime number");
		else
			System.out.println("prime number");
	}

}
