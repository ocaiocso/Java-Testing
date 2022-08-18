
public class Carro {

    String marca;
    String modelo;
    String cor;
    String numero;
    float odometro;

    public void ligar(){
        System.out.println("O carro modelo "+this.modelo+ " marca "+ this.marca+ " ligou!");
    }
    public void acelerar(){
        System.out.println("O carro modelo "+this.modelo+ " marca "+ this.marca+ " acelerou!");
    }
    public void frear(){
        System.out.println("O carro modelo "+this.modelo+ " marca "+ this.marca+ " freou!");
    }
}
