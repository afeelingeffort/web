package ex_ch06;

class Outer3 {
    int value = 10; // Outer3.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("value:" + value);
            System.out.println("this.value:" + this.value);
            System.out.println("Outer3.this.value:" + Outer3.this.value);
        }
    } // Inner클래스의 끝
} // Outer3클래스의 끝

public class Ex7_16 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();
        inner.method1();
    }

}
