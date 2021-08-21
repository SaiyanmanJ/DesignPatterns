package Iterator.Sample;
//书架类

public class BookShelf implements Aggregate{
    private Book[] books;
    private int index = 0;

    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int i){
        return books[i];
    }

    public void appendBook(Book book){
        books[index++] = book;
    }

    public int getLength(){
        return index;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
