package basic.programs;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		
			System.out.println("Enter a number to check if it's palindrome or not:");
			Scanner s= new Scanner(System.in);
			int num=s.nextInt();
			String newnum= String.valueOf(num);
			String reverse= new StringBuilder(newnum).reverse().toString();
			
			if(num<0)
			{
				System.out.println("Not a palindrome because it is a negative number!");
			}
			else if(newnum.equals(reverse)) 
			{
				System.out.println("It is a palindrome number!");
			}
			else
			{
				System.out.println("It is not a palindrome number!");
			}
		}

	}
