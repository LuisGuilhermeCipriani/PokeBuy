/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cipri
 */
public class Pokemon {
    private String nome = "";
    private String tipo = "";
    private Float preco;
    private String som = "";
    private Integer quantidade;
    
    Pokemon(){
        
    };
    
    public Pokemon(String nome, String tipo, Float preco, String som, Integer quantidade){
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.som = som;
        this.quantidade = quantidade;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }       
}
