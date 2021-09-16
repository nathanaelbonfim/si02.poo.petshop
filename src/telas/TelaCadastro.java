package telas;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import componentes.MeuComponente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public abstract class TelaCadastro extends JInternalFrame implements ActionListener {
    // Estados das telas
    private final int PADRAO = 0;
    private final int INCLUINDO = 1;
    private final int ALTERANDO = 2;
    private final int CONSULTANDO = 3;
    private final int EXCLUINDO = 4;

    // Botões que aparecem em todas as telas
    private JButton jbIncluir = new JButton("Incluir");
    private JButton jbAlterar = new JButton("Alterar");
    private JButton jbExcluir = new JButton("Excluir");
    private JButton jbConsultar = new JButton("Consultar");
    private JButton jbConfirmar = new JButton("Confirmar");
    private JButton jbCancelar = new JButton("Cancelar");

    private int estadoTela = PADRAO;

    protected JPanel jpComponentes = new JPanel();
    private JPanel jpBotoes = new JPanel();

    protected List<MeuComponente> componentes = new ArrayList();

    public TelaCadastro(String titulo) {
        super(titulo, true, true, true, true);
        setSize(800, 600);

        jpComponentes.setLayout(new GridBagLayout());
        getContentPane().setLayout(new BorderLayout(2, 1));
        getContentPane().add(jpComponentes, "West");

        getContentPane().add(jpBotoes, "South");
        
        adicionaBotao(jbIncluir);
        adicionaBotao(jbAlterar);
        adicionaBotao(jbExcluir);
        adicionaBotao(jbConsultar);
        adicionaBotao(jbConfirmar);
        adicionaBotao(jbCancelar);

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
        if (ae.getSource() == jbIncluir) {
            incluir();
        } else if (ae.getSource() == jbAlterar) {
            alterar();
        } else if (ae.getSource() == jbExcluir) {
            excluir();
        } else if (ae.getSource() == jbConsultar) {
            consultar();
        } else if (ae.getSource() == jbConfirmar) {
            confirmar();
        } else if (ae.getSource() == jbCancelar) {
            cancelar();
        }
    }

    private void habilitaBotoes() {
        if (estadoTela == PADRAO) {
            jbIncluir.setEnabled(true);
            jbAlterar.setEnabled(false);
            jbExcluir.setEnabled(false);
            jbConsultar.setEnabled(true);
            jbConfirmar.setEnabled(false);
            jbCancelar.setEnabled(false);
        } else if (estadoTela == INCLUINDO) {
            jbIncluir.setEnabled(true);
            jbAlterar.setEnabled(false);
            jbExcluir.setEnabled(false);
            jbConsultar.setEnabled(false);
            jbConfirmar.setEnabled(true);
            jbCancelar.setEnabled(true);
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

    public void incluir() {
        estadoTela = INCLUINDO;
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
