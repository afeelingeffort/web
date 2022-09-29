package ex_ch06;

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable {
    void move(int x, int y); // public abstract가 생략됨

    void attack(Fightable f); // public abstract가 생략됨
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) { // 오버라이딩 규칙: 조상보다 접근 제어자가 좁으면 안된다.
        System.out.println("[" + x + "," + y + "]로 이동");
    }

    public void attack(Fightable f) {
        System.out.println(f + "를 공격");
    }
}

public class FighterTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Fighter f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());
    }

}
