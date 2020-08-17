package br.com.simples.factory;

public class CarroRoda  implements  Roda {

    private float largura;
    private float diametro;
    private  String cor;

    public CarroRoda(float largura, float diametro) {
        this.largura = largura;
        this.diametro = diametro;
    }

    public CarroRoda(float largura, float diametro, String cor) {
        this.largura = largura;
        this.diametro = diametro;
        this.cor = cor;
    }

    @Override
    public float getDiamentro() {
        return largura;
    }

    @Override
    public float getLargura() {
        return diametro;
    }

    @Override
    public String getCor() {
        return cor;
    }


}
