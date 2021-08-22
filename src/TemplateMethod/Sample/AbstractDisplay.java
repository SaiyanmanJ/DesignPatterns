package TemplateMethod.Sample;

// 不用接口是因为接口无法实现一些方法
public abstract class AbstractDisplay {

//    想要控制方法只被子类和同包类访问，可以用protected修饰方法
    public abstract void open();
    public abstract void print();
    public abstract void close();

// final修饰保证流程不会被子类修改
    public final void display(){
        open();
        for(int i = 0;i < 5;i++)
        {
            print();
        }
        close();
    }
}

//现在也可以用接口实现方法了，不过不能控制处理流程的访问权限
interface InterfaceDisplay{
    public abstract void open();
    public abstract void print();
    public abstract void close();

    default void display(){
        open();
        for(int i = 0;i < 5;i++)
        {
            print();
        }
        close();
    }
}

