package Reserva;

public class Principal {
    public static void main(String[] args) {
        Reserva reserva1 = new ReservaDeHotel();
        Reserva reserva2 = new ReservaDeVoo();

        reserva1.adicionar();
        reserva1.cancelar();

        ((ReservaDeVoo) reserva2).adicionar("executiva");
        reserva2.cancelar();
    }
}
