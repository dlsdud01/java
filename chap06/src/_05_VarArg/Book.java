package _05_VarArg;

public class Book {
	String title;
	String writer;
	int price;
	
	String CreateTitle(String Inputtitle) {
		title = Inputtitle;
		return title;
	}
	String CreateWriter(String InputWriter) {
		writer = InputWriter;
		return writer;
	}
	int CreatePrice(int InputPrice) {
		price = InputPrice;
		return price;
	}
	void information() {
		System.out.println("책 제목 : " + title + "\n책 저자 : " + writer + "\n책 가격 : " + price);
	}
	
	public static void main(String args[]) {
		Book book = new Book();
		
		book.CreateTitle("해리포터");
		book.CreateWriter("J.K. 롤링");
		book.CreatePrice(6000);
		
		book.information();
	}

}
