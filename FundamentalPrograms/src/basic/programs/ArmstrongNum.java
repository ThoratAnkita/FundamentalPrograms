package basic.programs;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		//Checking if the given number is armstrong or not.
		System.out.println("Enter a number to check if it's armstrong or not: ");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		
		int temp=num; int digits=0; int lastDigit; int sum=0;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		System.out.println("No. of Digits are: "+digits);
		temp=num;
		while(temp>0) {
			lastDigit=temp%10;
			sum+=Math.pow(lastDigit, digits);
			temp=temp/10; //removes the lastdigit
		}
		if(sum==num) 
		{
			System.out.println("It is a Armstrong number!");
		}
		else
		{
			System.out.println("It is not an Armstrong number!");
		}
		
	}

}
