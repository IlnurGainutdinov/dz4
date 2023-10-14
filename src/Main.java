import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(new ArrayList<>(Arrays.asList(6,2))));
        System.out.println(calculator.mult(new ArrayList<>(Arrays.asList(6,2))));
        System.out.println(calculator.dev(6,2));
    }
}