package exercicioaula5;

public class PF extends Pessoa {

    private String rg;

    public PF(String nome, String endereco, float rendimentos, String rg) {
        super(nome, endereco, rendimentos);
        this.rg = rg;
    }

    public void calcularImposto(){
        if(this.rendimentos<3000.00){
            System.out.println("Cálculo imposto sobre rendimentos PF: "+this.rendimentos * 0.11);
        }else
            System.out.println("Cálculo imposto sobre rendimentos PF: "+this.rendimentos * 0.275);
    }
}
