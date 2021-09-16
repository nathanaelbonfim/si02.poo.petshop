package telas;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import componentes.MeuComponente;
import componentes.MinhaTabelaListagem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public abstract class TelaListagem extends JInternalFrame implements ActionListener {
    // Estados das telas
    private final int PADRAO = 0;
    private final int SELECIONADO = 1;

    // Botões que aparecem em todas as telas
    public JButton jbCadastrar = new JButton("Cadastrar");
    public JButton jbAlterar = new JButton("Alterar");
    public JButton jbExcluir = new JButton("Excluir");

    private int estadoTela = PADRAO;

    protected JPanel jpComponentes = new JPanel();
    private JPanel jpBotoes = new JPanel();
    private JPanel jpTabela = new JPanel();

    protected List<MeuComponente> componentes = new ArrayList();

    public TelaListagem(String titulo) {
        super(titulo, true, true, true, true);
        setSize(800, 600);

        jpComponentes.setLayout(new GridBagLayout());
        getContentPane().setLayout(new BorderLayout(2, 1));
        getContentPane().add(jpComponentes, "West");

        jpTabela.setBackground(Color.red);
        getContentPane().add(new MinhaTabelaListagem().criaTabela(), "Center");

        
        getContentPane().add(jpBotoes, "South");
        
        adicionaBotao(jbCadastrar);
        adicionaBotao(jbAlterar);
        adicionaBotao(jbExcluir);

        pack();
        setVisible(true);

        TelaSistema.jdp.add(this);

        habilitaBotoes();
    }

    private void adicionaBotao(JButton botao) {
        jpBotoes.add(botao);
        botao.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jbCadastrar) {
            cadastrar();
        } else if (ae.getSource() == jbAlterar) {
            alterar();
        } else if (ae.getSource() == jbExcluir) {
            excluir();
        }
    }

    public void montaTabela() {
        JPanel tabela = new MinhaTabelaListagem().criaTabela();


    }

    private void habilitaBotoes() {
        if (estadoTela == PADRAO) {
            jbCadastrar.setEnabled(true);
            jbAlterar.setEnabled(true);
            jbExcluir.setEnabled(false);
        } else if (estadoTela == SELECIONADO) {
            jbCadastrar.setEnabled(false);
            jbAlterar.setEnabled(true);
            jbExcluir.setEnabled(true);
        }
    }

    protected void habilitaComponentes(Boolean status) {
        for (MeuComponente componente : componentes) {
            componente.habilitar(status);
        }
    }

    protected void adicionaComponente(int linha, int coluna, int linhasOcupadas, int colunasOcupadas, MeuComponente component) {
        GridBagConstraints gbc = new GridBagConstraints();
        // Alinhamento
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(2, 2, 2, 2);
        
        // Posição
        gbc.gridy = linha;
        gbc.gridx = coluna;
        
        // Tamanhos
        gbc.gridheight = linhasOcupadas;
        gbc.gridwidth = 1; // Inicialmente, ocupa 1 para a label
        
        String texto = "<html><body>" + component.getDica();
        if (component.eObrigatorio()) {
            texto = texto + "<font color=red>*" + "</font>";
        }
        texto = texto + "</body></html>";

        jpComponentes.add(new JLabel(texto), gbc);
        gbc.gridwidth = colunasOcupadas; // Tamanho do input passado na classe
        gbc.gridy++;
        jpComponentes.add((JComponent) component, gbc);

        componentes.add(component);
    }

    public void cadastrar() {
        habilitaComponentes(true);
        habilitaBotoes();
    }
    public void alterar() {}
    public void excluir() {}
    public void consultar() {}
    public void confirmar() {
        estadoTela = PADRAO;
        habilitaComponentes(false);
        habilitaBotoes();
    }
    public void cancelar() {
        estadoTela = PADRAO;

        // Limpa os componentes
       for (MeuComponente componente: componentes) {
           componente.limpar();
       }

        habilitaComponentes(false);
        habilitaBotoes();
    }
}
