import java.util.Scanner;

class Faculty{
	private int fId;
	private float fSalary;

	public void input(int fid){
		this.fId = fid;
	}

	public void printSalary(){
		System.out.println("Salary is: "+this.fSalary);
	} 

}

class FullTimeFaculty extends Faculty {
	private float basicSalary;
	private int allowance;

	public void input(int fid ){
		super.input(fid);
		
	}
	
	public FullTimeFaculty(float basicSalary, int allowance){
		this.allowance = allowance;
		this.basicSalary = basicSalary;
		calFtSal();
	}
	
	void calFtSal(){
		float result = this.basicSalary+this.allowance;
		
		System.out.println("\nFulltime Salary: "+result);
	}

}


class PartTimeFaculty extends Faculty{
	private int workingHour;
	private float ratePerHour;
	
	public void input(int fid ){
		super.input(fid);	
	}
	
	public PartTimeFaculty(int workingHour,float ratePerHour){
		this.workingHour = workingHour;
		this.ratePerHour = ratePerHour;
		calPtSal();
	}
	
	void calPtSal(){
		float result =this.workingHour*this.ratePerHour;
		
		System.out.println("\npart time salary: "+result);
		
	}
	
	
	
}


class  Ques_44{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data fulltime faculty: ");
		System.out.println("Enter faculty id: ");
		int fid = sc.nextInt();
		System.out.println("Enter basic salary: ");
		float bsal = sc.nextFloat();
		System.out.println("Enter allowance: ");
		int alw = sc.nextInt();
		
		Faculty f = new FullTimeFaculty(bsal,alw);
			f.input(fid);
		
			
		System.out.println("Enter data Part time faculty: ");
		System.out.println("Enter faculty id: ");
		fid = sc.nextInt();
		System.out.println("Enter working Hour: ");
		int wh = sc.nextInt();
		System.out.println("Enter rate per hour: ");
		float rph = sc.nextFloat();

		Faculty f1 = new PartTimeFaculty(wh,rph);
			f1.input(fid);
		}
	
}