package exercicioaula5;

public class ContaBancaria  {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Pessoa pessoa;

    public ContaBancaria(int agencia, int numero, double saldo, Pessoa pessoa){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.pessoa = pessoa;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public exercicioaula5.Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(exercicioaula5.Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
