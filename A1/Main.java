package A1;

import A1.Builder.AveBuilder;
import A1.Builder.MamiferoBuilder;
import A1.Builder.ReptilBuilder;

public class Main {
    public static void main(String[] args) {
       Zoologico zoo = new Zoologico();
        zoo.adicionarAnimal(
            new MamiferoBuilder().setTempoGestao(1).setIdade(23).setAlimentado(false).setEspecie("Gado-Bovino").createAnimalMamifero(),  
            new AveBuilder().setNome("Edwings").setEspecie("PomboCorreio").setIdade(0).createAnimalAve(),
            new ReptilBuilder().setNome("Tatug").setEspecie("Tartaruga de couro").createAnimalReptil()
        );
        
        zoo.listarAnimais();


        zoo.alimentarAnimais();


        zoo.listarAnimais();
        
        

    }
}
