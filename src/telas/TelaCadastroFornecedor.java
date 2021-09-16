package telas;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import componentes.MeuJFormattedTextField;
import componentes.MeuCampoCEP;
import componentes.MeuCampoData;
import componentes.MeuJComboBox;
import componentes.MeuJTextField;
public class TelaCadastroFornecedor extends TelaCadastro {
    private MeuJTextField mjtfNome   = new MeuJTextField(20, "Nome", true);
    private MeuJTextField mjtfCodigo = new MeuJTextField(10, "Código", true);
    private MeuCampoCEP mcCEP = new MeuCampoCEP("CEP", true);
    private MeuCampoData mcData = new MeuCampoData("Data Cadastro", true);

    private String[] dados = {"AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RO", "RR", "SC", "SP", "SE", "TO", "DF", "RN", "RS"};
    private MeuJComboBox mjcbEstado  = new MeuJComboBox(dados, "Estado", true);

    public TelaCadastroFornecedor() {
        super("Cadastro de Fornecedor");
        montaTela();
        pack();
    }

    private void montaTela() {
        adicionaComponente(3, 1, 1, 2, mjtfNome);
        adicionaComponente(1, 1, 1, 1, mjtfCodigo);
        adicionaComponente(5, 1, 1, 1, mjcbEstado);
        adicionaComponente(7, 1, 1, 1, mcCEP);
        adicionaComponente(9, 1, 1, 1, mcData);

        habilitaComponentes(false);
    }
}

