package Singleton.Sample;

public class Singleton {
    private static Singleton singleton = new Singleton();
// private修饰构造方法，使得外部类无法通过new创建Singleton实例
    private Singleton(){
        System.out.println("生成了一个实例");
    }
//程序第一次调用 getInstance()时 Singleton类会被初始化
    public static Singleton getInstance(){
        return singleton;
    }
}
