import java.util.Scanner;
class Student{
	private static int rno;
	private  int rollno;
	private int percentage;
	
	Student(){
		this.rollno = ++rno;	
	}

	Student(int percentage ){
		this.rollno = ++rno;
		this.percentage = percentage;
	}

	void show(){
		System.out.println(" Rollno: "+rollno+" percentage: "+this.percentage);
	}
	
	int getRollNo(){
		return this.rollno;
	}
	
	int getPercentage(){
		return this.percentage;
	}


}




class CollegeStudent extends Student{
	private int sem;
	
	CollegeStudent(){
		this.sem = 1;	
	}

	CollegeStudent(int percentage ,int sem){
		super(percentage);
		this.sem =sem;
	}

	void show(){
		super.show();
		System.out.println(" Semester: "+this.sem);
	}


}

class SchoolStudent extends Student{
	private int className;

	SchoolStudent (){
		this.className = 1;
	}

	SchoolStudent (int cent,int className){
		super(cent);
		this.className = className;
	}

	void show(){
		super.show();
		System.out.println(" Class name: "+this.className);
	}

}
class Ques_45{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		Student s[] = new Student[4];

		for(int i=0; i<2; i++){//0 1

			System.out.println("Enter percentage: ");
			int cent = sc.nextInt();
			System.out.println("Enter Semseter: ");
			int sem = sc.nextInt();

			Student s1 = new CollegeStudent(cent,sem);
			
			s[i]= s1;
			
			 
		}

		for(int i=2; i<4; i++)
{

			System.out.println("Enter percentage: ");
			int cent = sc.nextInt();
			System.out.println("Enter class Name: ");
			int className = sc.nextInt();

			
			Student s1 = new SchoolStudent(cent,className);
			s[i]= s1;
			
			
			 
		}
		
		int count75=0;
		System.out.println(s.length);
		for(int i=0; i<s.length; i++){
			
			if(s[i].getPercentage() >75){
				count75++;
			}
			s[i].show();
		}
		
		System.out.println("Enter a roll no to search: ");
		int srch = sc.nextInt();
		
		for(int i=0; i<s.length; i++){
			if(srch == s[i].getRollNo()){
				System.out.println("Enter a roll no to search: ");
				s[i].show();
			}
		}
		
		for(int i=0; i<s.length; i++){
			if(s[i] instanceof SchoolStudent){
				System.out.println("School type: ");
				s[i].show();
			}
			else{
				System.out.println("College type: ");
				s[i].show();
			}
		}
		
		
		System.out.println("\n\n"+"Students with grade A as a score: "+count75);
		
		
		
		

			
		
	}
	
}