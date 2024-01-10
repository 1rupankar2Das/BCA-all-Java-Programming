// Java program to illustrate the
// concept of Multiple inheritance 
 
interface one 
{ 
 public void print_data(); 
} 
 
interface two 
{ 
 public void print_for(); 
} 
 
interface three extends one,two 
{ 
 public void print_data(); 
} 
class child implements three 
{ 
 
 public void print_data() { 
 System.out.println("Datas"); 
 } 
 
 public void print_for() 
 { 
 System.out.println("for"); 
 } 
} 
 
// Drived class 
public class Prog5
{ 
 public static void main(String[] args) 
 { 
 child c = new child(); 
 c.print_data(); 
 c.print_for(); 
 c.print_data(); 
 } 
}