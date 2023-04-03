package A4.Funcionario;

import java.util.Date;

public class Gerente extends Funcionario{

    protected Gerente(String nome, int id, double salario, Date horaEntrada, Date horaSaida) {
        super(nome, id, salario, horaEntrada, horaSaida);
    }

    
    @Override
    public String toString() {
        return super.toString().replaceAll("Funcionario","Gerente");
    }

    
    
}
