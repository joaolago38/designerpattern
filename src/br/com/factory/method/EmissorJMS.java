package br.com.factory.method;

public class EmissorJMS implements Emissor {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Mensagem enviada por jms");
        System.out.println(mensagem);
    }
}
