package basic.programs;

public class ReplaceVowels {

	public static void main(String[] args) {
		String str="Ankita";
		String strnew=str.replaceAll("[AEIOUaeiou]","\\$");//using regex pattern so for avoiding
		//exception use escape sequence \\.
		System.out.println(strnew);
	}

}
