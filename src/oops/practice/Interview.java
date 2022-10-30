package oops.practice;

public class Interview {

private String name;
private int age;
private double salary;

public Interview(String name, int age) {
    this.name = name;
    this.age = age;
    this.salary = 35000.465;
}

public String getName() {
    return this.name;
}


    public static void main(String[] args) {
        Interview i = new Interview("Shaman", 20);
        System.out.println(i.name);        
    }
    
}
