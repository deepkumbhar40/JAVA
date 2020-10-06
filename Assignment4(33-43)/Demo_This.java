class Demo{
    Demo()
    {
        
        System.out.println("Base constructor call..");
    }
   Demo(int i, int j)
   {
       this();
       int sum = i + j;
    System.out.println("sum ="+ sum);

   }

}

class Example extends Demo{

     Example()
     {
         this(2,3);
      System.out.println("baseclass constructor call..");
    }
   Example(int i, int j)
   {
       
       int mul = i * j;
    System.out.println("multiplication ="+ mul);

   }

}

class Demo_This{

    public static void main(String args[]){
    
    Example e = new Example();

    }
}
