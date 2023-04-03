package A4.Funcionario.Builder;

import java.sql.Date;

import A4.Funcionario.Funcionario;

public interface FuncionarioBuilder {    
    public FuncionarioBuilder setNome(String nome);
    public FuncionarioBuilder setId(int id);
    public FuncionarioBuilder setSalario(double salario);
    public FuncionarioBuilder setHoraEntrada(Date horaEntrada);
    public FuncionarioBuilder setHoraSaida(Date horaSaida);
    public Funcionario createFuncionario();
}
