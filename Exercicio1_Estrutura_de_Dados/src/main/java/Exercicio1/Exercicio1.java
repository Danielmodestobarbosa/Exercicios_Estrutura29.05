/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Exercicio1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilson
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        Queue<String> filaPaciente = new LinkedList<>();
        
        int senhas = 20;
        
        while(true){
            
            int opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Menu de opções " + 
                                                    "\n" + "1 - Adicionar paciente" + 
                                                    "\n" + "2 - Chamar próximo paciente"));
           
            
            switch(opcao){
                case 1:
                    if (filaPaciente.size() < senhas) {
                        String nome = JOptionPane.showInputDialog(null, 
                                                    "Informe o nome do paciente");
                        
                        filaPaciente.offer(nome);
                        
                        JOptionPane.showMessageDialog(null, "Paciente " + nome +
                                                    " adicionado à fila");
                    } else {
                        JOptionPane.showMessageDialog(null, "Senhas esgotadas!");
                    }
                    break;
                case 2:
                    if (!filaPaciente.isEmpty()) {
                        String proxPaciente = filaPaciente.poll(); 
                        
                        JOptionPane.showMessageDialog(null, "Chamando próximo paciente " + proxPaciente);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há pacientes na fila.");
                    }
                    break;
            }
        }
        
    }
}
