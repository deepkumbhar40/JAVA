import java.util.Scanner;

class SimpleIntrest  {

public static void main (String args [ ] )
{

Scanner sc=new Scanner(System.in);

System.out.println("Enter Principle amt : ");
 float Prin=sc.nextFloat( );

System.out.println("Enter RAte of Intrest : ");
 float Rate=sc.nextFloat( );

System.out.println("Enter Time : ");
 float Time=sc.nextFloat( );

float SI =Prin*Rate*Time /100;

System.out.println("Simple Intrest="+SI);
}
}
