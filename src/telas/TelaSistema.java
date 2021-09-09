package telas;

import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

public class TelaSistema extends JFrame implements ActionListener, ComponentListener {
    public static JDesktopPane jdp = new JDesktopPane();
    private JMenuBar jmb;

    private JFrame botoesSidebar = new JFrame();

    private JPanel sidebar = new JPanel();
    private JPanel conteudo = new JPanel();


    private JMenu jmCadastros, jmMovimentos, jmRelatorios;
    private JButton jbVendas = new JButton("Vendas");
    private JButton jbFornecedores = new JButton("Fornecedores");
    private JButton jbProdutos = new JButton("Produtos");
    private JMenuItem jmiEstados, jmiCidades, jmiClientes, jmiFornecedores, jmiProdutos;
    private GridBagLayout sidebarWrapper = new GridBagLayout();
    private JPanel componentes = new JPanel(); 

    public TelaSistema(String titulo) {
        super(titulo);
        setExtendedState(JFrame.MAXIMIZED_VERT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setResizable(false);
        montaMenu();

        getContentPane().setLayout(new BorderLayout());
        
        // Temporário
        sidebar.setLayout(new GridLayout(12, 1));

        sidebar.setSize(200, getSize().height);

        getContentPane().setBackground(Color.RED);
        sidebar.setBackground(Color.decode("#B8CFE5"));
        conteudo.setBackground(Color.green);

        
        
        montaSidebar();

        // sidebar.setLayout(new GridLayout(0, 1));
        // sidebar.setBackground(Color.PINK);
        // botoesSidebar.setLayout(new GridLayout(3, 1));


        // getContentPane().add( ,sidebar);
        getContentPane().add(sidebar);
        getContentPane().add(conteudo);
        
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
    
    public void montaSidebar(){
        
        componentes.setBackground(Color.MAGENTA);
        // sidebar.setBackground(Color.BLUE);
        // sidebar.setBounds(0, 0, 200, 150);
        componentes.setBounds(201, 0, 200, 600);

        JLabel status = new JLabel();
        status.setBounds(0, 0, 225, 225);
        
        ImageIcon imagem = new ImageIcon("assets/img/logo.png");

        status.setIcon(imagem);

        sidebar.add(status);
        sidebar.add(jbVendas);
        sidebar.add(jbFornecedores);
        sidebar.add(jbProdutos); 
        
        // sidebar.add(botoesSidebar);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        // TODO Auto-generated method stub
        sidebar.setSize(200, getSize().height);
    }

    @Override
    public void componentMoved(ComponentEvent e) { }

    @Override
    public void componentShown(ComponentEvent e) { }

    @Override
    public void componentHidden(ComponentEvent e) { }

    
}
