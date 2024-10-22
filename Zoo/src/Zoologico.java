import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    List<Animal> animais = new ArrayList<Animal>(); //cria lista de animais

    public void adicionaAnimais(Animal animal) {
        animais.add(animal);
        System.out.println(animal.especie + " foi adicionado a lista de animais!");
    }

    public void listaDeAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal.especie + " - tem " + animal.idade + " anos " + animal.peso + "KG e " + animal.tamanho + "cm");
        }
    }

}
