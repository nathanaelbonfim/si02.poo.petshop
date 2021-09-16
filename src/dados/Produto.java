package dados;

public class Produto {
    public Integer cod;
    public String cod_barras;
    public String nome;
    public Double valor;
    private Integer fornecedor_id;

    public Produto(Integer cod, String cod_barras, String nome, Double valor, Integer fornecedor_id) {
        this.cod = cod;
        this.cod_barras = cod_barras;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor_id = fornecedor_id;
    }

    public void setFornecedor(Integer id) {}
    public Integer getFornecedor() {
        return 0;
    };
}
