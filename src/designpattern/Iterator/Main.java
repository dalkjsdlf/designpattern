package designpattern.Iterator;

public class Main {

	public static void main(String[] args) {
		
		BookShelf bookshelf = new BookShelf();
		bookshelf.addBook(new Book("1번책"));
		bookshelf.addBook(new Book("2번책"));
		bookshelf.addBook(new Book("3번책"));
		
		Iterator<Book> iterator = bookshelf.iterator();
		while(iterator.hasNext()) {
			Book book = iterator.next();
			System.err.println(book.getName());
		}
	}

}
