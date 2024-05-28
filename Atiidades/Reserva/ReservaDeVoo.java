package Reserva;

public class ReservaDeVoo extends Reserva {
    @Override
    public void adicionar() {
        System.out.println("Reserva de voo adicionada. Classe econômica selecionada.");
    }

    public void adicionar(String classe) {
        System.out.println("Reserva de voo adicionada. Classe " + classe + " selecionada.");
    }

    @Override
    public void cancelar() {
        System.out.println("Reserva de voo cancelada. Política de cancelamento específica aplicada.");
    }
}
