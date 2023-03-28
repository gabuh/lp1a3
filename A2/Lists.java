package A2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Lists{
    public ArrayList<String> list1;
    public ArrayList<String> list2;
    public LinkedList<String> list3;
    
    
    public Lists(){
        this.list1 = new ArrayList<String>();
        this.list2 = new ArrayList<String>();
        this.list3 = new LinkedList<String>();
    }


    public void listarListas(){
        int count=0;
        System.out.println("LIST 1:");

        for (String string : list1) {
            System.out.println(count + " "+ string);
            count++;
        }    
        System.out.println("LIST 2:");

        for (String string : list2) {
            System.out.println(count + " "+ string);
            count++;
        }
        System.out.println("LIST 3:");

        for (String string : list3) {
            System.out.println(count + " "+ string);
            count++;
        }

    }



    

}


class Utils{

    public static void addItemArray(String str, List<String> l){
        l.add(str);
    }

  /*Faça três listas usando Collections (2 ArrayList e 1 LinkedList), faça uma função, que recebe a lista e uma String, que adiciona a String a lista. Faça o usuário adicionar 2 valores em cada lista (Valide se o texto digitado pelo usuário contém um número e crie uma exceção personalizada de Exception para tratar esse erro).

Adicione todos os elementos da lista 2 e 3 para a lista 1
*/
        


/*
Verifique se um elemento da lista 2 contém na lista 1.
Verifique se todos os elementos da lisconditional em linha cta 3 estão na lista 1.
Verifique se a lista 1 é igual a lista 2.
Mostre o elemento 2 de cada lista.
Remova um elemento da lista 3.
Remova os elementos da lista 3 da lista 1.
Verifique o tamanho da lista 1.
Limpe a lista 3.
Verifique se a lista 3 está vazia.
Mostre cada elemento da lista 1.
*/  




}



class Main{

    public static void main(String[] args){
        Lists list = new Lists();

        list.list1.add("EL1");
        list.list1.add("EL1");
        list.list1.add("EL1");
        list.list1.add("EL1");
        list.list1.add("EL1");
        list.list1.add("EL1");
        list.list2.add("EL2");
        list.list3.add("EL3");
        list.list3.add("EL3");
        list.list3.add("EL3");
        list.list3.add("EL3");
        list.list3.add("EL3");
        list.list3.add("EL3");
        list.list3.add("EL3");
        list.list3.add("EL3");
        list.list2.add("EL2");
        list.list3.add("EL3");


        list.list1 = Utils.todosEmUm(list.list1, list.list2);


        list.listarListas();
    
    
    }
}