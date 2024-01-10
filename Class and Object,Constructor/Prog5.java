class Student3
{
    int id;  
    String name; 
    Student3() {  }  
    Student3(int i,String n)
    {
        id = i;  
        name = n;  
    }
    void display()
    {
       System.out.println("Your ID:" + id);
       System.out.println("Your Name" + name);
    }  
}
class Prog5
{
    public static void main(String args[])
    {
            Student3 s1 = new Student3(111,"Karan");  
            Student3 s2 = new Student3();  
            s2.id=s1.id;  
            s2.name=s1.name;  
            s1.display();  
            s2.display();  
    }
}