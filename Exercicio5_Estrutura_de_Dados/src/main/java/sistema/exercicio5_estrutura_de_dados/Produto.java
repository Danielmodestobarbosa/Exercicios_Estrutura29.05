/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.exercicio5_estrutura_de_dados;

import java.util.Date;

/**
 *
 * @author Gilson
 */
public class Produto {
    
    private int codProduto;
    private String descricao;
    private Date dataEntrada;
    private String ufOrigem;
    private String ufDestino;
    
    public Produto(int codProduto, String descricao, Date dataEntrada,
                       String ufOrigem, String ufDestino){
    
    this.codProduto = codProduto;
    this.descricao = descricao;
    this.dataEntrada = dataEntrada;
    this.ufOrigem = ufOrigem;
    this.ufDestino = ufDestino;
    }

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", descricao=" + descricao + ", dataEntrada=" + dataEntrada + ", ufOrigem=" + ufOrigem + ", ufDestino=" + ufDestino + '}';
    }
    
}
