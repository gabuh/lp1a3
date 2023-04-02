package A1.Builder;

import A1.Reptil;

public class ReptilBuilder implements AnimalBuilder{
    private String nome;
    private int idade;
    private String especie;
    private boolean alimentado;
    private double temperaturaCorporal;
    

    public ReptilBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    
    public ReptilBuilder setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    
    public ReptilBuilder setEspecie(String especie) {
        this.especie = especie;
        return this;
    }

    
    public ReptilBuilder setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
        return this;
    }
    
    public ReptilBuilder setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
        return this;
    }

    public Reptil createAnimalReptil(){
        return new Reptil(this.nome, this.idade, this.especie, this.alimentado, this.temperaturaCorporal);
    }
    
    
}
