package example;

public class Dog {
    String name;
    String viewdog;
    double ves;

    int speed;

    String getInfo(){
        return "Name: " + name +
                " Порода: " + viewdog +
                " Вес: " + ves;
    }



    void Run(){
        for (int i = 0; i < speed; i++){
            System.out.println("бегу");
        }
    }
}
