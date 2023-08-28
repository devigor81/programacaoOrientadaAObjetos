package entities;

public class Produto {

    private String nome;
    private Double preco;
    private String descricao;

    private Vendedor vendedor;
    private Categoria categoria;

    public Produto(String nome, Double preco, String descricao, Vendedor vendedor, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.vendedor = vendedor;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", vendedor=" + vendedor +
                '}';
    }
}
