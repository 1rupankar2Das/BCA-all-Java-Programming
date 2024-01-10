public class Prog7 {
    public static void main(String[] args) {
        int a = -1, b = 6, c = 1;
        if (a > b) {
            if (c > b) {
                System.out.printf("Smallest value is " + b);
            } else
                System.out.printf("Smallest value is " + c);
        } else {
            if (b < c) {
                System.out.printf("Smallest value is " + b);
            } else
                System.out.printf("Smallest value is " + a);
        }
    }
}
