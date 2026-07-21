package Encapsulation_practice;

public class BookInformationMain {
	
	public static void main(String[] args) {
		
		BookInformation b = new BookInformation();
		b.setBookId(123);
		b.setBookName("The Power of Positive Thinking");
		
		System.out.println(b.getBookId());
		System.out.println(b.getBookName());
	}

}
