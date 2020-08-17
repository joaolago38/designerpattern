package br.com.factory.method;

public class EmissorCreator {

    public static final int SMS=0;
    public static final int EMAIL=1;
    public static final int JMS=0;

    public Emissor creator (int tipoEmissor){
        if(tipoEmissor == EmissorCreator .SMS){
           return new EmissorSms();
        } else if(tipoEmissor == EmissorCreator.EMAIL){
            return new EmissorEmail();
        } else if(tipoEmissor == EmissorCreator.JMS){
            return  new EmissorJMS();
        } else {
            throw new IllegalArgumentException (" Tipo de emissor não suportado ");
        }
    }

}
