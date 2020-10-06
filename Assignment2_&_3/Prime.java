import java.util.Scanner;

class Prime {

public static void main(String args [ ])
{
int n;
Scanner s=new Scanner(System.in);

System.out.println("Enter the number ");
n=s.nextInt();

if(n!=2 && n!=3 && n!=5 && n!=7 && n!=11) {

if(n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0 && n%11!=0 && n!=1) {
System.out.println("The Given number is prime number");
}
else {
System.out.println("The Given number is not prime number");
}

}
else {
System.out.println("The Given number is prime number");
}
}
}