package sistemadereservasdevuelos;

public class Asiento {
    private int numero;
    private boolean disponible;
    private String clase;

    public Asiento(int numero) {
        this.numero = numero;
        this.clase = clase;
        this.disponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public String getClase() {
        return clase;
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

    public void liberarAsiento() {
        if (!disponible) {
            disponible = true;
            System.out.println("Reserva del asiento #" + numero + " cancelada.");
        } else {
            System.out.println("El asiento #" + numero + " se encuentra disponible.");
        }
    }
}