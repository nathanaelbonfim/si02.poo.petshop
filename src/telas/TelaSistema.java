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

    private JMenuItem jmiCadastrarCompra, jmiEditarCompra,  jmiApagarCompra,  jmiExcluirCompra, jmiListarCompra, jmiCadastrarFornecedor, jmiEditarFornecedor, jmiApagarFornecedor, jmiExcluirFornecedor, jmiListarFornecedor, jmiCadastrarProduto, jmiEditarProduto, jmiApagarProduto, jmiExcluirProduto, jmiListarProduto;

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
        jmiEditarCompra = new JMenuItem("Editar");
        jmiApagarCompra = new JMenuItem("Apagar");
        jmiExcluirCompra = new JMenuItem("Excluir");
        jmiListarCompra = new JMenuItem("Listar");

        jmiCadastrarFornecedor = new JMenuItem("Cadastrar");
        jmiEditarFornecedor = new JMenuItem("Editar");
        jmiApagarFornecedor = new JMenuItem("Apagar");
        jmiExcluirFornecedor = (new JMenuItem("Excluir"));
        jmiListarFornecedor = new JMenuItem("Listar");

        jmiCadastrarProduto = new JMenuItem("Cadastrar");
        jmiEditarProduto = new JMenuItem("Editar");
        jmiApagarProduto = new JMenuItem("Apagar");
        jmiExcluirProduto = new JMenuItem("Excluir");
        jmiListarProduto = new JMenuItem("Listar");

        jmCompras.add(jmiListarCompra);
        jmCompras.add(jmiCadastrarCompra);
        jmCompras.add(jmiEditarCompra);
        jmCompras.add(jmiApagarCompra);
        jmCompras.add(jmiExcluirCompra);

        jmFornecedores.add(jmiListarFornecedor);
        jmFornecedores.add(jmiCadastrarFornecedor);
        jmFornecedores.add(jmiEditarFornecedor);
        jmFornecedores.add(jmiApagarFornecedor);
        jmFornecedores.add(jmiExcluirFornecedor);

        jmProdutos.add(jmiListarProduto);
        jmProdutos.add(jmiCadastrarProduto);
        jmProdutos.add(jmiEditarProduto);
        jmProdutos.add(jmiApagarProduto);
        jmProdutos.add(jmiExcluirProduto);
    }
    
    private void adicionaListeners() {
        jmiListarCompra.addActionListener(this);
        jmiCadastrarCompra.addActionListener(this);
        jmiEditarCompra.addActionListener(this);
        jmiApagarCompra.addActionListener(this);
        jmiExcluirCompra.addActionListener(this);

        jmiListarFornecedor.addActionListener(this);
        jmiCadastrarFornecedor.addActionListener(this);
        jmiEditarFornecedor.addActionListener(this);
        jmiApagarFornecedor.addActionListener(this);
        jmiExcluirFornecedor.addActionListener(this);

        jmiListarProduto.addActionListener(this);
        jmiCadastrarProduto.addActionListener(this);
        jmiEditarProduto.addActionListener(this);
        jmiApagarProduto.addActionListener(this);
        jmiExcluirProduto.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jmiCadastrarCompra) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroEstados);
        }else if (ae.getSource() == jmiEditarCompra) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroCidades);
        }else if (ae.getSource() == jmiApagarCompra) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroClientes);
        }else if (ae.getSource() == jmiExcluirCompra) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroFornecedores);
        }else if (ae.getSource() == jmiListarCompra) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroFornecedores);
        }
    
        if (ae.getSource() == jmiCadastrarFornecedor) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroEstados);
        }else if (ae.getSource() == jmiEditarFornecedor) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroCidades);
        }else if (ae.getSource() == jmiApagarFornecedor) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroClientes);
        }else if (ae.getSource() == jmiExcluirFornecedor) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroFornecedores);
        }else if (ae.getSource() == jmiListarFornecedor) {
            TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroFornecedores);
        }
    
        if (ae.getSource() == jmiCadastrarProduto) {
            TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
            // jdp.add(telaCadastroEstados);
        }else if (ae.getSource() == jmiEditarProduto) {
            TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
            // jdp.add(telaCadastroCidades);
        }else if (ae.getSource() == jmiApagarProduto) {
            TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
            // jdp.add(telaCadastroClientes);
        }else if (ae.getSource() == jmiExcluirProduto) {
            TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
            // jdp.add(telaCadastroFornecedores);
        }else if (ae.getSource() == jmiListarProduto) {
            TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
            // jdp.add(telaCadastroFornecedores);
        }
    
    }
}
