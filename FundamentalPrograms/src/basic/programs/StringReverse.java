package basic.programs;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="Ankita";
		
		char ch;
		for(int i=str.length()-1; i>=0;i--)
		{
			
			System.out.print(str.charAt(i));
		}

	}

}
