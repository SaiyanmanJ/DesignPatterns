package Bridge.A2;

public class Main {
    public static void main(String[] args) {
        CountDisplay d1 = new CountDisplay(new FileDisplayImpl("star.txt"));
        d1.multiDisplay(3);
    }
}
