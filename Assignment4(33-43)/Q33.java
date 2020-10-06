class Student{  
int rollno;  
String name;  

Student(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
 
}  
void display(){
System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class Q33{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit");  
Student s2=new Student(112,"sumit");  
s1.display();  
s2.display();  
}}  