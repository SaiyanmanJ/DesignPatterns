package ChainOfResponsibility.Sample;

public class SpecialSupport extends Support{
    private int number; //指定编号

    public SpecialSupport(String name, int number){
        super(name);
        this.number = number;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
