package Builder.A1;

//监控 内容提供者
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{
           "早上好。",
           "下午好。" ,
        });

        builder.makeString("晚上好");
        builder.makeItems(new String[]{
           "晚上好",
           "晚安。",
           "再见。",
        });

        builder.close();
    }
}
