/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author Daniel Vieira
 */
public class Pagamento {
    private ModoPagamento modoPagamento;
    
    public void pagar(){
        modoPagamento.pagamento();
    }
    
    public void setModoPagamento(ModoPagamento novoModoPagamento){
        modoPagamento = novoModoPagamento;
    }
}
