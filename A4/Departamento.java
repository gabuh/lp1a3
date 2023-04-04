package A4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import A4.Funcionario.Funcionario;
import A4.Funcionario.Gerente;

public class Departamento{
    static List<Gerente> gerentes = new ArrayList<Gerente>();
    static List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public static <T extends Funcionario & Ponto> void adicionaFuncionario(T funcionario){
                funcionarios.add(funcionario);
    }
    public static < T extends Gerente> void adicionaFuncionario(T funcionario){
            gerentes.add(funcionario);
    }

    public static void listarFuncionarios(){
        System.out.println("------------\nFUNCIONARIOS \n -------");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
        System.out.println("------------\nGERENTES \n --------");
        for (Gerente gerente : gerentes) {
            System.out.println(gerente.toString());
        }
    }


    public static void listarAtrasados(Date date){
        System.out.println("------------\nFUNCIONARIOS ATRASADOS\n -------");
        for (Funcionario funcionario : funcionarios) {
            int comparacaoDeHoras = funcionario.getHoraEntrada().compareTo(date);
            if(comparacaoDeHoras > 0 ){
                System.out.println(funcionario.toString());
            }
        }
    }

}
