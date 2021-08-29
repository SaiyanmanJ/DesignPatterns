package Memento.Sample.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// 表示游戏主人公的类
public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();

    private static String[] fruitsname = {
            "苹果", "葡萄", "香蕉", "橘子"
    };

    public Gamer(int money){
        this.money = money;
    }

    public int getMoney(){
        return money;
    }

    public void bet(){
        int dice = random.nextInt(6) + 1;
        if(dice == 1){
            money += 100;
            System.out.println("所持金钱增加了。");
        }else if(dice == 2){
            money /= 2;
            System.out.println("所持金额减半。");
        }else if(dice == 6){
            String f = getFruit();
            System.out.println("获得了水果(" + f + ")。");
            fruits.add(f);
        }else{
            System.out.println("什么都没发生");
        }
    }

    public Memento createMemento(){
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while(it.hasNext()){
            String f = (String)it.next();
            if(f.startsWith("好吃的")){ //只保存好吃的水果
                m.addFruit(f);
            }
        }

        return m;
    }

    public void restoreMemento(Memento memento){
        this.money = memento.money;
        this.fruits = memento.getFruit();
    }

    public String toString(){
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    public String getFruit(){
        String prefix = "";
        if(random.nextBoolean()){
            prefix = "好吃的";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
