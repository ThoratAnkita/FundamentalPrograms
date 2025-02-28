package basic.programs;

import java.util.Scanner;

public class ArmstrongRange {

	public static void main(String[] args) {
		
		//	Check Armstrong number between two integers.
		
		System.out.println("Enter the starting number for the range: ");
		Scanner s= new Scanner(System.in);
		int start=s.nextInt();
		
		System.out.println("Enter the ending number for the range: ");
		int end=s.nextInt();
		
		
			for(int num=start;num<=end;num++) {
				int lastDigit;
				int digits=0;
				int sum=0;
				int temp=num;
				
				while(temp>0)
				{
				temp=temp/10;
				digits++;
				}
				
				temp=num;
				
				while(temp>0) {
				lastDigit=temp%10;
				sum+=Math.pow(lastDigit, digits);
				temp=temp/10;
				}
				
				if(num==sum) 
				{
					System.out.println(num);
				}
				}
			}
		}
