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
    private User user;
    private Boolean status;
    
    public void Authorization(User user){
        this.user = user;
    }
    
    @Override
    public Boolean buscarUsuario() {
        if(user.getEmail().equalsIgnoreCase("admin") && user.getPassword().equalsIgnoreCase("teste123")){
            Buscador mongo = new Mongo(new Nulo());
            Buscador redis = new Redis(mongo);
            Buscador memcache = new MemCache(redis);
            memcache.buscarEmCadeia();
            this.status = true;
        }
        else {
            System.out.println("Credenciais inválidas! Tente novamente.");
            this.status = false;
        }
        return status;
    }
    
    public Boolean getStatusAuth () {
        return this.status;
    }
}
