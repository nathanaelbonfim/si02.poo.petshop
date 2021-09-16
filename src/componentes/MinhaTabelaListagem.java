package componentes;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MinhaTabelaListagem {
    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;

    Object [][] dados = {
        { 1, "123456789", "Ração Gourmet 1kg", 2000.00, 10 },
        { 2, "123456789", "Casinha Cachorro", 200.00, 10 },
        { 3, "123456789", "Brinquedo bolhinha", 6.00, 10 },
        { 4, "123456789", "Osso sintético", 120.00, 10 },
        { 5, "123456789", "Piskas 1kg", 40.00, 10 },
        { 6, "123456789", "Xampu canino 300g", 80.00, 10 },
    };

    String [] colunas = {"Cod", "Cod. Barras", "Nome", "Valor", "Qtd."};

    public JPanel criaTabela(){
        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem);

        return painelFundo;
    }

}
