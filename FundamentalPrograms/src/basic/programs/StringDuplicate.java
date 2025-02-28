package basic.programs;

class DuplicateException extends Exception{
	public DuplicateException() {
		super("String contains duplicates!");
	}
}

public class StringDuplicate{
	

	public static void main(String[] args) throws DuplicateException{
		
		try {
		String str="Success";
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				System.out.println(str.charAt(i));
				throw new DuplicateException();
			}
			
		}
		

	}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
