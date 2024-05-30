/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.exercicio3_estrutura_de_dados;

/**
 *
 * @author Gilson
 */
public class Livro {
    
    private String autor;
    private String titulo;
    private String temaLivro;
    
    public Livro(String autor, String titulo, String temaLivro){
        this.autor = autor;
        this.titulo = titulo;
        this.temaLivro = temaLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTemaLivro() {
        return temaLivro;
    }

    public void setTemaLivro(String temaLivro) {
        this.temaLivro = temaLivro;
    }

    @Override
    public String toString() {
        return "Livro{" + "autor=" + autor + ", titulo=" + titulo + ", temaLivro=" + temaLivro + '}';
    }

   
    
    
    
}


