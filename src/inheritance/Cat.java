package inheritance;

public class Cat extends CatFamily{

    public Cat(){
        super(10,10,false);

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" вискас");
    }
}
