package trab;

public abstract class Buscador {
    
    private Buscador proximo;

    public Buscador(Buscador proximo) {
        this.proximo = proximo;
    }

    public void buscarEmCadeia() {
        Boolean encontrado = buscar();
        if (!encontrado) {
            proximo.buscarEmCadeia();
        }
    }

    public abstract Boolean buscar();

}
