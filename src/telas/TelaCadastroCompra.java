package telas;


import componentes.MeuCampoNumerico;
import componentes.MeuJComboBox;

public class TelaCadastroCompra extends TelaCadastro {
    private MeuCampoNumerico mjtfCodigo = new MeuCampoNumerico(10, "Codigo", true);
    private String[] dados = {"Shampoo", "Sabonete", "AAAAAAAAAAAAAAAAAA  AAAAA aA"};
    private MeuJComboBox mjcbProduto  = new MeuJComboBox(dados, "Produto", true);
    private MeuCampoNumerico mcnValorUnitario = new MeuCampoNumerico(5, "Valor", true);
    private MeuCampoNumerico mcnDescontoUnitario = new MeuCampoNumerico(5, "Desconto unitario", false);
    private MeuCampoNumerico mcnDescontoTotal = new MeuCampoNumerico(5, "Desconto Total", false);
    private MeuCampoNumerico mcnValorBruto = new MeuCampoNumerico(5, "Valor Bruto", false);
    private MeuCampoNumerico mcnValorLiquido = new MeuCampoNumerico(5, "Valor Líquido", true);
    public TelaCadastroCompra() {
        super("Cadastro de Compra");
        montaTela();
        pack();
    }

    private void montaTela() {
        adicionaComponente(1, 1, 1, 2, mjtfCodigo);
        adicionaComponente(1, 2, 1, 5, mjcbProduto);
        adicionaComponente(3, 1, 1, 1, mcnValorUnitario);
        adicionaComponente(6, 1, 1, 1, mcnDescontoUnitario);
        adicionaComponente(6, 2, 1, 1, mcnDescontoTotal);
        adicionaComponente(9, 1, 1, 1, mcnValorBruto);
        adicionaComponente(9, 2, 1, 1, mcnValorLiquido);

        habilitaComponentes(false);
    }
}
