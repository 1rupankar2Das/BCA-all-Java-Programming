import java.util.Scanner;
public class Prog9 {
    public static void main(String[] args) {
        int qnt;
        float price, amount;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter quantity");
        qnt = scn.nextByte();
        System.out.println("Enter Price");
        price = scn.nextFloat();
        amount = qnt * price;
        System.out.println("Total sales = "+amount);
    }
}
