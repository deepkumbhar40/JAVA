import java.util.Scanner;

class Employee{
    
    private int empNo;
    private int salary;
    static double totalSalary;
    static int totEmp;


    Employee(int sal){
        totEmp++;
        this.empNo=totEmp;
        this.salary=sal;
        totalSalary = totalSalary +sal;
    }

    public void display(){
       
        System.out.println("Total Emp : "+this.totEmp);
        System.out.println("Total Sal : "+this.totalSalary);
    }

}

class EmployeeDemo{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sal : ");
        int sal = sc.nextInt();
        Employee e1 = new Employee(sal);

        System.out.print("Enter sal : ");
        sal = sc.nextInt();
        Employee e2 = new Employee(sal);
        
        System.out.println("\n\nNo of Employees and their total salaries : ");
        e1.display();
        

    }

}