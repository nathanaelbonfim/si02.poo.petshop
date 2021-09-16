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

    private JMenu jmCadastros, jmMovimentos, jmRelatorios;

    private JMenuItem jmiEstados, jmiCidades, jmiClientes, jmiFornecedores, jmiProdutos;

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

        jmCadastros = new JMenu("Cadastros");
        jmMovimentos = new JMenu("Movimentos");
        jmRelatorios = new JMenu("Relatórios");
        
        jmb.add(jmCadastros);
        jmb.add(jmMovimentos);
        jmb.add(jmRelatorios);

        montaItensMenu();
        adicionaListeners();
    }

    private void montaItensMenu() {
        jmiEstados = new JMenuItem("Estados");
        jmiCidades = new JMenuItem("Cidades");
        jmiClientes = new JMenuItem("Clientes");
        jmiFornecedores = new JMenuItem("Fornecedores");
        jmiProdutos = new JMenuItem("Produtos");

        jmCadastros.add(jmiEstados);
        jmCadastros.add(jmiCidades);
        jmCadastros.add(jmiClientes);
        jmCadastros.add(jmiFornecedores);
        jmCadastros.add(jmiProdutos);
    }
    
    private void adicionaListeners() {
        jmiEstados.addActionListener(this);
        jmiCidades.addActionListener(this);
        jmiClientes.addActionListener(this);
        jmiFornecedores.addActionListener(this);
        jmiProdutos.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jmiEstados) {
            TelaCadastroEstado telaCadastroEstados = new TelaCadastroEstado();
            // jdp.add(telaCadastroEstados);
        } else if (ae.getSource() == jmiCidades) {
            TelaCadastroCidade telaCadastroCidades = new TelaCadastroCidade();
            // jdp.add(telaCadastroCidades);
        }else if (ae.getSource() == jmiClientes) {
            TelaCadastroCliente telaCadastroClientes = new TelaCadastroCliente();
            // jdp.add(telaCadastroClientes);
        } else if (ae.getSource() == jmiFornecedores) {
            TelaCadastroFornecedor telaCadastroFornecedores = new TelaCadastroFornecedor();
            // jdp.add(telaCadastroFornecedores);
        } else if (ae.getSource() == jmiProdutos) {
            TelaCadastroProduto telaCadastroProdutos = new TelaCadastroProduto();
            // jdp.add(telaCadastroProdutos);
        }
    }
}
