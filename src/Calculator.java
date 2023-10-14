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
    public double dev(List<? extends Number> list) {
        double res = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            res = res / list.get(i).doubleValue();
        }
        return res;
    }





}
