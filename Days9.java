import java.util.Scanner;
class Days9 {
public static void main ( String args [ ])
{
Scanner sc=new  Scanner(System.in);

System.out.println("Enter no of days : ");
int d=sc.nextInt();

int year=d/365;

int month=d/30;

System.out.println("No of Years's = " + year);

System.out.println("No of Months's = " + month);

System.out.println("No of Day's = " + d);
}
}