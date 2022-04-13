package view;

import controller.PokeBuy;
import model.Pokemon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cipri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokeBuy.registraPokemon();
        PokeBuy.exibePokemon();
        
    } 
}
