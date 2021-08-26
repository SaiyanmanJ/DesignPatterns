package Builder.A2;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void builderTitle(String title) {
        buffer.append("===============================\n");
        buffer.append("『" + title + "』\n");                   // 为标题添加『』
        buffer.append("\n");
    }

    @Override
    public void builderString(String test) {
        buffer.append('■' + test + "\n");                       // 为字符串添加■
        buffer.append("\n");
    }

    @Override
    public void builderItems(String[] items) {
        for (String item: items) {
            buffer.append(" ·" + item + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void builderDown() {
        buffer.append("===============================\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}
