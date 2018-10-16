import java.util.Arrays;


public class Aug24 {

    public static void main(String[] args) {


    int[] anArray=  {5, 5, 0, 0, 1, 0, 6, 3, 3};

    int[] anotherArray=  {5, 2, 5, 7, 4, 2, 4, 7, 0};


//    zeroesToStart(anArray);
//    System.out.print(Arrays.toString(anArray));
//
//    areConsecutiveParity(anArray);
//    leftShift(anArray);
//    groupsSame(anArray,5);
//    int answer = areClose(anArray,anotherArray);
//    System.out.print(answer);

//      System.out.println(countClumps(anArray));

        canSplit(anArray);



    }

    private static Boolean canSplit(int[] anArray) {
        for (int i = 0; i < anArray.length - 1 ; i++) {
           if(sumFrom(anArray, 0, i) == sumFrom(anArray, i + 1, anArray.length - 1)) return true;
        }
            if(sumFrom(anArray, 0, anArray.length - 1) == anArray[anArray.length - 1] ) return true;
        return false;
    }

    private static int sumFrom(int[] anArray, int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i ++) {
            sum = anArray[i];
        }
        return sum;
    }

    private static int countClumps(int[] anArray) {
        int counter = 0;
        int numToReplaceZero = 746305582;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] == 0) anArray[i] = numToReplaceZero;
        }

        for (int i = 1; i < anArray.length; i++) {
            if (anArray[i] == anArray[i-1]) anArray[i] = anArray[i] - anArray[i-1];
        }
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] == 0) counter++;
        }
        System.out.println(Arrays.toString(anArray));
        return counter;
    }

    private static int[] zeroesToStart(int[] anArray) {
        int counter = 0;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] == 0) {
                swap(anArray, i, counter);
                counter++;
            }
        }
        return anArray;
    }

    private static int[] swap(int[] anArray, int i, int counter) {
        int temp = anArray[i];
        anArray[i] = anArray[counter];

        return anArray;
    }

    private static int[] leftShift(int[] anArray) {
        int[] temp = new int[anArray.length - 1];
        for (int i = 1; i < anArray.length; i++) {
            temp[i-1] = anArray[i];
        }
        temp[anArray.length - 1] = anArray[0];
        return temp;
    }

    private static Boolean groupsSame(int[] anArray, int n) {
        int length = anArray.length;
        for (int i = 0; i < n; i ++) {
            if (anArray[i] == anArray[length - n]) return true;
        }
    return false;
    }

    private static Boolean areConsecutiveParity(int[] anArray) {
        for (int i = 0; i < anArray.length ; i++) {
            anArray[i] = anArray[i] % 2;
        }
        for (int i = 0; i < anArray.length - 2; i ++) {
            if ((anArray[i] == anArray[i+1]) && (anArray[i+1] == anArray[i+2])) {
                return true;
            }
        }
    return false;
    }



    private static int areClose(int[] anArray, int[] anotherArray) {
        int counter = 0;
        for (int i = 0; i < anArray.length; i++) {
            int difference = Math.abs(anArray[i] - anotherArray[i]);
            if ((difference != 0) && (difference < 3) ) {
                counter ++;
            }
        }
        return counter;
    }

    private static int sumElements(int[] anArray) {
        int counter = 0;
        for (int i = 1; i < anArray.length ; i++) {
            if ( (anArray[i] == 13 ) || (anArray[i-1]) == 13) {}
                else {
                    counter += anArray[i];
                 }
        }
        return counter;
    }

    private static int numEvens(int[] anArray) {
        int counter = 0;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] % 2 == 0 ) {
                counter ++;
            }
        }

        return counter;
    }


}
