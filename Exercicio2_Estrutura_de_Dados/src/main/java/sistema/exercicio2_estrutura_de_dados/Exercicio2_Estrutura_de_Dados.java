/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistema.exercicio2_estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilson
 */
public class Exercicio2_Estrutura_de_Dados {

    public static void main(String[] args) {
        
        Queue<Cliente> filaPrioridade = new LinkedList<>();
        Queue<Cliente> filaSimples = new LinkedList<>();
        
        int Atendidos = 0;
        int Atendidos_Prioridade = 0;
        
        while(true){
            
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                                        null, "Menu de opções" + 
                                                     "\n" + "1 - Adicionar cliente" + 
                                                     "\n" + "2 - Chamar próximo cliente" +
                                                     "\n" + "\n" + "Tecle Cancel para sair")); 
            
            switch(opcao){
                case 1:
                    addCliente(filaPrioridade, filaSimples);
                    break;
                case 2:
                    chamarCliente(filaPrioridade, filaSimples);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção não é valida");
            }   
        }
    }
    private static void addCliente(Queue<Cliente> filaPrioridade, Queue<Cliente> filaSimples) {
       
        String nome = JOptionPane.showInputDialog(null, 
                                          "Digite o nome do cliente");
        
        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                           "Digite o ano de nascimento do cliente"));
        
        
        int senha = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                  "Cadastre uma senha para o cliente" ));
        
        Cliente cliente = new Cliente(senha, nome, anoNasc);
        if (anoNasc <= 1959) { 
            filaPrioridade.add(cliente);
        } else {
            filaSimples.add(cliente);
        }
        JOptionPane.showMessageDialog(null, "Cadastro de cliente concluído");
    }
    
    private static void chamarCliente(Queue<Cliente> filaPrioridade, Queue<Cliente> filaSimples) {
        
        if (!filaPrioridade.isEmpty()) {
            Cliente cliente = filaPrioridade.poll();
            JOptionPane.showMessageDialog(null, 
                                            "Chamando cliente que possui prioridade: " + "\n" + cliente.getNome());
            
            if (filaPrioridade.size() % 2 == 0) { 
                
                if (!filaSimples.isEmpty()) {
                    Cliente clienteNormal = filaSimples.poll();
                    JOptionPane.showMessageDialog(null, 
                                            "Chamando cliente que não possui prioridade: " + "\n" + cliente.getNome());
                }
            }
        }else if (!filaSimples.isEmpty()) {
            Cliente clienteNormal = filaSimples.poll();
            JOptionPane.showMessageDialog(null, 
                                            "Chamando cliente que não possui prioridade: " + "\n" + clienteNormal.getNome());
        } else {
            JOptionPane.showMessageDialog(null, "Não tem clientes na fila!");
        }
    }
}
