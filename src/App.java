/**
 * @Created by Vyacheslav Omeniuk
 * Find the sum of the digits in the number 100! (i.e. 100 factorial) 
 * {Correct answer: 648}
 */

import java.math.*;

public class App {
    public static void main(String[] args){

        multiplication(100);
    }

    static void multiplication(int InputNum) {

        BigInteger resFactorial = BigInteger.ONE;
        int sumDigits_Factorial = 0;

        for (int i = 1; i <= InputNum; i++) {
            resFactorial = resFactorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(resFactorial);

        String number = String.valueOf(resFactorial);

        for (int i = 0; i <= number.length() - 1; i++) {
            int a = Integer.parseInt(String.valueOf(number.charAt(i))); // conversion
            sumDigits_Factorial += a;
        }
        System.out.println(sumDigits_Factorial);
    }
}
