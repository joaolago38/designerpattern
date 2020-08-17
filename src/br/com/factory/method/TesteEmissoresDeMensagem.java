package br.com.factory.method;

public class TesteEmissoresDeMensagem {
    public static void main(String args[]) {
        Emissor emissor = new EmissorSms();
        emissor.enviar("Enviado por sms");
        Emissor emissorEmail = new EmissorEmail();
        emissorEmail.enviar("enviando por email");
        Emissor emissorJms = new EmissorJMS();
        emissorJms.enviar("enviado por jms");

    }
}
