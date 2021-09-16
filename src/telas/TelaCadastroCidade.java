package telas;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import componentes.MeuJFormattedTextField;
import componentes.MeuCampoCEP;
import componentes.MeuCampoData;
import componentes.MeuJComboBox;
import componentes.MeuJTextField;

public class TelaCadastroCidade extends TelaCadastro {
    private MeuJTextField mjtfNome   = new MeuJTextField(20, "Nome", true);
    private MeuJTextField mjtfCodigo = new MeuJTextField(10, "Código", true);


    private String[] dados = {"PR", "SP"};
    private MeuJComboBox mjcbEstado  = new MeuJComboBox(dados, "Estado", true);

    public TelaCadastroCidade() {
        super("Cadastro de Cidade");
        montaTela();
        pack();
    }

    private void montaTela() {
        adicionaComponente(3, 1, 1, 2, mjtfNome);
        adicionaComponente(1, 1, 1, 1, mjtfCodigo);
        adicionaComponente(5, 1, 1, 1, mjcbEstado);


        habilitaComponentes(false);
    }
}
