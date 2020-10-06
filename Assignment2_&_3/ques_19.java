import java.util.Scanner;
class ques_19{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter max values of  series number : ");

		int num = sc.nextInt();

		int sum = ((num * (num+1) * (2 * num+1))/6);

		System.out.println("Total of series = "+sum);
    	
	}
}