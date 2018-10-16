public class Oct11 {
    public static void main(String[] args) {
        // aka 2 strings problems

        System.out.println(abctest("123abc"));
        System.out.println(abctest("123.abc"));
        System.out.println(abctest("abc.123"));

        System.out.println(alternateStrings("abc", "xyz"));
        System.out.println(alternateStrings ("Hi", "There"));
        System.out.println(alternateStrings ("Thereee", "xxxx"));
    }

    public static String alternateStrings(String str1, String str2) {
        String returnStr = "";
        String maxStr;
        int irre = Math.min(str1.length(),str2.length());

        if (str1.length() == irre) maxStr = str2;
            else maxStr = str1;

        for (int i = 0; i < irre; i++) {
            returnStr += str1.substring(i, i + 1);
            returnStr += str2.substring(i, i+1);
        }
        returnStr += maxStr.substring(irre);
        return returnStr;
    }

    public static boolean abctest(String str) {
        int place = str.indexOf(".abc");
        if (place == - 1) return true;
            return false;
    }
}
