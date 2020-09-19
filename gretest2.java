import java.util.Scanner ;

class gretest2
{	
public static void main(String args[])

{	

Scanner sc = new Scanner(System.in);	

System.out.println("Enter the numbers");	
int i1 = sc.nextInt();	
int i2 = sc.nextInt();	
int i3 = sc.nextInt();	
String s =(i1> i2 && i1> i3)? ( "I1 is greater"): i2>i3 ? (" I2  is greater") : ( " I3  is greater");
System.out.println(s);	
}}
