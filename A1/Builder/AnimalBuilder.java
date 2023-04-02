package A1.Builder;


public interface AnimalBuilder {
    public AnimalBuilder setNome(String nome);
    public AnimalBuilder setIdade(int idade);
    public AnimalBuilder setEspecie(String especie);
    public AnimalBuilder setAlimentado(boolean alimentado);
}
