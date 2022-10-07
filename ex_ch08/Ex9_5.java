class Cardd{
	String kind;
	int number;
	
	Cardd(){
		this("SPADE",1);
	}
	
	Cardd(String kind, int number){
		this.kind=kind;
		this.number=number;
	}
	
	public String toString() {
		return "kind: " +kind+ ", number: "+number;
	}
}

public class Ex9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cardd c1=new Cardd();
		Cardd c2=new Cardd("HEART",10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
