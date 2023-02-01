import java.lang.*;
public class TextFormatting {
    public static void main(String[] args)
    {
        String name = "Łukasz";
        int age = 20;
        String product = "t-shirt";
        double price = 6.50;
        String helloWorld = String.format("Hello %s!", name);
        System.out.printf(helloWorld);
        System.out.printf("%s buy %s for %,.2f and he is %d years old", name, product, price, age);
    }
}
