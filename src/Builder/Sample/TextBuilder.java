package Builder.Sample;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("===============================\n");
        buffer.append("『" + title + "』\n");                   // 为标题添加『』
        buffer.append("\n");
    }

    @Override
    public void makeString(String test) {
        buffer.append('■' + test + "\n");                       // 为字符串添加■
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item: items) {
            buffer.append(" ·" + item + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("===============================\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}
