package telas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaSistema extends JFrame implements ActionListener {
    public static JDesktopPane jdp = new JDesktopPane();
    private JMenuBar jmb;

    private JMenu jmCompras, jmFornecedores, jmProdutos;

    private JMenuItem jmiCadastrarCompra, jmiListarCompra, jmiCadastrarFornecedor, jmiListarFornecedor, jmiCadastrarProduto, jmiListarProduto;

    public TelaSistema(String titulo) {
        super(titulo);
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        montaMenu();
        getContentPane().add(jdp);
        setVisible(true);
    }

    private void montaMenu() {
        jmb = new JMenuBar();
        setJMenuBar(jmb);

        jmCompras = new JMenu("Compras");
        jmFornecedores = new JMenu("Fornecedores");
        jmProdutos = new JMenu("Produtos");
        
        jmb.add(jmCompras);
        jmb.add(jmFornecedores);
        jmb.add(jmProdutos);

        montaItensMenu();
        adicionaListeners();
    }

    private void montaItensMenu() {
        jmiCadastrarCompra = new JMenuItem("Cadastrar");
        jmiListarCompra = new JMenuItem("Listar");

        jmiCadastrarFornecedor = new JMenuItem("Cadastrar");
        jmiListarFornecedor = new JMenuItem("Listar");

        jmiCadastrarProduto = new JMenuItem("Cadastrar");
        jmiListarProduto = new JMenuItem("Listar");

        jmCompras.add(jmiListarCompra);
        jmCompras.add(jmiCadastrarCompra);

        jmFornecedores.add(jmiListarFornecedor);
        jmFornecedores.add(jmiCadastrarFornecedor);

        jmProdutos.add(jmiListarProduto);
        jmProdutos.add(jmiCadastrarProduto);
    }
    
    private void adicionaListeners() {
        jmiListarCompra.addActionListener(this);
        jmiCadastrarCompra.addActionListener(this);

        jmiListarFornecedor.addActionListener(this);
        jmiCadastrarFornecedor.addActionListener(this);

        jmiListarProduto.addActionListener(this);
        jmiCadastrarProduto.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jmiCadastrarCompra) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroEstados);
        }else if (ae.getSource() == jmiListarCompra) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroFornecedores);
        }
    
        if (ae.getSource() == jmiCadastrarFornecedor) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroEstados);
        }else if (ae.getSource() == jmiListarFornecedor) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroFornecedores);
        }
    
        if (ae.getSource() == jmiCadastrarProduto) {
            TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
            // jdp.add(telaCadastroEstados);
        }else if (ae.getSource() == jmiListarProduto) {
            TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
            // jdp.add(telaCadastroFornecedores);
        }
    
    }
}
