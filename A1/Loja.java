package A1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
 
    public static void main(String[] args){
        
        List<Double> arrPrecos = new ArrayList<Double>();
        ArrayList<String> arrNomes = new ArrayList<>();
        Estoque es = new Estoque();
        


        arrNomes.add("ARROZ");
        arrPrecos.add((double)3);
        arrNomes.add("FEIAJO");
        arrPrecos.add((double)6);
        arrNomes.add("MACARRAO");
        arrPrecos.add((double)3.2);
        arrNomes.add("CARNE");
        arrPrecos.add((double)12);




       for (int i = 0; i < arrNomes.size(); i++) {    
            es.addProduto(new Produto(arrNomes.get(i),arrPrecos.get(i)));
       }
        

    
    Scanner input = new Scanner(System.in);
    

    String option[] = {
        "Sair",
        "Comprar Produtos"
    };

    int intInput = 1;
    String strInput;
    while (intInput != 0){  
        for (int i = 0; i < option.length; i++) {
            System.out.println(">"+ i + option[i]);
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
                            break;
                        case "1":
                            venda(es,input);
                            break;
                        default:
                            System.out.println("Trying");
                            break;
                        }       //swi
                        
                    
                    }
                    input.close();
                    
    }
            
            public static void venda(Estoque es, Scanner input){
                String strInput;
                int intInput=1;
                double precoInput;
                double preco;
                while (intInput != 10){  
                        es.mostrarProdutos();
                        System.out.println("<<10 Cancelar>>");
                    try{
                        System.out.println("Escolha um produto digitando o numero: ");
                        strInput = input.nextLine();
                        intInput = Integer.parseInt(strInput);
                    }catch(Exception e){
                        System.out.println("Digite um numero para ecolher a opcao");
                        continue;
                    }
                    if(intInput != 10){
                        try{
                            System.out.println("Grana paga?: ");
                            strInput = input.nextLine();
                            precoInput = Double.parseDouble(strInput);
                        }catch(Exception e){
                            System.out.println("Digite um numero");
                            continue;
                        }
    
                        try{
                            preco= es.getProduto(intInput).getPreco();
                            if( preco < precoInput){
                                System.out.println("Troco: " + (precoInput - preco));
                                System.out.println("Vendido");
                                es.removeProduto(intInput);
                                break;
                                
                            }else if(preco == precoInput){
                                System.out.println("Vendido");
                                es.removeProduto(intInput);
                                break;
                            }
                        }catch(Exception e){
                            System.out.println("Produto ja vendido ou nao existe");
                        }    
                    }else{
                        System.out.println("Exiting");
                    }
                        

             }
        }
        
}




