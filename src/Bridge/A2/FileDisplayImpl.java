package Bridge.A2;

import java.io.*;

public class FileDisplayImpl extends DisplayImpl{

    private String filename;
    private BufferedReader reader;
    private int MAX_READAHEAD_LIMIT = 4096;//读取缓存限制
    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try{
            reader = new BufferedReader(new FileReader(filename));
            reader.mark(MAX_READAHEAD_LIMIT);
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("============  " + filename + "  ============");
    }

    @Override
    public void rawPrint() {
        try{
            String line;
            reader.reset(); //回到mark的位置
            while((line = reader.readLine()) != null){
                System.out.println(">> " + line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println("====================================");
        try{
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
