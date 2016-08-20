import java.io.*;
import java.util.Scanner;

/**
 * Created by HarryJohnson on 11/08/2016.
 */
public class SudokuGame {
    public static void main(String[] args) throws IOException {
        GameBoard GB = new GameBoard();
        GameBoard Solved = new GameBoard();
        GB.AssignTiles();
        System.out.println();
        GB.PopulateGameBoard();
        Solved.CopyMatrix(GB);
        Scanner kb = new Scanner(System.in);
        int difficulty;
        System.out.println("~~~ Welcome to the Game of Sudoku ~~~");
        do {
            System.out.println(" ~~ Please choose a difficulty ~~");
            System.out.println("    1) Easy\n    2) Medium\n    3) Hard");
            difficulty = kb.nextInt();
        } while (difficulty > 3 ||difficulty < 1);
        GB.HideCells(difficulty+1);
        boolean win = false;
    boolean quit = false;
        int menuChoice;
        do {
            System.out.println("~~~ Menu ~~~");
            System.out.println("    1)View Board\n    " +
                    "2)Solve Tile\n    " +
                    "3)Check previous moves are valid(this is only means your move is correct with all current tiles," +
                    " some games can be won many ways)\n    " +
                    "4)Check for a Win(do this if you think you have all the tiles correct)\n    " +
                    "5)Rules for winning Sudoku\n    "+
                    "6)Quit");
            menuChoice = kb.nextInt();
            switch (menuChoice){
                case 1:
                    GB.PrintGameBoard();
                    break;
                case 2:
                    GB.SolveTile(GB);
                    break;
                case 3:
                    System.out.println("The current game board is " + (GB.ValidBoardInPlay()?"valid":"not valid"));
                    break;
                case 4:
                    win = GB.WinCheck();
                    if(!win){
                        System.out.println("Sorry you haven't won yet");
                    }
                    break;
                case 5:
                    FileReader readIt = new FileReader("Rules.txt");
                    BufferedReader inputStream = new BufferedReader(readIt);
                    String line;
                    while((line = inputStream.readLine())!= null) {
                        System.out.println(line);
                    }
                    inputStream.close();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }while(!win && !quit);
        if(win){
            System.out.println("Congratulations on betting the game of Sudoku");
        }else if(quit){
            System.out.println("you chose to quit, this is the solved board if you were wondering");
            Solved.PrintGameBoard();
        }
    }
}