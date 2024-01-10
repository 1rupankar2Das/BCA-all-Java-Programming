// example of creating a class and object.
class Student
{  
 int rollno;  
 String name;  
 void insert(int r, String n)
{  
  rollno=r;  
  name=n;  
 }  
 

void display()
{
System.out.println("Your Roll no : " +  rollno);
System.out.println("Your Name is : " + name); 

}  
}  

class Prog1
{  
 public static void main(String args[])
{  
  Student s1=new Student();  
  Student s2=new Student();  
  s1.insert(111,"Ayan");  
  s2.insert(222,"Ajay");  
  s1.display();  
  s2.display();  
 }  
}  


