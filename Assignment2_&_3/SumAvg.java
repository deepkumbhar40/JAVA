import java.util.Scanner;

class SumAvg{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i, Sum = 0,avg;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			Sum = Sum + a[i]; 
		}		
		System.out.println("\n The Sum of All Elements = " + Sum);
	                      avg=Sum/Size;
                                           

                            System.out.println("\n The Average of all elements =" +avg);



}
}