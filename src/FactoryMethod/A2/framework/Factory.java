package FactoryMethod.A2.framework;
// 工厂类不用动
public abstract class Factory {
    public abstract Product createProduct(String owner);
    public abstract void registerProduct(Product product);

    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

}
