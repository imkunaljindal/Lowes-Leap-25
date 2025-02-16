package ecommerce;

public class Person {

    private String name;
    private int age;

    String email;

    protected String pan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void sayHello() {
        System.out.println("Hello"+this.name);
    }
}
