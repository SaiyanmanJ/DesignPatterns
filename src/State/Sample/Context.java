package State.Sample;

public interface Context {

    public abstract void setClock(int hour); //设置时间
    public abstract void changeState(State state); //改变状态
    public abstract void callSecurityCenter(String msg); //呼叫警报中心
    public abstract void recordLog(String msg); //记录日志
}
