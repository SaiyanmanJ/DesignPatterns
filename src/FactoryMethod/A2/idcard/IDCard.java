package FactoryMethod.A2.idcard;

import FactoryMethod.A2.framework.Product;
//新的产品类
public class IDCard extends Product {
    private String owner;
    private int serial;
// 不写则包外使用必须使用工厂方法，不能new出IDCard
    IDCard(String owner, int serial){
        System.out.println("制作" + owner + "(" + serial + ")" + "的ID卡。");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "(" + serial + ")" + "的ID卡。");
    }

    public String getOwner(){
        return owner;
    }

    public int getSerial(){
        return serial;
    }
}
