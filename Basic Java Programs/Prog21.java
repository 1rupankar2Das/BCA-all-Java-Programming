import java.util.Scanner;
class Prog21 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Rollno:");
        int roll = sc.nextInt();
        System.out.println("Enter Your Name:");
        String name = sc.next();
        System.out.println("Enter Your Fee:");
        double fee = sc.nextDouble();
        System.out.println("Roll No:" + roll + "\n" + "Name:" + name + "\n" + "Fee:" + fee);
        sc.close();
    }
}
//	next()
//nextInt()
//nextFloat()
//nextDouble()
//nextBool()
//nextByte()
