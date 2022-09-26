package ex_ch06;

class MyPoint3D extends Object {
    int x;
    int y;

    // Object클래스의 toString()을 오버라이딩
    public String toStirng() {
        return "x:" + x + ",y:" + y;
    }
}

public class OverrideTest2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyPoint3D p = new MyPoint3D();
        p.x = 3;
        p.y = 5;
        System.out.println(p.toString());
    }

}
