package br.com.simples.factory;

public class TesteRodaColoridaFabrica {

    public static void main(String args[]) {

        Roda  carroRoda =  RodaFactory.fazerRodaColorida(55,155,"azul");
        System.out.println(carroRoda.getDiamentro());
        System.out.println(carroRoda.getLargura());



    }
}
