import entities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String nome = "Igor";
        String sobrenome = "Vitor";
        String cpf = "00000000000";
        String senha = "1234";
        Integer idade = 20;

        Usuario usuario = new Usuario(nome, sobrenome, cpf, senha, idade);

        String nome2 = "Gustavo";
        String sobrenome2 = "Alves";
        String cpf2 = "11111000000";
        String senha2 = "123456";
        Integer idade2 = 25;

        Usuario usuario2 = new Usuario(nome2, sobrenome2, cpf2, senha2, idade2);

        String nomeVendedor = "Jose";
        String sobrenomeVendedor = "Luis";
        String cpfVendedor = "22222000000";
        String senhaVendedor = "33333";
        Integer idadeVendedor = 40;

        Vendedor vendedor = new Vendedor(nomeVendedor, sobrenomeVendedor, cpfVendedor, senhaVendedor, idadeVendedor);

        String descricaoCategoria = "Frutas";

        Categoria categoria = new Categoria(descricaoCategoria);

        String nomeFruta = "Tomate da casa";
        Double preco = 3.50;
        String descricao = "A melhor que tá tendo";

        Produto tomate = new Produto(nomeFruta, preco, descricao, vendedor, categoria);

        String nomeVendedor2 = "Maria";
        String sobrenomeVendedor2 = "Alves";
        String cpfVendedor2 = "33333000000";
        String senhaVendedor2 = "333334";
        Integer idadeVendedor2 = 45;

        Vendedor vendedor2 = new Vendedor(nomeVendedor2, sobrenomeVendedor2, cpfVendedor2, senhaVendedor2, idadeVendedor2);

        String descricaoCategoria2 = "Verdura";

        Categoria categoria2 = new Categoria(descricaoCategoria2);

        String nomeVerdura = "Cebola";
        Double preco2 = 2.50;
        String descricao2 = "A melhor cebola da região";

        Produto cebola = new Produto(nomeVerdura, preco2, descricao2, vendedor2, categoria2);

        List<Produto> pedidoProduto = new ArrayList<>();
        pedidoProduto.add(tomate);
        pedidoProduto.add(cebola);

        List<Produto> pedidoProduto2 = new ArrayList<>();
        pedidoProduto2.add(tomate);

        Pedido pedido = new Pedido(usuario, pedidoProduto);
        Pedido pedido2 = new Pedido(usuario2, pedidoProduto2);

        System.out.println(" ----- OBJETOS ANTES DE SEREM ALTERADOS -----");
        System.out.println(usuario);
        System.out.println(usuario2);

        System.out.println(vendedor);
        System.out.println(vendedor2);

        System.out.println(categoria);
        System.out.println(categoria2);

        System.out.println(tomate);
        System.out.println(cebola);

        System.out.println(pedido);
        System.out.println(pedido2);

        usuario.setSobrenome("Ferreira");
        usuario2.setSobrenome("Silva");

        tomate.setPreco(4.50);
        cebola.setPreco(5.20);

        vendedor.setIdade(50);
        vendedor2.setIdade(55);

        pedido2.setTotal(pedido2.totalPedido(pedido2.getProduto()));
        pedido.setTotal(pedido.totalPedido(pedido.getProduto()));

        System.out.println();
        System.out.println(" ----- OBJETOS DEPOIS DE SEREM ALTERADOS -----");
        System.out.println(usuario);
        System.out.println(usuario2);

        System.out.println(vendedor);
        System.out.println(vendedor2);

        System.out.println(categoria);
        System.out.println(categoria2);

        System.out.println(tomate);
        System.out.println(cebola);

        System.out.println(pedido);
        System.out.println(pedido2);

    }
}