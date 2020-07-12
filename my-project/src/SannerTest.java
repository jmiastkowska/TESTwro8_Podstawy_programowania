import java.util.Scanner;

public class SannerTest {
    public static void main(String... args){
        System.out.println("witaj w programie");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String string = scanner.next();
        System.out.println("Podaj pozycję znaku");
        int index = scanner.nextInt();
        System.out.println("ciąg" + string + " zawiera " + string.charAt (index) + " na pozycji " + index);
    }}