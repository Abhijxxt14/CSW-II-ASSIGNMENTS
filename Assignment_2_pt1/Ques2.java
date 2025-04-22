package assignment;
class Book{
	private int bookId;
	private String bookName;
	private int price;

public Book(int bookId ,String bookName,int price ) {
	this.bookId = bookId;
	this.bookName = bookName;
	this.price = price;
}
public int getBookId() {
	return bookId;
    }
public String bookName() {
	return bookName;
    }
public int getPrice() {
	return price;
    }
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
}
@Override
public boolean equals (Object obj) {
	if(this == obj) 
		return true;
	if (obj == null || getClass() != obj.getClass()) return false;
	Book book = (Book)obj;
	return bookId == book.bookId;
    }


}
public class Test {

	public static void main(String[] args) {
		Book book1 = new Book(25,"gigga",69);
		Book book2 = new Book(75,"niggga",96);
		if(((Book) book1).getPrice() > ((Book) book2).getPrice()) {
			System.out.println("book 1 is more expensive");}
			else if ( ((Book) book1).getPrice() < ((Book) book2).getPrice()) {
				System.out.println("book 2 is more expensive");
			}
			else {
				System.out.println("prcies are same ");
			}
		}
		
		
		
	}

