class Person{

    int age;
    String name;

    Person()
    {
        age=18;
    }
  
   void get(int age, String name)
   {
       this.age = age;
       this.name = name;
   }

    void display()
    {
         System.out.println("Age  and Name = "+ age + "  " + name);
 
    }
}

class PersonDemo{

    public static void main(String args[]){

      Person p = new Person();
      p.get(24, "Snehu");
      p.display();
      p.get(25, "Deepu");
      p.display();
    }
}