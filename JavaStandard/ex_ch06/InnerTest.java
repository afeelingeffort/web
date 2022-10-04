package ex_ch06;

class AA {
    int i = 100;
    BB b = new BB();

    class BB {
        void method() {
            // AA a=new AA();
            // System.out.println(a.i);
            System.out.println(i);
        }
    }
}

// class CC{
// BB b=new BB();
// }

public class InnerTest {
    public static void main(String[] args) {
        // BB b=new BB();
        // b.method();
    }
}