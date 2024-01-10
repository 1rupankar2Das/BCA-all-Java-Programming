//Java program to overload constructors  
class Student1
{  
    int id;  
    String name;  
    int age;  
    //creating constructor  
     Student1()
	{  

     }
    Student1(int i,String n)
    {  
        id = i;  
        name = n;  
    }  
    Student1(int i,String n,int a)
    {    
    id = i;  
    name = n;  
    age=a;  
    }  
    void display()
    {
       System.out.println("Your ID is:" + id);
       System.out.println("Your Name is :" + name);
       System.out.println("Your Age is :"+age);   
    }  
}  
class Prog3
   {
    public static void main(String args[])
    {
        Student1 s1 = new Student1(111,"Karan");  
        Student1 s2 = new Student1(222,"Aryan",25);  
        s1.display();  
        s2.display();  

    }
   }
