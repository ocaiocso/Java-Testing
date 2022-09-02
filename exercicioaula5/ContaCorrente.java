package exercicioaula5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(int agencia, int numero, double saldo, Pessoa pessoa) {
        super(agencia, numero, saldo, pessoa);
    }


    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Saldo total Conta Corrente:"+this.saldo);
    }

    public void sacar(double valor){
        if(valor>this.saldo){
            System.out.println("Saldo Insuficiente");
            return;
        }
        this.saldo = (this.saldo - valor);
        System.out.println("Saldo total Conta Corrente:"+this.saldo);
    }

}
