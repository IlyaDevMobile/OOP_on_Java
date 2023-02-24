package exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7/a;
            int c = Integer.parseInt("sfasfasf");

        }catch (ArithmeticException e1){
            System.out.println("Делить на ноль нельзя");

        } catch (Exception e){
            System.out.println("Исключение " + e.getClass());
        }

        System.out.println("hello");
    }
}
