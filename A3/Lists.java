package A3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lists{
    private ArrayList<String> list1;
    private ArrayList<String> list2;
    private LinkedList<String> list3;
    
    
    public Lists(){
        this.list1 = new ArrayList<String>();
        this.list2 = new ArrayList<String>();
        this.list3 = new LinkedList<String>();
        // this.list1.add("ELEMENTO NA LISTA UM TIPO UM");
        // this.list1.add("ELEMENTO NA LISTA UM TIPO DOIS");
        // this.list1.add("ELEMENTO NA LISTA UM TIPO TRES");
        // this.list1.add("ELEMENTO NA LISTA UM TIPO QUATRO");
        // this.list1.add("ELEMENTO NA LISTA UM TIPO CINCO");
        // this.list1.add("ELEMENTO NA LISTA UM TIPO SEIS");
        // this.list2.add("ELEMENTO NA LISTA DOIS TIPO UM");
        // this.list3.add("ELEMENTO NA LISTA TRES TIPO UM");
        // this.list3.add("ELEMENTO NA LISTA TRES TIPO DOIS");
        // this.list3.add("ELEMENTO NA LISTA TRES TIPO TRES");
        // this.list3.add("ELEMENTO NA LISTA TRES TIPO QUATRO");
        // this.list3.add("ELEMENTO NA LISTA TRES TIPO CINCO");
        // this.list3.add("ELEMENTO NA LISTA TRES TIPO SEIS");
        // this.list3.add("ELEMENTO NA LISTA TRES TIPO SETE");
        // this.list3.add("ELEMENTO NA LISTA TRES TIPO OITO");
        // this.list2.add("ELEMENTO NA LISTA DOIS TIPO DOIS");
        // this.list3.add("ELEMENTO NA LISTA TRES TIPO NOVE");
    }


    public void listarListas(){
        int count=0;
        System.out.println("LIST 1:");

        for (String string : list1) {
            System.out.println(count + " "+ string);
            count++;
        } 
        this.tamanhoDaLista1();   
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
    
    
    /*Faça três listas usando Collections (2 ArrayList e 1 LinkedList), faça uma função, que recebe a lista e uma String, que adiciona a String a lista. Faça o usuário adicionar 2 valores em cada lista (Valide se o texto digitado pelo usuário contém um número e crie uma exceção personalizada de Exception para tratar esse erro). 
    */

    List<String> getList(int numeroDaLista){
        if(numeroDaLista == 1){
            return this.list1;
        }else if(numeroDaLista == 2){
            return this.list2;
        }else if(numeroDaLista == 3){
            return this.list3;
        }
        return null;
    }

    void addElementosAsListas(Scanner input){
        char validador[];
        String strInput;
    
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 2; j++) {        
                System.out.println("Add Elemento na lista" + i + "  " + j + "/2");
                strInput = input.nextLine();
                try {
                    validador = strInput.toCharArray();
                    for (char c : validador) {
                        if(Character.isDigit(c)){
                            throw new Exception("TEM DIGITOOOOOO, COLOQUE APENAS LETRAS");
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                Utils.addItemArray(strInput, getList(i));
            } 
        }
    }


    /*
    Adicione todos os elementos da lista 2 e 3 para a lista 1
    */
          
        void todosNaLista1(){
            for (String string : list2) {
                list1.add(string);
            }
            for (String string : list3) {
                list1.add(string);
            }
        }  
    
    /*
    Verifique se um elemento da lista 2 contém na lista 1.
    */

        void verificarQuaisElementosTemNaLista1eLista2(){
            for (String string: list2) {
                list1.contains(string);
                System.out.println(string + " Tem na lista 2 e lista 1");
            }
        }
    
    /*
    Verifique se a lista 1 é igual a lista 2.
    */

        void verificarIgualdadeEntreLista1eLista2(){
            if(list1 == list2){
                System.out.println("Sao iguais");
            }else{
                System.out.println("Sao diferentes");
            }
        }

    /* 
    Mostre o elemento 2 de cada lista.
    */
        void verificarElemento2NasListas(){
            if(list1.size() > 2 && list2.size() > 2 && list3.size() > 2){
                System.out.println("List 1 Elemento 2"+list1.get(2));
                System.out.println("List 2 Elemento 2"+list2.get(2));
                System.out.println("List 3 Elemento 2"+list3.get(2));
            }else{
                System.out.println("Listas talvez nao tenham elemento 2");
            }
            
        }

    /*
    Remova um elemento da lista 3.
    */
        void removeUltimoElementoDaLista3(){
            System.out.println("Removed: "+list3.getLast());
            list3.removeLast();
        }
    /*
    Remova os elementos da lista 3 da lista 1.
    */
        void removeElementosLista3DaLista1(){
            for (String string : list3) {
                if(list1.contains(string)){
                    list1.remove(string);
                }
            }
        }
    /*
    Verifique o tamanho da lista 1.
    */
        void tamanhoDaLista1(){
            System.out.println("Tamanho da lista 1: "+ list1.size());
        }
    /*
    Limpe a lista 3.
    */
        void limparLista3(){
            if (!list3.isEmpty()) {
                list3.clear();
                System.out.println("Lista 3 LIMPA");
            }else{
                System.out.println("Lista3 esta vazia");
            }
            
        }
    /*
    Verifique se a lista 3 está vazia.
    */
        void verificarLista3isEmpty(){
            if(list3.isEmpty()){
                System.out.println("Esta vazia");
            }else{
                System.out.println("Nao esta vazia");
            }
        }
    /*
    Mostre cada elemento da lista 1.
    */  
        void mostrarElementosDaLista1(){
            System.out.println("Elementos da lista 1");
            for (String string : list1) {
                System.out.println(string);
            }
        }

}