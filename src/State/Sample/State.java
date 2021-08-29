package State.Sample;

public interface State {
    public abstract void doClock(Context context, int hour); //设置时间
    public abstract void doUse(Context context); //使用金库
    public abstract void doAlarm(Context context); //使用警铃
    public abstract void doPhone(Context context); //打电话
}
