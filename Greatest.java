import java.util.Scanner;
class Greatest {

public static void main (String args [ ])

{
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers : ");
x=sc.nextInt( );
System.out.println("Value of X = " +x);

y=sc.nextInt( );
System.out.println("Value of X = " +y);

z=sc.nextInt( );
System.out.println("Value of X = " +z);

if( x > y   && x > z )
{
System.out.println(x+"is greater than " + y + "and "  +z);
}
else if  ( y > z &&  z > x )
{
 System.out.println(y+"is greater than " + z +"and"  +x );


}
else
{
System.out.println(z+"is greater than " + x +"and"  +y);

}
}
}
