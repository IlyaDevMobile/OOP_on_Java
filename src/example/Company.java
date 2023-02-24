package example;

public class Company {

    public static void main(String[] args) {
        Employees employees = new Employees("Иван", "Директор",50_000);
        System.out.println(employees.ShowInfo());
    }

}
