package basic.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=23;
		boolean isPrime=true;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					isPrime=false;
				}
				
			}
			if(isPrime==false) {
				System.out.println("number is not prime");
			}
			else if(isPrime==true)
				System.out.println("number is prime");
	}

}
