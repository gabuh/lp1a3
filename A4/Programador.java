package A4;

import java.util.Date;

public class Programador extends Funcionario implements Ponto{

    public Programador(String nome, int id, double salario, Date horaEntrada, Date horaSaida) {
        super(nome, id, salario, horaEntrada, horaSaida);
    }

    public void entradaFuncionario(Date date) {
        setHoraEntrada(date);
    }

    public void saidaFuncionario(Date date) {
        setHoraSaida(date);
    }   
    
}
