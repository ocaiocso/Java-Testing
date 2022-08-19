public class Carro {

    float tanque = 0;
    float odometro = 0;
    float consumoMedio = 0;

    public Carro() {

    }

    public Carro(float consumo) {
        this.consumoMedio = consumo;
    }

    public Carro(float consumo, float tanque) {
        this.consumoMedio = consumo;
        this.tanque = tanque;
    }

    public void setarVelocidade(float vm, float tempo) {
        float distancia =  vm * tempo;
        float litros = distancia / this.consumoMedio;

        if(litros>this.tanque){
            litros=this.tanque;
            distancia = litros * this.consumoMedio;
        }

        this.odometro += distancia;
        this.tanque -= litros;
    }

}