/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistema.exercicio5_estrutura_de_dados;

import java.util.Date;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilson
 */
public class Exercicio5_Estrutura_de_Dados {
        static Stack<Produto> pilhaProdutos1 = new Stack<>();
        static Stack<Produto> pilhaProdutos2 = new Stack<>();
        static Stack<Produto> pilhaProdutos3 = new Stack<>();
        static Stack<Produto> pilhaProdutos4 = new Stack<>();
        static Stack<Produto> pilhaProdutos5 = new Stack<>();
    public static void main(String[] args) {
        
        
        
        while(true){
            
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                                        null, "Menu de opções" + 
                                                     "\n" + "1 - Adicionar Produto" + 
                                                     "\n" + "2 - Despachar produtos" +
                                                     "\n" + "3 - Exibir pilhas de produtos " +
                                                     "\n" + "\n" + "Tecle Cancel para sair"));
            
         
        switch (opcao) {
                case 1:
                    Stack<Produto> pilha = selecionarPilha(); 
                    addProduto(pilha);
                    break;
                case 2:
                     pilha = selecionarPilha(); 
                    despacharProduto(pilha);
                    break;
                case 3:
                     pilha = selecionarPilha(); 
                    exibirPilha(pilha);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                                                  "Opção inválida!");
            }    
            
        }
        
    }
    
     
    
    public static Stack<Produto> selecionarPilha(){
       
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                            "Insira uma pilha de 1 a 5"));
        
        
        switch(opcao){
            case 1:
                return pilhaProdutos1;
            break;
            case 2:
                return pilhaProdutos2;
            break;
            case 3:
                return pilhaProdutos3;
            break;
            case 4:
                return pilhaProdutos4;
            break;
            case 5:
                return pilhaProdutos5;
            break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida");
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
}
