package oops.practice;

public class Honda extends Vehicle {
    
    public void honk() {
        System.out.println("Beep");
    }

    public static void main(String[] args) {
        Vehicle v = new Honda();
        v.honk();
    }
}
