public class Customer {

    String name;
    int age;
    String email;

    Customer() {
    }

    Customer(String name) {
        this.name = name;
    }


    void sayHello() {
        System.out.println(this);
        System.out.println("Hello "+name);
    }
}
