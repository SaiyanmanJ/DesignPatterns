package AbstractFactory.Sample.factory;

import java.util.ArrayList;
//Tray 是一个包含Link和Tray的类的容器
public abstract class Tray extends Item{
    protected ArrayList tray = new ArrayList(); //保存Item的具体实现类,比如Tray和Link

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }
}
