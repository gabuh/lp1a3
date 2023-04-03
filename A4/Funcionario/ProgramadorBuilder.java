package A4.Funcionario;

import java.sql.Date;

import A4.Funcionario.Builder.FuncionarioBuilder;

public class ProgramadorBuilder implements FuncionarioBuilder{
    private String nome;
    private int id;
    private double salario;
    private Date horaEntrada;
    private Date horaSaida;

    
    public ProgramadorBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public ProgramadorBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public ProgramadorBuilder setSalario(double salario) {
        this.salario = salario;
        return this;
    }
    public ProgramadorBuilder setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
        return this;
    }
    public ProgramadorBuilder setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
        return this;
    }

    public Programador createFuncionario(){
        return new Programador(this.nome,this.id,this.salario,this.horaEntrada,this.horaSaida);
    }
    

}
