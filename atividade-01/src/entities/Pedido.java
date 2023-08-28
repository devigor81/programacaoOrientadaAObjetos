package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Usuario usuario;

    private List<Produto> produto;

    private Double total;

    public Pedido(Usuario usuario, List<Produto> produto) {
        this.usuario = usuario;
        this.produto = produto;
        this.total = totalPedido(produto);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double totalPedido(List<Produto> produtos) {
        double total = 0;
        for(Produto produto : produtos) {
            total += produto.getPreco();
        }

        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "usuario=" + usuario +
                ", produto=" + produto +
                ", total=" + total +
                '}';
    }
}
