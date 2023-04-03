package A4.Funcionario;

import java.util.Date;

import A4.Ponto;

public class Programador extends Funcionario implements Ponto{

    protected Programador(String nome, int id, double salario, Date horaEntrada, Date horaSaida) {
        super(nome, id, salario, horaEntrada, horaSaida);
    }

    public void entradaFuncionario(Date date) {
        setHoraEntrada(date);
    }

    public void saidaFuncionario(Date date) {
        setHoraSaida(date);
    }
    
    @Override
    public String toString() {
        return super.toString().replaceAll("Funcionario","Programador");
    }
    
}
