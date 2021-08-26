package Decorator.Sample;

public class SideBorder extends Border{

    private char boardchar;
    public SideBorder(Display display, char boardchar){
        super(display);
        this.boardchar = boardchar;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return boardchar + display.getRowText(row) + boardchar;
    }
}
