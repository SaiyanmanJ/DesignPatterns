package Adapter.Sample2;

// 委托适配器
//旧类交由适配器类管理，并用旧类实现(抽象)父类的方法
public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
