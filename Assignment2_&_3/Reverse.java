import java.util.Scanner;
class Reverse  {

public static void main ( String args[ ] )
{

Scanner sc =new Scanner(System.in);
System.out.println("Enter the Number :");
int num =sc.nextInt( );

int reverse=0;
while(num!=0){
int dig=num%10;
reverse=reverse*10+dig;
num/=10;
}
System.out.println("Reversed Number: " + reverse);
}
}