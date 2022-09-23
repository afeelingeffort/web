
import java.util.*;

public class TestProject_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input number : ");
        int num1 = sc.nextInt();

        switch (num1) {
            case 1:
                System.out.printf("resutl number : %d%n", num1);
            case 2:
                System.out.printf("resutl number : %d%n", num1 + 1);
            default:
                System.out.printf("MJ%n");
                break;
        }

        for (int n = 0; n < num1; n++) {
            while (n == 100) {
                num1 += n;
                break;
            }
        }

        int result;
        result = (num1 > 100) ? 1011 : 0;
        System.out.println("result number : " + result);

        int[] arr = new int[10];
        for (int n = 0; n < arr.length; n++) {
            arr[n] = num1 + n;
        }
        System.out.println("result arr : " + arr[0]);

    }
}
