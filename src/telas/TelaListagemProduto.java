package telas;

import java.awt.event.ActionEvent;

public class TelaListagemProduto extends TelaListagem {
    public TelaListagemProduto()  {
        super("Listagem de Produtos");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jbCadastrar) {
            TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
        }
    }
}
