package Memento.Sample.game;

import java.util.ArrayList;
import java.util.List;
//表示Gamer状态的类
public class Memento {
//    default修饰符使得只有同包类能访问，包外类如Main就不能访问
    int money;
    ArrayList fruits; // 只保存好吃的水果
//只给包外类暴露必要的信息
    public int getMoney(){
        return money;
    }

    Memento(int money){
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }

    List getFruit(){
        return fruits;
    }
}
