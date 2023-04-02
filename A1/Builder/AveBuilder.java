package A1.Builder;

import A1.Ave;

public class AveBuilder implements AnimalBuilder{
    public String nome;
    public int idade;
    public String especie;
    public boolean alimentado;
    public String tipoBico;
    
    public AveBuilder setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
        return this;
    }

    
    public AveBuilder setEspecie(String especie) {
        this.especie = especie;
        return this;
    }

    
    public AveBuilder setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    
    public AveBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public AveBuilder setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
        return this;
    }

    public Ave createAnimalAve(){
        return new Ave(this.nome, this.idade, this.especie, this.alimentado, this.tipoBico);
    }
    
}
