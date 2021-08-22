package FactoryMethod.Sample.idcard;

import FactoryMethod.Sample.framework.Factory;
import FactoryMethod.Sample.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    @Override
    public Product createProduct(String name) {
        return new IDCard(name);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners(){
        return owners;
    }
}
