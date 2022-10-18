
public class Oop_4 {
 
    private int x1 = 0;
    private int y1 = 0;
    
    public Oop_4 (int x1, int y1){
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public static void main(String[] args){
        Oop_4 cal = new Oop_4(10, 20);
        
        System.out.println("x1 : " + cal.x1);
        System.out.println("y1 : " + cal.y1);
    }
}
