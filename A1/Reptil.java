package A1;

public class Reptil extends Animal {
    
    private double temperaturaCorporal;
    
    public Reptil(String nome, int idade, String especie, boolean alimentado, double temperaturaCorporal) {
        super(nome, idade, especie, alimentado);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void emitirSom() {
        System.out.println("shhhhhhhhhhhhhhhh");
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    
    public void alimentar(){
        this.setAlimentado(true);
    }

    public String toString() {
       return super.toString("Reptil [temperaturaCorporal=" + temperaturaCorporal) ;
    }


    
    


}
