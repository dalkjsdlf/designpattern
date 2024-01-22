package designpattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Iterable<Book>{

	List<Book> books;

	public BookShelf(){
		books = new ArrayList<Book>();
	}
	
	public Book getBookAt(int index) {
		return this.books.get(index); 
	}
	
	public void addBook(Book book) {
		books.add(book);
	}

	public int getLength() {
		if(books == null) {
			return 0;
		}
		return books.size();
	}
	
	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}
}
