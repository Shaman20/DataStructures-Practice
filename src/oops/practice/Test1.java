package oops.practice;

public class Test1 extends Interview {

    public Test1(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Test1 t = new Test1("Shaman", 20);
        System.out.println(t.getName());
    }
}
