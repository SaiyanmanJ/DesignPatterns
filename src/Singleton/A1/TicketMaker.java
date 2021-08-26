package Singleton.A1;

public class TicketMaker {

    private static TicketMaker ticketMaker = new TicketMaker();

    private int ticket = 1000;

    private TicketMaker(){
        System.out.println("生成一个实例");
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }
// synchronized 修饰该方法使其能在多线程环境下工作
    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}
