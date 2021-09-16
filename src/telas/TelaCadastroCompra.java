package telas;


import componentes.MeuCampoNumerico;
import componentes.MeuJComboBox;
import componentes.MeuJTextField;

public class TelaCadastroCompra extends TelaCadastro {
    private MeuCampoNumerico mjtfCodigo = new MeuCampoNumerico(5, "Codigo", true);
    private String[] dados = {"Shampoo", "Sabonete"};
    private MeuJComboBox mjcbProduto  = new MeuJComboBox(dados, "Produto", true);
    private MeuCampoNumerico mjtfValorUnitario = new MeuCampoNumerico(5, "Valor", true);
    private MeuCampoNumerico mjtfDescontoUnitario = new MeuCampoNumerico(5, "Desconto unitario", true);
    private MeuCampoNumerico mjtfDescontoTotal = new MeuCampoNumerico(5, "Desconto Total", true);
    private MeuJTextField mjtfValorBruto = new MeuJTextField(5, "Valor Bruto", true);
    private MeuJTextField mjtfValorLiquido = new MeuJTextField(5, "Valor Líquido", true);
    public TelaCadastroCompra() {
        super("Cadastro de Compra");
        montaTela();
        pack();
    }

    private void montaTela() {
        adicionaComponente(3, 1, 1, 2, mjtfCodigo);
        adicionaComponente(1, 1, 1, 1, mjcbProduto);
        adicionaComponente(5, 1, 1, 1, mjtfValorUnitario);
        adicionaComponente(5, 1, 1, 1, mjtfDescontoUnitario);
        adicionaComponente(5, 1, 1, 1, mjtfDescontoTotal);
        adicionaComponente(5, 1, 1, 1, mjtfValorBruto);
        adicionaComponente(5, 1, 1, 1, mjtfValorLiquido);

        habilitaComponentes(false);
    }
}
