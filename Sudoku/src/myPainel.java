import java.awt.Color;
import static java.awt.Color.gray;
import java.awt.Dimension;
import javax.swing.JPanel;

public class myPainel extends JPanel{
    public myPainel(){
        var dimensao = new Dimension(360,360);
        this.setSize(dimensao);
        this.setBorder(gray, 2, true);
        this.setVisible(true);

    }

    private void setBorder(Color gray, int i, boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
