import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Botao extends JButton {
    public Botao(ActionListener action){
        this.setText("Botao");
        this.addActionListener(action);
    }
}