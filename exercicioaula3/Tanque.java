package exercicioaula3;


public class Tanque {

    private float volumeMax = 0;
    private float volumeAtual = 0;
    private float volumeMin = 0;
    private boolean bomba = true;

    public void encher(float litros){
        this.volumeAtual = getVolumeAtual() + litros;
        if(this.volumeAtual>=this.volumeMax){
            this.bomba = false;
            if(this.volumeAtual>this.volumeMax){
                this.volumeAtual = this.volumeMax;
                System.out.println();
                System.out.println("O valor selecionado para encher é maior do que a quantidade de litros no tanque");
                System.out.println("Você só encheu até "+this.volumeMax);
                System.out.println("Você não pode mais encher, selecione outra opção");
            }
        }
    }
    public void esvaziar(float litros){
        this.volumeAtual = getVolumeAtual() - litros;
        if(this.volumeAtual<=this.volumeMin){
            this.bomba = true;
            if(this.volumeAtual<this.volumeMin) {
                System.out.println();
                System.out.println("O valor selecionado para esvaziar é maior do que a quantidade de litros no tanque");
                System.out.println("Você só esvaziou até "+this.volumeMin);
                System.out.println("Você não pode mais esvaziar, selecione outra opção");
                this.volumeAtual = this.volumeMin;
            }
        }
    }

    public void exibirinfos(){
        String statusBomba = this.bomba ? "Ligada" : "Desligada";
        System.out.println("Tanque: "+this.volumeAtual);
        System.out.println("Status da Bomba:"+statusBomba);
    }

    public float getVolumeMax(){
        return this.volumeMax;
    }
    public void setVolumeMax(float capacidade) {
        this.volumeMax = capacidade;
    }

    public float getVolumeMin(){
        return this.volumeMin;
    }
    public void setVolumeMin(float min) {
        this.volumeMin = min;
    }

    public float getVolumeAtual(){
        return this.volumeAtual;
    }
    public void setVolumeAtual(float t){
        this.volumeAtual = t;
    }
}
