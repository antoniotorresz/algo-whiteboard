import java.util.List;

public class AreAllPrimeNumbers {
    static Boolean areAllPrimes(final Integer... numbers) {
        for (Integer numberToValidate : List.of(numbers)) {
            if (!isPrime(numberToValidate)) {
                return false;
            }
        }
        return true;
    }
    static Boolean isPrime(final Integer number) {
        Integer decresedNumber = number - 1;
        if (decresedNumber <= 1) {
            return false;
        }
        while (decresedNumber > 1) {
            if (number % decresedNumber == 0) {
                return false;
            }
            decresedNumber--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Are all prime numbers?: " + areAllPrimes(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        System.out.println("Are all prime numbers?: " + areAllPrimes(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47));
    }
}