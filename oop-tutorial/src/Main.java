import ecommerce.Person;

public class Main {
    public static void main(String[] args) {

//       Human human = new Human();
//       human.walk();
//       human.eyes = 2;
//
//       Animal a = new Human(); // ALLOWED
//       Human h = new Animal();  // NOT ALLOWED
//
//       Animal animal = new Animal();

//        Calculator c = new Calculator();
//        System.out.println(c.add(5,6));

//        ScienticCalculator scienticCalculator = new ScienticCalculator();
//        System.out.println(scienticCalculator.add(4,5));

//        Calculator c = new ScienticCalculator();
//        System.out.println(c.add(5,6));
//        System.out.println(c.x);

//        ArrayList<Integer> arr = new ArrayList<>();
//        List<Integer> l = new ArrayList<>();

     //   Person p = new Person();
//        p.sayHello();

//        IronMan ironMan = new IronMan();
//        ironMan.hello();
//
//        Avenger avenger = new IronMan();
//        avenger.hello();
//
//        XMen wolverine = new Wolverine();
//        wolverine.getAlmaMatter();
//        wolverine.getSpeciality();
//
//        Jean jean = new Jean();
//        jean.getAlmaMatter();
//        jean.getSpeciality();
//
//        XMen xmen = new XMen();
//        xmen.getSpeciality();

        Student kohli = new Student("Virat");
        System.out.println(Student.count);
        Student ronaldo = new Student("Ronaldo");
        System.out.println(Student.count);
        Student Roger = new Student("Roger");
        System.out.println(Student.count);

        Student.hello();



    }
}