package componentes;

import java.awt.Component;
import telas.TelaSistema;

public class MinhaTabela extends Component {

    /**
     * Creates new form CompraTable
     */
    public MinhaTabela() {
        initComponents();
    }
                       
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        JPane = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // addActionListener(new java.awt.event.ActionListener() {
        //     public void componentAdded(java.awt.event.ActionListener evt) {
        //         formComponentAdded(evt);
        //     }
        // });
        TelaSistema.jpContainerTabela.setLayout(new java.awt.GridBagLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Data", "Fornecedor", "Desconto total", "null"
            }
        ));
        //JPane.setViewportView(jTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 2, 1, 2);
        TelaSistema.jpContainerTabela.add(JPane, gridBagConstraints);
        // JPane.getAccessibleContext().setAccessibleName("");
        // JPane.getAccessibleContext().setAccessibleDescription("");
        // JPane.getAccessibleContext().setAccessibleParent(null);
        //pack();
    }// </editor-fold>                        

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane JPane;
    private javax.swing.JTable jTable2;
    // End of variables declaration                   
}