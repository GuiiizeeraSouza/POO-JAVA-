package Reserva;

public class ReservaDeHotel extends Reserva{
    @Override
    public void cancelar() {
        System.out.println("Reserva de hotel cancelada. Política de cancelamento padrão aplicada.");
    }
}
