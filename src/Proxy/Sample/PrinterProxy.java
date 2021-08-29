package Proxy.Sample;

public class PrinterProxy implements Printable{
    private String name; //名字
    private Printer real;  //本人

    public PrinterProxy(String name){ //构造函数
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if(real != null){
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String text) {
        realize();
        real.print(text);
    }

    private synchronized void realize(){
        if(real == null){
            real = new Printer(name);
        }
    }
}
