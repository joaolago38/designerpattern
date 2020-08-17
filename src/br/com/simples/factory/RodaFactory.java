package br.com.simples.factory;

public class RodaFactory {
    public static Roda fazerRoda(float diametro, float largura){
       return  new CarroRoda(diametro, largura);
    }

    public static CarroRoda fazerRodaColorida(float diametro, float largura, String cor) {
        return new CarroRoda(diametro, largura,cor);
    }
}
