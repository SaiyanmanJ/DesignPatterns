package Bridge.A3;

public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl){
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }
//final 修饰防止子类重写
    public final void display(){
        open();
        print();
        close();
    }

}
