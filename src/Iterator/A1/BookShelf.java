package Iterator.A1;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;
    public BookShelf(int initialsize){
        books = new ArrayList<>(initialsize);
    }

    public Book getBookAt(int i){
        return (Book)books.get(i);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
