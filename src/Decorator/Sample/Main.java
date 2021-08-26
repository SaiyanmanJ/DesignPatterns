package Decorator.Sample;

public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, World.");
        d1.show();

        Display d2 = new SideBorder(d1, '#');
        d2.show();

        Display d3 = new FullBorder(d2);
        d3.show();

        Display d4 = new SideBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new StringDisplay("你好，世界。")
                                ), '*'
                        )
                ),'/'
        );

        d4.show();
    }
}
