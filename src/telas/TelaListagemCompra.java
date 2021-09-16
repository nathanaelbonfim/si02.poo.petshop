package telas;

import java.awt.event.ActionEvent;

public class TelaListagemCompra extends TelaListagem {
    public TelaListagemCompra() {
        super("Listagem de Compras");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jbCadastrar) {
            TelaCadastroCompra telaCadastroCompra = new TelaCadastroCompra();
        }
    }
}
