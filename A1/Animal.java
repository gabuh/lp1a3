package A1;


public abstract class Animal implements Alimentavel{
    private String nome;
    private int idade;
    private String especie;
    private boolean alimentado;
    
    
    public Animal(String nome, int idade, String especie, boolean alimentado) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.alimentado = alimentado;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getEspecie() {
        return especie;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public boolean isAlimentado() {
        return alimentado;
    }


    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }


    public abstract void emitirSom();



    public String toString(String args) {
        String result = args;
        result = result +  ", nome=" + nome + ", idade=" + idade + ", especie=" + especie + ", alimentado=" + alimentado;
        return result + "]";
    }

    
    
    
}
