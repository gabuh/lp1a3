package A4;

import java.util.Date;

import A4.Funcionario.*;

public class Empresa {
    public static void main(String[] args) {
        Programador programador = new ProgramadorBuilder().setNome("Pedro").setId(1).setSalario(2300).createFuncionario();

        Gerente gerente = new GerenteBuilder().setNome("Gabu").setId(10).setId(2).setSalario(20200.23).createFuncionario();


        System.out.println(gerente.toString());
        System.out.println(programador.toString());
    
    }
}
