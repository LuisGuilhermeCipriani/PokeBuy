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
    private List<Pokemon> pokemonArmazenados;   
    
    public void comprarPokemon(Pokemon pokemon){
        pokemonArmazenados = new ArrayList<>();
        
        pokemonArmazenados.add(pokemon);
    }
    
    public int valorTotal(){
        int quantidade = 0;
        
        for(Pokemon p : pokemonArmazenados){
            quantidade += p.getQuantidade();
        }
        
        return quantidade;
    }
}
