package week1.day2;

public class CheckIsNumberPositive {
    public static void main(String[] args) {

        System.out.println("Positive Numbers:");
        for (int i = -2; i <= 10; i++) {
            if (i > 0) {
                System.out.println(i);
            }
        }

        System.out.println("Negative Numbers:");
        for (int i = -2; i <= 10; i++) {
            if (i < 0) {
                System.out.println(i);
            }
        }
    }
}