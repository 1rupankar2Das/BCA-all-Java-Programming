//Java program to initialize the values from one object to another object. 
// copy constructor 
class Student2
{
    int id;  
    String name;  
    Student2(int i,String n)
{
    id = i;  
    name = n;  
}
Student2(Student s)
{
    id = s.id;  
    name =s.name;  
}
void display()
{
    System.out.println("Your ID:" + id);
    System.out.println("Your Name:" + name);
}
}
class Prog4
{
    public static void main(String args[])
    {
    Student2 s1 = new Student2(111,"Karan");  
    Student2 s2 = new Student2(s1);  
    s1.display();  
    s2.display();  

    }
}