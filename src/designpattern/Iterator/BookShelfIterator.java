package designpattern.Iterator;

public class BookShelfIterator implements Iterator<Book>{

	BookShelf bookshelf;
	int index = 0;
	
	public BookShelfIterator(BookShelf bookshelf) {
		this.bookshelf = bookshelf;
		int hashcode = this.hashCode();
		System.err.println("BookShelfIterator 생성 [" + hashcode + "]");
	}

	@Override
	public boolean hasNext() {
		int size = bookshelf.books.size();
		if(index < size) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Book next() {
		int curIndex = index;
		Book curBook = this.bookshelf.books.get(curIndex);
		
		if(!hasNext()) {
			System.err.println("there is no next index");
		}
		else {			
			index++;
		}
		
		return curBook;
	}

	
}
