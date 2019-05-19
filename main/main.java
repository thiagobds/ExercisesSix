/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import pessoa.Pessoa;


public class main {
    public static void main(String[] args){
        Pessoa p = new Pessoa("John","João Cotta Sobrinho Bairro: Industrial numero:508", 92148871);
        
        System.out.println("Nome:" + p.getNome() + "  " + "Endereco:" + p.getEndereco() + "  " + "Telefone:"  +  p.getTelefone());
    }
    
}
