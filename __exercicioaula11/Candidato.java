package __exercicioaula11;

public class Candidato {

    private String nome;
    private int numero;
    private int TotalVotos = 0;
    //criar o atributo total votos;

    public Candidato() {

    }

    public int getTotalVotos() {
        return TotalVotos;
    }

    public void setTotalVotos(int totalVotos) {
        TotalVotos = totalVotos;
    }

    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}