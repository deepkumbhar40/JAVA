import java.util.Scanner;

class Fah_to_Cel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter tempreature  in Fahrenheit");
		float F=sc.nextFloat();
		
		float c=5*(F-32)/9;
		
		System.out.println("Fahrenheit to Celsius=" +c); 
		
		
	}
}
	