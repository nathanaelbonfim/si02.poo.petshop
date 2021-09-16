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

    private JMenu jmVendas, jmFornecedores, jmProdutos;

    private JMenuItem jmiCadastrarVenda, jmiEditarVenda,  jmiApagarVenda,  jmiExcluirVenda, jmiCadastrarFornecedor, jmiEditarFornecedor, jmiApagarFornecedor, jmiExcluirFornecedor, jmiCadastrarProduto, jmiEditarProduto, jmiApagarProduto, jmiExcluirProduto;

    public TelaSistema(String titulo) {
        super(titulo);
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        montaMenu();
        getContentPane().add(jdp);
        setVisible(true);
    }

    public JMenuItem getjmiExcluirFornecedor() {
        return jmiExcluirFornecedor;
    }

    public void setjmiExcluirFornecedor(JMenuItem jmiExcluirFornecedor) {
        this.jmiExcluirFornecedor = jmiExcluirFornecedor;
    }

    private void montaMenu() {
        jmb = new JMenuBar();
        setJMenuBar(jmb);

        jmVendas = new JMenu("Vendas");
        jmFornecedores = new JMenu("Fornecedores");
        jmProdutos = new JMenu("Produtos");
        
        jmb.add(jmVendas);
        jmb.add(jmFornecedores);
        jmb.add(jmProdutos);

        montaItensMenu();
        adicionaListeners();
    }

    private void montaItensMenu() {
        jmiCadastrarVenda = new JMenuItem("Cadastrar");
        jmiEditarVenda = new JMenuItem("Editar");
        jmiApagarVenda = new JMenuItem("Apagar");
        jmiExcluirVenda = new JMenuItem("Excluir");

        jmiCadastrarFornecedor = new JMenuItem("Cadastrar");
        jmiEditarFornecedor = new JMenuItem("Editar");
        jmiApagarFornecedor = new JMenuItem("Apagar");
        jmiExcluirFornecedor = (new JMenuItem("Excluir"));

        jmiCadastrarProduto = new JMenuItem("Cadastrar");
        jmiEditarProduto = new JMenuItem("Editar");
        jmiApagarProduto = new JMenuItem("Apagar");
        jmiExcluirProduto = new JMenuItem("Excluir");

        jmVendas.add(jmiCadastrarVenda);
        jmVendas.add(jmiEditarVenda);
        jmVendas.add(jmiApagarVenda);
        jmVendas.add(jmiExcluirVenda);

        jmFornecedores.add(jmiCadastrarFornecedor);
        jmFornecedores.add(jmiEditarFornecedor);
        jmFornecedores.add(jmiApagarFornecedor);
        jmFornecedores.add(jmiExcluirFornecedor);

        jmProdutos.add(jmiCadastrarProduto);
        jmProdutos.add(jmiEditarProduto);
        jmProdutos.add(jmiApagarProduto);
        jmProdutos.add(jmiExcluirProduto);
    }
    
    private void adicionaListeners() {
        jmiCadastrarVenda.addActionListener(this);
        jmiEditarVenda.addActionListener(this);
        jmiApagarVenda.addActionListener(this);
        jmiExcluirVenda.addActionListener(this);

        jmiCadastrarFornecedor.addActionListener(this);
        jmiEditarFornecedor.addActionListener(this);
        jmiApagarFornecedor.addActionListener(this);
        jmiExcluirFornecedor.addActionListener(this);

        jmiCadastrarProduto.addActionListener(this);
        jmiEditarProduto.addActionListener(this);
        jmiApagarProduto.addActionListener(this);
        jmiExcluirProduto.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jmiCadastrar) {
            TelaCadastroEstado telaCadastroEstados = new TelaCadastroEstado();
            // jdp.add(telaCadastroEstados);
        } else if (ae.getSource() == jmiEditar) {
            TelaCadastroCidade telaCadastroCidades = new TelaCadastroCidade();
            // jdp.add(telaCadastroCidades);
        }else if (ae.getSource() == jmiApagar) {
            TelaCadastroCliente telaCadastroClientes = new TelaCadastroCliente();
            // jdp.add(telaCadastroClientes);
        } else if (ae.getSource() == jmiExcluir) {
            TelaCadastroFornecedor telaCadastroFornecedores = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroFornecedores);
        }
    }
}
