import java.util.Random;

public class Calculator {
    private int a;
    private int b;

    public int add(int a, int b) {
        System.out.print("Addition result " + a + " and " + b + " is: ");
        return a + b;
    }

    public int substract(int a, int b) {
        System.out.print("Substraction result " + a + " and " + b + " is: ");
        return a - b;
    }

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(RANDOM.nextInt(), RANDOM.nextInt()));
        System.out.println(calculator.substract(RANDOM.nextInt(), RANDOM.nextInt()));
    }

}
