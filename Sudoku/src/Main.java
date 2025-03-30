// import ui.myPainel;
// import ui.myFrame;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main{
    public static void main(String[] args){

        var dimension = new Dimension(500,500);
        JPanel painel = new myPainel();
        JFrame frame = new myFrame(dimension, painel);
        frame.revalidate();
        frame.repaint();

        //int[] umANove = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Board sudoku = new Board();

        // System.out.println(sudoku.BOARD_O);

    }
}