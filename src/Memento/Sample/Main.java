package Memento.Sample;

import Memento.Sample.game.Gamer;
import Memento.Sample.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("======= " + i);
            System.out.println("当前状态：" + gamer);

            gamer.bet();

            System.out.println("所持金钱为：" + gamer.getMoney() + " 元。");
            //决定如何处理Memento
            if(memento.getMoney() < gamer.getMoney()){
                System.out.println("金钱增加了许多，因此保存游戏状态");
                memento = gamer.createMemento();
            }else if(memento.getMoney() / 2 > gamer.getMoney()){
                System.out.println("所持金钱少了很多，将游戏恢复到以前的状态");
                gamer.restoreMemento(memento);
            }

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
            }

            System.out.println("");
        }
    }
}
