package sistemadereservasdevuelos;

public class Asiento {
    private int numero;
    private boolean disponible;

    public Asiento(int numero) {
        this.numero = numero;
        this.disponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void reservar() {
        if (disponible) {
            disponible = false;
            System.out.println("Asiento #" + numero + " reservado con exito.");
        } else {
            System.out.println("El asiento #" + numero + " se encuentra reservado.");
        }
    }
}