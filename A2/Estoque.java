package A2;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<Produto>();

    public void addProduto(Produto produto){
        produtos.add(produto);
    }

    public void mostrarProdutos(){
        for (int i=0; i<produtos.size();i++) {
            System.out.println(i+"Produto"+ produtos.get(i).getNome() +" R$"+ produtos.get(i).getPreco());
        }
    }

    public void removeProduto(int index){
        produtos.remove(index);
    }


    public Produto getProduto(int index){
       return produtos.get(index);
    }

}
