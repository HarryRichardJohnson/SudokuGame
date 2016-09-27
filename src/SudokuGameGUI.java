import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Harry Johnson on 9/27/2016.
 */
public class SudokuGameGUI{
    public static void main(String[] args){
        GameBoard GB = new GameBoard();
        GameBoard Solved = new GameBoard();
        GB.AssignTiles();
        int difficulty;
        JFrame GUI = new JFrame("Sudoku");
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setLayout(new FlowLayout());
        JLabel Difficulty = new JLabel("Choose Difficulty:");
        JButton Diff1 = new JButton("1");
        Diff1.addActionListener(MyActionListener);
        JButton Diff2 = new JButton("2");
        JButton Diff3 = new JButton("3");
        GUI.add(Difficulty);
        GUI.add(Diff1);
        GUI.add(Diff2);
        GUI.add(Diff3);
        GUI.pack();
        GUI.setVisible(true);

    }
}
