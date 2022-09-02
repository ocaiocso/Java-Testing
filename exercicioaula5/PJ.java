package exercicioaula5;

public class PJ extends Pessoa {
    private String cnpj;

    public PJ(String nome, String endereco, float rendimentos,String cnpj) {
        super(nome, endereco, rendimentos);
        this.cnpj = cnpj;
    }

    public void calcularImposto(){
        System.out.println("Cálculo imposto sobre rendimentos PJ: "+this.rendimentos * 0.18);
    }
}
