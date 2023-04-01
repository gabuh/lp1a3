package A3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Lists list = new Lists();
    
        
        Scanner input = new Scanner(System.in);
    

        String option[] = {
            "Sair",
            "Add Elementos as listas, (quantidade minima de 2 elementos por lista)",
            "Todos na lista 1",
            "Verificar quais elementos da lista 2 que contem na lista 1",
            "Verifique se a lista 1 é igual a lista 2",
            "Mostre o elemento 2 de cada lista",
            "Remova um elemento da lista 3",
            "Remova os elementos da lista 3 da lista 1",
            "Verifique o tamanho da lista 1",
            "Limpe a lista 3",
            "Verifique se a lista 3 está vazia",
            "Mostre cada elemento da lista 1",
            "Listar todas as listas",
            "Verifique se todos os elementos da lista 3 estão na lista 1"
        };
    
        int intInput = 1;
        String strInput;
        while (intInput != 0){  
            for (int i = 0; i < option.length; i++) {
                System.out.println("> ["+ i +"] "+ option[i]);
            }
            try{
                strInput = input.nextLine();
                intInput = Integer.parseInt(strInput);
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("Digite um numero para ecolher a opcao");
                continue;
            }
        
            switch (strInput) {
                case "0":
                    System.out.println("Saindo");
                    break;
                case "1":
                    list.addElementosAsListas(input);
                    break;
                case "2":
                    list.todosNaLista1();
                    break;
                case "3":
                    list.verificarQuaisElementosTemNaLista1eLista2();
                    break;
                case "4":
                    list.verificarIgualdadeEntreLista1eLista2();
                    break;
                case "5":
                    list.verificarElemento2NasListas();
                    break;
                case "6":
                    list.removeUltimoElementoDaLista3();
                    break;
                case "7":
                    list.removeElementosLista3DaLista1();
                    break;
                case "8":
                    list.tamanhoDaLista1();
                    break;
                case "9":
                    list.limparLista3();
                    break;
                case "10":
                    list.verificarLista3isEmpty();
                    break;
                case "11":
                    list.mostrarElementosDaLista1();
                    break;
                case "12":
                    list.listarListas();
                    break;
                case "13":
                    list.verificarList3DentroDeList1();
                    break;
                default:
                    System.out.println("Trying");
                    break;
            }
            System.out.println("just hit an Enter");
            input.nextLine();  
        }
            input.close();
    }
}
