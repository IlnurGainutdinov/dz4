import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> list){
        double result = 0;
        for (Number number : list) {
            result+=number.doubleValue();
        }
        return result;
    }
    
    public double mult(List<? extends Number> list) {
        double result = 1;
        for (Number number : list) {
            result *= number.doubleValue();
        }
        return result;
    }
    public double dev(double num1, double num2) {
        double result =1;
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Нельзя делить на ноль");;
        }
        return result;

    }




}
