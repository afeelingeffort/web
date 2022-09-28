import java.util.*;

public class TestProject_5 {

    public void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int cnt;
        String strInput;
        while (true) {
            strInput = "";

            int op1;

            cnt = 0;

            strInput = inputOp(cnt++);

            String operator;
            System.out.print("input operator : ");
            operator = sc.next();
            strInput += operator;
            // printResult(strInput);

            int op2;
            System.out.print("input op1 : ");
            op2 = sc.nextInt();
            strInput += String.valueOf(op2);
            // printResult(strInput + "\n");

            printResult(calculator(op1, operator, op2));

            System.out.print("continue ??? (yes or no) : ");
            String ans = sc.next();
            if (ans.equals("no"))
                break;
        }

        System.out.println("finished!!!");
    }

    private String inputOp(int cnt) {
        String input = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("input op" + cnt + ":");
        input = sc.next();
        sc.close();

        return input;
    }

    private void printResult(String str) {
        System.out.println("input result : " + str);
    }

    private String calculator(int op1, String operator, int op2) {
        String result = "";

        switch (operator) {
            case "+":
                result = String.valueOf(op1 + op2);
                break;
            case "-":
                result = String.valueOf(op1 - op2);
                break;
            case "/":
                result = String.valueOf(op1 / op2);
                break;
            case "*":
                result = String.valueOf(op1 * op2);
                break;
            case "%":
                result = String.valueOf(op1 % op2);
                break;
            default:
                break;
        }

        return result;
    }

}
