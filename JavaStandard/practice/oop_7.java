class Circle{
	private double radius;
	private static double PI=3.141592;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		return radius*radius*PI;
	}
}
public class oop_7 {

	public static void main(String[] args) {
		Circle cc=new Circle(5);
		System.out.print(cc.getArea());
	}

}
