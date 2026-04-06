package week1.day2;

public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        for(int i=0;i<=8;i++){
             int thirdNumber = firstNumber + secondNumber;
             System.out.println(thirdNumber);
             firstNumber = secondNumber;
             secondNumber = thirdNumber;
            }
    }

}
