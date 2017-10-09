package trab;
public class Mongo extends Buscador{

    public Mongo (Buscador proximo) {
        super(proximo);
    }
    
    @Override
    public Boolean buscar() {
        System.out.println("Usuário encontrado no mongo -> Copiado para Redis -> Copiado para MemCache");
        return true;
    }
    
}
