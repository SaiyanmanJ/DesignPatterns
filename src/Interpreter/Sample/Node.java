package Interpreter.Sample;

//语法树中各个节点中的最顶层的类
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
