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
        }/*
        else{
            return encontrado;
        }
        return null;*/
        System.out.println(encontrado);
    }

    public abstract Boolean buscar();

}
