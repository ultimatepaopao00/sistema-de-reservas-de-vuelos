package sistemadereservasdevuelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservasVuelos {
    static class Vuelo {
        String numeroVuelo;
        String origen;
        String destino;
        LocalDateTime salida;
        LocalDateTime llegada;
        int asientos;
        double precio;

        public Vuelo(String numeroVuelo, String origen, String destino, LocalDateTime salida, LocalDateTime llegada, int asientos, double precio) {
            this.numeroVuelo = numeroVuelo;
            this.origen = origen;
            this.destino = destino;
            this.salida = salida;
            this.llegada = llegada;
            this.asientos = asientos;
            this.precio = precio;
        }
         boolean hayAsientos(int cantidad) {
            return asientos >= cantidad;
        }
        
        void reservarAsientos(int cantidad) {
            asientos -= cantidad;
        }
        
        void cancelarAsientos(int cantidad) {
            asientos += cantidad;
        }
    }
    
    static class Pasajero {
        String pasaporte;
        String nombre;
        String apellido;
       
        
        public Pasajero(String pasaporte, String nombre, String apellidol) {
            this.pasaporte = pasaporte;
            this.nombre = nombre;
            this.apellido = apellido;
            
        }