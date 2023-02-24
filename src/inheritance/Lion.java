package inheritance;

public class Lion extends CatFamily {

    public Lion() {
        super(10, 10, true);
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println(" антилопу");
    }
}
