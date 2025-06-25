import java.util.List;

public class AreAllPrimeNumbers {
    static Boolean areAllPrimes(final Integer... numbers) {
        return List.of(numbers).stream().allMatch(AreAllPrimeNumbers::isPrime);
    }

    static Boolean isPrime(final Integer number) {
        Integer decreasedNumber = number - 1;
        if (number <= 1) {
            return false;
        }
        while (decreasedNumber > 1) {
            if (number % decreasedNumber == 0) {
                return false;
            }
            decreasedNumber--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Are all prime numbers?: " + areAllPrimes(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        System.out.println("Are all prime numbers?: " + areAllPrimes(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47));
    }
}
