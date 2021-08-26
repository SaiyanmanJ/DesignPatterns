package Singleton.A3_1;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton(){
        System.out.println("生成了一个实例。");
        slowdown();
    }
//多线程下无法保证只生成一个实例
    public static Singleton getInstance(){
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
