package oops;

public class Test extends Encap {

    public Test(String name, int age) {
        super(name, age);
    }

    @Override
    public String greet() {
        return "Hi " + super.getName();
    }

    public static void main(String[] args) {
        Test t = new Test("John", 20);
        System.out.println(t.getName() + " " + t.getAge());
        System.out.println(t.greet());
    }
}
