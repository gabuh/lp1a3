package A4;

import java.util.Date;

public class Analista extends Funcionario implements Ponto{

    public Analista(String nome, int id, double salario, Date horaEntrada, Date horaSaida) {
        super(nome, id, salario, horaEntrada, horaSaida);
    }
    
    public void entradaFuncionario(Date date) {
        setHoraEntrada(date);
    }

    public void saidaFuncionario(Date date) {
        setHoraSaida(date);
    }   

}
