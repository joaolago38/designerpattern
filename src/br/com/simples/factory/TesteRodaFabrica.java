package br.com.simples.factory;

public class TesteRodaFabrica {
    public static void main(String args[]) {

        Roda  carroRoda =  RodaFactory.fazerRoda(55,155);
        System.out.println(carroRoda.getDiamentro());
        System.out.println(carroRoda.getLargura());



    }
}
