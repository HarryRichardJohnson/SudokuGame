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
        GUI.setSize(500,500);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setLayout(new FlowLayout());
        JPanel DiffPanel = new JPanel();
        JLabel Difficulty = new JLabel("Choose Difficulty:");
        JButton Diff1 = new JButton("1");
        Diff1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    GB.HideCells(2);
                    GUI.remove(DiffPanel);
                    SwingUtilities.updateComponentTreeUI(GUI);
                    JPanel grid = GB.PrintGameBoardGUI(GUI);
                    JPanel Buttons = new JPanel();
                    JButton WinCheck = new JButton("Win Check");
                    WinCheck.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(GB.WinCheck()){
                                JFrame winner = new JFrame("WINNER!");
                                JLabel YouWin1 = new JLabel("YOU WIN!");
                                JLabel YouWin2 = new JLabel("Congratulations on betting the game of Sudoku");
                                winner.setLayout(new FlowLayout());
                                winner.add(YouWin1);
                                winner.add(YouWin2);
                                winner.setVisible(true);
                                winner.pack();
                            }else{
                                JFrame notwinner = new JFrame("Not A Win");
                                JLabel nope = new JLabel("You haven't won yet, keep playing to win.");
                                notwinner.setLayout(new FlowLayout());
                                notwinner.add(nope);
                                notwinner.setVisible(true);
                                notwinner.pack();
                            }
                        }
                    });

                    GUI.add(grid);
                    Buttons.add(WinCheck);
                    GUI.add(Buttons);
                }
            }
        );
        JButton Diff2 = new JButton("2");
        Diff2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    GB.HideCells(3);
                    GUI.remove(DiffPanel);
                    SwingUtilities.updateComponentTreeUI(GUI);
                    JPanel grid = GB.PrintGameBoardGUI(GUI);
                    JPanel Buttons = new JPanel();
                    JButton WinCheck = new JButton("Win Check");
                    WinCheck.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(GB.WinCheck()){
                                JFrame winner = new JFrame("WINNER!");
                                JLabel YouWin1 = new JLabel("YOU WIN!");
                                JLabel YouWin2 = new JLabel("Congratulations on betting the game of Sudoku");
                                winner.setLayout(new FlowLayout());
                                winner.add(YouWin1);
                                winner.add(YouWin2);
                                winner.setVisible(true);
                                winner.pack();
                            }else{
                                JFrame notwinner = new JFrame("Not A Win");
                                JLabel nope = new JLabel("You haven't won yet, keep playing to win.");
                                notwinner.setLayout(new FlowLayout());
                                notwinner.add(nope);
                                notwinner.setVisible(true);
                                notwinner.pack();
                            }
                        }
                    });

                    GUI.add(grid);
                    Buttons.add(WinCheck);
                    GUI.add(Buttons);
                }
            }
        );
        JButton Diff3 = new JButton("3");
        Diff3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    GB.HideCells(4);
                    GUI.remove(DiffPanel);
                    SwingUtilities.updateComponentTreeUI(GUI);
                    JPanel grid = GB.PrintGameBoardGUI(GUI);
                    JPanel Buttons = new JPanel();
                    JButton WinCheck = new JButton("Win Check");
                    WinCheck.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(GB.WinCheck()){
                                JFrame winner = new JFrame("WINNER!");
                                JLabel YouWin1 = new JLabel("YOU WIN!");
                                JLabel YouWin2 = new JLabel("Congratulations on betting the game of Sudoku");
                                winner.setLayout(new FlowLayout());
                                winner.add(YouWin1);
                                winner.add(YouWin2);
                                winner.setVisible(true);
                                winner.pack();
                            }else{
                                JFrame notwinner = new JFrame("Not A Win");
                                JLabel nope = new JLabel("You haven't won yet, keep playing to win.");
                                notwinner.setLayout(new FlowLayout());
                                notwinner.add(nope);
                                notwinner.setVisible(true);
                                notwinner.pack();
                            }
                        }
                    });

                    GUI.add(grid);
                    Buttons.add(WinCheck);
                    GUI.add(Buttons);

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
