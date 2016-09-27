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
        JFrame GUI = new JFrame("Sudoku");
        GUI.setSize(1000,1000);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setLayout(new FlowLayout());
        JPanel DiffPanel = new JPanel();
        GUI.setSize(1200,800);
        JLabel Difficulty = new JLabel("Choose Difficulty:");
        JButton Diff1 = new JButton("1");
        Diff1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    GB.HideCells(2);
                    GUI.remove(DiffPanel);
                    SwingUtilities.updateComponentTreeUI(GUI);
                    GUI.add(GB.PrintGameBoardGUI());
                }
            }
        );
        JButton Diff2 = new JButton("2");
        Diff2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    GB.HideCells(3);
                    GUI.remove(DiffPanel);
                    SwingUtilities.updateComponentTreeUI(GUI);
                    GUI.add(GB.PrintGameBoardGUI());
                }
            }
        );
        JButton Diff3 = new JButton("3");
        Diff3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    GB.HideCells(4);
                    GUI.remove(DiffPanel);
                    SwingUtilities.updateComponentTreeUI(GUI);
                    GUI.add(GB.PrintGameBoardGUI());
                }
            }
        );
        DiffPanel.add(Difficulty);
        DiffPanel.add(Diff1);
        DiffPanel.add(Diff2);
        DiffPanel.add(Diff3);
        GUI.add(DiffPanel);
        GB.PopulateGameBoard();
        Solved.CopyMatrix(GB);
        GUI.setVisible(true);
    }
}
