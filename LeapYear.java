import java.util.Scanner;
class LeapYear {

public static void main (String args [ ]) {
 Scanner sc =new Scanner (System.in);
System.out.println("Enter the year : ");
int year =sc.nextInt();

System.out.println("Entered year is = "  +year);

if(year%4==0 &&  year%100!=0 || year%400==0)
{
System.out.println("Given  year is Leap Year ="  +year);
}
else
{
System.out.println(" Given year is Not a Leap Year ="  +year);
}
}
}