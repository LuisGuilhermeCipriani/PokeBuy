/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Pokemon;

/**
 *
 * @author cipri
 */
public class PokeBuy {
    private static List<Pokemon> pokemonArmazenados;   
    private List<Pokemon> pokemonComprados;
    
    public void comprarPokemon(Pokemon pokemon){
        pokemonComprados = new ArrayList<>();
        
        pokemonComprados.add(pokemon);
    }
    
    public int valorTotal(){
        int quantidade = 0;
        
        for(Pokemon p : pokemonComprados){
            quantidade += p.getQuantidade();
        }
        
        return quantidade;
    }
    
    public static void registraPokemon(){
        pokemonArmazenados = new ArrayList<>();
        Pokemon pk1 = new Pokemon("Pikachu", "Eletrico", 20.0f, "Pika pika", 0);
        pokemonArmazenados.add(pk1);
        Pokemon pk2 = new Pokemon("Bulbasaur", "Grama", 15.0f, "Bulba", 0);
        pokemonArmazenados.add(pk2);
        Pokemon pk3 = new Pokemon("Charmander", "Fogo", 15.0f, "Char", 0);
        pokemonArmazenados.add(pk3);
        Pokemon pk4 = new Pokemon("Squirtle", "Agua", 15.0f, "Squirtleeee", 0);
        pokemonArmazenados.add(pk4);
        Pokemon pk5 = new Pokemon("Pidgeoto", "Voador", 10.5f, "Pidgeot", 0);
        pokemonArmazenados.add(pk5);
        Pokemon pk6 = new Pokemon("Caterpie", "Inseto", 9.0f, "Caterpie", 0);
        pokemonArmazenados.add(pk6);
        Pokemon pk7 = new Pokemon("Gastly", "Fantasma", 12.9f, "Gas", 0);
        pokemonArmazenados.add(pk7);
        Pokemon pk8 = new Pokemon("Abra", "Psiquico", 12.0f, "Abraaaa", 0);
        pokemonArmazenados.add(pk8);
        Pokemon pk9 = new Pokemon("Snorlax", "Normal", 17.3f, "Snor", 0);
        pokemonArmazenados.add(pk9);
        Pokemon pk10 = new Pokemon("Jynx", "Gelo", 13.0f, "Jyyyynx", 0);
        pokemonArmazenados.add(pk10);
    }   
    
    public static void exibePokemon(){
        for(Pokemon pokemon : pokemonArmazenados){
            System.out.println("Pokemon: " + pokemon.getNome() + ", Tipo: " + pokemon.getTipo() + ", Preço: " + pokemon.getPreco() + ", Som: " + 
                    pokemon.getSom());
        }
    }
    
}
