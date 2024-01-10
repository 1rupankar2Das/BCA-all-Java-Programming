//Java program to illustrate the
// concept of single inheritance 
 
class one 
{ 
 public void print_data() 
 { 
 System.out.println("Datas"); 
 } 
} 
 
class two extends one 
{ 
 public void print_for() 
 { 
 System.out.println("for"); 
 } 
} 
// Driver class 
public class Prog2
{ 
 public static void main(String[] args) 
 { 
 two g = new two(); 
 g.print_data(); 
 g.print_for(); 
 g.print_data(); 
 } 
}