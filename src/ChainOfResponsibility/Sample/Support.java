package ChainOfResponsibility.Sample;

public abstract class Support {
    private String name; //解决问题的实例的名字
    private Support next; //要推卸给的对象

    public Support(String name){
        this.name = name;
    }

    public Support setNext(Support next){
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble){ //解决问题的步骤
        if(resolve(trouble)){ //本方法能解决
            down(trouble);
        }else if(next != null){ //本方法不能解决，但是还有其它方法
            next.support(trouble);
        }else{ //本方法不能解决，其他方法也不能解决
            fail(trouble);
        }
    }

    protected void down(Trouble trouble){
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble){
        System.out.println(trouble + " cannot be resolved");
    }



    protected abstract boolean resolve(Trouble trouble);


    public String toString(){
        return "[" + name + "]";
    }

}
