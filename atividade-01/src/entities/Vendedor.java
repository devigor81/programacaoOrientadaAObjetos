package entities;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String senha;
    private Integer idade;

    public Vendedor(String nome, String sobrenome, String cpf, String senha, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.senha = senha;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", senha='" + senha + '\'' +
                ", idade=" + idade +
                '}';
    }
}
