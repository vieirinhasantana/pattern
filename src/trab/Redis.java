package trab;

public class Redis extends Buscador{
    
    public Redis(Buscador proximo) {
        super(proximo);
    }

    @Override
    public Boolean buscar() {
        System.out.println("Usuário nao encontrado em Redis");
        return false;
    }
}
