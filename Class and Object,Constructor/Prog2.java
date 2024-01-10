//Program to demonstrate the use of default and  parameterized constructor.  
class Prog2
{  
    int id;  
    String name;  
    Student()
   {
      id = 12;
      name = "Sunita"; 
   }
    Student(int i,String n)
    {  
    id = i;  
    name = n;  
    }  
    
    void display()
    {
        System.out.println("Your ID:"+id+"and your Name:" + name);
    }  
  public static void main(String args[])
{  
    Student  s1 = new Student();  
    Student  s2 = new Student(222,"Aryan");  
    s1.display();  
    s2.display();  
   }     
}  

