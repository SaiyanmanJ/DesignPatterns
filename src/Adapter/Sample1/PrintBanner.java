package Adapter.Sample1;

//类适配器
//继承自旧类，适用继承自旧类的方法实现新的接口的方法
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String name) {
        super(name);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
