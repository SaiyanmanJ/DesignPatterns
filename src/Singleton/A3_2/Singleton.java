package Singleton.A3_2;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton(){
        System.out.println("生成了一个实例。");
        slowdown();
    }
//synchronized关键字给方法加锁使得多线程环境下保证只生成一个实例
    public static synchronized Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void slowdown(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){

        }
    }
}
