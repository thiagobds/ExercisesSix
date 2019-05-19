/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplina;


public class Disciplina {
    private String nome;
    private int codigo;
    private int periodo;

    
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int c){
        this.codigo = c;
    }
    public int getPeriodo(){
        return this.periodo;
    }
    public void setPeriodo(int p) {
        this.periodo = p;
    }
    
    public Disciplina (String n, int c,int p){
        setNome(n);
        setCodigo(c);
        setPeriodo(p);
    }
    
}
