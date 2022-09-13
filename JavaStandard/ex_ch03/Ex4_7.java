package ex_ch03;

public class Ex4_7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num = 0;

        // 괄호{} 안의 내용을 5번 반복한다.
        for (int i = 1; i <= 5; i++) {
            num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
        }
    }

}
