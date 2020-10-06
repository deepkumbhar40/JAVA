import java.util.Scanner;

class MathOpe{

static int add(int a, int b){

    return a+b;
}
static int subtract(int a, int b){

return a-b;

}
static int multiply(int a, int b){

  return a*b;
}
static double power(double x, double y){

return Math.pow(x,y);

}
}

class Ques_35 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

   System.out.println("enetr value of X and  Y");
   
   int X = sc.nextInt();
   int Y = sc.nextInt();

   int ans = MathOpe.add(X,Y);
   System.out.println("sum = "+ ans);
    int ans1 = MathOpe.subtract(X,Y);
   System.out.println("subtract = "+ ans1);
       int ans2 = MathOpe.multiply(X,Y);
   System.out.println("multiplication = "+ ans2);

   System.out.println("enetr value of P and  Q");
   double P = sc.nextDouble();
   double Q= sc.nextDouble();

    double ans3 = MathOpe.power(P,Q);
   System.out.println("power = "+ ans3);

   }
}