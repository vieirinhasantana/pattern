/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author daniel.vieira
 */
public class Authorization implements Cart {
    
    private MeioPagamento meioPagamento;
    private User user;
    
    public void Authorization(User user){
        this.user = user;
    }
    
    @Override
    public void meioPagamento() {
        
        Buscador mongo = new Mongo(new Nulo());
        Buscador redis = new Redis(mongo);
        Buscador memcache = new MemCache(redis);
        memcache.buscarEmCadeia();

        
        /*if(user.getEmail().equalsIgnoreCase("daniel.vieira") && user.getPassword().equalsIgnoreCase("teste123")){
            meioPagamento = new MeioPagamento();
            meioPagamento.meioPagamento();
        }
        else {
            System.out.println("Credenciais inválidas! Tente novamente.");
        }*/
    }
}
