package A1;

public class Ave extends Animal {

    private String tipobico;

    public Ave(String nome, int idade, String especie, boolean alimentado, String tipobico) {
        super(nome, idade, especie, alimentado);
        this.tipobico = tipobico;
    }

    public void emitirSom() {
        System.out.println("piiiiiiiiiiiiiiuuuuuuuuu");   
    }


    public String getTipobico() {
        return tipobico;
    }


    public void setTipobico(String tipobico) {
        this.tipobico = tipobico;
    }

    public void alimentar(){
        this.setAlimentado(true);
    }

    
    public String toString() {
        return super.toString("Ave [tipobico=" + tipobico);
    }
    


}
