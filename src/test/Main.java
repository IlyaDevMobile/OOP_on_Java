package test;

import example.Person;
import inheritance.Cat;
import inheritance.Lion;
import inheritance.Rectangle;
import inheritance.Triangle;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i <= 100 ; i++) {
            int number = random.nextInt(1,7);
            String result = String.format("Ваше число  %s ", number);
            System.out.println(result);

        }

    }





    }



