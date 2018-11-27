public class Silnia {
    public int calculate(int number) {
        if (number == 0) {
            return 1;
        } else {

            return number * calculate(number - 1);
        }
    }
}
