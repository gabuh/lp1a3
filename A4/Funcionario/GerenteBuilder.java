package A4.Funcionario;

import java.sql.Date;

import A4.Funcionario.Builder.FuncionarioBuilder;


public class GerenteBuilder implements FuncionarioBuilder{
    private String nome;
    private int id;
    private double salario;
    private Date horaEntrada;
    private Date horaSaida;

    
    public GerenteBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public GerenteBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public GerenteBuilder setSalario(double salario) {
        this.salario = salario;
        return this;
    }
    public GerenteBuilder setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
        return this;
    }
    public GerenteBuilder setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
        return this;
    }

    public Gerente createFuncionario(){
        return new Gerente(this.nome,this.id,this.salario,this.horaEntrada,this.horaSaida);
    }
    

}
