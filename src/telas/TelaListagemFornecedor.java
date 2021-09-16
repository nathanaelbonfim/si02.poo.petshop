package telas;

import java.awt.event.ActionEvent;

public class TelaListagemFornecedor extends TelaListagem {
    public TelaListagemFornecedor()  {
        super("Listagem de Fornecedores");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jbCadastrar) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
        }
    }
}
