package exercicioaula5;

public class ContaPoupanca extends ContaBancaria{

    private float juros;

    public ContaPoupanca(int agencia, int numero, double saldo, exercicioaula5.Pessoa pessoa, float juros) {
        super(agencia, numero, saldo, pessoa);
        this.juros = juros;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor * this.juros;
        System.out.println("Saldo total Conta Poupança:"+this.saldo);
    }
    public void sacar(double valor){
        if(valor>this.saldo){
            System.out.println("Saldo Insuficiente");
            return;
        }
        this.saldo = (this.saldo - valor);
        System.out.println("Saldo total Conta Poupança:"+this.saldo);
    }

}
