package strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";

        if (s1.length() != s2.length()) {
            System.out.println("Not Equal");
        }
        else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    System.out.println("Not Equal");
                }
            }
        }
        System.out.println("Equal");
    }
}
