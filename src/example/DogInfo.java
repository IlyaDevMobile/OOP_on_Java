package example;

import example.Dog;

public class DogInfo {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Лора";
        dog1.viewdog = "Стаф";
        dog1.ves = 30;
        dog1.speed = 5;
        String result = dog1.getInfo();
        System.out.print(result);
        System.out.println("");
        dog1.Run();


    }

}
