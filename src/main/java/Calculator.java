import java.math.BigDecimal;

public class Calculator {
    public static String add(String first, String secund){
        BigDecimal firstNumber=new BigDecimal(first);
        BigDecimal secundNumber=new BigDecimal(secund);

        return firstNumber.add(secundNumber).toPlainString();

    }

    public static void main(String[] args) {
        System.out.println(add("1", "2"));

    }
}
