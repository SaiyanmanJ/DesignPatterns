package Adapter.Sample1;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

/*
* Q:为什么使用 Print 类型，不使用 PrintBanner 类型呢？
* A:强调只使用Print接口中的方法，明确语义
* */
}
