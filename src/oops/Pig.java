package oops;

public class Pig extends Abstract{

    @Override
    public void honk() {
        System.out.println("Hey Ass");
    }

    public static void main(String[] args) {
        Abstract ab = new Pig();
        ab.honk();
    }
}
