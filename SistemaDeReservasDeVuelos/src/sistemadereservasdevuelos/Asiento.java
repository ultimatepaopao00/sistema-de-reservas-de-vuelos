package sistemadereservasdevuelos;

public class Asiento {
    private int numero;
    private boolean disponible;

    public Asiento(int numero) {
        this.numero = numero;
        this.disponible = true;
    }