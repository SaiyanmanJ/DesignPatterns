package FactoryMethod.Sample.framework;

//工厂方法，
public abstract class Factory {
//    创建产品的方法有三种
//    1.抽象方法，交由子类实现；
//    2.默认方法，当子类不重写时，使用默认方法；
//    3.抛出异常，当子类不重写该方法，父类就会抛出异常，通知程序员子类没重写方法
    public abstract Product createProduct(String name);
    public abstract void registerProduct(Product product);

    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}
