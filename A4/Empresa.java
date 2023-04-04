package A4;

import java.util.Date;

import A4.Funcionario.*;

public class Empresa {
    public static void main(String[] args) {
        Programador programador = new ProgramadorBuilder().setNome("Peter Huffman").setId(1).setSalario(2300).createFuncionario();
        Analista analista = new AnalistaBuilder().setNome("Amanda Liskov").setId(3).setSalario(20202.23).createFuncionario();
        Analista analista2 = new AnalistaBuilder().setNome("Bethany Holf").createFuncionario();
        Gerente gerente = new GerenteBuilder().setNome("Joana").setId(10).setId(2).setSalario(20200.23).createFuncionario();
        
        programador.entradaFuncionario(new Date(10-20-23));
        programador.getHoraEntrada().toString();

        Departamento.adicionaFuncionario(gerente);
        Departamento.adicionaFuncionario(programador);
        Departamento.adicionaFuncionario(analista);
        Departamento.adicionaFuncionario(analista2);


        Departamento.listarFuncionarios();
    
    }
}
