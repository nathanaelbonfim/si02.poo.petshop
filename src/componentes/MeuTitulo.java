package componentes;

import javax.swing.JLabel;
// import javax.swing.JTextField;
import java.awt.Font;

public class MeuTitulo extends JLabel {
    public MeuTitulo(String conteudo) {
        super(conteudo);

        Font fonte = new Font("SansSerif", Font.BOLD, 20);
        setFont(fonte);
        // setHorizontalAlignment(JTextField.WEST);
    }
}
