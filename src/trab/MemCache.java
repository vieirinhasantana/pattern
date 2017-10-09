package trab;

public class MemCache extends Buscador{
    
    public MemCache (Buscador proximo) {
        super(proximo);
    }
    
    @Override
    public Boolean buscar() {
        System.out.println("Usuário nao encontrador no memcache");
        return false;
    }
    
}
