public class Prog13 {
    public static void main(String[] args) {
        int level = 0;
        String levelString = "Beginner";
        switch (levelString) {
            case "Beginner":
                level = 1;
                break;
            case "Intermediate":
                level = 2;
                break;
            case "Expert":
                level = 3;
                break;
        }
        System.out.println("Your Level is  = " + level);
    }
}
