package strings;

public class Rep {

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("Google");
        int n = name.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    name.deleteCharAt(i);
                }
            }
        }
        System.out.println(name);
    }
}
