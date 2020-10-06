import java.util.*;


class StringReverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to reverse it: ");
		String str = sc.nextLine();
		StringBuffer sbr = new StringBuffer(str);
		
		System.out.println(sbr.reverse());
		
		
	}
}