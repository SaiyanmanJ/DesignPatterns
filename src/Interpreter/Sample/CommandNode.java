package Interpreter.Sample;

//表示 <repeat command> 或者 <primitive command>的类
public class CommandNode extends Node {
    private Node node; //保存repeat command 或者 primitive command

    @Override
    public void parse(Context context) throws ParseException {
        if(context.currentToken().equals("repeat")){ //是repeat则是个repeat命令
            node = new RepeatCommandNode();
            node.parse(context);
        }else{ //是个primitive 命令
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    public String toString(){
        return node.toString();
    }
}
