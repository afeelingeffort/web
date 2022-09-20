import java.util.*;

public class TestProject_1 {

    public static void main(String[] args) {
        int a = 10, b = 30;
        System.out.println("input number: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if (a == 10) {
            a = 20;
        } else {
            a = 50;
        }

        b = scanner.nextInt();
        System.out.printf("%d", a + b);
    }
}
