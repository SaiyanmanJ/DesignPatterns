package AbstractFactory.Sample.factory;

public abstract class Item {
//    protected修饰，只能同包以及子类才能访问，避免被修改
    protected String caption; //html的标题

    public Item(String caption){
        this.caption = caption;
    }

    public abstract String makeHtml();
}
