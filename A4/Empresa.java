package A4;

import java.time.LocalDateTime;

import A4.Funcionario.*;

public class Empresa {
    public static void main(String[] args) {
        Programador programador = new ProgramadorBuilder().setNome("Peter Huffman").setId(1).setSalario(2300).createFuncionario();
        Analista analista = new AnalistaBuilder().setNome("Amanda Liskov").setId(3).setSalario(20202.23).createFuncionario();
        Analista analista2 = new AnalistaBuilder().setNome("Bethany Holf").setId(2).setSalario(2323).createFuncionario();
        Gerente gerente = new GerenteBuilder().setNome("Joana").setId(10).setId(5).setSalario(20200.23).createFuncionario();
        
       
        programador.entradaFuncionario(LocalDateTime.of(2023,4,7,9,30));
        analista.entradaFuncionario(LocalDateTime.of(2023,4,7,9,15));
        analista2.entradaFuncionario(LocalDateTime.of(2023,4,7,7,59));
        
        Departamento.adicionaFuncionario(gerente);
        Departamento.adicionaFuncionario(programador);
        Departamento.adicionaFuncionario(analista);
        Departamento.adicionaFuncionario(analista2);
        

        Departamento.listarFuncionarios();
        
        Departamento.listarAtrasados(LocalDateTime.of(2023,4,7,8,0));
    
    }
}
