package telas;


import componentes.MeuCampoNumerico;
import componentes.MeuJTextField;

public class TelaCadastroProduto extends TelaCadastro {
    private MeuJTextField mjtfNome   = new MeuJTextField(20, "Nome", true);
    private MeuJTextField mjtfCodigoDeBarras = new MeuJTextField(20, "Código de Barras", true);
    private MeuCampoNumerico mjtfQtdEstoque = new MeuCampoNumerico(5, "Quantidade Estoque", true);
    private MeuCampoNumerico mjtfValor = new MeuCampoNumerico(5, "Valor", true);

    public TelaCadastroProduto() {
        super("Cadastro de Produto");
        montaTela();
        pack();
    }

    private void montaTela() {
        adicionaComponente(3, 1, 1, 2, mjtfNome);
        adicionaComponente(1, 1, 1, 1, mjtfCodigoDeBarras);
        adicionaComponente(5, 1, 1, 1, mjtfQtdEstoque);
        adicionaComponente(7, 1, 1, 1, mjtfValor);

        habilitaComponentes(false);
    }
}
