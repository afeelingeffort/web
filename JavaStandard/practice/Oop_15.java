class Video{
	private String num;
	private String title;
	private String actor;
	
	public Video() {}
	
	public Video(String num, String title, String actor) {
		this.num=num;	//지역변수를 멤버변수에 대입
		this.title=title;
		this.actor=actor;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num=num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor=actor;
	}
	
}
public class Oop_15 {

	public static void main(String[] args) {
		Video v1=new Video("1","반도","강동원");
		Video v2=new Video("2","나는 살아있다.","유아인");
		
	}

}
