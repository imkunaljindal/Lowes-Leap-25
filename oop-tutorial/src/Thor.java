public class Thor implements Avenger{
    @Override
    public int getPower() {
        return 120;
    }

    @Override
    public void hello() {
        System.out.println("I am Thor");
    }
}
