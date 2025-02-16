public class Animal {

    int legs;
    int eyes;

//    Animal() {
//
//    }

    Animal(int legs) {
        this.legs = legs;
        System.out.println("Animal constructor is called");
    }

    public void walk() {
        System.out.println("I am walking");
    }
}
