package telas;

import javax.swing.JButton;

import componentes.MeuJComboBox;
import componentes.MeuJTextField;

public class TelaCadastroVenda extends TelaCadastro {
    
    // private MeuJTextField jtfNome   = new MeuJTextField(20, "Nome", true);
    // private MeuJTextField jtfCodigo = new MeuJTextField(10, "Código", true);

    // private String[] dados = {"PR", "SP"};
    // private MeuJComboBox jcbEstado  = new MeuJComboBox(dados, "Estado", true);

    private JButton jbCadastrar = new JButton("Cadastrar");
    
    public TelaCadastroVenda() {
        super("Cadastro de Venda");
        montaTela();
        pack();
    }

    private void montaTela() {


        // adicionaComponente(3, 1, 1, 2, jtfNome);
        // adicionaComponente(1, 1, 1, 1, jtfCodigo);
        // adicionaComponente(5, 1, 1, 1, jcbEstado);

        habilitaComponentes(false);
    }
}
