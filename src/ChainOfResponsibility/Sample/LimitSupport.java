package ChainOfResponsibility.Sample;

public class LimitSupport extends Support{

    private int limit; // 可以解决编号 < limit的问题

    public LimitSupport(String name, int limit){
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
