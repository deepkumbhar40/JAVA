import java.util.Scanner;


class Series{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number in csf: ");
		String str = sc.nextLine();
		String arr[] =str.split(",");

		int sum=0;
		for(String i: arr){
			sum+=Integer.parseInt(i);

		}
		System.out.println("Sum is: "+sum);

	}
}