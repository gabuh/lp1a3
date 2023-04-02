package A1;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais = new ArrayList<Animal>(); 

    public void adicionarAnimal(Animal... animais){
        for (Animal animal : animais) {
            this.animais.add(animal);
        }
    }

    public void listarAnimais(){
        for (Animal animal : animais) {
            System.out.println(animal.toString());
        }
    }

    public void alimentarAnimais(){
        for (Animal animal : animais) {
            animal.alimentar();
        }
    }

}
