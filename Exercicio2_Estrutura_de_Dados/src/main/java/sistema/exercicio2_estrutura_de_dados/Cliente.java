/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.exercicio2_estrutura_de_dados;

/**
 *
 * @author Gilson
 */
public class Cliente {
    
    private int senha;
    private String nome;
    private int anoNasc;
    
    public Cliente(int senha, String nome, int anoNasc){
        this.senha = senha;
        this.nome = nome;
        this.anoNasc = anoNasc;
    }

    
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    
    
}
