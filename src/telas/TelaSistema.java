package telas;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextPane;


public class TelaSistema extends JFrame {
    public static JDesktopPane jdp = new JDesktopPane();
    private JMenuBar jmb;

    /**
     * Barra lateral
     */
    private JPanel sidebar = new JPanel();
    /**
     * Conteúdo da tela
     */
    private JPanel conteudo = new JPanel();

    /**
     * Container para os botões da barra superior
     */
    private JPanel jpCabecalho = new JPanel();

    /**
     * Container para o corpo da tela 
     */
    private JPanel jpCorpo = new JPanel();


    // Botões
    private JButton jbVendas = new JButton("Vendas");
    private JButton jbFornecedores = new JButton("Fornecedores");
    private JButton jbProdutos = new JButton("Produtos");
    
    public TelaSistema(String titulo) {
        super(titulo);
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

    
    private void montaCabecalho() {
        jpCabecalho.setBackground(Color.decode("#21252B"));
        jpCabecalho.setPreferredSize(new Dimension(800, 60));
        
        JLabel texto = new JLabel("Teste");
        texto.setForeground(Color.white);
        jpCabecalho.add(texto);
    }
    

    private void montaCorpo() {
        jpCorpo.setBackground(Color.decode("#4F79CA"));
        jpCorpo.setPreferredSize(new Dimension(800, 60));
        
        JLabel texto = new JLabel("Teste");
        texto.setForeground(Color.white);
        jpCorpo.add(texto);
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
