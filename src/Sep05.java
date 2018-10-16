import java.sql.SQLOutput;
import java.util.Arrays;

public class Sep05 {


    public static void main(String[] args) {


      longestStretchOfComposites(39857);



    }

    private static void longestStretchOfComposites(int num) {
        int tally = 0;
        int largestStretch = 0;
        int end = 0;

        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) tally = 0;
                else tally++;
            if (tally > largestStretch ) {
                largestStretch = tally;
                end = i;
            }

        }
        printLargestStretch(end, largestStretch);
    }

    private static void printLargestStretch(int end, int largestStretch) {
        for (int i = end - largestStretch + 1; i <= end ; i++) {
            System.out.print(i + " ");
        }
    }

    private static void updateLargestStretch(int largestStretch, int tally, int val) {
            int temp = tally;
            largestStretch = temp;

    }

    private static boolean isPrime(int val) {
        for (int j = 2; j < val; j++) {
            if (val%j == 0) return false;
        }
        return true;
    }

    private static double sumReciprocals(int val) {
        double sumSoFar = 0;
        for (int i = 1; i <= val; i++) {
            sumSoFar += 1/ (double)i ;
        }
        return sumSoFar;
    }


    private static Boolean isNarcissistic(int num) {
        int length = 1 + (int) Math.log10(num);
        int[] digits = new int[length];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = findIthDigit(num,i, length);
        }

        cubeArray(digits);
        if ( num == sumArray(digits)) return true;
            else return false;
    }

    private static int sumArray(int[] digits) {
        int sumSoFar = 0;
        for (int i = 0; i < digits.length; i++) {
            sumSoFar+=digits[i];
        }
        return sumSoFar;
    }

    private static void cubeArray(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int) Math.pow(digits[i], 3);
        }
    }

    private static Boolean allDigitsWork(int num) {
        int length = 1 + (int) Math.log10(num);
        int[] digits = new int[length];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = findIthDigit(num,i, length);
        }
        return testAllValsWork(digits);

    }

    private static boolean testAllValsWork(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 3 != 0) return false;
        }
        return true;
    }

    private static int findIthDigit(int num, int i, int length) {
        double a = num % Math.pow(10,length - i );
        double b = a / Math.pow(10, length - i  - 1);
        return (int) b;
    }


}
