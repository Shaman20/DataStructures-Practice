package oops;

public class Dog implements Animal {

    public void sound() {
        System.out.println("Barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
