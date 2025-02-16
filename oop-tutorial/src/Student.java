public class Student {

    String name;
    static int count;

    public static void hello() {
        System.out.println("Hello everyone");
    }

    Student(String name) {
        this.name = name;
        count++;
    }
}
