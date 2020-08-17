package br.com.factory.method;

public class EmissorEmail  implements  Emissor{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Mensagem enviada por email");
        System.out.println(mensagem);
    }
}
