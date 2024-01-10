public class Prog12 {
    public static void main(String[] args) {
        int n = 3;
        String month = "Invalid Input";
        switch (n) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println("Month = " + month);
    }
}
