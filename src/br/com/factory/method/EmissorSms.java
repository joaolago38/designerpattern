package br.com.factory.method;

public class EmissorSms  implements  Emissor{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Mensagem enviada por sms");
        System.out.println(mensagem);
    }
}
