package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conexao {
    private static Connection conexao = null;

    public static Connection getConexao() {
        if (conexao != null) {
            return conexao;
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost/test?" +
                    "user=minty&password=greatsqldb"
                );
                return conexao;
            } catch (ClassNotFoundException cnfe) {
                cnfe.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro no driver JDBC");
            } catch (SQLException se) {
                se.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro de SQL");
            }
        }
        return conexao;
    }

    public static void main(String args[]) {
        try {
            String sql = "SELECT NOME_CLIENTE FROM CLIENTE";
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao consultar cliente");
        }
    }
}
