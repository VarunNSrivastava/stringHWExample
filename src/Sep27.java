public class Sep27 {
    public static void main(String[] args) {

        System.out.println(isCompletePhrase("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(isCompletePhrase("the quick brown fox jumps over the lazy dog"));

        System.out.println(garblePhrase("to be fair you have to have a very high iq to understand rick and morty"));
        System.out.println(garblePhrase("rinos sotros muy guapamos nos vemos a la casa de la familia"));
    }

    private static String garblePhrase(String phrase) {
        String scrambledPhrase = "";
        String words[]  = phrase.split(" ");
        for (String word: words) {
            word = shuffleMiddleValues(word);
            scrambledPhrase += (word + " ");
        }
        return scrambledPhrase;
    }

    private static String shuffleMiddleValues(String word) {
        char[] exp = word.toCharArray();
        for (int i = 0; i < (word.length() ) ; i++) {
            swapMids(exp);
        }
        return new String(exp);
    }

    private static void swapMids(char[] exp) {
        int val1 = (int) (1+ ((exp.length - 2) * Math.random())) ;
        int val2 = (int) (1+ ((exp.length - 2) * Math.random()));
        swap(exp,val1, val2);
    }


    private static void swap(char[] arr, int val1, int val2) {
        char temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }

    private static int isCompletePhrase(String phrase) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz ";
        int[] frequency = new int[26 + 1];
        int curLetter;
        for (int i= 0; i < phrase.length(); i++) {
            curLetter = alphabet.indexOf(phrase.substring(i, i +1));
            frequency[curLetter] ++;
        }
        return determineReturn(frequency);

    }

    private static int determineReturn(int[] frequency) {
        for (int i = 0; i <  26; i++) {
            if (frequency[i] == 0) return -1;
        }
        int sum = getSum(frequency);
        if (sum > 26) return sum - 26;
        return 0;
    }

    private static int getSum(int[] frequency) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum+= frequency[i];
        }
        return sum;
    }
}
