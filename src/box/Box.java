package box;

public class Box {
    private double lenght;
    private double width;
    private double height;

    public Box() {
        this(10);
    }

    public Box(Box another) {
        this(another.height, another.lenght, another.width);
    }

    public Box(double lenght, double width, double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this(size, size, size);
    }

    public void setDimens(double lenght, double width, double height) {

        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public Box copy() {
        return new Box(this.lenght, this.width, this.height);
    }

    public void ShowInfo() {
        System.out.println(" Width: " + width + " lenght: " + lenght + " hight: " + height);
    }

    public double getVolume() {
        return lenght * width * height;

    }

    public void Showvalue() {
        double volume = lenght * width * height;
        System.out.println(volume);

    }

    public int Compare(Box another) {
        double currentValume = getVolume();
        double anotherValume = another.getVolume();
        int result;
        if (currentValume > anotherValume) {
            result = 1;
        } else if (currentValume < anotherValume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;

    }


}
