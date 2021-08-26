package Builder.A2;

public abstract class Builder {
    private boolean isMakeTitle = false;

//    使用boolean标记该方法时候被调用过，要求有且只有一次被调用
    public void makeTitle(String title){
        if(!isMakeTitle){
            builderTitle(title);
            isMakeTitle = true;
        }
    }

    protected abstract void builderTitle(String title);

    public void makeString(String test){
        if (isMakeTitle){
            builderString(test);
        }
    }

    protected abstract void builderString(String test);

    public void makeItems(String[] items){
        if(isMakeTitle){
            builderItems(items);
        }
    }

    protected abstract void builderItems(String[] items);

    public void close(){
        if(isMakeTitle){
            builderDown();
        }
    }

    protected abstract void builderDown();

}
