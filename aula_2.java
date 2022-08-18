public class aula_2 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Volkswagen";
        carro1.modelo = "Gol";
        carro1.cor = "Preto";
        carro1.odometro = 35000;
        Carro carro2 = new Carro();
        carro2.marca = "Fiat";
        carro2.modelo = "Uno";
        carro2.cor = "Vermelho";
        carro2.odometro = 20000;

        carro1.ligar();
        carro2.ligar();
        carro1.acelerar();
        carro1.frear();
        carro2.frear();
    }
}