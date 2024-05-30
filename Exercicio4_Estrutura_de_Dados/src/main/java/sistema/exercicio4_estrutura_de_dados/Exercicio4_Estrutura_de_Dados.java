/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistema.exercicio4_estrutura_de_dados;

import java.util.Date;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilson
 */
public class Exercicio4_Estrutura_de_Dados {

    public static void main(String[] args) {
        
        Stack<Produto> pilhaProdutos = new Stack<>();
        
        while(true){
            
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                                        null, "Menu de opções" + 
                                                     "\n" + "1 - Adicionar Produto" + 
                                                     "\n" + "2 - Despachar produtos" +
                                                     "\n" + "3 - Exibir pilhas de produtos " +
                                                     "\n" + "\n" + "Tecle Cancel para sair"));
            
         
        switch (opcao) {
                case 1:
                    addProduto(pilhaProdutos);
                    break;
                case 2:
                    despacharProduto(pilhaProdutos);
                    break;
                case 3:
                    exibirPilha(pilhaProdutos);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                                                  "Opção inválida!");
            }    
            
        }
        
    }
    private static void addProduto (Stack<Produto> pilhaProdutos) {
        
        int limiteProdutos = 10;
        if(pilhaProdutos.size() < limiteProdutos){
        int codProduto = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                  "Informe o código do produto"));

        String descricao = JOptionPane.showInputDialog(null, 
                        "Informe a descricao do produto");
        
        Date dataEntrada = new Date();

        String ufOrigem = JOptionPane.showInputDialog(null, 
                        "Informe a uf de origem do produto");
        
        String ufDestino = JOptionPane.showInputDialog(null, 
                        "Informe a uf de origem do produto");
        
        Produto produto = new Produto(codProduto, descricao, dataEntrada, ufOrigem, ufDestino);
        pilhaProdutos.push(produto);
        
        JOptionPane.showMessageDialog(null, 
                        "Produto adicionado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, 
                                          "Limite de caixas atingido");
        }
        
        
    }
    
    private static void despacharProduto(Stack<Produto> pilhaProdutos) {
        if (!pilhaProdutos.isEmpty()) {
            Produto produtoDespachado = pilhaProdutos.pop();
            JOptionPane.showMessageDialog(null, 
                        "Produto despachado: " + produtoDespachado);
            for (Produto produto : pilhaProdutos) {
                JOptionPane.showMessageDialog(null,"Produtos que restaram na pilha: "+produto);
            }
        } else {
            JOptionPane.showMessageDialog(null, 
                        "Não é possível despachar o produto pois a pilha está vazia");
        }
    }
    
    private static void exibirPilha(Stack<Produto> pilhaProdutos) {
        if (!pilhaProdutos.isEmpty()) {
            for (Produto produto : pilhaProdutos) {
                JOptionPane.showMessageDialog(null, 
                                "Produtos da pilha"+ produto);
            }
        } else {
            JOptionPane.showMessageDialog(null, 
                         "A pilha está vazia");
        }
    }
}
