public class Human extends Animal{

    int iq;

    Human() {
        super(4);
        System.out.println("Human constructor called");
    }

    public void think() {
        System.out.println("I am thinking....");
    }

    public void info() {
        System.out.println("Hi, I have these many eyes: " + super.eyes);
        super.walk();
    }
}
