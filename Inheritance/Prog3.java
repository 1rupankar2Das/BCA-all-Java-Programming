// Java program to illustrate the
// concept of Multilevel inheritance 
 
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
 
class three extends two 
{ 
 public void print_data() 
 { 
 System.out.println("Datas"); 
 } 
} 
 
// Drived class 
public class Prog3 
{ 
 public static void main(String[] args) 
 { 
 three g = new three(); 
 g.print_data(); 
 g.print_for(); 
 g.print_data(); 
 } 
}