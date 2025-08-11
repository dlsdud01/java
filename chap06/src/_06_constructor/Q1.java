package _06_constructor;

class Book {
	String title;
	int isbn;
	int price;
	
	Book() {
		this("해리포터", 0306406152, 9900);
	}
	Book(String title) {
		this(title, 0306406152, 9900);
	}
	Book(String title, int price) {
		this(title, 0306406152, price);
	}
	Book(String title, int isbn, int price) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
	}
	void info() {
		System.out.println("title : " + title);
		System.out.println("isbn : " + isbn);
		System.out.println("price : " + price);
	}
	
}
public class Q1 {

	public static void main(String[] args) {
		Book book = new Book();
		
		book.info();
		
		book = new Book("헝거게임", 12000);
		book.info();
		
	}

}
