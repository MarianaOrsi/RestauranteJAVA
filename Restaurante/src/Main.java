import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Reserva reservaFelipe = new Reserva("Felipe", "Stefani", "33311122244", LocalDate.now());
        reservaFelipe.validarReserva();

    }
}