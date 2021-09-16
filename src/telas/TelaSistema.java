package telas;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import componentes.MeuTitulo;
import componentes.MinhaTabela;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JLabel;


public class TelaSistema extends JFrame {
    public static JDesktopPane jdp = new JDesktopPane();
    private JMenuBar jmb;

    public static JPanel jpContainerTabela = new JPanel();
    /**
     * Barra lateral
     */
    private JPanel sidebar = new JPanel();
    /**
     * Conteúdo da tela
     */
    public static JPanel conteudo = new JPanel();

    /**
     * Container para os botões da barra superior
     */
    private static JPanel jpCabecalho = new JPanel();

    /**
     * Container para o corpo da tela 
     */
    public static JPanel jpCorpo = new JPanel();

    private JPanel jpBotoesCabecalho = new JPanel();

    private MeuTitulo tituloTela = new MeuTitulo("Compras");


    // Botões
    private JButton jbVendas = new JButton("Vendas");
    private JButton jbFornecedores = new JButton("Fornecedores");
    private JButton jbProdutos = new JButton("Produtos");
    
    public TelaSistema(String titulo) {
        this(titulo, "Tela");
    }

    public TelaSistema(String titulo, String nome) {
        super(titulo);

        tituloTela.setText(nome);
        tituloTela.setForeground(Color.white);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);

        getContentPane().setLayout(new BorderLayout());
        
        sidebar.setLayout(new GridLayout(12, 0));
        sidebar.setPreferredSize(new Dimension(250, 500));
        montaSidebar();
        
        conteudo.setLayout(new BorderLayout());
        montaConteudo();
        
        getContentPane().add(sidebar, "West");
        getContentPane().add(conteudo, BorderLayout.CENTER);
        
        setVisible(true);
    }

    /**
     * 
     */
    private void montaConteudo() {
        conteudo.setBackground(Color.decode("#BEBEBE"));

        montaCabecalho();
        conteudo.add(jpCabecalho, "North");
        
        montaCorpo();
        conteudo.add(jpCorpo, "Center");
    }

    /**
     * Monta o cabeçalho superior das telas do sistema
     */
    private void montaCabecalho() {
        jpCabecalho.setBackground(Color.decode("#21252B"));
        jpCabecalho.setPreferredSize(new Dimension(800, 60));
        
        jpCabecalho.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(1, 20, 1, 20);
        gbc.gridx = 8;
        gbc.gridy = 0;
        
        tituloTela.setPreferredSize(new Dimension(200, 100));
        
        jpCabecalho.add(tituloTela, gbc);
        
        jpBotoesCabecalho.setLayout(new GridLayout(0, 4));
        JButton jbCadastrar = new JButton("Cadastrar");
        JButton jbEditar = new JButton("Editar");
        JButton jbLimpar = new JButton("Limpar");
        JButton jbApagar = new JButton("Apagar");
        
        jpBotoesCabecalho.add(jbCadastrar);
        jpBotoesCabecalho.add(jbEditar);
        jpBotoesCabecalho.add(jbLimpar);
        jpBotoesCabecalho.add(jbApagar);
        
        gbc.anchor = GridBagConstraints.NORTHEAST;
        jpCabecalho.add(jpBotoesCabecalho, gbc);
    }
    
    /**
     * Monta o corpo do layout
     */
    private void montaCorpo() {
        jpCorpo.setBackground(Color.decode("#4F79CA"));
        jpCorpo.setPreferredSize(new Dimension(800, 60));
        jpCorpo.setLayout(new GridLayout(1,0));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        Component tabelaCompra = new MinhaTabela();
        tabelaCompra = new MinhaTabela();

        jpContainerTabela.setLayout(new GridBagLayout());
        jpContainerTabela.add(tabelaCompra, gbc);      
        jpCorpo.add(jpContainerTabela);
        
    }

    /**
     * Adiciona o logo e os botões da barra lateral
     */
    public void montaSidebar(){
        JLabel logotipo = new JLabel();
        ImageIcon imagem = new ImageIcon("assets/img/logo.png");
        logotipo.setIcon(imagem);

        sidebar.add(logotipo);
        sidebar.add(jbVendas);
        sidebar.add(jbFornecedores);
        sidebar.add(jbProdutos); 
    }
}
