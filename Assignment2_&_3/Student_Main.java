class Student{
	private int Rno;
	private String Name;
	void setData(int rno,String name){
		this.Rno = rno;
		this.Name = name;
	}
	void showData(){
		System.out.println(Rno+"  "+Name);
	}
}
class Student_Main{
	public static void main(String args[]){
	Student s = new Student();
	s.setData(100,"Parth");
	s.showData();
	}
}