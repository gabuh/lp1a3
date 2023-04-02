package A1;

public class Mamifero extends Animal{

    private int tempoGestao;

    public Mamifero(String nome, int idade, String especie, boolean alimentado, int tempoGestao) {
        super(nome, idade, especie, alimentado);
        this.tempoGestao = tempoGestao; 
    }

    public void emitirSom() {
        System.out.println("uuuuuuuuuuuuuuuuuuuuuuh");     
    }

    public int getTempoGestao() {
        return tempoGestao;
    }

    public void setTempoGestao(int tempoGestao) {
        this.tempoGestao = tempoGestao;
    }

    public void alimentar(){
        this.setAlimentado(true);
    }

    public String toString() {
        return super.toString("Mamifero [tempoGestao=" + tempoGestao);
    }
    

}
