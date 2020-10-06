import java.util.Scanner;

class PrimeNumber{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int  count,i,num; 
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the start value : ");
		int min= sc.nextInt();	
		
		System.out.print(" Please Enter the end value : ");
		int max = sc.nextInt();	
		
	
		System.out.println(" Prime Numbers from"  +min  +"to"  +max + "are : ");	
		for(num = min; num<= max; num++)
		{
			count = 0;
		    for ( i = 2; i <= num/2; i++)
		    {
		    	if(num% i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && num != 1 )
		    {
		    	System.out.print(num + " ");
		    }  
		}
	}
}