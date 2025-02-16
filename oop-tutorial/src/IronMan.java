public class IronMan implements Avenger{
    @Override
    public int getPower() {
        return 90;
    }

    @Override
    public void hello() {
        System.out.println("I am Iron Man");
    }
}
