package entities;

public class Categoria {

    private String descricao;

    public Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
