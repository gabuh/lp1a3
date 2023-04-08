package A4.Funcionario;

import java.time.LocalDateTime;

import A4.Ponto;

public class Programador extends Funcionario implements Ponto{

    protected Programador(String nome, int id, double salario, LocalDateTime horaEntrada, LocalDateTime horaSaida) {
        super(nome, id, salario, horaEntrada, horaSaida);
    }

    public void entradaFuncionario(LocalDateTime date) {
        setHoraEntrada(date);
    }

    public void saidaFuncionario(LocalDateTime date) {
        setHoraSaida(date);
    }
    
    @Override
    public String toString() {
        return super.toString().replaceAll("Funcionario","Programador");
    }
    
}
