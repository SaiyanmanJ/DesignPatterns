package Interpreter.Sample;

import java.util.ArrayList;
//表示 <command list>的类，里边有很多 command
public class CommandListNode extends Node{
    private ArrayList list = new ArrayList();

    @Override
    public void parse(Context context) throws ParseException {
        while(true) {
            if (context.currentToken() == null) { //为空报错
                throw new ParseException("Missing end");
            } else if (context.currentToken().equals("end")) { //结束了 停止循环
                context.skipToken("end");
                break;
            } else { //生成command
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    public String toString(){
        return list.toString();
    }
}
