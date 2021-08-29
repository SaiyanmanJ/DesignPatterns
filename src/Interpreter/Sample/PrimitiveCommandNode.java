package Interpreter.Sample;

//primitive command 如 go left right
public class PrimitiveCommandNode extends Node {

    private String name;
    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);

        //不是三者中的任何一个
        if(!name.equals("go") && !name.equals("left") && !name.equals("right")){
            throw new ParseException(name + " is undefined");
        }
    }

    public String toString(){
        return name;
    }
}
