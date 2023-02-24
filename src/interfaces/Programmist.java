package interfaces;

public class Programmist implements Driver, Worker{
    @Override
    public void work() {
        System.out.println("программист работает");

    }

    @Override
    public void drive() {
        System.out.println("Программист водит");
    }
}
