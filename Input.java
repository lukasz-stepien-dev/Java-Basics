import java.util.*;
public class Input {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Napisz co chcesz wyświetlić");
        String text = in.nextLine();
        System.out.println(text);
        System.out.println("Ile masz lat?");
        int age = in.nextInt();
        System.out.println("Za rok będziesz miał: " + (age+1) + " lat");
    }
}
