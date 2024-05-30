/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistema.exercicio3_estrutura_de_dados;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilson
 */
public class Exercicio3_Estrutura_de_Dados {

    public static void main(String[] args) {
        
        Stack<Livro> pilhaLivros = new Stack<>();
        
        while(true){
            
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                                        null, "Menu de opções" + 
                                                     "\n" + "1 - Adicionar Livro" + 
                                                     "\n" + "2 - Listar livros" +
                                                     "\n" + "3 - Retirar livro " +
                                                     "\n" + "\n" + "Tecle Cancel para sair")); 
        
            switch(opcao){
                case 1:
                    addLivro(pilhaLivros);
                    break;
                case 2:
                    listarLivro(pilhaLivros);
                    break;
                case 3:
                    retirarLivro(pilhaLivros);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção não é valida");
            }

        }
    }
    private static void addLivro(Stack<Livro> pilhaLivros){
        
        String autor = JOptionPane.showInputDialog(null, 
                                            "Digite o autor do livro");
        
        String titulo = JOptionPane.showInputDialog(null, 
                                            "Digite o título do livro");
        
        String temaLivro = JOptionPane.showInputDialog(null, 
                                            "Digite tema do livro");
        
        Livro livro = new Livro(autor, titulo, temaLivro);
        pilhaLivros.push(livro);
        
        JOptionPane.showMessageDialog(null, 
                                            "Livro adicionado com sucesso.");
        
    }
    
    private static void listarLivro(Stack<Livro> pilhaLivros) {
        if (!pilhaLivros.isEmpty()) {
            for (Livro livro : pilhaLivros) {
                JOptionPane.showMessageDialog(null,"Livro da pilha: "+livro);
            }
        } else {
            JOptionPane.showMessageDialog(null, 
                                            "A pilha está vazia");
        }
    }
    
    private static void retirarLivro(Stack<Livro> pilhaLivros) {
        if (!pilhaLivros.isEmpty()) {
            Livro livroRemovido = pilhaLivros.pop();
            JOptionPane.showMessageDialog(null, 
                                            "Livro retirado da pilha" + 
                                             livroRemovido);
        } else {
            JOptionPane.showMessageDialog(null, 
                                     "Não é possível retirar livros pois a pilha está vazia");
        }
    }
}
