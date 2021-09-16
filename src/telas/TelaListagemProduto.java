package telas;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import dados.Produto;

public class TelaListagemProduto extends TelaListagem {
    public List<Produto> listaProdutos = new ArrayList<Produto>();
    
    public TelaListagemProduto()  {
        super("Listagem de Produtos");

        listaProdutos.add(new Produto(1, "123456789", "Ração Gourmet 1kg", 2000.00, 10));
        listaProdutos.add(new Produto(1, "123456789", "Casinha Cachorro", 200.00, 10));
        listaProdutos.add(new Produto(1, "123456789", "Brinquedo bolhinha", 6.00, 10));
        listaProdutos.add(new Produto(1, "123456789", "Osso sintético", 120.00, 10));
        listaProdutos.add(new Produto(1, "123456789", "Piskas 1kg", 40.00, 10));
        listaProdutos.add(new Produto(1, "123456789", "Xampu canino 300g", 80.00, 10));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jbCadastrar) {
            TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
        }
    }
}
