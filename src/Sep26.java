
public class Sep26 {
    public static void main(String[] args) {

        System.out.println(repeatLetters("Tim"));

        System.out.println(hasAlmostBob("ban"));
        System.out.println(hasAlmostBob("b0b"));

        System.out.println(join("canI", "kickIt", 4));

        System.out.println(isDoubled("tintin"));
        System.out.println(isDoubled("CAT"));


    }

    private static boolean isDoubled(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.substring(i, i +1).equals(word.substring(j, j +1)) ) count++;
            }
        }
        if (count == word.length()/2.0 ) return true;
            return false;
    }

    private static String join(String word, String conjunction, int n) {
        String joinedWord = "";
        for (int i = 0; i < word.length() - 1 ; i++) {
            joinedWord += word;
            joinedWord += conjunction;
        }
        return joinedWord += word;
    }


    private static boolean hasAlmostBob(String word) {
        for (int i = 0; i < word.length() - 2; i++) {

            if (word.substring(i, i + 1).equals(word.substring(i + 2, i + 3))
                    && (word.substring(i, i+1).equals("b"))) return true;
        }
        return false;
    }

    private static String repeatLetters(String word) {
        String repeatedWord = "";
        for (int i = 0; i < word.length(); i++) {
            repeatedWord += word.substring(i, i+1);
            repeatedWord += word.substring(i, i+1);

        }
        return repeatedWord;
    }
}
