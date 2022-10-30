package strings;

public class Reverse {

    public static void main(String[] args) {
        String name = "Google";
        int n = name.length();
        for (int i = n-1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
    }
}
