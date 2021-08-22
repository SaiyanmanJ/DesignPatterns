package Iterator.Sample;

//Iterator模式
//实现Iterator接口中的方法, 注意这并不是适配器模式，因为BookShelf就没有实现Iterator的方法,它不具有Iterator的功能
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
