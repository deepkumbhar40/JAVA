class Animal { }  

class Ques_46 extends Animal
 {  
  
static void method(Animal a) {  
       Ques_46 d=(Ques_46)a;//downcasting  
       System.out.println(" downcasting Done");  
  }  
   public static void main (String [] args) {  
    Animal a=new Ques_46();  
    Ques_46.method(a);  
  }  
} 