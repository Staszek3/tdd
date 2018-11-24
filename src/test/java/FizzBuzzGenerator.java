public class FizzBuzzGenerator {
    public String generateSingleSeg(int number) {

        // return //liczba, Fizz, Buzz, FizzBuzz
        if(number==0) {
            return String.valueOf(number);
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
                return "Buzz";
            } else if (number % 3 == 0){
            return "Fizz";
        } else return String.valueOf(number);
    }


    public String generateChain(int number) {
        // w forze wywołanie metody generateSingleSeg i sklejenie z tego stringa
        String result = "";
        for (int i = 0; i < number+1; i++) {
            //FizzBuzzGenerator b=new
            result += generateSingleSeg(i);
        }
        return result;
    }
}


