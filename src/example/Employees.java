package example;

public class Employees {
    String name;
    String post;
    int salary;

    Employees(String name,String post, int salary){
        this.name = name;
        this.post = post;
        this.salary = salary;
    }
    String ShowInfo(){
        return " Имя: " + name + "\n Должность: " + post + "\n Зарплата: " + salary;

    }


}
