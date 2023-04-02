package A1.Builder;

import A1.Mamifero;

public class MamiferoBuilder implements AnimalBuilder{
    private String nome;
    private int idade;
    private String especie;
    private boolean alimentado;
    private int tempoGestao;
    

    public MamiferoBuilder() {
    }


    public MamiferoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    
    public MamiferoBuilder setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    
    public MamiferoBuilder setEspecie(String especie) {
        this.especie = especie;
        return this;
    }

    
    public MamiferoBuilder setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
        return this;
    }
    
    public MamiferoBuilder setTempoGestao(int tempoGestao){
        this.tempoGestao = tempoGestao;
        return this;
    }

    public Mamifero createAnimalMamifero(){
        return new Mamifero(this.nome, this.idade, this.especie, this.alimentado, this.tempoGestao);
    }
    
}
