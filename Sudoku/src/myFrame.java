import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class myFrame extends JFrame {
    public myFrame(Dimension dimensao, JPanel painel){
        super("Sudoku");
        this.setSize(dimensao);
        this.setDefaultCloseOperation(PROPERTIES);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(painel);
    }
}