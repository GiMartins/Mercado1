package com.senac.br.mercado.model;



public class produto {

    private int id;
    private String nome;
    private int quantidade;
    private String preco;


    public produto() {
    }

    public produto(String nome, int quantidade, String preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "produto{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco='" + preco + '\'' +
                '}';
    }
}

