package AbstractFactory.Sample.factory;

public abstract class Factory {
//    根据工厂类名生成具体实例
    public static Factory getFactory(String classname){
        Factory factory = null;
        try{
            factory = (Factory)Class.forName(classname).newInstance();
        }catch(ClassNotFoundException e){
            System.out.println("没有找到 " + classname + " 类。");
        }catch(Exception e){
            e.printStackTrace();
        }

        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
