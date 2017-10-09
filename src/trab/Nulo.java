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
public class Nulo extends Buscador{
    
    public Nulo(Buscador proximo) {
        super(proximo);
    }
    
    public Nulo(){
        super(null);
    }
    

    @Override
    public Boolean buscar() {
        System.out.println("End");
        return false;
    }
}
