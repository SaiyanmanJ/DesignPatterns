package FactoryMethod.Sample.idcard;

import FactoryMethod.Sample.framework.Product;

public class IDCard extends Product {
    private String owner;
//    构造方法不是public，防止包外的类用new出IDCard类，强迫IDCardFactory创建IDCard
    IDCard(String owner){
        System.out.println("制作" + owner + "的ID卡。");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡。");
    }

    public String getOwner(){
        return owner;
    }
}
