package box;

public class WeightBox extends Box {

    private double weight;

    public WeightBox() {
        weight = 10;
    }

    public WeightBox(Box another, double weight) {
        super(another);
        this.weight = weight;
    }

    public WeightBox(double lenght, double width, double height, double weight) {
        super(lenght, width, height);
        this.weight = weight;
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Weight: " + weight);
    }
}
