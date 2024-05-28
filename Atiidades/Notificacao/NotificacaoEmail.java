package Notificacao;

public class NotificacaoEmail extends Notificacao{
    @Override
    public void enviar() {
        System.out.println("Notificação por e-mail enviada para o destinatário padrão.");
    }

    public void enviar(String... destinatarios) {
        System.out.print("Notificação por e-mail enviada para:");
        for (String destinatario : destinatarios) {
            System.out.print(" " + destinatario);
        }
        System.out.println();
    }
}
