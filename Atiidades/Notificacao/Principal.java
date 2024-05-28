package Notificacao;

public class Principal {
    public static void main(String[] args) {
        NotificacaoEmail emailNotification = new NotificacaoEmail();
        NotificacaoApp appNotification = new NotificacaoApp();

        emailNotification.enviar(); 
        emailNotification.enviar("joao@example.com", "maria@example.com"); 
        appNotification.enviar();
    }
}
