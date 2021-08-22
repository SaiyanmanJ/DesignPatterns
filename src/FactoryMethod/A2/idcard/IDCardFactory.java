package FactoryMethod.A2.idcard;

import FactoryMethod.A2.framework.Factory;
import FactoryMethod.A2.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
// 新的产品工厂类
public class IDCardFactory extends Factory {
    private HashMap database = new HashMap();
    private int serial = 100;

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    public void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        database.put(idCard.getSerial(), idCard.getOwner()); //编号和所有者之间的对应表
    }
}
