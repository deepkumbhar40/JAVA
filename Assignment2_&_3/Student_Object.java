 class Student{
	 private int rno;
	 private String name;
	  static int count;
	 Student()
	 {
		 count++;
	 }
	 
	 void setData(int roll,String nm)
	 {
		 this.rno=roll;
		 this.name=nm;
	 }
	 void showData()
	 {
		 System.out.println("Roll no. is " +rno);
		 System.out.println("Name of Student is : " +name);
	 }
	 
	 
 }
 

	class Student_Object{
		public static void main(String ab[])
		{
			Student s1=new Student();
			s1.setData(100,"Parth");
			s1.showData();
			Student s2=new Student();
			Student s3=new Student();
			System.out.println("Total object created = "+Student.count);
		}
	}