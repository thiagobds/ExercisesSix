/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import disciplina.Disciplina;
public class TestaDisciplina {
    public static void main(String[] args){
        Disciplina d1 = new Disciplina("Banco de dados",68,4);
        System.out.println(d1.getNome());
        System.out.println(d1.getPeriodo());
        System.out.println(d1.getCodigo());
        
        
        
        
    }
}
