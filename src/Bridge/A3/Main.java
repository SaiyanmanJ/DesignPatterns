package Bridge.A3;

public class Main {
    public static void main(String[] args) {
        IncreaseDisplay id1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay id2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);

        id1.increaseDisplay(4);
        id2.increaseDisplay(6);
    }
}
