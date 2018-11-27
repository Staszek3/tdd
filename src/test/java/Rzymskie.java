//import java.util.HashMap;
//import java.util.Map;
//
//public class Rzymskie {
//    private static final int arabic[] = {1000, 500, 100, 50, 10, 5, 1};
//    private static final char roman[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
//    private static final int ROMAN_N = arabic.length;

//Converts arabic <number> to roman <result>
//Returns <result> or "", if an ERROR occurs.
//    public static String arabic2roman(int number)
//    {
//        int i = 0; //position in arabic and roman arrays
//
//        String result = "";
//
//        if ((number > 3999) || (number <= 0))
//        {
//            return result;
//        }
//
//        while ((number > 0) && (i < ROMAN_N))
//        {
//            if(number >= arabic[i])
//            {
//                number -= arabic[i];
//                result += roman[i];
//            }
//            else if ((i%2 == 0) &&
//                    (i<ROMAN_N-2) && // 9xx condition
//                    (number >= arabic[i] - arabic[i+2]) &&
//                    (arabic[i+2] != arabic[i] - arabic[i+2]))
//            {
//                number -= arabic[i] - arabic[i+2];
//                result += roman[i+2];
//                result += roman[i];
//                i++;
//            }
//            else if ((i%2 == 1) &&
//                    (i<ROMAN_N-1) && //4xx condition
//                    (number >= arabic[i] - arabic[i+1]) &&
//                    (arabic[i+1] != arabic[i] - arabic[i+1]))
//            {
//                number -= arabic[i] - arabic[i+1];
//                result += roman[i+1];
//                result += roman[i];
//                i++;
//            }
//            else
//            {
//                i++;
//            }
//        }
//
//        return result;
//    }

//Converts roman <number> to arabic
//Returns <result> or -1, if an ERROR occurs.
  /*  public static int roman2arabic(String number)
    {
        int i = 0, //position in arabic and roman arrays
                j = 0, //position in number
                result = 0,
                length = 0;

        length = number.length();

        while ((j<length) && (i<ROMAN_N))
        {
            if(number.charAt(j) == roman[i])
            {
                result += arabic[i];
                j++;
            }
            else if ((i%2 == 0) &&
                    (i<ROMAN_N-2) && // 9xx condition
                    (j<length-1) &&
                    (number.charAt(j) == roman[i+2]) &&
                    (number.charAt(j+1) == roman[i]))
            {
                result += arabic[i] - arabic[i+2];
                j += 2;
                i++;
            }
            else if ((i%2 == 1) &&
                    (i<ROMAN_N-1) && //4xx condition
                    (j<length-1) &&
                    (number.charAt(j) == roman[i+1]) &&
                    (number.charAt(j+1) == roman[i]))
            {
                result += arabic[i] - arabic[i+1];
                j += 2;
                i++;
            }
            else
            {
                i++;
            }
        }

//there was an error during conversion
        if (i == ROMAN_N)
        {
            result = -1;
        }

        return result;
    }
*/

//    //Wpolne rozwiązanie
//    private static final Map<Character, Integer> romanNumbers = new HashMap<>();
//
//    public int Convert() {
//        romanNumbers.put() ('I', 1);
//        romanNumbers.put() ('V', 5);
//        romanNumbers.put() ('X', 10);
//        romanNumbers.put() ('L', 50);
//        romanNumbers.put() ('C', 100);
//        romanNumbers.put() ('D', 500);
//        romanNumbers.put() ('M', 1000);
//
//    }
//    //zastąpiono poniższym codem
//       /* public int roman2arabic (String inputNumber){
//        if((inputNumber==null)||inputNumber.trim().isEmpty())
//                    return 0;
//        long numberOfInvalidChars=inputNumber.chars()
//                .mapToObj(c->(char)c)
//                .filter(c->!romanNumbers.containsKey(c))
//                .count();
//        if(numberOfInvalidChars>0)
//            return 0;
//            */
//       for(int i = 0; i<inputNumber.lengh();int++){
//        if (!romanNumbers.containsKey(inputNumber.charAt(i)))
//            return 0;
//    }
//}

//     1. Jeżeli String (liczba rzymska jest pusta), to zwróć 0.
//        2. Czy liczba rzymska zawiera wyłącznie cyfry rzymskie (I, V, X, L, C, D, M). Jeżeli nie, to zwróć 0.
//        3. Jako użytkownik mogę przekonwertować pojedynczą cyfrę rzymską.
//        4. Jako użytkownik mogę przekonwertować liczbę rzymską, ale z cyframi ułożonymi w kolejności nie rosnącej(np. II, VV, LX, MC, itd.)
//        5. Jako użytkownik mogę przekonwertować liczbę rzymską z dowolnie ułożonymi cyframi.

import java.util.HashMap;
import java.util.Map;

public class Rzymskie {

    private static final Map<Character, Integer> romanNumbers = new HashMap();

    public Rzymskie() {
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);
    }

    // Metoda zwraca liczbę rzymską w układzie dziesiętnym (czyli po arabsku)
    public int roman2arabic(String inputNumber) {
        if (!isValid(inputNumber)) //Sprawdzam czy podana liczba rzymska jest poprawna
            return 0;

        char[] romanInputChars = inputNumber.toCharArray(); //Konwertuję liczbę rzymską to zabliczy pojedynczych cyfr

        int i = 0; //Licznik do przechodzenia po tablicy z cyframi arabskimi
        int sum = 0; //Obliczona liczba arabska, na początku zero

        while (i < romanInputChars.length) {
            if (i == romanInputChars.length - 1) {
                sum += romanNumbers.get(romanInputChars[i]);
                i++;
            } else {
                int firstNumber = romanNumbers.get(romanInputChars[i]); //Konwertuj cyfrę rzymską do arabskiej
                int secondNumber = romanNumbers.get(romanInputChars[i + 1]); //Konwertuj cyfrę rzymską do arabskiej

                if (firstNumber < secondNumber) { //Jeżeli pierwsza cyfra jest mniejsza od drugiej, np. 'IV'
                    sum += secondNumber - firstNumber; //Dla cyfr w kolejnośc mniejsza, większa odejmujemy od większej mniejszą
                    i += 2; //Dla cyfr w kolejności mniejsza, większa przechodzi nie do następnej cyfry, a dwie dalej
                } else { //Jeżeli pierwsza cyfra jest większa bądź równa drugiej, np. VI, lub VV
                    sum += firstNumber;
                    i++;
                }
            }
        }
        return sum;
    }

    private boolean isValid(String inputNumber) {
        if (inputNumber == null || inputNumber.trim().isEmpty()) //Podan liczba nie może być ani nullem, ani pusta
            return false;

        for (int i = 0; i < inputNumber.length(); i++) {
            if (!romanNumbers.containsKey(inputNumber.charAt(i))) //Każdy ze znaków musi być cyfrą rzymską
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String g = "XVIII";
        Rzymskie s = new Rzymskie();
        // int a= s.roman2arabic("XIV");
        //   System.out.println("Rzymska liczba XIV to "+a);
        System.out.print("Rzymska liczba " +g +" to");
        System.out.println(" napewno " + s.roman2arabic(g));
    }



}




