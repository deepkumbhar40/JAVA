import java.util.Scanner;
class Circle 
{
int rad;
double area;
void init(int rad)
{
this.rad=rad;
}

void calculateArea(int r)
{
area=3.14*r*r;
}
void display()
{
System.out.println("Area of Circle is=" +area);
}
}

class Q34
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Radius :");
int r1=sc.nextInt();

Circle c=new Circle();
c.init(r1);
c.calculateArea(r1);
c.display();
sc.close();
}
}
