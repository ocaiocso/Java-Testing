public class aula_2 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Volkswagen","Gol","Preto", 35000, 40, 10);

        Carro carro2 = new Carro("Fiat","Uno" ,"Vermelho",20000, 20, 16);

        carro1.ligar();
        carro2.ligar();
        carro1.acelerar(50, 2);
        carro2.acelerar(90, 2);
        carro1.frear();
        carro2.frear();
    }
}