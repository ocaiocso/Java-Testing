public class Carro {
    String marca;
    String modelo;
    String cor;
    float odometro;
    float tanque;
    float consumoMedio;


    public Carro(String marca, String modelo, String cor, float odometro, float tanque, float consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.odometro = odometro;
        this.tanque = tanque;
        this.consumoMedio = consumo;
    }

    public void ligar() {
        System.out.println("O carro modelo " + this.modelo + " marca " + this.marca + " ligou!");
    }

    public void acelerar(float vm, float tempo) {
        float distancia = vm * tempo;
        this.odometro += distancia;
        float litros = distancia / this.consumoMedio;
        this.tanque -= litros;
        System.out.println("O carro modelo " + this.modelo + " marca " + this.marca + " acelerou!");
    }

    public void frear() {
        System.out.println("O carro modelo " + this.modelo + " marca " + this.marca + " freou!");
    }
}
