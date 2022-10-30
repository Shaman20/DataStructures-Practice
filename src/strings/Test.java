package strings;

public class Test {

    public static void main(String[] args) {

        String name = "Shaman";
        String temp = "" + name.charAt(0);

        for (int i = 0; i < name.length(); i++) {
            if (!temp.contains(String.valueOf(name.charAt(i)))) {
                temp += name.charAt(i);
            }
        }
        System.out.println(temp);
    }
}
