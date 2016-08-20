/**
 * Created by HarryJohnson on 11/08/2016.
 */
public class SudokuCell {
    private int tile;
    private char number;
    private boolean editable;

    public SudokuCell(){
        this.editable = false;
    }

    public int getTile() {
        return this.tile;
    }

    public char getNumber() {
        return this.number;
    }

    public void setTile(int tile) {
        this.tile = tile;
    }

    public void setNumber(char number) {
        this.number = number;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}
