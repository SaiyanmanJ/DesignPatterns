package Iterator.Sample;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index = 0;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index++);
        return book;
    }
}
