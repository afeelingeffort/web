public class Book{
	
    public String title; // 책 이름 선언
    public String author; // 저자 이름 선언
    
    void show() { // 책 이름과 저자 이름을 보여주는 메서드. 
    	System.out.println(title + author);
    }
    
    public Book() { // 생성자 Book emptyBook = new Book();에서 호출됨.  
    	this("");
    	System.out.println("생성자 호출됨");
    }
        
    public Book(String title){ // 매개변수가 있는 생성자로서 Book loveStory = new Book("신데렐라"); 에서 호출됨. 
    	this(title, "작자미상");
    }
    

    public Book(String title, String author) { // 위의 생성자에서 title 과 author 받음.(?) 
		this.title = title;
		this.author = author;
	}
    
    
    public static void main(String[] args){
    	
        Book emptyBook = new Book();
        emptyBook.show();
    	
    	Book loveStory = new Book("신데렐라");
        loveStory.show();                
    }
}