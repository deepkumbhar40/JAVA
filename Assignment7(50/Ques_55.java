import java.util.Scanner;


class Ques_55{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to count words: ");
		String str = sc.nextLine().toLowerCase();
 
		
		int count=1;
		for(int i=0; i<str.length(); i++){
			if(!(str.charAt(i)>='a' && str.charAt(i)<='z') ){
				count++;
			}
		}
		System.out.println(count);
		
	}
}
