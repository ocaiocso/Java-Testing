package exercicioaula5;

public abstract class Pessoa {

    protected String nome;
    protected String endereco;
    protected float rendimentos;

    public Pessoa(String nome, String endereco,float rendimentos){
        this.nome = nome;
        this.endereco = endereco;
        this.rendimentos = rendimentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(float rendimentos) {
        this.rendimentos = rendimentos;
    }

}
