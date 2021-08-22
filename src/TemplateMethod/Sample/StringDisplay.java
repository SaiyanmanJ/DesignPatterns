package TemplateMethod.Sample;

public class StringDisplay extends AbstractDisplay{
    private String string;
    private int width;

    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length; //得到字符串的字节长度 对java11而言,该长度不能和输出对齐，暂时不知道为什么
//        this.width = string.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    public void printLine(){
        System.out.print("+");
        for(int i = 0;i < width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
