package com.catolica.aula2403.objetos;

public class Produto {

    /*
    Atributos
     */
    private String nome;
    private int quantidade;
    private double preco;

    /*
    Construtor
     */

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    /*
    Métodos
     */
    public void exibirInfo() {
        System.out.println("\n=== INFOS DO PRODUTO ===");
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Quantidade disponível: " + this.quantidade);
        System.out.println("Preço: " + preco);

    }

    public void addEstoque(int qtd) {
        this.quantidade += qtd;
        System.out.println("\nQuantidade: " + qtd + " | adicionada com sucesso!");
    }

    public void removerEstoque(int qtd) {

        if(qtd <= this.quantidade) {
            this.quantidade -= qtd;
            System.out.println("\nQuantidade: " + qtd + " | removida com sucesso!");
        } else {
            System.out.println("\nQuantidade insuficiente no estoque para remover: " + qtd + " unidades!");
        }
    }

    /*
    Getters e Setters
     */

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
