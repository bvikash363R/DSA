public class StrPermutations {
    public static void printPermu(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermu(newStr, permutation + currChar);
        }
    }

    public static void main(String[] arg) {
        String str = "abc";
        printPermu(str, "");
    }
}
